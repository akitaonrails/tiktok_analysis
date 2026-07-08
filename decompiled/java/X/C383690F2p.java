package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0F2p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C383690F2p {
    public static int LIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            C355090Dw3.LIZIZ("ExifUtils", "filepath is null or nil");
            return 0;
        }
        C2112908Pn c2112908Pn = C2112908Pn.LIZ;
        if (!C2112908Pn.LIZ(str)) {
            C355090Dw3.LIZIZ("ExifUtils", C786410Ut5.j4("file not exist:[%s]", Arrays.copyOf(new Object[]{str}, 1)));
            return 0;
        }
        try {
            C2259271Dbp c2259271Dbp = new C2259271Dbp(str);
            if (c2259271Dbp != null) {
                int iLJFF = c2259271Dbp.LJFF(-1);
                if (iLJFF != 3) {
                    if (iLJFF != 6) {
                        if (iLJFF == 8) {
                            return 270;
                        }
                    } else {
                        return 90;
                    }
                } else {
                    return 180;
                }
            }
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("cannot read exif ");
            sbLIZ.append(e);
            C355090Dw3.LIZLLL("ExifUtils", C2188811AlT.LIZIZ(sbLIZ));
        }
        return 0;
    }
}
