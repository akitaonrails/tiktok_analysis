package X;

import Y.ACListenerS150S0100000_15;
import Y.ARunnableS115S0100000_15;
import Y.ARunnableS84S0200000_15;
import android.animation.AnimatorSet;
import android.os.Looper;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.android.live.liveinteract.api.BattleBonusTaskShowChannel;
import com.bytedance.android.live.liveinteract.multimatch.widget.MatchBaseWidget;
import com.bytedance.android.livesdkapi.depend.model.live.match.CohostContentGuideInfo;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS381S0200000_15;
import kotlin.jvm.internal.AwS559S0100000_15;
import kotlin.jvm.internal.AwS594S0100000_15;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bjm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C984920bjm extends AbstractC983420bhM {
    public final InterfaceC985020bjw LLILZIL;
    public final BPEAHandler LLILZLL;
    public C984940bjo LLIZ;
    public C1295960jpS LLIZLLLIL;
    public AnimatorSet LLJ;
    public C16FS LLJI;
    public C985030bjx LLJIJIL;
    public C979420bau LLJILJIL;
    public MatchBaseWidget LLJILJILJ;
    public InterfaceC1059280dfi LLJILLL;
    public boolean LLJJ;

    @Override // X.AbstractC983420bhM
    public final String LJIIJ() {
        return "CatchBeansMVPComponent";
    }

    @Override // X.AbstractC983420bhM
    public final void LJIIIIZZ() {
        super.LJIIIIZZ();
        C500260Jjc.LJIILIIL(this.LLIZ);
        C984940bjo c984940bjo = this.LLIZ;
        if (c984940bjo != null) {
            c984940bjo.LIZJ();
        }
        C984940bjo c984940bjo2 = this.LLIZ;
        if (c984940bjo2 != null) {
            c984940bjo2.LIZ();
        }
        C985030bjx c985030bjx = this.LLJIJIL;
        if (c985030bjx != null) {
            c985030bjx.LIZIZ();
        }
        C500260Jjc.LJIILIIL(this.LLJIJIL);
        C500260Jjc.LJIILIIL(this.LLJI);
        C979420bau c979420bau = this.LLJILJIL;
        if (c979420bau != null) {
            c979420bau.LIZ();
        }
        AnimatorSet animatorSet = this.LLJ;
        if (animatorSet != null) {
            animatorSet.end();
        }
        this.LLJJ = true;
        InterfaceC1059280dfi interfaceC1059280dfi = this.LLJILLL;
        if (interfaceC1059280dfi != null) {
            interfaceC1059280dfi.close();
        }
        this.LLJILLL = null;
        this.LLILZLL.removeCallbacksAndMessages(null);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel != null) {
            dataChannel.zQ2(this);
        }
        this.LLJILJILJ = null;
    }

    @Override // X.AbstractC983420bhM
    public final void LJIILIIL() {
        super.LJIILIIL();
        C500260Jjc.LLFFF(this.LLIZ);
        DataChannel dataChannel = this.LLILLJJLI;
        if (dataChannel == null || !Intrinsics.LJFF(dataChannel.gg0(BattleBonusTaskShowChannel.class), Boolean.TRUE)) {
            C984940bjo c984940bjo = this.LLIZ;
            if (c984940bjo != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c984940bjo);
                c984940bjo.setAlpha(1.0f);
            }
        } else {
            C984940bjo c984940bjo2 = this.LLIZ;
            if (c984940bjo2 != null) {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c984940bjo2);
                c984940bjo2.setAlpha(0.2f);
            }
        }
        DataChannel dataChannel2 = this.LLILLJJLI;
        if (dataChannel2 != null) {
            dataChannel2.CQ2(BattleBonusTaskShowChannel.class, this, new AwS594S0100000_15(this, 101));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x016d A[PHI: r2
      0x016d: PHI (r2v4 java.lang.Object) = (r2v7 java.lang.Object), (r2v8 java.lang.Object) binds: [B:74:0x015f, B:76:0x016b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.AbstractC983420bhM, X.InterfaceC977410bXf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.AbstractC982800bgM r12) {
        /*
            Method dump skipped, instruction units count: 407
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C984920bjm.LIZ(X.0bgM):void");
    }

    @Override // X.AbstractC983420bhM, X.InterfaceC977430bXh
    public final void LIZLLL(MatchBaseWidget matchBaseWidget) {
        C984940bjo c984940bjo;
        C1295960jpS c1295960jpS;
        C16FS c16fs;
        C985030bjx c985030bjx;
        super.LIZLLL(matchBaseWidget);
        View view = matchBaseWidget.LL;
        this.LLJILJILJ = matchBaseWidget;
        C979420bau c979420bau = null;
        if (view != null) {
            c984940bjo = (C984940bjo) view.findViewById(R.id.m9e);
        } else {
            c984940bjo = null;
        }
        this.LLIZ = c984940bjo;
        if (c984940bjo != null) {
            c984940bjo.LIZJ();
        }
        C984940bjo c984940bjo2 = this.LLIZ;
        if (c984940bjo2 != null) {
            c984940bjo2.LIZJ();
            c984940bjo2.LIZ();
            ConstraintLayout constraintLayout = c984940bjo2.LLIZ;
            if (constraintLayout != null) {
                C786410Ut5.c5(constraintLayout, 1.0f);
            }
        }
        C984940bjo c984940bjo3 = this.LLIZ;
        if (c984940bjo3 != null) {
            c984940bjo3.setContainerClickCallback(new AwS381S0200000_15(this, view, 25));
        }
        C984940bjo c984940bjo4 = this.LLIZ;
        if (c984940bjo4 != null) {
            c984940bjo4.setMVPAnimationStartCallback(new AwS594S0100000_15(this, 102));
        }
        C984940bjo c984940bjo5 = this.LLIZ;
        if (c984940bjo5 != null) {
            c984940bjo5.setIsMulti(false);
        }
        if (view != null) {
            c1295960jpS = (C1295960jpS) view.findViewById(R.id.m9f);
        } else {
            c1295960jpS = null;
        }
        this.LLIZLLLIL = c1295960jpS;
        if (this.LL) {
            this.LLILZLL.removeCallbacksAndMessages(null);
            if (view != null) {
                c16fs = (C16FS) view.findViewById(R.id.cob);
            } else {
                c16fs = null;
            }
            this.LLJI = c16fs;
            C500260Jjc.LJIILIIL(c16fs);
            C16FS c16fs2 = this.LLJI;
            if (c16fs2 != null) {
                c16fs2.setText(C497740JfY.LJIJI(2131851560));
            }
            C16FS c16fs3 = this.LLJI;
            if (c16fs3 != null) {
                C786410Ut5.h8(c16fs3, new ACListenerS150S0100000_15(this, 32));
            }
            if (view != null) {
                c985030bjx = (C985030bjx) view.findViewById(R.id.co9);
            } else {
                c985030bjx = null;
            }
            this.LLJIJIL = c985030bjx;
            C500260Jjc.LJIILIIL(c985030bjx);
            C985030bjx c985030bjx2 = this.LLJIJIL;
            if (c985030bjx2 != null) {
                c985030bjx2.setButtonText(C497740JfY.LJIJI(2131851560));
            }
            C985030bjx c985030bjx3 = this.LLJIJIL;
            if (c985030bjx3 != null) {
                c985030bjx3.setOnRematchClickListener(new ACListenerS150S0100000_15(this, 31));
            }
            if (view != null) {
                c979420bau = (C979420bau) view.findViewById(R.id.coa);
            }
            this.LLJILJIL = c979420bau;
        }
    }

    @Override // X.AbstractC983420bhM
    public final void LJIILJJIL(EnumC982500bfs enumC982500bfs) {
        boolean z;
        C984960bjq c984960bjq;
        Boolean boolValueOf;
        super.LJIILJJIL(enumC982500bfs);
        C500260Jjc.LLFFF(this.LLIZ);
        C500260Jjc.LJIILIIL(this.LLJI);
        EnumC982500bfs enumC982500bfs2 = EnumC982500bfs.DRAW;
        if (enumC982500bfs != enumC982500bfs2) {
            if (enumC982500bfs == EnumC982500bfs.WIN) {
                z = true;
            } else {
                z = false;
            }
            C984940bjo c984940bjo = this.LLIZ;
            if (c984940bjo != null) {
                c984940bjo.LLILLL = Boolean.valueOf(z);
                if (z) {
                    c984960bjq = c984940bjo.LLILZIL;
                } else {
                    c984960bjq = c984940bjo.LLILZLL;
                }
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("showMVP, isLeftWin = ");
                sbLIZ.append(z);
                sbLIZ.append(", mvpView.isEmpty = ");
                if (c984960bjq != null) {
                    boolValueOf = Boolean.valueOf(c984960bjq.LL);
                } else {
                    boolValueOf = null;
                }
                sbLIZ.append(boolValueOf);
                C20441214yg.LIZIZ("CatchBeansMvpContainerLayout", C2188811AlT.LIZIZ(sbLIZ));
                if (c984960bjq != null && !c984960bjq.LL) {
                    HandlerHook.viewRemoveCallbacks(c984940bjo, c984940bjo.LLJILJIL);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("showMVP, remove Callbacks mvpView = ");
                    sbLIZ2.append(c984960bjq);
                    C20441214yg.LIZIZ("CatchBeansMvpContainerLayout", C2188811AlT.LIZIZ(sbLIZ2));
                    c984940bjo.LLJILJIL = new ARunnableS84S0200000_15(c984940bjo, c984960bjq, 6);
                    HandlerHook.viewPostDelay(c984940bjo, c984940bjo.LLJILJIL, 3800L);
                }
            }
        }
        if (enumC982500bfs != enumC982500bfs2) {
            if (this.LL) {
                C786410Ut5.LJLIIL(10000L, this.LLILZLL, new ARunnableS115S0100000_15(this, 26));
            }
        } else {
            if (this.LL) {
                LJIIJJI("showDrawRematchButton");
                if (!this.LL) {
                    return;
                }
                C238400w2 c238400w2 = new C238400w2();
                c238400w2.element = 3L;
                C985010bjv.LIZ(new AwS381S0200000_15(this, c238400w2, 26));
                C786410Ut5.LJLIIL(10000L, this.LLILZLL, new ARunnableS84S0200000_15(this, c238400w2, 7));
                return;
            }
            InterfaceC985020bjw interfaceC985020bjw = this.LLILZIL;
            if (interfaceC985020bjw == null) {
                return;
            }
            interfaceC985020bjw.LIZ(13000L);
        }
    }

    public final void LJIILLIIL(long j) {
        int iIntValue;
        View viewFindViewById;
        Integer numValueOf;
        C500260Jjc.LLFFF(this.LLJIJIL);
        C985030bjx c985030bjx = this.LLJIJIL;
        if (c985030bjx != null) {
            c985030bjx.setCountDownListener(new AbstractC985060bk0() { // from class: X.0bjs
                @Override // X.AbstractC985060bk0
                public final void LIZIZ(long j2) {
                    this.LIZ.LJIIJJI("showDrawRematchButton onDrawCountdownEnd");
                    C985030bjx c985030bjx2 = this.LIZ.LLJIJIL;
                    if (c985030bjx2 != null) {
                        C786410Ut5.LLJL(c985030bjx2, 8);
                    }
                    C985030bjx c985030bjx3 = this.LIZ.LLJIJIL;
                    if (c985030bjx3 != null) {
                        c985030bjx3.LIZIZ();
                    }
                    InterfaceC985020bjw interfaceC985020bjw = this.LIZ.LLILZIL;
                    if (interfaceC985020bjw != null) {
                        interfaceC985020bjw.LIZJ();
                    }
                }
            });
        }
        C985030bjx c985030bjx2 = this.LLJIJIL;
        if (c985030bjx2 != null) {
            int iLJIIZILJ = C497740JfY.LJIIZILJ();
            C984940bjo c984940bjo = this.LLIZ;
            if (c984940bjo != null && (viewFindViewById = c984940bjo.findViewById(R.id.mbs)) != null && (numValueOf = Integer.valueOf(viewFindViewById.getMeasuredWidth())) != null) {
                iIntValue = numValueOf.intValue();
            } else {
                iIntValue = 0;
            }
            c985030bjx2.setMaxWidth(iLJIIZILJ - (iIntValue - ((int) C497740JfY.LIZIZ(8.0f))));
        }
        C985030bjx c985030bjx3 = this.LLJIJIL;
        if (c985030bjx3 != null) {
            c985030bjx3.LIZ(j);
        }
        C973690bRf.LIZ.LJIL();
    }

    @Override // X.AbstractC983420bhM, X.InterfaceC977410bXf
    public final void LJ(EnumC974260bSa enumC974260bSa, C981480beE c981480beE) {
        List<C982390bfh> list;
        List<C982390bfh> list2;
        C982390bfh next;
        List<C01BH> list3;
        C982390bfh next2;
        C984940bjo c984940bjo;
        if (!this.LL && enumC974260bSa == EnumC974260bSa.START && (c984940bjo = this.LLIZ) != null) {
            c984940bjo.LIZJ();
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initContributorsIfNecessary, model?.catchBeansDropBeanInfo = ");
        List<C01BH> list4 = null;
        if (c981480beE != null) {
            list = c981480beE.LJIILJJIL;
        } else {
            list = null;
        }
        sbLIZ.append(list);
        LJIIJJI(C2188811AlT.LIZIZ(sbLIZ));
        if (this.LLJJ && enumC974260bSa.compareTo(EnumC974260bSa.START) >= 0 && enumC974260bSa.compareTo(EnumC974260bSa.DRAW) <= 0 && c981480beE != null && (list2 = c981480beE.LJIILJJIL) != null && list2.size() > 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("updateContributorsFromTeamScoreInfo, list = ");
            sbLIZ2.append(list2);
            LJIIJJI(C2188811AlT.LIZIZ(sbLIZ2));
            Iterator<C982390bfh> it2 = list2.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    Iterator<C982710bgD> it3 = next.LJI.iterator();
                    while (true) {
                        if (it3.hasNext()) {
                            C982710bgD next3 = it3.next();
                            if (next3.LIZ == C950220apo.LJ()) {
                                if (next3 != null) {
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
                list3 = c982390bfh.LJFF;
            } else {
                list3 = null;
            }
            Iterator<C982390bfh> it4 = list2.iterator();
            while (true) {
                if (it4.hasNext()) {
                    next2 = it4.next();
                    Iterator<C982710bgD> it5 = next2.LJI.iterator();
                    while (true) {
                        if (it5.hasNext()) {
                            C982710bgD next4 = it5.next();
                            if (next4.LIZ != C950220apo.LJ()) {
                                if (next4 != null) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    next2 = null;
                    break;
                }
            }
            C982390bfh c982390bfh2 = next2;
            if (c982390bfh2 != null) {
                list4 = c982390bfh2.LJFF;
            }
            if (list3 != null && !list3.isEmpty()) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("LeftList from scoreInfo, Avatar0 = ");
                sbLIZ3.append(((C01BH) ListProtector.get(list3, 0)).LIZJ);
                LJIIJJI(C2188811AlT.LIZIZ(sbLIZ3));
            }
            if (list4 != null && !list4.isEmpty()) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("RightList from scoreInfo, Avatar0 = ");
                sbLIZ4.append(((C01BH) ListProtector.get(list4, 0)).LIZJ);
                LJIIJJI(C2188811AlT.LIZIZ(sbLIZ4));
            }
            C984940bjo c984940bjo2 = this.LLIZ;
            if (c984940bjo2 != null) {
                c984940bjo2.LJ(list3, true);
            }
            C984940bjo c984940bjo3 = this.LLIZ;
            if (c984940bjo3 != null) {
                c984940bjo3.LJ(list4, false);
            }
            this.LLJJ = false;
        }
        super.LJ(enumC974260bSa, c981480beE);
    }

    public final boolean LJIIZILJ(long j, boolean z) {
        CohostContentGuideInfo cohostContentGuideInfo;
        C981480beE c981480beEM91 = C915980Zwa.LIZIZ().M91(false);
        if (c981480beEM91 != null) {
            cohostContentGuideInfo = c981480beEM91.LJJII;
        } else {
            cohostContentGuideInfo = null;
        }
        if (!C915980Zwa.LIZ().o20().LIZLLL(cohostContentGuideInfo)) {
            return false;
        }
        if (cohostContentGuideInfo != null) {
            int i = cohostContentGuideInfo.recommendedBattleType;
            C979420bau c979420bau = this.LLJILJIL;
            if (c979420bau != null) {
                c979420bau.LIZIZ(this.LLJILJILJ, i, this.LLILLJJLI, new C984970bjr(this, z, j));
                return true;
            }
            return true;
        }
        return true;
    }

    public C984920bjm(boolean z, DataChannel dataChannel, AwS559S0100000_15 awS559S0100000_15, List list, InterfaceC985020bjw interfaceC985020bjw) {
        super(z, dataChannel, awS559S0100000_15, list);
        this.LLILZIL = interfaceC985020bjw;
        this.LLILZLL = new BPEAHandler(Looper.getMainLooper());
        this.LLJJ = true;
    }
}
