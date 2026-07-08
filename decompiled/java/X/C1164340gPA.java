package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gPA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1164340gPA implements IEvent {
    public final Long LIZ;
    public final EnumC2176021AEe LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1164340gPA)) {
            return false;
        }
        C1164340gPA c1164340gPA = (C1164340gPA) obj;
        return Intrinsics.LJFF(this.LIZ, c1164340gPA.LIZ) && this.LIZIZ == c1164340gPA.LIZIZ && this.LIZJ == c1164340gPA.LIZJ;
    }

    public final int hashCode() {
        Long l = this.LIZ;
        return ((((l == null ? 0 : l.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Z2(this.LIZJ);
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
        sbLIZ.append("ECLiveJumpEvent(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", scene=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", destroyOuterPlayer=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1164340gPA(Long l, boolean z) {
        EnumC2176021AEe enumC2176021AEe = EnumC2176021AEe.ENTER_INNER_LIVE;
        this.LIZ = l;
        this.LIZIZ = enumC2176021AEe;
        this.LIZJ = z;
    }
}
