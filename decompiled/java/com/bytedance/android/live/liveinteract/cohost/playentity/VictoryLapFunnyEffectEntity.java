package com.bytedance.android.live.liveinteract.cohost.playentity;

import X.AbstractC20356314kz;
import X.C1161920gLG;
import X.C19322110iZ;
import X.C19748512Ol;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20365714mV;
import X.C20424814w2;
import X.C20441214yg;
import X.C259800zU;
import X.C497740JfY;
import X.C748880TZe;
import X.C937280aUw;
import X.C946060aj6;
import X.InterfaceC20354714kj;
import X.InterfaceC768500UCq;
import X.InterfaceC768510UCr;
import X.InterfaceC979390bar;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.design.view.sheet.LiveSheetFragment;
import com.bytedance.android.live.effect.api.IEffectService;
import com.bytedance.android.live.effect.sticker.LivePreviewableEffectSheet;
import com.bytedance.android.live.liveinteract.cohost.playentity.VictoryLapFunnyEffectEntity;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchVictoryLapFunnyEffectPanelSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchVictoryLapFunnyEffectTabSetting;
import com.bytedance.android.livesdk.model.PreviewEffect;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.zhiliaoapp.musically.R;
import java.util.Collections;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS99S1200000_15;
import kotlin.text.a0;
import webcast.data.multi_guest_play.Playbook;

