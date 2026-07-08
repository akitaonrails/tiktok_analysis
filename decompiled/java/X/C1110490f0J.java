package X;

import Y.AObjectS360S0100000_17;
import Y.AObjectS392S0100000_17;
import android.text.SpannableStringBuilder;
import com.bytedance.android.live.base.model.emoji.EmoteModel;
import com.bytedance.android.live.base.model.emoji.EmoteWithIndex;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.model.message.WhisperMessage;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS596S0100000_17;

/* JADX INFO: renamed from: X.0f0J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1110490f0J extends AbstractC1110160ezm<WhisperMessage> {
    public volatile CharSequence LJJIJIIJIL;
    public SpannableStringBuilder LJJIJIL;
    public final AObjectS392S0100000_17 LJJIJL;
    public final AwS596S0100000_17 LJJIJLIJ;
    public final AObjectS360S0100000_17 LJJIL;

    @Override // X.AbstractC1110800f0o, X.AbstractC1110790f0n, X.InterfaceC1112680f3q
    public final boolean LJJJJ() {
        return false;
    }

    @Override // X.AbstractC1110800f0o
    public final boolean LLJL() {
        return true;
    }

    @Override // X.AbstractC1110160ezm
    public final boolean LLLIIIIL() {
        return true;
    }

    @Override // X.AbstractC1110790f0n
    public final CharSequence LLFF() {
        String str;
        String str2;
        if (!LLLIL()) {
            Text text = ((WhisperMessage) this.LJIL).content;
            return (text == null || (str = text.defaultPattern) == null) ? "" : str;
        }
        SpannableStringBuilder spannableStringBuilder = this.LJJIJIL;
        if (spannableStringBuilder != null) {
            return spannableStringBuilder;
        }
        Text text2 = ((WhisperMessage) this.LJIL).content;
        if (text2 == null || (str2 = text2.defaultPattern) == null) {
            str2 = "";
        }
        String strLIZIZ = C1834150xpV.LIZIZ(str2);
        String str3 = strLIZIZ != null ? strLIZIZ : "";
        List<WhisperMessage.EmoteWithIndex> list = ((WhisperMessage) this.LJIL).f316emotes;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
        for (WhisperMessage.EmoteWithIndex emoteWithIndex : list) {
            EmoteWithIndex emoteWithIndex2 = new EmoteWithIndex();
            emoteWithIndex2.emoteModel = emoteWithIndex.emote;
            emoteWithIndex2.index = (int) emoteWithIndex.index;
            arrayList.add(emoteWithIndex2);
        }
        if (!((WhisperMessage) this.LJIL).f316emotes.isEmpty()) {
            boolean z = LLIIIILZ().LJI;
            Room room = LLIIIILZ().LJII;
            if (C1110350f05.LIZIZ()) {
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_sub_live_room_emote_messsage_load");
                c474500IjALIZ.LJJII("rendered", "type");
                c474500IjALIZ.LJJII(Integer.valueOf(((WhisperMessage) this.LJIL).f316emotes.size()), "emote_count");
                c474500IjALIZ.LJJII(z ? "1" : CardStruct.IStatusCode.DEFAULT, "is_anchor");
                c474500IjALIZ.LJJII(this.LIZJ ? "1" : CardStruct.IStatusCode.DEFAULT, "is_from_self");
                int size = ((WhisperMessage) this.LJIL).f316emotes.size();
                C1110390f09 c1110390f09 = C1110390f09.LIZ;
                c474500IjALIZ.LJJII(Integer.valueOf(size - C1110390f09.LIZIZ(arrayList)), "failure_count");
                c474500IjALIZ.LJJII("live_room_message_list", "show_entrance");
                c474500IjALIZ.LIZ();
            }
            if (room != null) {
                Iterator<WhisperMessage.EmoteWithIndex> it2 = ((WhisperMessage) this.LJIL).f316emotes.iterator();
                while (it2.hasNext()) {
                    EmoteModel emoteModel = it2.next().emote;
                    if (emoteModel != null && emoteModel.emoteScene == 1) {
                        LLLIILIL("show", emoteModel, room);
                    }
                }
            }
        }
        C1110390f09 c1110390f092 = C1110390f09.LIZ;
        return C1110390f09.LIZ(arrayList, EnumC1110450f0F.PUBLICSCREEN_MESSAGE_TYPE, str3, LLIIIILZ().LIZ.getResources(), this.LJJIJLIJ, this.LJJIJL, this.LJJIL, LLIIIILZ().LIZIZ, false);
    }

    @Override // X.AbstractC1110160ezm
    public final String LLLII() {
        String str;
        Text text = ((WhisperMessage) this.LJIL).content;
        return (text == null || (str = text.defaultPattern) == null) ? "" : str;
    }

    @Override // X.AbstractC1110160ezm
    public final int LLLIIII() {
        return ((WhisperMessage) this.LJIL).f316emotes.size();
    }

    @Override // X.AbstractC1110160ezm
    public final void LLLIIL() {
        if (this.LJIL == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        int size = ((WhisperMessage) this.LJIL).f316emotes.size();
        for (int i = 0; i < size; i++) {
            EmoteModel emoteModel = ((WhisperMessage.EmoteWithIndex) ListProtector.get(((WhisperMessage) this.LJIL).f316emotes, i)).emote;
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

    @Override // X.InterfaceC1110010ezX, X.InterfaceC1133840fby
    public final User getUser() {
        return ((WhisperMessage) this.LJIL).user;
    }

    public static String LLLILZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C497740JfY.LJIJI(2131852194));
        sbLIZ.append(' ');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1110520f0M
    public final String LLJLLL() {
        return C497740JfY.LJIJI(2131852194);
    }

    public final boolean LLLIL() {
        User.EnigmaInfo enigmaInfo;
        return LLIILII() || LLIIL() || ((enigmaInfo = UserService.getInstance().user().LJIJJLI().enigmaInfo) != null && enigmaInfo.isEnigmaMaskOn);
    }

    @Override // X.AbstractC1110790f0n, X.InterfaceC1112060f2q
    public final CharSequence getContent() {
        this.LJJIJIIJIL = LLFZ() != null ? LLIZLLLIL() : LLFF();
        return this.LJJIJIIJIL;
    }

    public C1110490f0J(WhisperMessage whisperMessage) {
        super(whisperMessage);
        this.LJJIJL = new AObjectS392S0100000_17(this, 1);
        this.LJJIJLIJ = new AwS596S0100000_17(this, 23);
        this.LJJIL = new AObjectS360S0100000_17(this, 4);
    }

    @Override // X.AbstractC1110790f0n
    public final void LLJJIJI(CharSequence charSequence) {
        this.LJJIJIIJIL = charSequence;
    }

    public final void LLLILZJ(String str) {
        long id;
        DataChannel dataChannel = LLIIIILZ().LJIIIZ;
        if (dataChannel == null) {
            return;
        }
        User user = ((WhisperMessage) this.LJIL).user;
        if (user != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        String strValueOf = String.valueOf(id);
        String strValueOf2 = String.valueOf(this.LJIL.getMessageId());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_whisper_action_viewer");
        c474500IjALIZ.LJJII(C01CC.LIZIZ(dataChannel), "view_type");
        c474500IjALIZ.LJJII(strValueOf, "to_user_id");
        c474500IjALIZ.LJJII(strValueOf2, "to_msg_id");
        c474500IjALIZ.LJJII(C01CC.LIZ(strValueOf), "self_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }

    public final void LLLILZLLLI(String str) {
        long id;
        DataChannel dataChannel = LLIIIILZ().LJIIIZ;
        if (dataChannel == null) {
            return;
        }
        User user = ((WhisperMessage) this.LJIL).user;
        if (user != null) {
            id = user.getId();
        } else {
            id = 0;
        }
        String strValueOf = String.valueOf(id);
        String strValueOf2 = String.valueOf(this.LJIL.getMessageId());
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_enigma_whisper_click_viewer");
        c474500IjALIZ.LJJII(C01CC.LIZIZ(dataChannel), "view_type");
        c474500IjALIZ.LJJII(strValueOf, "to_user_id");
        c474500IjALIZ.LJJII(strValueOf2, "to_msg_id");
        c474500IjALIZ.LJJII(C01CC.LIZ(strValueOf), "self_type");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
    }
}
