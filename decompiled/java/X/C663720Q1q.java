package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0Q1q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C663720Q1q implements IEvent {
    public final String LIZ;
    public final int LIZIZ;
    public final long LIZJ;
    public final String LIZLLL;

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

    public C663720Q1q(int i, String str, long j, String str2) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = j;
        this.LIZLLL = str2;
    }
}
