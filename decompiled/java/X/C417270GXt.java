package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import com.bytedance.tux.input.TuxTextView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GXt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C417270GXt extends FrameLayout {
    public final int LL;
    public final int LLILLJJLI;

    public C417270GXt(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(this.LL, 1073741824), View.MeasureSpec.makeMeasureSpec(this.LLILLJJLI, 1073741824));
    }

    public C417270GXt(final Context context, AttributeSet attributeSet, int i) {
        super(context, (i & 2) != 0 ? null : attributeSet, 0);
        this.LL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));
        this.LLILLJJLI = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20));
        setClickable(false);
        setFocusable(false);
        addView(new View(context) { // from class: X.0GRk
            public final float LL = C418440Gaw.LIZIZ(4);
            public final Paint LLILLJJLI = new Paint(1);
            public final Path LLILLL = new Path();

            {
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
                setAlpha(0.2f);
                setWillNotDraw(false);
            }

            @Override // android.view.View
            public final void onDraw(Canvas canvas) {
                float width = getWidth();
                float height = getHeight();
                if (width > 0.0f && height > 0.0f && this.LLILLJJLI.getShader() != null) {
                    this.LLILLL.reset();
                    Path path = this.LLILLL;
                    float f = this.LL;
                    path.addRoundRect(0.0f, 0.0f, width, height, f, f, Path.Direction.CW);
                    canvas.save();
                    canvas.clipPath(this.LLILLL);
                    canvas.drawRect(-width, -height, width * 2.0f, height * 2.0f, this.LLILLJJLI);
                    canvas.restore();
                }
            }

            @Override // android.view.View
            public final void onSizeChanged(int i2, int i3, int i4, int i5) {
                int iIntValue;
                int iIntValue2;
                int iIntValue3;
                super.onSizeChanged(i2, i3, i4, i5);
                if (i2 > 0 && i3 > 0) {
                    Integer numLIZJ = C1308910kAL.LIZJ(R.attr.as4, getContext());
                    if (numLIZJ != null) {
                        iIntValue = numLIZJ.intValue();
                    } else {
                        iIntValue = -16739073;
                    }
                    Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.as5, getContext());
                    if (numLIZJ2 != null) {
                        iIntValue2 = numLIZJ2.intValue();
                    } else {
                        iIntValue2 = -14625300;
                    }
                    Integer numLIZJ3 = C1308910kAL.LIZJ(R.attr.as6, getContext());
                    if (numLIZJ3 != null) {
                        iIntValue3 = numLIZJ3.intValue();
                    } else {
                        iIntValue3 = -16711773;
                    }
                    float f = i2;
                    float f2 = f * 2.0f;
                    float f3 = i3;
                    float f4 = 2.0f * f3 * 0.5f;
                    LinearGradient linearGradient = new LinearGradient(f2 * 0.25f, f4, f2 * 0.75f, f4, new int[]{iIntValue, iIntValue2, iIntValue3}, new float[]{0.0f, 0.5f, 1.0f}, Shader.TileMode.CLAMP);
                    Matrix matrix = new Matrix();
                    matrix.setValues(new float[]{1.0f, -1.0f, 0.5f, 1.0f, 2.56f, -1.28f, 0.0f, 0.0f, 1.0f});
                    matrix.postTranslate(f * (-0.5f), f3 * (-0.5f));
                    linearGradient.setLocalMatrix(matrix);
                    this.LLILLJJLI.setShader(linearGradient);
                    return;
                }
                this.LLILLJJLI.setShader(null);
            }
        }, new FrameLayout.LayoutParams(-1, -1));
        TuxTextView tuxTextView = new TuxTextView(context, null, 6, 0);
        tuxTextView.setText("24h");
        tuxTextView.setTuxFont(72);
        tuxTextView.setIncludeFontPadding(false);
        tuxTextView.setGravity(17);
        Integer numLIZJ = C1308910kAL.LIZJ(R.attr.ava, context);
        if (numLIZJ != null) {
            tuxTextView.setTextColor(numLIZJ.intValue());
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(23)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)), 16);
        layoutParams.leftMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4));
        layoutParams.rightMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(5));
        addView(tuxTextView, layoutParams);
    }
}
