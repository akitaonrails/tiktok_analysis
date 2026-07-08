package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0u99, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1692570u99 {
    public static final C1692570u99 LJI = new C1692570u99(null, null, 63);
    public final Function1<InterfaceC1692870u9d, Unit> LIZ;
    public final Function1<InterfaceC1692870u9d, Unit> LIZIZ;
    public final Function1<InterfaceC1692870u9d, Unit> LIZJ;
    public final Function1<InterfaceC1692870u9d, Unit> LIZLLL;
    public final Function1<InterfaceC1692870u9d, Unit> LJ;
    public final Function1<InterfaceC1692870u9d, Unit> LJFF;

    public C1692570u99() {
        this(null, null, 63);
    }

    public final int hashCode() {
        Function1<InterfaceC1692870u9d, Unit> function1 = this.LIZ;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1<InterfaceC1692870u9d, Unit> function12 = this.LIZIZ;
        int iHashCode2 = (iHashCode + (function12 != null ? function12.hashCode() : 0)) * 31;
        Function1<InterfaceC1692870u9d, Unit> function13 = this.LIZJ;
        int iHashCode3 = (iHashCode2 + (function13 != null ? function13.hashCode() : 0)) * 31;
        Function1<InterfaceC1692870u9d, Unit> function14 = this.LIZLLL;
        int iHashCode4 = (iHashCode3 + (function14 != null ? function14.hashCode() : 0)) * 31;
        Function1<InterfaceC1692870u9d, Unit> function15 = this.LJ;
        int iHashCode5 = (iHashCode4 + (function15 != null ? function15.hashCode() : 0)) * 31;
        Function1<InterfaceC1692870u9d, Unit> function16 = this.LJFF;
        return iHashCode5 + (function16 != null ? function16.hashCode() : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1692570u99)) {
            return false;
        }
        C1692570u99 c1692570u99 = (C1692570u99) obj;
        if (this.LIZ == c1692570u99.LIZ && this.LIZIZ == c1692570u99.LIZIZ && this.LIZJ == c1692570u99.LIZJ && this.LIZLLL == c1692570u99.LIZLLL && this.LJ == c1692570u99.LJ && this.LJFF == c1692570u99.LJFF) {
            return true;
        }
        return false;
    }

    public C1692570u99(Function1 function1, Function1 function12, int i) {
        function1 = (i & 1) != 0 ? null : function1;
        function12 = (i & 4) != 0 ? null : function12;
        this.LIZ = function1;
        this.LIZIZ = null;
        this.LIZJ = function12;
        this.LIZLLL = null;
        this.LJ = null;
        this.LJFF = null;
    }
}
