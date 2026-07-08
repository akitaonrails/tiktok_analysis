package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HK4, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HK4 implements InterfaceC439080HJq, InterfaceC439160HJy {
    public final Long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0HK4) && Intrinsics.LJFF(this.LIZ, ((C0HK4) obj).LIZ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Uploading(timeRemaining=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC439160HJy
    public final Long LIZ() {
        return this.LIZ;
    }

    public C0HK4(Long l) {
        this.LIZ = l;
    }
}
