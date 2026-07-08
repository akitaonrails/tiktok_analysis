package X;

import com.bytedance.android.livesdk.chatroom.api.UserEmote;
import com.bytedance.android.livesdk.model.PollData;
import com.bytedance.android.livesdk.model.PollInfo;
import com.bytedance.android.livesdk.model.message.PollOptionInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import ttpobfuscated.e3;
import webcast.api.sub.EmotePollInfoResponse;

/* JADX INFO: renamed from: X.0JRl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C492070JRl {
    public final C0JRE LIZ;

    public final int LIZ() {
        EmotePollInfoResponse.Data data;
        PollInfo pollInfo;
        PollData pollData;
        List<PollOptionInfo> list;
        ArrayList arrayList = new ArrayList();
        C0JRE c0jre = this.LIZ;
        if (c0jre != null && (data = c0jre.LLJJ) != null && (pollInfo = data.pollInfo) != null && (pollData = pollInfo.pollData) != null && (list = pollData.pollOptionList) != null) {
            Iterator<PollOptionInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                arrayList.add(Long.valueOf(it2.next().votes));
            }
        }
        Long l = (Long) C13LP.LJJLIIIJLJLI(arrayList);
        if (l != null && l.longValue() == 0) {
            return 0;
        }
        if (arrayList.isEmpty()) {
            return 2;
        }
        Iterator it3 = arrayList.iterator();
        int i = 0;
        while (it3.hasNext()) {
            long jLongValue = ((Number) it3.next()).longValue();
            if (l != null && jLongValue == l.longValue() && (i = i + 1) < 0) {
                C1697810uHb.LJIJ();
                throw null;
            }
        }
        return i == 1 ? 1 : 2;
    }

    public final String LIZIZ() {
        ArrayList<C492110JRp> arrayList;
        HashMap map = new HashMap();
        C0JRE c0jre = this.LIZ;
        if (c0jre != null && (arrayList = c0jre.LLJJIJI) != null) {
            for (C492110JRp c492110JRp : arrayList) {
                UserEmote userEmote = c492110JRp.LIZJ;
                map.put(Long.valueOf(userEmote != null ? userEmote.emoteId : 0L), Long.valueOf(c492110JRp.LIZ.votes));
            }
        }
        return C13LP.LJJLIIIJ(map.entrySet(), ",", e3.e, e3.f, 0, null, new C1280404zi(), 24);
    }

    public final void LIZLLL() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_viewer_emote_poll_result_detail_page");
        C0JRE c0jre = this.LIZ;
        c474500IjALIZ.LJJII(c0jre != null ? c0jre.LLILZIL : null, "anchor_id");
        C0JRE c0jre2 = this.LIZ;
        c474500IjALIZ.LJJII(c0jre2 != null ? c0jre2.LLILLJJLI : null, "room_id");
        C0JRE c0jre3 = this.LIZ;
        c474500IjALIZ.LJJII(c0jre3 != null ? c0jre3.LLILLL : null, "poll_id");
        C0JRE c0jre4 = this.LIZ;
        c474500IjALIZ.LJJII(c0jre4 != null ? Long.valueOf(c0jre4.LLJ) : null, "time_remain");
        C0JRE c0jre5 = this.LIZ;
        c474500IjALIZ.LJJII(c0jre5 != null ? c0jre5.LLILZLL : null, "vote_cnt");
        c474500IjALIZ.LJJII(LIZIZ(), "poll_details");
        C0JRE c0jre6 = this.LIZ;
        c474500IjALIZ.LJJII(c0jre6 != null ? c0jre6.LLJILJIL : null, "enter_from");
        c474500IjALIZ.LIZ();
    }

    public C492070JRl(C0JRE c0jre) {
        this.LIZ = c0jre;
    }

    public final void LIZJ(String str) {
        String str2;
        Long l;
        String str3;
        Long l2;
        Long lValueOf;
        Long l3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_emote_poll_end_confirm");
        C0JRE c0jre = this.LIZ;
        String str4 = null;
        if (c0jre != null) {
            str2 = c0jre.LLILZIL;
        } else {
            str2 = null;
        }
        c474500IjALIZ.LJJII(str2, "anchor_id");
        C0JRE c0jre2 = this.LIZ;
        if (c0jre2 != null) {
            l = c0jre2.LLILLJJLI;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(l, "room_id");
        C0JRE c0jre3 = this.LIZ;
        if (c0jre3 != null) {
            str3 = c0jre3.LLJILJIL;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "enter_from");
        C0JRE c0jre4 = this.LIZ;
        if (c0jre4 != null) {
            l2 = c0jre4.LLILLL;
        } else {
            l2 = null;
        }
        c474500IjALIZ.LJJII(l2, "poll_id");
        C0JRE c0jre5 = this.LIZ;
        if (c0jre5 != null) {
            lValueOf = Long.valueOf(c0jre5.LLJ);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "time_remain");
        C0JRE c0jre6 = this.LIZ;
        if (c0jre6 != null) {
            l3 = c0jre6.LLILZLL;
        } else {
            l3 = null;
        }
        c474500IjALIZ.LJJII(l3, "vote_cnt");
        c474500IjALIZ.LJJII(LIZIZ(), "poll_details");
        C0JRE c0jre7 = this.LIZ;
        if (c0jre7 != null) {
            str4 = c0jre7.LLJJIII;
        }
        c474500IjALIZ.LJJII(str4, "user_type");
        c474500IjALIZ.LJJII(str, "click_type");
        c474500IjALIZ.LIZ();
    }
}
