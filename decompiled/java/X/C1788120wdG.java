package X;

import android.app.Activity;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wdG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788120wdG implements InterfaceC1788090wdD {
    public final Activity LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final InterfaceC1788290wdX LIZLLL;
    public final String LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1788120wdG)) {
            return false;
        }
        C1788120wdG c1788120wdG = (C1788120wdG) obj;
        return Intrinsics.LJFF(this.LIZ, c1788120wdG.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1788120wdG.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1788120wdG.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1788120wdG.LIZLLL) && Intrinsics.LJFF(this.LJ, c1788120wdG.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        InterfaceC1788290wdX interfaceC1788290wdX = this.LIZLLL;
        return ((iHashCode + (interfaceC1788290wdX == null ? 0 : interfaceC1788290wdX.hashCode())) * 31) + this.LJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Payload(activity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trackingMap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", paymentUI=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", encodedPayload=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1788090wdD
    public final InterfaceC1788290wdX LIZ() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1788090wdD
    public final Activity getActivity() {
        return this.LIZ;
    }

    @Override // X.InterfaceC1788090wdD
    public final Map<String, String> getTrackingMap() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC1788090wdD
    public final String getUserId() {
        return this.LIZIZ;
    }

    public /* synthetic */ C1788120wdG(Activity activity, String str, Map map, String str2) {
        this(activity, str, map, null, str2);
    }

    public C1788120wdG(Activity activity, String str, Map<String, String> map, InterfaceC1788290wdX interfaceC1788290wdX, String str2) {
        this.LIZ = activity;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = interfaceC1788290wdX;
        this.LJ = str2;
    }
}
