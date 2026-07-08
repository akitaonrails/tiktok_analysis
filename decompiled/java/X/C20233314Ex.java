package X;

import com.ss.android.ugc.aweme.tako.TakoServiceImpl;

/* JADX INFO: renamed from: X.14Ex, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl", f = "TakoServiceImpl.kt", l = {2200, 799}, m = "loadTakoConversation")
public final class C20233314Ex extends AbstractC23140094w {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ TakoServiceImpl LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20233314Ex(TakoServiceImpl takoServiceImpl, InterfaceC1364105Vn<? super C20233314Ex> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = takoServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoServiceImpl@d56d.loadTakoConversation$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLL = this.LLILLL.LL(null, this);
        C1C7U.LIZIZ("TakoServiceImpl@d56d.loadTakoConversation$1");
        return objLL;
    }
}
