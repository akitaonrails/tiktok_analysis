package X;

import ayh.i5;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import com.ss.android.ugc.aweme.utils.oh;
import dtj.u7;

/* JADX INFO: renamed from: X.0Xpa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C860680Xpa implements InterfaceC2281261EQy {
    public static final C860680Xpa LIZ = new C860680Xpa();

    @Override // X.InterfaceC2281261EQy
    public final void LIZIZ(String str) {
        oh.LJ(str);
    }

    @Override // X.InterfaceC2281261EQy
    public final void LIZJ(boolean z) {
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("resource_type", "beauty_effect");
        c0lab.LIZ(z ? 1 : 0, "hit_cache");
        C20684815ws.LJIILLIIL("tool_performance_resource_download_user_view", c0lab.LIZ);
    }

    @Override // X.InterfaceC2281261EQy
    public final void LIZLLL(String str) {
        oh.LIZJ(str, i5.LIZIZ(), -1L, null, EnumC860460XpE.ANIM);
    }

    @Override // X.InterfaceC2281261EQy
    public final void LIZ(long j, String str) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("tool_performance_sort_");
        sbLIZ.append(str);
        c2344009Gk.LJIIIIZZ("type", C2188811AlT.LIZIZ(sbLIZ));
        c2344009Gk.LIZLLL(j, "totaltime");
        C20684815ws.LJIILLIIL("tool_performance_operation_cost_time", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC2281261EQy
    public final void LJ(String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        c2344009Gk.LIZJ(z ? 1 : 0, "isUiNull");
        C20684815ws.LJIILLIIL("filter_panel_ui_blank", c2344009Gk.LIZ);
    }

    @Override // X.InterfaceC2281261EQy
    public final void LJI(int i, String str) {
        if (!((Boolean) C0ATG.LIZ.getValue()).booleanValue()) {
            return;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("resource_type", str);
        c0lab.LIZ(i, "icon_cache_status");
        C20684815ws.LJIILLIIL("tool_performance_resource_download_user_view", c0lab.LIZ);
    }

    @Override // X.InterfaceC2281261EQy
    public final void LJII(String str, String str2, String str3, boolean z) {
        LJFF(str, str2, str3, null, z);
    }

    @Override // X.InterfaceC2281261EQy
    public final void LJFF(String str, String str2, String str3, Throwable th, boolean z) {
        String str4;
        String message;
        if (u7.LJ() || u7.LIZLLL()) {
            C2344009Gk c2344009Gk = new C2344009Gk();
            if (z) {
                str4 = "1";
            } else {
                str4 = CardStruct.IStatusCode.DEFAULT;
            }
            c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str4);
            c2344009Gk.LJIIIIZZ("enter_from", str3);
            c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
            c2344009Gk.LJIIIIZZ("tab", str2);
            if (z) {
                message = "";
            } else if (th == null || (message = th.getMessage()) == null) {
                message = "empty_error_msg";
            }
            c2344009Gk.LJIIIIZZ("error_msg", message);
            C20684815ws.LJIILLIIL("tool_performance_resource_request", c2344009Gk.LIZ);
        }
    }

    @Override // X.InterfaceC2281261EQy
    public final void LJIIIIZZ(float f, float f2, int i, String str, boolean z) {
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str);
        c2344009Gk.LIZIZ(f, "fps");
        c2344009Gk.LIZIZ(f2, "duration");
        c2344009Gk.LIZJ(i, "total_frame");
        c2344009Gk.LIZJ(z ? 1 : 0, "is_first");
        C20684815ws.LJIILLIIL("tool_performance_fps_info", c2344009Gk.LIZ);
    }
}
