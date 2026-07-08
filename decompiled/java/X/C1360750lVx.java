package X;

import Y.ACallableS22S2100000_21;
import com.ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.ss.android.ugc.aweme.detail.api.FeedPaginationControl;
import com.ss.android.ugc.aweme.detail.api.UpvoteFeedListResponse;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0lVx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1360750lVx extends AbstractC1255880imo<Aweme, UpvoteFeedListResponse> {
    public static final List<String> LLILLL = new ArrayList();
    public final FeedPaginationControl LL = new FeedPaginationControl(0, 8, null);
    public final List<Aweme> LLILLJJLI = new ArrayList();

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isDataEmpty() {
        T t = this.mData;
        return (t == 0 || !((UpvoteFeedListResponse) t).pagination.hasMore) && C086I.LIZIZ(this.LLILLJJLI);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        T t = this.mData;
        return t != 0 && ((UpvoteFeedListResponse) t).pagination.hasMore;
    }

    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return this.LLILLJJLI;
    }

    public static final void LJIIJ(List<? extends Aweme> list) {
        Iterator<? extends Aweme> it2 = list.iterator();
        while (it2.hasNext()) {
            ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).LLILLL(it2.next());
        }
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length >= 4) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0020, code lost:
    
        if (r0.hasMore != false) goto L35;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x001a  */
    @Override // X.AbstractC666100QAu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void handleData(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1360750lVx.handleData(java.lang.Object):void");
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS22S2100000_21(this, (String) objArr[1], (String) objArr[2], 0), 0);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        ((ArrayList) LLILLL).clear();
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS22S2100000_21(this, (String) objArr[1], (String) objArr[2], 0), 0);
    }
}
