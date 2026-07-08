package X;

import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS193S0000000_7;
import kotlin.jvm.internal.AFwS237S0000000_7;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0KTY, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KTY {
    public final Map<String, Object> LIZ;
    public final Map<String, Object> LIZIZ;
    public final boolean LIZJ;
    public final Map<String, Object> LIZLLL;
    public final Map<String, Object> LJ;
    public final Function0<Unit> LJFF;
    public final Function1<String, Unit> LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0KTY)) {
            return false;
        }
        C0KTY c0kty = (C0KTY) obj;
        return Intrinsics.LJFF(this.LIZ, c0kty.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0kty.LIZIZ) && this.LIZJ == c0kty.LIZJ && Intrinsics.LJFF(this.LIZLLL, c0kty.LIZLLL) && Intrinsics.LJFF(this.LJ, c0kty.LJ) && Intrinsics.LJFF(this.LJFF, c0kty.LJFF) && Intrinsics.LJFF(this.LJI, c0kty.LJI);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        Map<String, Object> map = this.LIZLLL;
        int iHashCode2 = (iHashCode + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, Object> map2 = this.LJ;
        return ((((iHashCode2 + (map2 != null ? map2.hashCode() : 0)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PgcIapShortDramaPayEvent(createOrderParams=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", iapTrackingData=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isOneTimePay=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", purchaseOption=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", mpParams=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", onSuccess=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", onFailure=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0KTY(Map map, Map map2, boolean z, Map map3, Map map4, AFwS193S0000000_7 aFwS193S0000000_7, AFwS237S0000000_7 aFwS237S0000000_7) {
        this.LIZ = map;
        this.LIZIZ = map2;
        this.LIZJ = z;
        this.LIZLLL = map3;
        this.LJ = map4;
        this.LJFF = aFwS193S0000000_7;
        this.LJI = aFwS237S0000000_7;
    }
}
