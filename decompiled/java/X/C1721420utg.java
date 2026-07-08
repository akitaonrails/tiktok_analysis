package X;

import X.C08CK;
import X.C1295960jpS;
import Y.ALAdapterS3S0000000_26;
import Y.ARunnableS59S0300000_26;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.FrameLayout;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.pipo.stellar.base.model.Lottie;
import com.bytedance.pipo.stellar.base.model.LottieDO;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0utg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1721420utg extends AbstractC1720840usk<LottieDO> {
    public C1295960jpS LLILZ;
    public C1390410mHn LLILZIL;
    public String LLILZLL;
    public boolean LLIZ;
    public boolean LLIZLLLIL;
    public Float LLJ;
    public final C1735430vGH LLJI;
    public final C1776130wJv LLJIJIL;
    public final C1776130wJv LLJILJIL;
    public boolean LLJILJILJ;

    @Override // X.AbstractC1720840usk
    public final int LJ() {
        return R.layout.adx;
    }

    @Override // X.AbstractC1720840usk, X.InterfaceC1720770usd
    public final void LIZJ() {
        if (this.LLIZ) {
            this.LLIZLLLIL = true;
            this.LLJI.LJFF();
            View view = this.LLILLJJLI;
            C1292030jj7<C1294720jnS> c1292030jj7LJIIJJI = C1294250jmh.LJIIJJI(view != null ? view.getContext() : null, this.LLILZLL);
            c1292030jj7LJIIJJI.LIZIZ(this.LLJIJIL);
            c1292030jj7LJIIJJI.LIZ(this.LLJILJIL);
            C337180DJs.LIZJ(this.LLILZIL);
            C1390410mHn c1390410mHn = this.LLILZIL;
            if (c1390410mHn != null) {
                c1390410mHn.LIZJ();
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean LJII() {
        Integer autoPlay;
        LottieDO lottieDO = (LottieDO) this.LLILLL;
        boolean z = false;
        if (lottieDO != null && (autoPlay = lottieDO.getAutoPlay()) != null && autoPlay.intValue() == 0) {
            z = true;
        }
        return !z;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.0utT] */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.0wJv] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.0wJv] */
    public C1721420utg() {
        SettingsManager.LIZLLL().getClass();
        final long jLJ = SettingsManager.LJ("pipo_stellar_lottie_timeout_duration", 10000);
        final ?? r1 = new InterfaceC1735440vGI() { // from class: X.0utT
            @Override // X.InterfaceC1735440vGI
            public final void LJJI(long j) {
            }

            @Override // X.InterfaceC1735440vGI
            public final void onStart() {
            }

            @Override // X.InterfaceC1735440vGI
            public final void LIZLLL() {
                C1092580eXQ.LIZIZ(EnumC1721270utR.TIME_OUT, "MSG_TYPE_LOTTIE_STATUS_UPDATE");
            }
        };
        this.LLJI = new C1735430vGH(jLJ, r1) { // from class: X.0uti
        };
        final int i = 1;
        this.LLJIJIL = new InterfaceC1292040jj8(this, i) { // from class: X.0wJv
            public final int $t;
            public Object l0;

            @Override // X.InterfaceC1292040jj8
            public final void onResult(Object obj) {
                switch (this.$t) {
                    case 0:
                        onResult$0(this, obj);
                        break;
                    case 1:
                        onResult$1(this, obj);
                        break;
                }
            }

            {
                this.$t = i;
                this.l0 = this;
            }

            public static final void onResult$0(C1776130wJv c1776130wJv, Object obj) {
                View view = ((C1721420utg) c1776130wJv.l0).LLILLJJLI;
                if (view != null && view.isAttachedToWindow()) {
                    C1092580eXQ.LIZIZ(EnumC1721270utR.LOAD_FAIL, "MSG_TYPE_LOTTIE_STATUS_UPDATE");
                }
            }

            public static final void onResult$1(C1776130wJv c1776130wJv, Object obj) {
                LifecycleOwner lifecycleOwnerLJFF;
                final Lifecycle lifecycle;
                C1294720jnS c1294720jnS = (C1294720jnS) obj;
                if (c1294720jnS != null) {
                    final C1721420utg c1721420utg = (C1721420utg) c1776130wJv.l0;
                    C1295960jpS c1295960jpS = c1721420utg.LLILZ;
                    if (c1295960jpS != null) {
                        c1295960jpS.setComposition(c1294720jnS);
                    }
                    AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ();
                    if (abstractC1387200mCcLIZJ != null && (lifecycleOwnerLJFF = abstractC1387200mCcLIZJ.LJFF()) != null && (lifecycle = lifecycleOwnerLJFF.getLifecycle()) != null) {
                        Lifecycle.State currentState = lifecycle.getCurrentState();
                        if (currentState != null && currentState.isAtLeast(Lifecycle.State.RESUMED)) {
                            c1721420utg.LJI();
                        } else {
                            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.pipo.stellar.base.card.LottieCard$playListener$1$onResult$1$1
                                @Override // androidx.lifecycle.LifecycleEventObserver
                                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                    if (event == Lifecycle.Event.ON_RESUME) {
                                        c1721420utg.LJI();
                                        lifecycle.removeObserver(this);
                                    }
                                }
                            });
                        }
                    }
                }
            }
        };
        final int i2 = 0;
        this.LLJILJIL = new InterfaceC1292040jj8(this, i2) { // from class: X.0wJv
            public final int $t;
            public Object l0;

            @Override // X.InterfaceC1292040jj8
            public final void onResult(Object obj) {
                switch (this.$t) {
                    case 0:
                        onResult$0(this, obj);
                        break;
                    case 1:
                        onResult$1(this, obj);
                        break;
                }
            }

            {
                this.$t = i2;
                this.l0 = this;
            }

            public static final void onResult$0(C1776130wJv c1776130wJv, Object obj) {
                View view = ((C1721420utg) c1776130wJv.l0).LLILLJJLI;
                if (view != null && view.isAttachedToWindow()) {
                    C1092580eXQ.LIZIZ(EnumC1721270utR.LOAD_FAIL, "MSG_TYPE_LOTTIE_STATUS_UPDATE");
                }
            }

            public static final void onResult$1(C1776130wJv c1776130wJv, Object obj) {
                LifecycleOwner lifecycleOwnerLJFF;
                final Lifecycle lifecycle;
                C1294720jnS c1294720jnS = (C1294720jnS) obj;
                if (c1294720jnS != null) {
                    final C1721420utg c1721420utg = (C1721420utg) c1776130wJv.l0;
                    C1295960jpS c1295960jpS = c1721420utg.LLILZ;
                    if (c1295960jpS != null) {
                        c1295960jpS.setComposition(c1294720jnS);
                    }
                    AbstractC1387200mCc abstractC1387200mCcLIZJ = C1717770unn.LIZIZ().LIZJ();
                    if (abstractC1387200mCcLIZJ != null && (lifecycleOwnerLJFF = abstractC1387200mCcLIZJ.LJFF()) != null && (lifecycle = lifecycleOwnerLJFF.getLifecycle()) != null) {
                        Lifecycle.State currentState = lifecycle.getCurrentState();
                        if (currentState != null && currentState.isAtLeast(Lifecycle.State.RESUMED)) {
                            c1721420utg.LJI();
                        } else {
                            lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.pipo.stellar.base.card.LottieCard$playListener$1$onResult$1$1
                                @Override // androidx.lifecycle.LifecycleEventObserver
                                public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                    if (event == Lifecycle.Event.ON_RESUME) {
                                        c1721420utg.LJI();
                                        lifecycle.removeObserver(this);
                                    }
                                }
                            });
                        }
                    }
                }
            }
        };
    }

    public final void LJI() {
        if (LJII()) {
            C1295960jpS c1295960jpS = this.LLILZ;
            if (c1295960jpS != null) {
                c1295960jpS.playAnimation();
            }
        } else {
            C1295960jpS c1295960jpS2 = this.LLILZ;
            if (c1295960jpS2 != null) {
                c1295960jpS2.pauseAnimation();
            }
            C1295960jpS c1295960jpS3 = this.LLILZ;
            if (c1295960jpS3 != null) {
                Float f = this.LLJ;
                c1295960jpS3.setProgress(f != null ? f.floatValue() : 0.0f);
            }
        }
        C1390410mHn c1390410mHn = this.LLILZIL;
        if (c1390410mHn != null) {
            c1390410mHn.LIZLLL();
        }
        C337180DJs.LIZ(this.LLILZIL);
        this.LLJI.LIZ();
    }

    @Override // X.AbstractC1720840usk
    public final void LJFF(View view, LottieDO lottieDO, EnumC1720670usT enumC1720670usT) {
        LifecycleOwner lifecycleOwner;
        Lifecycle lifecycle;
        final float fFloatValue;
        C1295960jpS c1295960jpS;
        Float fLJIIIIZZ;
        float fFloatValue2;
        float fFloatValue3;
        Context context;
        Resources resources;
        DisplayMetrics displayMetrics;
        Float fValueOf;
        Integer num;
        Float fLJIIIIZZ2;
        Float fLJIIIIZZ3;
        LottieDO lottieDO2 = lottieDO;
        super.LJFF(view, lottieDO2, enumC1720670usT);
        String str = null;
        this.LLJ = null;
        C1721300utU c1721300utU = C1721300utU.LIZ;
        Context context2 = view.getContext();
        c1721300utU.getClass();
        if (C1721300utU.LJFF(context2)) {
            Lottie dark = lottieDO2.getDark();
            if (dark != null) {
                str = dark.lottieUrl;
            }
        } else {
            Lottie light = lottieDO2.getLight();
            if (light != null) {
                str = light.lottieUrl;
            }
        }
        this.LLILZLL = str;
        C1295960jpS c1295960jpS2 = (C1295960jpS) view.findViewById(R.id.nru);
        this.LLILZ = c1295960jpS2;
        if (c1295960jpS2 != null) {
            c1295960jpS2.setIgnoreDisabledSystemAnimations(true);
        }
        this.LLILZIL = (C1390410mHn) view.findViewById(R.id.nl1);
        HandlerHook.viewPost(view, new ARunnableS59S0300000_26(view, lottieDO2, this, 7));
        C1295960jpS c1295960jpS3 = this.LLILZ;
        if (c1295960jpS3 != null) {
            C786410Ut5.s6(c1295960jpS3, new FrameLayout.LayoutParams(C1721300utU.LJJIII(view.getContext(), lottieDO2.getWidth()), C1721300utU.LJIILLIIL(view.getContext(), lottieDO2.getHeight())));
        }
        try {
            if (Intrinsics.LJFF(C1721430uth.LIZ().forceScale, Boolean.TRUE)) {
                String width = lottieDO2.getWidth();
                if (width != null && (fLJIIIIZZ3 = C2327809Ae.LJIIIIZZ(width)) != null) {
                    fFloatValue2 = fLJIIIIZZ3.floatValue();
                } else {
                    fFloatValue2 = 0.0f;
                }
                String height = lottieDO2.getHeight();
                if (height != null && (fLJIIIIZZ2 = C2327809Ae.LJIIIIZZ(height)) != null) {
                    fFloatValue3 = fLJIIIIZZ2.floatValue();
                } else {
                    fFloatValue3 = 0.0f;
                }
                if (fFloatValue2 > 1.0f && fFloatValue3 > 1.0f && (context = view.getContext()) != null && (resources = context.getResources()) != null && (displayMetrics = resources.getDisplayMetrics()) != null && (fValueOf = Float.valueOf(displayMetrics.density)) != null) {
                    fValueOf.floatValue();
                    int iLJIIIIZZ = (int) (C14KQ.LJIIIIZZ(view.getContext()) / fValueOf.floatValue());
                    Integer num2 = C1721430uth.LIZ().swThreshold;
                    if (num2 != null && iLJIIIIZZ <= num2.intValue() && (num = C1721430uth.LIZ().forceWidth) != null) {
                        int iIntValue = num.intValue();
                        C1295960jpS c1295960jpS4 = this.LLILZ;
                        if (c1295960jpS4 != null) {
                            C1546210qL5 c1546210qL5 = C1546210qL5.LIZ;
                            Integer numValueOf = Integer.valueOf(iIntValue);
                            c1546210qL5.getClass();
                            C786410Ut5.s6(c1295960jpS4, new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C1546210qL5.LIZ(numValueOf)), C814420VxA.LIZIZ(C1546210qL5.LIZ(Integer.valueOf((int) (fFloatValue3 * (iIntValue / fFloatValue2)))))));
                        }
                    }
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        Integer loop = lottieDO2.getLoop();
        if (loop != null && loop.intValue() == 1) {
            loop.intValue();
            String repeatStartProgress = lottieDO2.getRepeatStartProgress();
            if (repeatStartProgress != null && (fLJIIIIZZ = C2327809Ae.LJIIIIZZ(repeatStartProgress)) != null) {
                fFloatValue = fLJIIIIZZ.floatValue();
            } else {
                fFloatValue = 0.0f;
            }
            final C1295960jpS c1295960jpS5 = this.LLILZ;
            if (c1295960jpS5 != null) {
                c1295960jpS5.setMinAndMaxProgress(0.0f, 1.0f);
                c1295960jpS5.setRepeatCount(-1);
                c1295960jpS5.removeAllAnimatorListeners();
                c1295960jpS5.addAnimatorListener(new AnimatorListenerAdapter() { // from class: X.0jqs
                    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                    public final void onAnimationRepeat(Animator animator) {
                        c1295960jpS5.setMinAndMaxProgress(fFloatValue, 1.0f);
                    }
                });
            }
            if (LJII() && (c1295960jpS = this.LLILZ) != null) {
                c1295960jpS.playAnimation();
            }
        } else {
            C1295960jpS c1295960jpS6 = this.LLILZ;
            if (c1295960jpS6 != null) {
                c1295960jpS6.removeAllAnimatorListeners();
            }
            C1295960jpS c1295960jpS7 = this.LLILZ;
            if (c1295960jpS7 != null) {
                c1295960jpS7.addAnimatorListener(new ALAdapterS3S0000000_26(0));
            }
        }
        if (!this.LLJILJILJ) {
            this.LLJILJILJ = true;
            view.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC1775820wJQ(this, 1));
            C1720760usc c1720760usc = this.LL;
            if (c1720760usc != null && (lifecycleOwner = c1720760usc.LIZ) != null && (lifecycle = lifecycleOwner.getLifecycle()) != null) {
                lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.pipo.stellar.base.card.LottieCard$addLifecycleObserver$2
                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner2, Lifecycle.Event event) {
                        C1295960jpS c1295960jpS8;
                        int i = C08CK.LIZ[event.ordinal()];
                        if (i != 1) {
                            if (i == 2) {
                                this.LL.LLJI.LIZLLL();
                                C1295960jpS c1295960jpS9 = this.LL.LLILZ;
                                if (c1295960jpS9 != null) {
                                    c1295960jpS9.pauseAnimation();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        this.LL.LLJI.LJ();
                        if (!this.LL.LJII() || (c1295960jpS8 = this.LL.LLILZ) == null) {
                            return;
                        }
                        c1295960jpS8.resumeAnimation();
                    }
                });
            }
        }
        this.LLIZ = true;
        if (!this.LLIZLLLIL) {
            LIZJ();
        }
    }
}
