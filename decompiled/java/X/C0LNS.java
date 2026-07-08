package X;

import com.ss.android.ugc.aweme.aigc.NavigateServiceImpl;

/* JADX INFO: renamed from: X.0LNS, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.NavigateServiceImpl", f = "NavigateServiceImpl.kt", l = {68}, m = "checkNavigationEnable")
public final class C0LNS extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ NavigateServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LNS(NavigateServiceImpl navigateServiceImpl, InterfaceC1364105Vn<? super C0LNS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = navigateServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("NavigateServiceImpl@832b.checkNavigationEnable$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILLJJLI.LJ(null, null, this);
        C1C7U.LIZIZ("NavigateServiceImpl@832b.checkNavigationEnable$1");
        return objLJ;
    }
}
