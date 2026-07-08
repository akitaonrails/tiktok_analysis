package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0Hyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C458640Hyg {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("voice_message_entrance_show", C458650Hyh.LIZ(new Pair("enter_from", "chat"), new Pair("chat_type", C1677606ha.LIZ(i))));
    }

    public static void LIZIZ(String str, String str2) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("voice_message_play_entry", C2097608Jq.LJIIIIZZ(new Pair("enter_from", "chat"), new Pair("duration", String.valueOf(C2510109sZ.LIZ())), new Pair("play_action", str), new Pair("chat_type", str2)));
    }

    public static void LIZJ(long j, String str, String str2, String str3) {
        C830490Whz c830490WhzLIZ = C458650Hyh.LIZ(new Pair("enter_from", "chat"), new Pair("enter_method", str), new Pair("conversation_id", str2), new Pair("chat_type", str3), new Pair("message_id", String.valueOf(j)));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_chat_transcript_btn_click", c830490WhzLIZ);
    }

    public static void LIZLLL(long j, String str, String str2, String str3) {
        C830490Whz c830490WhzLIZ = C458650Hyh.LIZ(new Pair("enter_from", "chat"), new Pair("enter_method", str), new Pair("conversation_id", str2), new Pair("chat_type", str3), new Pair("message_id", String.valueOf(j)));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_chat_transcript_btn_show", c830490WhzLIZ);
    }

    public static void LJ(long j, String str, String str2, String str3) {
        C830490Whz c830490WhzLIZ = C458650Hyh.LIZ(new Pair("enter_from", "chat"), new Pair("conversation_id", str), new Pair("chat_type", str2), new Pair("message_id", String.valueOf(j)), new Pair("result", str3));
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("ttsocial_chat_transcript_result", c830490WhzLIZ);
    }

    public static void LJFF(String str, int i, String str2, String str3) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("voice_message_record", C458650Hyh.LIZ(new Pair("enter_from", "chat"), new Pair("enter_method", str), new Pair("duration", String.valueOf(i)), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2), new Pair("chat_type", str3)));
    }

    public static void LJI(String str, int i, boolean z, boolean z2, String str2, String str3, boolean z3, InterfaceC1493105sv interfaceC1493105sv) {
        Object obj;
        Object obj2;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = new Pair("enter_from", str);
        pairArr[1] = new Pair("duration", String.valueOf(i));
        String str4 = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[2] = new Pair("is_self", obj);
        if (z2) {
            obj2 = "1";
        } else {
            obj2 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[3] = new Pair("is_unread", obj2);
        pairArr[4] = new Pair("chat_type", str2);
        pairArr[5] = new Pair("from_user_id", str3);
        if (!z3) {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        pairArr[6] = new Pair("is_transcripted", str4);
        interfaceC1493105sv.sendEvent("voice_message_show", C458650Hyh.LIZ(pairArr));
    }
}
