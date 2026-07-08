package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.08LW, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08LW implements IEvent {
    public final Long LIZ;
    public final boolean LIZIZ;
    public final boolean LIZJ;

    public C08LW() {
        this(null, false, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C08LW)) {
            return false;
        }
        C08LW c08lw = (C08LW) obj;
        return Intrinsics.LJFF(this.LIZ, c08lw.LIZ) && this.LIZIZ == c08lw.LIZIZ && this.LIZJ == c08lw.LIZJ;
    }

    public final int hashCode() {
        Long l = this.LIZ;
        return ((((l == null ? 0 : l.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Z2(this.LIZJ);
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
        sbLIZ.append("SmoothExitEvent(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exitPullStream=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", smoothExit=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C08LW(Long l, boolean z, boolean z2) {
        this.LIZ = l;
        this.LIZIZ = z;
        this.LIZJ = z2;
    }
}
