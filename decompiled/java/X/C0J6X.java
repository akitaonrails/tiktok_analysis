package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0J6X, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0J6X implements IEvent {
    public final String LIZ;
    public final boolean LIZIZ;

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

    public C0J6X(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
