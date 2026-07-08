package X;

import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.common.util.NetworkUtils;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0X1Z, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X1Z {
    public static String LIZ(C2175508fh c2175508fh) throws IOException {
        String str;
        String strResponse2String;
        TypedInput typedInput = c2175508fh.LJ;
        if (typedInput != null) {
            InputStream inputStreamIn = typedInput.in();
            C080U c080uLIZ = c2175508fh.LIZ("Content-Type");
            try {
                C0X0P c0x0pLIZJ = C0X0P.LIZJ(typedInput.mimeType());
                String strName = null;
                if (c0x0pLIZJ != null) {
                    str = c0x0pLIZJ.LIZ;
                } else if (c080uLIZ == null) {
                    str = null;
                } else {
                    str = c080uLIZ.LIZIZ;
                }
                if (str == null) {
                    str = "";
                }
                boolean zTestIsSSBinary = NetworkUtils.testIsSSBinary(str);
                if (typedInput.length() > 2147483647L) {
                    inputStreamIn.reset();
                    return null;
                }
                if (c0x0pLIZJ != null && c0x0pLIZJ.LIZ(null) != null) {
                    strName = c0x0pLIZJ.LIZ(null).name();
                }
                if (strName == null) {
                    strName = "UTF-8";
                }
                System.currentTimeMillis();
                if (((Boolean) C07FG.LIZLLL.getValue()).booleanValue()) {
                    strResponse2String = NetworkUtils.response2StringOpt(false, zTestIsSSBinary, 0, inputStreamIn, strName);
                } else {
                    strResponse2String = NetworkUtils.response2String(false, zTestIsSSBinary, 0, inputStreamIn, strName);
                }
                inputStreamIn.reset();
                return strResponse2String;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                inputStreamIn.reset();
                throw th;
            }
        }
        throw new IllegalArgumentException("HTTP body may not be null");
    }
}
