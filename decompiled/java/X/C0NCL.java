package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NCL, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NCL implements IEvent {
    public final Aweme LIZ;
    public final boolean LIZIZ;
    public final long LIZJ;
    public final long LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0NCL)) {
            return false;
        }
        C0NCL c0ncl = (C0NCL) obj;
        return Intrinsics.LJFF(this.LIZ, c0ncl.LIZ) && this.LIZIZ == c0ncl.LIZIZ && this.LIZJ == c0ncl.LIZJ && this.LIZLLL == c0ncl.LIZLLL;
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        return ((((((aweme == null ? 0 : aweme.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Y2(this.LIZLLL);
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
        sbLIZ.append("SingleVideoAwemeExitDetailEvent(aweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", isPlaying=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", playStartTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", currentPosition=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0NCL(long j, long j2, Aweme aweme, boolean z) {
        this.LIZ = aweme;
        this.LIZIZ = z;
        this.LIZJ = j;
        this.LIZLLL = j2;
    }
}
