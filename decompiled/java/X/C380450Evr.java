package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.List;

/* JADX INFO: renamed from: X.0Evr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C380450Evr {
    public static final C380450Evr LIZ = new C380450Evr();

    public static void LIZ(boolean z, Integer num, String str, long j, long j2) {
        String string;
        int i = !z ? 1 : 0;
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i));
        if (num == null || (string = num.toString()) == null) {
            string = "";
        }
        c2344009Gk.LJIIIIZZ("error_code", string);
        c2344009Gk.LJIIIIZZ("error_domain", str);
        c2344009Gk.LJIIIIZZ("duration_total", String.valueOf(j));
        c2344009Gk.LJIIIIZZ("duration_upload", String.valueOf(j2));
        C20684815ws.LJIILLIIL("load_prompt_suggest", c2344009Gk.LIZ);
    }

    public static void LIZIZ(boolean z, Integer num, String str, long j, String str2, List list, int i) {
        String strLJJLIIIJ;
        String string;
        int i2 = !z ? 1 : 0;
        String str3 = "";
        if (!(!list.isEmpty())) {
            strLJJLIIIJ = "";
        } else {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62);
        }
        C2344009Gk c2344009Gk = new C2344009Gk();
        c2344009Gk.LJIIIIZZ(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i2));
        if (num != null && (string = num.toString()) != null) {
            str3 = string;
        }
        c2344009Gk.LJIIIIZZ("error_code", str3);
        c2344009Gk.LJIIIIZZ("error_domain", str);
        c2344009Gk.LJIIIIZZ("duration", String.valueOf(j));
        str2.toString();
        c2344009Gk.LJIIIIZZ(Scene.SCENE_SERVICE, str2);
        c2344009Gk.LJIIIIZZ("request_key_list", strLJJLIIIJ);
        c2344009Gk.LJIIIIZZ("current_quota", String.valueOf(i));
        C20684815ws.LJIILLIIL("load_quota_list", c2344009Gk.LIZ);
    }
}
