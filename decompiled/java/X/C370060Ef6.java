package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS549S0100000_5;
import kotlin.jvm.internal.AwS584S0100000_5;

/* JADX INFO: renamed from: X.0Ef6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C370060Ef6 extends C370050Ef5 {
    public final C01GW LLJI;
    public final Paint LLJIJIL;
    public final C444890HcV LLJILJIL;
    public final float LLJILJILJ;
    public final float LLJILLL;
    public final float LLJJ;
    public final float LLJJI;
    public final float LLJJIII;
    public final float LLJJIJI;
    public final float LLJJIJIIJIL;
    public final float LLJJIJIL;
    public final float LLJJJ;
    public final Rect LLJJJIL;
    public final float LLJJJJ;
    public Function1<? super MotionEvent, Boolean> LLJJJJJIL;

    @Override // X.C370050Ef5
    public Function1<MotionEvent, Boolean> getOnInterceptTouchListener() {
        return this.LLJJJJJIL;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        float f;
        float f2;
        Integer numLIZJ;
        Integer numLIZJ2;
        getSelectFrameRect().top = this.LLJJIJI;
        getSelectFrameRect().bottom = getMeasuredHeight() - this.LLJJIJI;
        this.LLJIJIL.setStyle(Paint.Style.FILL);
        Context context = getContext();
        Integer numValueOf = Integer.valueOf(R.attr.e6);
        if (numValueOf != null && (numLIZJ2 = C1308910kAL.LIZJ(numValueOf.intValue(), context)) != null) {
            this.LLJIJIL.setColor(numLIZJ2.intValue());
        }
        canvas.save();
        canvas.clipRect(getSelectFrameRect());
        String strLIZ = C367880Eba.LIZ((long) (getSelectFrameRect().width() / getScale()));
        this.LLJILJIL.getTextBounds(strLIZ, 0, strLIZ.length(), this.LLJJJIL);
        float fWidth = this.LLJJJIL.width() + (2 * this.LLJJIJIIJIL);
        if (((Boolean) this.LLJI.getValue()).booleanValue()) {
            f = getSelectFrameRect().right - this.LLJJ;
        } else {
            f = getSelectFrameRect().left + this.LLJJ;
        }
        if (((Boolean) this.LLJI.getValue()).booleanValue()) {
            f2 = f - fWidth;
        } else {
            f2 = f;
        }
        float f3 = getSelectFrameRect().top + this.LLJJI;
        if (!((Boolean) this.LLJI.getValue()).booleanValue()) {
            f += fWidth;
        }
        float f4 = this.LLJJIII + f3;
        float f5 = this.LLJILLL;
        canvas.drawRoundRect(f2, f3, f, f4, f5, f5, this.LLJIJIL);
        canvas.drawText(strLIZ, f2 + this.LLJJIJIIJIL, f4 - this.LLJJIJIL, this.LLJILJIL);
        canvas.restore();
        Context context2 = getContext();
        Integer numValueOf2 = Integer.valueOf(R.attr.ee);
        if (numValueOf2 != null && (numLIZJ = C1308910kAL.LIZJ(numValueOf2.intValue(), context2)) != null) {
            this.LLJIJIL.setColor(numLIZJ.intValue());
        }
        this.LLJIJIL.setStyle(Paint.Style.STROKE);
        this.LLJIJIL.setStrokeWidth(C0FU0.LIZ(2.0f));
        RectF selectFrameRect = getSelectFrameRect();
        float f6 = this.LLJILJILJ;
        canvas.drawRoundRect(selectFrameRect, f6, f6, this.LLJIJIL);
    }

    @Override // X.C370050Ef5
    public void setOnInterceptTouchListener(Function1<? super MotionEvent, Boolean> function1) {
        this.LLJJJJJIL = function1;
    }

    public C370060Ef6(Context context, AttributeSet attributeSet) {
        Integer numLIZJ;
        super(context, attributeSet, 0);
        this.LLJI = C452501pT.LIZIZ(new AwS549S0100000_5(context, 1521));
        Paint paint = new Paint();
        this.LLJIJIL = paint;
        C444890HcV c444890HcV = new C444890HcV();
        this.LLJILJIL = c444890HcV;
        this.LLJILJILJ = C0FU0.LIZ(4.0f);
        this.LLJILLL = C0FU0.LIZ(2.0f);
        this.LLJJ = C0FU0.LIZ(2.0f);
        this.LLJJI = C0FU0.LIZ(3.0f);
        this.LLJJIII = C0FU0.LIZ(16.0f);
        this.LLJJIJI = C0FU0.LIZ(1.0f);
        this.LLJJIJIIJIL = C0FU0.LIZ(4.0f);
        this.LLJJIJIL = C0FU0.LIZ(4.0f);
        this.LLJJJ = C0FU0.LIZ(3.0f);
        this.LLJJJIL = new Rect();
        this.LLJJJJ = C0FU0.LIZ(21.0f);
        paint.setAntiAlias(true);
        c444890HcV.setAntiAlias(true);
        c444890HcV.setTextSize(C0FU0.LIZ(12.0f));
        c444890HcV.LIZ(71);
        Integer numValueOf = Integer.valueOf(R.attr.ee);
        if (numValueOf != null && (numLIZJ = C1308910kAL.LIZJ(numValueOf.intValue(), context)) != null) {
            c444890HcV.setColor(numLIZJ.intValue());
        }
        this.LLJJJJJIL = new AwS584S0100000_5(this, 1093);
    }
}
