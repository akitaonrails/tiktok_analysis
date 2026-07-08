package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0ODC, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ODC implements IEvent {
    public final boolean LIZ;
    public final C1255920ims<?> LIZIZ;
    public final Long LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0ODC)) {
            return false;
        }
        C0ODC c0odc = (C0ODC) obj;
        return this.LIZ == c0odc.LIZ && Intrinsics.LJFF(this.LIZIZ, c0odc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0odc.LIZJ);
    }

    public final int hashCode() {
        int iZ2 = ((C786410Ut5.Z2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        Long l = this.LIZJ;
        return iZ2 + (l == null ? 0 : l.hashCode());
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
        sbLIZ.append("LoadEvent(succeeded=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", presenter=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", topicId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0ODC(boolean z, C616350OFl c616350OFl, Long l) {
        this.LIZ = z;
        this.LIZIZ = c616350OFl;
        this.LIZJ = l;
    }
}
