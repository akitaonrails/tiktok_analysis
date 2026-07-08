package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0IFJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IFJ implements IEvent {
    public final boolean LIZ;
    public final String LIZIZ;

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

    public C0IFJ(boolean z, String str) {
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
