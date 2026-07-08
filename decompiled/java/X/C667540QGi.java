package X;

import com.ss.android.ugc.aweme.search.model.SearchHistory;
import com.ss.android.ugc.governance.eventbus.IEvent;

/* JADX INFO: renamed from: X.0QGi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C667540QGi implements IEvent {
    public final int LIZ;
    public final SearchHistory LIZIZ;

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

    public C667540QGi(int i, SearchHistory searchHistory) {
        this.LIZ = i;
        this.LIZIZ = searchHistory;
    }
}
