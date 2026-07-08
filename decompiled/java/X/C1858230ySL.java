package X;

import com.ss.android.ugc.aweme.tako.botpage.vm.ability.IMessageAbility;
import com.ss.android.ugc.aweme.tako.botpage.vm.ability.ITakoScreenTypeAbility;
import com.ss.android.ugc.aweme.tako.ccl.model.api.Message;
import com.ss.android.ugc.aweme.tako.signal.ITakoContextAbility;
import defpackage.w2;
import java.util.Collections;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0ySL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1858230ySL {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(IMessageAbility iMessageAbility, ITakoContextAbility iTakoContextAbility, ITakoScreenTypeAbility iTakoScreenTypeAbility, Message message, int i, w2.a aVar) {
        C13LC<C1863850ybP> c13lcT71;
        C1863850ybP c1863850ybP;
        String strNZ0;
        if (message.isMultiAnswer && iTakoContextAbility != null && (c13lcT71 = iTakoContextAbility.T71()) != null && (c1863850ybP = (C1863850ybP) c13lcT71.LIZIZ()) != null) {
            C1862330yYx c1862330yYx = C1862330yYx.LIZ;
            String str = c1863850ybP.LL;
            String str2 = c1863850ybP.LLILLJJLI;
            String str3 = c1863850ybP.LLILZIL;
            String str4 = c1863850ybP.LLILZLL;
            String str5 = "";
            if (str4 == null) {
                str4 = "";
            }
            String str6 = c1863850ybP.LLIZ;
            String str7 = message.replyUuid;
            String str8 = message.uuid;
            int i2 = i + 1;
            if (iTakoScreenTypeAbility == null || (strNZ0 = iTakoScreenTypeAbility.nZ0()) == null) {
                strNZ0 = "full_screen";
            }
            C20235014Fo c20235014FoLIZ = C597050NbL.LIZ();
            c1862330yYx.getClass();
            Pair[] pairArr = new Pair[9];
            if (str == null) {
                str = "";
            }
            pairArr[0] = new Pair("enter_from", str);
            if (str2 == null) {
                str2 = "";
            }
            pairArr[1] = new Pair("enter_method", str2);
            if (str3 == null) {
                str3 = "";
            }
            pairArr[2] = new Pair("process_id", str3);
            pairArr[3] = new Pair("tako_session_id", str4);
            if (str6 == null) {
                str6 = "";
            }
            pairArr[4] = new Pair("tako_chat_id", str6);
            if (str7 == null) {
                str7 = "";
            }
            pairArr[5] = new Pair("query_message_id", str7);
            if (str8 != null) {
                str5 = str8;
            }
            pairArr[6] = new Pair("message_id", str5);
            pairArr[7] = new Pair("response_rank", String.valueOf(i2));
            pairArr[8] = new Pair("screen_type", strNZ0);
            c20235014FoLIZ.LIZ("tikbot_multi_answer_message_result", C2097608Jq.LJIIJ(pairArr));
        }
        message.selectedAnswerIndex = i;
        Message messageLIZLLL = Message.LIZLLL(message, null, i, false, 0, false, null, false, -32769, 2097151);
        if (aVar != w2.a.SELECT_RESPONSE && messageLIZLLL.LIZ(i) == 2 && C1785140wYS.LIZJ(i, messageLIZLLL.uuid)) {
            C1785140wYS.LJIIIIZZ(i, messageLIZLLL.uuid, true);
            if (iMessageAbility != null) {
                iMessageAbility.nX0(i, messageLIZLLL.uuid);
            } else {
                return;
            }
        } else if (iMessageAbility == null) {
            return;
        }
        C1858150ySD.LIZJ(iMessageAbility, C1855920yOc.LJ(messageLIZLLL, Collections.singletonList(4)), Collections.singletonList(C1855920yOc.LJ(messageLIZLLL, Collections.singletonList(4))), false, aVar, 4);
    }
}
