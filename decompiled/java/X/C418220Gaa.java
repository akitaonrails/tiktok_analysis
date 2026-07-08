package X;

import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.text.TextPaint;
import android.text.style.LineBackgroundSpan;
import android.view.View;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.text.Bidi;
import java.util.Map;

/* JADX INFO: renamed from: X.0Gaa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C418220Gaa implements LineBackgroundSpan, InterfaceC431120GvO, InterfaceC418110GaP {
    public final CharSequence LL;
    public final Map<String, Object> LLILLJJLI;
    public final InterfaceC418230Gab LLILLL;
    public final Paint LLILZ;
    public final C444890HcV LLILZIL;
    public final TextPaint LLILZLL;

    @Override // X.InterfaceC431120GvO
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC431120GvO
    public final void LIZJ() {
    }

    @Override // X.InterfaceC431120GvO
    public final void LIZLLL() {
    }

    @Override // X.InterfaceC431120GvO
    public final void LJ() {
    }

    @Override // X.InterfaceC431120GvO
    public final void LIZ() {
        InterfaceC418230Gab interfaceC418230Gab = this.LLILLL;
        if (interfaceC418230Gab != null) {
            interfaceC418230Gab.LIZJ(this, this.LL, this.LLILLJJLI);
        }
    }

    @Override // X.InterfaceC431120GvO
    public final void onClick(View view) {
        InterfaceC418230Gab interfaceC418230Gab = this.LLILLL;
        if (interfaceC418230Gab != null) {
            interfaceC418230Gab.LIZIZ(this, this.LL, this.LLILLJJLI);
        }
    }

    public C418220Gaa(int i, CharSequence charSequence, Map map, InterfaceC418230Gab interfaceC418230Gab) {
        this.LL = charSequence;
        this.LLILLJJLI = map;
        this.LLILLL = interfaceC418230Gab;
        Paint paint = new Paint();
        this.LLILZ = paint;
        C444890HcV c444890HcV = new C444890HcV();
        this.LLILZIL = c444890HcV;
        this.LLILZLL = new TextPaint();
        paint.setStrokeWidth(C418440Gaw.LIZIZ(1));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(i);
        paint.setPathEffect(new DashPathEffect(new float[]{C0DJ1.LIZ(3), C0DJ1.LIZ(2)}, 0.0f));
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
            float fLIZ = C0DJ1.LIZ(1);
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
