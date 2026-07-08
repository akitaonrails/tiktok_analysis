package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0N1X, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N1X implements IEvent {
    public final String LIZ;
    public final C0N1W LIZIZ;

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

    public C0N1X(String str, C0N1W c0n1w) {
        this.LIZ = str;
        this.LIZIZ = c0n1w;
    }
}
