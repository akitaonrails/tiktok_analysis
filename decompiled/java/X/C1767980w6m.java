package X;

import com.bytedance.hox.Hox;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0w6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767980w6m {
    public static C1767790w6T LJII;
    public static boolean LJIIIIZZ;
    public static int LJIIIZ;
    public static int LJIIJ;
    public static WeakReference<InterfaceC599750Nfh> LJIIJJI;
    public final int LIZ;
    public Map<String, String> LIZIZ;
    public ReachCfgData LIZJ;
    public C1741080vPO LIZLLL;
    public boolean LJ;
    public boolean LJFF;
    public boolean LJI;

    public C1767980w6m() {
        int i = LJIIIZ + 1;
        LJIIIZ = i;
        this.LIZ = i;
        this.LIZIZ = C2097608Jq.LJ();
        this.LJ = true;
        this.LJFF = true;
    }

    public static boolean LIZ(C19EG c19eg) {
        C1767790w6T c1767790w6T;
        String strCQ2 = C343710Ddh.LIZ(c19eg).CQ2();
        if (Intrinsics.LJFF(strCQ2, "SHOP_MALL") || (((c1767790w6T = LJII) != null && !c1767790w6T.LJIILL) || C1767800w6U.LIZLLL())) {
            return true;
        }
        if (Intrinsics.LJFF(strCQ2, "HOME") && Hox.LLJILJIL.LIZ(c19eg).KQ2("Shop")) {
            return true;
        }
        return false;
    }
}
