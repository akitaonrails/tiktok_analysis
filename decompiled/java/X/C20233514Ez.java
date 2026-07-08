package X;

import com.ss.android.ugc.aweme.tako.TakoServiceImpl;

/* JADX INFO: renamed from: X.14Ez, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl", f = "TakoServiceImpl.kt", l = {839}, m = "runTakoBackgroundInit")
public final class C20233514Ez extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TakoServiceImpl LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20233514Ez(TakoServiceImpl takoServiceImpl, InterfaceC1364105Vn<? super C20233514Ez> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = takoServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoServiceImpl@d56d.runTakoBackgroundInit$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIJLIJ = this.LLILLJJLI.LJJIJLIJ(this);
        C1C7U.LIZIZ("TakoServiceImpl@d56d.runTakoBackgroundInit$1");
        return objLJJIJLIJ;
    }
}
