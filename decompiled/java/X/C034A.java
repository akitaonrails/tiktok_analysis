package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.034A, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C034A implements IEvent {
    public final Long LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C034A) && Intrinsics.LJFF(this.LIZ, ((C034A) obj).LIZ);
    }

    public final int hashCode() {
        Long l = this.LIZ;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
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
        sbLIZ.append("ECSearchLynxLiveJumpEvent(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C034A(Long l) {
        this.LIZ = l;
    }
}
