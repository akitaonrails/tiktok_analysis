package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0QQW, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QQW implements IEvent {
    public final EnumC667250QFf LIZ;

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

    public C0QQW(EnumC667250QFf enumC667250QFf) {
        this.LIZ = enumC667250QFf;
    }
}
