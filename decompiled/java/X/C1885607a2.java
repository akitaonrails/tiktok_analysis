package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07a2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1885607a2 {
    public final List<AnonymousClass0033> LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1885607a2)) {
            return false;
        }
        C1885607a2 c1885607a2 = (C1885607a2) obj;
        return Intrinsics.LJFF(this.LIZ, c1885607a2.LIZ) && this.LIZIZ == c1885607a2.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MessageReadStatusListResult(list=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isFirstPage=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1885607a2(List<? extends AnonymousClass0033> list, boolean z) {
        this.LIZ = list;
        this.LIZIZ = z;
    }
}
