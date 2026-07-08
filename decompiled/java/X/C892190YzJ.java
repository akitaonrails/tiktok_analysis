package X;

import com.ss.android.ugc.aweme.im.chatroom.api.model.SessionInfo;
import com.ss.android.ugc.aweme.im.messagelist.api.IIMMessageReactionAnalytics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0YzJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C892190YzJ {
    public static final void LIZ(SessionInfo sessionInfo, C869590Y9l c869590Y9l, InterfaceC879330YeZ interfaceC879330YeZ, List<? extends InterfaceC879330YeZ> list, String str, HashMap<String, String> map) {
        String str2;
        String str3;
        C0Y8T c0y8tLIZ = C0YSQ.LIZIZ(InterfaceC876950Yaj.LIZ).LIZ(sessionInfo.getConversationId());
        if (c0y8tLIZ != null) {
            if (list.contains(interfaceC879330YeZ)) {
                C879320YeY.LIZ(c869590Y9l, str, c0y8tLIZ, interfaceC879330YeZ, null);
                return;
            }
            map.put("like_method", "long_press");
            boolean z = interfaceC879330YeZ instanceof C455420HtU;
            if (z) {
                str2 = "aimoji";
            } else {
                str2 = "emoji";
            }
            map.put("reaction_type", str2);
            String str4 = "";
            if (z) {
                String str5 = ((C455420HtU) interfaceC879330YeZ).LIZLLL;
                if (str5 == null) {
                    str5 = "";
                }
                map.put("sa_reaction_name", str5);
            }
            Map<String, String> extraMobParams = sessionInfo.getExtraMobParams();
            if (extraMobParams != null && (str3 = extraMobParams.get("enter_position")) != null) {
                str4 = str3;
            }
            map.put("enter_position", str4);
            IIMMessageReactionAnalytics.LIZ.getClass();
            IIMMessageReactionAnalytics value = C892200YzK.LIZIZ.getValue();
            if (value != null) {
                value.LIZJ(c869590Y9l, map, C0I0B.LJFF.LIZIZ());
            }
            C879320YeY.LIZIZ(c869590Y9l.getUuid(), str, c0y8tLIZ, interfaceC879330YeZ);
        }
    }
}
