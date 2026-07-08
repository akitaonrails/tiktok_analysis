package X;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05XE, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05XE<T> {
    public final T LIZ;
    public final long LIZIZ;

    public C05XE() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05XE)) {
            return false;
        }
        C05XE c05xe = (C05XE) obj;
        return Intrinsics.LJFF(this.LIZ, c05xe.LIZ) && C19990113Jj.LJII(this.LIZIZ, c05xe.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimedValue(value=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append((Object) C19990113Jj.LJIJJ(this.LIZIZ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        T t = this.LIZ;
        return ((t == null ? 0 : t.hashCode()) * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C05XE(Object obj, long j, DefaultConstructorMarker defaultConstructorMarker) {
        this.LIZ = obj;
        this.LIZIZ = j;
    }
}
