package X;

import android.graphics.Typeface;

/* JADX INFO: renamed from: X.19TC, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C19TC extends C19QC {
    public final Typeface LIZ;
    public final C19TD LIZIZ;
    public boolean LIZJ;

    @Override // X.C19QC
    public final void LIZ(int i) {
        Typeface typeface = this.LIZ;
        if (!this.LIZJ) {
            this.LIZIZ.LIZ(typeface);
        }
    }

    public C19TC(C19TD c19td, Typeface typeface) {
        this.LIZ = typeface;
        this.LIZIZ = c19td;
    }

    @Override // X.C19QC
    public final void LIZIZ(Typeface typeface, boolean z) {
        if (!this.LIZJ) {
            this.LIZIZ.LIZ(typeface);
        }
    }
}
