package X;

import android.animation.ValueAnimator;
import android.os.Build;
import android.view.View;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLynxConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;

/* JADX INFO: renamed from: X.0bkV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985370bkV extends AbstractC982270bfV {
    public final Function0<InterfaceC985540bkm> LLIZLLLIL;
    public C1295960jpS LLJ;
    public C1295960jpS LLJI;
    public View LLJIJIL;
    public C1295960jpS LLJILJIL;
    public View LLJILJILJ;
    public C1295960jpS LLJILLL;
    public final C985380bkW LLJJ;

    @Override // X.InterfaceC977410bXf
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.AbstractC982270bfV
    public final String LJIIL() {
        return "TakeTheStageStartSettleAnimationComponent";
    }

    @Override // X.AbstractC982270bfV
    public final void LJIIJ() {
        super.LJIIJ();
        C500260Jjc.LJIILIIL(this.LLJ);
        C962250b9D.LJIIJ(this.LLJ);
        C500260Jjc.LJIILIIL(this.LLJI);
        C500260Jjc.LJIILIIL(this.LLJIJIL);
        C962250b9D.LJIIJ(this.LLJI);
        C500260Jjc.LJIILIIL(this.LLJILJIL);
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
        C962250b9D.LJIIJ(this.LLJILJIL);
        C500260Jjc.LJIILIIL(this.LLJILLL);
        C962250b9D.LJIIJ(this.LLJILLL);
        C985380bkW c985380bkW = this.LLJJ;
        ValueAnimator valueAnimator = c985380bkW.LIZIZ;
        if (valueAnimator != null) {
            C962250b9D.LIZLLL(valueAnimator);
        }
        C962250b9D.LJIIJ(c985380bkW.LIZ);
        c985380bkW.LIZ = null;
    }

    @Override // X.AbstractC982270bfV
    public final void LJIIZILJ() {
        super.LJIIZILJ();
        if (LiveMatchLynxConfigSetting.INSTANCE.isLynxEnabledInCompetition()) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playStartAnimation getCurStatus:");
        sbLIZ.append(this.LLILLL.invoke());
        LJIILIIL(C2188811AlT.LIZIZ(sbLIZ));
        C985380bkW c985380bkW = this.LLJJ;
        final C1295960jpS c1295960jpS = this.LLJ;
        c985380bkW.getClass();
        c985380bkW.LIZIZ(c1295960jpS, "ttlive_cohost_take_the_stage_start_anim_v2.zip", 0, new InterfaceC985590bkr() { // from class: X.0bke
            @Override // X.InterfaceC985590bkr
            public final void LIZ() {
                C500260Jjc.LJIILIIL(c1295960jpS);
                C962250b9D.LJIIJ(c1295960jpS);
            }
        });
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2;
        View viewFindViewById;
        C1295960jpS c1295960jpS3;
        View viewFindViewById2;
        super.LIZLLL(matchBaseWidget);
        View view = matchBaseWidget.LL;
        C1295960jpS c1295960jpS4 = null;
        if (view != null) {
            c1295960jpS = (C1295960jpS) view.findViewById(R.id.view_take_the_stage_start_anim);
        } else {
            c1295960jpS = null;
        }
        this.LLJ = c1295960jpS;
        C500260Jjc.LJIILIIL(c1295960jpS);
        if (view != null) {
            c1295960jpS2 = (C1295960jpS) view.findViewById(R.id.view_take_the_stage_win_anim);
        } else {
            c1295960jpS2 = null;
        }
        this.LLJI = c1295960jpS2;
        int i = Build.VERSION.SDK_INT;
        if (i > 26 && c1295960jpS2 != null) {
            c1295960jpS2.setRenderMode(EnumC1295970jpT.HARDWARE);
        }
        C500260Jjc.LJIILIIL(this.LLJI);
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.k4m);
        } else {
            viewFindViewById = null;
        }
        this.LLJIJIL = viewFindViewById;
        C500260Jjc.LJIILIIL(viewFindViewById);
        if (view != null) {
            c1295960jpS3 = (C1295960jpS) view.findViewById(R.id.view_take_the_stage_lose_anim);
        } else {
            c1295960jpS3 = null;
        }
        this.LLJILJIL = c1295960jpS3;
        if (i > 26 && c1295960jpS3 != null) {
            c1295960jpS3.setRenderMode(EnumC1295970jpT.HARDWARE);
        }
        C500260Jjc.LJIILIIL(this.LLJILJIL);
        if (view != null) {
            viewFindViewById2 = view.findViewById(R.id.k4l);
        } else {
            viewFindViewById2 = null;
        }
        this.LLJILJILJ = viewFindViewById2;
        C500260Jjc.LJIILIIL(viewFindViewById2);
        if (view != null) {
            c1295960jpS4 = (C1295960jpS) view.findViewById(R.id.view_take_the_stage_draw_anim);
        }
        this.LLJILLL = c1295960jpS4;
        if (i > 26 && c1295960jpS4 != null) {
            c1295960jpS4.setRenderMode(EnumC1295970jpT.HARDWARE);
        }
        C500260Jjc.LJIILIIL(this.LLJILLL);
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0bkf] */
    @Override // X.AbstractC982270bfV
    public final void LJIILLIIL(EnumC982500bfs enumC982500bfs, long j) {
        super.LJIILLIIL(enumC982500bfs, j);
        int i = C983220bh2.LIZ[enumC982500bfs.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LJIILIIL("playDrawAnimation start");
                    C985380bkW c985380bkW = this.LLJJ;
                    final C1295960jpS c1295960jpS = this.LLJILLL;
                    final ?? r0 = new InterfaceC985590bkr() { // from class: X.0bkf
                        @Override // X.InterfaceC985590bkr
                        public final void LIZ() {
                            InterfaceC985540bkm interfaceC985540bkmInvoke = this.LIZ.LLIZLLLIL.invoke();
                            if (interfaceC985540bkmInvoke != null) {
                                interfaceC985540bkmInvoke.LJIIIIZZ();
                            }
                        }
                    };
                    c985380bkW.getClass();
                    c985380bkW.LIZIZ(c1295960jpS, "ttlive_cohost_take_the_stage_result_draw_anim.zip", 0, new InterfaceC985590bkr() { // from class: X.0bka
                        @Override // X.InterfaceC985590bkr
                        public final void LIZ() {
                            C500260Jjc.LJIILIIL(c1295960jpS);
                            C962250b9D.LJIIJ(c1295960jpS);
                            InterfaceC985590bkr interfaceC985590bkr = r0;
                            if (interfaceC985590bkr != null) {
                                interfaceC985590bkr.LIZ();
                            }
                        }
                    });
                    return;
                }
                return;
            }
            LJIILIIL("playLoseAnimation start");
            C985380bkW c985380bkW2 = this.LLJJ;
            C1295960jpS c1295960jpS2 = this.LLJILJIL;
            View view = this.LLJILJILJ;
            InterfaceC985590bkr interfaceC985590bkr = new InterfaceC985590bkr() { // from class: X.0bkk
                @Override // X.InterfaceC985590bkr
                public final void LIZ() {
                    InterfaceC985540bkm interfaceC985540bkmInvoke = this.LIZ.LLIZLLLIL.invoke();
                    if (interfaceC985540bkmInvoke != null) {
                        interfaceC985540bkmInvoke.LJI();
                    }
                }
            };
            c985380bkW2.getClass();
            C985380bkW.LIZ(j, view);
            c985380bkW2.LIZJ(view, true, null);
            c985380bkW2.LIZIZ(c1295960jpS2, "ttlive_cohost_take_the_stage_result_lose_anim.zip", 1, new C985490bkh(c985380bkW2, view, c1295960jpS2, interfaceC985590bkr));
            return;
        }
        LJIILIIL("playWinAnimation start");
        C985380bkW c985380bkW3 = this.LLJJ;
        C1295960jpS c1295960jpS3 = this.LLJI;
        View view2 = this.LLJIJIL;
        c985380bkW3.getClass();
        C985380bkW.LIZ(1L, view2);
        c985380bkW3.LIZJ(view2, true, null);
        c985380bkW3.LIZIZ(c1295960jpS3, "ttlive_cohost_take_the_stage_result_win_anim.zip", 0, new C985510bkj(c985380bkW3, view2, c1295960jpS3, null));
    }

    public C985370bkV(boolean z, DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15, List list, AwS559S0100000_15 awS559S0100000_152) {
        super(z, dataChannel, awS559S0100000_15, list);
        this.LLIZLLLIL = awS559S0100000_152;
        this.LLJJ = new C985380bkW();
    }
}
