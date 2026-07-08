package X;

import com.ss.android.ugc.aweme.notice.api.bean.EntranceCount;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;

/* JADX INFO: renamed from: X.0zcP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1902910zcP implements IEvent {
    public final List<EntranceCount> LIZ;
    public final Long LIZIZ;

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

    public C1902910zcP(List<EntranceCount> list, Long l) {
        this.LIZ = list;
        this.LIZIZ = l;
    }
}
