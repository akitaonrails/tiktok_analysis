package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.15N5, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15N5 implements IEvent {
    public final int LIZ;
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

    public C15N5(int i, boolean z) {
        this.LIZ = i;
        this.LIZIZ = z;
    }
}
