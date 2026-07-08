package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.AbstractC20356314kz;
import X.AbstractC928510aGn;
import X.C01EI;
import X.C1697810uHb;
import X.C1850730yGF;
import X.C19322110iZ;
import X.C1AZW;
import X.C20357914lF;
import X.C20361214lm;
import X.C20361314ln;
import X.C20365714mV;
import X.C20424814w2;
import X.C20441214yg;
import X.C259800zU;
import X.C334801Rq;
import X.C497740JfY;
import X.C500260Jjc;
import X.C5183020f;
import X.C748880TZe;
import X.C766270U4b;
import X.C921170a4x;
import X.C924210a9r;
import X.C924220a9s;
import X.C930480aJy;
import X.C937280aUw;
import X.C941700ac4;
import X.C946060aj6;
import X.C948450amx;
import X.InterfaceC20354714kj;
import X.InterfaceC423301kl;
import X.InterfaceC927690aFT;
import X.InterfaceC941720ac6;
import X.InterfaceC953350aur;
import X.InterfaceC979390bar;
import android.content.Context;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.android.live.liveinteract.multiguestv3.main.ability.LinkMicAbilityManager;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.event.CountDownForAllV2StatusChangeEvent;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.common.PlaybookUtilKt;
import com.bytedance.android.live.liveinteract.multiguestv3.service.usermanage.anchor.AnchorBusinessUserManager;
import com.bytedance.android.live.liveinteract.multilive.model.MultiLiveGuestInfoList;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.model.CountDownForAllEntryClickEvent;
import com.bytedance.android.livesdk.model.CountdownForAllConfigWrapper;
import com.bytedance.android.livesdk.util.PlayEntityUtilKt;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import kotlin.jvm.internal.AwS224S0300000_15;
import kotlin.jvm.internal.AwS259S0300000_15;
import kotlin.jvm.internal.AwS293S0300000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.AwS629S0100000_15;
import kotlin.text.a0;
import webcast.data.multi_guest_play.CountdownForAllConfig;

/* JADX INFO: loaded from: classes16.dex */
public final class CountDownForAllEntity extends AbstractC20356314kz {
    public final C20357914lF LLJJJJJIL = new C20357914lF("count_down_for_all", 0, 35600000, 0, C1697810uHb.LJIIJJI("countdown_for_all_ongoing", "countdown_for_all_reach_goal_one", "countdown_for_all_finished", "never"), "countdown_for_all_ongoing", 4080);

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLL() {
        LinkMicAbilityManager.LJIIIZ.getClass();
        InterfaceC941720ac6 interfaceC941720ac6LIZIZ = C941700ac4.LIZIZ();
        return C500260Jjc.LJJJI(interfaceC941720ac6LIZIZ != null ? Boolean.valueOf(interfaceC941720ac6LIZIZ.LJIIJ("count_down_for_all")) : null);
    }

    @Override // X.AbstractC20356314kz
    public final C20357914lF LJJJIL() {
        return this.LLJJJJJIL;
    }

    public static CountdownForAllConfigWrapper LJJLIIIJILLIZJL(String str) {
        return (CountdownForAllConfigWrapper) C937280aUw.LIZJ(CountdownForAllConfigWrapper.class, str, new CountdownForAllConfigWrapper());
    }

    @Override // X.AbstractC20356314kz
    public final boolean LJJJJLI(String str) {
        C930480aJy.LIZ.getClass();
        if (!C930480aJy.LJIJ() && !C500260Jjc.LJJIL()) {
            return C924210a9r.LIZIZ();
        }
        return C924210a9r.LIZ();
    }

