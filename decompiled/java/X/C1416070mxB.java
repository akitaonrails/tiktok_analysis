package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mxB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1416070mxB {
    public final EnumC1416050mx9 LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;
    public final float LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final boolean LJI;

    public C1416070mxB() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1416070mxB)) {
            return false;
        }
        C1416070mxB c1416070mxB = (C1416070mxB) obj;
        return this.LIZ == c1416070mxB.LIZ && Intrinsics.LJFF(this.LIZIZ, c1416070mxB.LIZIZ) && this.LIZJ == c1416070mxB.LIZJ && Float.compare(this.LIZLLL, c1416070mxB.LIZLLL) == 0 && Float.compare(this.LJ, c1416070mxB.LJ) == 0 && Float.compare(this.LJFF, c1416070mxB.LJFF) == 0 && this.LJI == c1416070mxB.LJI;
    }

    public /* synthetic */ C1416070mxB(int i) {
        this(EnumC1416050mx9.IDLE, null, false, 0.0f, 0.0f, 0.0f, false);
    }

    public C1416070mxB(EnumC1416050mx9 enumC1416050mx9, String str, boolean z, float f, float f2, float f3, boolean z2) {
        this.LIZ = enumC1416050mx9;
        this.LIZIZ = str;
        this.LIZJ = z;
        this.LIZLLL = f;
        this.LJ = f2;
        this.LJFF = f3;
        this.LJI = z2;
    }

    public static C1416070mxB LIZ(C1416070mxB c1416070mxB, EnumC1416050mx9 enumC1416050mx9, String str, boolean z, float f, float f2, float f3, boolean z2, int i) {
        boolean z3 = z2;
        float f4 = f3;
        float f5 = f2;
        float f6 = f;
        boolean z4 = z;
        String str2 = str;
        EnumC1416050mx9 enumC1416050mx92 = enumC1416050mx9;
        if ((i & 1) != 0) {
            enumC1416050mx92 = c1416070mxB.LIZ;
        }
        if ((i & 2) != 0) {
            str2 = c1416070mxB.LIZIZ;
        }
        if ((i & 4) != 0) {
            z4 = c1416070mxB.LIZJ;
        }
        if ((i & 8) != 0) {
            f6 = c1416070mxB.LIZLLL;
        }
        if ((i & 16) != 0) {
            f5 = c1416070mxB.LJ;
        }
        if ((i & 32) != 0) {
            f4 = c1416070mxB.LJFF;
        }
        if ((i & 64) != 0) {
            z3 = c1416070mxB.LJI;
        }
        return new C1416070mxB(enumC1416050mx92, str2, z4, f6, f5, f4, z3);
    }
}
