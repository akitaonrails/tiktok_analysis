package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0w9C, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1769480w9C implements IEvent {
    public final C1770080wAA LIZ;
    public final EnumC1769010w8R LIZIZ;

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

    public C1769480w9C(C1770080wAA c1770080wAA, EnumC1769010w8R enumC1769010w8R) {
        this.LIZ = c1770080wAA;
        this.LIZIZ = enumC1769010w8R;
    }
}
