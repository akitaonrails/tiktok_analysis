package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0NJo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C591940NJo implements IEvent {
    public final int LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C591940NJo)) {
            return false;
        }
        C591940NJo c591940NJo = (C591940NJo) obj;
        return this.LIZ == c591940NJo.LIZ && this.LIZIZ == c591940NJo.LIZIZ && this.LIZJ == c591940NJo.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ);
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
        sbLIZ.append("ECPopCardChangeEvent(type=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isShow=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", popCardAnimDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C591940NJo(int i, boolean z) {
        this(i, 0L, z);
    }

    public C591940NJo(int i, long j, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
        this.LIZJ = j;
    }
}
