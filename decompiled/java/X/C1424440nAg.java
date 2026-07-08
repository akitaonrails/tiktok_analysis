package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.ss.android.ugc.aweme.search.pages.sug.core.model.SearchSugResponse;

/* JADX INFO: renamed from: X.0nAg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.creation.template.square.datesoruce.TemplateSearchSugDataSource", f = "TemplateSearchSugDataSource.kt", l = {110, BaseNotice.RECOMMEND_LIVE, 120}, m = "fetchSug")
public final class C1424440nAg extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C1DEV LLILLL;
    public SearchSugResponse LLILZ;
    public long LLILZIL;
    public /* synthetic */ Object LLILZLL;
    public final /* synthetic */ C1424430nAf LLIZ;
    public int LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1424440nAg(C1424430nAf c1424430nAf, InterfaceC1364105Vn<? super C1424440nAg> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZ = c1424430nAf;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TemplateSearchSugDataSource@49e0.fetchSug$1");
        this.LLILZLL = obj;
        this.LLIZLLLIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZ.LIZ(null, null, this);
        C1C7U.LIZIZ("TemplateSearchSugDataSource@49e0.fetchSug$1");
        return objLIZ;
    }
}
