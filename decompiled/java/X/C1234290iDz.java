package X;

import android.content.Context;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0iDz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1234290iDz implements IEvent {
    public final Context LIZ;
    public final InterfaceC1369790lkX LIZIZ;

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

    public C1234290iDz(Context context, InterfaceC1369790lkX interfaceC1369790lkX) {
        this.LIZ = context;
        this.LIZIZ = interfaceC1369790lkX;
    }
}
