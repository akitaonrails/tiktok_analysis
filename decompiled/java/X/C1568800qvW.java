package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qvW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568800qvW {
    public final C1568780qvU LIZ;
    public final EnumC1569640qws LIZIZ;
    public final boolean LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1568800qvW)) {
            return false;
        }
        C1568800qvW c1568800qvW = (C1568800qvW) obj;
        return Intrinsics.LJFF(this.LIZ, c1568800qvW.LIZ) && this.LIZIZ == c1568800qvW.LIZIZ && this.LIZJ == c1568800qvW.LIZJ && this.LIZLLL == c1568800qvW.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CacheSnapshot(params=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", hasBeenConsumed=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", ownedByReplayPage=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1568800qvW(C1568780qvU c1568780qvU, EnumC1569640qws enumC1569640qws, boolean z, boolean z2) {
        this.LIZ = c1568780qvU;
        this.LIZIZ = enumC1569640qws;
        this.LIZJ = z;
        this.LIZLLL = z2;
    }
}
