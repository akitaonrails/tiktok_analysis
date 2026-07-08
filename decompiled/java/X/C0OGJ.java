package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0OGJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OGJ implements IEvent {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0OGJ)) {
            return false;
        }
        C0OGJ c0ogj = (C0OGJ) obj;
        return Intrinsics.LJFF(this.LIZ, c0ogj.LIZ) && this.LIZIZ == c0ogj.LIZIZ && this.LIZJ == c0ogj.LIZJ;
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ);
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
        sbLIZ.append("CollectMusicEvent(musicId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", collectStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isManual=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0OGJ(String str, int i, boolean z) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
