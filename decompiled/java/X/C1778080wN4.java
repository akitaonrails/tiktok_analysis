package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wN4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1778080wN4 extends AbstractC1781930wTH {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1778080wN4) && Intrinsics.LJFF(this.LL, ((C1778080wN4) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SectionHeader(title=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1778080wN4(String str) {
        this.LL = str;
    }
}
