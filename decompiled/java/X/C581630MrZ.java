package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0MrZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C581630MrZ implements IEvent {
    public final int LIZ;
    public String LIZIZ;
    public String LIZJ;

    public C581630MrZ() {
        throw null;
    }

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

    public C581630MrZ(Object obj) {
        this.LIZ = 8;
    }

    public C581630MrZ(int i) {
        this(i, 0);
    }

    public C581630MrZ(int i, String str) {
        this.LIZ = i;
        this.LIZIZ = str;
    }

    public C581630MrZ(int i, int i2) {
        this.LIZ = i;
    }
}
