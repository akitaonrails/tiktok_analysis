package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;
import webcast.data.AILiveSummary;

/* JADX INFO: renamed from: X.0T6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C741370T6h implements IEvent {
    public final AILiveSummary LIZ;
    public final String LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C741370T6h)) {
            return false;
        }
        C741370T6h c741370T6h = (C741370T6h) obj;
        return Intrinsics.LJFF(this.LIZ, c741370T6h.LIZ) && Intrinsics.LJFF(this.LIZIZ, c741370T6h.LIZIZ);
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
        sbLIZ.append("AiLiveSummaryMsgEvent(msg=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C741370T6h(AILiveSummary aILiveSummary, String str) {
        this.LIZ = aILiveSummary;
        this.LIZIZ = str;
    }
}
