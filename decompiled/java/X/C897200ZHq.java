package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.saas.host.api.analytics.IIMAnalyticsHelper;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ZHq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897200ZHq {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(String str, boolean z, String str2) {
        String strLIZ;
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("conversation_id", str);
        IIMAnalyticsHelper.LIZ.getClass();
        IIMAnalyticsHelper value = C897210ZHr.LIZIZ.getValue();
        if (value == null || (strLIZ = value.LIZ(str, z)) == null) {
            if (z) {
                strLIZ = "group";
            } else {
                strLIZ = "private";
            }
        }
        pairArr[1] = new Pair("chat_type", strLIZ);
        pairArr[2] = new Pair("enter_from", "chat");
        pairArr[3] = new Pair(Scene.SCENE_SERVICE, str2);
        C20684815ws.LJIILLIIL("ttsocial_chat_message_hint_click", C2097608Jq.LJIIIIZZ(pairArr));
    }

    public static void LIZIZ(String str, boolean z, String str2) {
        String strLIZ;
        C0I0B.LJFF.LIZIZ();
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("conversation_id", str);
        IIMAnalyticsHelper.LIZ.getClass();
        IIMAnalyticsHelper value = C897210ZHr.LIZIZ.getValue();
        if (value == null || (strLIZ = value.LIZ(str, z)) == null) {
            if (z) {
                strLIZ = "group";
            } else {
                strLIZ = "private";
            }
        }
        pairArr[1] = new Pair("chat_type", strLIZ);
        pairArr[2] = new Pair("enter_from", "chat");
        pairArr[3] = new Pair(Scene.SCENE_SERVICE, str2);
        C20684815ws.LJIILLIIL("ttsocial_chat_message_hint_show", C2097608Jq.LJIIIIZZ(pairArr));
    }
}
