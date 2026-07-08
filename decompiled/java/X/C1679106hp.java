package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06hp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1679106hp {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(int i, String str, String str2) {
        String strLIZ;
        C0I0B.LJFF.LIZIZ();
        C830490Whz c830490Whz = new C830490Whz();
        if (i == 3) {
            strLIZ = C1229100i5c.LJI(str);
        } else {
            strLIZ = C1677606ha.LIZ(i);
        }
        c830490Whz.put("chat_type", strLIZ);
        c830490Whz.put("enter_from", "chat");
        c830490Whz.put("enter_method", "inline_message");
        c830490Whz.put("process_id", str2);
        c830490Whz.put("conversation_id", str);
        c830490Whz.putAll(C1530005ys.LIZ(C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(str)));
        C20684815ws.LJIILLIIL("click_report", c830490Whz);
    }

    public static void LIZ(int i, String str, String str2, Integer num, String str3, int i2) {
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i2 & 8) != 0) {
            num = null;
        }
        if ((i2 & 16) != 0) {
            str3 = null;
        }
        if ((i2 & 32) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        String strLIZ = C1677606ha.LIZ(i);
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put(Scene.SCENE_SERVICE, str);
        c830490Whz.put("chat_type", strLIZ);
        c830490Whz.put("enter_from", str2);
        c830490Whz.put("platform", "internal");
        c830490Whz.put("action", "click");
        if (num != null) {
            if (num.intValue() == 4072 || num.intValue() == 4073) {
                c830490Whz.put("conversation_id", str3);
            }
            if (num.intValue() == 1818) {
                c830490Whz.put("real_message_type", num.toString());
            }
        }
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("click_inline_dm_option", c830490Whz);
    }

    public static void LIZJ(int i, String str, Integer num, String str2, SessionInfo sessionInfo, int i2) {
        String str3;
        String str4;
        InterfaceC1493505sz interfaceC1493505szLIZIZ = null;
        if ((i2 & 4) != 0) {
            str3 = "chat";
        } else {
            str3 = null;
        }
        if ((i2 & 8) != 0) {
            num = null;
        }
        if ((i2 & 16) != 0) {
            str4 = "internal";
        } else {
            str4 = null;
        }
        if ((i2 & 32) != 0) {
            str2 = null;
        }
        if ((i2 & 64) != 0) {
            sessionInfo = null;
        }
        if ((i2 & 128) != 0) {
            interfaceC1493505szLIZIZ = C0I0B.LJFF.LIZIZ();
        }
        if (sessionInfo != null && sessionInfo.isChatroomAnalyticsBlocked()) {
            return;
        }
        String strLIZ = C1677606ha.LIZ(i);
        C830490Whz c830490Whz = new C830490Whz();
        c830490Whz.put("enter_from", str3);
        c830490Whz.put("chat_type", strLIZ);
        c830490Whz.put("platform", str4);
        c830490Whz.put(Scene.SCENE_SERVICE, str);
        if (num != null) {
            if (num.intValue() == 4072 || num.intValue() == 4073) {
                c830490Whz.put("conversation_id", str2);
            }
            if (num.intValue() == 1818 && Intrinsics.LJFF(str, "risk_notice_report")) {
                c830490Whz.put("real_message_type", num.toString());
            }
        }
        interfaceC1493505szLIZIZ.getClass();
        C20684815ws.LJIILLIIL("show_inline_dm_option", c830490Whz);
    }
}
