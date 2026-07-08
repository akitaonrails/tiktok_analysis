package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Tme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C756940Tme {
    public final EnumC756810TmR LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C756940Tme)) {
            return false;
        }
        C756940Tme c756940Tme = (C756940Tme) obj;
        return this.LIZ == c756940Tme.LIZ && Intrinsics.LJFF(this.LIZIZ, c756940Tme.LIZIZ) && this.LIZJ == c756940Tme.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LiveShopBagPrepareState(slotId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", bizType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", canHandle=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C756940Tme(EnumC756810TmR enumC756810TmR, String str, boolean z) {
        this.LIZ = enumC756810TmR;
        this.LIZIZ = str;
        this.LIZJ = z;
    }
}
