package X;

import com.ss.android.ugc.aweme.inbox.bulletin.data.item.BulletinBaseItem;
import com.ss.android.ugc.aweme.notice.repo.list.bean.SingleBulletinItemCreateInfo;
import com.ss.android.ugc.governance.eventbus.IEvent;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0OOD, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OOD implements IEvent {
    public final long LIZ;
    public final List<SingleBulletinItemCreateInfo> LIZIZ;
    public final List<BulletinBaseItem> LIZJ;
    public final Map<String, String> LIZLLL;
    public final boolean LJ;

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

    public C0OOD(long j, List list, List list2, Map map, boolean z) {
        this.LIZ = j;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = map;
        this.LJ = z;
    }
}
