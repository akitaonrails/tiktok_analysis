package X;

import com.ss.android.ugc.aweme.explore.assem.ExploreAssem;

/* JADX INFO: renamed from: X.0CWI, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.explore.assem.ExploreAssem", f = "ExploreAssem.kt", l = {152}, m = "prefetchHotCacheData")
public final class C0CWI extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ ExploreAssem LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CWI(ExploreAssem exploreAssem, InterfaceC1364105Vn<? super C0CWI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = exploreAssem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExploreAssem@2b83.prefetchHotCacheData$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBo = this.LLILLJJLI.bo(this);
        C1C7U.LIZIZ("ExploreAssem@2b83.prefetchHotCacheData$1");
        return objBo;
    }
}
