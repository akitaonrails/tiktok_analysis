package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.160R, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C160R implements IEvent {
    public final String LIZ;
    public final EnumC1390800mIQ LIZIZ;

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

    public C160R(String str, EnumC1390800mIQ enumC1390800mIQ) {
        this.LIZ = str;
        this.LIZIZ = enumC1390800mIQ;
    }
}
