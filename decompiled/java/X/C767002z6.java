package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02z6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C767002z6 implements IEvent {
    public final Long LIZ;
    public final boolean LIZIZ;

    public C767002z6() {
        this(null, false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C767002z6)) {
            return false;
        }
        C767002z6 c767002z6 = (C767002z6) obj;
        return Intrinsics.LJFF(this.LIZ, c767002z6.LIZ) && this.LIZIZ == c767002z6.LIZIZ;
    }

    public final int hashCode() {
        Long l = this.LIZ;
        return ((l == null ? 0 : l.hashCode()) * 31) + C786410Ut5.Z2(this.LIZIZ);
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
        sbLIZ.append("SmoothEnterEvent(roomId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", smoothEnter=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C767002z6(Long l, boolean z) {
        this.LIZ = l;
        this.LIZIZ = z;
    }
}
