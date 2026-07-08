package X;

import android.content.Intent;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0lPb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1356810lPb implements IEvent {
    public final Intent LIZ;

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

    public C1356810lPb(Intent intent) {
        this.LIZ = intent;
    }
}
