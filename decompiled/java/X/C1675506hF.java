package X;

import com.bytedance.scene.Scene;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.im.message.content.SystemContent;
import com.ss.android.ugc.aweme.im.message.template.card.BaseTemplate;
import com.ss.android.ugc.aweme.im.message.template.component.BaseFooterComponent;
import com.ss.android.ugc.aweme.im.message.template.component.BaseResponseComponent;
import com.ss.android.ugc.aweme.im.message.template.component.TextComponent;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.CheckMessage;
import com.ss.android.ugc.aweme.im.sdk.chat.data.model.FakeInlineMessageContent;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06hF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1675506hF {
    public static final C1675506hF LIZ = new C1675506hF();

    public static CheckMessage LIZ(Map map) {
        if (map.get("s:send_response_check_msg") == null) {
            return null;
        }
        try {
            return (CheckMessage) C051M.LIZIZ(CheckMessage.class, (String) map.get("s:send_response_check_msg"));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static boolean LIZJ(SystemContent.Key key) {
        String str;
        Map<String, String> extra = key.getExtra();
        if (extra != null) {
            str = extra.get(Scene.SCENE_SERVICE);
        } else {
            str = null;
        }
        if (!Intrinsics.LJFF(str, "minor_protection") && !Intrinsics.LJFF(str, "age_protection")) {
            return false;
        }
        return true;
    }

    public static SystemContent LIZIZ(C869590Y9l c869590Y9l, BaseTemplate baseTemplate) {
        String str;
        CheckMessage.StatusMsg statusMsg;
        BaseResponseComponent baseResponseComponentNc;
        Map<String, String> map;
        String str2;
        BaseFooterComponent baseFooterComponentDG;
        TextComponent textComponent;
        if (baseTemplate != null && (baseFooterComponentDG = baseTemplate.dG()) != null && (textComponent = baseFooterComponentDG.text) != null) {
            str = textComponent.text;
        } else {
            str = null;
        }
        if (C123100dR.LIZ(str) && str != null) {
            return new FakeInlineMessageContent(0L, -1, "", str, "").toSystemContent();
        }
        if (baseTemplate != null && (baseResponseComponentNc = baseTemplate.Nc()) != null && (map = baseResponseComponentNc.extras) != null) {
            if (map.containsKey("ext")) {
                str2 = map.get("ext");
            } else if (map.containsKey("notice")) {
                str2 = map.get("notice");
            }
            if (str2 != null) {
                return (SystemContent) C051M.LIZIZ(SystemContent.class, str2);
            }
        }
        CheckMessage checkMessageLIZ = LIZ(c869590Y9l.getLocalExt());
        if (checkMessageLIZ == null) {
            return null;
        }
        CheckMessage.StatusMsg statusMsg2 = checkMessageLIZ.getStatusMsg();
        if ((statusMsg2 != null && statusMsg2.getMsgType() == 1022) || (statusMsg = checkMessageLIZ.getStatusMsg()) == null) {
            return null;
        }
        return statusMsg.getMsgContent();
    }
}
