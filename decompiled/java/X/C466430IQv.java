package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0IQv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C466430IQv implements IEvent {
    public final C00Y7 LIZ;

    public C466430IQv() {
        this(0);
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

    public /* synthetic */ C466430IQv(int i) {
        this(C00Y7.DEFAULT);
    }

    public C466430IQv(C00Y7 c00y7) {
        this.LIZ = c00y7;
    }
}
