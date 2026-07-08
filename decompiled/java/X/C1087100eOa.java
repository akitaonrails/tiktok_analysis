package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0eOa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public class C1087100eOa extends C19MX {
    public float LL;
    public float LLILLJJLI;
    public float LLILLL;
    public ConstraintLayout LLILZ;
    public float LLILZIL;
    public float LLILZLL;
    public float LLIZ;
    public float LLIZLLLIL;
    public float LLJ;
    public float LLJI;
    public float LLJIJIL;
    public float LLJILJIL;
    public final boolean LLJILJILJ;
    public View[] LLJILLL;
    public float LLJJ;
    public float LLJJI;
    public boolean LLJJIII;
    public boolean LLJJIJI;

    public final void LJ() {
        if (this.LLILZ == null) {
            return;
        }
        if (this.LLJILJILJ || Float.isNaN(this.LLIZ) || Float.isNaN(this.LLIZLLLIL)) {
            if (!Float.isNaN(this.LL) && !Float.isNaN(this.LLILLJJLI)) {
                this.LLIZLLLIL = this.LLILLJJLI;
                this.LLIZ = this.LL;
                return;
            }
            View[] views = getViews(this.LLILZ);
            int left = views[0].getLeft();
            int top = views[0].getTop();
            int right = views[0].getRight();
            int bottom = views[0].getBottom();
            for (int i = 0; i < this.mCount; i++) {
                View view = views[i];
                left = Math.min(left, view.getLeft());
                top = Math.min(top, view.getTop());
                right = Math.max(right, view.getRight());
                bottom = Math.max(bottom, view.getBottom());
            }
            this.LLJ = right;
            this.LLJI = bottom;
            this.LLJIJIL = left;
            this.LLJILJIL = top;
            if (Float.isNaN(this.LL)) {
                this.LLIZ = (left + right) / 2;
            } else {
                this.LLIZ = this.LL;
            }
            if (Float.isNaN(this.LLILLJJLI)) {
                this.LLIZLLLIL = (top + bottom) / 2;
            } else {
                this.LLIZLLLIL = this.LLILLJJLI;
            }
        }
    }

    public final void LJFF() {
        int i;
        if (this.LLILZ == null || (i = this.mCount) == 0) {
            return;
        }
        View[] viewArr = this.LLJILLL;
        if (viewArr == null || viewArr.length != i) {
            this.LLJILLL = new View[i];
        }
        for (int i2 = 0; i2 < this.mCount; i2++) {
            this.LLJILLL[i2] = this.LLILZ.getViewById(this.mIds[i2]);
        }
    }

    public final void transform() {
        if (this.LLILZ == null) {
            return;
        }
        if (this.LLJILLL == null) {
            LJFF();
        }
        LJ();
        double radians = Float.isNaN(this.LLILLL) ? 0.0d : Math.toRadians(this.LLILLL);
        float fSin = (float) Math.sin(radians);
        float fCos = (float) Math.cos(radians);
        float f = this.LLILZIL;
        float f2 = f * fCos;
        float f3 = this.LLILZLL;
        float f4 = (-f3) * fSin;
        float f5 = f * fSin;
        float f6 = f3 * fCos;
        for (int i = 0; i < this.mCount; i++) {
            View view = this.LLJILLL[i];
            int left = (view.getLeft() + view.getRight()) / 2;
            int top = (view.getTop() + view.getBottom()) / 2;
            float f7 = left - this.LLIZ;
            float f8 = top - this.LLIZLLLIL;
            float f9 = (((f2 * f7) + (f4 * f8)) - f7) + this.LLJJ;
            float f10 = (((f7 * f5) + (f6 * f8)) - f8) + this.LLJJI;
            C786410Ut5.Jc(view, f9);
            C786410Ut5.ed(view, f10);
            C786410Ut5.pc(view, this.LLILZLL);
            C786410Ut5.Ob(view, this.LLILZIL);
            if (!Float.isNaN(this.LLILLL)) {
                C786410Ut5.Ab(view, this.LLILLL);
            }
        }
    }

    @Override // X.C19MX, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.LLILZ = (ConstraintLayout) getParent();
        if (this.LLJJIII || this.LLJJIJI) {
            int visibility = getVisibility();
            float elevation = getElevation();
            for (int i = 0; i < this.mCount; i++) {
                View viewById = this.LLILZ.getViewById(this.mIds[i]);
                if (viewById != null) {
                    if (this.LLJJIII) {
                        C786410Ut5.LJLLLLLL(visibility, viewById);
                    }
                    if (this.LLJJIJI && elevation > 0.0f) {
                        viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                    }
                }
            }
        }
    }

    @Override // X.C19MX
    public final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mUseViewMeasure = false;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_android_visibility) {
                    this.LLJJIII = true;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_elevation) {
                    this.LLJJIJI = true;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        applyLayoutFeatures();
    }

    @Override // android.view.View
    public void setPivotX(float f) {
        this.LL = f;
        transform();
    }

    @Override // android.view.View
    public void setPivotY(float f) {
        this.LLILLJJLI = f;
        transform();
    }

    @Override // android.view.View
    public void setRotation(float f) {
        this.LLILLL = f;
        transform();
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        this.LLILZIL = f;
        transform();
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        this.LLILZLL = f;
        transform();
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        this.LLJJ = f;
        transform();
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        this.LLJJI = f;
        transform();
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        applyLayoutFeatures();
    }

    @Override // X.C19MX
    public final void updatePostLayout(ConstraintLayout constraintLayout) {
        LJFF();
        this.LLIZ = Float.NaN;
        this.LLIZLLLIL = Float.NaN;
        C19OA c19oa = ((C19ME) getLayoutParams()).widget;
        c19oa.setWidth(0);
        c19oa.setHeight(0);
        LJ();
        layout(((int) this.LLJIJIL) - getPaddingLeft(), ((int) this.LLJILJIL) - getPaddingTop(), ((int) this.LLJ) + getPaddingRight(), ((int) this.LLJI) + getPaddingBottom());
        transform();
    }

    @Override // X.C19MX
    public final void updatePreDraw(ConstraintLayout constraintLayout) {
        this.LLILZ = constraintLayout;
        float rotation = getRotation();
        if (rotation == 0.0f) {
            if (!Float.isNaN(this.LLILLL)) {
                this.LLILLL = rotation;
                return;
            }
            return;
        }
        this.LLILLL = rotation;
    }

    public C1087100eOa(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.LL = Float.NaN;
        this.LLILLJJLI = Float.NaN;
        this.LLILLL = Float.NaN;
        this.LLILZIL = 1.0f;
        this.LLILZLL = 1.0f;
        this.LLIZ = Float.NaN;
        this.LLIZLLLIL = Float.NaN;
        this.LLJ = Float.NaN;
        this.LLJI = Float.NaN;
        this.LLJIJIL = Float.NaN;
        this.LLJILJIL = Float.NaN;
        this.LLJILJILJ = true;
    }
}
