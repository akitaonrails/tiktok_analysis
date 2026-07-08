package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.11vR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19656711vR {
    public final int LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final Boolean LIZLLL;
    public final float LJ;
    public final float LJFF;
    public final boolean LJI;
    public final int LJII;
    public final C560530Lyd<Unit> LJIIIIZZ;
    public final boolean LJIIIZ;

    public C19656711vR() {
        this(0);
    }

    public /* synthetic */ C19656711vR(int i) {
        this(-1, false, false, null, 0.0f, 0.0f, false, 0, null, false);
    }

    public C19656711vR(int i, boolean z, boolean z2, Boolean bool, float f, float f2, boolean z3, int i2, C560530Lyd<Unit> c560530Lyd, boolean z4) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = bool;
        this.LJ = f;
        this.LJFF = f2;
        this.LJI = z3;
        this.LJII = i2;
        this.LJIIIIZZ = c560530Lyd;
        this.LJIIIZ = z4;
    }

    public static C19656711vR LIZ(C19656711vR c19656711vR, int i, boolean z, boolean z2, Boolean bool, float f, float f2, boolean z3, int i2, boolean z4, int i3) {
        C560530Lyd<Unit> c560530Lyd;
        boolean z5 = z4;
        int i4 = i2;
        boolean z6 = z3;
        float f3 = f2;
        float f4 = f;
        Boolean bool2 = bool;
        boolean z7 = z2;
        boolean z8 = z;
        int i5 = i;
        if ((i3 & 1) != 0) {
            i5 = c19656711vR.LIZ;
        }
        if ((i3 & 2) != 0) {
            z8 = c19656711vR.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            z7 = c19656711vR.LIZJ;
        }
        if ((i3 & 8) != 0) {
            bool2 = c19656711vR.LIZLLL;
        }
        if ((i3 & 16) != 0) {
            f4 = c19656711vR.LJ;
        }
        if ((i3 & 32) != 0) {
            f3 = c19656711vR.LJFF;
        }
        if ((i3 & 64) != 0) {
            z6 = c19656711vR.LJI;
        }
        if ((i3 & 128) != 0) {
            i4 = c19656711vR.LJII;
        }
        if ((i3 & 256) != 0) {
            c560530Lyd = c19656711vR.LJIIIIZZ;
        } else {
            c560530Lyd = null;
        }
        if ((i3 & 512) != 0) {
            z5 = c19656711vR.LJIIIZ;
        }
        c19656711vR.getClass();
        return new C19656711vR(i5, z8, z7, bool2, f4, f3, z6, i4, c560530Lyd, z5);
    }
}
