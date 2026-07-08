package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0PYX, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PYX implements IEvent {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final long LJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0PYX)) {
            return false;
        }
        C0PYX c0pyx = (C0PYX) obj;
        return this.LIZ == c0pyx.LIZ && this.LIZIZ == c0pyx.LIZIZ && this.LIZJ == c0pyx.LIZJ && this.LIZLLL == c0pyx.LIZLLL && this.LJ == c0pyx.LJ;
    }

    public final int hashCode() {
        return (((((((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + C786410Ut5.Y2(this.LJ);
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
        sbLIZ.append("DynamicVerticalSearchRefreshEvent(networkStart=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", networkEnd=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", itemCount=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", status=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", viewDrawStart=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0PYX(int i, int i2, long j, long j2, long j3) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LIZLLL = i2;
        this.LJ = j3;
    }
}
