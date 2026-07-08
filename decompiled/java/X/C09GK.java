package X;

import com.bytedance.android.livesdk.livesetting.subscription.LivePcsHighIntentUserIdentificationSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.09GK, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09GK implements C09GM {
    public static final String LIZJ = LivePcsHighIntentUserIdentificationSetting.INSTANCE.getAndroidScene();
    public final Function1<AbstractC1122920fKM, Unit> LIZ;
    public final String LIZIZ = LIZJ;

    @Override // X.C09GM
    public final void LIZ() {
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C09GK) && Intrinsics.LJFF(this.LIZ, ((C09GK) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("HighIntentClientAiModelDownloadRequest(callback=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.C09GM
    public final Function1<AbstractC1122920fKM, Unit> LIZJ() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C09GK(Function1<? super AbstractC1122920fKM, Unit> function1) {
        this.LIZ = function1;
    }
}
