package X;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.ss.android.ugc.aweme.im.common.setting.MessagingToolsOptionURL;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Yyh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891810Yyh {
    public static void LIZ(Context context, String str) {
        MessagingToolsOptionURL messagingToolsOptionURL = (MessagingToolsOptionURL) C891860Yym.LIZIZ.getValue();
        messagingToolsOptionURL.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(messagingToolsOptionURL.promoteUrl);
        sbLIZ.append("&enter_from=");
        sbLIZ.append(str);
        SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ)).open();
    }

    public static void LIZIZ(String str, boolean z) {
        String str2;
        if (z) {
            str2 = "Promote_entrance_click";
        } else {
            str2 = "Promote_entrance_show";
        }
        Map mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("enter_from", str), new Pair("attribution_L2", "business_account"), new Pair("attribution_L3", str));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL(str2, mapLJIIIIZZ);
    }
}
