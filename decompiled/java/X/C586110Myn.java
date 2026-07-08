package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Myn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C586110Myn implements IEvent {
    public final String LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C586110Myn)) {
            return false;
        }
        C586110Myn c586110Myn = (C586110Myn) obj;
        return Intrinsics.LJFF(this.LIZ, c586110Myn.LIZ) && this.LIZIZ == c586110Myn.LIZIZ && Intrinsics.LJFF(this.LIZJ, c586110Myn.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
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
        sbLIZ.append("CommentDiggChangeEvent(cid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", userDigg=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", from=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C586110Myn(String str, int i, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = str2;
    }
}
