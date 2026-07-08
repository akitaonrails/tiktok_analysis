package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EqO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C377060EqO {
    public final Integer LIZ;
    public final Integer LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    /* JADX WARN: Illegal instructions before constructor call */
    public C377060EqO() {
        int i = 0;
        this(i, i, 15, (Integer) null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C377060EqO)) {
            return false;
        }
        C377060EqO c377060EqO = (C377060EqO) obj;
        return Intrinsics.LJFF(this.LIZ, c377060EqO.LIZ) && Intrinsics.LJFF(this.LIZIZ, c377060EqO.LIZIZ) && this.LIZJ == c377060EqO.LIZJ && this.LIZLLL == c377060EqO.LIZLLL;
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.LIZIZ;
        return ((((iHashCode + (num2 != null ? num2.hashCode() : 0)) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BottomUIConfig(confirmBtnIconResId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", resetBtnIconResId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", iconSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", iconPadding=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C377060EqO(int i, int i2, int i3, Integer num) {
        this((i3 & 4) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(22)) : i, (i3 & 8) != 0 ? C814420VxA.LIZIZ(C418440Gaw.LIZIZ(20)) : i2, (i3 & 1) != 0 ? null : num, (Integer) null);
    }

    public C377060EqO(int i, int i2, Integer num, Integer num2) {
        this.LIZ = num;
        this.LIZIZ = num2;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
