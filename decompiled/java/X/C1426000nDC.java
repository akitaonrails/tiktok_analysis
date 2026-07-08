package X;

import com.ss.android.ugc.aweme.editeffect.search.middleware.sug.SearchSugResponse;

/* JADX INFO: renamed from: X.0nDC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.editeffect.search.middleware.sug.EditEffectSearchSugRepo", f = "EditEffectSearchSugRepo.kt", l = {104, 31, 114}, m = "fetchSug")
public final class C1426000nDC extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public C1DEV LLILLL;
    public SearchSugResponse LLILZ;
    public long LLILZIL;
    public long LLILZLL;
    public /* synthetic */ Object LLIZ;
    public final /* synthetic */ C1425990nDB LLIZLLLIL;
    public int LLJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1426000nDC(C1425990nDB c1425990nDB, InterfaceC1364105Vn<? super C1426000nDC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLIZLLLIL = c1425990nDB;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EditEffectSearchSugRepo@f1d9.fetchSug$1");
        this.LLIZ = obj;
        this.LLJ |= Integer.MIN_VALUE;
        Object objLIZ = this.LLIZLLLIL.LIZ(null, null, this);
        C1C7U.LIZIZ("EditEffectSearchSugRepo@f1d9.fetchSug$1");
        return objLIZ;
    }
}
