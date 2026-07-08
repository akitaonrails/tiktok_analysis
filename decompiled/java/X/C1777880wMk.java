package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wMk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1777880wMk {
    public final int LIZ = 2131755656;
    public final int LIZIZ;
    public final Object LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1777880wMk)) {
            return false;
        }
        C1777880wMk c1777880wMk = (C1777880wMk) obj;
        return this.LIZ == c1777880wMk.LIZ && this.LIZIZ == c1777880wMk.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1777880wMk.LIZJ);
    }

    public final int hashCode() {
        int i = ((this.LIZ * 31) + this.LIZIZ) * 31;
        Object obj = this.LIZJ;
        return i + (obj == null ? 0 : obj.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CountdownTipRes(resId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", quantity=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", formatArg=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1777880wMk(int i, Object obj) {
        this.LIZIZ = i;
        this.LIZJ = obj;
    }
}
