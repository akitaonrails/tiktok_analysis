package X;

import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.15xs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20691015xs implements IEvent {
    public static final Map<String, Integer> LIZIZ = new LinkedHashMap();
    public static String LIZJ = "unknown";
    public final int LIZ;

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

    public C20691015xs(int i) {
        this.LIZ = i;
    }
}
