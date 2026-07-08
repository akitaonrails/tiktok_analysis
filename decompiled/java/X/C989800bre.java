package X;

import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0bre, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C989800bre implements IEvent {
    public final boolean LIZ;

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

    public C989800bre(boolean z) {
        this.LIZ = z;
    }
}
