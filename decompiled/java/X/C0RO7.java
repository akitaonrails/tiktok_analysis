package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0RO7, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RO7 implements IEvent {
    public final boolean LIZ;
    public final String LIZIZ;
    public final boolean LIZJ;

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

    public C0RO7(boolean z, String str, boolean z2) {
        this.LIZ = z;
        this.LIZIZ = str;
        this.LIZJ = z2;
    }
}
