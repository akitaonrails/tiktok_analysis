package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0P8V, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0P8V implements IEvent {
    public final boolean LIZ;
    public final InterfaceC469360Ias LIZIZ;

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

    public C0P8V(boolean z, InterfaceC469360Ias interfaceC469360Ias) {
        this.LIZ = z;
        this.LIZIZ = interfaceC469360Ias;
    }
}
