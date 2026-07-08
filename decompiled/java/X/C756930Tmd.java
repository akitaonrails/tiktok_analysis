package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tmd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756930Tmd {
    public final EnumC21266718Kj LIZ;
    public final boolean LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C756930Tmd)) {
            return false;
        }
        C756930Tmd c756930Tmd = (C756930Tmd) obj;
        return this.LIZ == c756930Tmd.LIZ && this.LIZIZ == c756930Tmd.LIZIZ && Intrinsics.LJFF(this.LIZJ, c756930Tmd.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShopBagDisplayDecision(displayType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", visible=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C756930Tmd(EnumC21266718Kj enumC21266718Kj, boolean z, String str) {
        this.LIZ = enumC21266718Kj;
        this.LIZIZ = z;
        this.LIZJ = str;
    }
}
