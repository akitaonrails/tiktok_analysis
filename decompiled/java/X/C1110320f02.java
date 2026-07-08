package X;

import android.text.SpannableStringBuilder;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.EmoteChatMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;
import webcast.data.UserIdentity;

/* JADX INFO: renamed from: X.0f02, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110320f02 extends AbstractC1110160ezm<EmoteChatMessage> {
    public SpannableStringBuilder LJJIJIIJIL;

    @Override // X.AbstractC1110790f0n
    public final void LLILZ(BadgeStruct badgeStruct) {
    }

    @Override // X.AbstractC1110520f0M
    public final String LLJLLL() {
        return "";
    }

    @Override // X.AbstractC1110160ezm
    public final String LLLII() {
        return "";
    }

    @Override // X.AbstractC1110160ezm
    public final boolean LLLIIIIL() {
        return true;
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJJJJLI() {
        return !this.LIZJ;
    }

    @Override // X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        List<EmoteModel> list;
        boolean z;
        EmoteModel emoteModel;
        SpannableStringBuilder spannableStringBuilder = this.LJJIJIIJIL;
        if (spannableStringBuilder != null && spannableStringBuilder.length() > 0) {
            return spannableStringBuilder;
        }
        EmoteChatMessage emoteChatMessage = (EmoteChatMessage) this.LJIL;
        if (emoteChatMessage != null && (list = emoteChatMessage.emoteList) != null && (!list.isEmpty()) && C1110350f05.LIZIZ()) {
            Room room = null;
            if (LLIIIILZ() != null) {
                z = LLIIIILZ().LJI;
                room = LLIIIILZ().LJII;
            } else {
                z = false;
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_live_room_emote_messsage_load");
            c474500IjALIZ.LJJII("rendered", "type");
            c474500IjALIZ.LJJII(Integer.valueOf(((EmoteChatMessage) this.LJIL).emoteList.size()), "emote_count");
            c474500IjALIZ.LJJII(z ? "1" : CardStruct.IStatusCode.DEFAULT, "is_anchor");
            c474500IjALIZ.LJJII(this.LIZJ ? "1" : CardStruct.IStatusCode.DEFAULT, "is_from_self");
            int size = ((EmoteChatMessage) this.LJIL).emoteList.size();
            C1110390f09 c1110390f09 = C1110390f09.LIZ;
            List<EmoteModel> list2 = ((EmoteChatMessage) this.LJIL).emoteList;
            ArrayList arrayList = new ArrayList();
            for (EmoteModel emoteModel2 : list2) {
                EmoteModel emoteModel3 = emoteModel2;
                HashMap<String, EmoteModel> map = C1110390f09.LJFF;
                if (map.containsKey(emoteModel3.emoteId) && (emoteModel = map.get(emoteModel3.emoteId)) != null && emoteModel.emoteResource != null) {
                    arrayList.add(emoteModel2);
                }
            }
            c474500IjALIZ.LJJII(Integer.valueOf(size - arrayList.size()), "failure_count");
            c474500IjALIZ.LJJII("live_room_message_list", "show_entrance");
            c474500IjALIZ.LIZ();
            if (room != null) {
                List<EmoteModel> list3 = ((EmoteChatMessage) this.LJIL).emoteList;
                ArrayList arrayList2 = new ArrayList();
                for (EmoteModel emoteModel4 : list3) {
                    if (emoteModel4.emoteScene == 1) {
                        arrayList2.add(emoteModel4);
                    }
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    LLLIILIL("show", (EmoteModel) it2.next(), room);
                }
            }
        }
        C1110390f09 c1110390f092 = C1110390f09.LIZ;
        List<SpannableStringBuilder> listLIZ = C1110390f09.LJIILL.LIZ(((EmoteChatMessage) this.LJIL).emoteList, EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE, new AwS596S0100000_17(this, 260), null, new AwS596S0100000_17(this, 261), C1110390f09.LJFF);
        return true ^ ((ArrayList) listLIZ).isEmpty() ? (SpannableStringBuilder) ListProtector.get(listLIZ, 0) : new SpannableStringBuilder("");
    }

    @Override // X.AbstractC1110800f0o
    public final UserIdentity LLJJJJLIIL() {
        return ((EmoteChatMessage) this.LJIL).userIdentity;
    }

    @Override // X.AbstractC1110160ezm
    public final int LLLIIII() {
        return ((EmoteChatMessage) this.LJIL).emoteList.size();
    }

    @Override // X.AbstractC1110160ezm
    public final void LLLIIL() {
        C1110390f09 c1110390f09 = C1110390f09.LIZ;
        List<EmoteModel> list = ((EmoteChatMessage) this.LJIL).emoteList;
        EnumC1110450f0F enumC1110450f0F = EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE;
        C513300KBc c513300KBc = C1110390f09.LJIILIIL;
        HashMap<String, EmoteModel> map = C1110390f09.LJFF;
        c513300KBc.getClass();
        C513300KBc.LIZIZ(list, enumC1110450f0F, map, true);
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return ((EmoteChatMessage) this.LJIL).user;
    }

    public C1110320f02(EmoteChatMessage emoteChatMessage) {
        super(emoteChatMessage);
    }

    @Override // X.AbstractC1110790f0n
    public final void LLILLL(BadgeStruct badgeStruct) {
        if (C191100oP.LIZLLL(badgeStruct)) {
            C191100oP.LJFF(LLIIJI(), "comment_area_user_comment", LLIILII());
        }
        if (C191100oP.LIZJ(badgeStruct) && badgeStruct != null) {
            C498280JgQ.LIZ(badgeStruct, LLIIJI(), LJZL());
        }
    }
}
