package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.search.performance.core.utils.SearchLandingPagePreloadHelper;

/* JADX INFO: renamed from: X.0PB7, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.performance.core.utils.SearchLandingPagePreloadHelper", f = "SearchLandingPagePreloadHelper.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "preload")
public final class C0PB7 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ SearchLandingPagePreloadHelper LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0PB7(SearchLandingPagePreloadHelper searchLandingPagePreloadHelper, InterfaceC1364105Vn<? super C0PB7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = searchLandingPagePreloadHelper;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SearchLandingPagePreloadHelper@c853.preload$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLL.LIZIZ(0L, null, this);
        C1C7U.LIZIZ("SearchLandingPagePreloadHelper@c853.preload$1");
        return objLIZIZ;
    }
}
