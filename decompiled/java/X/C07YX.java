package X;

import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07YX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07YX {
    public final NetworkUniversalPopupResponse LIZ;
    public final boolean LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C07YX)) {
            return false;
        }
        C07YX c07yx = (C07YX) obj;
        return Intrinsics.LJFF(this.LIZ, c07yx.LIZ) && this.LIZIZ == c07yx.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeferredPopupData(popupData=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isHotLaunchPopup=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C07YX(NetworkUniversalPopupResponse networkUniversalPopupResponse, boolean z) {
        this.LIZ = networkUniversalPopupResponse;
        this.LIZIZ = z;
    }
}
