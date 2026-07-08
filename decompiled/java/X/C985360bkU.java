package X;

import android.os.Build;
import android.view.View;
import com.bytedance.android.live.liveinteract.match.business.event.CatchBeansStartAnimationStartFromLynxProxy;
import com.bytedance.android.live.liveinteract.multihost.biz.link.view.MultiCoHostWindowManager;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.match.LiveMatchLynxConfigSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bkU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C985360bkU extends AbstractC983420bhM {
    public final Function0<InterfaceC985580bkq> LLILZIL;
    public C1295960jpS LLILZLL;
    public C1295960jpS LLIZ;
    public C1295960jpS LLIZLLLIL;
    public C1295960jpS LLJ;
    public final C985390bkX LLJI;
    public MatchBaseWidget LLJIJIL;

    @Override // X.AbstractC983420bhM
    public final String LJIIJ() {
        return "CatchBeansStartResultAnimationComponent";
    }

    @Override // X.AbstractC983420bhM
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        C500260Jjc.LJIILIIL(this.LLILZLL);
        C962250b9D.LJIIJ(this.LLILZLL);
        C500260Jjc.LJIILIIL(this.LLIZ);
        C962250b9D.LJIIJ(this.LLIZ);
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        C962250b9D.LJIIJ(this.LLIZLLLIL);
        C500260Jjc.LJIILIIL(this.LLJ);
        C962250b9D.LJIIJ(this.LLJ);
        C985390bkX c985390bkX = this.LLJI;
        C962250b9D.LJIIJ(c985390bkX.LIZ);
        c985390bkX.LIZ = null;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0bXe] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.0bkY] */
    /* JADX WARN: Type inference failed for: r5v0, types: [X.0bkl] */
    @Override // X.AbstractC983420bhM
    public final void LJIILIIL() {
        super.LJIILIIL();
        if (LiveMatchLynxConfigSetting.INSTANCE.isLynxEnabledInCompetition()) {
            DataChannel dataChannel = this.LLILLJJLI;
            if (dataChannel != null) {
                dataChannel.zQ2(this);
            }
            DataChannel dataChannel2 = this.LLILLJJLI;
            if (dataChannel2 != null) {
                dataChannel2.CQ2(CatchBeansStartAnimationStartFromLynxProxy.class, this, new AwS594S0100000_15(this, 100));
                return;
            }
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("playStartAnimation getCurStatus:");
        sbLIZ.append(this.LLILLL.invoke());
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        C985390bkX c985390bkX = this.LLJI;
        final C1295960jpS c1295960jpS = this.LLILZLL;
        final ?? r1 = new InterfaceC985610bkt() { // from class: X.0bkY
            @Override // X.InterfaceC985610bkt
            public final void LIZIZ() {
                C985360bkU c985360bkU = this.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("playStartAnimation onAnimationStart, getStartAnimationPlayListener = ");
                sbLIZ2.append(this.LIZ.LLILZIL);
                c985360bkU.LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
                InterfaceC985580bkq interfaceC985580bkqInvoke = this.LIZ.LLILZIL.invoke();
                if (interfaceC985580bkqInvoke != null) {
                    interfaceC985580bkqInvoke.LJI();
                }
            }
        };
        final ?? r0 = new InterfaceC985600bks() { // from class: X.0bXe
            @Override // X.InterfaceC985600bks
            public final void LIZ() {
                C20337914i1<Integer> c20337914i1;
                Integer numLIZIZ;
                MultiCoHostWindowManager multiCoHostWindowManager;
                ViewOnClickListenerC986770bml viewOnClickListenerC986770bmlLJ;
                this.LIZ.LJIIJJI("playStartAnimation onAnimationEnd");
                if (this.LIZ.LL && (numLIZIZ = (c20337914i1 = InterfaceC1106030et7.U4).LIZIZ()) != null && numLIZIZ.intValue() == 0) {
                    c20337914i1.LJFF(Integer.valueOf(c20337914i1.LIZIZ().intValue() + 1));
                    MatchBaseWidget matchBaseWidget = this.LIZ.LLJIJIL;
                    if (matchBaseWidget == null || (multiCoHostWindowManager = matchBaseWidget.LLILLJJLI) == null || (viewOnClickListenerC986770bmlLJ = multiCoHostWindowManager.LJ(C915980Zwa.LIZ().Kq0(C950220apo.LJFF()))) == null) {
                        return;
                    }
                    viewOnClickListenerC986770bmlLJ.R1();
                }
            }
        };
        c985390bkX.getClass();
        C985390bkX.LIZ(c985390bkX, c1295960jpS, "ttlive_catch_beans_start_anim.zip", new InterfaceC985610bkt() { // from class: X.0bkl
            @Override // X.InterfaceC985610bkt
            public final void LIZIZ() {
                r1.LIZIZ();
            }
        }, new InterfaceC985600bks() { // from class: X.0bkb
            @Override // X.InterfaceC985600bks
            public final void LIZ() {
                C500260Jjc.LJIILIIL(c1295960jpS);
                C962250b9D.LJIIJ(c1295960jpS);
                r0.LIZ();
            }
        }, "tiktok_live_interaction_demand_10", 4);
    }

    @Override // X.AbstractC983420bhM, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        C1295960jpS c1295960jpS;
        C1295960jpS c1295960jpS2;
        C1295960jpS c1295960jpS3;
        super.LIZLLL(matchBaseWidget);
        this.LLJIJIL = matchBaseWidget;
        View view = matchBaseWidget.LL;
        C1295960jpS c1295960jpS4 = null;
        if (view != null) {
            c1295960jpS = (C1295960jpS) view.findViewById(R.id.view_catch_beans_start_anim);
        } else {
            c1295960jpS = null;
        }
        this.LLILZLL = c1295960jpS;
        C500260Jjc.LJIILIIL(c1295960jpS);
        if (view != null) {
            c1295960jpS2 = (C1295960jpS) view.findViewById(R.id.view_catch_beans_win_anim);
        } else {
            c1295960jpS2 = null;
        }
        this.LLIZ = c1295960jpS2;
        int i = Build.VERSION.SDK_INT;
        if (i > 26 && c1295960jpS2 != null) {
            c1295960jpS2.setRenderMode(EnumC1295970jpT.HARDWARE);
        }
        C500260Jjc.LJIILIIL(this.LLIZ);
        if (view != null) {
            c1295960jpS3 = (C1295960jpS) view.findViewById(R.id.view_catch_beans_lose_anim);
        } else {
            c1295960jpS3 = null;
        }
        this.LLIZLLLIL = c1295960jpS3;
        if (i > 26 && c1295960jpS3 != null) {
            c1295960jpS3.setRenderMode(EnumC1295970jpT.HARDWARE);
        }
        C500260Jjc.LJIILIIL(this.LLIZLLLIL);
        if (view != null) {
            c1295960jpS4 = (C1295960jpS) view.findViewById(R.id.view_catch_beans_draw_anim);
        }
        this.LLJ = c1295960jpS4;
        if (i > 26 && c1295960jpS4 != null) {
            c1295960jpS4.setRenderMode(EnumC1295970jpT.HARDWARE);
        }
        C500260Jjc.LJIILIIL(this.LLJ);
    }

    @Override // X.AbstractC983420bhM
    public final void LJIILJJIL(EnumC982500bfs enumC982500bfs) {
        super.LJIILJJIL(enumC982500bfs);
        int i = C983210bh1.LIZ[enumC982500bfs.ordinal()];
        final InterfaceC985600bks interfaceC985600bks = null;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    LJIIJJI("playDrawAnimation start");
                    C985390bkX c985390bkX = this.LLJI;
                    C1295960jpS c1295960jpS = this.LLJ;
                    c985390bkX.getClass();
                    C985390bkX.LIZ(c985390bkX, c1295960jpS, "ttlive_match_result_draw_opt.zip", null, new InterfaceC985600bks() { // from class: X.0bkn
                        public final /* synthetic */ InterfaceC985600bks LIZ = null;

                        @Override // X.InterfaceC985600bks
                        public final void LIZ() {
                            InterfaceC985600bks interfaceC985600bks2 = this.LIZ;
                            if (interfaceC985600bks2 != null) {
                                interfaceC985600bks2.LIZ();
                            }
                        }
                    }, null, 44);
                    return;
                }
                return;
            }
            LJIIJJI("playLoseAnimation start");
            C985390bkX c985390bkX2 = this.LLJI;
            C1295960jpS c1295960jpS2 = this.LLIZLLLIL;
            c985390bkX2.getClass();
            C985390bkX.LIZ(c985390bkX2, c1295960jpS2, "ttlive_match_result_ani_lose_opt.zip", null, new InterfaceC985600bks() { // from class: X.0bko
                @Override // X.InterfaceC985600bks
                public final void LIZ() {
                    InterfaceC985600bks interfaceC985600bks2 = interfaceC985600bks;
                    if (interfaceC985600bks2 != null) {
                        interfaceC985600bks2.LIZ();
                    }
                }
            }, null, 44);
            return;
        }
        LJIIJJI("playWinAnimation start");
        C985390bkX c985390bkX3 = this.LLJI;
        C1295960jpS c1295960jpS3 = this.LLIZ;
        c985390bkX3.getClass();
        C985390bkX.LIZ(c985390bkX3, c1295960jpS3, "ttlive_match_result_ani_win_opt.zip", null, new InterfaceC985600bks() { // from class: X.0bkp
            @Override // X.InterfaceC985600bks
            public final void LIZ() {
                InterfaceC985600bks interfaceC985600bks2 = interfaceC985600bks;
                if (interfaceC985600bks2 != null) {
                    interfaceC985600bks2.LIZ();
                }
            }
        }, null, 44);
    }

    public C985360bkU(boolean z, DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15, List list, AwS559S0100000_15 awS559S0100000_152) {
        super(z, dataChannel, awS559S0100000_15, list);
        this.LLILZIL = awS559S0100000_152;
        this.LLJI = new C985390bkX();
    }
}
