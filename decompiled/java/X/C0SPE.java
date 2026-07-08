package X;

import android.os.Bundle;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0SPE, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SPE implements IEvent {
    public final int LIZ;
    public Bundle LIZIZ;
    public String LIZJ;
    public boolean LIZLLL;

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

    public C0SPE(int i) {
        this.LIZ = i;
    }

    public C0SPE(int i, int i2) {
        this.LIZ = i;
    }
}
