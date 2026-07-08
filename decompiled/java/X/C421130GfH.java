package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ss.android.ugc.aweme.app.R$styleable;

/* JADX INFO: renamed from: X.0GfH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C421130GfH extends LinearLayout {
    public int LL;

    public C421130GfH() {
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    public void setRadius(int i) {
        this.LL = i;
        if (getHeight() != 0 && getWidth() != 0) {
            int width = getWidth();
            int height = getHeight();
            if (this.LL > 0) {
                setClipToOutline(true);
                setOutlineProvider(new C421140GfI(this.LL, width, height));
            }
        }
    }

    public C421130GfH(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public C421130GfH(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, R$styleable.RoundedView, i, 0);
        if (typedArrayObtainStyledAttributes.hasValue(R$styleable.RoundedView_rounded_radius)) {
            this.LL = typedArrayObtainStyledAttributes.getDimensionPixelOffset(R$styleable.RoundedView_rounded_radius, 0);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.LL > 0) {
            setClipToOutline(true);
            setOutlineProvider(new C421140GfI(this.LL, i, i2));
        }
    }
}
