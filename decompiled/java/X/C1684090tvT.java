package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS71S1000000_21;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tvT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1684090tvT<T> {
    public final C1668880tWw LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final T LIZLLL;
    public final Function1<EnumC1366460lfA, Unit> LJ;
    public final Function0<Unit> LJFF;

    public C1684090tvT() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1684090tvT)) {
            return false;
        }
        C1684090tvT c1684090tvT = (C1684090tvT) obj;
        return Intrinsics.LJFF(this.LIZ, c1684090tvT.LIZ) && this.LIZIZ == c1684090tvT.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1684090tvT.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1684090tvT.LIZLLL) && Intrinsics.LJFF(this.LJ, c1684090tvT.LJ) && Intrinsics.LJFF(this.LJFF, c1684090tvT.LJFF);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1684090tvT(C1668880tWw c1668880tWw, int i, String str, Object obj, AwS71S1000000_21 awS71S1000000_21, Function0 function0, int i2) {
        c1668880tWw = (i2 & 1) != 0 ? null : c1668880tWw;
        i = (i2 & 2) != 0 ? -1 : i;
        awS71S1000000_21 = (i2 & 16) != 0 ? null : awS71S1000000_21;
        this.LIZ = c1668880tWw;
        this.LIZIZ = i;
        this.LIZJ = str;
        this.LIZLLL = obj;
        this.LJ = awS71S1000000_21;
        this.LJFF = function0;
    }
}
