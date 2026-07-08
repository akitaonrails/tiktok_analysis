package X;

import Y.ARunnableS115S0100000_15;
import Y.AfS151S0200000_15;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageV2UpdateGPSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bfU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982260bfU extends AbstractC982270bfV {
    public final Function0<InterfaceC978000bYc> LLIZLLLIL;
    public ViewGroup LLJ;
    public View LLJI;
    public SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB LLJIJIL;
    public C11JF LLJILJIL;
    public final C982250bfT LLJILJILJ;

    @Override // X.AbstractC982270bfV
    public final String LJIIL() {
        return "TakeTheStageLedComponent";
    }

    @Override // X.AbstractC982270bfV
    public final void LJIIJ() {
        super.LJIIJ();
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C500260Jjc.LJIILIIL(viewGroup);
        }
        C11JF c11jf = this.LLJILJIL;
        if (c11jf != null) {
            c11jf.dispose();
        }
        this.LLJILJIL = null;
        C982250bfT c982250bfT = this.LLJILJILJ;
        c982250bfT.getClass();
        C20441214yg.LJIIIZ("TakeTheStageLedFEPresenter", "commonReset");
        ((LinkedHashMap) c982250bfT.LLILLL).clear();
        ((LinkedHashMap) c982250bfT.LLILZ).clear();
        c982250bfT.LLILZLL = null;
        c982250bfT.LLIZ = false;
        c982250bfT.LLIZLLLIL = false;
        c982250bfT.LLJILJIL = false;
        C982250bfT.LIZLLL(c982250bfT, EnumC982400bfi.FINISH, null, 0L, null, 12);
        c982250bfT.LLJ = EnumC982400bfi.UNKNOWN;
        c982250bfT.LLJIJIL = false;
        C1548820qPI.LJIIIIZZ("pop_up_take_the_stage_management_panel_event", c982250bfT);
        DataChannel dataChannel = c982250bfT.LL;
        if (dataChannel != null) {
            dataChannel.zQ2(c982250bfT);
        }
        c982250bfT.LLJILJILJ.LJ();
    }

    @Override // X.AbstractC982270bfV
    public final void LJIIZILJ() {
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB;
        super.LJIIZILJ();
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C500260Jjc.LLFFF(viewGroup);
        }
        ViewGroup viewGroup2 = this.LLJ;
        if (viewGroup2 != null) {
            HandlerHook.viewPost(viewGroup2, new ARunnableS115S0100000_15(this, 188));
        }
        C982250bfT c982250bfT = this.LLJILJILJ;
        C981480beE c981480beE = this.LLILZIL;
        c982250bfT.getClass();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onTakeTheStageStart, model=");
        sbLIZ.append(c981480beE);
        C20441214yg.LIZIZ("TakeTheStageLedFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
        c982250bfT.LIZIZ(c981480beE);
        if (!LiveCoHostTakeTheStageV2UpdateGPSetting.INSTANCE.isEnable() || (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJIJIL) == null) {
            return;
        }
        sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.U0(this.LLJILJILJ.LIZJ(false));
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977430bXh
    public final void onUnload() {
        super.onUnload();
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C786410Ut5.LJJJJI(viewGroup);
        }
        this.LLJ = null;
        SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB = this.LLJIJIL;
        if (sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB != null) {
            boolean z = SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LLLILZJ;
            sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB.LJJ(true);
        }
        this.LLJIJIL = null;
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977410bXf
    public final void LIZ(AbstractC982800bgM abstractC982800bgM) {
        super.LIZ(abstractC982800bgM);
        if (abstractC982800bgM instanceof C982570bfz) {
            C982250bfT c982250bfT = this.LLJILJILJ;
            C981480beE c981480beE = this.LLILZIL;
            c982250bfT.LJ(c981480beE);
            if (c982250bfT.LLIZLLLIL) {
                C982250bfT.LIZLLL(c982250bfT, EnumC982400bfi.FINAL_CALL, c981480beE, 0L, EnumC982770bgJ.SCORE_UPDATE, 4);
                return;
            }
            return;
        }
        if (!(abstractC982800bgM instanceof C982470bfp)) {
            return;
        }
        C982250bfT c982250bfT2 = this.LLJILJILJ;
        c982250bfT2.getClass();
        C20441214yg.LIZIZ("TakeTheStageLedFEPresenter", "onCompetitionStartMessageReceive");
        c982250bfT2.LLJILJIL = true;
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        ViewGroup viewGroup;
        super.LIZLLL(matchBaseWidget);
        View view = matchBaseWidget.LL;
        View viewFindViewById = null;
        if (view != null) {
            viewGroup = (ViewGroup) view.findViewById(R.id.x3h);
        } else {
            viewGroup = null;
        }
        this.LLJ = viewGroup;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.mgd);
        }
        this.LLJI = viewFindViewById;
    }

    @Override // X.AbstractC982270bfV
    public final void LJIILL(boolean z) {
        long j;
        long jLIZIZ;
        C981540beK c981540beK;
        C981540beK c981540beK2;
        boolean z2 = z;
        super.LJIILL(z2);
        if (!this.LL) {
            if (!z2 && this.LLILLL.invoke() != EnumC974260bSa.START) {
                z2 = false;
            } else {
                z2 = true;
            }
        }
        C982250bfT c982250bfT = this.LLJILJILJ;
        C981480beE c981480beE = this.LLILZIL;
        c982250bfT.LLIZLLLIL = true;
        c982250bfT.LJ(c981480beE);
        if (c981480beE != null && (c981540beK2 = c981480beE.LJIIJ) != null) {
            j = c981540beK2.LJFF;
        } else {
            j = 0;
        }
        long jLIZ = C982250bfT.LIZ(j, "onFinalCallStart", new AwS559S0100000_15(c981480beE, 1048));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onFinalCallStart rawPlannedEndTime=");
        sbLIZ.append(j);
        sbLIZ.append(" playingPlannedEndTime=");
        sbLIZ.append(jLIZ);
        sbLIZ.append(" endTime_ms=");
        long j2 = 1000 * jLIZ;
        sbLIZ.append(j2);
        C20441214yg.LIZIZ("TakeTheStageLedFEPresenter", C2188811AlT.LIZIZ(sbLIZ));
        C982250bfT.LIZLLL(c982250bfT, EnumC982400bfi.FINAL_CALL, c981480beE, j2, null, 8);
        C238400w2 c238400w2 = new C238400w2();
        C981480beE c981480beE2 = this.LLILZIL;
        if (c981480beE2 != null && (c981540beK = c981480beE2.LJIIJ) != null) {
            jLIZIZ = c981540beK.LIZIZ();
        } else {
            jLIZIZ = 0;
        }
        c238400w2.element = jLIZIZ;
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onFinalCallStart getTakeTheStageFinalCallDuration:");
        sbLIZ2.append(z2);
        sbLIZ2.append(" totalCountDown:");
        sbLIZ2.append(c238400w2.element);
        LJIILIIL(C2188811AlT.LIZIZ(sbLIZ2));
        if (z2 && c238400w2.element > 0) {
            C11JF c11jf = this.LLJILJIL;
            if (c11jf != null && !c11jf.isDisposed()) {
                return;
            }
            this.LLJILJIL = (C11JF) C11NZ.LJJJJLI(1L, TimeUnit.SECONDS).LJLIIL(c238400w2.element).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS151S0200000_15(c238400w2, this, 58));
            return;
        }
        C982250bfT c982250bfT2 = this.LLJILJILJ;
        C981480beE c981480beE3 = this.LLILZIL;
        c982250bfT2.getClass();
        C982250bfT.LIZLLL(c982250bfT2, EnumC982400bfi.ALARM, c981480beE3, 0L, null, 12);
    }

    @Override // X.AbstractC982270bfV
    public final void LJIJI(List<C954460awe> list) {
        ViewGroup viewGroup = this.LLJ;
        if (this.LLJIJIL == null && viewGroup != null && viewGroup.getChildCount() == 0) {
            SharedPreferencesOnSharedPreferenceChangeListenerC1541930qEB sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1 = ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).DU1(viewGroup.getContext(), "aweme://roma_redirect/?spark_page=live_cohost_take_stage_led", null, true, new AwS594S0100000_15(this, 1040));
            this.LLJIJIL = sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1;
            viewGroup.addView(sharedPreferencesOnSharedPreferenceChangeListenerC1541930qEBDU1, -1, -1);
        }
    }

    @Override // X.AbstractC982270bfV
    public final void LJIILLIIL(EnumC982500bfs enumC982500bfs, long j) {
        super.LJIILLIIL(enumC982500bfs, j);
        ViewGroup viewGroup = this.LLJ;
        if (viewGroup != null) {
            C500260Jjc.LLFFF(viewGroup);
        }
        C982250bfT c982250bfT = this.LLJILJILJ;
        C981480beE c981480beE = this.LLILZIL;
        c982250bfT.LLILZIL = enumC982500bfs;
        c982250bfT.LIZIZ(c981480beE);
        C982250bfT.LIZLLL(c982250bfT, EnumC982400bfi.FINAL_RESULT, c981480beE, 0L, null, 12);
    }

    public C982260bfU(boolean z, DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15, List list, AwS559S0100000_15 awS559S0100000_152) {
        super(z, dataChannel, awS559S0100000_15, list);
        this.LLIZLLLIL = awS559S0100000_152;
        this.LLJILJILJ = new C982250bfT(dataChannel, awS559S0100000_152);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d0  */
    @Override // X.InterfaceC977410bXf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ(int r15, int r16, java.util.List r17, java.util.List r18, java.util.List r19, java.util.List r20) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C982260bfU.LIZIZ(int, int, java.util.List, java.util.List, java.util.List, java.util.List):void");
    }
}
