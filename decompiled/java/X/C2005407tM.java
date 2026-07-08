package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07tM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2005407tM implements InterfaceC0148002o {
    public final Integer LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2005407tM) && Intrinsics.LJFF(this.LL, ((C2005407tM) obj).LL);
    }

    public final int hashCode() {
        Integer num = this.LL;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("YearPickerState(currentYear=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2005407tM(Integer num) {
        this.LL = num;
    }
}
