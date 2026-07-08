package X;

import com.ss.android.ugc.aweme.liveevent.LiveEventModule;
import com.ss.android.ugc.aweme.liveevent.LiveEventResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.1123, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1123 extends AbstractC1255880imo<Object, LiveEventResponse> {
    public final List<Object> LL = new ArrayList();
    public final List<LiveEventModule> LLILLJJLI = new ArrayList();

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        return false;
    }

    public AnonymousClass1123() {
        new ArrayList();
    }

    @Override // X.AbstractC1255880imo
    public final List<Object> getItems() {
        return this.LL;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 1) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        LiveEventResponse liveEventResponse = (LiveEventResponse) obj;
        if (liveEventResponse != null) {
            if (this.mListQueryType == 1) {
                ((ArrayList) this.LLILLJJLI).clear();
                ((ArrayList) this.LL).clear();
                ((ArrayList) this.LLILLJJLI).addAll(liveEventResponse.eventList);
            }
            ((ArrayList) this.LL).addAll(this.LLILLJJLI);
        }
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        C1BVK.LIZIZ().LIZ(this.mHandler, CallableC1430610nKd.LL, 0);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        C1BVK.LIZIZ().LIZ(this.mHandler, CallableC1430610nKd.LL, 0);
    }
}
