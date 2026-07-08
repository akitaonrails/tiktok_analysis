package X;

import android.graphics.Typeface;
import android.text.TextPaint;

/* JADX INFO: renamed from: X.19QB, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19QB extends C19QC {
    public final /* synthetic */ TextPaint LIZ;
    public final /* synthetic */ C19QC LIZIZ;
    public final /* synthetic */ C19Q9 LIZJ;

    @Override // X.C19QC
    public final void LIZ(int i) {
        this.LIZIZ.LIZ(i);
    }

    @Override // X.C19QC
    public final void LIZIZ(Typeface typeface, boolean z) {
        this.LIZJ.LIZLLL(this.LIZ, typeface);
        this.LIZIZ.LIZIZ(typeface, z);
    }

    public C19QB(C19Q9 c19q9, TextPaint textPaint, C19QC c19qc) {
        this.LIZJ = c19q9;
        this.LIZ = textPaint;
        this.LIZIZ = c19qc;
    }
}
