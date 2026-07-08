package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bg4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C982620bg4 extends AbstractC982800bgM {
    public static final /* synthetic */ int LJII = 0;
    public final C981540beK LJFF;
    public final boolean LJI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C982620bg4)) {
            return false;
        }
        C982620bg4 c982620bg4 = (C982620bg4) obj;
        return Intrinsics.LJFF(this.LJFF, c982620bg4.LJFF) && this.LJI == c982620bg4.LJI;
    }

    public final int hashCode() {
        return (this.LJFF.hashCode() * 31) + C786410Ut5.Z2(this.LJI);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TakeStageSwitchTurnMessage(countTimeConfig=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", initiateAutoFinalCall=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C982620bg4(C983580bhc c983580bhc) {
        C981540beK c981540beK = c983580bhc.LJFF;
        boolean z = c983580bhc.LJI;
        this.LJFF = c981540beK;
        this.LJI = z;
    }
}
