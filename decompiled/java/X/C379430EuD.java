package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0EuD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C379430EuD {
    public final EnumC379360Eu6 LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C379430EuD)) {
            return false;
        }
        C379430EuD c379430EuD = (C379430EuD) obj;
        return this.LIZ == c379430EuD.LIZ && Intrinsics.LJFF(this.LIZIZ, c379430EuD.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c379430EuD.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        String str = this.LIZJ;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EPAIGCPromptRephraserItem(key=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", description=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C379430EuD(EnumC379360Eu6 enumC379360Eu6, String str, String str2) {
        this.LIZ = enumC379360Eu6;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
