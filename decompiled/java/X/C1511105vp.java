package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.AlertToneValueItem;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1511105vp {
    public final String LIZ;
    public final AlertToneValueItem LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1511105vp)) {
            return false;
        }
        C1511105vp c1511105vp = (C1511105vp) obj;
        return Intrinsics.LJFF(this.LIZ, c1511105vp.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1511105vp.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SyncAlertToneSettingsEvent(alertScene=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", updateAlert=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1511105vp(String str, AlertToneValueItem alertToneValueItem) {
        this.LIZ = str;
        this.LIZIZ = alertToneValueItem;
    }
}
