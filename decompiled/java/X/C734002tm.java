package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02tm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C734002tm implements InterfaceC0148002o {
    public final C733902tl LL;

    public C734002tm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C734002tm) && Intrinsics.LJFF(this.LL, ((C734002tm) obj).LL);
    }

    public final int hashCode() {
        C733902tl c733902tl = this.LL;
        if (c733902tl == null) {
            return 0;
        }
        return c733902tl.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AggregationOrderModuleState(aggregationVO=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C734002tm(int i) {
        this.LL = null;
    }
}
