package X;

import Y.ACallableS9S1101000_29;
import com.ss.android.ugc.aweme.api.model.AnchorCell;
import com.ss.android.ugc.aweme.api.resp.AnchorSearchResponse;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.118I, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C118I extends AbstractC1255880imo<AnchorCell, AnchorSearchResponse> {
    public final int LL;
    public final List<AnchorCell> LLILLJJLI = new ArrayList();
    public int LLILLL;
    public boolean LLILZ;

    @Override // X.AbstractC1255880imo
    public final List<AnchorCell> getItems() {
        return this.LLILLJJLI;
    }

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        return this.LLILZ;
    }

    public C118I(int i) {
        this.LL = i;
    }

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        if (objArr.length == 2) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC666100QAu
    public final void handleData(Object obj) {
        AnchorSearchResponse anchorSearchResponse = (AnchorSearchResponse) obj;
        if (anchorSearchResponse != null) {
            if (this.mListQueryType == 1) {
                ((ArrayList) this.LLILLJJLI).clear();
            }
            List<AnchorCell> list = anchorSearchResponse.cells;
            if (list != null && !list.isEmpty()) {
                this.LLILZ = anchorSearchResponse.enableLoadMore;
                ((ArrayList) this.LLILLJJLI).addAll(anchorSearchResponse.cells);
                this.LLILLL++;
                return;
            }
            this.LLILZ = false;
            ((ArrayList) this.LLILLJJLI).clear();
        }
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS9S1101000_29(this.LLILLL, this, (String) objArr[1], 2), 0);
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
        C1BVK.LIZIZ().LIZ(this.mHandler, new ACallableS9S1101000_29(0, this, (String) objArr[1], 2), 0);
    }
}
