package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0btu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991200btu extends AbstractC991610buZ {
    public final int LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C991200btu)) {
            return false;
        }
        C991200btu c991200btu = (C991200btu) obj;
        return this.LIZ == c991200btu.LIZ && Intrinsics.LJFF(this.LIZIZ, c991200btu.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        String str = this.LIZIZ;
        return i + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AIAgentSummary(statusCode=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", summary=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C991200btu(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }
}
