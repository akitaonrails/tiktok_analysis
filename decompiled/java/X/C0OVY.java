package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Map;

/* JADX INFO: renamed from: X.0OVY, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OVY implements IEvent {
    public final long LIZ;
    public final int LIZIZ;
    public final Map<String, Object> LIZJ;
    public final Map<String, Object> LIZLLL;

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

    public C0OVY(long j, int i, Map map, Map map2) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = map;
        this.LIZLLL = map2;
    }
}
