package X;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0jxe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1301040jxe {
    public static int LIZ;
    public static final List<InterfaceC1301020jxc> LIZIZ = new ArrayList();
    public static boolean LIZJ = true;

    public static void LIZ(Context context, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 31) {
            if (i > 0) {
                if (((Boolean) C264920AZu.LIZ.getValue()).booleanValue()) {
                    int i2 = 200;
                    if (i <= 200) {
                        i2 = i;
                    }
                    C1301050jxf.LIZ().LIZJ(i2);
                    context.getResources().getConfiguration().fontWeightAdjustment = 0;
                }
            } else {
                C1301050jxf.LIZ().LIZJ(0);
                context.getResources().getConfiguration().fontWeightAdjustment = i;
            }
            if (LIZ != C1301050jxf.LIZ().LJ() && z) {
                LIZ = C1301050jxf.LIZ().LJ();
                Iterator it2 = ((ArrayList) LIZIZ).iterator();
                while (it2.hasNext()) {
                    ((InterfaceC1301020jxc) it2.next()).LIZ();
                }
            }
        }
    }
}
