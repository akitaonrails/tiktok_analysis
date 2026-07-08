package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OT6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OT6 extends C0OT8 {
    public final Integer LIZ;
    public final String LIZIZ;

    public C0OT6() {
        this((String) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OT6)) {
            return false;
        }
        C0OT6 c0ot6 = (C0OT6) obj;
        return Intrinsics.LJFF(this.LIZ, c0ot6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ot6.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Error(code=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", message=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C0OT6(String str, int i) {
        this((Integer) null, (i & 2) != 0 ? null : str);
    }

    public C0OT6(Integer num, String str) {
        this.LIZ = num;
        this.LIZIZ = str;
    }
}
