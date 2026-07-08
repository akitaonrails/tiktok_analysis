package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0PGx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C642210PGx implements InterfaceC111300bX {
    public final String LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C642210PGx) && Intrinsics.LJFF(this.LL, ((C642210PGx) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TabNameData(tabName=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C642210PGx(String str) {
        this.LL = str;
    }
}
