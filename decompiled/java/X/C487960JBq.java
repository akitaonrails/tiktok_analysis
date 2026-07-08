package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JBq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C487960JBq implements IEvent {
    public final boolean LIZ;
    public final String LIZIZ = "Following";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C487960JBq)) {
            return false;
        }
        C487960JBq c487960JBq = (C487960JBq) obj;
        return this.LIZ == c487960JBq.LIZ && Intrinsics.LJFF(this.LIZIZ, c487960JBq.LIZIZ);
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode();
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
        sbLIZ.append("A11yHideFeedToolEvent(hide=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C487960JBq(boolean z) {
        this.LIZ = z;
    }
}
