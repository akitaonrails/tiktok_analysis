package X;

import android.os.SystemClock;
import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.cert.CertificateException;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.ranges.IntRange;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0YPt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C873830YPt implements C0YC1 {
    public static final ConcurrentHashMap<String, Object> LJFF = new ConcurrentHashMap<>();
    public final C0YC1 LIZ;
    public final InterfaceC873840YPu LIZIZ;
    public final C0YEM LIZJ;
    public final InterfaceC873860YPw LIZLLL;
    public final InterfaceC873850YPv LJ;

    public static String LIZIZ() {
        SecureRandom secureRandom = new SecureRandom();
        IntRange intRange = new IntRange(1, 16);
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(intRange, 10));
        C531650Kt9 it2 = intRange.iterator();
        while (it2.LLILLL) {
            it2.nextInt();
            arrayList.add(Character.valueOf("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789".charAt(secureRandom.nextInt(62))));
        }
        return C13LP.LJJLIIIJ(arrayList, "", null, null, 0, null, null, 62);
    }

    @Override // X.C0YC1
    public final C07WR LIZ(String str) {
        return LIZLLL(str, false);
    }

    public final void LJ(String str) {
        this.LIZIZ.LIZLLL(str, "");
    }

    public final C07WR LJFF(String str) {
        C07WR c07wrLIZLLL = LIZLLL(str, true);
        if (!(c07wrLIZLLL instanceof C07WP) && !(c07wrLIZLLL instanceof C07WQ)) {
            if (c07wrLIZLLL instanceof C0YBY) {
                if (((C0YBY) c07wrLIZLLL).LIZIZ) {
                    return new C07WQ(null);
                }
                return c07wrLIZLLL;
            }
            throw new C1954807lC();
        }
        return c07wrLIZLLL;
    }

    public final C07WR LIZLLL(String str, boolean z) {
        String message;
        long jUptimeMillis = SystemClock.uptimeMillis();
        C07WR c07wrLIZJ = LIZJ(0, str, z);
        if (!(c07wrLIZJ instanceof C07WP) && !(c07wrLIZJ instanceof C07WQ)) {
            if (c07wrLIZJ instanceof C0YBY) {
                this.LIZIZ.LIZJ(0, str);
            } else {
                throw new C1954807lC();
            }
        } else {
            int iLIZIZ = this.LIZIZ.LIZIZ(str);
            if (iLIZIZ > this.LIZJ.LJIIIZ().LJJLIIIIJ.LJIILJJIL.maxKeystoreFailureCount) {
                this.LIZIZ.LJ(str);
            }
            this.LIZIZ.LIZJ(iLIZIZ + 1, str);
        }
        C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
        c0yj9.LIZJ("imsdk_encryption_key_provider_result");
        c0yj9.LIZ(Long.valueOf(SystemClock.uptimeMillis() - jUptimeMillis), "duration");
        c0yj9.LIZ(c07wrLIZJ.getName(), "result");
        if (c07wrLIZJ instanceof C0YBY) {
            c0yj9.LIZ(Boolean.valueOf(((C0YBY) c07wrLIZJ).LIZIZ), "is_new");
        }
        String message2 = null;
        if (c07wrLIZJ instanceof C07WP) {
            C07WP c07wp = (C07WP) c07wrLIZJ;
            Exception exc = c07wp.LIZ;
            if (exc != null) {
                message = exc.getMessage();
            } else {
                message = null;
            }
            c0yj9.LIZ(message, "error_msg");
            C0YLL eventTracker = this.LIZJ.LJIIZILJ().LJFF().getEventTracker();
            Exception exc2 = c07wp.LIZ;
            eventTracker.getClass();
            c0yj9.LIZ(C0YLL.LIZIZ(exc2), "error_stack");
        }
        if (c07wrLIZJ instanceof C07WQ) {
            C07WQ c07wq = (C07WQ) c07wrLIZJ;
            Exception exc3 = c07wq.LIZ;
            if (exc3 != null) {
                message2 = exc3.getMessage();
            }
            c0yj9.LIZ(message2, "error_msg");
            C0YLL eventTracker2 = this.LIZJ.LJIIZILJ().LJFF().getEventTracker();
            Exception exc4 = c07wq.LIZ;
            eventTracker2.getClass();
            c0yj9.LIZ(C0YLL.LIZIZ(exc4), "error_stack");
        }
        c0yj9.LIZLLL();
        return c07wrLIZJ;
    }

    public C873830YPt(C0YC0 c0yc0, C0YEL c0yel, C0YEM c0yem) {
        InterfaceC873860YPw interfaceC873860YPw = new InterfaceC873860YPw() { // from class: X.14BU
            @Override // X.InterfaceC873860YPw
            public final SecretKey LIZ(String str) throws NoSuchAlgorithmException, IOException, KeyStoreException, CertificateException, NoSuchProviderException, InvalidAlgorithmParameterException {
                KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
                keyStore.load(null);
                if (keyStore.containsAlias(str)) {
                    return (SecretKey) keyStore.getKey(str, null);
                }
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder(str, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(true).build());
                return keyGenerator.generateKey();
            }
        };
        C873890YPz c873890YPz = new InterfaceC873850YPv() { // from class: X.0YPz
            @Override // X.InterfaceC873850YPv
            public final void LIZJ() {
            }

            @Override // X.InterfaceC873850YPv
            public final byte[] LIZ(String str) {
                return Base64.decode(str, 0);
            }

            @Override // X.InterfaceC873850YPv
            public final String LIZIZ(byte[] bArr) {
                return Base64.encodeToString(bArr, 0);
            }
        };
        this.LIZ = c0yc0;
        this.LIZIZ = c0yel;
        this.LIZJ = c0yem;
        this.LIZLLL = interfaceC873860YPw;
        this.LJ = c873890YPz;
    }

    public final C07WR LIZJ(int i, String str, boolean z) {
        Object obj;
        C07WR c07wp;
        boolean z2;
        Object objPutIfAbsent;
        if (this.LIZJ.LJIILL().LIZ.LJ) {
            ConcurrentHashMap<String, Object> concurrentHashMap = LJFF;
            obj = concurrentHashMap.get(str);
            if (obj == null && (objPutIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new Object()))) != null) {
                obj = objPutIfAbsent;
            }
        } else {
            obj = this;
        }
        synchronized (obj) {
            try {
                this.LJ.LIZJ();
                if (this.LIZIZ.LIZ(str)) {
                    C0YJ9 c0yj9 = new C0YJ9(this.LIZJ);
                    c0yj9.LIZJ("imsdk_encryption_key_provider_result");
                    c0yj9.LIZ(-1, "duration");
                    c0yj9.LIZ("force_default_provider", "result");
                    c0yj9.LIZLLL();
                    return this.LIZ.LIZ(str);
                }
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("im_sdk_tiktok_");
                    sbLIZ.append(str);
                    sbLIZ.append("_messaging");
                    SecretKey secretKeyLIZ = this.LIZLLL.LIZ(C2188811AlT.LIZIZ(sbLIZ));
                    if (secretKeyLIZ != null) {
                        if (this.LIZIZ.LJFF(str).length() == 0) {
                            if (z) {
                                return new C07WQ(new IllegalStateException("No key found for key retrieval"));
                            }
                            String strLIZIZ = LIZIZ();
                            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
                            cipher.init(1, secretKeyLIZ);
                            byte[] bArrDoFinal = cipher.doFinal(u.LJIILLIIL(strLIZIZ));
                            byte[] iv = cipher.getIV();
                            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(iv.length + 4 + bArrDoFinal.length);
                            byteBufferAllocate.putInt(iv.length);
                            byteBufferAllocate.put(iv);
                            byteBufferAllocate.put(bArrDoFinal);
                            this.LIZIZ.LIZLLL(str, this.LJ.LIZIZ(byteBufferAllocate.array()));
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String strLJFF = this.LIZIZ.LJFF(str);
                        if (strLJFF.length() == 0) {
                            return new C07WP(null);
                        }
                        ByteBuffer byteBufferWrap = ByteBuffer.wrap(this.LJ.LIZ(strLJFF));
                        byte[] bArr = new byte[byteBufferWrap.getInt()];
                        byteBufferWrap.get(bArr);
                        byte[] bArr2 = new byte[byteBufferWrap.remaining()];
                        byteBufferWrap.get(bArr2);
                        Cipher cipher2 = Cipher.getInstance("AES/GCM/NoPadding");
                        cipher2.init(2, secretKeyLIZ, new GCMParameterSpec(128, bArr));
                        return new C0YBY(z2, cipher2.doFinal(bArr2));
                    }
                    if (this.LIZIZ.LJFF(str).length() > 0) {
                        c07wp = new C07WQ(new Exception("Secret key is null"));
                    } else {
                        c07wp = new C07WP(new Exception("Secret key is null"));
                    }
                    return c07wp;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    if (i > 1) {
                        if (this.LIZIZ.LJFF(str).length() > 0) {
                            return new C07WQ(e);
                        }
                        return new C07WP(e);
                    }
                    return LIZJ(i + 1, str, z);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
