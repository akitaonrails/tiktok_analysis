package X;

import com.ss.android.ugc.aweme.tako.TakoServiceImpl;

/* JADX INFO: renamed from: X.14Ev, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.TakoServiceImpl", f = "TakoServiceImpl.kt", l = {677, 685}, m = "initTakoConversationId")
public final class C20233114Ev extends AbstractC23140094w {
    public EnumC19389610tS LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ TakoServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20233114Ev(TakoServiceImpl takoServiceImpl, InterfaceC1364105Vn<? super C20233114Ev> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = takoServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TakoServiceImpl@d56d.initTakoConversationId$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJZL = this.LLILZ.LJZL(null, this);
        C1C7U.LIZIZ("TakoServiceImpl@d56d.initTakoConversationId$1");
        return objLJZL;
    }
}
