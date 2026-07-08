package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07yL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2036307yL implements IEvent {
    public final String LIZ = "bottom_bar";
    public final String LIZIZ = "click";
    public final C1365870leD LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2036307yL)) {
            return false;
        }
        C2036307yL c2036307yL = (C2036307yL) obj;
        return Intrinsics.LJFF(this.LIZ, c2036307yL.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2036307yL.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2036307yL.LIZJ);
    }

    public final int hashCode() {
        int iHashCode = ((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31;
        C1365870leD c1365870leD = this.LIZJ;
        return iHashCode + (c1365870leD == null ? 0 : c1365870leD.hashCode());
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
        sbLIZ.append("ShareClickIMSnackBarEvent(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", actionType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", shareCompleteEvent=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2036307yL(C1365870leD c1365870leD) {
        this.LIZJ = c1365870leD;
    }
}
