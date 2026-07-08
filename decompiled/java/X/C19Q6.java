package X;

import android.content.res.ColorStateList;
import android.util.Property;
import android.view.View;

/* JADX INFO: renamed from: X.19Q6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19Q6 extends C19S0 implements C16G4 {
    @Override // X.C16G4
    public C16BC<C19Q6> getBehavior() {
        return null;
    }

    public int getCollapsedSize() {
        return 0;
    }

    public void setAnimateShowBeforeLayout(boolean z) {
    }

    static {
        final Class<Float> cls = Float.class;
        new Property<View, Float>(cls) { // from class: X.19Q2
            @Override // android.util.Property
            public final Float get(View view) {
                return Float.valueOf(view.getLayoutParams().width);
            }

            @Override // android.util.Property
            public final void set(View view, Float f) {
                View view2 = view;
                view2.getLayoutParams().width = f.intValue();
                view2.requestLayout();
            }
        };
        final Class<Float> cls2 = Float.class;
        new Property<View, Float>(cls2) { // from class: X.19Q3
            @Override // android.util.Property
            public final Float get(View view) {
                return Float.valueOf(view.getLayoutParams().height);
            }

            @Override // android.util.Property
            public final void set(View view, Float f) {
                View view2 = view;
                view2.getLayoutParams().height = f.intValue();
                view2.requestLayout();
            }
        };
        final Class<Float> cls3 = Float.class;
        new Property<View, Float>(cls3) { // from class: X.19Q4
            @Override // android.util.Property
            public final Float get(View view) {
                return Float.valueOf(view.getPaddingStart());
            }

            @Override // android.util.Property
            public final void set(View view, Float f) {
                View view2 = view;
                view2.setPaddingRelative(f.intValue(), view2.getPaddingTop(), view2.getPaddingEnd(), view2.getPaddingBottom());
            }
        };
        final Class<Float> cls4 = Float.class;
        new Property<View, Float>(cls4) { // from class: X.19Q5
            @Override // android.util.Property
            public final Float get(View view) {
                return Float.valueOf(view.getPaddingEnd());
            }

            @Override // android.util.Property
            public final void set(View view, Float f) {
                View view2 = view;
                view2.setPaddingRelative(view2.getPaddingStart(), view2.getPaddingTop(), f.intValue(), view2.getPaddingBottom());
            }
        };
    }

    public int getCollapsedPadding() {
        return (getCollapsedSize() - getIconSize()) / 2;
    }

    public C194T getExtendMotionSpec() {
        throw null;
    }

    public C194T getHideMotionSpec() {
        throw null;
    }

    public C194T getShowMotionSpec() {
        throw null;
    }

    public C194T getShrinkMotionSpec() {
        throw null;
    }

    @Override // X.C19S0, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setExtendMotionSpec(C194T c194t) {
        throw null;
    }

    public void setExtendMotionSpecResource(int i) {
        setExtendMotionSpec(C194T.LIZ(i, getContext()));
    }

    public void setExtended(boolean z) {
        if (!z) {
        } else {
            throw null;
        }
    }

    public void setHideMotionSpec(C194T c194t) {
        throw null;
    }

    public void setHideMotionSpecResource(int i) {
        setHideMotionSpec(C194T.LIZ(i, getContext()));
    }

    public void setShowMotionSpec(C194T c194t) {
        throw null;
    }

    public void setShowMotionSpecResource(int i) {
        setShowMotionSpec(C194T.LIZ(i, getContext()));
    }

    public void setShrinkMotionSpec(C194T c194t) {
        throw null;
    }

    public void setShrinkMotionSpecResource(int i) {
        setShrinkMotionSpec(C194T.LIZ(i, getContext()));
    }

    @Override // android.widget.TextView
    public void setTextColor(int i) {
        super.setTextColor(i);
        getTextColors();
    }

    @Override // android.widget.TextView
    public void setTextColor(ColorStateList colorStateList) {
        super.setTextColor(colorStateList);
        getTextColors();
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        super.setPadding(i, i2, i3, i4);
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        super.setPaddingRelative(i, i2, i3, i4);
    }
}
