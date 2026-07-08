package X;

import android.util.ArrayMap;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import java.util.LinkedHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.06iV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1683306iV {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZJ() {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("click_report", LIZ(new Pair("chat_type", "group"), new Pair("enter_from", "chat"), new Pair("enter_method", "dm_inline")));
    }

    public static ArrayMap LIZ(Pair... pairArr) {
        ArrayMap arrayMap = new ArrayMap();
        for (Pair pair : pairArr) {
            arrayMap.put(pair.getFirst(), pair.getSecond());
        }
        return arrayMap;
    }

    public static void LIZIZ(AbstractC1683406iW abstractC1683406iW, String str, int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ;
        if ((i & 2) != 0) {
            str = "group";
        }
        if ((i & 4) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        } else {
            interfaceC1493505szLIZIZ = null;
        }
        ArrayMap arrayMapLIZ = LIZ(new Pair("chat_type", str), new Pair("enter_from", "chat"), new Pair("platform", abstractC1683406iW.LIZ), new Pair(Scene.SCENE_SERVICE, abstractC1683406iW.LIZIZ), new Pair("action", "click"));
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("click_inline_dm_option", arrayMapLIZ);
    }

    public static void LIZLLL(AbstractC1683406iW abstractC1683406iW, String str, String str2, SessionInfo sessionInfo, int i) {
        if ((i & 2) != 0) {
            str = "group";
        }
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            sessionInfo = null;
        }
        if ((i & 16) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        if (sessionInfo != null && sessionInfo.isChatroomAnalyticsBlocked()) {
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(LIZ(new Pair("chat_type", str), new Pair("enter_from", "chat"), new Pair("platform", abstractC1683406iW.LIZ), new Pair(Scene.SCENE_SERVICE, abstractC1683406iW.LIZIZ)));
        if (str2 != null) {
            linkedHashMap.put("conversation_id", str2);
        }
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("show_inline_dm_option", linkedHashMap);
    }
}
