package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0IHI, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IHI implements IEvent {
    public final long LIZ;
    public final C0II3 LIZIZ;

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

    public C0IHI(long j, C0II3 c0ii3) {
        this.LIZ = j;
        this.LIZIZ = c0ii3;
    }
}
