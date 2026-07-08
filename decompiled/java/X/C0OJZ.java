package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0OJZ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OJZ implements IEvent {
    public final long LIZ;
    public final long LIZIZ;

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

    public C0OJZ(long j, long j2) {
        this.LIZ = j;
        this.LIZIZ = j2;
    }
}
