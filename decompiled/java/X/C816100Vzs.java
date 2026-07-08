package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Vzs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C816100Vzs {
    public final int LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C816100Vzs)) {
            return false;
        }
        C816100Vzs c816100Vzs = (C816100Vzs) obj;
        return this.LIZ == c816100Vzs.LIZ && Intrinsics.LJFF(this.LIZIZ, c816100Vzs.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c816100Vzs.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OfflinePushContent(strategy=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", title=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", desc=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C816100Vzs(int i, String str, String str2) {
        this.LIZ = i;
        this.LIZIZ = str;
        this.LIZJ = str2;
    }
}
