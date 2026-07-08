package X;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.LineBackgroundSpan;
import android.view.View;
import android.widget.TextView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.Bidi;
import java.util.Map;

/* JADX INFO: renamed from: X.0GaZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418210GaZ implements LineBackgroundSpan, InterfaceC430960Gv8, InterfaceC418250Gad {
    public final CharSequence LL;
    public final Map<String, Object> LLILLJJLI;
    public final InterfaceC418240Gac LLILLL;
    public final Paint LLILZ;
    public final C444890HcV LLILZIL;
    public final TextPaint LLILZLL;

    @Override // X.InterfaceC430960Gv8
    public final void LIZJ(TextView textView, Spanned spanned, int i) {
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJ(TextView textView, Spanned spanned, int i) {
    }

    @Override // X.InterfaceC430960Gv8
    public final float LJFF(float f) {
        return 0.0f;
    }

    @Override // X.InterfaceC430960Gv8
    public final void LJII(TextView textView, Spanned spanned, int i) {
    }

    @Override // X.InterfaceC418250Gad
    public final int getType() {
        return 1002;
    }

    @Override // X.InterfaceC430960Gv8
    public final void LIZ() {
        InterfaceC418240Gac interfaceC418240Gac = this.LLILLL;
        if (interfaceC418240Gac != null) {
            interfaceC418240Gac.LIZIZ(this, this.LL, this.LLILLJJLI);
        }
    }

    @Override // X.InterfaceC418250Gad
    public final boolean LJI() {
        return C418190GaX.LIZ(this);
    }

    @Override // X.InterfaceC418250Gad
    public final boolean LJIIIIZZ() {
        return C418190GaX.LIZIZ(this);
    }

    @Override // X.InterfaceC430960Gv8
    public final void onClick(View view) {
        InterfaceC418240Gac interfaceC418240Gac = this.LLILLL;
        if (interfaceC418240Gac != null) {
            interfaceC418240Gac.LIZJ(this, this.LL, this.LLILLJJLI);
        }
    }

    public C418210GaZ(int i, CharSequence charSequence, Map map, InterfaceC418240Gac interfaceC418240Gac) {
        this.LL = charSequence;
        this.LLILLJJLI = map;
        this.LLILLL = interfaceC418240Gac;
        Paint paint = new Paint();
        this.LLILZ = paint;
        C444890HcV c444890HcV = new C444890HcV();
        this.LLILZIL = c444890HcV;
        this.LLILZLL = new TextPaint();
        paint.setStrokeWidth(C418440Gaw.LIZIZ(1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setPathEffect(new DashPathEffect(new float[]{C0DSB.LIZ(3), C0DSB.LIZ(2)}, 0.0f));
        c444890HcV.LIZ(42);
    }

    @Override // android.text.style.LineBackgroundSpan
    public final void drawBackground(Canvas canvas, Paint paint, int i, int i2, int i3, int i4, int i5, CharSequence charSequence, int i6, int i7, int i8) {
        float f;
        float f2;
        try {
            this.LLILZLL.set(paint);
            this.LLILZLL.setTypeface(this.LLILZIL.getTypeface());
            float fMeasureText = this.LLILZLL.measureText(charSequence, i6, i7);
            Bidi bidi = new Bidi(charSequence.toString(), -2);
            float fLIZ = C0DSB.LIZ(1);
            if (bidi.isLeftToRight()) {
                f = i;
            } else {
                f = i2;
            }
            float f3 = fLIZ + i5;
            if (bidi.isLeftToRight()) {
                f2 = i + fMeasureText;
            } else {
                f2 = i2 - fMeasureText;
            }
            canvas.drawLine(f, f3, f2, f3, this.LLILZ);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
