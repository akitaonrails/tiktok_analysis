package X;

import android.security.keystore.KeyGenParameterSpec;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.ProviderException;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.CertificateException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.GCMParameterSpec;
import kotlin.Unit;
import kotlin.text.Charsets;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONException;

/* JADX INFO: renamed from: X.14BQ, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C14BQ implements C08VO {
    public static boolean LIZIZ;
    public final String LIZ;

    public C14BQ() {
        this(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Exception, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v2 */
    public final void LIZLLL() {
        long j = 100;
        int i = 0;
        while (i <= 2) {
            try {
                KeyGenerator keyGenerator = KeyGenerator.getInstance("AES", "AndroidKeyStore");
                keyGenerator.init(new KeyGenParameterSpec.Builder(this.LIZ, 3).setBlockModes("GCM").setEncryptionPaddings("NoPadding").setRandomizedEncryptionRequired(false).build());
                keyGenerator.generateKey();
                return;
            } catch (Exception e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                if (!(e instanceof ProviderException) && !(e instanceof NoSuchProviderException) && !(e instanceof InvalidAlgorithmParameterException)) {
                    throw e;
                }
                int i2 = i + 1;
                if (i >= 2) {
                    throw e;
                }
                try {
                    Thread.sleep(j);
                    j *= (long) 2;
                    e = 500;
                    if (j > 500) {
                        j = 500;
                    }
                    i = i2;
                } catch (InterruptedException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    C786410Ut5.u3().interrupt();
                    throw e;
                }
            }
        }
    }

    public final Key LJ() throws NoSuchAlgorithmException, UnrecoverableKeyException, IOException, KeyStoreException, CertificateException {
        KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
        keyStore.load(null);
        Key key = keyStore.getKey(this.LIZ, null);
        if (key != null) {
            return key;
        }
        LIZLLL();
        return keyStore.getKey(this.LIZ, null);
    }

    public C14BQ(int i) throws JSONException {
        Object c098200Yq;
        Object c098200Yq2;
        this.LIZ = "pns_sym_key";
        long jCurrentTimeMillis = System.currentTimeMillis();
        try {
            KeyStore keyStore = KeyStore.getInstance("AndroidKeyStore");
            keyStore.load(null);
            if (!keyStore.containsAlias("pns_sym_key")) {
                LIZLLL();
            } else {
                try {
                    c098200Yq2 = Boolean.valueOf(keyStore.getEntry("pns_sym_key", null) instanceof KeyStore.SecretKeyEntry);
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq2 = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (!((Boolean) (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null ? Boolean.FALSE : c098200Yq2)).booleanValue()) {
                    keyStore.deleteEntry(this.LIZ);
                    LIZLLL();
                }
            }
            C092I.LJ(0, System.currentTimeMillis() - jCurrentTimeMillis);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            c098200Yq = new C098200Yq(th2);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            LIZIZ = true;
            C092I.LJ(-1, System.currentTimeMillis() - jCurrentTimeMillis);
        }
    }

    public final String LIZ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (u.LJJIIJZLJL(str, "#FALLBACK#", false)) {
            return C839950WxF.LIZ.decrypt(a0.LJJJJZ("#FALLBACK#", str));
        }
        try {
            ByteBuffer byteBufferWrap = ByteBuffer.wrap(Base64.decode(str, 2));
            byte[] bArr = new byte[byteBufferWrap.getInt()];
            byteBufferWrap.get(bArr);
            byte[] bArr2 = new byte[byteBufferWrap.remaining()];
            byteBufferWrap.get(bArr2);
            Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
            cipher.init(2, LJ(), new GCMParameterSpec(128, bArr));
            byte[] bArrDoFinal = cipher.doFinal(bArr2);
            if (bArrDoFinal == null) {
                return null;
            }
            return new String(bArrDoFinal, Charsets.UTF_8);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final byte[] LIZIZ(byte[] bArr) throws BadPaddingException, NoSuchPaddingException, IllegalBlockSizeException, NoSuchAlgorithmException, InvalidKeyException, InvalidAlgorithmParameterException {
        Cipher cipher = Cipher.getInstance("AES/GCM/NoPadding");
        byte[] bArr2 = new byte[12];
        SecureRandom.getInstance("SHA1PRNG").nextBytes(bArr2);
        cipher.init(1, LJ(), new GCMParameterSpec(128, bArr2));
        byte[] bArrDoFinal = cipher.doFinal(bArr);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(16 + bArrDoFinal.length);
        byteBufferAllocate.putInt(12);
        byteBufferAllocate.put(bArr2);
        byteBufferAllocate.put(bArrDoFinal);
        return byteBufferAllocate.array();
    }

    public final String LIZJ(String str) {
        boolean z;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        if (!LIZIZ) {
            try {
                return Base64.encodeToString(LIZIZ(str.getBytes(Charsets.UTF_8)), 0);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return "#FALLBACK#" + C839950WxF.LIZ.LIZ(str, false);
            }
        }
        return "#FALLBACK#" + C839950WxF.LIZ.LIZ(str, false);
    }
}
