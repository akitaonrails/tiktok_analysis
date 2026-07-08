package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0SYN, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SYN implements IEvent {
    public final String LIZ;
    public final boolean LIZIZ;
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

    public C0SYN(String str) {
        this.LIZIZ = true;
        this.LIZ = str;
        this.LIZJ = true;
    }

    public C0SYN(boolean z, String str) {
        this.LIZIZ = z;
        this.LIZ = str;
    }
}
