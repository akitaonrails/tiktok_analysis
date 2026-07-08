package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.tux.sheet.sheet.TuxSheetBehavior;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0dr9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1066370dr9 extends FrameLayout {
    public TuxSheetBehavior<?> LL;

    public C1066370dr9(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        C16G1 c16g1;
        C16G1 c16g12;
        super.onAttachedToWindow();
        if (getVisibility() == 0) {
            View view = this;
            while (true) {
                Object parent = view.getParent();
                TuxSheetBehavior<?> tuxSheetBehavior = null;
                if (!(parent instanceof C16G0)) {
                    if (!(parent instanceof View)) {
                        break;
                    }
                    View view2 = (View) parent;
                    view = view2;
                    if (view2 == null) {
                        break;
                    }
                } else {
                    if (this.LL == null) {
                        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                        C16BC c16bc = (!(layoutParams instanceof C16G1) || (c16g12 = (C16G1) layoutParams) == null) ? null : c16g12.LIZ;
                        if (c16bc instanceof TuxSheetBehavior) {
                            tuxSheetBehavior = (TuxSheetBehavior) c16bc;
                        }
                    } else {
                        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
                        if ((layoutParams2 instanceof C16G1) && (c16g1 = (C16G1) layoutParams2) != null) {
                            c16g1.LIZIZ(this.LL);
                        }
                        tuxSheetBehavior = this.LL;
                    }
                    this.LL = tuxSheetBehavior;
                }
            }
            setBottomSheetBehavior(this.LL);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (getVisibility() == 0) {
            setBottomSheetBehavior(null);
        }
        super.onDetachedFromWindow();
    }

    private final void setBottomSheetBehavior(TuxSheetBehavior<?> tuxSheetBehavior) {
        if (tuxSheetBehavior != null) {
            tuxSheetBehavior.LIZ = null;
        }
        TuxSheetBehavior<?> tuxSheetBehavior2 = this.LL;
        if (tuxSheetBehavior2 != null) {
            tuxSheetBehavior2.LIZ = null;
        }
        this.LL = tuxSheetBehavior;
        if (tuxSheetBehavior != null) {
            tuxSheetBehavior.LIZ = new WeakReference<>(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1066370dr9(Context context, AttributeSet attributeSet, int i) {
        int i2;
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        if ((i & 4) != 0) {
            i2 = R.attr.yq;
        } else {
            i2 = 0;
        }
        super(context, attributeSet, i2);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, R$styleable.TuxSheet, R.attr.yq, 0);
        final int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxSheet__tux_sheetHandlerColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        AbstractC415370GQl abstractC415370GQl = new AbstractC415370GQl(color) { // from class: X.0GQP
            @Override // android.graphics.drawable.Drawable
            public final int getIntrinsicHeight() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
            }

            @Override // android.graphics.drawable.Drawable
            public final int getIntrinsicWidth() {
                return C814420VxA.LIZIZ(C418440Gaw.LIZIZ(48));
            }

            {
                this.LIZIZ.setColor(color);
                this.LIZJ.LJIIIZ(2.0f, 2.0f);
                this.LIZJ.LJIIIIZZ(44.0f, 2.0f);
                this.LIZJ.LIZ.setFillType(Path.FillType.WINDING);
                this.LIZIZ.setStyle(Paint.Style.STROKE);
                this.LIZIZ.setStrokeWidth(4.0f);
                this.LIZIZ.setStrokeCap(Paint.Cap.ROUND);
                this.LIZIZ.setStrokeJoin(Paint.Join.ROUND);
            }

            @Override // X.AbstractC415370GQl
            public final void LIZ(Canvas canvas) {
                LIZIZ(48.0f, 4.0f, canvas);
                canvas.drawPath(this.LIZJ.LIZ, this.LIZIZ);
            }
        };
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.h1, this, true);
        ((ImageView) findViewById(R.id.v4g)).setImageDrawable(abstractC415370GQl);
    }
}
