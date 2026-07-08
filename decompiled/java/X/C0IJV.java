package X;

import Y.AObjectS350S0100000_7;
import Y.AUListenerS257S0100000_7;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.ILiveNewStyleCardWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteLynxWidget;
import com.bytedance.android.livesdk.chatroom.ui.extracard.promotelive.widget.LivePromoteParentWidget;
import com.bytedance.android.livesdk.dataChannel.GoLiveCardShowing;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveEasyExitCardConfig;
import com.bytedance.android.livesdk.livesetting.roomfunction.LivePromoteCardGestureOptimize;
import com.bytedance.android.widget.WidgetManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AwS551S0100000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IJV, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public abstract class C0IJV {
    public final ViewGroup LIZ;
    public final Context LIZIZ;
    public C0IEF LIZJ;
    public boolean LIZLLL;
    public Boolean LJ;
    public WidgetManager LJFF;
    public ILiveNewStyleCardWidget LJI;
    public boolean LJIIIZ;
    public float LJIIJJI;
    public ValueAnimator LJIIL;
    public AObjectS350S0100000_7 LJIILIIL;
    public boolean LJIILJJIL;
    public boolean LJIILL;
    public final C01GW LJII = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(246));
    public final C01GW LJIIIIZZ = C452501pT.LIZIZ(new AwS551S0100000_7(this, 591));
    public final long LJIIJ = 300;
    public C0IJY LJIILLIIL = C0IJY.LLILLJJLI;

    public final C424960GlS LJ() {
        return (C424960GlS) this.LJIIIIZZ.getValue();
    }

    public final float LJFF() {
        return this.LIZ.getHeight();
    }

    public final boolean LJII() {
        return (this.LJI instanceof LivePromoteParentWidget) && LivePromoteCardGestureOptimize.INSTANCE.enable();
    }

    public final void LJIILIIL() {
        C20441214yg.LJIIIZ("ILiveExtraCardManager", "releaseCard");
        C786410Ut5.LJJJLZIJ(LJ(), this.LIZ);
        WidgetManager widgetManager = this.LJFF;
        if (widgetManager != null) {
            widgetManager.unload(this.LJI);
        }
        this.LJI = null;
        LJIIIIZZ(C0IJW.LLILZLL);
        this.LIZJ = null;
        this.LJ = Boolean.TRUE;
        if (((LiveEasyExitCardConfig) this.LJII.getValue()).reuseExtraCardContainer) {
            C424960GlS c424960GlSLJ = LJ();
            ArrayList arrayList = (ArrayList) C464410IJb.LIZ;
            if (!arrayList.contains(c424960GlSLJ)) {
                c424960GlSLJ.LIZ();
                arrayList.add(c424960GlSLJ);
            }
        }
        if (this.LJI instanceof LivePromoteLynxWidget) {
            C470260IcK.LIZ();
        }
    }

    public final void LIZJ() {
        if (LJII()) {
            ValueAnimator valueAnimator = this.LJIIL;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            LIZIZ(0.0f);
            this.LJ = Boolean.FALSE;
            LJIIIIZZ(C0IJW.LLILZLL);
            return;
        }
        C424960GlS c424960GlSLJ = LJ();
        int visibility = c424960GlSLJ.getVisibility();
        c424960GlSLJ.setVisibility(8);
        C1602160rnK.LIZIZ(visibility, 8, c424960GlSLJ);
        C424960GlS c424960GlSLJ2 = LJ();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424960GlSLJ2);
        c424960GlSLJ2.setTranslationY(0.0f);
        C20441214yg.LJIIIZ("ILiveExtraCardManager", "releaseCard");
        C786410Ut5.LJJJLZIJ(LJ(), this.LIZ);
        WidgetManager widgetManager = this.LJFF;
        if (widgetManager != null) {
            widgetManager.unload(this.LJI);
        }
        this.LJI = null;
        this.LIZJ = null;
        this.LJ = Boolean.TRUE;
        if (((LiveEasyExitCardConfig) this.LJII.getValue()).reuseExtraCardContainer) {
            C424960GlS c424960GlSLJ3 = LJ();
            ArrayList arrayList = (ArrayList) C464410IJb.LIZ;
            if (!arrayList.contains(c424960GlSLJ3)) {
                c424960GlSLJ3.LIZ();
                arrayList.add(c424960GlSLJ3);
            }
        }
        if (this.LJI instanceof LivePromoteLynxWidget) {
            C470260IcK.LIZ();
        }
    }

    public final void LJIILJJIL() {
        if (LJII()) {
            LIZ(1.0f, new AwS551S0100000_7(this, 590));
            ((ArrayList) LJ().LLILZIL).clear();
            ((ArrayList) LJ().LLILZIL).add(new InterfaceC424970GlT() { // from class: X.0IIq
                @Override // X.InterfaceC424970GlT
                public final void LIZ() {
                    this.LIZ.LJIIL(true, false);
                }
            });
            LJ().getParent().requestDisallowInterceptTouchEvent(true);
            this.LJ = Boolean.FALSE;
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<View> it2 = new C09RD(this.LIZ).iterator();
        while (true) {
            C09RE c09re = (C09RE) it2;
            if (!c09re.hasNext()) {
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                animatorSet.setDuration(this.LJIIJ);
                animatorSet.addListener(new C464420IJc() { // from class: X.0IJX
                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                    public final void onAnimationEnd(Animator animator) {
                        ILiveNewStyleCardWidget iLiveNewStyleCardWidget = this.LL.LJI;
                        if ((iLiveNewStyleCardWidget instanceof InterfaceC464250IIl) && iLiveNewStyleCardWidget != null) {
                            iLiveNewStyleCardWidget.t0();
                        }
                        this.LL.LJIIIZ(C0IJW.LLILLJJLI);
                    }

                    @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                    public final void onAnimationStart(Animator animator) {
                        C500260Jjc.LLFFF(this.LL.LJ());
                    }
                });
                animatorSet.start();
                ((ArrayList) LJ().LLILZIL).clear();
                ((ArrayList) LJ().LLILZIL).add(new InterfaceC424970GlT() { // from class: X.0IIr
                    @Override // X.InterfaceC424970GlT
                    public final void LIZ() {
                        this.LIZ.LJIIL(true, false);
                    }
                });
                LJ().getParent().requestDisallowInterceptTouchEvent(true);
                this.LJ = Boolean.FALSE;
                return;
            }
            Object next = c09re.next();
            if (Intrinsics.LJFF(next, LJ())) {
                arrayList.add(ObjectAnimator.ofFloat(next, (Property<Object, Float>) View.TRANSLATION_Y, LJFF(), 0.0f));
            } else if (this.LJI instanceof LivePromoteParentWidget) {
                arrayList.add(ObjectAnimator.ofFloat(next, (Property<Object, Float>) View.TRANSLATION_Y, 0.0f, (-LJFF()) - C497740JfY.LJIJ()));
            } else {
                arrayList.add(ObjectAnimator.ofFloat(next, (Property<Object, Float>) View.TRANSLATION_Y, 0.0f, -LJFF()));
            }
        }
    }

    public final void LIZIZ(float f) {
        float fLJFF;
        this.LJIIJJI = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        C500260Jjc.LLFFF(LJ());
        float fLJFF2 = (1.0f - this.LJIIJJI) * LJFF();
        for (View view : new C09RD(this.LIZ)) {
            if (Intrinsics.LJFF(view, LJ())) {
                C786410Ut5.ed(view, fLJFF2);
            } else {
                if (this.LJI instanceof LivePromoteParentWidget) {
                    fLJFF = LJFF() + C497740JfY.LJIJ();
                } else {
                    fLJFF = LJFF();
                }
                C786410Ut5.ed(view, (-this.LJIIJJI) * fLJFF);
            }
        }
    }

    public final void LIZLLL(float f) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        if (fLIZLLL == 1.0f) {
            LJIIIZ(C0IJW.LLILLL);
        } else {
            if (fLIZLLL != 0.0f) {
                return;
            }
            LJIIIIZZ(C0IJW.LLILZ);
        }
    }

    public final void LJIIIIZZ(C0IJW c0ijw) {
        this.LJIILL = false;
        this.LIZLLL = false;
        AObjectS350S0100000_7 aObjectS350S0100000_7 = this.LJIILIIL;
        if (aObjectS350S0100000_7 != null) {
            aObjectS350S0100000_7.invoke(Boolean.FALSE);
        }
        LJIIJJI(c0ijw);
    }

    public final void LJIIIZ(C0IJW c0ijw) {
        this.LJIILL = true;
        this.LIZLLL = true;
        AObjectS350S0100000_7 aObjectS350S0100000_7 = this.LJIILIIL;
        if (aObjectS350S0100000_7 != null) {
            aObjectS350S0100000_7.invoke(Boolean.TRUE);
        }
        LJIIJJI(c0ijw);
        ILiveNewStyleCardWidget iLiveNewStyleCardWidget = this.LJI;
        if ((iLiveNewStyleCardWidget instanceof InterfaceC464250IIl) && iLiveNewStyleCardWidget != null) {
            iLiveNewStyleCardWidget.t0();
        }
    }

    public final void LJIIJ(boolean z) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onHostVisibilityChanged visible=");
        sbLIZ.append(z);
        sbLIZ.append(" hostUserVisible=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(" cardFullyShown=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(" state=");
        sbLIZ.append(this.LJIILLIIL);
        C20441214yg.LIZIZ("ILiveExtraCardManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIILJJIL != z) {
            this.LJIILJJIL = z;
            LJIIJJI(C0IJW.LL);
        }
    }

    public final void LJIIJJI(C0IJW c0ijw) {
        C0IEB c0ieb;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("reconcile before reason=");
        sbLIZ.append(c0ijw);
        sbLIZ.append(" hostUserVisible=");
        sbLIZ.append(this.LJIILJJIL);
        sbLIZ.append(" cardFullyShown=");
        sbLIZ.append(this.LJIILL);
        sbLIZ.append(" state=");
        sbLIZ.append(this.LJIILLIIL);
        C20441214yg.LIZIZ("ILiveExtraCardManager", C2188811AlT.LIZIZ(sbLIZ));
        if (this.LJIILJJIL && this.LJIILL) {
            C0IJY c0ijy = this.LJIILLIIL;
            C0IJY c0ijy2 = C0IJY.LL;
            if (c0ijy != c0ijy2) {
                C0IEF c0ief = this.LIZJ;
                if (c0ief != null) {
                    c0ief.LIZ();
                }
                this.LJIILLIIL = c0ijy2;
            }
        } else {
            C0IJY c0ijy3 = this.LJIILLIIL;
            C0IJY c0ijy4 = C0IJY.LLILLJJLI;
            if (c0ijy3 != c0ijy4) {
                C0IEF c0ief2 = this.LIZJ;
                if (c0ief2 != null) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onCardDismiss: fragment hs = ");
                    sbLIZ2.append(c0ief2.LIZLLL.hashCode());
                    C827750WdZ.LIZJ("LivePlayFragment", C2188811AlT.LIZIZ(sbLIZ2));
                    C464260IIm c464260IIm = c0ief2.LIZLLL.m0;
                    if ((c464260IIm == null || !c464260IIm.LJII() || !c464260IIm.LJIILL) && (c0ieb = c0ief2.LIZLLL.LLLFZ) != null) {
                        c0ief2.LIZ = false;
                        c0ieb.setMuteNew(false, "dismiss extra card");
                        c0ief2.LIZLLL.LLLFZ.unRegisterMuteFilter(c0ief2.LIZIZ);
                    }
                    DataChannel dataChannel = c0ief2.LIZLLL.y;
                    if (dataChannel != null) {
                        dataChannel.zW(GoLiveCardShowing.class, Boolean.FALSE);
                    }
                }
                this.LJIILLIIL = c0ijy4;
            }
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("reconcile reason=");
        sbLIZ3.append(c0ijw);
        sbLIZ3.append(" hostUserVisible=");
        sbLIZ3.append(this.LJIILJJIL);
        sbLIZ3.append(" cardFullyShown=");
        sbLIZ3.append(this.LJIILL);
        sbLIZ3.append(" state=");
        sbLIZ3.append(this.LJIILLIIL);
        C20441214yg.LIZIZ("ILiveExtraCardManager", C2188811AlT.LIZIZ(sbLIZ3));
    }

    public C0IJV(Context context, ViewGroup viewGroup) {
        this.LIZ = viewGroup;
        this.LIZIZ = context;
    }

    public final void LIZ(float f, final Function0<Unit> function0) {
        float f2 = this.LJIIJJI;
        final float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        if (Math.abs(f2 - fLIZLLL) < 0.001f) {
            LIZIZ(fLIZLLL);
            LIZLLL(fLIZLLL);
            if (function0 != null) {
                function0.invoke();
                return;
            }
            return;
        }
        ValueAnimator valueAnimator = this.LJIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        float fAbs = Math.abs(fLIZLLL - f2);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(f2, fLIZLLL);
        long j = (long) (this.LJIIJ * fAbs);
        if (j < 120) {
            j = 120;
        }
        valueAnimatorOfFloat.setDuration(j);
        valueAnimatorOfFloat.addUpdateListener(new AUListenerS257S0100000_7(this, 13));
        valueAnimatorOfFloat.addListener(new C464420IJc() { // from class: X.0IJZ
            @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator) {
                this.LL.getClass();
                this.LL.LIZLLL(fLIZLLL);
                Function0<Unit> function02 = function0;
                if (function02 != null) {
                    function02.invoke();
                }
            }
        });
        valueAnimatorOfFloat.start();
        this.LJIIL = valueAnimatorOfFloat;
    }

    public void LJI(ILiveNewStyleCardWidget iLiveNewStyleCardWidget, RecyclableWidgetManager recyclableWidgetManager) {
        View c20516015Pq;
        this.LJIIIZ = false;
        if (!Intrinsics.LJFF(LJ().getParent(), this.LIZ)) {
            this.LIZ.addView(LJ(), -1, -1);
        }
        C424960GlS c424960GlSLJ = LJ();
        float fLJFF = LJFF();
        ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c424960GlSLJ);
        c424960GlSLJ.setTranslationY(fLJFF);
        Object objLJIIL = C09RB.LJIIL(new C09RD(LJ()));
        if (!(objLJIIL instanceof C20516015Pq) || (c20516015Pq = (View) objLJIIL) == null) {
            c20516015Pq = new C20516015Pq(this.LIZIZ, null, 6);
            c20516015Pq.setId(View.generateViewId());
            C424960GlS c424960GlSLJ2 = LJ();
            RemoveViewCausedNPEChecker.recordViewRemovedPoint(c424960GlSLJ2, null);
            c424960GlSLJ2.removeAllViews();
            LJ().addView(c20516015Pq);
        }
        recyclableWidgetManager.load(c20516015Pq.getId(), iLiveNewStyleCardWidget);
        this.LJFF = recyclableWidgetManager;
        this.LJI = iLiveNewStyleCardWidget;
        this.LJIILL = false;
        this.LJIILJJIL = false;
        this.LJIILLIIL = C0IJY.LLILLJJLI;
        new AwS551S0100000_7(this, 592);
        ILiveNewStyleCardWidget iLiveNewStyleCardWidget2 = this.LJI;
        if (iLiveNewStyleCardWidget2 != null) {
            iLiveNewStyleCardWidget2.LL = new AwS551S0100000_7(this, 593);
        }
    }

    public final void LJIIL(boolean z, boolean z2) {
        this.LJIIIZ = z2;
        if (LJII() && !z2) {
            if (!z) {
                ValueAnimator valueAnimator = this.LJIIL;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                LIZIZ(0.0f);
                this.LJ = Boolean.FALSE;
                LJIIIIZZ(C0IJW.LLILZLL);
                return;
            }
            LIZ(0.0f, new AwS551S0100000_7(this, 589));
            return;
        }
        if (!z) {
            Iterator<View> it2 = new C09RD(this.LIZ).iterator();
            while (true) {
                C09RE c09re = (C09RE) it2;
                if (c09re.hasNext()) {
                    C786410Ut5.ed((View) c09re.next(), 0.0f);
                } else {
                    LJIILIIL();
                    return;
                }
            }
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator<View> it3 = new C09RD(this.LIZ).iterator();
            while (true) {
                C09RE c09re2 = (C09RE) it3;
                if (c09re2.hasNext()) {
                    View view = (View) c09re2.next();
                    if (!Intrinsics.LJFF(view, LJ())) {
                        arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, view.getTranslationY(), 0.0f));
                    } else {
                        arrayList.add(ObjectAnimator.ofFloat(view, (Property<View, Float>) View.TRANSLATION_Y, 0.0f, LJFF()));
                    }
                } else {
                    AnimatorSet animatorSet = new AnimatorSet();
                    animatorSet.playTogether(arrayList);
                    animatorSet.setDuration(this.LJIIJ);
                    animatorSet.addListener(new C464420IJc() { // from class: X.0IJa
                        @Override // X.C464420IJc, android.animation.Animator.AnimatorListener
                        public final void onAnimationEnd(Animator animator) {
                            this.LL.LJIILIIL();
                        }
                    });
                    animatorSet.start();
                    return;
                }
            }
        }
    }
}
