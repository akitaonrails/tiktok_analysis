package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EI2, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EI2 {
    public static final /* synthetic */ int LJFF = 0;
    public final String LIZ;
    public final boolean LIZIZ;
    public final Integer LIZJ;
    public final boolean LIZLLL;
    public final boolean LJ;

    static {
        new C0EI1();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0EI2)) {
            return false;
        }
        C0EI2 c0ei2 = (C0EI2) obj;
        return Intrinsics.LJFF(this.LIZ, c0ei2.LIZ) && this.LIZIZ == c0ei2.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0ei2.LIZJ) && this.LIZLLL == c0ei2.LIZLLL && this.LJ == c0ei2.LJ;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C0EI2(String str, Integer num, boolean z, int i) {
        boolean z2;
        boolean z3 = z;
        Integer num2 = (i & 4) != 0 ? null : num;
        if ((i & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(num2, str, false, z2, (i & 16) != 0 ? false : z3);
    }

    public C0EI2(Integer num, String str, boolean z, boolean z2, boolean z3) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = num;
        this.LIZLLL = z2;
        this.LJ = z3;
    }
}
