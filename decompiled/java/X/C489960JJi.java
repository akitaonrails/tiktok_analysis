package X;

import com.bytedance.android.livesdk.comp.api.pcs.data.model.calendlymeeting.PcsCalendlyBookingData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JJi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C489960JJi implements InterfaceC2753014t {
    public final PcsCalendlyBookingData LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C489960JJi) && Intrinsics.LJFF(this.LL, ((C489960JJi) obj).LL);
    }

    public final int hashCode() {
        PcsCalendlyBookingData pcsCalendlyBookingData = this.LL;
        if (pcsCalendlyBookingData == null) {
            return 0;
        }
        return pcsCalendlyBookingData.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PcsCalendlyMeetingVmSource(initData=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C489960JJi(PcsCalendlyBookingData pcsCalendlyBookingData) {
        this.LL = pcsCalendlyBookingData;
    }
}