    @Override // X.AbstractC20356314kz
    public final void LJJLI(C20361214lm c20361214lm) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.BQ2(LJJJJ(), CountDownForAllV2StatusChangeEvent.class, new AwS594S0100000_15(this, 398));
        }
    }

    public final boolean LJJLIIIJ(Object obj) {
        Boolean boolValueOf;
        InterfaceC927690aFT interfaceC927690aFTLIZ = C924220a9s.LIZ();
        if (interfaceC927690aFTLIZ != null) {
            boolValueOf = Boolean.valueOf(interfaceC927690aFTLIZ.LIZJ());
        } else {
            boolValueOf = null;
        }
        return C500260Jjc.LJJJI(boolValueOf);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJJIJL(C20361214lm c20361214lm, boolean z) {
        CountdownForAllConfigWrapper countdownForAllConfigWrapperLJJLIIIJILLIZJL;
        AbstractC928510aGn<LinkPlayerInfo, MultiLiveGuestInfoList> abstractC928510aGnLJJJLZIJ;
        String str = c20361214lm.LJI;
        if (str != null && !a0.LJJJIL(str)) {
            countdownForAllConfigWrapperLJJLIIIJILLIZJL = LJJLIIIJILLIZJL(str);
        } else {
            countdownForAllConfigWrapperLJJLIIIJILLIZJL = null;
        }
        if (countdownForAllConfigWrapperLJJLIIIJILLIZJL == null) {
            return false;
        }
        AnchorBusinessUserManager anchorBusinessUserManager = (AnchorBusinessUserManager) C948450amx.LIZIZ.LJIIJJI("MULTI_GUEST_V3_ANCHOR_USER_MANAGER");
        if ((anchorBusinessUserManager == null || (abstractC928510aGnLJJJLZIJ = anchorBusinessUserManager.LJJJLZIJ()) == null || C921170a4x.LIZJ(abstractC928510aGnLJJJLZIJ) <= 0) && !z) {
            return false;
        }
        return true;
    }

    @Override // X.AbstractC20356314kz
    public final C20361314ln LJJJLIIL(C20424814w2 c20424814w2, int i) {
        C20365714mV c20365714mV;
        CountdownForAllConfigWrapper countdownForAllConfigWrapperLJJLIIIJILLIZJL = LJJLIIIJILLIZJL(c20424814w2.LJII);
        ArrayList arrayList = new ArrayList();
        long j = countdownForAllConfigWrapperLJJLIIIJILLIZJL.duration;
        if (j > 0) {
            arrayList.add(C497740JfY.LJIJJ(2131854127, String.valueOf(j / ((long) 60))));
        }
        long j2 = countdownForAllConfigWrapperLJJLIIIJILLIZJL.targetScore;
        if (j2 > 0) {
            arrayList.add(C497740JfY.LJIJJ(2131854128, C1850730yGF.LJFF(j2)));
        }
        if (!a0.LJJJIL(countdownForAllConfigWrapperLJJLIIIJILLIZJL.resourceId)) {
            c20365714mV = new C20365714mV(null, 0, 0.0f, new C5183020f(countdownForAllConfigWrapperLJJLIIIJILLIZJL, 161), countdownForAllConfigWrapperLJJLIIIJILLIZJL.resourceId, null, 0.0f, 207);
        } else {
            c20365714mV = null;
        }
        return new C20361314ln(C497740JfY.LJIJI(2131853920), C497740JfY.LJIJI(2131853920), R.attr.dli, R.attr.dli, arrayList, c20365714mV, i, null, false, null, 3968);
    }

    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final boolean LJIJJ(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, boolean z) {
        DataChannel dataChannel = this.LLJ;
        if (dataChannel == null) {
            return false;
        }
        C930480aJy c930480aJy = C930480aJy.LIZ;
        AwS259S0300000_15 awS259S0300000_15 = new AwS259S0300000_15(this, c20361214lm, interfaceC20354714kj, 8);
        c930480aJy.getClass();
        return C930480aJy.LJJJI(dataChannel, awS259S0300000_15, z);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [T, X.15Dq, com.bytedance.android.live.liveinteract.multiguestv3.main.play.countdownforallv2.common.ui.settings.CountDownForAllV2SettingsDialog] */
    @Override // X.AbstractC20356314kz, com.bytedance.android.livesdk.entity.PlayRule
    public final void LJJIIZ(final C20361214lm c20361214lm, final InterfaceC979390bar interfaceC979390bar, LifecycleOwner lifecycleOwner) {
        CountdownForAllConfigWrapper countdownForAllConfigWrapper;
        FragmentManager fragmentManager;
        super.LJJIIZ(c20361214lm, interfaceC979390bar, lifecycleOwner);
        String str = c20361214lm.LJI;
        if (str != null) {
            if (a0.LJJJIL(str)) {
                countdownForAllConfigWrapper = new CountdownForAllConfigWrapper();
                countdownForAllConfigWrapper.duration = 180L;
                countdownForAllConfigWrapper.targetScore = 0L;
                countdownForAllConfigWrapper.resourceId = "";
            } else {
                countdownForAllConfigWrapper = (CountdownForAllConfigWrapper) C937280aUw.LIZJ(CountdownForAllConfigWrapper.class, str, new CountdownForAllConfigWrapper());
            }
        } else {
            countdownForAllConfigWrapper = null;
        }
        try {
            final C259800zU c259800zU = new C259800zU();
            InterfaceC423301kl interfaceC423301kl = new InterfaceC423301kl() { // from class: X.0baV
                public boolean LIZ;

                @Override // X.InterfaceC423301kl
                public final void LIZ() {
                    InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                    if (interfaceC979390bar2 != null) {
                        interfaceC979390bar2.LIZ(false);
                    }
                }

                @Override // X.InterfaceC423301kl
                public final void dismiss() {
                    InterfaceC979390bar interfaceC979390bar2;
                    if (this.LIZ || (interfaceC979390bar2 = interfaceC979390bar) == null) {
                        return;
                    }
                    interfaceC979390bar2.LIZJ();
                }

                @Override // X.InterfaceC423301kl
                public final void LIZIZ(CountdownForAllConfig countdownForAllConfig, int i, C334801Rq c334801Rq) {
                    String json = GsonProtectorUtils.toJson(C19748512Ol.LIZJ, countdownForAllConfig);
                    InterfaceC979390bar interfaceC979390bar2 = interfaceC979390bar;
                    if (interfaceC979390bar2 != null) {
                        interfaceC979390bar2.LJI(c20361214lm.LIZIZ, json, true);
                    }
                    this.LIZ = true;
                    CountDownForAllV2SettingsDialog countDownForAllV2SettingsDialog = c259800zU.element;
                    if (countDownForAllV2SettingsDialog != null) {
                        countDownForAllV2SettingsDialog.close(1);
                    }
                }
            };
            DataChannel dataChannel = this.LLJ;
            if (dataChannel != null && (fragmentManager = (FragmentManager) dataChannel.gg0(C748880TZe.class)) != null) {
                ?? countDownForAllV2SettingsDialog = new CountDownForAllV2SettingsDialog(this.LLJ, 1, "playbook_edit", countdownForAllConfigWrapper, interfaceC423301kl, null);
                c259800zU.element = countDownForAllV2SettingsDialog;
                C19322110iZ.LJFF(fragmentManager, countDownForAllV2SettingsDialog, "CountDownForAllEntity", null, 0);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C20441214yg.LJI("CountDownForAllEntity", e);
        }
    }

    @Override // X.AbstractC20356314kz
    public final void LJJIZ(C20361214lm c20361214lm, String str, C334801Rq c334801Rq, InterfaceC953350aur interfaceC953350aur, Context context) {
        CountdownForAllConfigWrapper countdownForAllConfigWrapperLJJLIIIJILLIZJL;
        if (LJJLIIIJ(null)) {
            interfaceC953350aur.LIZ(false, true);
            return;
        }
        String str2 = c20361214lm.LJI;
        if (str2 != null && !a0.LJJJIL(str2) && (countdownForAllConfigWrapperLJJLIIIJILLIZJL = LJJLIIIJILLIZJL(str2)) != null) {
            CountdownForAllConfig countdownForAllConfig = new CountdownForAllConfig();
            countdownForAllConfig.duration = countdownForAllConfigWrapperLJJLIIIJILLIZJL.duration;
            countdownForAllConfig.targetScore = countdownForAllConfigWrapperLJJLIIIJILLIZJL.targetScore;
            countdownForAllConfig.resourceId = countdownForAllConfigWrapperLJJLIIIJILLIZJL.resourceId;
            InterfaceC927690aFT interfaceC927690aFTLIZ = C924220a9s.LIZ();
            if (interfaceC927690aFTLIZ != null) {
                interfaceC927690aFTLIZ.LJI(countdownForAllConfig, c334801Rq, new AwS629S0100000_15(interfaceC953350aur, 25));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC20356314kz
    public final void LJJJLL(C20361214lm c20361214lm, InterfaceC20354714kj interfaceC20354714kj, LifecycleOwner lifecycleOwner, String str, Long l, String str2, String str3) {
        CountdownForAllConfigWrapper countdownForAllConfigWrapperLJJLIIIJILLIZJL;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = interfaceC20354714kj;
        if (lifecycleOwner != null) {
            PlaybookUtilKt.LJJII(lifecycleOwner, new AwS559S0100000_15(c259800zU, (C259800zU<InterfaceC20354714kj>) 314));
        }
        if (LJJLIIIJ(null)) {
            C1AZW.LJIILL(C01EI.LIZ(245, this.LLJJJJJIL.LIZ), "toastOnGoing", null, null);
            C766270U4b.LIZLLL(2131854098);
        }
        String str4 = c20361214lm.LJI;
        if (str4 == null || a0.LJJJIL(str4)) {
            countdownForAllConfigWrapperLJJLIIIJILLIZJL = null;
        } else {
            countdownForAllConfigWrapperLJJLIIIJILLIZJL = LJJLIIIJILLIZJL(str4);
        }
        PlayEntityUtilKt.LJFF(this, c20361214lm, (InterfaceC20354714kj) c259800zU.element, lifecycleOwner);
        DataChannel dataChannel = this.LLJ;
        if (dataChannel != null) {
            dataChannel.zW(CountDownForAllEntryClickEvent.class, new C946060aj6(countdownForAllConfigWrapperLJJLIIIJILLIZJL, str3, new AwS293S0300000_15(this, (CountDownForAllEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 3), null, new AwS559S0100000_15(this, 315), new AwS224S0300000_15(this, (CountDownForAllEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 8), null, new AwS224S0300000_15(this, (CountDownForAllEntity) c20361214lm, (C20361214lm) c259800zU, (C259800zU<InterfaceC20354714kj>) 9), !LJJLIIIJ(null), this.LLIZ, null, new C334801Rq(str, l, str2), 4760));
        }
    }
}
