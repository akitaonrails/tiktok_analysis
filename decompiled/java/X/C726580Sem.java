package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sem, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C726580Sem implements IEvent {
    public final String LIZ;
    public final String LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C726580Sem)) {
            return false;
        }
        C726580Sem c726580Sem = (C726580Sem) obj;
        return Intrinsics.LJFF(this.LIZ, c726580Sem.LIZ) && Intrinsics.LJFF(this.LIZIZ, c726580Sem.LIZIZ) && this.LIZJ == c726580Sem.LIZJ && this.LIZLLL == c726580Sem.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ) * 31) + this.LIZLLL;
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
        sbLIZ.append("LandscapeModeExitEvent(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", exitMethod=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", xyOrientation=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", zOrientation=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C726580Sem(String str, String str2, int i, int i2) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = i;
        this.LIZLLL = i2;
    }
}
