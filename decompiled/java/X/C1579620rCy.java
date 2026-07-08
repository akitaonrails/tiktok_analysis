package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0rCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1579620rCy {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final Function0<Unit> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1579620rCy)) {
            return false;
        }
        C1579620rCy c1579620rCy = (C1579620rCy) obj;
        return this.LIZ == c1579620rCy.LIZ && this.LIZIZ == c1579620rCy.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1579620rCy.LIZJ);
    }

    public C1579620rCy(Function0 function0, boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = function0;
    }
}
