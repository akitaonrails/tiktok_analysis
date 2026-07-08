package X;

import Y.AAListenerS279S0200000_33;
import Y.AAListenerS343S0100000_33;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.viewchecker.RemoveViewCausedNPEChecker;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.19nW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public class C21646019nW extends LinearLayout {
    public final int LL;
    public final int LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public final ArrayList<ImageView> LLILZLL;
    public boolean LLIZ;
    public AnimatorSet LLIZLLLIL;
    public Animator LLJ;
    public Animator LLJI;
    public int LLJIJIL;
    public final int LLJILJIL;
    public final List<Float> LLJILJILJ;
    public AbstractC21646219nY LLJILLL;

    public final int getLastRealPos() {
        return this.LLILZIL - 1;
    }

    public final int getLeftBoundPos() {
        return this.LLILLL - this.LLILZ;
    }

    public final int getOffsetPos() {
        return this.LLILLL - this.LLJIJIL;
    }

    private final int getMaxDots() {
        getLayoutManager().LIZJ();
        return 6;
    }

    public final float getDotIndicatorBackgroundAlpha() {
        getLayoutManager().LIZ();
        return 0.6f;
    }

    public final int getLeftBoundOffsetPos() {
        return getLeftBoundPos() - this.LLJIJIL;
    }

    public final int getRightBoundOffsetPos() {
        return getRightBoundPos() - this.LLJIJIL;
    }

    public final int getRightBoundPos() {
        return (getLeftBoundPos() + getMaxDots()) - 1;
    }

    public AbstractC21646219nY getLayoutManager() {
        return this.LLJILLL;
    }

    public final ImageView LIZ(int i) {
        ImageView imageView = new ImageView(getContext());
        getLayoutManager().LIZIZ();
        imageView.setImageResource(R.drawable.bbo);
        C786410Ut5.V4(imageView, getDotIndicatorBackgroundAlpha());
        int i2 = this.LL;
        int i3 = this.LLILLJJLI;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(i2, i2);
        if (i > 0) {
            layoutParams.setMarginStart(i3);
        }
        C786410Ut5.c6(imageView, layoutParams);
        return imageView;
    }

    public final void LIZLLL(boolean z) {
        boolean z2;
        AnimatorSet animatorSet = this.LLIZLLLIL;
        if (animatorSet != null && animatorSet.isRunning()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            AnimatorSet animatorSet2 = this.LLIZLLLIL;
            if (animatorSet2 != null) {
                animatorSet2.cancel();
            }
            int maxDots = getMaxDots() + (this.LLJILJIL * 2);
            for (int i = 0; i < maxDots; i++) {
                C786410Ut5.Lc((ImageView) ListProtector.get(this.LLILZLL, i), ((Number) ListProtector.get(this.LLJILJILJ, i)).floatValue());
            }
        }
        this.LLIZLLLIL = new AnimatorSet();
        int i2 = this.LLILLJJLI + this.LL;
        if (z) {
            i2 = -i2;
        }
        if (C426750GoL.LIZLLL(getContext())) {
            i2 = -i2;
        }
        int size = this.LLJILJILJ.size();
        for (int i3 = 0; i3 < size; i3++) {
            List<Float> list = this.LLJILJILJ;
            ListProtector.set(list, i3, Float.valueOf(((Number) ListProtector.get(list, i3)).floatValue() + i2));
        }
        AnimatorSet animatorSet3 = this.LLIZLLLIL;
        if (animatorSet3 != null) {
            ArrayList<ImageView> arrayList = this.LLILZLL;
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
            int i4 = 0;
            for (ImageView imageView : arrayList) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    ImageView imageView2 = imageView;
                    arrayList2.add(ObjectAnimator.ofFloat(imageView2, "translationX", imageView2.getTranslationX(), ((Number) ListProtector.get(this.LLJILJILJ, i4)).floatValue()));
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
            animatorSet3.playTogether(new ArrayList(arrayList2));
        }
        AnimatorSet animatorSet4 = this.LLIZLLLIL;
        if (animatorSet4 != null) {
            animatorSet4.setDuration(200L);
        }
        AnimatorSet animatorSet5 = this.LLIZLLLIL;
        if (animatorSet5 != null) {
            animatorSet5.start();
        }
    }

    public final void setCount(int i) {
        int maxDots;
        int maxDots2;
        int i2;
        LinearLayout.LayoutParams layoutParams;
        if (i <= 1) {
            return;
        }
        int i3 = this.LLILZIL;
        this.LLILZ = 0;
        this.LLILZIL = i;
        ViewGroup.LayoutParams layoutParams2 = getLayoutParams();
        if (this.LLILZIL >= getMaxDots()) {
            maxDots = this.LL * getMaxDots();
            maxDots2 = getMaxDots() - 1;
            i2 = this.LLILLJJLI;
        } else {
            int i4 = this.LL;
            int i5 = this.LLILZIL;
            maxDots = i4 * i5;
            maxDots2 = i5 - 1;
            i2 = this.LLILLJJLI;
        }
        layoutParams2.width = maxDots + (maxDots2 * i2) + getPaddingStart() + getPaddingEnd();
        if (this.LLIZ) {
            getLayoutParams().height = (getPaddingTop() - 2) + getPaddingBottom();
        }
        ViewGroup.LayoutParams layoutParams3 = getLayoutParams();
        if ((layoutParams3 instanceof LinearLayout.LayoutParams) && (layoutParams = (LinearLayout.LayoutParams) layoutParams3) != null) {
            layoutParams.gravity = 17;
        }
        RemoveViewCausedNPEChecker.recordViewRemovedPoint(this, null);
        removeAllViews();
        this.LLILZLL.clear();
        ((ArrayList) this.LLJILJILJ).clear();
        if (this.LLILZIL <= getMaxDots()) {
            int i6 = this.LLILZIL;
            for (int i7 = 0; i7 < i6; i7++) {
                ImageView imageViewLIZ = LIZ(i7);
                addView(imageViewLIZ);
                this.LLILZLL.add(imageViewLIZ);
                ((ArrayList) this.LLJILJILJ).add(Float.valueOf(imageViewLIZ.getTranslationX()));
            }
        } else {
            int maxDots3 = getMaxDots();
            int i8 = this.LLJILJIL;
            int i9 = maxDots3 + (i8 * 2);
            int i10 = (-i8) * (this.LLILLJJLI + this.LL);
            if (C426750GoL.LIZLLL(getContext())) {
                i10 = -i10;
            }
            for (int i11 = 0; i11 < i9; i11++) {
                ImageView imageViewLIZ2 = LIZ(i11);
                float f = i10;
                C786410Ut5.Lc(imageViewLIZ2, f);
                addView(imageViewLIZ2);
                this.LLILZLL.add(imageViewLIZ2);
                ((ArrayList) this.LLJILJILJ).add(Float.valueOf(f));
            }
        }
        if (this.LLILLL != 0) {
            if (i3 <= getMaxDots()) {
                LIZJ(this.LLILLL, 0L);
            } else {
                LIZJ(getOffsetPos(), 0L);
            }
        }
        this.LLILLL = 0;
        if (this.LLILZIL <= getMaxDots()) {
            this.LLJIJIL = 0;
        } else {
            this.LLJIJIL = -this.LLJILJIL;
            getLayoutManager().LJI();
        }
        LIZIZ(getOffsetPos(), 0L);
    }

    public final void setIsTabletCarousel(boolean z) {
        this.LLIZ = z;
    }

    public void setLayoutManager(AbstractC21646219nY abstractC21646219nY) {
        this.LLJILLL = abstractC21646219nY;
    }

    public final void setSelectedIndex(int i) {
        if (i != this.LLILLL && i >= 0 && i < this.LLILZIL) {
            AbstractC21646219nY layoutManager = getLayoutManager();
            int i2 = layoutManager.LIZ.LLILZIL;
            layoutManager.LIZJ();
            if (i2 <= 6) {
                if (Math.abs(i - layoutManager.LIZ.LLILLL) == 1) {
                    if (i > layoutManager.LIZ.LLILLL) {
                        layoutManager.LJIIIIZZ();
                        return;
                    } else {
                        layoutManager.LJII();
                        return;
                    }
                }
                layoutManager.LIZLLL(i);
                return;
            }
            if (Math.abs(i - layoutManager.LIZ.LLILLL) == 1) {
                if (i > layoutManager.LIZ.LLILLL) {
                    layoutManager.LJFF();
                    return;
                } else {
                    layoutManager.LJ();
                    return;
                }
            }
            layoutManager.LIZLLL(i);
        }
    }

    public C21646019nW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.LLILZLL = new ArrayList<>();
        this.LLJILJIL = 2;
        this.LLJILJILJ = new ArrayList();
        this.LLJILLL = new AbstractC21646219nY() { // from class: X.19nX
            @Override // X.AbstractC21646219nY
            public final void LIZ() {
            }

            @Override // X.AbstractC21646219nY
            public final void LIZIZ() {
            }

            @Override // X.AbstractC21646219nY
            public final void LIZJ() {
            }

            @Override // X.AbstractC21646219nY
            public final void LJ() {
                float f;
                boolean z = this.LIZIZ.getLeftBoundPos() > 0;
                C21646019nW c21646019nW = this.LIZIZ;
                c21646019nW.LIZJ(c21646019nW.getOffsetPos(), 200L);
                C21646019nW c21646019nW2 = this.LIZIZ;
                c21646019nW2.LLILLL--;
                int i = c21646019nW2.LLILZ;
                if (i > 1 || !z) {
                    c21646019nW2.LLILZ = i - 1;
                } else {
                    int iLJIIJ = C1697810uHb.LJIIJ(this.LIZ.LLILZLL);
                    ImageView imageView = (ImageView) ListProtector.remove(this.LIZ.LLILZLL, iLJIIJ);
                    float fFloatValue = ((Number) ListProtector.remove(this.LIZ.LLJILJILJ, iLJIIJ)).floatValue();
                    if (C426750GoL.LIZLLL(this.LIZ.getContext())) {
                        C21646019nW c21646019nW3 = this.LIZ;
                        float f2 = c21646019nW3.LL + c21646019nW3.LLILLJJLI;
                        c21646019nW3.getLayoutManager().LIZJ();
                        f = fFloatValue + (f2 * (6 + (this.LIZ.LLJILJIL * 2)));
                    } else {
                        C21646019nW c21646019nW4 = this.LIZ;
                        float f3 = c21646019nW4.LL + c21646019nW4.LLILLJJLI;
                        c21646019nW4.getLayoutManager().LIZJ();
                        f = fFloatValue - (f3 * (6 + (this.LIZ.LLJILJIL * 2)));
                    }
                    C786410Ut5.Lc(imageView, f);
                    ListProtector.add(this.LIZ.LLILZLL, 0, imageView);
                    ListProtector.add(this.LIZ.LLJILJILJ, 0, Float.valueOf(imageView.getTranslationX()));
                    C21646019nW c21646019nW5 = this.LIZ;
                    c21646019nW5.LLJIJIL--;
                    this.LIZIZ.LIZLLL(false);
                    LJI();
                }
                C21646019nW c21646019nW6 = this.LIZIZ;
                c21646019nW6.LIZIZ(c21646019nW6.getOffsetPos(), 200L);
            }

            @Override // X.AbstractC21646219nY
            public final void LJFF() {
                float f;
                boolean z = this.LIZIZ.getLastRealPos() - this.LIZIZ.getRightBoundPos() > 0;
                C21646019nW c21646019nW = this.LIZIZ;
                c21646019nW.LIZJ(c21646019nW.getOffsetPos(), 200L);
                C21646019nW c21646019nW2 = this.LIZIZ;
                c21646019nW2.LLILLL++;
                int i = c21646019nW2.LLILZ;
                if (i < 4 || !z) {
                    c21646019nW2.LLILZ = i + 1;
                } else {
                    ImageView imageView = (ImageView) ListProtector.remove(this.LIZ.LLILZLL, 0);
                    float fFloatValue = ((Number) ListProtector.remove(this.LIZ.LLJILJILJ, 0)).floatValue();
                    if (C426750GoL.LIZLLL(this.LIZ.getContext())) {
                        C21646019nW c21646019nW3 = this.LIZ;
                        float f2 = c21646019nW3.LL + c21646019nW3.LLILLJJLI;
                        c21646019nW3.getLayoutManager().LIZJ();
                        f = fFloatValue - (f2 * (6 + (this.LIZ.LLJILJIL * 2)));
                    } else {
                        C21646019nW c21646019nW4 = this.LIZ;
                        float f3 = c21646019nW4.LL + c21646019nW4.LLILLJJLI;
                        c21646019nW4.getLayoutManager().LIZJ();
                        f = fFloatValue + (f3 * (6 + (this.LIZ.LLJILJIL * 2)));
                    }
                    C786410Ut5.Lc(imageView, f);
                    this.LIZ.LLILZLL.add(imageView);
                    ((ArrayList) this.LIZ.LLJILJILJ).add(Float.valueOf(imageView.getTranslationX()));
                    this.LIZ.LLJIJIL++;
                    this.LIZIZ.LIZLLL(true);
                    LJI();
                }
                C21646019nW c21646019nW5 = this.LIZIZ;
                c21646019nW5.LIZIZ(c21646019nW5.getOffsetPos(), 200L);
            }

            @Override // X.AbstractC21646219nY
            public final void LJI() {
                if (this.LIZIZ.getLeftBoundPos() == 0) {
                    LJIIIZ(this.LIZIZ.getLeftBoundOffsetPos());
                } else {
                    LJIIJ(this.LIZIZ.getLeftBoundOffsetPos());
                }
                if (this.LIZIZ.getRightBoundPos() == this.LIZIZ.getLastRealPos()) {
                    LJIIIZ(this.LIZIZ.getRightBoundOffsetPos());
                } else {
                    LJIIJ(this.LIZIZ.getRightBoundOffsetPos());
                }
            }

            @Override // X.AbstractC21646219nY
            public final void LJII() {
                C21646019nW c21646019nW = this.LIZIZ;
                c21646019nW.LIZJ(c21646019nW.LLILZ, 200L);
                this.LIZIZ.LIZIZ(r1.LLILLL - 1, 200L);
                C21646019nW c21646019nW2 = this.LIZIZ;
                c21646019nW2.LLILLL--;
                c21646019nW2.LLILZ--;
            }

            @Override // X.AbstractC21646219nY
            public final void LJIIIIZZ() {
                C21646019nW c21646019nW = this.LIZIZ;
                c21646019nW.LIZJ(c21646019nW.LLILZ, 200L);
                C21646019nW c21646019nW2 = this.LIZIZ;
                c21646019nW2.LIZIZ(c21646019nW2.LLILLL + 1, 200L);
                C21646019nW c21646019nW3 = this.LIZIZ;
                c21646019nW3.LLILLL++;
                c21646019nW3.LLILZ++;
            }

            {
                super(this.LIZIZ);
            }

            @Override // X.AbstractC21646219nY
            public final void LIZLLL(int i) {
                C21646019nW c21646019nW = this.LIZIZ;
                if (i == c21646019nW.LLILLL) {
                    return;
                }
                if (i >= 0 && i < c21646019nW.LLILZIL) {
                    c21646019nW.LIZJ(c21646019nW.getOffsetPos(), 0L);
                    C21646019nW c21646019nW2 = this.LIZIZ;
                    c21646019nW2.LLILLL = i;
                    int i2 = c21646019nW2.LLILZIL;
                    if (i2 <= 6) {
                        c21646019nW2.LLILZ = i;
                    } else {
                        if (i >= 0 && i <= 4) {
                            c21646019nW2.LLILZ = i;
                            c21646019nW2.LLJIJIL = -c21646019nW2.LLJILJIL;
                            int rightBoundOffsetPos = this.LIZIZ.getRightBoundOffsetPos();
                            for (int leftBoundOffsetPos = c21646019nW2.getLeftBoundOffsetPos(); leftBoundOffsetPos < rightBoundOffsetPos; leftBoundOffsetPos++) {
                                LJIIIZ(leftBoundOffsetPos);
                            }
                            LJIIJ(this.LIZIZ.getRightBoundOffsetPos());
                        } else if (i <= (i2 - 1) - 1 && 5 <= i) {
                            c21646019nW2.LLILZ = 4;
                            c21646019nW2.LLJIJIL = i - 6;
                            int leftBoundOffsetPos2 = c21646019nW2.getLeftBoundOffsetPos() + 1;
                            int rightBoundOffsetPos2 = this.LIZIZ.getRightBoundOffsetPos();
                            if (leftBoundOffsetPos2 <= rightBoundOffsetPos2) {
                                while (true) {
                                    LJIIIZ(leftBoundOffsetPos2);
                                    if (leftBoundOffsetPos2 == rightBoundOffsetPos2) {
                                        break;
                                    } else {
                                        leftBoundOffsetPos2++;
                                    }
                                }
                            }
                            LJIIJ(this.LIZIZ.getLeftBoundOffsetPos());
                            if (i + 1 < this.LIZIZ.getLastRealPos()) {
                                LJIIJ(this.LIZIZ.getRightBoundOffsetPos());
                            }
                        } else {
                            c21646019nW2.LLILZ = 5;
                            c21646019nW2.LLJIJIL = (i - 6) - 1;
                            LJIIJ(c21646019nW2.getLeftBoundOffsetPos());
                            int rightBoundOffsetPos3 = this.LIZIZ.getRightBoundOffsetPos() + 1;
                            for (int leftBoundOffsetPos3 = this.LIZIZ.getLeftBoundOffsetPos() + 1; leftBoundOffsetPos3 < rightBoundOffsetPos3; leftBoundOffsetPos3++) {
                                LJIIIZ(leftBoundOffsetPos3);
                            }
                        }
                        AnimatorSet animatorSet = this.LIZIZ.LLIZLLLIL;
                        if (animatorSet != null) {
                            animatorSet.cancel();
                        }
                        int size = this.LIZIZ.LLILZLL.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            C786410Ut5.Lc((ImageView) ListProtector.get(this.LIZIZ.LLILZLL, i3), ((Number) ListProtector.get(this.LIZIZ.LLJILJILJ, i3)).floatValue());
                        }
                    }
                    C21646019nW c21646019nW3 = this.LIZIZ;
                    c21646019nW3.LIZIZ(c21646019nW3.getOffsetPos(), 0L);
                }
            }

            public final void LJIIIZ(int i) {
                if (i >= 0 && i < this.LIZIZ.LLILZLL.size()) {
                    C21646019nW c21646019nW = this.LIZIZ;
                    ImageView imageView = (ImageView) ListProtector.get(c21646019nW.LLILZLL, i);
                    c21646019nW.getLayoutManager().LIZIZ();
                    imageView.setImageResource(R.drawable.bbo);
                    C786410Ut5.V4((ImageView) ListProtector.get(this.LIZIZ.LLILZLL, i), 0.6f);
                }
            }

            public final void LJIIJ(int i) {
                if (i >= 0 && i < this.LIZIZ.LLILZLL.size()) {
                    C786410Ut5.V4((ImageView) ListProtector.get(this.LIZIZ.LLILZLL, i), 0.6f);
                    ((ImageView) ListProtector.get(this.LIZIZ.LLILZLL, i)).setImageResource(R.drawable.bbp);
                }
            }
        };
        this.LL = C341940Daq.LIZ(6.0d);
        this.LLILLJJLI = C341940Daq.LIZ(6.0d);
        setWillNotDraw(false);
        setLayerType(2, null);
    }

    public final void LIZIZ(int i, long j) {
        ImageView imageView;
        if (i >= 0 && i < this.LLILZLL.size() && (imageView = (ImageView) ListProtector.get(this.LLILZLL, i)) != null) {
            getLayoutManager().LIZIZ();
            imageView.setImageResource(R.drawable.bbo);
            C786410Ut5.V4(imageView, getDotIndicatorBackgroundAlpha());
            Animator animator = this.LLJ;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "alpha", getDotIndicatorBackgroundAlpha(), 1.0f);
            objectAnimatorOfFloat.setDuration(j);
            objectAnimatorOfFloat.addListener(new AAListenerS343S0100000_33(imageView, 5));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            this.LLJ = objectAnimatorOfFloat;
        }
    }

    public final void LIZJ(int i, long j) {
        ImageView imageView;
        if (i >= 0 && i < this.LLILZLL.size() && (imageView = (ImageView) ListProtector.get(this.LLILZLL, i)) != null) {
            getLayoutManager().LIZIZ();
            imageView.setImageResource(R.drawable.bbo);
            C786410Ut5.V4(imageView, 1.0f);
            Animator animator = this.LLJI;
            if (animator != null) {
                animator.cancel();
            }
            ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, "alpha", 1.0f, getDotIndicatorBackgroundAlpha());
            objectAnimatorOfFloat.setDuration(j);
            objectAnimatorOfFloat.addListener(new AAListenerS279S0200000_33(imageView, this, 3));
            C786410Ut5.Pd(objectAnimatorOfFloat);
            this.LLJI = objectAnimatorOfFloat;
        }
    }
}
