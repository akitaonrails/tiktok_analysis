package X;

import android.text.TextUtils;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.List;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* JADX INFO: renamed from: X.14Bg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20223814Bg {
    public static final List<String> LIZIZ = Collections.singletonList("EncryptUtils");
    public static final String[] LIZJ = {"aid", "version_code", "ab_version", "iid", "device_platform", "device_id", "app_log_priority"};
    public static final String[] LIZLLL = {"tt_data", "device_platform"};
    public final C2209901BeO LIZ;

    public static String[] LIZLLL() {
        try {
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            SecureRandom secureRandom = new SecureRandom();
            keyGenerator.init(128, secureRandom);
            byte[] bArr = new byte[8];
            secureRandom.nextBytes(bArr);
            String[] strArr = {LIZ(keyGenerator.generateKey().getEncoded()), LIZ(bArr)};
            if (LJFF(strArr)) {
                return strArr;
            }
            return null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return null;
        }
    }

    public C20223814Bg(C2209901BeO c2209901BeO) {
        this.LIZ = c2209901BeO;
    }

    public static String LIZ(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr != null) {
            for (byte b : bArr) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
        }
        return sb.toString();
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0056: MOVE (r2 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777302), block:B:37:0x0056 */
    public static byte[] LJ(byte[] bArr) throws Throwable {
        ByteArrayInputStream byteArrayInputStream;
        GZIPInputStream gZIPInputStream;
        GZIPInputStream gZIPInputStream2;
        GZIPInputStream gZIPInputStream3 = null;
        if (bArr.length <= 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                byteArrayInputStream = new ByteArrayInputStream(bArr);
            } catch (Throwable th) {
                th = th;
                gZIPInputStream3 = gZIPInputStream2;
            }
        } catch (IOException e) {
            e = e;
            byteArrayInputStream = null;
            gZIPInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            byteArrayInputStream = null;
        }
        try {
            gZIPInputStream = new GZIPInputStream(byteArrayInputStream);
            try {
                byte[] bArr2 = new byte[1024];
                while (true) {
                    int i = gZIPInputStream.read(bArr2);
                    if (i >= 0) {
                        byteArrayOutputStream.write(bArr2, 0, i);
                    } else {
                        try {
                            break;
                        } catch (IOException e2) {
                            TryCatchGuardChecker.doCheck(e2);
                        }
                    }
                }
                gZIPInputStream.close();
            } catch (IOException e3) {
                e = e3;
                TryCatchGuardChecker.doCheck(e);
                if (gZIPInputStream != null) {
                    try {
                        gZIPInputStream.close();
                    } catch (IOException e4) {
                        TryCatchGuardChecker.doCheck(e4);
                    }
                }
                if (byteArrayInputStream != null) {
                }
                return byteArrayOutputStream.toByteArray();
            }
        } catch (IOException e5) {
            e = e5;
            gZIPInputStream = null;
        } catch (Throwable th3) {
            th = th3;
            while (true) {
                try {
                    TryCatchGuardChecker.doCheck(th);
                    break;
                } catch (Throwable th4) {
                    th = th4;
                }
            }
            if (gZIPInputStream3 != null) {
                try {
                    gZIPInputStream3.close();
                } catch (IOException e6) {
                    TryCatchGuardChecker.doCheck(e6);
                }
            }
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                    throw th;
                } catch (IOException e7) {
                    TryCatchGuardChecker.doCheck(e7);
                    throw th;
                }
            }
            throw th;
        }
        try {
            byteArrayInputStream.close();
        } catch (IOException e8) {
            TryCatchGuardChecker.doCheck(e8);
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static boolean LJFF(String[] strArr) {
        if (strArr == null || strArr.length != 2 || TextUtils.isEmpty(strArr[0]) || strArr[0].length() != 32 || TextUtils.isEmpty(strArr[1]) || strArr[1].length() != 16) {
            return false;
        }
        return true;
    }

    public final byte[] LIZJ(byte[] bArr) {
        if (bArr == null) {
            return new byte[0];
        }
        if (this.LIZ.LJIL) {
            if (this.LIZ.LJ() != null) {
                this.LIZ.LJ().getClass();
            }
            bArr = EncryptorUtil.LIZ(bArr.length, bArr);
            if (bArr == null) {
                this.LIZ.LJJJJLI.LIZIZ(EnumC2210021Bea.ENCRYPT_ERROR_COUNT, 1);
            }
        }
        return bArr;
    }

    public final byte[] LJI(String str) {
        byte[] byteArray;
        GZIPOutputStream gZIPOutputStream;
        GZIPOutputStream gZIPOutputStream2 = null;
        try {
            byteArray = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            this.LIZ.LJJZZI.LJIIZILJ(LIZIZ, "get bytes failed", e, new Object[0]);
            byteArray = null;
        }
        if (this.LIZ.LJIL) {
            if (byteArray == null) {
                byteArray = new byte[0];
            } else {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(8192);
                try {
                    try {
                        gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
                    } catch (Throwable th) {
                        th = th;
                    }
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                try {
                    gZIPOutputStream.write(byteArray);
                    gZIPOutputStream.close();
                } catch (Throwable th2) {
                    th = th2;
                    gZIPOutputStream2 = gZIPOutputStream;
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        C2209791BeD.LJIJJ().LJIIZILJ(LIZIZ, "gzip write failed", th, new Object[0]);
                        if (gZIPOutputStream2 != null) {
                            gZIPOutputStream2.close();
                        }
                        byteArray = byteArrayOutputStream.toByteArray();
                        return LIZJ(byteArray);
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                        if (gZIPOutputStream2 != null) {
                            try {
                                gZIPOutputStream2.close();
                                throw th3;
                            } catch (IOException e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                throw th3;
                            }
                        }
                        throw th3;
                    }
                }
                byteArray = byteArrayOutputStream.toByteArray();
            }
        }
        return LIZJ(byteArray);
    }

    public static byte[] LIZIZ(String str, String str2, byte[] bArr) {
        try {
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS7PADDING");
            int length = str.length();
            byte[] bArr2 = new byte[length];
            for (int i = 0; i < length; i++) {
                bArr2[i] = (byte) str.charAt(i);
            }
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, "AES");
            int length2 = str2.length();
            byte[] bArr3 = new byte[length2];
            for (int i2 = 0; i2 < length2; i2++) {
                bArr3[i2] = (byte) str2.charAt(i2);
            }
            cipher.init(2, secretKeySpec, new IvParameterSpec(bArr3));
            return cipher.doFinal(bArr);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2209791BeD.LJIJJ().LJIIZILJ(LIZIZ, "Cannot decrypt aes cbc", th, new Object[0]);
            return null;
        }
    }
}
