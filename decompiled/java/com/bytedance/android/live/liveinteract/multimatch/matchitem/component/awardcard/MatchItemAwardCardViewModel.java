package com.bytedance.android.live.liveinteract.multimatch.matchitem.component.awardcard;

import X.C001A;
import X.C1124870fNV;
import X.C1133830fbx;
import X.C1144540ftE;
import X.C1144580ftI;
import X.C1144600ftK;
import X.C11JF;
import X.C1559260qg8;
import X.C20441214yg;
import X.C2188811AlT;
import X.C473410IhP;
import X.C500260Jjc;
import X.C776250Uch;
import X.EnumC964170bCJ;
import X.InterfaceC0148002o;
import Y.ARunnableS117S0100000_17;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.match.business.event.BattleIsCurrentWinChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleItemCardAwardChannel;
import com.bytedance.android.live.liveinteract.match.business.event.BattleStateChannel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.model.message.AwardCardNotice;
import com.bytedance.android.livesdk.model.message.LinkMicBattleItemCard;
import com.bytedance.android.livesdk.model.message.common.Text;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleBaseUserInfo;
import com.bytedance.android.livesdkapi.depend.model.live.match.BattleUserInfo;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.data.IMessage;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.ugc.live.sdk.message.interfaces.OnMessageListener;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS127S1200000_11;
import kotlin.jvm.internal.AwS596S0100000_17;
import kotlin.text.a0;

/* JADX INFO: loaded from: classes18.dex */
public final class MatchItemAwardCardViewModel extends AssemViewModel<C1144540ftE> implements OnMessageListener {
    public IMessageManager LL;
    public Room LLILLJJLI;
    public boolean LLILLL;
    public DataChannel LLILZ;
    public long LLILZLL;
    public long LLIZ;
    public long LLIZLLLIL;
    public long LLJ;
    public boolean LLJI;
    public C11JF LLJILJILJ;
    public final C1559260qg8 LLILZIL = new C1559260qg8(new AwS127S1200000_11((AssemViewModel) this, (AssemViewModel<Object>) C1144600ftK.class, (Class<Object>) null, (String) 13), true);
    public int LLJIJIL = -1;
    public EnumC964170bCJ LLJILJIL = EnumC964170bCJ.NONE;
    public final ARunnableS117S0100000_17 LLJILLL = new ARunnableS117S0100000_17(this, 30);

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final InterfaceC0148002o defaultState() {
        return new C1144540ftE(0);
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel, androidx.lifecycle.ViewModel
    public final void onCleared() {
        C11JF c11jf;
        DataChannel dataChannel = this.LLILZ;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLILZ = null;
        this.LLJI = false;
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.removeMessageListener(this);
        }
        C473410IhP.LJ(this.LLJILLL);
        C11JF c11jf2 = this.LLJILJILJ;
        if (!C500260Jjc.LJJIJIIJIL(c11jf2 != null ? Boolean.valueOf(c11jf2.isDisposed()) : null) && (c11jf = this.LLJILJILJ) != null) {
            c11jf.dispose();
        }
        super.onCleared();
    }

    @Override // com.bytedance.assem.arch.viewModel.AssemViewModel
    public final void onPrepared() {
        super.onPrepared();
        this.LLILZ = ((C1144600ftK) this.LLILZIL.getValue()).LLILLJJLI;
        this.LLILLL = ((C1144600ftK) this.LLILZIL.getValue()).LL;
        DataChannel dataChannel = this.LLILZ;
        this.LL = dataChannel != null ? (IMessageManager) dataChannel.gg0(C776250Uch.class) : null;
        DataChannel dataChannel2 = this.LLILZ;
        this.LLILLJJLI = dataChannel2 != null ? (Room) dataChannel2.gg0(RoomChannel.class) : null;
        IMessageManager iMessageManager = this.LL;
        if (iMessageManager != null) {
            iMessageManager.addMessageListener(C001A.LINK_MIC_BATTLE_ITEM_CARD.getIntType(), this);
        }
        DataChannel dataChannel3 = this.LLILZ;
        if (dataChannel3 != null) {
            dataChannel3.CQ2(BattleIsCurrentWinChannel.class, this, new AwS596S0100000_17(this, 43));
            dataChannel3.CQ2(BattleStateChannel.class, this, new AwS596S0100000_17(this, 44));
        }
    }

    @Override // com.ss.ugc.live.sdk.message.interfaces.OnMessageListener
    public final void onMessage(IMessage iMessage) {
        AwardCardNotice awardCardNotice;
        Text text;
        String strLIZIZ;
        Long l;
        if (iMessage == null || !(iMessage instanceof LinkMicBattleItemCard)) {
            return;
        }
        LinkMicBattleItemCard linkMicBattleItemCard = (LinkMicBattleItemCard) iMessage;
        if (linkMicBattleItemCard.msgType != 4 || (awardCardNotice = linkMicBattleItemCard.awardCardNotice) == null || (text = awardCardNotice.displayContent) == null) {
            return;
        }
        String str = text.defaultPattern;
        String str2 = text.key;
        if (!TextUtils.isEmpty(str2)) {
            C1124870fNV.LIZJ().getClass();
            strLIZIZ = C1124870fNV.LIZIZ(str2);
        } else {
            strLIZIZ = null;
        }
        ArrayList arrayList = new ArrayList();
        List<BattleUserInfo> list = awardCardNotice.awardedUsers;
        if (list != null) {
            ArrayList arrayList2 = new ArrayList();
            for (BattleUserInfo battleUserInfo : list) {
                if (battleUserInfo.user != null) {
                    arrayList2.add(battleUserInfo);
                }
            }
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                BattleBaseUserInfo battleBaseUserInfo = ((BattleUserInfo) it2.next()).user;
                if (battleBaseUserInfo != null && (l = battleBaseUserInfo.userId) != null) {
                    arrayList.add(Long.valueOf(l.longValue()));
                }
            }
        }
        if (!TextUtils.isEmpty(strLIZIZ)) {
            str = strLIZIZ;
        }
        Text text2 = awardCardNotice.displayContent;
        if (text2 != null) {
            Spannable spannableLJIILJJIL = C1133830fbx.LJIILJJIL(str, text2, null);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Award Content = ");
            sbLIZ.append((Object) spannableLJIILJJIL);
            C20441214yg.LJIIIIZZ(C2188811AlT.LIZIZ(sbLIZ));
            if (spannableLJIILJJIL != null && !a0.LJJJIL(spannableLJIILJJIL)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("pkState = ");
                sbLIZ2.append(this.LLJILJIL);
                C20441214yg.LJIIIZ("MatchItemAwardVM", C2188811AlT.LIZIZ(sbLIZ2));
                DataChannel dataChannel = this.LLILZ;
                if (dataChannel != null) {
                    dataChannel.zW(BattleItemCardAwardChannel.class, new C1144580ftI(new SpannableString(spannableLJIILJJIL), arrayList, linkMicBattleItemCard.awardReason));
                    return;
                }
                return;
            }
            return;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }
}
