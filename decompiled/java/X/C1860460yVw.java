package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoAdditonalPanelListResponse;
import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoNewActionBarListResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0yVw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1860460yVw {
    public final TakoNewActionBarListResponse LIZ;
    public final TakoAdditonalPanelListResponse LIZIZ;

    public C1860460yVw() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1860460yVw)) {
            return false;
        }
        C1860460yVw c1860460yVw = (C1860460yVw) obj;
        return Intrinsics.LJFF(this.LIZ, c1860460yVw.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1860460yVw.LIZIZ);
    }

    public final int hashCode() {
        TakoNewActionBarListResponse takoNewActionBarListResponse = this.LIZ;
        int iHashCode = (takoNewActionBarListResponse == null ? 0 : takoNewActionBarListResponse.hashCode()) * 31;
        TakoAdditonalPanelListResponse takoAdditonalPanelListResponse = this.LIZIZ;
        return iHashCode + (takoAdditonalPanelListResponse != null ? takoAdditonalPanelListResponse.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ParsedResponseCache(subModeResponse=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", additionalPanelListResponse=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1860460yVw(TakoNewActionBarListResponse takoNewActionBarListResponse, TakoAdditonalPanelListResponse takoAdditonalPanelListResponse) {
        this.LIZ = takoNewActionBarListResponse;
        this.LIZIZ = takoAdditonalPanelListResponse;
    }
}
