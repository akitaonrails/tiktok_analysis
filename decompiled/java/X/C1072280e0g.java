package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e0g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1072280e0g {
    public final C291001Au<List<EnumC1070410dxf>> LIZ;
    public final C291001Au<Unit> LIZIZ;
    public final C291001Au<Integer> LIZJ;
    public final boolean LIZLLL;

    public C1072280e0g() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1072280e0g)) {
            return false;
        }
        C1072280e0g c1072280e0g = (C1072280e0g) obj;
        return Intrinsics.LJFF(this.LIZ, c1072280e0g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1072280e0g.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1072280e0g.LIZJ) && this.LIZLLL == c1072280e0g.LIZLLL;
    }

    public /* synthetic */ C1072280e0g(int i) {
        this(null, null, null, true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1072280e0g(C291001Au<? extends List<? extends EnumC1070410dxf>> c291001Au, C291001Au<Unit> c291001Au2, C291001Au<Integer> c291001Au3, boolean z) {
        this.LIZ = c291001Au;
        this.LIZIZ = c291001Au2;
        this.LIZJ = c291001Au3;
        this.LIZLLL = z;
    }

    public static C1072280e0g LIZ(C1072280e0g c1072280e0g, C291001Au c291001Au, C291001Au c291001Au2, C291001Au c291001Au3, boolean z, int i) {
        if ((i & 1) != 0) {
            c291001Au = c1072280e0g.LIZ;
        }
        if ((i & 2) != 0) {
            c291001Au2 = c1072280e0g.LIZIZ;
        }
        if ((i & 4) != 0) {
            c291001Au3 = c1072280e0g.LIZJ;
        }
        if ((i & 8) != 0) {
            z = c1072280e0g.LIZLLL;
        }
        c1072280e0g.getClass();
        return new C1072280e0g(c291001Au, c291001Au2, c291001Au3, z);
    }
}
