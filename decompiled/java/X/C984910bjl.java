package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS84S0200000_15;
import android.animation.AnimatorSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdk.livesetting.linkmic.cohost.LiveCoHostTakeTheStageAtmosphereAudienceSetting;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS416S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bjl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C984910bjl extends AbstractC982270bfV implements InterfaceC985540bkm {
    public final InterfaceC985020bjw LLIZLLLIL;
    public C984930bjn LLJ;
    public C1295960jpS LLJI;
    public AnimatorSet LLJIJIL;
    public C16FS LLJILJIL;
    public C985030bjx LLJILJILJ;
    public C979420bau LLJILLL;
    public MatchBaseWidget LLJJ;
    public InterfaceC1059280dfi LLJJI;
    public boolean LLJJIII;
    public View LLJJIJI;
    public final C982420bfk LLJJIJIIJIL;
    public boolean LLJJIJIL;

    @Override // X.InterfaceC977410bXf
    public final void LIZIZ(int i, int i2, List list, List list2, List list3, List list4) {
    }

    @Override // X.AbstractC982270bfV
    public final String LJIIL() {
        return "TakeTheStageRankAndRestartComponent";
    }

    @Override // X.AbstractC982270bfV
    public final boolean LJIJ() {
        return !this.LL;
    }

    public final int LJIJJLI() {
        View viewFindViewById;
        Integer numValueOf;
        C984930bjn c984930bjn = this.LLJ;
        return ((c984930bjn == null || (viewFindViewById = c984930bjn.findViewById(R.id.mbs)) == null || (numValueOf = Integer.valueOf(viewFindViewById.getMeasuredWidth())) == null) ? 0 : numValueOf.intValue()) - ((int) C497740JfY.LIZIZ(8.0f));
    }

    public final void LJIL() {
        C981500beG c981500beG;
        C981480beE c981480beE;
        C981500beG c981500beG2;
        boolValueOf = null;
        Boolean boolValueOf = null;
        if (!this.LL) {
            if (LiveCoHostTakeTheStageAtmosphereAudienceSetting.INSTANCE.isEnable()) {
                C981480beE c981480beE2 = this.LLILZIL;
                if (c981480beE2 != null && (c981500beG2 = c981480beE2.LJJIJIIJI) != null) {
                    boolValueOf = Boolean.valueOf(c981500beG2.LIZLLL());
                }
                if (!C500260Jjc.LJJJI(boolValueOf) || (c981480beE = this.LLILZIL) == null) {
                    return;
                }
                long jLIZJ = c981480beE.LJIIJ.LJIIIZ - C158B.LIZJ();
                InterfaceC985020bjw interfaceC985020bjw = this.LLIZLLLIL;
                if (interfaceC985020bjw != null) {
                    interfaceC985020bjw.LIZ(jLIZJ * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                    return;
                }
                return;
            }
            return;
        }
        C985030bjx c985030bjx = this.LLJILJILJ;
        if (c985030bjx == null || c985030bjx.getVisibility() != 0) {
            C979420bau c979420bau = this.LLJILLL;
            if (c979420bau == null || c979420bau.getVisibility() != 0) {
                LJIILIIL("showDrawRematchButton");
                C985030bjx c985030bjx2 = this.LLJILJILJ;
                if (c985030bjx2 != null) {
                    c985030bjx2.setCountDownListener(new AbstractC985060bk0() { // from class: X.0bjt
                        @Override // X.AbstractC985060bk0
                        public final void LIZIZ(long j) {
                            this.LIZ.LJIILIIL("showDrawRematchButton onDrawCountdownEnd");
                            C985030bjx c985030bjx3 = this.LIZ.LLJILJILJ;
                            if (c985030bjx3 != null) {
                                C786410Ut5.LLJL(c985030bjx3, 8);
                            }
                            C985030bjx c985030bjx4 = this.LIZ.LLJILJILJ;
                            if (c985030bjx4 != null) {
                                c985030bjx4.LIZIZ();
                            }
                            InterfaceC985020bjw interfaceC985020bjw2 = this.LIZ.LLIZLLLIL;
                            if (interfaceC985020bjw2 != null) {
                                interfaceC985020bjw2.LIZJ();
                            }
                        }
                    });
                }
                C981480beE c981480beE3 = this.LLILZIL;
                if (C500260Jjc.LJJJI((c981480beE3 == null || (c981500beG = c981480beE3.LJJIJIIJI) == null) ? null : Boolean.valueOf(c981500beG.LIZLLL()))) {
                    C985030bjx c985030bjx3 = this.LLJILJILJ;
                    if (c985030bjx3 != null) {
                        c985030bjx3.setMaxWidth(C497740JfY.LJIIZILJ() - LJIJJLI());
                    }
                    C981480beE c981480beE4 = this.LLILZIL;
                    if (c981480beE4 != null) {
                        long jLIZJ2 = c981480beE4.LJIIJ.LJIIIZ - C158B.LIZJ();
                        C985030bjx c985030bjx4 = this.LLJILJILJ;
                        if (c985030bjx4 != null) {
                            C500260Jjc.LJIILIIL(c985030bjx4.LLILLJJLI);
                            C418350Gan c418350Gan = c985030bjx4.LLILLL;
                            C500260Jjc.LJIILIIL(c418350Gan != null ? c418350Gan : null);
                            c985030bjx4.LIZ(jLIZJ2);
                        }
                        InterfaceC985020bjw interfaceC985020bjw2 = this.LLIZLLLIL;
                        if (interfaceC985020bjw2 != null) {
                            interfaceC985020bjw2.LIZ(jLIZJ2 * ((long) LSPassThroughRecordSizeConfig.DEFAULT));
                        }
                    }
                } else {
                    C985010bjv.LIZ(new AwS594S0100000_15(this, 976));
                }
                C973690bRf.LIZ.LJIL();
            }
        }
    }

    public final void LJJ() {
        if (this.LL) {
            C16FS c16fs = this.LLJILJIL;
            if (c16fs == null || c16fs.getVisibility() != 0) {
                C979420bau c979420bau = this.LLJILLL;
                if (c979420bau == null || c979420bau.getVisibility() != 0) {
                    LJIILIIL("showNormalRematchButton");
                    C500260Jjc.LLFFF(this.LLJILJIL);
                    C973690bRf.LIZ.LJIL();
                }
            }
        }
    }

    @Override // X.AbstractC982270bfV
    public final void LJIIJ() {
        super.LJIIJ();
        C500260Jjc.LJIILIIL(this.LLJ);
        C984930bjn c984930bjn = this.LLJ;
        if (c984930bjn != null) {
            c984930bjn.LIZJ(C985000bju.LIZJ);
        }
        C984930bjn c984930bjn2 = this.LLJ;
        if (c984930bjn2 != null) {
            c984930bjn2.LIZ();
        }
        C500260Jjc.LJIILIIL(this.LLJILJIL);
        C985030bjx c985030bjx = this.LLJILJILJ;
        if (c985030bjx != null) {
            c985030bjx.LIZIZ();
        }
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
        C979420bau c979420bau = this.LLJILLL;
        if (c979420bau != null) {
            c979420bau.LIZ();
        }
        AnimatorSet animatorSet = this.LLJIJIL;
        if (animatorSet != null) {
            animatorSet.end();
        }
        this.LLJJIII = true;
        InterfaceC1059280dfi interfaceC1059280dfi = this.LLJJI;
        if (interfaceC1059280dfi != null) {
            interfaceC1059280dfi.close();
        }
        this.LLJJI = null;
        C1295960jpS c1295960jpS = this.LLJI;
        if (c1295960jpS != null) {
            c1295960jpS.cancelAnimation();
        }
        C1295960jpS c1295960jpS2 = this.LLJI;
        if (c1295960jpS2 != null) {
            c1295960jpS2.clearAnimation();
        }
        C1295960jpS c1295960jpS3 = this.LLJI;
        if (c1295960jpS3 != null) {
            c1295960jpS3.removeAllAnimatorListeners();
        }
        C500260Jjc.LJIILIIL(this.LLJI);
        this.LLJJ = null;
    }

    @Override // X.InterfaceC985540bkm
    public final void LJI() {
        LJJ();
    }

    @Override // X.InterfaceC985540bkm
    public final void LJIIIIZZ() {
        LJIL();
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00a4 A[PHI: r2
      0x00a4: PHI (r2v3 java.lang.Object) = (r2v6 java.lang.Object), (r2v7 java.lang.Object) binds: [B:32:0x0096, B:34:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC982270bfV, X.InterfaceC977410bXf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.AbstractC982800bgM r10) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C984910bjl.LIZ(X.0bgM):void");
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        View viewFindViewById;
        C984930bjn c984930bjn;
        C1295960jpS c1295960jpS;
        C16FS c16fs;
        C985030bjx c985030bjx;
        super.LIZLLL(matchBaseWidget);
        View view = matchBaseWidget.LL;
        this.LLJJ = matchBaseWidget;
        C979420bau c979420bau = null;
        if (view != null) {
            viewFindViewById = view.findViewById(R.id.mgd);
        } else {
            viewFindViewById = null;
        }
        this.LLJJIJI = viewFindViewById;
        if (view != null) {
            c984930bjn = (C984930bjn) view.findViewById(R.id.mgj);
        } else {
            c984930bjn = null;
        }
        this.LLJ = c984930bjn;
        C984930bjn c984930bjn2 = this.LLJ;
        if (c984930bjn2 != null) {
            c984930bjn2.LIZJ(C985000bju.LIZJ);
        }
        C984930bjn c984930bjn3 = this.LLJ;
        if (c984930bjn3 != null) {
            c984930bjn3.setContainerClickCallback(new AwS416S0200000_15(this, view, 86));
        }
        C984930bjn c984930bjn4 = this.LLJ;
        if (c984930bjn4 != null) {
            c984930bjn4.setMVPAnimationStartCallback(new AwS594S0100000_15(this, 975));
        }
        C984930bjn c984930bjn5 = this.LLJ;
        if (c984930bjn5 != null) {
            boolean z = true;
            if (C915980Zwa.LJII().LLILZLL(true).size() <= 2) {
                z = false;
            }
            c984930bjn5.setIsMulti(z);
        }
        if (view != null) {
            c1295960jpS = (C1295960jpS) view.findViewById(R.id.mgk);
        } else {
            c1295960jpS = null;
        }
        this.LLJI = c1295960jpS;
        if (this.LL) {
            if (view != null) {
                c16fs = (C16FS) view.findViewById(R.id.cvp);
            } else {
                c16fs = null;
            }
            this.LLJILJIL = c16fs;
            C500260Jjc.LJIILIIL(c16fs);
            C16FS c16fs2 = this.LLJILJIL;
            if (c16fs2 != null) {
                C786410Ut5.h8(c16fs2, new ACListenerS150S0100000_15(this, 263));
            }
            if (view != null) {
                c985030bjx = (C985030bjx) view.findViewById(R.id.cvn);
            } else {
                c985030bjx = null;
            }
            this.LLJILJILJ = c985030bjx;
            C500260Jjc.LJIILIIL(c985030bjx);
            C985030bjx c985030bjx2 = this.LLJILJILJ;
            if (c985030bjx2 != null) {
                c985030bjx2.setButtonText(C497740JfY.LJIJI(2131851787));
            }
            C985030bjx c985030bjx3 = this.LLJILJILJ;
            if (c985030bjx3 != null) {
                c985030bjx3.setOnRematchClickListener(new ACListenerS150S0100000_15(this, 262));
            }
            if (view != null) {
                c979420bau = (C979420bau) view.findViewById(R.id.cvo);
            }
            this.LLJILLL = c979420bau;
        }
    }

    @Override // X.AbstractC982270bfV
    public final void LJIILL(boolean z) {
        super.LJIILL(z);
        C500260Jjc.LLFFF(this.LLJ);
        C984930bjn c984930bjn = this.LLJ;
        if (c984930bjn != null) {
            HandlerHook.viewPost(c984930bjn, new ARunnableS115S0100000_15(this, 175));
        }
        C500260Jjc.LJIILIIL(this.LLJILJIL);
        C500260Jjc.LJIILIIL(this.LLJILJILJ);
        C979420bau c979420bau = this.LLJILLL;
        if (c979420bau != null) {
            c979420bau.setVisibility(false);
        }
    }

    @Override // X.AbstractC982270bfV, X.InterfaceC977410bXf
    public final void LJ(EnumC974260bSa enumC974260bSa, C981480beE c981480beE) {
        List<C982390bfh> list;
        if (this.LLJJIII && enumC974260bSa.compareTo(EnumC974260bSa.START) >= 0 && enumC974260bSa.compareTo(EnumC974260bSa.DRAW) <= 0) {
            if (!this.LLJJIJIL) {
                this.LLJJIJIL = true;
                this.LLJJIJIIJIL.getClass();
                C985000bju c985000bjuLIZ = C982420bfk.LIZ(c981480beE);
                C984930bjn c984930bjn = this.LLJ;
                if (c984930bjn != null) {
                    c984930bjn.LIZJ(c985000bjuLIZ);
                    c984930bjn.LIZ();
                    ConstraintLayout constraintLayout = c984930bjn.LLIZ;
                    if (constraintLayout != null) {
                        C786410Ut5.c5(constraintLayout, 1.0f);
                    }
                }
            }
            if (c981480beE != null && (list = c981480beE.LJIILJJIL) != null && list.size() > 0) {
                LJJI(list, c981480beE);
            }
        }
        super.LJ(enumC974260bSa, c981480beE);
    }

    @Override // X.AbstractC982270bfV
    public final void LJIILLIIL(EnumC982500bfs enumC982500bfs, long j) {
        boolean z;
        C984930bjn c984930bjn;
        C984950bjp c984950bjp;
        super.LJIILLIIL(enumC982500bfs, j);
        if (enumC982500bfs == EnumC982500bfs.WIN) {
            z = true;
        } else {
            z = false;
        }
        C984930bjn c984930bjn2 = this.LLJ;
        if (c984930bjn2 != null) {
            c984930bjn2.LLILZ = Boolean.valueOf(z);
            if (z) {
                c984950bjp = c984930bjn2.LLILZLL;
            } else {
                c984950bjp = null;
            }
            if (c984950bjp != null && !c984950bjp.LL) {
                HandlerHook.viewRemoveCallbacks(c984930bjn2, c984930bjn2.LLJILJILJ);
                c984930bjn2.LLJILJILJ = new ARunnableS84S0200000_15(c984950bjp, c984930bjn2, 11);
                HandlerHook.viewPostDelay(c984930bjn2, c984930bjn2.LLJILJILJ, 3800L);
            } else {
                HandlerHook.viewRemoveCallbacks(c984930bjn2, c984930bjn2.LLJILLL);
                c984930bjn2.LLJILLL = new ARunnableS115S0100000_15(c984930bjn2, 29);
                HandlerHook.viewPostDelay(c984930bjn2, c984930bjn2.LLJILLL, 3800L);
            }
        }
        if (this.LL && (c984930bjn = this.LLJ) != null) {
            c984930bjn.setRematchEventCallback(new AwS416S0200000_15(this, enumC982500bfs, 87));
        }
    }

    public final void LJJI(List<C982390bfh> list, C981480beE c981480beE) {
        List<C01BH> list2;
        C982390bfh next;
        Iterator<C982390bfh> it2 = list.iterator();
        while (true) {
            list2 = null;
            if (it2.hasNext()) {
                next = it2.next();
                Iterator<C982710bgD> it3 = next.LJI.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        C982710bgD next2 = it3.next();
                        if (next2.LIZ == C950220apo.LJ()) {
                            if (next2 != null) {
                                break;
                            }
                        }
                    }
                }
            } else {
                next = null;
                break;
            }
        }
        C982390bfh c982390bfh = next;
        if (c982390bfh != null) {
            list2 = c982390bfh.LJFF;
        }
        this.LLJJIJIIJIL.getClass();
        C985000bju c985000bjuLIZ = C982420bfk.LIZ(c981480beE);
        C984930bjn c984930bjn = this.LLJ;
        if (c984930bjn != null) {
            c984930bjn.LJ(list2, c985000bjuLIZ);
        }
        this.LLJJIII = false;
    }

    public C984910bjl(boolean z, DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15, List list, InterfaceC985020bjw interfaceC985020bjw) {
        super(z, dataChannel, awS559S0100000_15, list);
        this.LLIZLLLIL = interfaceC985020bjw;
        this.LLJJIII = true;
        this.LLJJIJIIJIL = new C982420bfk();
    }
}
