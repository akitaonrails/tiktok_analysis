package Y;

import X.AnonymousClass0810;
import X.AnonymousClass0811;
import X.C19P8;
import X.C1A6J;
import X.C1C7U;
import X.C21560319Zh;
import X.C21576919cN;
import X.C2179971ATj;
import X.C2188111AkL;
import X.C2189511Amb;
import X.C2254671DMr;
import X.C497740JfY;
import X.C844470XAv;
import X.EnumC21577619cU;
import X.RunnableC21577219cQ;
import android.animation.ValueAnimator;
import android.content.Context;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesSettingsPage;
import com.bytedance.android.livesdk.viewerwishestmp.settings.ViewerWishesVerticalCenterLayoutManager;
import com.bytedance.sysoptimizer.perflock.PerfLockBooster;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttvecamera.b0;
import com.ss.android.ugc.aweme.experiment.anr.FrameworkPerfLockParams;
import com.ss.android.ugc.aweme.feed.adapter.widget.hotcomment.PreviewHotCommentWidget;
import com.ss.android.ugc.aweme.feed.adapter.widget.serviceplus.PreviewServicePlusBottomInfoWidget;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import cx4.c;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes34.dex */
public class ARunnableS44S0101000_33 implements Runnable {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.$t) {
            case 0:
                run$0(this);
                break;
            case 1:
                run$1(this);
                break;
            case 2:
                run$2(this);
                break;
            case 3:
                run$3(this);
                break;
            case 4:
                run$4(this);
                break;
            case 5:
                run$5(this);
                break;
            case 6:
                run$6(this);
                break;
            case 7:
                run$7(this);
                break;
            case 8:
                run$8(this);
                break;
            case BdTuring.TYPE_ECAF /* 9 */:
                run$9(this);
                break;
            case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                run$10(this);
                break;
        }
    }

    public String toString() {
        return this.$t + "_" + super.toString();
    }

    public final void LIZ$0() {
        synchronized (((b0) this.l0).mStateLock) {
            try {
                if (((b0) this.l0).mCameraInstance == null) {
                    return;
                }
                boolean exposureCompensation = ((b0) this.l0).mCameraInstance.setExposureCompensation(this.i1);
                b0 b0Var = (b0) this.l0;
                if (b0Var.mFirstEC && exposureCompensation) {
                    b0Var.mCameraEvent.LJ(115, 0, "exposure compensation");
                    ((b0) this.l0).mFirstEC = false;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZ$1() {
        FrameworkPerfLockParams frameworkPerfLockParams = (FrameworkPerfLockParams) C2188111AkL.LIZ.getValue();
        if (frameworkPerfLockParams != null && frameworkPerfLockParams.enable) {
            C844470XAv.LIZ.getClass();
            PerfLockBooster.boostByFrameworkPerfLock(C844470XAv.LIZ(), frameworkPerfLockParams.type, frameworkPerfLockParams.perflockParmaString, this.i1);
            return;
        }
        AnonymousClass0811 anonymousClass0811 = AnonymousClass0810.LIZ;
        int i = anonymousClass0811.LIZJ;
        if (i == 2) {
            anonymousClass0811.LIZ(this.i1, (int[]) this.l0);
        } else if (i == 3) {
            anonymousClass0811.LIZ(this.i1, (int[]) this.l0);
        }
    }

    public final void LIZ$2() {
        c cVar = (c) this.l0;
        if (cVar.LLJJ) {
            int currentItem = cVar.LLJJLIIIJLLLLLLLZ.getCurrentItem();
            c cVar2 = (c) this.l0;
            cVar2.LLJJLIIIJLLLLLLLZ.setCurrentItem((this.i1 + currentItem) - cVar2.LJIIIZ(currentItem), ((c) this.l0).LLJJIJIIJIL);
        } else {
            cVar.LLJJJJ = Math.max(Math.min(cVar.LLJJJJ, ((CopyOnWriteArrayList) cVar.LLJLLIL).size()), 0);
            c cVar3 = (c) this.l0;
            cVar3.LLJJLIIIJLLLLLLLZ.setCurrentItem(cVar3.LLJJJJ, cVar3.LLJJIJIIJIL);
        }
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final void LIZ$3() {
        if (((C1A6J) this.l0).LJIILIIL()) {
            return;
        }
        C1A6J c1a6j = (C1A6J) this.l0;
        int i = c1a6j.LLILZ.LIZ;
        if (c1a6j.LLJJ.LJ()) {
            ((C1A6J) this.l0).LJFF();
            return;
        }
        int i2 = this.i1 * i;
        int iMin = Math.min(i, ((C1A6J) this.l0).LLILZIL.size() - i2);
        C1A6J c1a6j2 = (C1A6J) this.l0;
        c1a6j2.LLJJ.LJI(3, i2, iMin, c1a6j2.LL, c1a6j2.LLJJI);
    }

    public final void LIZ$4() {
        C21560319Zh c21560319ZhLJFF;
        ValueAnimator valueAnimatorLIZ;
        C21576919cN c21576919cN = ((RunnableC21577219cQ) this.l0).LLILZIL;
        if (!c21576919cN.LLLFFI || this.i1 >= 0) {
            c21560319ZhLJFF = null;
        } else {
            c21560319ZhLJFF = c21576919cN.LLLLLJLJLL.LJFF(c21576919cN.LLILLJJLI);
            if (c21560319ZhLJFF != null) {
                c21560319ZhLJFF.onAnimationUpdate(ValueAnimator.ofInt(0, 0));
            }
        }
        ALAdapterS27S0100000_33 aLAdapterS27S0100000_33 = new ALAdapterS27S0100000_33(this, 26);
        RunnableC21577219cQ runnableC21577219cQ = (RunnableC21577219cQ) this.l0;
        C21576919cN c21576919cN2 = runnableC21577219cQ.LLILZIL;
        int i = c21576919cN2.LLILLJJLI;
        if (i <= 0) {
            if (c21560319ZhLJFF != null || i == 0) {
                ValueAnimator valueAnimator = c21576919cN2.LLLLZI;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                    ((RunnableC21577219cQ) this.l0).LLILZIL.LLLLZI = null;
                }
                ((RunnableC21577219cQ) this.l0).LLILZIL.LLLLLLJ.LIZIZ(0, false);
                ((RunnableC21577219cQ) this.l0).LLILZIL.LLLLLLJ.LIZJ(EnumC21577619cU.None);
            } else if (runnableC21577219cQ.LLILLL && c21576919cN2.LLJLLL) {
                int i2 = -c21576919cN2.LLLLIILL;
                if (i >= i2) {
                    c21576919cN2.LJIILIIL(EnumC21577619cU.None);
                } else {
                    valueAnimatorLIZ = c21576919cN2.LLLLLLJ.LIZ(i2);
                }
            } else {
                valueAnimatorLIZ = c21576919cN2.LLLLLLJ.LIZ(0);
            }
            aLAdapterS27S0100000_33.onAnimationEnd(null);
        }
        valueAnimatorLIZ = c21576919cN2.LLLLLLJ.LIZ(0);
        if (valueAnimatorLIZ != null) {
            valueAnimatorLIZ.addListener(aLAdapterS27S0100000_33);
            return;
        }
        aLAdapterS27S0100000_33.onAnimationEnd(null);
    }

    public static final void run$0(ARunnableS44S0101000_33 aRunnableS44S0101000_33) {
        boolean zLIZ;
        C1C7U.LIZ("ViewerWishesSettingsPage@5f7d.scrollToPosition$1");
        try {
            Context context = ((ViewerWishesSettingsPage) aRunnableS44S0101000_33.l0).getContext();
            if (context != null) {
                C2189511Amb c2189511Amb = new C2189511Amb(context, 0);
                c2189511Amb.LIZ = aRunnableS44S0101000_33.i1;
                ViewerWishesVerticalCenterLayoutManager viewerWishesVerticalCenterLayoutManager = ((ViewerWishesSettingsPage) aRunnableS44S0101000_33.l0).LLLL;
                if (viewerWishesVerticalCenterLayoutManager != null) {
                    viewerWishesVerticalCenterLayoutManager.startSmoothScroll(c2189511Amb);
                }
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("ViewerWishesSettingsPage@5f7d.scrollToPosition$1");
    }

    public static final void run$1(ARunnableS44S0101000_33 aRunnableS44S0101000_33) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.setSceneMode$1");
        try {
            if (((b0) aRunnableS44S0101000_33.l0).mCameraInstance != null) {
                ((b0) aRunnableS44S0101000_33.l0).mCameraInstance.LJLIL(aRunnableS44S0101000_33.i1);
            }
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.setSceneMode$1");
    }

    public static final void run$10(ARunnableS44S0101000_33 aRunnableS44S0101000_33) {
        boolean zLIZ;
        C1C7U.LIZ("SmartRefreshLayout@e706.finishLoadMore$1$1");
        try {
            aRunnableS44S0101000_33.LIZ$4();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SmartRefreshLayout@e706.finishLoadMore$1$1");
    }

    public static final void run$2(ARunnableS44S0101000_33 aRunnableS44S0101000_33) {
        boolean zLIZ;
        C1C7U.LIZ("TECameraServer@d252.setExposureCompensation$1");
        try {
            aRunnableS44S0101000_33.LIZ$0();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECameraServer@d252.setExposureCompensation$1");
    }

    public static final void run$3(ARunnableS44S0101000_33 aRunnableS44S0101000_33) {
        boolean zLIZ;
        C1C7U.LIZ("TECamera1@41d9.switchFlashMode$1");
        try {
            ((C2254671DMr) aRunnableS44S0101000_33.l0).LIZ(aRunnableS44S0101000_33.i1);
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("TECamera1@41d9.switchFlashMode$1");
    }

    public static final void run$4(ARunnableS44S0101000_33 aRunnableS44S0101000_33) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewHotCommentWidget@4fa4.startMarquee$1$2");
        try {
            PreviewHotCommentWidget previewHotCommentWidget = (PreviewHotCommentWidget) aRunnableS44S0101000_33.l0;
            previewHotCommentWidget.LLJJ = true;
            previewHotCommentWidget.Q1().LIZ(aRunnableS44S0101000_33.i1, (int) C497740JfY.LIZIZ(40));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewHotCommentWidget@4fa4.startMarquee$1$2");
    }

    public static final void run$5(ARunnableS44S0101000_33 aRunnableS44S0101000_33) {
        boolean zLIZ;
        C1C7U.LIZ("OptimizerHelper@3f44.perfLockAcquire$1");
        try {
            aRunnableS44S0101000_33.LIZ$1();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("OptimizerHelper@3f44.perfLockAcquire$1");
    }

    public static final void run$6(ARunnableS44S0101000_33 aRunnableS44S0101000_33) {
        boolean zLIZ;
        C1C7U.LIZ("Banner@32b5.setCurrentItem$1");
        try {
            aRunnableS44S0101000_33.LIZ$2();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("Banner@32b5.setCurrentItem$1");
    }

    public static final void run$7(ARunnableS44S0101000_33 aRunnableS44S0101000_33) {
        C19P8 c19p8 = (C19P8) aRunnableS44S0101000_33.l0;
        int i = aRunnableS44S0101000_33.i1;
        C1C7U.LIZ("AdjustPercentBar@3327.setOnLevelChangeListener$1$onFreeze$1L");
        c19p8.LIZ(i);
        C1C7U.LIZIZ("AdjustPercentBar@3327.setOnLevelChangeListener$1$onFreeze$1L");
    }

    public static final void run$8(ARunnableS44S0101000_33 aRunnableS44S0101000_33) {
        try {
            aRunnableS44S0101000_33.LIZ$3();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            if (!C2179971ATj.LIZ(th)) {
                throw th;
            }
        }
    }

    public static final void run$9(ARunnableS44S0101000_33 aRunnableS44S0101000_33) {
        boolean zLIZ;
        C1C7U.LIZ("PreviewServicePlusBottomInfoWidget@35a6.startMarquee$1$2");
        try {
            PreviewServicePlusBottomInfoWidget previewServicePlusBottomInfoWidget = (PreviewServicePlusBottomInfoWidget) aRunnableS44S0101000_33.l0;
            previewServicePlusBottomInfoWidget.LLJIJIL = true;
            previewServicePlusBottomInfoWidget.M1().LIZ(aRunnableS44S0101000_33.i1, (int) C497740JfY.LIZIZ(40));
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("PreviewServicePlusBottomInfoWidget@35a6.startMarquee$1$2");
    }

    public ARunnableS44S0101000_33(int i, int i2) {
        this.$t = i2;
        this.i1 = i;
        this.l0 = null;
    }

    public ARunnableS44S0101000_33(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
