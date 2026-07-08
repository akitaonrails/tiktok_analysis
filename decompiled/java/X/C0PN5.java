package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;

/* JADX INFO: renamed from: X.0PN5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PN5 extends AbstractC1588960rS2<Aweme, Object> implements C0PDP {
    public final List<Aweme> LL;

    @Override // X.AbstractC666100QAu
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    @Override // X.AbstractC1255880imo
    public final boolean isHasMore() {
        return false;
    }

    @Override // X.AbstractC1255880imo
    public final void loadMoreList(Object... objArr) {
    }

    @Override // X.AbstractC1255880imo
    public final void refreshList(Object... objArr) {
    }

    @Override // X.C0PDP
    public final List<Aweme> getAwemeList() {
        return this.LL;
    }

    @Override // X.AbstractC1255880imo
    public final List<Aweme> getItems() {
        return this.LL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C0PN5(List<? extends Aweme> list) {
        this.LL = list;
    }
}
