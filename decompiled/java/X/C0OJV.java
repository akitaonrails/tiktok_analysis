package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0OJV, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OJV implements IEvent {
    public final long LIZ;
    public final long LIZIZ;
    public final int LIZJ;
    public final Long LIZLLL;
    public final String LJ;

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

    public C0OJV(long j, long j2, String str, Long l, int i) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = i;
        this.LIZLLL = l;
        this.LJ = str;
    }
}
