package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.bytedance.tux.drawable.TuxIconDrawable;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.19M4, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19M4 extends TuxTextView {
    public TuxIconDrawable LLJJJJ;
    public TuxIconDrawable LLJJJJJIL;
    public TuxIconDrawable LLJJJJLIIL;
    public TuxIconDrawable LLJJL;

    public C19M4(Context context) {
        this(context, null, 6);
    }

    public C19M4(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    public final void LJJJJL() {
        setCompoundDrawablesRelativeWithIntrinsicBounds(this.LLJJJJ, this.LLJJJJLIIL, this.LLJJJJJIL, this.LLJJL);
    }

    public final void setBottomIcon(C419910GdJ c419910GdJ) {
        TuxIconDrawable tuxIconDrawableLIZ;
        if (c419910GdJ != null) {
            tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        } else {
            tuxIconDrawableLIZ = null;
        }
        this.LLJJL = tuxIconDrawableLIZ;
        LJJJJL();
    }

    public final void setEndIcon(C419910GdJ c419910GdJ) {
        TuxIconDrawable tuxIconDrawableLIZ;
        if (c419910GdJ != null) {
            tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        } else {
            tuxIconDrawableLIZ = null;
        }
        this.LLJJJJJIL = tuxIconDrawableLIZ;
        LJJJJL();
    }

    public final void setStartIcon(C419910GdJ c419910GdJ) {
        TuxIconDrawable tuxIconDrawableLIZ;
        if (c419910GdJ != null) {
            tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        } else {
            tuxIconDrawableLIZ = null;
        }
        this.LLJJJJ = tuxIconDrawableLIZ;
        LJJJJL();
    }

    public final void setTopIcon(C419910GdJ c419910GdJ) {
        TuxIconDrawable tuxIconDrawableLIZ;
        if (c419910GdJ != null) {
            tuxIconDrawableLIZ = c419910GdJ.LIZ(getContext());
        } else {
            tuxIconDrawableLIZ = null;
        }
        this.LLJJJJLIIL = tuxIconDrawableLIZ;
        LJJJJL();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C19M4(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.z4;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxCompoundIconTextView, i2, 0);
        this.LLJJJJ = LJJJJJ(typedArrayObtainStyledAttributes, R$styleable.TuxCompoundIconTextView_tux_iconStart, R$styleable.TuxCompoundIconTextView_tux_tintColorStart, R$styleable.TuxCompoundIconTextView_tux_iconWidthStart, R$styleable.TuxCompoundIconTextView_tux_iconHeightStart, R$styleable.TuxCompoundIconTextView_tux_iconShadowStart);
        this.LLJJJJJIL = LJJJJJ(typedArrayObtainStyledAttributes, R$styleable.TuxCompoundIconTextView_tux_iconEnd, R$styleable.TuxCompoundIconTextView_tux_tintColorEnd, R$styleable.TuxCompoundIconTextView_tux_iconWidthEnd, R$styleable.TuxCompoundIconTextView_tux_iconHeightEnd, R$styleable.TuxCompoundIconTextView_tux_iconShadowEnd);
        this.LLJJJJLIIL = LJJJJJ(typedArrayObtainStyledAttributes, R$styleable.TuxCompoundIconTextView_tux_iconTop, R$styleable.TuxCompoundIconTextView_tux_tintColorTop, R$styleable.TuxCompoundIconTextView_tux_iconWidthTop, R$styleable.TuxCompoundIconTextView_tux_iconHeightTop, R$styleable.TuxCompoundIconTextView_tux_iconShadowTop);
        this.LLJJL = LJJJJJ(typedArrayObtainStyledAttributes, R$styleable.TuxCompoundIconTextView_tux_iconBottom, R$styleable.TuxCompoundIconTextView_tux_tintColorBottom, R$styleable.TuxCompoundIconTextView_tux_iconWidthBottom, R$styleable.TuxCompoundIconTextView_tux_iconHeightBottom, R$styleable.TuxCompoundIconTextView_tux_iconShadowBottom);
        setCompoundDrawablePadding(typedArrayObtainStyledAttributes.getDimensionPixelSize(R$styleable.TuxCompoundIconTextView_tux_iconPadding, 0));
        typedArrayObtainStyledAttributes.recycle();
        LJJJJL();
    }

    public final TuxIconDrawable LJJJJJ(TypedArray typedArray, int i, int i2, int i3, int i4, int i5) {
        int resourceId = typedArray.getResourceId(i, 0);
        Integer numValueOf = null;
        if (resourceId == 0) {
            return null;
        }
        if (typedArray.hasValue(i2)) {
            numValueOf = Integer.valueOf(typedArray.getColor(i2, 0));
        }
        int dimensionPixelSize = typedArray.getDimensionPixelSize(i3, -1);
        int dimensionPixelSize2 = typedArray.getDimensionPixelSize(i4, -1);
        boolean z = typedArray.getBoolean(i5, false);
        C419910GdJ c419910GdJ = new C419910GdJ();
        c419910GdJ.LIZ = resourceId;
        c419910GdJ.LIZLLL = numValueOf;
        c419910GdJ.LIZIZ = dimensionPixelSize;
        c419910GdJ.LIZJ = dimensionPixelSize2;
        c419910GdJ.LJFF = z;
        return c419910GdJ.LIZ(getContext());
    }
}
