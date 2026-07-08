package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.034V, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C034V implements IEvent {
    public final String LIZ;
    public final int LIZIZ;
    public final boolean LIZJ = false;
    public final String LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C034V)) {
            return false;
        }
        C034V c034v = (C034V) obj;
        return Intrinsics.LJFF(this.LIZ, c034v.LIZ) && this.LIZIZ == c034v.LIZIZ && this.LIZJ == c034v.LIZJ && Intrinsics.LJFF(this.LIZLLL, c034v.LIZLLL);
    }

    public final int hashCode() {
        int iHashCode = ((((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + C786410Ut5.Z2(this.LIZJ)) * 31;
        String str = this.LIZLLL;
        return iHashCode + (str == null ? 0 : str.hashCode());
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
        sbLIZ.append("CommentPreloadV2ReadyEvent(aid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", size=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", isFromPreRequest=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", enterFrom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C034V(int i, String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZLLL = str2;
    }
}
