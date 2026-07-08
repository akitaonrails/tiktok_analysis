package X;

import com.ss.android.ugc.aweme.search.lynx.core.config.PreLayoutSchemaConfig;
import com.ss.android.ugc.aweme.search.lynx.core.config.SparkLitePreLoadConfig;
import java.util.List;
import kotlin.jvm.internal.AFwS196S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PAT, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PAT {
    public static final C0PAT LIZ = new C0PAT();
    public static final SparkLitePreLoadConfig LIZIZ = new SparkLitePreLoadConfig();
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(215));

    public static SparkLitePreLoadConfig LJFF() {
        return (SparkLitePreLoadConfig) LIZJ.getValue();
    }

    public static boolean LIZIZ() {
        return LJFF().continuePreloadAndDecode;
    }

    public static List LIZJ() {
        List<String> list = LJFF().preLayoutDuringRequestSchemaList;
        C0CQQ.LIZ.getClass();
        List listLJJJJI = C13LP.LJJJJI(C13LP.LJLIL(C0CQQ.LIZ(((PreLayoutSchemaConfig) C0CQQ.LIZJ.getValue()).staticPreLayoutMap), list));
        LIZ.getClass();
        return (!LJI() || listLJJJJI == null) ? C13BV.INSTANCE : listLJJJJI;
    }

    public static List LIZLLL() {
        List<String> list = LJFF().preLayoutOnceBundleList;
        LIZ.getClass();
        return (!LJI() || list == null) ? C13BV.INSTANCE : list;
    }

    public static List LJ() {
        List<String> list = LJFF().preLayoutPredictDuringRequestSchemaList;
        C0CQQ.LIZ.getClass();
        List listLJJJJI = C13LP.LJJJJI(C13LP.LJLIL(C0CQQ.LIZ(((PreLayoutSchemaConfig) C0CQQ.LIZJ.getValue()).clientPredictPreLayoutMap), list));
        LIZ.getClass();
        return (!LJI() || listLJJJJI == null) ? C13BV.INSTANCE : listLJJJJI;
    }

    public static boolean LJI() {
        return LJFF().enablePreLayout == 1;
    }

    public static boolean LIZ(String str) {
        if (str.length() == 0) {
            return false;
        }
        String strLJ = C649470Pdh.LJ(str);
        if (Intrinsics.LJFF(C649470Pdh.LJIIIZ(str, "async_search_card"), "1") || (LJFF().createLiteViewAsync && LJFF().createLiteViewAsyncList.contains(strLJ))) {
            return true;
        }
        return false;
    }
}
