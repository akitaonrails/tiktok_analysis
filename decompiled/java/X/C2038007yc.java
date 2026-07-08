package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.07yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2038007yc implements IEvent {
    public final List<String> LIZ;
    public final Map<String, Object> LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2038007yc)) {
            return false;
        }
        C2038007yc c2038007yc = (C2038007yc) obj;
        return Intrinsics.LJFF(this.LIZ, c2038007yc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c2038007yc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c2038007yc.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
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
        sbLIZ.append("FeedComponentTimingSignalEvent(timingList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", conditionParam=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", source=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2038007yc(String str, List list, Map map) {
        this.LIZ = list;
        this.LIZIZ = map;
        this.LIZJ = str;
    }
}
