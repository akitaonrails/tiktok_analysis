package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.06Zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1630106Zv {
    public final InterfaceC456120Huc LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final float LJ;

    public C1630106Zv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1630106Zv)) {
            return false;
        }
        C1630106Zv c1630106Zv = (C1630106Zv) obj;
        return Intrinsics.LJFF(this.LIZ, c1630106Zv.LIZ) && this.LIZIZ == c1630106Zv.LIZIZ && this.LIZJ == c1630106Zv.LIZJ && this.LIZLLL == c1630106Zv.LIZLLL && Float.compare(this.LJ, c1630106Zv.LJ) == 0;
    }

    public /* synthetic */ C1630106Zv(int i) {
        this(C1629106Zl.LL, 0, 0, 0, 0.0f);
    }

    public C1630106Zv(InterfaceC456120Huc interfaceC456120Huc, int i, int i2, int i3, float f) {
        this.LIZ = interfaceC456120Huc;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = f;
    }
}
