package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0QBU, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QBU implements IEvent {
    public final int LIZ;
    public final int LIZIZ;

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

    public C0QBU(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }
}
