package X;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS264S0000000_24;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rxV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1608470rxV {
    public final Function1<C1608740rxw, Float> LIZ;
    public final Function1<C1608740rxw, Float> LIZIZ;
    public final boolean LIZJ;

    public C1608470rxV() {
        this(null, null, 7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1608470rxV)) {
            return false;
        }
        C1608470rxV c1608470rxV = (C1608470rxV) obj;
        return Intrinsics.LJFF(this.LIZ, c1608470rxV.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1608470rxV.LIZIZ) && this.LIZJ == c1608470rxV.LIZJ;
    }

    public C1608470rxV(Function1 function1, Function1 function12, int i) {
        function1 = (i & 1) != 0 ? AFwS264S0000000_24.get$arr$(564) : function1;
        function12 = (i & 2) != 0 ? AFwS264S0000000_24.get$arr$(565) : function12;
        this.LIZ = function1;
        this.LIZIZ = function12;
        this.LIZJ = false;
    }
}