/* JADX INFO: loaded from: classes16.dex */
public final class VictoryLapFunnyEffectEntity extends AbstractC20356314kz {
    public LiveEffect LLJJJJJIL;
    public String LLJJJJLIIL;
    public final C20357914lF LLJJL = new C20357914lF("victory_lap_funny_effect", 0, 39000003, 1, Collections.singletonList("always_true"), null, 26608);

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJL;
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        boolean z;
        PreviewEffect previewEffect;
        IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
        String str = c20424814w2.LJII;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        C20365714mV c20365714mV = null;
        if (z) {
            previewEffect = new PreviewEffect("7262038681995710978", "");
            previewEffect.resourceId = "";
        } else {
            previewEffect = (PreviewEffect) C937280aUw.LIZJ(PreviewEffect.class, c20424814w2.LJII, new PreviewEffect("7262038681995710978", ""));
        }
        String str2 = previewEffect.resourceId;
        this.LLJJJJLIIL = str2;
        if (true ^ a0.LJJJIL(str2)) {
            c20365714mV = new C20365714mV(null, 0, 0.0f, new AwS99S1200000_15(iEffectService, previewEffect, str2, 5), str2, str2, 0.0f, 143);
        }
        return new C20361314ln(C497740JfY.LJIJI(2131842712), C497740JfY.LJIJI(2131842712), R.attr.dm9, R.attr.dm9, null, c20365714mV, i, null, false, null, 3984);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(C20361214lm c20361214lm, InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        interfaceC979390bar.LJI(c20361214lm.LIZIZ, GsonProtectorUtils.toJson(C19748512Ol.LIZJ, new PreviewEffect("7262038681995710978", "")), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        PreviewEffect previewEffect;
        FragmentManager fragmentManager;
        Object previewableEffectPanel;
        LiveSheetFragment liveSheetFragment;
        String str4;
        C20441214yg.LIZIZ("VictoryLapFunnyEffectEntity", "Capability clicked");
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlaybookUtilKt.LJJII(lifecycleOwner, new AwS559S0100000_15(c259800zU, (C259800zU<InterfaceC20354714kj>) 103));
        }
        String str5 = c20361214lm.LJI;
        if (str5 != null && !a0.LJJJIL(str5)) {
            previewEffect = (PreviewEffect) C937280aUw.LIZJ(PreviewEffect.class, str5, new PreviewEffect("7262038681995710978", ""));
        } else {
            previewEffect = null;
        }
        final C946060aj6 c946060aj6 = new C946060aj6(previewEffect, str3, new AwS293S0300000_15(this, (VictoryLapFunnyEffectEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 1), null, new AwS559S0100000_15(this, 104), new AwS224S0300000_15(this, (VictoryLapFunnyEffectEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 4), null, null, false, this.LLIZ, null, null, 14232);
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
            IEffectService iEffectService = (IEffectService) C1161920gLG.LIZJ(IEffectService.class);
            if (iEffectService != null) {
                String strLJIJI = C497740JfY.LJIJI(2131853681);
                String strLJIJI2 = C497740JfY.LJIJI(2131853680);
                String value = LiveMatchVictoryLapFunnyEffectPanelSetting.INSTANCE.getValue();
                String value2 = LiveMatchVictoryLapFunnyEffectTabSetting.INSTANCE.getValue();
                if (previewEffect != null) {
                    str4 = previewEffect.resourceId;
                } else {
                    str4 = null;
                }
                previewableEffectPanel = iEffectService.getPreviewableEffectPanel(strLJIJI, strLJIJI2, value, value2, str4);
                if (previewableEffectPanel != null) {
                    ((LivePreviewableEffectSheet) previewableEffectPanel).LLLIIIL = new InterfaceC768510UCr() { // from class: X.0bZY
                        @Override // X.InterfaceC768510UCr
                        public final void LIZ(LiveEffect liveEffect) {
                            String resourceId;
                            long j;
                            this.LIZ.LLJJJJJIL = liveEffect;
                            if (liveEffect == null || (resourceId = liveEffect.getResourceId()) == null) {
                                resourceId = "";
                            }
                            VictoryLapFunnyEffectEntity victoryLapFunnyEffectEntity = this.LIZ;
                            Playbook playbook = victoryLapFunnyEffectEntity.LLJJ;
                            if (playbook != null) {
                                j = playbook.playbookId;
                            } else {
                                j = 0;
                            }
                            C974350bSj.LJI(j, victoryLapFunnyEffectEntity.LLJ, "preview", resourceId);
                        }
                    };
                    ((LivePreviewableEffectSheet) previewableEffectPanel).LLLIIIIL = new InterfaceC768500UCq() { // from class: X.0bZX
                        @Override // X.InterfaceC768500UCq
                        public final void LIZ(EnumC768480UCo enumC768480UCo) {
                            PreviewEffect previewEffect2;
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("Panel dismissed, cause: ");
                            sbLIZ.append(enumC768480UCo);
                            C20441214yg.LIZIZ("VictoryLapFunnyEffectEntity", C2188811AlT.LIZIZ(sbLIZ));
                            int i = C768490UCp.LIZ[enumC768480UCo.ordinal()];
                            long j = 0;
                            if (i != 1) {
                                if (i != 2) {
                                    if (i == 3) {
                                        LiveEffect liveEffect = this.LIZ.LLJJJJJIL;
                                        if (liveEffect != null) {
                                            previewEffect2 = new PreviewEffect(liveEffect.getResourceId(), liveEffect.getName());
                                        } else {
                                            previewEffect2 = new PreviewEffect("", "");
                                        }
                                        c946060aj6.LIZIZ().LIZ(previewEffect2);
                                    }
                                } else {
                                    VictoryLapFunnyEffectEntity victoryLapFunnyEffectEntity = this.LIZ;
                                    Playbook playbook = victoryLapFunnyEffectEntity.LLJJ;
                                    if (playbook != null) {
                                        j = playbook.playbookId;
                                    }
                                    C974350bSj.LJI(j, victoryLapFunnyEffectEntity.LLJ, "back", "");
                                }
                            } else {
                                VictoryLapFunnyEffectEntity victoryLapFunnyEffectEntity2 = this.LIZ;
                                Playbook playbook2 = victoryLapFunnyEffectEntity2.LLJJ;
                                if (playbook2 != null) {
                                    j = playbook2.playbookId;
                                }
                                C974350bSj.LJI(j, victoryLapFunnyEffectEntity2.LLJ, "close", "");
                            }
                            c946060aj6.LIZIZ().LIZIZ(1);
                        }
                    };
                }
            } else {
                previewableEffectPanel = null;
            }
            if ((previewableEffectPanel instanceof LiveSheetFragment) && (liveSheetFragment = (LiveSheetFragment) previewableEffectPanel) != null) {
                if (C19322110iZ.LJFF(fragmentManager, liveSheetFragment, this.LLJJL.LIZ, null, 0) > 0) {
                    PlayEntityUtilKt.LJII(this, 2, c20361214lm, (InterfaceC20354714kj) c259800zU.element, true);
                } else {
                    PlayEntityUtilKt.LJI(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, null, null, 0L, 56);
                }
            }
        }
    }
}
