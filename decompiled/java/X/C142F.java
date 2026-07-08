package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;

/* JADX INFO: renamed from: X.142F, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C142F {
    public static String LIZ(Context context, String str) {
        String strLIZ = "";
        String strLIZ2 = C09N5.LIZ(context, UriProtector.parse(str));
        try {
            C2137908Zd c2137908Zd = C2137908Zd.LIZJ;
            if (strLIZ2 == null) {
                strLIZ2 = "";
            }
            c2137908Zd.getClass();
            strLIZ = C1796580wqu.LIZ(C2137908Zd.LJ(strLIZ2));
            return strLIZ;
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
            return strLIZ;
        }
    }
}
