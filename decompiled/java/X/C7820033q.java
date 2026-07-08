package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.033q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7820033q implements IEvent {
    public final Integer LIZ;
    public final String LIZIZ;

    public C7820033q() {
        this(null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C7820033q)) {
            return false;
        }
        C7820033q c7820033q = (C7820033q) obj;
        return Intrinsics.LJFF(this.LIZ, c7820033q.LIZ) && Intrinsics.LJFF(this.LIZIZ, c7820033q.LIZIZ);
    }

    public final int hashCode() {
        Integer num = this.LIZ;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.LIZIZ;
        return iHashCode + (str != null ? str.hashCode() : 0);
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
        sbLIZ.append("FollowingInnerSkylightItemSelectedEvent(position=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", uid=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C7820033q(Integer num, int i) {
        this.LIZ = (i & 1) != 0 ? null : num;
        this.LIZIZ = null;
    }
}
