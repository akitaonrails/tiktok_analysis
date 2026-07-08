package X;

import android.util.ArrayMap;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.Pair;

/* JADX INFO: renamed from: X.18ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21311718ah {
    public static final /* synthetic */ int LIZ = 0;

    public static ArrayMap LIZ(Pair... pairArr) {
        ArrayMap arrayMap = new ArrayMap();
        for (Pair pair : pairArr) {
            arrayMap.put(pair.getFirst(), pair.getSecond());
        }
        return arrayMap;
    }

    public static void LIZJ(String str, String str2, int i) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL(str, LIZ(new Pair("conversation_id", str2), new Pair("chat_type", C1229100i5c.LIZLLL(str2)), new Pair("group_type", C1229100i5c.LJI(str2)), new Pair(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, String.valueOf(i))));
    }

    public static void LIZLLL(String str, AbstractC21311818ai abstractC21311818ai, String str2) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("show_group_moderation_banner", LIZ(new Pair("enter_from", "chat"), new Pair("conversation_id", str), new Pair("moderation_status", abstractC21311818ai.LIZ), new Pair("is_owner", str2)));
    }

    public static void LIZIZ(String str, AbstractC21311818ai abstractC21311818ai, EnumC1154140g8i enumC1154140g8i, String str2) {
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("click_group_moderation_banner", LIZ(new Pair("enter_from", "chat"), new Pair("conversation_id", str), new Pair("moderation_status", abstractC21311818ai.LIZ), new Pair("action", enumC1154140g8i.getValue()), new Pair("is_owner", str2)));
    }
}
