package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS43S0010000_31;

/* JADX INFO: renamed from: X.15kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20610815kw {
    public static final C20610815kw LIZ = new C20610815kw();
    public static Long LIZIZ;
    public static int LIZJ;
    public static boolean LIZLLL;

    public static void LIZIZ(String str, boolean z) {
        LIZ(str, "vertical_mention", new AwS43S0010000_31(z, 14));
    }

    public static void LIZ(String str, String str2, Function1 function1) {
        Long l = LIZIZ;
        if (l != null) {
            long jLongValue = l.longValue();
            C0LAB c0lab = new C0LAB();
            if (function1 != null) {
                function1.invoke(c0lab);
            }
            c0lab.LJ(Scene.SCENE_SERVICE, str2);
            c0lab.LIZIZ(System.currentTimeMillis() - jLongValue, "duration");
            c0lab.LIZ(LIZLLL ? 1 : 0, "selection_count");
            c0lab.LIZ(LIZJ, "query_count");
            c0lab.LJ("search_keyword", str);
            C20684815ws.LJIILLIIL("social_search_session_summary", c0lab.LIZ);
            LIZIZ = null;
        }
    }

    public static void LIZJ(C20611915l7 c20611915l7, String str, String str2, String str3, String str4, String str5) {
        Object c098200Yq;
        try {
            C737520SwQ.LIZ("add_video_at", new C20610915kx(c20611915l7, str, str2, str3, str4, str5));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static void LIZLLL(String str, String str2, String str3, String str4, int i, boolean z, float f, float f2) {
        Object c098200Yq;
        try {
            C737520SwQ.LIZ("social_search_client_performance", new C317280CcA(str, str2, str3, str4, i, z, f, f2));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static void LJI(C20611915l7 c20611915l7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8) {
        Object c098200Yq;
        try {
            C737520SwQ.LIZ("tag_mention_head_show", new C20611115kz(c20611915l7, str, str2, str3, str4, str8, str5, str6, str7));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static void LJ(C20611915l7 c20611915l7, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        Object c098200Yq;
        try {
            C737520SwQ.LIZ("tag_mention_head_click", new C20611015ky(c20611915l7, str, str2, str3, str4, str8, str5, str6, str7, z));
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }
}
