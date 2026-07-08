package X;

import Y.AObjectS360S0100000_17;
import Y.ARunnableS117S0100000_17;
import android.content.res.Resources;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.BadgeStruct;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastMessageSortSetting;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveBeingAtConfigSetting;
import com.bytedance.android.livesdk.model.message.ChatMessage;
import com.bytedance.android.livesdk.model.message.CommentQualityScore;
import com.bytedance.android.livesdk.model.message.PublicAreaMessageCommon;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import webcast.data.UserIdentity;

/* JADX INFO: renamed from: X.0f01, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1110310f01 extends AbstractC1110160ezm<ChatMessage> implements InterfaceC759280TqQ, InterfaceC1109660eyy, InterfaceC1112720f3u {
    public boolean LJJIJIIJIL;
    public boolean LJJIJIL;
    public CharSequence LJJIJL;
    public final C1110330f03 LJJIJLIJ;
    public long LJJIL;
    public boolean LJJIZ;
    public boolean LJJJ;
    public SpannableStringBuilder LJJJI;
    public Map<Long, Long> LJJJIL;
    public final ArrayList<EmoteWithIndex> LJJJJ;
    public SpannableStringBuilder LJJJJI;
    public final C180900ml LJJJJIZL;
    public CommentQualityScore LJJJJJ;
    public final AObjectS360S0100000_17 LJJJJJL;
    public final AObjectS360S0100000_17 LJJJJL;
    public final AObjectS360S0100000_17 LJJJJLI;
    public final ARunnableS117S0100000_17 LJJJJLL;

    @Override // X.InterfaceC1112720f3u
    public final InterfaceC1112720f3u LJIIIIZZ() {
        return null;
    }

    @Override // X.InterfaceC1109660eyy
    public final void LJIIJJI() {
        this.LJJJ = true;
    }

    @Override // X.InterfaceC1112720f3u
    public final boolean LJIILIIL() {
        return false;
    }

    @Override // X.InterfaceC1109660eyy
    public boolean LJJLJLI() {
        return !(this instanceof C1110280ezy);
    }

    @Override // X.AbstractC1110790f0n
    public final int LLIFFJFJJ() {
        return 7;
    }

    @Override // X.AbstractC1110790f0n
    public boolean LLILII() {
        return !(this instanceof C1110280ezy);
    }

    @Override // X.AbstractC1110160ezm
    public boolean LLLIIIIL() {
        return !(this instanceof C1110280ezy);
    }

    public void LLLILZLLLI(SpannableStringBuilder spannableStringBuilder) {
    }

    public void LLLIZZ(SpannableStringBuilder spannableStringBuilder) {
    }

    @Override // X.AbstractC1110520f0M, X.InterfaceC1112320f3G
    public final User LJIL() {
        return ((ChatMessage) this.LJIL).userInfo;
    }

    @Override // X.AbstractC1110520f0M, X.InterfaceC1112320f3G
    public final User LJJIJL() {
        List<User> list = ((ChatMessage) this.LJIL).mentionUsers;
        if (list == null || list.isEmpty()) {
            return null;
        }
        for (User user : list) {
            if (user != null && user.getId() == this.LJIILIIL.LJ()) {
                return user;
            }
        }
        if (LiveBeingAtConfigSetting.getValue().checkUser) {
            return null;
        }
        return (User) ListProtector.get(list, 0);
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJJJJJ() {
        ChatMessage chatMessage = (ChatMessage) this.LJIL;
        List<Integer> list = chatMessage.commentTag;
        if (list == null || list.isEmpty()) {
            return false;
        }
        return chatMessage.commentTag.contains(1);
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final boolean LJJJJLI() {
        return !this.LIZJ;
    }

    @Override // X.InterfaceC759280TqQ
    public final CharSequence LJLJLLL() {
        SpannableStringBuilder spannableStringBuilder = this.LJJJJI;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        if (TextUtils.isEmpty(this.LJJIJL)) {
            return "";
        }
        C1110390f09 c1110390f09 = C1110390f09.LIZ;
        SpannableStringBuilder spannableStringBuilderLIZ = C1110390f09.LIZ(this.LJJJJ, EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE, String.valueOf(this.LJJIJL), this.LJIILIIL.LIZ.getResources(), this.LJJJJLI, this.LJJIIZ, this.LJJJJL, LLLIL(), false);
        this.LJJJJI = spannableStringBuilderLIZ;
        LLLIZZ(spannableStringBuilderLIZ);
        return this.LJJJJI;
    }

    @Override // X.InterfaceC759280TqQ
    public final CharSequence LJLLI() {
        return ((ChatMessage) this.LJIL).content;
    }

    @Override // X.AbstractC1110790f0n
    public final PublicAreaMessageCommon LLIIII() {
        return ((ChatMessage) this.LJIL).publicAreaMessageCommon;
    }

    @Override // X.AbstractC1110800f0o
    public final UserIdentity LLJJJJLIIL() {
        return ((ChatMessage) this.LJIL).userIdentity;
    }

    @Override // X.AbstractC1110520f0M
    public final String LLJLLL() {
        MESSAGE message = this.LJIL;
        return ((ChatMessage) message).content != null ? ((ChatMessage) message).content : "";
    }

    @Override // X.AbstractC1110520f0M
    public final List<EmoteWithIndex> LLJZ() {
        MESSAGE message = this.LJIL;
        return ((ChatMessage) message).f314emotes != null ? ((ChatMessage) message).f314emotes : new ArrayList();
    }

    @Override // X.AbstractC1110520f0M
    public final void LLLFF() {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_message_click");
        c474500IjALIZ.LJIJJLI(LLIIIILZ().LJIIIZ);
        c474500IjALIZ.LJJII(Long.valueOf(this.LJIL.getMessageId()), "message_id");
        c474500IjALIZ.LJJII("comment", "message_type");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJIJ.LIZ), "message_release_id");
        c474500IjALIZ.LJJII(Long.valueOf(LLIIJI()), "to_user_id");
        c474500IjALIZ.LJJII(LLJJJ(), "admin_type");
        c474500IjALIZ.LIZ();
    }

    @Override // X.AbstractC1110520f0M
    public final void LLLFFI() {
        if (!((ChatMessage) this.LJIL).LIZ()) {
            super.LLLFFI();
            return;
        }
        C1109770ez9 c1109770ez9 = this.LJIILIIL;
        if (c1109770ez9 != null) {
            c1109770ez9.LJI((ChatMessage) this.LJIL, this);
        }
    }

    @Override // X.AbstractC1110520f0M
    public final void LLLFZ() {
        if (C494680Jac.LJI(this.LJIILIIL.LJIIIZ)) {
            return;
        }
        super.LLLFZ();
    }

    @Override // X.AbstractC1110160ezm
    public final String LLLII() {
        MESSAGE message = this.LJIL;
        return (message == 0 || ((ChatMessage) message).content == null) ? "" : ((ChatMessage) message).content;
    }

    @Override // X.AbstractC1110160ezm
    public final int LLLIIII() {
        MESSAGE message = this.LJIL;
        if (message == 0 || ((ChatMessage) message).f314emotes == null) {
            return 0;
        }
        return ((ChatMessage) message).f314emotes.size();
    }

    @Override // X.AbstractC1110160ezm
    public final void LLLIIL() {
        MESSAGE message = this.LJIL;
        if (message == 0 || ((ChatMessage) message).f314emotes == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < ((ChatMessage) this.LJIL).f314emotes.size(); i++) {
            EmoteModel emoteModel = ((EmoteWithIndex) ListProtector.get(((ChatMessage) this.LJIL).f314emotes, i)).emoteModel;
            if (emoteModel != null) {
                arrayList.add(emoteModel);
            }
        }
        C1110390f09 c1110390f09 = C1110390f09.LIZ;
        EnumC1110450f0F enumC1110450f0F = EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE;
        C513300KBc c513300KBc = C1110390f09.LJIILIIL;
        HashMap<String, EmoteModel> map = C1110390f09.LJFF;
        c513300KBc.getClass();
        C513300KBc.LIZIZ(arrayList, enumC1110450f0F, map, true);
    }

    public LifecycleOwner LLLIL() {
        C1109770ez9 c1109770ez9 = this.LJIILIIL;
        if (c1109770ez9 != null) {
            return c1109770ez9.LIZIZ;
        }
        return null;
    }

    public SpannableStringBuilder LLLILZ() {
        Room room;
        boolean z;
        SpannableStringBuilder spannableStringBuilder = this.LJJJI;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        String strLIZIZ = C1834150xpV.LIZIZ(((ChatMessage) this.LJIL).content);
        if (strLIZIZ == null) {
            strLIZIZ = "";
        }
        List<EmoteWithIndex> list = ((ChatMessage) this.LJIL).f314emotes;
        if (list != null && !list.isEmpty()) {
            C1109770ez9 c1109770ez9 = this.LJIILIIL;
            if (c1109770ez9 != null) {
                room = c1109770ez9.LJII;
                z = c1109770ez9.LJI;
            } else {
                room = null;
                z = false;
            }
            if (C1110350f05.LIZIZ()) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_live_room_emote_messsage_load");
                c474500IjALIZ.LJJII("rendered", "type");
                c474500IjALIZ.LJJII(Integer.valueOf(((ChatMessage) this.LJIL).f314emotes.size()), "emote_count");
                c474500IjALIZ.LJJII(z ? "1" : CardStruct.IStatusCode.DEFAULT, "is_anchor");
                c474500IjALIZ.LJJII(this.LIZJ ? "1" : CardStruct.IStatusCode.DEFAULT, "is_from_self");
                int size = ((ChatMessage) this.LJIL).f314emotes.size();
                C1110390f09 c1110390f09 = C1110390f09.LIZ;
                c474500IjALIZ.LJJII(Integer.valueOf(size - C1110390f09.LIZIZ(((ChatMessage) this.LJIL).f314emotes)), "failure_count");
                c474500IjALIZ.LJJII("live_room_message_list", "show_entrance");
                c474500IjALIZ.LIZ();
            }
            if (room != null) {
                Iterator<EmoteWithIndex> it2 = ((ChatMessage) this.LJIL).f314emotes.iterator();
                while (it2.hasNext()) {
                    EmoteModel emoteModel = it2.next().emoteModel;
                    if (emoteModel != null && emoteModel.emoteScene == 1) {
                        LLLIILIL("show", emoteModel, room);
                    }
                }
            }
        }
        C1110390f09 c1110390f092 = C1110390f09.LIZ;
        List<EmoteWithIndex> list2 = ((ChatMessage) this.LJIL).f314emotes;
        EnumC1110450f0F enumC1110450f0F = EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE;
        C1109770ez9 c1109770ez92 = this.LJIILIIL;
        return C1110390f09.LIZ(list2, enumC1110450f0F, strLIZIZ, c1109770ez92 == null ? Resources.getSystem() : c1109770ez92.LIZ.getResources(), this.LJJJJLI, this.LJJIIZ, this.LJJJJJL, LLLIL(), false);
    }

    @Override // X.AbstractC1110520f0M, X.InterfaceC1112320f3G
    public final long getCreateTime() {
        return this.LJIL.localTimestamp;
    }

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return ((ChatMessage) this.LJIL).userInfo;
    }

    @Override // X.InterfaceC759280TqQ
    public final boolean LJLLJ() {
        CharSequence content = getContent();
        if (content == null) {
            return false;
        }
        for (int i = 0; i < content.length(); i++) {
            char cCharAt = content.charAt(i);
            if (cCharAt != ' ' && cCharAt != 65532) {
                return true;
            }
        }
        return false;
    }

    @Override // X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        return LLLILZ();
    }

    public final void LLLILZJ() {
        C1109770ez9 c1109770ez9;
        if (LJJIJL() == null || this.LJJIJLIJ.LIZ || (c1109770ez9 = this.LJIILIIL) == null || c1109770ez9.LJIIJJI == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        this.LJIILIIL.LJIIJJI.LJIILJJIL(this);
        this.LJIILIIL.LJIIJJI.LJ(arrayList);
    }

    @Override // X.AbstractC1110520f0M, X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public void dispose() {
        super.dispose();
        this.LJJIJIIJIL = false;
    }

    @Override // X.AbstractC1110800f0o, X.InterfaceC1112690f3r
    public final long getPriority() {
        List<CommentQualityScore> list;
        Room room;
        List<String> list2;
        if (LLIILII() && LiveBroadcastMessageSortSetting.INSTANCE.isInExperiment()) {
            long priority = super.getPriority();
            if (priority >= 0) {
                return priority;
            }
        }
        CommentQualityScore commentQualityScore = this.LJJJJJ;
        if (commentQualityScore == null) {
            List<String> arrayList = new ArrayList<>();
            C1109770ez9 c1109770ez9 = this.LJIILIIL;
            if (c1109770ez9.LJIIIZ != null && (room = c1109770ez9.LJII) != null && (list2 = room.rankCommentGroups) != null) {
                arrayList = list2;
            }
            if (this.LJIIJJI && !c1109770ez9.LJI && !arrayList.isEmpty() && (list = ((ChatMessage) this.LJIL).commentQualityScores) != null && !list.isEmpty()) {
                HashMap map = new HashMap();
                for (int i = 0; i < ((ChatMessage) this.LJIL).commentQualityScores.size(); i++) {
                    CommentQualityScore commentQualityScore2 = (CommentQualityScore) ListProtector.get(((ChatMessage) this.LJIL).commentQualityScores, i);
                    map.put(commentQualityScore2.version, commentQualityScore2);
                }
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Object obj = ListProtector.get(arrayList, size);
                    if (map.containsKey(obj) && (commentQualityScore = (CommentQualityScore) map.get(obj)) != null) {
                        this.LJJJJJ = commentQualityScore;
                        break;
                    }
                }
            }
            return super.getPriority();
        }
        return commentQualityScore.score;
    }

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void onAttach() {
        C1109770ez9 c1109770ez9;
        InterfaceC1110630f0X interfaceC1110630f0X;
        super.onAttach();
        if (LJJIJL() == null || this.LJJIJLIJ.LIZ || (c1109770ez9 = this.LJIILIIL) == null || (interfaceC1110630f0X = c1109770ez9.LJIIJJI) == null || interfaceC1110630f0X.LJIL().contains(this)) {
            return;
        }
        this.LJIILIIL.LJIIJJI.LJIL().add(this);
    }

    @Override // X.InterfaceC1109660eyy
    public final boolean LJIILL() {
        return this.LJJJ;
    }

    @Override // X.InterfaceC759280TqQ
    public final boolean LJIILLIIL() {
        return this.LJJIJIIJIL;
    }

    @Override // X.InterfaceC1112720f3u
    public final C180900ml LJJIFFI() {
        return this.LJJJJIZL;
    }

    @Override // X.AbstractC1110520f0M, X.InterfaceC1112320f3G
    public final C1110330f03 LJJJIL() {
        return this.LJJIJLIJ;
    }

    @Override // X.InterfaceC759280TqQ
    public final Map<Long, Long> LJJLIIIJILLIZJL() {
        return this.LJJJIL;
    }

    @Override // X.InterfaceC1109660eyy
    public final boolean LJL() {
        return this.LJJIZ;
    }

    @Override // X.InterfaceC759280TqQ
    public final CharSequence LJLIIIL() {
        return this.LJJIJL;
    }

    @Override // X.InterfaceC759280TqQ
    public final boolean LJLLL() {
        return this.LJJIJIL;
    }

    public C1110310f01(ChatMessage chatMessage) {
        super(chatMessage);
        this.LJJIJLIJ = new C1110330f03();
        this.LJJIZ = false;
        this.LJJJ = false;
        this.LJJJJ = new ArrayList<>();
        this.LJJJJIZL = new C180900ml();
        this.LJJJJJL = new AObjectS360S0100000_17(this, 82);
        this.LJJJJL = new AObjectS360S0100000_17(this, 83);
        this.LJJJJLI = new AObjectS360S0100000_17(this, 84);
        this.LJJJJLL = new ARunnableS117S0100000_17(this, 133);
        if (chatMessage.LIZ()) {
            this.LJIIZILJ.LIZ = false;
        }
    }

    @Override // X.InterfaceC1109660eyy
    public final void LJJIII(boolean z) {
        this.LJJIZ = z;
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJJIIJZLJL(boolean z) {
        this.LJJIJIL = z;
    }

    @Override // X.AbstractC1110160ezm, X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1109570eyp
    public final void LJJJJL(boolean z) {
        InterfaceC1110630f0X interfaceC1110630f0X;
        InterfaceC1110630f0X interfaceC1110630f0X2;
        super.LJJJJL(z);
        if (LJJIJL() != null && !this.LJIL.isHistoryMessage && this.LJJIL != 0) {
            C473410IhP.LIZ().removeCallbacks(this.LJJJJLL);
            if (SystemClock.elapsedRealtime() - this.LJJIL < LiveBeingAtConfigSetting.getValue().flagReadThreshold && !this.LJJIJLIJ.LIZ) {
                C1109770ez9 c1109770ez9 = this.LJIILIIL;
                if (c1109770ez9 != null && (interfaceC1110630f0X2 = c1109770ez9.LJIIJJI) != null) {
                    interfaceC1110630f0X2.LJIILLIIL(this, true);
                }
            } else {
                LLLILZJ();
            }
            C1109770ez9 c1109770ez92 = this.LJIILIIL;
            if (c1109770ez92 != null && (interfaceC1110630f0X = c1109770ez92.LJIIJJI) != null) {
                interfaceC1110630f0X.LJIL().remove(this);
            }
            this.LJJIL = 0L;
        }
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJJLI(boolean z) {
        this.LJJIJIIJIL = z;
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJJZZIII(CharSequence charSequence) {
        this.LJJIJL = charSequence;
    }

    @Override // X.InterfaceC759280TqQ
    public final void LJLJI(Map<Long, Long> map) {
        MESSAGE message;
        this.LJJJIL = map;
        if (map != null && !map.isEmpty() && (message = this.LJIL) != 0 && ((ChatMessage) message).f314emotes != null && !((ChatMessage) message).f314emotes.isEmpty()) {
            this.LJJJJ.clear();
            for (int i = 0; i < ((ChatMessage) this.LJIL).f314emotes.size(); i++) {
                EmoteWithIndex emoteWithIndex = new EmoteWithIndex();
                EmoteWithIndex emoteWithIndex2 = (EmoteWithIndex) ListProtector.get(((ChatMessage) this.LJIL).f314emotes, i);
                Long l = this.LJJJIL.get(Long.valueOf(emoteWithIndex2.index));
                if (l != null) {
                    emoteWithIndex.index = l.intValue();
                    emoteWithIndex.emoteModel = emoteWithIndex2.emoteModel;
                    this.LJJJJ.add(emoteWithIndex);
                }
            }
        }
    }

    @Override // X.AbstractC1110790f0n
    public final void LLILLL(BadgeStruct badgeStruct) {
        String str;
        if (C191100oP.LIZIZ(badgeStruct)) {
            long jLLIIJI = LLIIJI();
            if (LLIILII()) {
                str = "anchor";
            } else {
                str = "user";
            }
            C191100oP.LJ(jLLIIJI, "livesdk_top_active_user_rank_badge_click", "comment_area_user_comment", str);
        }
        if (C191100oP.LIZLLL(badgeStruct)) {
            C191100oP.LJFF(LLIIJI(), "comment_area_user_comment", LLIILII());
        }
        if (C191100oP.LIZJ(badgeStruct) && badgeStruct != null) {
            C498280JgQ.LIZ(badgeStruct, LLIIJI(), LJZL());
        }
    }

    @Override // X.AbstractC1110790f0n
    public final void LLILZ(BadgeStruct badgeStruct) {
        String str;
        if (C191100oP.LIZIZ(badgeStruct)) {
            long jLLIIJI = LLIIJI();
            if (LLIILII()) {
                str = "anchor";
            } else {
                str = "user";
            }
            C191100oP.LJ(jLLIIJI, "livesdk_top_active_user_rank_badge_show", "comment_area_user_comment", str);
        }
    }

    @Override // X.AbstractC1110520f0M
    public final void LLLF(boolean z) {
        this.LJJIL = SystemClock.elapsedRealtime();
        if (!z) {
            C786410Ut5.LJLIIL(LiveBeingAtConfigSetting.getValue().flagReadThreshold, C473410IhP.LIZ(), this.LJJJJLL);
            return;
        }
        LLLILZJ();
    }
}
