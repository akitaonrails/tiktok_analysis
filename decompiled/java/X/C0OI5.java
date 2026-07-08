package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OI5, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OI5<T> {
    public final C0OIH<T> LIZ;
    public final T LIZIZ;
    public final C0OI8 LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OI5)) {
            return false;
        }
        C0OI5 c0oi5 = (C0OI5) obj;
        return Intrinsics.LJFF(this.LIZ, c0oi5.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0oi5.LIZIZ) && this.LIZJ == c0oi5.LIZJ && this.LIZLLL == c0oi5.LIZLLL;
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        T t = this.LIZIZ;
        return ((((iHashCode + (t == null ? 0 : t.hashCode())) * 31) + this.LIZJ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FieldWrite(field=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", value=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", mode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enqueueTs=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0OI5(C0OIH c0oih, Object obj, C0OI8 c0oi8) {
        this(c0oih, obj, c0oi8, 0L);
    }

    public C0OI5(C0OIH<T> c0oih, T t, C0OI8 c0oi8, long j) {
        this.LIZ = c0oih;
        this.LIZIZ = t;
        this.LIZJ = c0oi8;
        this.LIZLLL = j;
    }
}
