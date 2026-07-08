package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.158Z, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C158Z {
    public final String LIZ;
    public final C158Y LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C158Z)) {
            return false;
        }
        C158Z c158z = (C158Z) obj;
        return Intrinsics.LJFF(this.LIZ, c158z.LIZ) && Intrinsics.LJFF(this.LIZIZ, c158z.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FanHammerPlayAction(eventType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", event=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C158Z(C158Y c158y, String str) {
        this.LIZ = str;
        this.LIZIZ = c158y;
    }
}
