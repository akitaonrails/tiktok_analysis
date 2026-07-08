package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: renamed from: X.0m8H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384510m8H {
    public float LJ;
    public boolean LJIIIIZZ;
    public boolean LJIIJ;
    public final AbstractC1385070m9B LJIIJJI;
    public long LIZ = 8000;
    public float LIZIZ = 54.0f;
    public int LIZJ = 4;
    public float LIZLLL = 18.0f;
    public float LJFF = 24.0f;
    public int LJI = 8;
    public long LJII = 4000;
    public Function1<? super AbstractC1384320m7y, Boolean> LJIIIZ = AFwS259S0000000_21.get$arr$(24);

    public C1384510m8H(AbstractC1385070m9B abstractC1385070m9B) {
        this.LJIIJJI = abstractC1385070m9B;
    }

    public final void LIZ(int i) {
        int i2 = this.LIZJ;
        if (i < 0) {
            i = 4;
        }
        this.LIZJ = i;
        this.LJIIJJI.LIZ(1402);
    }

    public final void LIZIZ(float f) {
        int i = (this.LIZIZ > f ? 1 : (this.LIZIZ == f ? 0 : -1));
        if (f <= 0) {
            f = 54.0f;
        }
        this.LIZIZ = f;
        this.LJIIJJI.LIZ(1401);
    }

    public final void LIZJ(float f) {
        int i = (this.LIZLLL > f ? 1 : (this.LIZLLL == f ? 0 : -1));
        if (f < 0) {
            f = 18.0f;
        }
        this.LIZLLL = f;
        this.LJIIJJI.LIZ(1403);
    }

    public final void LIZLLL(long j) {
        int i = (this.LIZ > j ? 1 : (this.LIZ == j ? 0 : -1));
        if (j <= 0) {
            j = 8000;
        }
        this.LIZ = j;
        this.LJIIJJI.LIZ(1400);
    }
}
