package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.035B, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C035B implements IEvent {
    public final String LIZ;
    public final int LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C035B)) {
            return false;
        }
        C035B c035b = (C035B) obj;
        return Intrinsics.LJFF(this.LIZ, c035b.LIZ) && this.LIZIZ == c035b.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ;
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
        sbLIZ.append("CommentDiggStateChangedEvent(cid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", diggedState=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C035B(String str, int i) {
        this.LIZ = str;
        this.LIZIZ = i;
    }
}
