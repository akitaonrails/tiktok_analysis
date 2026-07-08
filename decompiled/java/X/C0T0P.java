package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0T0P, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T0P implements IEvent {
    public final String LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0T0P)) {
            return false;
        }
        C0T0P c0t0p = (C0T0P) obj;
        return Intrinsics.LJFF(this.LIZ, c0t0p.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0t0p.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
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
        sbLIZ.append("ChangePlayListNameEvent(name=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", mixId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0T0P(String str, String str2) {
        this.LIZ = str;
        this.LIZIZ = str2;
    }
}
