package X;

import com.ss.android.ugc.aweme.im.push.api.alerttone.model.GetAlertToneResponse;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Yy1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891390Yy1 extends AbstractC891400Yy2 {
    public final GetAlertToneResponse LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C891390Yy1) && Intrinsics.LJFF(this.LIZ, ((C891390Yy1) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Success(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C891390Yy1(GetAlertToneResponse getAlertToneResponse) {
        this.LIZ = getAlertToneResponse;
    }
}
