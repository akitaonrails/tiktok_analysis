package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0a0R, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C918370a0R {
    public final List<InterfaceC918590a0n> LIZ;
    public final boolean LIZIZ;

    public C918370a0R() {
        this((List) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C918370a0R)) {
            return false;
        }
        C918370a0R c918370a0R = (C918370a0R) obj;
        return Intrinsics.LJFF(this.LIZ, c918370a0R.LIZ) && this.LIZIZ == c918370a0R.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("InviteExtension(extraPreCheckers=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", requireIncreaseGuestMaxCountCheck=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C918370a0R(List list, int i) {
        this((List<? extends InterfaceC918590a0n>) ((i & 1) != 0 ? C13BV.INSTANCE : list), false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C918370a0R(List<? extends InterfaceC918590a0n> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }

    public static C918370a0R LIZ(C918370a0R c918370a0R, List list, boolean z, int i) {
        if ((i & 1) != 0) {
            list = c918370a0R.LIZ;
        }
        if ((i & 2) != 0) {
            z = c918370a0R.LIZIZ;
        }
        c918370a0R.getClass();
        return new C918370a0R((List<? extends InterfaceC918590a0n>) list, z);
    }
}
