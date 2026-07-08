package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import defpackage.AdvertiserModel;

/* JADX INFO: renamed from: X.0TQQ, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TQQ implements IEvent {
    public final AdvertiserModel LIZ;

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

    public C0TQQ(AdvertiserModel advertiserModel) {
        this.LIZ = advertiserModel;
    }
}
