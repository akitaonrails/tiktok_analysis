package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tq3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680730tq3 extends AbstractC1680810tqB {
    public final C1680760tq6 LIZ;
    public final C1695950uEb LIZIZ;

    @Override // X.AbstractC1680810tqB
    public final C1683130ttv LIZ() {
        C1680760tq6 c1680760tq6 = this.LIZ;
        return new C1683130ttv(c1680760tq6.LIZ, c1680760tq6.LIZIZ, c1680760tq6.LIZJ, c1680760tq6.LIZLLL);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public C1680730tq3(C1680760tq6 c1680760tq6) {
        C1695950uEb c1695950uEbLIZ;
        this.LIZ = c1680760tq6;
        if (!C1680750tq5.LIZIZ(c1680760tq6)) {
            c1695950uEbLIZ = C1695940uEa.LIZ();
            c1695950uEbLIZ.LJIILJJIL(c1680760tq6, EnumC1669110tXJ.CounterClockwise);
        } else {
            c1695950uEbLIZ = null;
        }
        this.LIZIZ = c1695950uEbLIZ;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1680730tq3) && Intrinsics.LJFF(this.LIZ, ((C1680730tq3) obj).LIZ)) {
            return true;
        }
        return false;
    }
}
