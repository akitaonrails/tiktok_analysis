package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0btP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990890btP implements IEvent {
    public final boolean LIZ;
    public final long LIZIZ;
    public boolean LIZJ;

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

    public C990890btP(boolean z) {
        this.LIZ = z;
    }

    public C990890btP(boolean z, long j) {
        this.LIZ = z;
        this.LIZIZ = j;
    }
}
