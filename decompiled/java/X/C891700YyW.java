package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0YyW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C891700YyW implements IEvent {
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

    public C891700YyW(boolean z, String str, int i) {
        z = (i & 1) != 0 ? false : z;
        str = (i & 2) != 0 ? null : str;
        this.LIZ = z;
        this.LIZIZ = str;
    }
}
