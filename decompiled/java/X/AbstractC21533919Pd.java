package X;

import X.C19PH;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.widget.ProgressBar;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: renamed from: X.19Pd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public abstract class AbstractC21533919Pd<S extends C19PH> extends ProgressBar {
    public final S LL;
    public int LLILLJJLI;
    public boolean LLILLL;
    public final boolean LLILZ;
    public final int LLILZIL;
    public C21534419Pi LLILZLL;
    public boolean LLIZ;
    public int LLIZLLLIL;
    public final RunnableC419450GcZ LLJ;
    public final RunnableC21533819Pc LLJI;
    public final C21534219Pg LLJIJIL;
    public final C21534119Pf LLJILJIL;

    public abstract S LIZ(Context context, AttributeSet attributeSet);

    public int getHideAnimationBehavior() {
        return this.LL.LJFF;
    }

    public int[] getIndicatorColor() {
        return this.LL.LIZJ;
    }

    public int getShowAnimationBehavior() {
        return this.LL.LJ;
    }

    public int getTrackColor() {
        return this.LL.LIZLLL;
    }

    public int getTrackCornerRadius() {
        return this.LL.LIZIZ;
    }

    public int getTrackThickness() {
        return this.LL.LIZ;
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onDetachedFromWindow() {
        HandlerHook.viewRemoveCallbacks(this, this.LLJI);
        HandlerHook.viewRemoveCallbacks(this, this.LLJ);
        ((AbstractC21534819Pm) getCurrentDrawable()).LJ(false, false, false);
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().LJI(this.LLJILJIL);
            getIndeterminateDrawable().LLJILJILJ.LJFF();
        }
        if (getProgressDrawable() != null) {
            getProgressDrawable().LJI(this.LLJILJIL);
        }
        super.onDetachedFromWindow();
    }

    private AbstractC21534019Pe<S> getCurrentDrawingDelegate() {
        if (isIndeterminate()) {
            if (getIndeterminateDrawable() != null) {
                return getIndeterminateDrawable().LLJILJIL;
            }
            return null;
        }
        if (getProgressDrawable() != null) {
            return getProgressDrawable().LLJILJIL;
        }
        return null;
    }

    public final boolean LIZJ() {
        if (!isAttachedToWindow() || getWindowVisibility() != 0) {
            return false;
        }
        View view = this;
        while (view.getVisibility() == 0) {
            Object parent = view.getParent();
            if (parent == null) {
                if (getWindowVisibility() != 0) {
                    return false;
                }
            } else if (parent instanceof View) {
                view = (View) parent;
            }
            return true;
        }
        return false;
    }

    @Override // android.widget.ProgressBar
    public Drawable getCurrentDrawable() {
        return isIndeterminate() ? getIndeterminateDrawable() : getProgressDrawable();
    }

    @Override // android.widget.ProgressBar
    public C21534619Pk<S> getIndeterminateDrawable() {
        return (C21534619Pk) super.getIndeterminateDrawable();
    }

    @Override // android.widget.ProgressBar
    public C21534719Pl<S> getProgressDrawable() {
        return (C21534719Pl) super.getProgressDrawable();
    }

    @Override // android.view.View
    public final void invalidate() {
        super.invalidate();
        if (getCurrentDrawable() != null) {
            getCurrentDrawable().invalidateSelf();
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getProgressDrawable() != null && getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().LLJILJILJ.LIZJ(this.LLJIJIL);
        }
        if (getProgressDrawable() != null) {
            C21534719Pl<S> progressDrawable = getProgressDrawable();
            C21534119Pf c21534119Pf = this.LLJILJIL;
            if (progressDrawable.LLILZLL == null) {
                progressDrawable.LLILZLL = new ArrayList();
            }
            if (!((ArrayList) progressDrawable.LLILZLL).contains(c21534119Pf)) {
                ((ArrayList) progressDrawable.LLILZLL).add(c21534119Pf);
            }
        }
        if (getIndeterminateDrawable() != null) {
            C21534619Pk<S> indeterminateDrawable = getIndeterminateDrawable();
            C21534119Pf c21534119Pf2 = this.LLJILJIL;
            if (indeterminateDrawable.LLILZLL == null) {
                indeterminateDrawable.LLILZLL = new ArrayList();
            }
            if (!((ArrayList) indeterminateDrawable.LLILZLL).contains(c21534119Pf2)) {
                ((ArrayList) indeterminateDrawable.LLILZLL).add(c21534119Pf2);
            }
        }
        if (LIZJ()) {
            if (this.LLILZIL > 0) {
                SystemClock.uptimeMillis();
            }
            int visibility = getVisibility();
            setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, this);
        }
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onDraw(Canvas canvas) {
        int iSave = canvas.save();
        if (getPaddingLeft() != 0 || getPaddingTop() != 0) {
            canvas.translate(getPaddingLeft(), getPaddingTop());
        }
        if (getPaddingRight() != 0 || getPaddingBottom() != 0) {
            canvas.clipRect(0, 0, getWidth() - (getPaddingLeft() + getPaddingRight()), getHeight() - (getPaddingTop() + getPaddingBottom()));
        }
        getCurrentDrawable().draw(canvas);
        canvas.restoreToCount(iSave);
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (this.LLILZ) {
            ((AbstractC21534819Pm) getCurrentDrawable()).LJ(LIZJ(), false, false);
        }
    }

    public void setAnimatorDurationScaleProvider(C21534419Pi c21534419Pi) {
        this.LLILZLL = c21534419Pi;
        if (getProgressDrawable() != null) {
            getProgressDrawable().LLILLL = c21534419Pi;
        }
        if (getIndeterminateDrawable() != null) {
            getIndeterminateDrawable().LLILLL = c21534419Pi;
        }
    }

    public void setHideAnimationBehavior(int i) {
        this.LL.LJFF = i;
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public synchronized void setIndeterminate(boolean z) {
        if (z == isIndeterminate()) {
            return;
        }
        if (LIZJ() && z) {
            throw new IllegalStateException("Cannot switch to indeterminate mode while the progress indicator is visible.");
        }
        AbstractC21534819Pm abstractC21534819Pm = (AbstractC21534819Pm) getCurrentDrawable();
        if (abstractC21534819Pm != null) {
            abstractC21534819Pm.LJ(false, false, false);
        }
        super.setIndeterminate(z);
        AbstractC21534819Pm abstractC21534819Pm2 = (AbstractC21534819Pm) getCurrentDrawable();
        if (abstractC21534819Pm2 != null) {
            abstractC21534819Pm2.LJ(LIZJ(), false, false);
        }
        this.LLIZ = false;
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setIndeterminateDrawable(null);
        } else {
            if (drawable instanceof C21534619Pk) {
                ((AbstractC21534819Pm) drawable).LJ(false, false, false);
                super.setIndeterminateDrawable(drawable);
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as indeterminate drawable.");
        }
    }

    public void setIndicatorColor(int... iArr) {
        int i;
        if (iArr.length == 0) {
            iArr = new int[1];
            TypedValue typedValueLIZ = C19PF.LIZ(R.attr.bip, getContext());
            if (typedValueLIZ != null) {
                i = typedValueLIZ.data;
            } else {
                i = -1;
            }
            iArr[0] = i;
        }
        if (!Arrays.equals(getIndicatorColor(), iArr)) {
            this.LL.LIZJ = iArr;
            getIndeterminateDrawable().LLJILJILJ.LIZIZ();
            invalidate();
        }
    }

    @Override // android.widget.ProgressBar
    public synchronized void setProgress(int i) {
        if (isIndeterminate()) {
            return;
        }
        LIZIZ(i, false);
    }

    @Override // android.widget.ProgressBar
    public void setProgressDrawable(Drawable drawable) {
        if (drawable == null) {
            super.setProgressDrawable(null);
        } else {
            if (drawable instanceof C21534719Pl) {
                AbstractC21534819Pm abstractC21534819Pm = (AbstractC21534819Pm) drawable;
                abstractC21534819Pm.LJ(false, false, false);
                super.setProgressDrawable(abstractC21534819Pm);
                abstractC21534819Pm.setLevel((int) ((getProgress() / getMax()) * 10000.0f));
                return;
            }
            throw new IllegalArgumentException("Cannot set framework drawable as progress drawable.");
        }
    }

    public void setShowAnimationBehavior(int i) {
        this.LL.LJ = i;
        invalidate();
    }

    public void setTrackColor(int i) {
        S s = this.LL;
        if (s.LIZLLL != i) {
            s.LIZLLL = i;
            invalidate();
        }
    }

    public void setTrackCornerRadius(int i) {
        S s = this.LL;
        if (s.LIZIZ != i) {
            s.LIZIZ = Math.min(i, s.LIZ / 2);
        }
    }

    public void setTrackThickness(int i) {
        S s = this.LL;
        if (s.LIZ != i) {
            s.LIZ = i;
            requestLayout();
        }
    }

    public void setVisibilityAfterHide(int i) {
        if (i != 0 && i != 4 && i != 8) {
            throw new IllegalArgumentException("The component's visibility must be one of VISIBLE, INVISIBLE, and GONE defined in View.");
        }
        this.LLIZLLLIL = i;
    }

    public void LIZIZ(int i, boolean z) {
        if (isIndeterminate()) {
            if (getProgressDrawable() != null) {
                this.LLILLJJLI = i;
                this.LLILLL = z;
                this.LLIZ = true;
                if (getIndeterminateDrawable().isVisible()) {
                    C21534419Pi c21534419Pi = this.LLILZLL;
                    ContentResolver contentResolver = getContext().getContentResolver();
                    c21534419Pi.getClass();
                    if (Settings.Global.getFloat(contentResolver, "animator_duration_scale", 1.0f) != 0.0f) {
                        getIndeterminateDrawable().LLJILJILJ.LIZLLL();
                        return;
                    }
                }
                C21534219Pg c21534219Pg = this.LLJIJIL;
                getIndeterminateDrawable();
                c21534219Pg.LIZ();
                return;
            }
            return;
        }
        super.setProgress(i);
        if (getProgressDrawable() == null || z) {
            return;
        }
        getProgressDrawable().jumpToCurrentState();
    }

    @Override // android.widget.ProgressBar, android.view.View
    public final synchronized void onMeasure(int i, int i2) {
        int paddingLeft;
        int paddingTop;
        super.onMeasure(i, i2);
        AbstractC21534019Pe<S> currentDrawingDelegate = getCurrentDrawingDelegate();
        if (currentDrawingDelegate == null) {
            return;
        }
        int iLJ = currentDrawingDelegate.LJ();
        int iLIZLLL = currentDrawingDelegate.LIZLLL();
        if (iLJ < 0) {
            paddingLeft = getMeasuredWidth();
        } else {
            paddingLeft = iLJ + getPaddingLeft() + getPaddingRight();
        }
        if (iLIZLLL < 0) {
            paddingTop = getMeasuredHeight();
        } else {
            paddingTop = iLIZLLL + getPaddingTop() + getPaddingBottom();
        }
        setMeasuredDimension(paddingLeft, paddingTop);
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        boolean z;
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        if (this.LLILZ) {
            ((AbstractC21534819Pm) getCurrentDrawable()).LJ(LIZJ(), false, z);
        }
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [X.0GcZ] */
    /* JADX WARN: Type inference failed for: r0v4, types: [X.19Pc] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.19Pg] */
    /* JADX WARN: Type inference failed for: r0v6, types: [X.19Pf] */
    public AbstractC21533919Pd(Context context, AttributeSet attributeSet, int i, int i2) {
        super(C1369550lk9.LIZ(context, attributeSet, i, R.style.a5t), attributeSet, i);
        this.LLIZ = false;
        this.LLIZLLLIL = 4;
        this.LLJ = new Runnable() { // from class: X.0GcZ
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BaseProgressIndicator@d44e.<field>$1");
                try {
                    AbstractC21533919Pd abstractC21533919Pd = this.LL;
                    if (abstractC21533919Pd.LLILZIL > 0) {
                        SystemClock.uptimeMillis();
                    }
                    int visibility = abstractC21533919Pd.getVisibility();
                    abstractC21533919Pd.setVisibility(0);
                    C1602160rnK.LIZIZ(visibility, 0, abstractC21533919Pd);
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BaseProgressIndicator@d44e.<field>$1");
            }
        };
        this.LLJI = new Runnable() { // from class: X.19Pc
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("BaseProgressIndicator@d44e.<field>$2");
                try {
                    AbstractC21533919Pd abstractC21533919Pd = this.LL;
                    ((AbstractC21534819Pm) abstractC21533919Pd.getCurrentDrawable()).LJ(false, false, true);
                    if ((abstractC21533919Pd.getProgressDrawable() == null || !abstractC21533919Pd.getProgressDrawable().isVisible()) && (abstractC21533919Pd.getIndeterminateDrawable() == null || !abstractC21533919Pd.getIndeterminateDrawable().isVisible())) {
                        int visibility = abstractC21533919Pd.getVisibility();
                        abstractC21533919Pd.setVisibility(4);
                        C1602160rnK.LIZIZ(visibility, 4, abstractC21533919Pd);
                    }
                    this.LL.getClass();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("BaseProgressIndicator@d44e.<field>$2");
            }
        };
        this.LLJIJIL = new AbstractC21534319Ph() { // from class: X.19Pg
            @Override // X.AbstractC21534319Ph
            public final void LIZ() {
                this.LIZ.setIndeterminate(false);
                this.LIZ.LIZIZ(0, false);
                AbstractC21533919Pd abstractC21533919Pd = this.LIZ;
                abstractC21533919Pd.LIZIZ(abstractC21533919Pd.LLILLJJLI, abstractC21533919Pd.LLILLL);
            }
        };
        this.LLJILJIL = new AbstractC21534319Ph() { // from class: X.19Pf
            @Override // X.AbstractC21534319Ph
            public final void LIZ() {
                AbstractC21533919Pd abstractC21533919Pd = this.LIZ;
                if (abstractC21533919Pd.LLIZ) {
                    return;
                }
                int i3 = abstractC21533919Pd.LLIZLLLIL;
                int visibility = abstractC21533919Pd.getVisibility();
                abstractC21533919Pd.setVisibility(i3);
                C1602160rnK.LIZIZ(visibility, i3, abstractC21533919Pd);
            }
        };
        Context context2 = getContext();
        this.LL = (S) LIZ(context2, attributeSet);
        TypedArray typedArrayLIZLLL = C19PG.LIZLLL(context2, attributeSet, R$styleable.BaseProgressIndicator, i, i2, new int[0]);
        typedArrayLIZLLL.getInt(R$styleable.BaseProgressIndicator_showDelay, -1);
        this.LLILZIL = Math.min(typedArrayLIZLLL.getInt(R$styleable.BaseProgressIndicator_minHideDelay, -1), LSPassThroughRecordSizeConfig.DEFAULT);
        typedArrayLIZLLL.recycle();
        this.LLILZLL = new C21534419Pi();
        this.LLILZ = true;
    }
}
