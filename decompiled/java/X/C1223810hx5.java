package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hx5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1223810hx5 extends AbstractC1223800hx4 {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1223810hx5) && Intrinsics.LJFF(this.LL, ((C1223810hx5) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SelectorListEmptySearchResItem(hint=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1223810hx5(String str) {
        this.LL = str;
    }
}
