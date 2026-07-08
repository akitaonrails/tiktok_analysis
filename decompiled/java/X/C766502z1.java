package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.02z1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C766502z1 implements IEvent {
    public final String LIZ;
    public final Object LIZIZ;
    public final String LIZJ;

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

    public C766502z1(String str, Object obj, String str2) {
        this.LIZ = str;
        this.LIZIZ = obj;
        this.LIZJ = str2;
    }
}
