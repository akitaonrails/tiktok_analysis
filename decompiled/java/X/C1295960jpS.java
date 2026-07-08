package X;

import Y.ACallableS21S2100000_20;
import Y.ACallableS68S1100000_20;
import Y.ACallableS97S0101000_20;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.airbnb.lottie.LottieAnimationView$SavedState;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: X.0jpS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1295960jpS extends AppCompatImageView {
    public String animationName;
    public int animationResId;
    public boolean autoPlay;
    public boolean cacheComposition;
    public C1294720jnS composition;
    public C1292030jj7<C1294720jnS> compositionTask;
    public InterfaceC1292040jj8<Throwable> failureListener;
    public int fallbackResource;
    public boolean ignoreUnschedule;
    public final InterfaceC1292040jj8<C1294720jnS> loadedListener;
    public final C1295950jpR lottieDrawable;
    public final Set<InterfaceC1296230jpt> lottieOnCompositionLoadedListeners;
    public final Set<EnumC1295990jpV> userActionsTaken;
    public final InterfaceC1292040jj8<Throwable> wrappedFailureListener;
    public static final String TAG = "LottieAnimationView";
    public static final InterfaceC1292040jj8<Throwable> DEFAULT_FAILURE_LISTENER = new InterfaceC1292040jj8() { // from class: X.0jpe
        @Override // X.InterfaceC1292040jj8
        public final void onResult(Object obj) {
            C1295960jpS.lambda$static$0((Throwable) obj);
        }
    };

    private void clearComposition() {
        this.composition = null;
        this.lottieDrawable.LIZLLL();
    }

    private void init(AttributeSet attributeSet, int i) {
        com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_tux_business_lancet_LottieLancet2_hookDefaultFailureListener(this, attributeSet, i);
    }

    public void com_airbnb_lottie_LottieAnimationView__onDraw$___twin___(Canvas canvas) {
        super.onDraw(canvas);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        com_airbnb_lottie_LottieAnimationView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(this, canvas);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_lancet_LottieTaskLancet_onRestoreInstanceState(this, parcelable);
    }

    public void pauseAnimation() {
        this.autoPlay = false;
        this.lottieDrawable.LJIIJ();
    }

    private void cancelLoaderTask() {
        C1292030jj7<C1294720jnS> c1292030jj7 = this.compositionTask;
        if (c1292030jj7 != null) {
            c1292030jj7.LJII(this.loadedListener);
            this.compositionTask.LJI(this.wrappedFailureListener);
        }
    }

    public void cancelAnimation() {
        this.userActionsTaken.add(EnumC1295990jpV.PLAY_OPTION);
        C1295950jpR c1295950jpR = this.lottieDrawable;
        c1295950jpR.LLIZ.clear();
        c1295950jpR.LLILLJJLI.cancel();
        if (c1295950jpR.isVisible()) {
            return;
        }
        c1295950jpR.LLILZLL = EnumC1296020jpY.NONE;
    }

    public void disableExtraScaleModeInFitXY() {
        this.lottieDrawable.getClass();
    }

    public EnumC1296010jpX getAsyncUpdates() {
        return this.lottieDrawable.LLLFF;
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.lottieDrawable.LLLFF == EnumC1296010jpX.ENABLED;
    }

    public boolean getClipToCompositionBounds() {
        return this.lottieDrawable.LLJJIJI;
    }

    public long getDuration() {
        C1294720jnS c1294720jnS = this.composition;
        if (c1294720jnS != null) {
            return (long) c1294720jnS.LIZIZ();
        }
        return 0L;
    }

    public int getFrame() {
        return (int) this.lottieDrawable.LLILLJJLI.LLIZLLLIL;
    }

    public String getImageAssetsFolder() {
        return this.lottieDrawable.LLJ;
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.lottieDrawable.LLJJIII;
    }

    public float getMaxFrame() {
        return this.lottieDrawable.LLILLJJLI.LJI();
    }

    public float getMinFrame() {
        return this.lottieDrawable.LLILLJJLI.LJII();
    }

    public C1295560joo getPerformanceTracker() {
        C1294720jnS c1294720jnS = this.lottieDrawable.LL;
        if (c1294720jnS != null) {
            return c1294720jnS.LIZ;
        }
        return null;
    }

    public float getProgress() {
        return this.lottieDrawable.LLILLJJLI.LJFF();
    }

    public EnumC1295970jpT getRenderMode() {
        return this.lottieDrawable.LLJJJJLIIL ? EnumC1295970jpT.SOFTWARE : EnumC1295970jpT.HARDWARE;
    }

    public int getRepeatCount() {
        return this.lottieDrawable.LLILLJJLI.getRepeatCount();
    }

    public int getRepeatMode() {
        return this.lottieDrawable.LLILLJJLI.getRepeatMode();
    }

    public float getSpeed() {
        return this.lottieDrawable.LLILLJJLI.LLILZ;
    }

    public boolean hasMasks() {
        C1294740jnU c1294740jnU = this.lottieDrawable.LLJJIJIIJIL;
        return c1294740jnU != null && c1294740jnU.LJIJI();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean hasMatte() {
        /*
            r5 = this;
            X.0jpR r0 = r5.lottieDrawable
            X.0jnU r4 = r0.LLJJIJIIJIL
            r3 = 0
            if (r4 == 0) goto L15
            java.lang.Boolean r0 = r4.LJJIJIIJI
            r2 = 1
            if (r0 != 0) goto L39
            X.0jnx r0 = r4.LJIJ
            if (r0 == 0) goto L16
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.LJJIJIIJI = r0
        L14:
            r3 = 1
        L15:
            return r3
        L16:
            java.util.List<X.0jnx> r0 = r4.LJJIIJZLJL
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            int r1 = r1 - r2
        L1f:
            if (r1 < 0) goto L35
            java.util.List<X.0jnx> r0 = r4.LJJIIJZLJL
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r1)
            X.0jnx r0 = (X.AbstractC1295030jnx) r0
            X.0jnx r0 = r0.LJIJ
            if (r0 == 0) goto L32
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r4.LJJIJIIJI = r0
            goto L14
        L32:
            int r1 = r1 + (-1)
            goto L1f
        L35:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r4.LJJIJIIJI = r0
        L39:
            java.lang.Boolean r0 = r4.LJJIJIIJI
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L15
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1295960jpS.hasMatte():boolean");
    }

    public boolean isAnimating() {
        return this.lottieDrawable.LJIIIZ();
    }

    public boolean isMergePathsEnabledForKitKatAndAbove() {
        return this.lottieDrawable.LLJJI;
    }

    public void playAnimation() {
        this.userActionsTaken.add(EnumC1295990jpV.PLAY_OPTION);
        this.lottieDrawable.LJIIJJI();
    }

    public void removeAllAnimatorListeners() {
        this.lottieDrawable.LLILLJJLI.removeAllListeners();
    }

    public void removeAllLottieOnCompositionLoadedListener() {
        this.lottieOnCompositionLoadedListeners.clear();
    }

    public void removeAllUpdateListeners() {
        C1295950jpR c1295950jpR = this.lottieDrawable;
        c1295950jpR.LLILLJJLI.removeAllUpdateListeners();
        c1295950jpR.LLILLJJLI.addUpdateListener(c1295950jpR.LLLFFI);
    }

    public void resumeAnimation() {
        this.userActionsTaken.add(EnumC1295990jpV.PLAY_OPTION);
        this.lottieDrawable.LJIILJJIL();
    }

    public void reverseAnimationSpeed() {
        ChoreographerFrameCallbackC1295930jpP choreographerFrameCallbackC1295930jpP = this.lottieDrawable.LLILLJJLI;
        choreographerFrameCallbackC1295930jpP.LLILZ = -choreographerFrameCallbackC1295930jpP.LLILZ;
    }

    private void setLottieDrawable() {
        boolean zIsAnimating = isAnimating();
        setImageDrawable(null);
        setImageDrawable(this.lottieDrawable);
        if (zIsAnimating) {
            this.lottieDrawable.LJIILJJIL();
        }
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if (drawable instanceof C1295950jpR) {
            if ((((C1295950jpR) drawable).LLJJJJLIIL ? EnumC1295970jpT.SOFTWARE : EnumC1295970jpT.HARDWARE) == EnumC1295970jpT.SOFTWARE) {
                this.lottieDrawable.invalidateSelf();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (isInEditMode() || !this.autoPlay) {
            return;
        }
        this.lottieDrawable.LJIIJJI();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        LottieAnimationView$SavedState lottieAnimationView$SavedState = new LottieAnimationView$SavedState(super.onSaveInstanceState());
        lottieAnimationView$SavedState.LL = this.animationName;
        lottieAnimationView$SavedState.LLILLJJLI = this.animationResId;
        lottieAnimationView$SavedState.LLILLL = this.lottieDrawable.LLILLJJLI.LJFF();
        C1295950jpR c1295950jpR = this.lottieDrawable;
        if (c1295950jpR.isVisible()) {
            z = c1295950jpR.LLILLJJLI.LLJILJILJ;
        } else {
            EnumC1296020jpY enumC1296020jpY = c1295950jpR.LLILZLL;
            z = enumC1296020jpY == EnumC1296020jpY.PLAY || enumC1296020jpY == EnumC1296020jpY.RESUME;
        }
        lottieAnimationView$SavedState.LLILZ = z;
        C1295950jpR c1295950jpR2 = this.lottieDrawable;
        lottieAnimationView$SavedState.LLILZIL = c1295950jpR2.LLJ;
        lottieAnimationView$SavedState.LLILZLL = c1295950jpR2.LLILLJJLI.getRepeatMode();
        lottieAnimationView$SavedState.LLIZ = this.lottieDrawable.LLILLJJLI.getRepeatCount();
        return lottieAnimationView$SavedState;
    }

    public C1294720jnS getComposition() {
        return this.composition;
    }

    public C1295960jpS(Context context) {
        super(context);
        this.loadedListener = new InterfaceC1292040jj8<C1294720jnS>(this) { // from class: X.09OU
            public final WeakReference<C1295960jpS> LL;

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // X.InterfaceC1292040jj8
            public final void onResult(C1294720jnS c1294720jnS) {
                C1294720jnS c1294720jnS2 = c1294720jnS;
                C1295960jpS c1295960jpS = this.LL.get();
                if (c1295960jpS != null) {
                    c1295960jpS.setComposition(c1294720jnS2);
                }
            }
        };
        this.wrappedFailureListener = new InterfaceC1292040jj8<Throwable>(this) { // from class: X.0jpU
            public final WeakReference<C1295960jpS> LL;

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // X.InterfaceC1292040jj8
            public final void onResult(Throwable th) {
                C1295960jpS c1295960jpS = this.LL.get();
                if (c1295960jpS != null) {
                    int i = c1295960jpS.fallbackResource;
                    if (i != 0) {
                        c1295960jpS.setImageResource(i);
                    }
                    InterfaceC1292040jj8<Throwable> interfaceC1292040jj8 = c1295960jpS.failureListener;
                    if (interfaceC1292040jj8 == null) {
                        interfaceC1292040jj8 = C1295960jpS.DEFAULT_FAILURE_LISTENER;
                    }
                    interfaceC1292040jj8.onResult(th);
                }
            }
        };
        this.fallbackResource = 0;
        this.lottieDrawable = new C1295950jpR();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_tux_business_lancet_LottieLancet2_hookDefaultFailureListener(this, null, R.attr.f13);
    }

    private C1292030jj7<C1294720jnS> fromAssets(String str) {
        if (isInEditMode()) {
            return new C1292030jj7<>(new ACallableS68S1100000_20(this, str, 0), true);
        }
        if (this.cacheComposition) {
            return C1294250jmh.LIZIZ(getContext(), str);
        }
        return C1294250jmh.LIZ(null, new ACallableS21S2100000_20(C786410Ut5.N3(getContext()), str, null, 1), null);
    }

    private C1292030jj7<C1294720jnS> fromRawRes(int i) {
        if (isInEditMode()) {
            return new C1292030jj7<>(new ACallableS97S0101000_20(i, this, 0), true);
        }
        if (this.cacheComposition) {
            return C1294250jmh.LJIIIIZZ(i, getContext());
        }
        return C1294250jmh.LJIIIZ(getContext(), i, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ C1292000jj4 lambda$fromAssets$2(String str) {
        C1292000jj4<C1294720jnS> c1292000jj4LIZLLL;
        C1C7U.LIZ("LottieAnimationView@910c.fromAssets$1L");
        if (this.cacheComposition) {
            c1292000jj4LIZLLL = C1294250jmh.LIZJ(getContext(), str);
        } else {
            c1292000jj4LIZLLL = C1294250jmh.LIZLLL(getContext(), str, null);
        }
        C1C7U.LIZIZ("LottieAnimationView@910c.fromAssets$1L");
        return c1292000jj4LIZLLL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C1292000jj4 lambda$fromRawRes$1(int i) {
        C1292000jj4<C1294720jnS> c1292000jj4LJIIJ;
        C1C7U.LIZ("LottieAnimationView@910c.fromRawRes$1L");
        if (this.cacheComposition) {
            Context context = getContext();
            c1292000jj4LJIIJ = C1294250jmh.LJIIJ(context, i, C1294250jmh.LJIIZILJ(i, context));
        } else {
            c1292000jj4LJIIJ = C1294250jmh.LJIIJ(getContext(), i, null);
        }
        C1C7U.LIZIZ("LottieAnimationView@910c.fromRawRes$1L");
        return c1292000jj4LJIIJ;
    }

    public static /* synthetic */ void lambda$static$0(Throwable th) {
        if (C1294350jmr.LJ(th)) {
            C1292050jj9.LIZJ("Unable to load composition.", th);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th);
    }

    private void setCompositionTask(C1292030jj7<C1294720jnS> c1292030jj7) {
        this.userActionsTaken.add(EnumC1295990jpV.SET_ANIMATION);
        clearComposition();
        cancelLoaderTask();
        c1292030jj7.LIZIZ(this.loadedListener);
        c1292030jj7.LIZ(this.wrappedFailureListener);
        this.compositionTask = c1292030jj7;
    }

    public void addAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.LLILLJJLI.addListener(animatorListener);
    }

    public void addAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.LLILLJJLI.addPauseListener(animatorPauseListener);
    }

    public void addAnimatorUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.LLILLJJLI.addUpdateListener(animatorUpdateListener);
    }

    public boolean addLottieOnCompositionLoadedListener(InterfaceC1296230jpt interfaceC1296230jpt) {
        C1294720jnS c1294720jnS = this.composition;
        if (c1294720jnS != null) {
            interfaceC1296230jpt.LIZ(c1294720jnS);
        }
        return this.lottieOnCompositionLoadedListeners.add(interfaceC1296230jpt);
    }

    public void com_airbnb_lottie_LottieAnimationView__onRestoreInstanceState$___twin___(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof LottieAnimationView$SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        LottieAnimationView$SavedState lottieAnimationView$SavedState = (LottieAnimationView$SavedState) parcelable;
        super.onRestoreInstanceState(lottieAnimationView$SavedState.getSuperState());
        this.animationName = lottieAnimationView$SavedState.LL;
        Set<EnumC1295990jpV> set = this.userActionsTaken;
        EnumC1295990jpV enumC1295990jpV = EnumC1295990jpV.SET_ANIMATION;
        if (!set.contains(enumC1295990jpV) && !TextUtils.isEmpty(this.animationName)) {
            setAnimation(this.animationName);
        }
        this.animationResId = lottieAnimationView$SavedState.LLILLJJLI;
        if (!this.userActionsTaken.contains(enumC1295990jpV) && (i = this.animationResId) != 0) {
            setAnimation(i);
        }
        if (!this.userActionsTaken.contains(EnumC1295990jpV.SET_PROGRESS)) {
            setProgressInternal(lottieAnimationView$SavedState.LLILLL, false);
        }
        if (!this.userActionsTaken.contains(EnumC1295990jpV.PLAY_OPTION) && lottieAnimationView$SavedState.LLILZ) {
            playAnimation();
        }
        if (!this.userActionsTaken.contains(EnumC1295990jpV.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(lottieAnimationView$SavedState.LLILZIL);
        }
        if (!this.userActionsTaken.contains(EnumC1295990jpV.SET_REPEAT_MODE)) {
            setRepeatMode(lottieAnimationView$SavedState.LLILZLL);
        }
        if (!this.userActionsTaken.contains(EnumC1295990jpV.SET_REPEAT_COUNT)) {
            setRepeatCount(lottieAnimationView$SavedState.LLIZ);
        }
    }

    public void enableMergePathsForKitKatAndAbove(boolean z) {
        C1295950jpR c1295950jpR = this.lottieDrawable;
        if (c1295950jpR.LLJJI != z) {
            c1295950jpR.LLJJI = z;
            if (c1295950jpR.LL != null) {
                c1295950jpR.LIZJ();
            }
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C1295950jpR c1295950jpR = this.lottieDrawable;
        if (drawable2 == c1295950jpR) {
            super.invalidateDrawable(c1295950jpR);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    public void loop(boolean z) {
        int i;
        C1295950jpR c1295950jpR = this.lottieDrawable;
        if (z) {
            i = -1;
        } else {
            i = 0;
        }
        c1295950jpR.LJJIIJ(i);
    }

    public void removeAnimatorListener(Animator.AnimatorListener animatorListener) {
        this.lottieDrawable.LLILLJJLI.removeListener(animatorListener);
    }

    public void removeAnimatorPauseListener(Animator.AnimatorPauseListener animatorPauseListener) {
        this.lottieDrawable.LLILLJJLI.removePauseListener(animatorPauseListener);
    }

    public boolean removeLottieOnCompositionLoadedListener(InterfaceC1296230jpt interfaceC1296230jpt) {
        return this.lottieOnCompositionLoadedListeners.remove(interfaceC1296230jpt);
    }

    public void removeUpdateListener(ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        this.lottieDrawable.LLILLJJLI.removeUpdateListener(animatorUpdateListener);
    }

    public List<C1295090jo3> resolveKeyPath(C1295090jo3 c1295090jo3) {
        return this.lottieDrawable.LJIILIIL(c1295090jo3);
    }

    public void setAnimation(int i) {
        this.animationResId = i;
        this.animationName = null;
        setCompositionTask(fromRawRes(i));
    }

    public void setAnimationFromJson(String str) {
        setAnimationFromJson(str, null);
    }

    public void setAnimationFromUrl(String str) {
        C1292030jj7<C1294720jnS> c1292030jj7LJIIL;
        if (this.cacheComposition) {
            c1292030jj7LJIIL = C1294250jmh.LJIIJJI(getContext(), str);
        } else {
            c1292030jj7LJIIL = C1294250jmh.LJIIL(getContext(), str, null);
        }
        setCompositionTask(c1292030jj7LJIIL);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.lottieDrawable.LLJJJJ = z;
    }

    public void setAsyncUpdates(EnumC1296010jpX enumC1296010jpX) {
        this.lottieDrawable.LLLFF = enumC1296010jpX;
    }

    public void setCacheComposition(boolean z) {
        this.cacheComposition = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        C1295950jpR c1295950jpR = this.lottieDrawable;
        if (z != c1295950jpR.LLJJIJI) {
            c1295950jpR.LLJJIJI = z;
            C1294740jnU c1294740jnU = c1295950jpR.LLJJIJIIJIL;
            if (c1294740jnU != null) {
                c1294740jnU.LJJIJL = z;
            }
            c1295950jpR.invalidateSelf();
        }
    }

    public void setComposition(C1294720jnS c1294720jnS) {
        this.lottieDrawable.setCallback(this);
        this.composition = c1294720jnS;
        this.ignoreUnschedule = true;
        boolean zLJIILL = this.lottieDrawable.LJIILL(c1294720jnS);
        this.ignoreUnschedule = false;
        if (getDrawable() == this.lottieDrawable) {
            if (!zLJIILL) {
                return;
            }
        } else if (!zLJIILL) {
            setLottieDrawable();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        Iterator<InterfaceC1296230jpt> it2 = this.lottieOnCompositionLoadedListeners.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c1294720jnS);
        }
    }

    public void setDefaultFontFileExtension(String str) {
        C1295950jpR c1295950jpR = this.lottieDrawable;
        c1295950jpR.LLJILJILJ = str;
        C1295350joT c1295350joTLJII = c1295950jpR.LJII();
        if (c1295350joTLJII != null) {
            c1295350joTLJII.LJFF = str;
        }
    }

    public void setFailureListener(InterfaceC1292040jj8<Throwable> interfaceC1292040jj8) {
        this.failureListener = interfaceC1292040jj8;
    }

    public void setFallbackResource(int i) {
        this.fallbackResource = i;
    }

    public void setFontAssetDelegate(C1295870jpJ c1295870jpJ) {
        C1295950jpR c1295950jpR = this.lottieDrawable;
        c1295950jpR.LLJILLL = c1295870jpJ;
        C1295350joT c1295350joT = c1295950jpR.LLJIJIL;
        if (c1295350joT != null) {
            c1295350joT.LJ = c1295870jpJ;
        }
    }

    public void setFontMap(Map<String, Typeface> map) {
        C1295950jpR c1295950jpR = this.lottieDrawable;
        if (map != c1295950jpR.LLJILJIL) {
            c1295950jpR.LLJILJIL = map;
            c1295950jpR.invalidateSelf();
        }
    }

    public void setFrame(int i) {
        this.lottieDrawable.LJIILLIIL(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.lottieDrawable.LLILZ = z;
    }

    public void setImageAssetDelegate(InterfaceC1294390jmv interfaceC1294390jmv) {
        C1295950jpR c1295950jpR = this.lottieDrawable;
        c1295950jpR.LLJI = interfaceC1294390jmv;
        C1294380jmu c1294380jmu = c1295950jpR.LLIZLLLIL;
        if (c1294380jmu != null) {
            c1294380jmu.LIZJ = interfaceC1294390jmv;
        }
    }

    public void setImageAssetsFolder(String str) {
        this.lottieDrawable.LLJ = str;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        cancelLoaderTask();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        cancelLoaderTask();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        cancelLoaderTask();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.lottieDrawable.LLJJIII = z;
    }

    public void setMaxFrame(int i) {
        this.lottieDrawable.LJIIZILJ(i);
    }

    public void setMaxProgress(float f) {
        this.lottieDrawable.LJIJI(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.lottieDrawable.LJIJJLI(str);
    }

    public void setMinFrame(int i) {
        this.lottieDrawable.LJJI(i);
    }

    public void setMinProgress(float f) {
        this.lottieDrawable.LJJII(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        C1295950jpR c1295950jpR = this.lottieDrawable;
        if (c1295950jpR.LLJJJIL != z) {
            c1295950jpR.LLJJJIL = z;
            C1294740jnU c1294740jnU = c1295950jpR.LLJJIJIIJIL;
            if (c1294740jnU != null) {
                c1294740jnU.LJIIZILJ(z);
            }
        }
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        C1295950jpR c1295950jpR = this.lottieDrawable;
        c1295950jpR.LLJJJ = z;
        C1294720jnS c1294720jnS = c1295950jpR.LL;
        if (c1294720jnS != null) {
            c1294720jnS.LIZ.LIZ = z;
        }
    }

    public void setProgress(float f) {
        setProgressInternal(f, true);
    }

    public void setRenderMode(EnumC1295970jpT enumC1295970jpT) {
        C1295950jpR c1295950jpR = this.lottieDrawable;
        c1295950jpR.LLJJJJJIL = enumC1295970jpT;
        c1295950jpR.LJ();
    }

    public void setRepeatCount(int i) {
        this.userActionsTaken.add(EnumC1295990jpV.SET_REPEAT_COUNT);
        this.lottieDrawable.LJJIIJ(i);
    }

    public void setRepeatMode(int i) {
        this.userActionsTaken.add(EnumC1295990jpV.SET_REPEAT_MODE);
        this.lottieDrawable.LLILLJJLI.setRepeatMode(i);
    }

    public void setSafeMode(boolean z) {
        this.lottieDrawable.LLILZIL = z;
    }

    public void setSpeed(float f) {
        this.lottieDrawable.LLILLJJLI.LLILZ = f;
    }

    public void setTextDelegate(C1295710jp3 c1295710jp3) {
        this.lottieDrawable.LLJJ = c1295710jp3;
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.lottieDrawable.LLILLJJLI.LLJILLL = z;
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        C1295950jpR c1295950jpR;
        if (!this.ignoreUnschedule && drawable == (c1295950jpR = this.lottieDrawable) && c1295950jpR.LJIIIZ()) {
            pauseAnimation();
        } else if (!this.ignoreUnschedule && (drawable instanceof C1295950jpR)) {
            C1295950jpR c1295950jpR2 = (C1295950jpR) drawable;
            if (c1295950jpR2.LJIIIZ()) {
                c1295950jpR2.LJIIJ();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    public void setAnimation(String str) {
        this.animationName = str;
        this.animationResId = 0;
        setCompositionTask(fromAssets(str));
    }

    public void setMaxFrame(String str) {
        this.lottieDrawable.LJIJ(str);
    }

    public void setMinFrame(String str) {
        this.lottieDrawable.LJJIFFI(str);
    }

    public C1295960jpS(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.loadedListener = new InterfaceC1292040jj8<C1294720jnS>(this) { // from class: X.09OU
            public final WeakReference<C1295960jpS> LL;

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // X.InterfaceC1292040jj8
            public final void onResult(C1294720jnS c1294720jnS) {
                C1294720jnS c1294720jnS2 = c1294720jnS;
                C1295960jpS c1295960jpS = this.LL.get();
                if (c1295960jpS != null) {
                    c1295960jpS.setComposition(c1294720jnS2);
                }
            }
        };
        this.wrappedFailureListener = new InterfaceC1292040jj8<Throwable>(this) { // from class: X.0jpU
            public final WeakReference<C1295960jpS> LL;

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // X.InterfaceC1292040jj8
            public final void onResult(Throwable th) {
                C1295960jpS c1295960jpS = this.LL.get();
                if (c1295960jpS != null) {
                    int i = c1295960jpS.fallbackResource;
                    if (i != 0) {
                        c1295960jpS.setImageResource(i);
                    }
                    InterfaceC1292040jj8<Throwable> interfaceC1292040jj8 = c1295960jpS.failureListener;
                    if (interfaceC1292040jj8 == null) {
                        interfaceC1292040jj8 = C1295960jpS.DEFAULT_FAILURE_LISTENER;
                    }
                    interfaceC1292040jj8.onResult(th);
                }
            }
        };
        this.fallbackResource = 0;
        this.lottieDrawable = new C1295950jpR();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_tux_business_lancet_LottieLancet2_hookDefaultFailureListener(this, attributeSet, R.attr.f13);
    }

    public static void com_airbnb_lottie_LottieAnimationView_com_bytedance_tt_reliability_monitor_viewchecker_BitmapCrashChecker_onDraw(C1295960jpS c1295960jpS, Canvas canvas) {
        try {
            c1295960jpS.com_airbnb_lottie_LottieAnimationView__onDraw$___twin___(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, c1295960jpS);
            throw e;
        }
    }

    public static void com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_lancet_LottieTaskLancet_onRestoreInstanceState(C1295960jpS c1295960jpS, Parcelable parcelable) {
        try {
            c1295960jpS.com_airbnb_lottie_LottieAnimationView__onRestoreInstanceState$___twin___(parcelable);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    private void setProgressInternal(float f, boolean z) {
        if (z) {
            this.userActionsTaken.add(EnumC1295990jpV.SET_PROGRESS);
        }
        this.lottieDrawable.LJJIII(f);
    }

    public void com_airbnb_lottie_LottieAnimationView__init$___twin___(AttributeSet attributeSet, int i) {
        String strXd;
        boolean z = false;
        TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.LottieAnimationView, i, 0);
        this.cacheComposition = typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_cacheComposition, true);
        boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_rawRes);
        boolean zHasValue2 = typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_fileName);
        boolean zHasValue3 = typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_url);
        if (zHasValue) {
            if (!zHasValue2) {
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_rawRes, 0);
                if (resourceId != 0) {
                    setAnimation(resourceId);
                }
            } else {
                throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
            }
        } else if (zHasValue2) {
            String strXd2 = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LottieAnimationView_lottie_fileName);
            if (strXd2 != null) {
                setAnimation(strXd2);
            }
        } else if (zHasValue3 && (strXd = C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LottieAnimationView_lottie_url)) != null) {
            setAnimationFromUrl(strXd);
        }
        setFallbackResource(typedArrayObtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_fallbackRes, 0));
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_autoPlay, false)) {
            this.autoPlay = true;
        }
        if (typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_loop, false)) {
            this.lottieDrawable.LJJIIJ(-1);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_repeatMode)) {
            setRepeatMode(typedArrayObtainStyledAttributes.getInt(R$styleable.LottieAnimationView_lottie_repeatMode, 1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_repeatCount)) {
            setRepeatCount(typedArrayObtainStyledAttributes.getInt(R$styleable.LottieAnimationView_lottie_repeatCount, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_speed)) {
            setSpeed(typedArrayObtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_speed, 1.0f));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_clipToCompositionBounds)) {
            setClipToCompositionBounds(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_clipToCompositionBounds, true));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_defaultFontFileExtension)) {
            setDefaultFontFileExtension(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LottieAnimationView_lottie_defaultFontFileExtension));
        }
        setImageAssetsFolder(C786410Ut5.Xd(typedArrayObtainStyledAttributes, R$styleable.LottieAnimationView_lottie_imageAssetsFolder));
        setProgressInternal(typedArrayObtainStyledAttributes.getFloat(R$styleable.LottieAnimationView_lottie_progress, 0.0f), typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_progress));
        enableMergePathsForKitKatAndAbove(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_enableMergePathsForKitKatAndAbove, false));
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_colorFilter)) {
            addValueCallback(new C1295090jo3("**"), InterfaceC1295080jo2.LJJIJL, (C1295400joY<ColorFilter>) new C1295400joY(new C1296110jph(C838410Wul.LIZIZ(typedArrayObtainStyledAttributes.getResourceId(R$styleable.LottieAnimationView_lottie_colorFilter, -1), getContext()).getDefaultColor())));
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_renderMode)) {
            int i2 = R$styleable.LottieAnimationView_lottie_renderMode;
            EnumC1295970jpT enumC1295970jpT = EnumC1295970jpT.AUTOMATIC;
            int iOrdinal = typedArrayObtainStyledAttributes.getInt(i2, enumC1295970jpT.ordinal());
            if (iOrdinal >= EnumC1295970jpT.values().length) {
                iOrdinal = enumC1295970jpT.ordinal();
            }
            setRenderMode(EnumC1295970jpT.values()[iOrdinal]);
        }
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_asyncUpdates)) {
            int i3 = R$styleable.LottieAnimationView_lottie_asyncUpdates;
            EnumC1296010jpX enumC1296010jpX = EnumC1296010jpX.AUTOMATIC;
            int iOrdinal2 = typedArrayObtainStyledAttributes.getInt(i3, enumC1296010jpX.ordinal());
            if (iOrdinal2 >= EnumC1295970jpT.values().length) {
                iOrdinal2 = enumC1296010jpX.ordinal();
            }
            setAsyncUpdates(EnumC1296010jpX.values()[iOrdinal2]);
        }
        setIgnoreDisabledSystemAnimations(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_ignoreDisabledSystemAnimations, false));
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.LottieAnimationView_lottie_useCompositionFrameRate)) {
            setUseCompositionFrameRate(typedArrayObtainStyledAttributes.getBoolean(R$styleable.LottieAnimationView_lottie_useCompositionFrameRate, false));
        }
        typedArrayObtainStyledAttributes.recycle();
        C1295950jpR c1295950jpR = this.lottieDrawable;
        if (Settings.Global.getFloat(getContext().getContentResolver(), "animator_duration_scale", 1.0f) != 0.0f) {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        c1295950jpR.getClass();
        c1295950jpR.LLILLL = boolValueOf.booleanValue();
    }

    public void setAnimation(InputStream inputStream, String str) {
        setCompositionTask(C1294250jmh.LJ(inputStream, str));
    }

    public void setAnimationFromJson(String str, String str2) {
        setAnimation(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setAnimationFromUrl(String str, String str2) {
        setCompositionTask(C1294250jmh.LJIIL(getContext(), str, str2));
    }

    public void setMinAndMaxFrame(int i, int i2) {
        this.lottieDrawable.LJIJJ(i, i2);
    }

    public void setMinAndMaxProgress(float f, float f2) {
        this.lottieDrawable.LJJ(f, f2);
    }

    public Bitmap updateBitmap(String str, Bitmap bitmap) {
        Bitmap bitmap2;
        C1295950jpR c1295950jpR = this.lottieDrawable;
        C1294380jmu c1294380jmuLJIIIIZZ = c1295950jpR.LJIIIIZZ();
        if (c1294380jmuLJIIIIZZ == null) {
            C1292050jj9.LIZIZ("Cannot update bitmap. Most likely the drawable is not added to a View which prevents Lottie from getting a Context.");
            return null;
        }
        if (bitmap == null) {
            C1294320jmo c1294320jmo = c1294380jmuLJIIIIZZ.LIZLLL.get(str);
            Bitmap bitmap3 = c1294320jmo.LJFF;
            c1294320jmo.LJFF = null;
            bitmap2 = bitmap3;
        } else {
            bitmap2 = c1294380jmuLJIIIIZZ.LIZLLL.get(str).LJFF;
            c1294380jmuLJIIIIZZ.LIZ(bitmap, str);
        }
        c1295950jpR.invalidateSelf();
        return bitmap2;
    }

    public C1295960jpS(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.loadedListener = new InterfaceC1292040jj8<C1294720jnS>(this) { // from class: X.09OU
            public final WeakReference<C1295960jpS> LL;

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // X.InterfaceC1292040jj8
            public final void onResult(C1294720jnS c1294720jnS) {
                C1294720jnS c1294720jnS2 = c1294720jnS;
                C1295960jpS c1295960jpS = this.LL.get();
                if (c1295960jpS != null) {
                    c1295960jpS.setComposition(c1294720jnS2);
                }
            }
        };
        this.wrappedFailureListener = new InterfaceC1292040jj8<Throwable>(this) { // from class: X.0jpU
            public final WeakReference<C1295960jpS> LL;

            {
                this.LL = new WeakReference<>(this);
            }

            @Override // X.InterfaceC1292040jj8
            public final void onResult(Throwable th) {
                C1295960jpS c1295960jpS = this.LL.get();
                if (c1295960jpS != null) {
                    int i2 = c1295960jpS.fallbackResource;
                    if (i2 != 0) {
                        c1295960jpS.setImageResource(i2);
                    }
                    InterfaceC1292040jj8<Throwable> interfaceC1292040jj8 = c1295960jpS.failureListener;
                    if (interfaceC1292040jj8 == null) {
                        interfaceC1292040jj8 = C1295960jpS.DEFAULT_FAILURE_LISTENER;
                    }
                    interfaceC1292040jj8.onResult(th);
                }
            }
        };
        this.fallbackResource = 0;
        this.lottieDrawable = new C1295950jpR();
        this.ignoreUnschedule = false;
        this.autoPlay = false;
        this.cacheComposition = true;
        this.userActionsTaken = new HashSet();
        this.lottieOnCompositionLoadedListeners = new HashSet();
        com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_tux_business_lancet_LottieLancet2_hookDefaultFailureListener(this, attributeSet, i);
    }

    public static void com_airbnb_lottie_LottieAnimationView_com_ss_android_ugc_aweme_tux_business_lancet_LottieLancet2_hookDefaultFailureListener(C1295960jpS c1295960jpS, AttributeSet attributeSet, int i) {
        c1295960jpS.com_airbnb_lottie_LottieAnimationView__init$___twin___(attributeSet, i);
        c1295960jpS.setFailureListener(new InterfaceC1292040jj8<Throwable>() { // from class: X.0jpQ
            @Override // X.InterfaceC1292040jj8
            public final void onResult(Throwable th) {
                Throwable th2 = th;
                if (C1294350jmr.LJ(th2)) {
                    C1292050jj9.LIZJ("Unable to load composition.", th2);
                } else {
                    if (!C2213981Bky.LIZIZ.LIZLLL()) {
                        C805380Via.LIZJ(th2, "Unable to parse composition");
                        return;
                    }
                    throw new IllegalStateException("Unable to parse composition", th2);
                }
            }
        });
    }

    public <T> void addValueCallback(C1295090jo3 c1295090jo3, T t, final InterfaceC1296040jpa<T> interfaceC1296040jpa) {
        this.lottieDrawable.LIZ(c1295090jo3, t, new C1295400joY<T>() { // from class: X.0jpZ
            @Override // X.C1295400joY
            public final T LIZ(C1295570jop<T> c1295570jop) {
                return (T) interfaceC1296040jpa.LIZ(c1295570jop);
            }
        });
    }

    public void setMinAndMaxFrame(String str, String str2, boolean z) {
        this.lottieDrawable.LJIL(str, str2, z);
    }

    public <T> void addValueCallback(C1295090jo3 c1295090jo3, T t, C1295400joY<T> c1295400joY) {
        this.lottieDrawable.LIZ(c1295090jo3, t, c1295400joY);
    }
}
