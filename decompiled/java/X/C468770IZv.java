package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0IZv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C468770IZv implements IEvent {
    public final Long LIZ;
    public final Long LIZIZ;
    public final Long LIZJ;
    public final int LIZLLL;

    public C468770IZv() {
        this(null, null, null, 0, 15);
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

    public C468770IZv(Long l, Long l2, Long l3, int i, int i2) {
        l = (i2 & 1) != 0 ? null : l;
        l2 = (i2 & 2) != 0 ? null : l2;
        l3 = (i2 & 4) != 0 ? null : l3;
        i = (i2 & 8) != 0 ? 0 : i;
        this.LIZ = l;
        this.LIZIZ = l2;
        this.LIZJ = l3;
        this.LIZLLL = i;
    }
}
