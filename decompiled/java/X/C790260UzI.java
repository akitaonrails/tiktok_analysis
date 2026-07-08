package X;

import android.os.Bundle;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS159S0400000_32;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0UzI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C790260UzI {
    public final String LIZ;
    public final Bundle LIZIZ;
    public final Bundle LIZJ;
    public final Function0<Unit> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C790260UzI)) {
            return false;
        }
        C790260UzI c790260UzI = (C790260UzI) obj;
        return Intrinsics.LJFF(this.LIZ, c790260UzI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c790260UzI.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c790260UzI.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c790260UzI.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = this.LIZ.hashCode() * 31;
        Bundle bundle = this.LIZIZ;
        int iHashCode2 = (iHashCode + (bundle == null ? 0 : bundle.hashCode())) * 31;
        Bundle bundle2 = this.LIZJ;
        return ((iHashCode2 + (bundle2 != null ? bundle2.hashCode() : 0)) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SceneBundleRecord(sceneClassName=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", sceneArguments=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sceneSavedInstanceState=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", deleteFunction=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C790260UzI(String str, Bundle bundle, Bundle bundle2, AwS159S0400000_32 awS159S0400000_32) {
        this.LIZ = str;
        this.LIZIZ = bundle;
        this.LIZJ = bundle2;
        this.LIZLLL = awS159S0400000_32;
    }
}
