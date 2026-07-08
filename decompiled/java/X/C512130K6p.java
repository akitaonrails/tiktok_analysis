package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0K6p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C512130K6p implements InterfaceC512170K6t {
    public final String LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;
    public final String LIZLLL;
    public final boolean LJ = false;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C512130K6p)) {
            return false;
        }
        C512130K6p c512130K6p = (C512130K6p) obj;
        return Intrinsics.LJFF(this.LIZ, c512130K6p.LIZ) && this.LIZIZ == c512130K6p.LIZIZ && this.LIZJ == c512130K6p.LIZJ && Intrinsics.LJFF(this.LIZLLL, c512130K6p.LIZLLL) && this.LJ == c512130K6p.LJ;
    }

    public final int hashCode() {
        return (((((((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LIZLLL.hashCode()) * 31) + C786410Ut5.Z2(this.LJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubscribeSuccess(secUid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isAutoRenewSub=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", needOpenOnBoarding=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", subscribePackageId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", isGiftSub=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C512130K6p(String str, String str2, boolean z, boolean z2) {
        this.LIZ = str;
        this.LIZIZ = z;
        this.LIZJ = z2;
        this.LIZLLL = str2;
    }
}
