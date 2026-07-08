package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Map;

/* JADX INFO: renamed from: X.05zf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1534905zf implements IEvent {
    public final long LIZ;
    public final Map<String, String> LIZIZ;

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

    public C1534905zf(long j, Map<String, String> map) {
        this.LIZ = j;
        this.LIZIZ = map;
    }
}
