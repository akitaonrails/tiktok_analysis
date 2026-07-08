package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.07ya, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2037807ya implements IEvent {
    public final boolean LIZ;
    public final boolean LIZIZ;

    public C2037807ya() {
        this(false, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2037807ya)) {
            return false;
        }
        C2037807ya c2037807ya = (C2037807ya) obj;
        return this.LIZ == c2037807ya.LIZ && this.LIZIZ == c2037807ya.LIZIZ;
    }

    public final int hashCode() {
        return (C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ);
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
        sbLIZ.append("UpdateSeriesFeedOverlay(shouldNotResumePlay=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", hasRefund=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C2037807ya(boolean z, int i) {
        this((i & 1) != 0 ? false : z, false);
    }

    public C2037807ya(boolean z, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = z2;
    }
}
