package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.ss.android.ugc.aweme.base.SafeHandler;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0SOW, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public class C0SOW extends LinearLayout implements C0SC9 {
    public static final long LLJJIJIIJIL;
    public static double LLJJIJIL;
    public SafeHandler LL;
    public int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final ArrayList<ImageView> LLIZ;
    public boolean LLIZLLLIL;
    public boolean LLJ;
    public AnimatorSet LLJI;
    public int LLJIJIL;
    public Animator LLJILJIL;
    public Animator LLJILJILJ;
    public final Paint LLJILLL;
    public final C01GW LLJJ;
    public Paint LLJJI;
    public AbstractC720520SOc LLJJIII;
    public final List<C0SOW> LLJJIJI;

    public final void LJ() {
        this.LLIZLLLIL = false;
        if (((ArrayList) this.LLJJIJI).isEmpty()) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            try {
                ((C0SOW) it2.next()).LJ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LJIIIZ() {
        this.LLIZLLLIL = true;
        if (((ArrayList) this.LLJJIJI).isEmpty()) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            try {
                ((C0SOW) it2.next()).LJIIIZ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    @Override // X.C0SC9
    public View getView() {
        return this;
    }

    private final Paint getTransPaint() {
        return (Paint) this.LLJJ.getValue();
    }

    public final int LIZIZ() {
        int maxDots;
        int maxDots2;
        int i;
        if (this.LLILZLL >= getMaxDots()) {
            maxDots = this.LLILLJJLI * getMaxDots();
            maxDots2 = getMaxDots() - 1;
            i = this.LLILLL;
        } else {
            int i2 = this.LLILLJJLI;
            int i3 = this.LLILZLL;
            maxDots = i2 * i3;
            maxDots2 = i3 - 1;
            i = this.LLILLL;
        }
        return maxDots + (maxDots2 * i) + getPaddingStart() + getPaddingEnd();
    }

    public final void LJI() {
        if (Intrinsics.LJFF(this.LLJJI, this.LLJILLL)) {
            return;
        }
        this.LLJJI = this.LLJILLL;
        if (((ArrayList) this.LLJJIJI).isEmpty()) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            try {
                ((C0SOW) it2.next()).LJI();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public final void LJIIIIZZ() {
        if (Intrinsics.LJFF(this.LLJJI, getTransPaint())) {
            return;
        }
        this.LLJJI = getTransPaint();
        postInvalidate();
        if (((ArrayList) this.LLJJIJI).isEmpty()) {
            return;
        }
        Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
        while (it2.hasNext()) {
            try {
                ((C0SOW) it2.next()).LJIIIIZZ();
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }

    public void LJIIL() {
        if (this.LLJ) {
            int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            int iLIZIZ2 = C19252910Tv.LIZIZ.LIZLLL().LJIJI().LLFF().LIZ() ? 0 : C814420VxA.LIZIZ(C418440Gaw.LIZIZ(10));
            setPadding(iLIZIZ2, iLIZIZ, iLIZIZ2, iLIZIZ);
        } else {
            if (!this.LLIZLLLIL) {
                LJIIJJI(this, 0, 0, 0, 0);
                return;
            }
            int iLIZIZ3 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
            int iLIZIZ4 = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(66));
            LJIIJJI(this, iLIZIZ4, iLIZIZ3, iLIZIZ4, iLIZIZ3);
        }
    }

    public Rect getContentRect() {
        if (this.LLILZLL > 4) {
            return new Rect(getPaddingStart(), getPaddingTop(), getMeasuredWidth() - getPaddingEnd(), getMeasuredHeight() - getPaddingBottom());
        }
        int measuredWidth = ((int) (getMeasuredWidth() - C11VU.LIZ(72.0f))) / 2;
        return new Rect(measuredWidth, getPaddingTop(), getMeasuredWidth() - measuredWidth, getMeasuredHeight() - getPaddingBottom());
    }

    public final int getIndicatorLastRealPos() {
        return this.LLILZLL - 1;
    }

    public final int getIndicatorLeftBoundPos() {
        return this.LLILZ - this.LLILZIL;
    }

    public final int getLastRealPos() {
        return this.LLILZLL - 1;
    }

    public final int getLeftBoundPos() {
        return this.LLILZ - this.LLILZIL;
    }

    static {
        LLJJIJIIJIL = C04WZ.LIZ() ? 100L : 200L;
        C19252910Tv c19252910Tv = C19252910Tv.LIZIZ;
        LLJJIJIL = c19252910Tv.LIZLLL().LJIJI().LLFF().LIZLLL(null, null) ? 7.0d : 6.0d;
        c19252910Tv.LIZLLL().LJIJI().LLFF().LIZLLL(null, null);
    }

    private final float getDotIndicatorBackgroundAlpha() {
        return getLayoutManager().LIZ();
    }

    private final int getMaxDots() {
        return getLayoutManager().LIZJ();
    }

    public final int getIndicatorRightBoundPos() {
        return (getIndicatorLeftBoundPos() + getLayoutManager().LIZJ()) - 1;
    }

    public final int getRightBoundPos() {
        return (getLeftBoundPos() + getMaxDots()) - 1;
    }

    public final int getDotSize() {
        return this.LLILLJJLI;
    }

    public final int getIndicatorCurPos() {
        return this.LLILZIL;
    }

    public final int getIndicatorRealPos() {
        return this.LLILZ;
    }

    public final int getIndicatorTotalCount() {
        return this.LLILZLL;
    }

    public AbstractC720520SOc getLayoutManager() {
        return this.LLJJIII;
    }

    public final int getMargin() {
        return this.LLILLL;
    }

    public final void LIZ(C0SOW c0sow) {
        if (c0sow == this || ((ArrayList) this.LLJJIJI).contains(c0sow)) {
            return;
        }
        ((ArrayList) this.LLJJIJI).add(c0sow);
        try {
            c0sow.setIsTabletCarousel(this.LLJ);
            c0sow.setLayoutManager$post_mode_release(getLayoutManager().LIZLLL());
            int i = this.LLILZLL;
            if (i > 1) {
                c0sow.setCount(i);
                int i2 = this.LLILZLL;
                int i3 = this.LLILZ;
                if (i3 >= 0 && i3 < i2) {
                    c0sow.setSelectedIndex(i3);
                }
            }
            c0sow.setDarkMode(getLayoutManager().LIZ);
            if (this.LLIZLLLIL) {
                c0sow.LJIIIZ();
            } else {
                c0sow.LJ();
            }
            if (this.LLJJI == getTransPaint()) {
                c0sow.LJIIIIZZ();
            } else {
                c0sow.LJI();
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }

    public ImageView LIZJ(int i) {
        ImageView imageView = new ImageView(getContext());
        LJII(imageView);
        C786410Ut5.V4(imageView, getDotIndicatorBackgroundAlpha());
        int i2 = this.LLILLJJLI;
        int i3 = this.LLILLL;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        if (i > 0) {
            if (C444960Hcc.LIZJ(getContext())) {
                layoutParams.setMargins(0, 0, i3, 0);
            } else {
                layoutParams.setMargins(i3, 0, 0, 0);
            }
        }
        C786410Ut5.c6(imageView, layoutParams);
        return imageView;
    }

    public final ImageView LIZLLL(int i) {
        if (i >= 0 && i < this.LLIZ.size()) {
            return (ImageView) ListProtector.get(this.LLIZ, i);
        }
        return null;
    }

    public final Paint LJFF(boolean z) {
        BlurMaskFilter blurMaskFilter = null;
        if (z) {
            Paint paint = new Paint();
            paint.setAntiAlias(true);
            paint.setColor(0);
            Context context = getContext();
            if (context != null) {
                blurMaskFilter = new BlurMaskFilter(Float.valueOf(C11VU.LIZIZ(48.0f, context)).floatValue(), BlurMaskFilter.Blur.NORMAL);
            }
            paint.setMaskFilter(blurMaskFilter);
            return paint;
        }
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setColor(-16777216);
        paint2.setAlpha(178);
        Context context2 = getContext();
        if (context2 != null) {
            blurMaskFilter = new BlurMaskFilter(Float.valueOf(C11VU.LIZIZ(48.0f, context2)).floatValue(), BlurMaskFilter.Blur.NORMAL);
        }
        paint2.setMaskFilter(blurMaskFilter);
        return paint2;
    }

    public final void LJII(ImageView imageView) {
        imageView.setImageResource(getLayoutManager().LIZIZ());
    }

    public final void LJIIJ(boolean z) {
        AnimatorSet animatorSet = this.LLJI;
        if (animatorSet != null && animatorSet.isRunning()) {
            AnimatorSet animatorSet2 = this.LLJI;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            int i = this.LLILZLL;
            for (int i2 = 0; i2 < i; i2++) {
                C786410Ut5.Lc((ImageView) ListProtector.get(this.LLIZ, i2), this.LLJIJIL);
            }
        }
        this.LLJI = new AnimatorSet();
        int i3 = this.LLILLL + this.LLILLJJLI;
        if (z) {
            i3 = -i3;
        }
        if (C444960Hcc.LIZIZ()) {
            i3 = -i3;
        }
        this.LLJIJIL += i3;
        AnimatorSet animatorSet3 = this.LLJI;
        if (animatorSet3 != null) {
            ArrayList<ImageView> arrayList = this.LLIZ;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            for (ImageView imageView : arrayList) {
                arrayList2.add(ObjectAnimator.ofFloat(imageView, "translationX", imageView.getTranslationX(), this.LLJIJIL));
            }
            animatorSet3.playTogether(new ArrayList(arrayList2));
        }
        AnimatorSet animatorSet4 = this.LLJI;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(LLJJIJIIJIL);
        }
        AnimatorSet animatorSet5 = this.LLJI;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (this.LLIZLLLIL && Build.VERSION.SDK_INT >= 28) {
            canvas.drawRect(getContentRect(), this.LLJJI);
        }
    }

    public void setCount(int i) {
        int paddingTop;
        LinearLayout.LayoutParams layoutParams;
        if (i <= 1) {
            return;
        }
        SafeHandler safeHandler = this.LL;
        if (safeHandler != null) {
            safeHandler.removeCallbacksAndMessages(null);
        }
        this.LLILZIL = 0;
        this.LLILZLL = i;
        this.LLJIJIL = 0;
        LJIIL();
        getLayoutParams().width = getLayoutManager().LJ();
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (this.LLJ) {
            paddingTop = -2;
        } else {
            paddingTop = this.LLILLJJLI + getPaddingTop() + getPaddingBottom();
        }
        layoutParams2.height = paddingTop;
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams3) != null) {
            layoutParams.gravity = 17;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLIZ.clear();
        for (int size = this.LLIZ.size(); size < i; size++) {
            ImageView imageViewLIZJ = LIZJ(size);
            addView(imageViewLIZJ);
            this.LLIZ.add(imageViewLIZJ);
        }
        if (this.LLILZ != 0) {
            getLayoutManager().LJIIJJI(this.LLILZ, 0L);
        }
        this.LLILZ = 0;
        getLayoutManager().LJIIJ(0, 0L);
        if (i > getMaxDots()) {
            getLayoutManager().LJIIIIZZ();
        }
        if (!((ArrayList) this.LLJJIJI).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
            while (it2.hasNext()) {
                try {
                    ((C0SOW) it2.next()).setCount(i);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    public final void setDarkMode(boolean z) {
        if (getLayoutManager().LIZ == z) {
            if (!((ArrayList) this.LLJJIJI).isEmpty()) {
                Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
                while (it2.hasNext()) {
                    try {
                        ((C0SOW) it2.next()).setDarkMode(z);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                return;
            }
            return;
        }
        getLayoutManager().LIZ = z;
        if (this.LLILZLL <= 1) {
            if (!((ArrayList) this.LLJJIJI).isEmpty()) {
                Iterator it3 = ((ArrayList) this.LLJJIJI).iterator();
                while (it3.hasNext()) {
                    try {
                        ((C0SOW) it3.next()).setDarkMode(z);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th2) {
                        TryCatchGuardChecker.doCheck(th2);
                        C189200o6.m2constructorimpl(new C098200Yq(th2));
                    }
                }
                return;
            }
            return;
        }
        int size = this.LLIZ.size();
        for (int i = 0; i < size; i++) {
            ((ImageView) ListProtector.get(this.LLIZ, i)).setImageResource(getLayoutManager().LIZIZ());
            C786410Ut5.V4((ImageView) ListProtector.get(this.LLIZ, i), getLayoutManager().LIZ());
        }
        if (this.LLILZLL > getMaxDots()) {
            getLayoutManager().LJIIIIZZ();
        }
        ImageView imageViewLIZLLL = LIZLLL(this.LLILZ);
        if (imageViewLIZLLL != null) {
            imageViewLIZLLL.setImageResource(getLayoutManager().LIZIZ());
            C786410Ut5.V4(imageViewLIZLLL, 1.0f);
        }
        if (!((ArrayList) this.LLJJIJI).isEmpty()) {
            Iterator it4 = ((ArrayList) this.LLJJIJI).iterator();
            while (it4.hasNext()) {
                try {
                    ((C0SOW) it4.next()).setDarkMode(z);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th3) {
                    TryCatchGuardChecker.doCheck(th3);
                    C189200o6.m2constructorimpl(new C098200Yq(th3));
                }
            }
        }
    }

    public void setDotSize(boolean z) {
        if (z) {
            LLJJIJIL = 7.0d;
        } else {
            LLJJIJIL = 6.0d;
        }
        if (!((ArrayList) this.LLJJIJI).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
            while (it2.hasNext()) {
                try {
                    ((C0SOW) it2.next()).setDotSize(z);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    public void setIsTabletCarousel(boolean z) {
        this.LLJ = z;
        if (!((ArrayList) this.LLJJIJI).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
            while (it2.hasNext()) {
                try {
                    ((C0SOW) it2.next()).setIsTabletCarousel(z);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    public void setLayoutManager(AbstractC720520SOc abstractC720520SOc) {
        this.LLJJIII = abstractC720520SOc;
    }

    public void setLayoutManager$post_mode_release(EnumC707300Rom enumC707300Rom) {
        AbstractC720520SOc c0sox;
        if (getLayoutManager().LIZLLL() == enumC707300Rom) {
            if (!((ArrayList) this.LLJJIJI).isEmpty()) {
                Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
                while (it2.hasNext()) {
                    try {
                        ((C0SOW) it2.next()).setLayoutManager$post_mode_release(enumC707300Rom);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
                return;
            }
            return;
        }
        int i = C707310Ron.LIZ[enumC707300Rom.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    c0sox = new C0SOY(this, getContext());
                } else {
                    throw new C1954807lC();
                }
            } else {
                c0sox = new C0SOZ(this);
            }
        } else {
            c0sox = new C0SOX(this);
        }
        setLayoutManager(c0sox);
        if (!((ArrayList) this.LLJJIJI).isEmpty()) {
            Iterator it3 = ((ArrayList) this.LLJJIJI).iterator();
            while (it3.hasNext()) {
                try {
                    ((C0SOW) it3.next()).setLayoutManager$post_mode_release(enumC707300Rom);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    C189200o6.m2constructorimpl(new C098200Yq(th2));
                }
            }
        }
    }

    public void setLifecycleOwner(LifecycleOwner lifecycleOwner) {
        if (this.LL == null) {
            this.LL = new SafeHandler(lifecycleOwner);
        }
    }

    public final void setMargin(int i) {
        this.LLILLL = i;
    }

    @Override // X.C0SC9
    public void setSelectedIndex(int i) {
        if (i != this.LLILZ && i >= 0 && i < this.LLILZLL) {
            getLayoutManager().LJIIIZ(i);
            if (!((ArrayList) this.LLJJIJI).isEmpty()) {
                Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
                while (it2.hasNext()) {
                    try {
                        ((C0SOW) it2.next()).setSelectedIndex(i);
                        C189200o6.m2constructorimpl(Unit.LIZ);
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
    }

    public final void setDotSize(int i) {
        this.LLILLJJLI = i;
    }

    public C0SOW(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public static void LJIILJJIL(int i, View view) {
        if (view.getLayoutParams().width == i) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = i;
            C786410Ut5.W5(view, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void LJIILIIL(float f, int i) {
        if (i != this.LLILZ) {
            return;
        }
        getLayoutManager().LJIILJJIL(f);
        if (!((ArrayList) this.LLJJIJI).isEmpty()) {
            Iterator it2 = ((ArrayList) this.LLJJIJI).iterator();
            while (it2.hasNext()) {
                try {
                    ((C0SOW) it2.next()).LJIILIIL(f, i);
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
        }
    }

    public C0SOW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        this.LLIZ = new ArrayList<>();
        Paint paintLJFF = LJFF(false);
        this.LLJILLL = paintLJFF;
        this.LLJJ = C452501pT.LIZIZ(new AwS555S0100000_11(this, 993));
        this.LLJJI = paintLJFF;
        this.LLJJIII = new C0SOX(this);
        this.LLJJIJI = new ArrayList();
        this.LLILLJJLI = C341940Daq.LIZ(LLJJIJIL);
        this.LLILLL = C341940Daq.LIZ(LLJJIJIL);
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    public static void LJIIJJI(View view, int i, int i2, int i3, int i4) {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.leftMargin = i;
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.rightMargin = i3;
                marginLayoutParams.bottomMargin = i4;
            }
            C786410Ut5.W5(view, layoutParams);
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
