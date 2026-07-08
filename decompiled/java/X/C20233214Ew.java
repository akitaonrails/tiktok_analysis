package X;

import com.ss.android.ugc.aweme.tako.TakoServiceImpl;

/* JADX INFO: renamed from: X.14Ew, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl", f = "TakoServiceImpl.kt", l = {630, 2205, 649}, m = "fetchTakoConversation")
public final class C20233214Ew extends AbstractC23140094w {
    public InterfaceC383701eN LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20233214Ew(TakoServiceImpl takoServiceImpl, InterfaceC1364105Vn<? super C20233214Ew> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = takoServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("TakoServiceImpl@d56d.fetchTakoConversation$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJII = this.LLILLL.LJII(this);
        C1C7U.LIZIZ("TakoServiceImpl@d56d.fetchTakoConversation$1");
        return objLJII;
    }
}
