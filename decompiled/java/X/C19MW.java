package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.19MW, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19MW extends C19MX {
    public C19OH mBarrier;
    public int mIndicatedType;
    public int mResolvedType;

    public boolean allowsGoneWidget() {
        return this.mBarrier.LIZLLL;
    }

    public int getMargin() {
        return this.mBarrier.LJ;
    }

    public int getType() {
        return this.mIndicatedType;
    }

    public C19MW(Context context) {
        super(context);
        super.setVisibility(8);
    }

    @Override // X.C19MX
    public void init(AttributeSet attributeSet) {
        super.init(attributeSet);
        this.mBarrier = new C19OH();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.ConstraintLayout_Layout);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == R$styleable.ConstraintLayout_Layout_barrierDirection) {
                    setType(typedArrayObtainStyledAttributes.getInt(index, 0));
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierAllowsGoneWidgets) {
                    this.mBarrier.LIZLLL = typedArrayObtainStyledAttributes.getBoolean(index, true);
                } else if (index == R$styleable.ConstraintLayout_Layout_barrierMargin) {
                    this.mBarrier.LJ = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.mHelperWidget = this.mBarrier;
        validateParams();
    }

    public void setAllowsGoneWidget(boolean z) {
        this.mBarrier.LIZLLL = z;
    }

    public void setDpMargin(int i) {
        this.mBarrier.LJ = (int) ((i * getResources().getDisplayMetrics().density) + 0.5f);
    }

    public void setMargin(int i) {
        this.mBarrier.LJ = i;
    }

    public void setType(int i) {
        this.mIndicatedType = i;
    }

    public C19MW(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        super.setVisibility(8);
    }

    @Override // X.C19MX
    public void resolveRtl(C19OA c19oa, boolean z) {
        updateType(c19oa, this.mIndicatedType, z);
    }

    public C19MW(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        super.setVisibility(8);
    }

    private void updateType(C19OA c19oa, int i, boolean z) {
        this.mResolvedType = i;
        if (z) {
            int i2 = this.mIndicatedType;
            if (i2 == 5) {
                this.mResolvedType = 1;
            } else if (i2 == 6) {
                this.mResolvedType = 0;
            }
        } else {
            int i3 = this.mIndicatedType;
            if (i3 == 5) {
                this.mResolvedType = 0;
            } else if (i3 == 6) {
                this.mResolvedType = 1;
            }
        }
        if (c19oa instanceof C19OH) {
            ((C19OH) c19oa).LIZJ = this.mResolvedType;
        }
    }

    @Override // X.C19MX
    public void loadParameters(C19MA c19ma, C21530019Nq c21530019Nq, C19ME c19me, SparseArray<C19OA> sparseArray) {
        super.loadParameters(c19ma, c21530019Nq, c19me, sparseArray);
        if (c21530019Nq instanceof C19OH) {
            C19OH c19oh = (C19OH) c21530019Nq;
            updateType(c19oh, c19ma.LIZLLL.LJJJLIIL, ((C19O9) c21530019Nq.mParent).LJ);
            C19M2 c19m2 = c19ma.LIZLLL;
            c19oh.LIZLLL = c19m2.LJJLIIIJILLIZJL;
            c19oh.LJ = c19m2.LJJJLL;
        }
    }
}
