package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0O9N, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0O9N implements IEvent {
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

    public C0O9N(String str, boolean z) {
        this.LIZ = str;
        this.LIZIZ = z;
    }
}
