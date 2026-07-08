package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IP6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IP6 {
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IP6)) {
            return false;
        }
        C0IP6 c0ip6 = (C0IP6) obj;
        return Intrinsics.LJFF(this.LIZ, c0ip6.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ip6.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ip6.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeviceStatusSuggestionParams(networkSuggestion=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", audioSuggestion=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", performanceSuggestion=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0IP6(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
