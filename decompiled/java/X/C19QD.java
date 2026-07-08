package X;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.19QD, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19QD {
    public float LIZJ;
    public WeakReference<C19QF> LJ;
    public C19Q9 LJFF;
    public final TextPaint LIZ = new TextPaint(1);
    public final C19QE LIZIZ = new C19QC() { // from class: X.19QE
        @Override // X.C19QC
        public final void LIZ(int i) {
            C19QD c19qd = this.LIZ;
            c19qd.LIZLLL = true;
            C19QF c19qf = c19qd.LJ.get();
            if (c19qf != null) {
                c19qf.LIZ();
            }
        }

        @Override // X.C19QC
        public final void LIZIZ(Typeface typeface, boolean z) {
            if (z) {
                return;
            }
            C19QD c19qd = this.LIZ;
            c19qd.LIZLLL = true;
            C19QF c19qf = c19qd.LJ.get();
            if (c19qf != null) {
                c19qf.LIZ();
            }
        }
    };
    public boolean LIZLLL = true;

    /* JADX WARN: Type inference failed for: r0v1, types: [X.19QE] */
    public C19QD(C19QF c19qf) {
        this.LJ = new WeakReference<>(null);
        this.LJ = new WeakReference<>(c19qf);
    }

    public final float LIZ(String str) {
        float fMeasureText;
        if (!this.LIZLLL) {
            return this.LIZJ;
        }
        if (str == null) {
            fMeasureText = 0.0f;
        } else {
            fMeasureText = this.LIZ.measureText((CharSequence) str, 0, str.length());
        }
        this.LIZJ = fMeasureText;
        this.LIZLLL = false;
        return fMeasureText;
    }

    public final void LIZIZ(C19Q9 c19q9, Context context) {
        if (this.LJFF != c19q9) {
            this.LJFF = c19q9;
            if (c19q9 != null) {
                TextPaint textPaint = this.LIZ;
                C19QE c19qe = this.LIZIZ;
                c19q9.LIZ();
                c19q9.LIZLLL(textPaint, c19q9.LJIILIIL);
                c19q9.LIZIZ(context, new C19QB(c19q9, textPaint, c19qe));
                C19QF c19qf = this.LJ.get();
                if (c19qf != null) {
                    this.LIZ.drawableState = c19qf.getState();
                }
                c19q9.LIZJ(context, this.LIZ, this.LIZIZ);
                this.LIZLLL = true;
            }
            C19QF c19qf2 = this.LJ.get();
            if (c19qf2 != null) {
                c19qf2.LIZ();
                c19qf2.onStateChange(c19qf2.getState());
            }
        }
    }
}
