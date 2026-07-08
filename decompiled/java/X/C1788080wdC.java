package X;

import android.app.Activity;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wdC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1788080wdC implements InterfaceC1788090wdD {
    public final EnumC1787510wcH LIZ;
    public final EnumC1782450wU7 LIZIZ;
    public final C1788060wdA LIZJ;
    public final Map<String, String> LIZLLL;
    public final InterfaceC1788290wdX LJ;
    public final String LJFF;

    public C1788080wdC() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1788080wdC)) {
            return false;
        }
        C1788080wdC c1788080wdC = (C1788080wdC) obj;
        return this.LIZ == c1788080wdC.LIZ && this.LIZIZ == c1788080wdC.LIZIZ && Intrinsics.LJFF(this.LIZJ, c1788080wdC.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1788080wdC.LIZLLL) && Intrinsics.LJFF(this.LJ, c1788080wdC.LJ);
    }

    public final int hashCode() {
        int iHashCode = ((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31;
        InterfaceC1788290wdX interfaceC1788290wdX = this.LJ;
        return iHashCode + (interfaceC1788290wdX == null ? 0 : interfaceC1788290wdX.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RestoreRequest(entry=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", productType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", purchase=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", trackingMap=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", paymentUI=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1788090wdD
    public final Activity getActivity() throws IllegalAccessException {
        throw new IllegalAccessException("do not access activity in restoration logic");
    }

    @Override // X.InterfaceC1788090wdD
    public final InterfaceC1788290wdX LIZ() {
        return this.LJ;
    }

    @Override // X.InterfaceC1788090wdD
    public final Map<String, String> getTrackingMap() {
        return this.LIZLLL;
    }

    @Override // X.InterfaceC1788090wdD
    public final String getUserId() {
        return this.LJFF;
    }

    public C1788080wdC(EnumC1787510wcH enumC1787510wcH, EnumC1782450wU7 enumC1782450wU7, C1788060wdA c1788060wdA) {
        Map<String, String> mapLJ = C2097608Jq.LJ();
        this.LIZ = enumC1787510wcH;
        this.LIZIZ = enumC1782450wU7;
        this.LIZJ = c1788060wdA;
        this.LIZLLL = mapLJ;
        this.LJ = null;
        this.LJFF = "";
    }
}
