package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0njT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1446010njT implements IEvent {
    public final int LIZ;
    public final Aweme LIZIZ;

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
        sbLIZ.append("state:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append("  materialId:");
        sbLIZ.append((String) null);
        sbLIZ.append(" videoPath:");
        sbLIZ.append((String) null);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1446010njT(int i, Aweme aweme) {
        this.LIZ = i;
        this.LIZIZ = aweme;
    }
}
