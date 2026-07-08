package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0Sn3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@InterfaceC1294060jmO
public final class C731710Sn3 implements IEvent {
    public final String LIZ;
    public final int LIZIZ;
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

    public C731710Sn3(String str, int i, boolean z) {
        this.LIZ = str;
        this.LIZIZ = i;
        this.LIZJ = z;
    }
}
