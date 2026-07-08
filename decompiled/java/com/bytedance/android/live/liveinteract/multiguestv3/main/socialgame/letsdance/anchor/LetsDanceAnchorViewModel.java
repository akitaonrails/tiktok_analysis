package com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.anchor;

import X.C0UI0;
import X.C1161920gLG;
import X.C1697810uHb;
import X.C20441214yg;
import X.C2188811AlT;
import X.C465900IOu;
import X.C784440Upu;
import X.C915980Zwa;
import X.C945730aiZ;
import X.C947110akn;
import X.EnumC947020ake;
import X.EnumC947440alK;
import X.InterfaceC769000UEo;
import X.InterfaceC934710aQn;
import X.InterfaceC954180awC;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.liveinteract.multiguestv3.main.common.MultiGuestDataHolder;
import com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.model.MultiLiveAnchorMuteVideoEvent;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MixStreamWaterMarkTask;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestSocialGameLetsDanceSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tiktok.kmp.live.socialgamebusinessapi.event.MultiLetsDanceOpenRankPageEvent;
import java.util.Collections;
import java.util.List;
import org.json.JSONException;

/* JADX INFO: loaded from: classes16.dex */
public final class LetsDanceAnchorViewModel extends LetsDanceBaseViewModel {
    public final List<EnumC947020ake> LLJJIJIL = C1697810uHb.LJIIJJI(EnumC947020ake.GAME_MATERIAL, EnumC947020ake.SCORE_EFFECT, EnumC947020ake.LAYOUT_RESOURCE);

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel
    public final String getTag() {
        return "LetsDanceAnchorViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel
    public final void QQ2() {
        MultiGuestDataHolder multiGuestDataHolder = this.dataHolder;
        if (multiGuestDataHolder != null) {
            multiGuestDataHolder.LJJIIZI(true);
        }
        MultiGuestDataHolder multiGuestDataHolder2 = this.dataHolder;
        if (multiGuestDataHolder2 != null) {
            multiGuestDataHolder2.LJIILIIL = 1;
        }
        C784440Upu.LIZ().LIZIZ(new C465900IOu(40));
        DataChannel dataChannel = this.LL;
        if (dataChannel != null) {
            dataChannel.LC0(MultiLiveAnchorMuteVideoEvent.class, new C0UI0(true, "business_mute_click_list_panel"));
        }
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel
    public final InterfaceC769000UEo wQ2() {
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        if (iEffectService != null) {
            return iEffectService.baseComposerManager();
        }
        return null;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel
    public final List<EnumC947020ake> BQ2() {
        return this.LLJJIJIL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.socialgame.letsdance.base.LetsDanceBaseViewModel
    public final void FQ2(EnumC947440alK enumC947440alK, EnumC947440alK enumC947440alK2) throws JSONException {
        String strZQ2;
        super.FQ2(enumC947440alK, enumC947440alK2);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onGamePhaseChanged ");
        sbLIZ.append(enumC947440alK);
        sbLIZ.append(" -> ");
        sbLIZ.append(enumC947440alK2);
        C20441214yg.LIZIZ("LetsDanceAnchorViewModel", C2188811AlT.LIZIZ(sbLIZ));
        int i = C947110akn.LIZ[enumC947440alK2.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4 && enumC947440alK != null && enumC947440alK != EnumC947440alK.NONE) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("onGamePhaseChanged ");
                        sbLIZ2.append(enumC947440alK);
                        sbLIZ2.append(" -> ");
                        sbLIZ2.append(enumC947440alK2);
                        sbLIZ2.append(", Quit Game!");
                        C20441214yg.LIZIZ("LetsDanceAnchorViewModel", C2188811AlT.LIZIZ(sbLIZ2));
                        MQ2(false);
                        OQ2();
                        IQ2();
                        JQ2();
                        PQ2();
                        InterfaceC934710aQn.Nc.LJFF(Boolean.FALSE);
                        InterfaceC954180awC interfaceC954180awCLLJLL = C915980Zwa.LJIIIIZZ().LLJLL();
                        if (interfaceC954180awCLLJLL != null) {
                            interfaceC954180awCLLJLL.LJLLI(true);
                        }
                        if (enumC947440alK == EnumC947440alK.PREPARING) {
                            C945730aiZ c945730aiZ = C945730aiZ.LIZ;
                            DataChannel dataChannel = this.LL;
                            Long l = this.LLJ;
                            Long l2 = this.LLJI;
                            c945730aiZ.getClass();
                            C945730aiZ.LIZLLL(dataChannel, "mode_end", null, l, l2);
                            return;
                        }
                        String strZQ22 = zQ2();
                        if (strZQ22 == null) {
                            return;
                        }
                        C945730aiZ c945730aiZ2 = C945730aiZ.LIZ;
                        DataChannel dataChannel2 = this.LL;
                        Long l3 = this.LLJ;
                        Long l4 = this.LLJI;
                        c945730aiZ2.getClass();
                        C945730aiZ.LIZLLL(dataChannel2, "play_end", strZQ22, l3, l4);
                        return;
                    }
                    return;
                }
                OQ2();
                PQ2();
                KQ2(1, "");
                JQ2();
                DataChannel dataChannel3 = this.LL;
                if (dataChannel3 != null) {
                    dataChannel3.FQ2(MultiLetsDanceOpenRankPageEvent.class);
                }
                if (enumC947440alK == null || (strZQ2 = zQ2()) == null) {
                    return;
                }
                C945730aiZ c945730aiZ3 = C945730aiZ.LIZ;
                DataChannel dataChannel4 = this.LL;
                Long l5 = this.LLJ;
                Long l6 = this.LLJI;
                c945730aiZ3.getClass();
                C945730aiZ.LIZLLL(dataChannel4, "play_end", strZQ2, l5, l6);
                return;
            }
            if (enumC947440alK != null) {
                return;
            }
            MQ2(true);
            return;
        }
        MQ2(true);
        String str = MultiGuestSocialGameLetsDanceSetting.config().mainSpotWaterMaskUrl;
        InterfaceC954180awC interfaceC954180awCLLJLL2 = C915980Zwa.LJIIIIZZ().LLJLL();
        if (interfaceC954180awCLLJLL2 == null) {
            return;
        }
        interfaceC954180awCLLJLL2.LLJILJILJ(Collections.singletonList(new MixStreamWaterMarkTask(1L, yQ2(), str, 5, null)), true);
    }
}
