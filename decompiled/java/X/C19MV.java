package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19MV, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19MV extends AbstractC1087120eOc {
    public C21530519Nv LLILLL;

    @Override // X.AbstractC1087120eOc, X.C19MX
    public final void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.LLILLL = new C21530519Nv();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_android_orientation) {
                    this.LLILLL.LJJIIZI = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_padding) {
                    C21530519Nv c21530519Nv = this.LLILLL;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c21530519Nv.LIZJ = dimensionPixelSize;
                    c21530519Nv.LIZLLL = dimensionPixelSize;
                    c21530519Nv.LJ = dimensionPixelSize;
                    c21530519Nv.LJFF = dimensionPixelSize;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingStart) {
                    C21530519Nv c21530519Nv2 = this.LLILLL;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c21530519Nv2.LJ = dimensionPixelSize2;
                    c21530519Nv2.LJI = dimensionPixelSize2;
                    c21530519Nv2.LJII = dimensionPixelSize2;
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingEnd) {
                    this.LLILLL.LJFF = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingLeft) {
                    this.LLILLL.LJI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingTop) {
                    this.LLILLL.LIZJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingRight) {
                    this.LLILLL.LJII = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_android_paddingBottom) {
                    this.LLILLL.LIZLLL = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_wrapMode) {
                    this.LLILLL.LJJIIJZLJL = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalStyle) {
                    this.LLILLL.LJIILIIL = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalStyle) {
                    this.LLILLL.LJIILJJIL = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalStyle) {
                    this.LLILLL.LJIILL = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalStyle) {
                    this.LLILLL.LJIIZILJ = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalStyle) {
                    this.LLILLL.LJIILLIIL = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalStyle) {
                    this.LLILLL.LJIJ = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalBias) {
                    this.LLILLL.LJIJI = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstHorizontalBias) {
                    this.LLILLL.LJIJJLI = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastHorizontalBias) {
                    this.LLILLL.LJJ = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_firstVerticalBias) {
                    this.LLILLL.LJIL = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_lastVerticalBias) {
                    this.LLILLL.LJJI = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalBias) {
                    this.LLILLL.LJIJJ = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalAlign) {
                    this.LLILLL.LJJIII = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalAlign) {
                    this.LLILLL.LJJIIJ = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_horizontalGap) {
                    this.LLILLL.LJJIFFI = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_verticalGap) {
                    this.LLILLL.LJJII = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == R$styleable.ConstraintLayout_Layout_flow_maxElementsWrap) {
                    this.LLILLL.LJJIIZ = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.LLILLL;
        validateParams();
    }

    public void setFirstHorizontalBias(float f) {
        this.LLILLL.LJIJJLI = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.LLILLL.LJIILL = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.LLILLL.LJIL = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.LLILLL.LJIILLIIL = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.LLILLL.LJJIII = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.LLILLL.LJIJI = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.LLILLL.LJJIFFI = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.LLILLL.LJIILIIL = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.LLILLL.LJJIIZ = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.LLILLL.LJJIIZI = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C21530519Nv c21530519Nv = this.LLILLL;
        c21530519Nv.LIZJ = i;
        c21530519Nv.LIZLLL = i;
        c21530519Nv.LJ = i;
        c21530519Nv.LJFF = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.LLILLL.LIZLLL = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.LLILLL.LJI = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.LLILLL.LJII = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.LLILLL.LIZJ = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.LLILLL.LJJIIJ = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.LLILLL.LJIJJ = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.LLILLL.LJJII = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.LLILLL.LJIILJJIL = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.LLILLL.LJJIIJZLJL = i;
        requestLayout();
    }

    public C19MV(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // X.C19MX, android.view.View
    public final void onMeasure(int i, int i2) {
        LJ(this.LLILLL, i, i2);
    }

    @Override // X.C19MX
    public final void resolveRtl(C19OA c19oa, boolean z) {
        C21530519Nv c21530519Nv = this.LLILLL;
        int i = c21530519Nv.LJ;
        if (i > 0 || c21530519Nv.LJFF > 0) {
            if (z) {
                c21530519Nv.LJI = c21530519Nv.LJFF;
                c21530519Nv.LJII = i;
            } else {
                c21530519Nv.LJI = i;
                c21530519Nv.LJII = c21530519Nv.LJFF;
            }
        }
    }

    @Override // X.AbstractC1087120eOc
    public final void LJ(C21530419Nu c21530419Nu, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c21530419Nu != null) {
            c21530419Nu.LJ(mode, size, mode2, size2);
            setMeasuredDimension(c21530419Nu.LJIIIZ, c21530419Nu.LJIIJ);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    @Override // X.C19MX
    public final void loadParameters(C19MA c19ma, C21530019Nq c21530019Nq, C19ME c19me, SparseArray<C19OA> sparseArray) {
        super.loadParameters(c19ma, c21530019Nq, c19me, sparseArray);
        if (c21530019Nq instanceof C21530519Nv) {
            C21530519Nv c21530519Nv = (C21530519Nv) c21530019Nq;
            int i = c19me.orientation;
            if (i != -1) {
                c21530519Nv.LJJIIZI = i;
            }
        }
    }
}
