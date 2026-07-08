package X;

import android.content.Context;
import android.util.Base64;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.GZIPOutputStream;

/* JADX INFO: renamed from: X.090L, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C090L {
    public static String LIZ(Context context, String str, StringBuilder sb) {
        C0VSP c0vsp;
        C0VSJ c0vsj = new C0VSJ(str);
        if (!c0vsj.exists()) {
            sb.append("file not exist.path:");
            sb.append(str);
            sb.append("\r\n");
            return null;
        }
        if (c0vsj.length() == 0) {
            sb.append("file size is zore.");
            sb.append("\r\n");
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            c0vsp = new C0VSP(c0vsj);
        } catch (Exception e) {
            e = e;
            c0vsp = null;
        }
        try {
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            byte[] bArr = new byte[10240];
            while (true) {
                int i = c0vsp.read(bArr, 0, 10240);
                if (i != -1) {
                    gZIPOutputStream.write(bArr, 0, i);
                } else {
                    gZIPOutputStream.flush();
                    gZIPOutputStream.finish();
                    gZIPOutputStream.close();
                    c0vsp.close();
                    String strEncodeToString = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 0);
                    byteArrayOutputStream.close();
                    return strEncodeToString;
                }
            }
        } catch (Exception e2) {
            e = e2;
            TryCatchGuardChecker.doCheck(e);
            if (c0vsp != null) {
                try {
                    c0vsp.close();
                } catch (IOException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                }
            }
            try {
                byteArrayOutputStream.close();
            } catch (IOException e4) {
                TryCatchGuardChecker.doCheck(e4);
            }
            sb.append("gzip file is error.error:");
            sb.append(e.getMessage());
            return null;
        }
    }
}
