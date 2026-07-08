package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.InputStream;
import java.security.MessageDigest;

/* JADX INFO: renamed from: X.08Rk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2117808Rk {
    public static String LIZ(byte[] bArr) {
        StringBuilder sb = new StringBuilder("");
        if (bArr != null && bArr.length > 0) {
            for (byte b : bArr) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() < 2) {
                    sb.append(0);
                }
                sb.append(hexString);
            }
            return sb.toString();
        }
        return null;
    }

    public static String LIZJ(String str) {
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.isFile()) {
            return null;
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            C0VSP c0vsp = new C0VSP(c0vsj);
            while (true) {
                int i = c0vsp.read(bArr, 0, 1024);
                if (i != -1) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    c0vsp.close();
                    return LIZ(messageDigest.digest());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static String LIZIZ(Context context, Uri uri) {
        if (uri == null) {
            return null;
        }
        try {
            InputStream inputStreamLJ = C09NT.LJ(context.getContentResolver(), uri);
            byte[] bArr = new byte[1024];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            while (true) {
                int i = inputStreamLJ.read(bArr, 0, 1024);
                if (i != -1) {
                    messageDigest.update(bArr, 0, i);
                } else {
                    inputStreamLJ.close();
                    return LIZ(messageDigest.digest());
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }
}
