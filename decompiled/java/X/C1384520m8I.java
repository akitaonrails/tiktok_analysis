package X;

import kotlin.jvm.internal.AwS34S0001000_21;
import kotlin.jvm.internal.AwS600S0100000_21;
import kotlin.jvm.internal.AwS9S0000001_21;

/* JADX INFO: renamed from: X.0m8I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1384520m8I {
    public float LIZJ;
    public boolean LJFF;
    public final /* synthetic */ C1384500m8G LJI;
    public int LIZ = 3;
    public long LIZIZ = 6000;
    public float LIZLLL = 18.0f;
    public float LJ = 54.0f;

    public C1384520m8I(C1384500m8G c1384500m8G) {
        this.LJI = c1384500m8G;
    }

    public final void LIZ(int i) {
        if (i == 0) {
            return;
        }
        this.LIZ = i;
        this.LJI.LIZIZ(new AwS34S0001000_21(i, 2));
    }

    public final void LIZIZ(float f) {
        if (f >= 0.0f && f != this.LIZLLL) {
            this.LIZLLL = f;
            this.LJI.LIZIZ(new AwS9S0000001_21(f, 1));
        }
    }

    public final void LIZJ(boolean z) {
        if (this.LJFF != z) {
            this.LJFF = z;
            this.LJI.LIZIZ(new AwS600S0100000_21(this, 150));
        }
    }
}
