package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N4o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588040N4o implements IEvent {
    public final Aweme LIZ;
    public final int LIZIZ;
    public final String LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C588040N4o)) {
            return false;
        }
        C588040N4o c588040N4o = (C588040N4o) obj;
        return Intrinsics.LJFF(this.LIZ, c588040N4o.LIZ) && this.LIZIZ == c588040N4o.LIZIZ && Intrinsics.LJFF(this.LIZJ, c588040N4o.LIZJ);
    }

    public final int hashCode() {
        Aweme aweme = this.LIZ;
        return ((((aweme == null ? 0 : aweme.hashCode()) * 31) + this.LIZIZ) * 31) + this.LIZJ.hashCode();
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
        sbLIZ.append("FullFeedFragmentPanelPageStateChangeEvent(mAweme=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", state=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", eventType=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C588040N4o(int i, Aweme aweme, String str) {
        this.LIZ = aweme;
        this.LIZIZ = i;
        this.LIZJ = str;
    }
}
