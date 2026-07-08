package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.061R, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C061R implements InterfaceC111300bX {
    public final String LL;
    public final Integer LLILLJJLI;

    public C061R() {
        this(null, null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C061R)) {
            return false;
        }
        C061R c061r = (C061R) obj;
        return Intrinsics.LJFF(this.LL, c061r.LL) && Intrinsics.LJFF(this.LLILLJJLI, c061r.LLILLJJLI);
    }

    public final int hashCode() {
        String str = this.LL;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.LLILLJJLI;
        return iHashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("YearPickerData(guideString=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", startingYear=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C061R(String str, Integer num, int i) {
        str = (i & 1) != 0 ? null : str;
        num = (i & 2) != 0 ? null : num;
        this.LL = str;
        this.LLILLJJLI = num;
    }
}
