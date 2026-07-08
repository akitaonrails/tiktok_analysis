package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0358, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class AnonymousClass0358 implements IEvent {
    public final boolean LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnonymousClass0358)) {
            return false;
        }
        AnonymousClass0358 anonymousClass0358 = (AnonymousClass0358) obj;
        return this.LIZ == anonymousClass0358.LIZ && this.LIZIZ == anonymousClass0358.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ);
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
        sbLIZ.append("LandInboxTabEvent(enterInbox=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", duration=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public AnonymousClass0358(boolean z, long j) {
        this.LIZ = z;
        this.LIZIZ = j;
    }
}
