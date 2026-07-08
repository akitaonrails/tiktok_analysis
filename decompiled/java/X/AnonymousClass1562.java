package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.1562, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class AnonymousClass1562 {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;
    public final C375830EoP<Unit> LJFF;
    public final C375830EoP<String> LJI;

    public AnonymousClass1562() {
        this(0);
    }

    public /* synthetic */ AnonymousClass1562(int i) {
        this(true, true, true, true, true, null, null);
    }

    public AnonymousClass1562(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C375830EoP<Unit> c375830EoP, C375830EoP<String> c375830EoP2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = z3;
        this.LIZLLL = z4;
        this.LJ = z5;
        this.LJFF = c375830EoP;
        this.LJI = c375830EoP2;
    }

    public static AnonymousClass1562 LIZ(AnonymousClass1562 anonymousClass1562, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, C375830EoP c375830EoP, C375830EoP c375830EoP2, int i) {
        C375830EoP c375830EoP3 = c375830EoP2;
        C375830EoP c375830EoP4 = c375830EoP;
        boolean z6 = z5;
        boolean z7 = z4;
        boolean z8 = z3;
        boolean z9 = z2;
        boolean z10 = z;
        if ((i & 1) != 0) {
            z10 = anonymousClass1562.LIZ;
        }
        if ((i & 2) != 0) {
            z9 = anonymousClass1562.LIZIZ;
        }
        if ((i & 4) != 0) {
            z8 = anonymousClass1562.LIZJ;
        }
        if ((i & 8) != 0) {
            z7 = anonymousClass1562.LIZLLL;
        }
        if ((i & 16) != 0) {
            z6 = anonymousClass1562.LJ;
        }
        if ((i & 32) != 0) {
            c375830EoP4 = anonymousClass1562.LJFF;
        }
        if ((i & 64) != 0) {
            c375830EoP3 = anonymousClass1562.LJI;
        }
        anonymousClass1562.getClass();
        return new AnonymousClass1562(z10, z9, z8, z7, z6, c375830EoP4, c375830EoP3);
    }
}
