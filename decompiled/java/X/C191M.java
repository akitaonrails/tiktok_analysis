package X;

import android.animation.TimeInterpolator;

/* JADX INFO: renamed from: X.191M, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C191M extends C191E {
    public final /* synthetic */ C191N LJ;

    public C191M(C191N c191n) {
        this.LJ = c191n;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // X.C191E
    public final void LIZIZ(float f) {
        C191N c191n = this.LJ;
        TimeInterpolator timeInterpolator = c191n.LJFF;
        if (timeInterpolator != null) {
            f = timeInterpolator.getInterpolation(f);
        }
        c191n.LIZIZ.set(c191n.LIZ, (F) c191n.LIZJ.evaluate(f, c191n.LIZLLL, c191n.LJ));
    }
}
