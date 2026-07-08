package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0V0H, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0V0H extends C0V0J {
    public final String LIZ = "Effect Changed";
    public final boolean LIZIZ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0V0H)) {
            return false;
        }
        C0V0H c0v0h = (C0V0H) obj;
        return Intrinsics.LJFF(this.LIZ, c0v0h.LIZ) && this.LIZIZ == c0v0h.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EffectChanged(action=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAigc=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
