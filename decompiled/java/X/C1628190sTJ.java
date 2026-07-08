package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0sTJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1628190sTJ {
    public final int LIZ;
    public final Object LIZIZ;
    public final Function0<Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1628190sTJ)) {
            return false;
        }
        C1628190sTJ c1628190sTJ = (C1628190sTJ) obj;
        return this.LIZ == c1628190sTJ.LIZ && Intrinsics.LJFF(this.LIZIZ, c1628190sTJ.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1628190sTJ.LIZJ);
    }

    public C1628190sTJ(int i, Object obj, Function0<Unit> function0) {
        this.LIZ = i;
        this.LIZIZ = obj;
        this.LIZJ = function0;
    }
}
