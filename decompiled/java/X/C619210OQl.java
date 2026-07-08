package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Map;

/* JADX INFO: renamed from: X.0OQl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C619210OQl implements IEvent {
    public final long LIZ;
    public final long LIZIZ;
    public final Map<String, Object> LIZJ;

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

    public C619210OQl(long j, long j2, Map<String, ? extends Object> map) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = map;
    }
}
