package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N3N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N3N implements IEvent {
    public final String LIZ;
    public final Aweme LIZIZ;
    public final Throwable LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0N3N)) {
            return false;
        }
        C0N3N c0n3n = (C0N3N) obj;
        return Intrinsics.LJFF(this.LIZ, c0n3n.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0n3n.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0n3n.LIZJ);
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Aweme aweme = this.LIZIZ;
        int iHashCode2 = (iHashCode + (aweme == null ? 0 : aweme.hashCode())) * 31;
        Throwable th = this.LIZJ;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
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
        sbLIZ.append("DetailAwemeRespEvent(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", aweme=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", error=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0N3N(Aweme aweme, String str, Throwable th) {
        this.LIZ = str;
        this.LIZIZ = aweme;
        this.LIZJ = th;
    }
}
