package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.034B, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C034B implements IEvent {
    public final Boolean LIZ;

    public C034B() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C034B) && Intrinsics.LJFF(this.LIZ, ((C034B) obj).LIZ);
    }

    public final int hashCode() {
        Boolean bool = this.LIZ;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent post() {
        C1440005kM.LIZ(this);
        return this;
    }

    @Override // com.ss.android.ugc.governance.eventbus.IEvent
    public final /* synthetic */ IEvent postSticky() {
        C1440005kM.LIZIZ(this);
        return this;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaymentInstallmentPromotionEvent(installmentPromotionShow=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C034B(Boolean bool) {
        this.LIZ = bool;
    }
}
