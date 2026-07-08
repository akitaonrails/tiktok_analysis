package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N5G, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5G implements IEvent {
    public final C1365810le7 LIZ;
    public final long LIZIZ = 3000;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0N5G)) {
            return false;
        }
        C0N5G c0n5g = (C0N5G) obj;
        return Intrinsics.LJFF(this.LIZ, c0n5g.LIZ) && this.LIZIZ == c0n5g.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
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
        sbLIZ.append("MessageShareCompleteEvent(params=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0N5G(C1365810le7 c1365810le7) {
        this.LIZ = c1365810le7;
    }
}
