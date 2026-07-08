package X;

import android.app.Activity;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wdF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788110wdF implements InterfaceC1788090wdD {
    public final Activity LIZ;
    public final String LIZIZ;
    public final Map<String, String> LIZJ;
    public final InterfaceC1788290wdX LIZLLL;
    public final String LJ;
    public final String LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1788110wdF)) {
            return false;
        }
        C1788110wdF c1788110wdF = (C1788110wdF) obj;
        return Intrinsics.LJFF(this.LIZ, c1788110wdF.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1788110wdF.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1788110wdF.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1788110wdF.LIZLLL) && Intrinsics.LJFF(this.LJ, c1788110wdF.LJ) && Intrinsics.LJFF(this.LJFF, c1788110wdF.LJFF);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31;
        InterfaceC1788290wdX interfaceC1788290wdX = this.LIZLLL;
        return ((((iHashCode + (interfaceC1788290wdX == null ? 0 : interfaceC1788290wdX.hashCode())) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BizOrder(activity=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", trackingMap=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", paymentUI=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", merchantId=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", merchantOrderId=");
        sbLIZ.append(this.LJFF);
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

    public C1788110wdF(Activity activity, String str, Map<String, String> map, InterfaceC1788290wdX interfaceC1788290wdX, String str2, String str3) {
        this.LIZ = activity;
        this.LIZIZ = str;
        this.LIZJ = map;
        this.LIZLLL = interfaceC1788290wdX;
        this.LJ = str2;
        this.LJFF = str3;
    }
}
