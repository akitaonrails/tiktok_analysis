package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* JADX INFO: renamed from: X.0jiw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1291920jiw {
    public final InterfaceC1291960jj0 LIZ;

    public final C0VSJ LIZIZ() {
        C0VSJ c0vsj = new C0VSJ(C786410Ut5.w2(((C1291940jiy) this.LIZ).LIZ), "lottie_network_cache");
        if (c0vsj.isFile()) {
            c0vsj.delete();
        }
        if (!c0vsj.exists()) {
            c0vsj.mkdirs();
        }
        return c0vsj;
    }

    public C1291920jiw(C1291940jiy c1291940jiy) {
        this.LIZ = c1291940jiy;
    }

    public static String LIZ(String str, EnumC1291930jix enumC1291930jix, boolean z) {
        String strTempExtension;
        if (z) {
            strTempExtension = enumC1291930jix.tempExtension();
        } else {
            strTempExtension = enumC1291930jix.extension;
        }
        String strReplaceAll = str.replaceAll("\\W+", "");
        int length = 242 - strTempExtension.length();
        if (strReplaceAll.length() > length) {
            try {
                byte[] bArrDigest = MessageDigest.getInstance("MD5").digest(strReplaceAll.getBytes());
                StringBuilder sb = new StringBuilder();
                for (byte b : bArrDigest) {
                    sb.append(C786410Ut5.j4("%02x", new Object[]{Byte.valueOf(b)}));
                }
                strReplaceAll = sb.toString();
            } catch (NoSuchAlgorithmException e) {
                TryCatchGuardChecker.doCheck(e);
                strReplaceAll = strReplaceAll.substring(0, length);
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("lottie_cache_");
        sbLIZ.append(strReplaceAll);
        sbLIZ.append(strTempExtension);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C0VSJ LIZJ(String str, InputStream inputStream, EnumC1291930jix enumC1291930jix) throws IOException {
        C0VSJ c0vsj = new C0VSJ(LIZIZ(), LIZ(str, enumC1291930jix, true));
        try {
            C0VSV c0vsv = new C0VSV(c0vsj);
            try {
                byte[] bArr = new byte[1024];
                while (true) {
                    int i = inputStream.read(bArr);
                    if (i != -1) {
                        c0vsv.write(bArr, 0, i);
                    } else {
                        c0vsv.flush();
                        c0vsv.close();
                        inputStream.close();
                        return c0vsj;
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c0vsv.close();
                throw th;
            }
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            inputStream.close();
            throw th2;
        }
    }
}
