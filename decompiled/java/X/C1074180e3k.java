package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e3k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1074180e3k {
    public final C13IQ<? extends C19280810bu> LIZ;
    public final boolean LIZIZ;

    public C1074180e3k() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1074180e3k)) {
            return false;
        }
        C1074180e3k c1074180e3k = (C1074180e3k) obj;
        return Intrinsics.LJFF(this.LIZ, c1074180e3k.LIZ) && this.LIZIZ == c1074180e3k.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeConfig(eventKey=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isSync=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1074180e3k(C19719912Dl c19719912Dl) {
        this.LIZ = c19719912Dl;
        this.LIZIZ = false;
    }
}
