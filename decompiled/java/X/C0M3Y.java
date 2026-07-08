package X;

import kotlin.jvm.internal.AFwS194S0000000_8;
import kotlin.jvm.internal.AwS552S0100000_8;

/* JADX INFO: renamed from: X.0M3Y, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0M3Y {
    public final EnumC562200M3e LIZ;
    public final C01GW LIZIZ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(616));
    public final C01GW LIZJ = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(615));
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS194S0000000_8.get$arr$(614));
    public final C01GW LJ = C452501pT.LIZIZ(new AwS552S0100000_8(this, 1107));

    public final EnumC562160M3a LIZ() {
        return (EnumC562160M3a) this.LJ.getValue();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DraftBoxStyleStrategy(styleType = ");
        sbLIZ.append(LIZ());
        sbLIZ.append(", sortStrategy = ");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exceptList = ");
        sbLIZ.append(this.LIZLLL.getValue());
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0M3Y(EnumC562200M3e enumC562200M3e) {
        this.LIZ = enumC562200M3e;
    }
}
