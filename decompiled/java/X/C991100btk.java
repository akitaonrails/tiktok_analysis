package X;

import com.ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.Map;

/* JADX INFO: renamed from: X.0btk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C991100btk implements IEvent {
    public final Map<String, AwemeStatisticsBackup> LIZ;
    public final int LIZIZ;

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

    public C991100btk(int i, Map map) {
        this.LIZ = map;
        this.LIZIZ = i;
    }
}
