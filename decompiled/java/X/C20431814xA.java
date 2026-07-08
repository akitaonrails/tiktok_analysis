package X;

import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;

/* JADX INFO: renamed from: X.14xA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20431814xA {
    public static final C1238120iKA LIZ = new C1238120iKA();

    public static void LIZIZ(C20431714x9 c20431714x9, String str, int i, String str2) {
        LIZ(c20431714x9, EnumC20431914xB.FAILURE, str, i, str2);
    }

    public static void LIZ(C20431714x9 c20431714x9, EnumC20431914xB enumC20431914xB, String str, int i, String str2) {
        long jCurrentTimeMillis = System.currentTimeMillis() - LIZ.LIZ;
        C0XGR c0xgr = new C0XGR();
        c0xgr.LIZLLL("enter_method", c20431714x9.LIZIZ);
        c0xgr.LIZLLL("enter_from", c20431714x9.LIZ);
        c0xgr.LIZLLL("login_panel_type", c20431714x9.LJ);
        c0xgr.LIZLLL("source", c20431714x9.LIZJ);
        c0xgr.LIZLLL("platform", c20431714x9.LIZLLL);
        c0xgr.LIZ(enumC20431914xB.value, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c0xgr.LIZLLL("fail_info", str);
        c0xgr.LIZ(i, "error_code");
        c0xgr.LIZLLL("error_desc", str2);
        c0xgr.LIZ(1, "_perf_monitor");
        c0xgr.LIZIZ(jCurrentTimeMillis, "token_request_time");
        C20684815ws.LJIILLIIL("token_response", c0xgr.LIZ);
    }
}
