package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.sdk.common.controller.analytics.IMAnalyticsUtil;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0XDy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C845280XDy {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS200S0000000_13.get$arr$(399));

    public static void LIZ(String str, Boolean bool, String str2, int i) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            bool = null;
        }
        if ((i & 8) != 0) {
            str2 = IMAnalyticsUtil.LIZIZ.getPid();
        }
        if ((i & 16) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", "chat");
        if (str != null && str.length() > 0) {
            c830490Whz.put(Scene.SCENE_SERVICE, str);
        }
        if (str2 != null) {
            c830490Whz.put("process_id", str2);
        }
        if (bool != null) {
            c830490Whz.put("if_draft", C052F.LIZ.get(bool));
        }
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("show_keyboard", c830490Whz);
    }
}
