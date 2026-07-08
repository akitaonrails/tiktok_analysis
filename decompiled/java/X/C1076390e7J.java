package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0e7J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1076390e7J extends AbstractC1223820hx6 {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1076390e7J) && Intrinsics.LJFF(this.LL, ((C1076390e7J) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GuideToSearchItem(hint=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1076390e7J(String str) {
        this.LL = str;
    }
}
