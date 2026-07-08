package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Hr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C453940Hr6 implements IEvent {
    public final boolean LIZ;
    public final boolean LIZIZ;
    public final AbstractC453920Hr4 LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C453940Hr6)) {
            return false;
        }
        C453940Hr6 c453940Hr6 = (C453940Hr6) obj;
        return this.LIZ == c453940Hr6.LIZ && this.LIZIZ == c453940Hr6.LIZIZ && Intrinsics.LJFF(this.LIZJ, c453940Hr6.LIZJ);
    }

    public final int hashCode() {
        return (((C786410Ut5.Z2(this.LIZ) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + this.LIZJ.hashCode();
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
        sbLIZ.append("LoopCurrentStoryVideoEvent(loop=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", useCount=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", action=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C453940Hr6(boolean z, boolean z2, int i) {
        C453910Hr3 c453910Hr3;
        z2 = (i & 2) != 0 ? true : z2;
        if ((i & 4) != 0) {
            c453910Hr3 = new C453910Hr3("");
        } else {
            c453910Hr3 = null;
        }
        this(z, z2, c453910Hr3);
    }

    public C453940Hr6(boolean z, boolean z2, AbstractC453920Hr4 abstractC453920Hr4) {
        this.LIZ = z;
        this.LIZIZ = z2;
        this.LIZJ = abstractC453920Hr4;
    }
}
