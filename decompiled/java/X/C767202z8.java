package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.02z8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C767202z8 implements IEvent {
    public final long LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C767202z8)) {
            return false;
        }
        C767202z8 c767202z8 = (C767202z8) obj;
        return this.LIZ == c767202z8.LIZ && this.LIZIZ == c767202z8.LIZIZ && this.LIZJ == c767202z8.LIZJ;
    }

    public final int hashCode() {
        return (((C786410Ut5.Y2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
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
        sbLIZ.append("BulletinBoardSubscribeEvent(bulletinBoardId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", toSubscribe=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isSuccess=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C767202z8(long j, boolean z, boolean z2) {
        this.LIZ = j;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
