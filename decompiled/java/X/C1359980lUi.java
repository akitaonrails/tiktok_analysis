package X;

import Y.ACListenerS124S0200000_21;
import Y.ACListenerS155S0100000_21;
import Y.ALAdapterS17S0100000_21;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.icon.TuxIconView;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteList;
import com.ss.android.ugc.aweme.feed.model.upvote.UpvoteStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew;
import com.ss.android.ugc.feed.platform.cell.IComponentStatus;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0lUi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1359980lUi {
    public final FrameLayout LIZ;
    public final UpvoteListViewModelNew LIZIZ;
    public final String LIZJ;
    public final C1360090lUt LIZLLL;
    public final InterfaceC1360060lUq LJ;
    public final C420840Geo LJFF;
    public final C428890Grn LJI;
    public final C1359990lUj LJII;
    public int LJIIIIZZ;
    public String LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public InterfaceC2280171EMt<? super View, ? super Integer, ? super Integer, ? super UpvoteStruct, ? super String, ? super Boolean, ? super String, Unit> LJIIL;
    public Animator LJIILIIL;
    public AnimatorSet LJIILJJIL;
    public Function2<? super Integer, ? super UpvoteStruct, Unit> LJIILL;
    public Function0<Unit> LJIILLIIL;

    public final void LIZIZ() {
        AnimatorSet animatorSet;
        Animator animator;
        Animator animator2 = this.LJIILIIL;
        if (animator2 != null && animator2.isRunning() && (animator = this.LJIILIIL) != null) {
            animator.cancel();
        }
        AnimatorSet animatorSet2 = this.LJIILJJIL;
        if (animatorSet2 == null || !animatorSet2.isRunning() || (animatorSet = this.LJIILJJIL) == null) {
            return;
        }
        animatorSet.cancel();
    }

    public final void LIZJ(AbstractC420810Gel abstractC420810Gel) {
        int iHashCode;
        Integer numValueOf;
        LinearLayout followBtnContainer;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" handleWhiteBarClick: whiteBar: ");
        if (abstractC420810Gel != null) {
            iHashCode = abstractC420810Gel.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        sbLIZ.append(", style: ");
        if (abstractC420810Gel != null) {
            numValueOf = Integer.valueOf(abstractC420810Gel.getWhiteBarStyle());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        if (abstractC420810Gel != null) {
            int whiteBarStyle = abstractC420810Gel.getWhiteBarStyle();
            if (whiteBarStyle != 1) {
                if (whiteBarStyle == 3) {
                    if (abstractC420810Gel instanceof C428890Grn) {
                        ACListenerS124S0200000_21 aCListenerS124S0200000_21 = new ACListenerS124S0200000_21(abstractC420810Gel, this, 76);
                        C428890Grn c428890Grn = (C428890Grn) abstractC420810Gel;
                        TuxIconView followBtn = c428890Grn.getFollowBtn();
                        if (followBtn != null) {
                            ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(followBtn, EnumC700430Rdh.POSITIVE);
                        }
                        TuxIconView followBtn2 = c428890Grn.getFollowBtn();
                        if (followBtn2 != null) {
                            C786410Ut5.a9(followBtn2, aCListenerS124S0200000_21);
                        }
                        if (C298430Bmr.LIZ() && (followBtnContainer = c428890Grn.getFollowBtnContainer()) != null) {
                            C786410Ut5.R7(followBtnContainer, aCListenerS124S0200000_21);
                        }
                        ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(c428890Grn.getInfoArea(), EnumC700430Rdh.POSITIVE);
                        C786410Ut5.I7(new ACListenerS124S0200000_21(abstractC420810Gel, this, 75), c428890Grn.getInfoArea());
                        C2271391DvN.LIZ(c428890Grn.getFollowBtn(), C2271381DvM.LIZJ());
                        C2271391DvN.LIZ(c428890Grn.getInfoArea(), C2271381DvM.LIZJ());
                        C2271391DvN.LIZ(c428890Grn.getFollowBtnContainer(), C2271381DvM.LIZJ());
                        return;
                    }
                    View touchArea = abstractC420810Gel.getTouchArea();
                    if (touchArea != null) {
                        ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(touchArea, EnumC700430Rdh.POSITIVE);
                    }
                    View touchArea2 = abstractC420810Gel.getTouchArea();
                    if (touchArea2 != null) {
                        C786410Ut5.I7(new ACListenerS155S0100000_21(this, 236), touchArea2);
                    }
                    C2271391DvN.LIZ(abstractC420810Gel.getTouchArea(), C2271381DvM.LIZJ());
                    return;
                }
                return;
            }
            View touchArea3 = abstractC420810Gel.getTouchArea();
            if (touchArea3 != null) {
                ((IComponentStatus) ServiceManager.get().getService(IComponentStatus.class)).setComponentClickStatusExperimental(touchArea3, EnumC700430Rdh.POSITIVE);
            }
            View touchArea4 = abstractC420810Gel.getTouchArea();
            if (touchArea4 != null) {
                C786410Ut5.I7(new ACListenerS155S0100000_21(this, 235), touchArea4);
            }
            C2271391DvN.LIZ(abstractC420810Gel.getTouchArea(), C2271381DvM.LIZJ());
        }
    }

    public final void LIZLLL(Function0<Unit> function0) {
        LIZIZ();
        C420840Geo c420840Geo = this.LJFF;
        if (c420840Geo != null) {
            C786410Ut5.q1(c420840Geo);
        }
        C428890Grn c428890Grn = this.LJI;
        if (c428890Grn != null) {
            C786410Ut5.R1(c428890Grn, 8);
        }
        C1359990lUj c1359990lUj = this.LJII;
        if (c1359990lUj != null) {
            C786410Ut5.p1(c1359990lUj, 8);
        }
        this.LJIIIZ = this.LIZIZ.LLILZ;
        C420840Geo c420840Geo2 = this.LJFF;
        if (c420840Geo2 != null) {
            c420840Geo2.h0();
            this.LJIIIIZZ = 1;
        }
        Animator animatorLIZ = C420410Ge7.LIZ(this.LJFF, this.LJIILL);
        this.LJIILIIL = animatorLIZ;
        animatorLIZ.addListener(new ALAdapterS17S0100000_21(function0, 6));
        Animator animator = this.LJIILIIL;
        if (animator != null) {
            animator.start();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(java.lang.String r27) {
        /*
            Method dump skipped, instruction units count: 571
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359980lUi.LJ(java.lang.String):void");
    }

    public final void LJFF(boolean z) {
        AbstractC420810Gel curView;
        C428890Grn c428890Grn;
        C428890Grn c428890Grn2;
        AbstractC420810Gel nextView = null;
        if (C263730AVf.LIZ()) {
            this.LJIIJJI = z;
            C1359990lUj c1359990lUj = this.LJII;
            if (c1359990lUj != null) {
                curView = c1359990lUj.getCurView();
            } else {
                curView = null;
            }
            if ((curView instanceof C428890Grn) && (c428890Grn2 = (C428890Grn) curView) != null) {
                c428890Grn2.setDarkIcon(z);
            }
            C1359990lUj c1359990lUj2 = this.LJII;
            if (c1359990lUj2 != null && c1359990lUj2.LLJJJ) {
                nextView = c1359990lUj2.getNextView();
            }
            if ((nextView instanceof C428890Grn) && (c428890Grn = (C428890Grn) nextView) != null) {
                c428890Grn.setDarkIcon(z);
                return;
            }
            return;
        }
        C428890Grn c428890Grn3 = this.LJI;
        if (!(c428890Grn3 instanceof C428890Grn) || c428890Grn3 == null) {
            return;
        }
        c428890Grn3.setDarkIcon(z);
    }

    public final void LIZ(UpvoteList upvoteList, int i) {
        int iHashCode;
        long j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(hashCode());
        sbLIZ.append(" resetWhiteBarView: aid: ");
        sbLIZ.append(this.LIZIZ.LLILZ);
        sbLIZ.append(", targetWhiteBar: ");
        C428890Grn c428890Grn = this.LJI;
        if (c428890Grn != null) {
            iHashCode = c428890Grn.hashCode();
        } else {
            iHashCode = 0;
        }
        sbLIZ.append(iHashCode);
        C2188811AlT.LIZIZ(sbLIZ);
        List<UpvoteStruct> list = upvoteList.upvotes;
        long j2 = upvoteList.total;
        C428890Grn c428890Grn2 = this.LJI;
        if ((c428890Grn2 instanceof AbstractC429340GsW) && c428890Grn2 != null) {
            InterfaceC1360060lUq interfaceC1360060lUq = this.LJ;
            if (interfaceC1360060lUq != null) {
                interfaceC1360060lUq.LIZLLL();
            }
            if (C0RSD.LIZ() && ((Number) C0BNV.LIZ.getValue()).intValue() <= 0 && i > 0) {
                c428890Grn2.E0(i, j2, list);
            } else {
                C1360090lUt c1360090lUt = this.LIZLLL;
                c1360090lUt.getClass();
                if (i == 0) {
                    c1360090lUt.LIZLLL = System.nanoTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                }
                c428890Grn2.C0(this.LIZIZ.LLILZIL, list, j2);
                C1360090lUt c1360090lUt2 = this.LIZLLL;
                c1360090lUt2.getClass();
                if (i == 0) {
                    c1360090lUt2.LJ = System.nanoTime() / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
                    if (Intrinsics.LJFF(c1360090lUt2.LIZIZ, "bind")) {
                        j = -1;
                    } else {
                        j = c1360090lUt2.LIZLLL - c1360090lUt2.LIZJ;
                        if (j < 0) {
                            j = 0;
                        }
                    }
                    C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C2286508xb(j, c1360090lUt2.LJ - c1360090lUt2.LIZLLL, c1360090lUt2, null), 3);
                }
            }
            InterfaceC1360060lUq interfaceC1360060lUq2 = this.LJ;
            if (interfaceC1360060lUq2 != null) {
                interfaceC1360060lUq2.LJIIJ();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:62:0x00f9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C1359980lUi(android.widget.FrameLayout r6, com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew r7, java.lang.String r8, X.C1360090lUt r9, X.InterfaceC1360060lUq r10) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1359980lUi.<init>(android.widget.FrameLayout, com.ss.android.ugc.aweme.upvote.detail.UpvoteListViewModelNew, java.lang.String, X.0lUt, X.0lUq):void");
    }
}
