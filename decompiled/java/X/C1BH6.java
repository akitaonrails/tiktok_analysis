package X;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.hybrid.spark.third.router.SparkThirdContext;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.search.thirdpartylandingpage.core.viewmodel.SearchLandingPageViewModel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1BH6, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BH6 {
    public static SparkContext LIZJ;
    public static SparkThirdContext LIZLLL;
    public static boolean LJFF;
    public static C19EG LJI;
    public static C2173521A4o LJII;
    public static SearchLandingPageViewModel LJIIIIZZ;
    public static final C1BH6 LIZ = new C1BH6();
    public static String LIZIZ = "safe";
    public static String LJ = "";

    public static boolean LIZIZ() {
        return Intrinsics.LJFF(LIZIZ, "not_secure") || Intrinsics.LJFF(LIZIZ, "protection");
    }

    public static void LIZ(C2173521A4o c2173521A4o, ViewGroup viewGroup) {
        ViewGroup viewGroup2;
        if (viewGroup != null && c2173521A4o != null) {
            try {
                ViewParent parent = c2173521A4o.getParent();
                if ((parent instanceof ViewGroup) && (viewGroup2 = (ViewGroup) parent) != null) {
                    C786410Ut5.LJJJLZIJ(c2173521A4o, viewGroup2);
                }
                viewGroup.addView(c2173521A4o);
            } catch (IllegalArgumentException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
