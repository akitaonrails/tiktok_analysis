package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1487, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class AnonymousClass1487 {
    public final AnonymousClass1489 LIZ;
    public final String LIZIZ = "https://api.tiktokv.com";
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass1487)) {
            return false;
        }
        AnonymousClass1487 anonymousClass1487 = (AnonymousClass1487) obj;
        return Intrinsics.LJFF(this.LIZ, anonymousClass1487.LIZ) && Intrinsics.LJFF(this.LIZIZ, anonymousClass1487.LIZIZ) && Intrinsics.LJFF(this.LIZJ, anonymousClass1487.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ObserverRequest(event=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", host=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", business=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass1487(AnonymousClass1489 anonymousClass1489, String str) {
        this.LIZ = anonymousClass1489;
        this.LIZJ = str;
    }
}
