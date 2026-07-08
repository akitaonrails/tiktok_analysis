package X;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.app.R$styleable;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.12KZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public abstract class C12KZ extends LinearLayout {
    public final List<C12KV> LL;
    public final int LLILLJJLI;
    public final int LLILLL;
    public final RectF LLILZ;
    public final Paint LLILZIL;

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        return 1.0f;
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        return 1.0f;
    }

    public abstract void setMaxAxisOffset(int i);

    public final C12KV LIZ() {
        C12KV c12kv = new C12KV(getContext());
        C16FB c16fb = new C16FB(getContext(), null, 6, 0);
        c16fb.addView(c12kv, new FrameLayout.LayoutParams(-2, -2));
        addView(c16fb, new LinearLayout.LayoutParams(-2, -2));
        ((ArrayList) this.LL).add(c12kv);
        return c12kv;
    }

    public final void LIZIZ() {
        View view = new View(getContext());
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)), 1);
        layoutParams.weight = 1.0f;
        addView(view, layoutParams);
    }

    public final List<C12KV> getColumnPickers$tux_theme_release() {
        return this.LL;
    }

    public final void LIZJ(String str) {
        TuxTextView tuxTextView = new TuxTextView(getContext(), null, 6, 0);
        tuxTextView.setTuxFont(this.LLILLJJLI);
        tuxTextView.setTextColor(this.LLILLL);
        tuxTextView.setMinWidth(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(60)));
        tuxTextView.setGravity(17);
        tuxTextView.setText(str);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 16;
        addView(tuxTextView, layoutParams);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onDraw(Canvas canvas) {
        int iLIZIZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40)) / 2;
        float height = (getHeight() / 2) - iLIZIZ;
        float height2 = (getHeight() / 2) + iLIZIZ;
        float fLIZIZ = C418440Gaw.LIZIZ(16);
        float fLIZIZ2 = C418440Gaw.LIZIZ(10);
        this.LLILZ.set(fLIZIZ, height, getWidth() - fLIZIZ, height2);
        canvas.drawRoundRect(this.LLILZ, fLIZIZ2, fLIZIZ2, this.LLILZIL);
        super.onDraw(canvas);
    }

    public C12KZ(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.z9);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        setFadingEdgeLength((getMeasuredHeight() - C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40))) / 2);
    }

    public C12KZ(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.LL = new ArrayList();
        this.LLILZ = new RectF();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TuxWheelPicker, i, 0);
        int color = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxWheelPicker__tux_wheelPickerSeparatorColor, 0);
        this.LLILLJJLI = typedArrayObtainStyledAttributes.getInt(R$styleable.TuxWheelPicker__tux_wheelPickerUnitTextFont, 0);
        this.LLILLL = typedArrayObtainStyledAttributes.getColor(R$styleable.TuxWheelPicker__tux_wheelPickerUnitTextColor, 0);
        typedArrayObtainStyledAttributes.recycle();
        Paint paint = new Paint();
        this.LLILZIL = paint;
        paint.setAntiAlias(true);
        paint.setColor(color);
        setOrientation(0);
        setVerticalFadingEdgeEnabled(true);
    }
}
