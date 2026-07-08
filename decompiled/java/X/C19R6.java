package X;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;

/* JADX INFO: renamed from: X.19R6, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19R6 extends C1324720kZq implements C19RA {
    public final C19R9 LLJILJIL;

    public C19R6(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4, 0);
    }

    @Override // X.C19RA
    public final void LJJJ(C19RB c19rb) {
        setOutlineProvider(c19rb);
        setClipToOutline(true);
    }

    @Override // X.C19RA
    public final void LJJJJ(Canvas canvas) {
        super.draw(canvas);
    }

    @Override // X.C1324720kZq, android.view.View
    public final void draw(Canvas canvas) {
        this.LLJILJIL.LIZ.LIZ(canvas);
    }

    @Override // X.C1324720kZq, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public void onDraw(Canvas canvas) {
        try {
            super.onDraw(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    public C19R6(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        C19R9 c19r9 = new C19R9(this);
        this.LLJILJIL = c19r9;
        c19r9.LIZ.LIZIZ(context, attributeSet, i);
    }

    public /* synthetic */ C19R6(Context context, AttributeSet attributeSet, int i, int i2) {
        this(context, (i & 2) != 0 ? null : attributeSet, 0);
    }

    public final void LIZJ(int i, int i2, int i3, int i4) {
        C19R5 c19r5 = this.LLJILJIL.LIZ;
        if (i >= 0) {
            c19r5.LIZIZ = i;
            float[] fArr = c19r5.LJI;
            float f = i;
            fArr[0] = f;
            fArr[1] = f;
        }
        if (i3 >= 0) {
            c19r5.LIZLLL = i3;
            float[] fArr2 = c19r5.LJI;
            float f2 = i3;
            fArr2[2] = f2;
            fArr2[3] = f2;
        }
        if (i4 >= 0) {
            c19r5.LJ = i4;
            float[] fArr3 = c19r5.LJI;
            float f3 = i4;
            fArr3[4] = f3;
            fArr3[5] = f3;
        }
        if (i2 > 0) {
            c19r5.LIZJ = i2;
            float[] fArr4 = c19r5.LJI;
            float f4 = i2;
            fArr4[6] = f4;
            fArr4[7] = f4;
        }
        if (c19r5.LIZLLL()) {
            c19r5.LIZ.LJJJ(new C19RB(c19r5.LJI[0]));
        }
        invalidate();
    }

    @Override // android.view.View
    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        C19R9 c19r9 = this.LLJILJIL;
        c19r9.LIZ.LIZJ(getWidth(), getHeight());
    }
}
