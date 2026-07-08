package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HK3, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HK3 implements InterfaceC439080HJq, InterfaceC439160HJy {
    public final Float LIZ;
    public final Long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HK3)) {
            return false;
        }
        C0HK3 c0hk3 = (C0HK3) obj;
        return Intrinsics.LJFF(this.LIZ, c0hk3.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0hk3.LIZIZ);
    }

    public final int hashCode() {
        Float f = this.LIZ;
        int iHashCode = (f == null ? 0 : f.hashCode()) * 31;
        Long l = this.LIZIZ;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Generating(percentage=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timeRemaining=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC439160HJy
    public final Long LIZ() {
        return this.LIZIZ;
    }

    public C0HK3(Float f, Long l) {
        this.LIZ = f;
        this.LIZIZ = l;
    }
}
