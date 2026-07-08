package X;

import com.ss.android.ugc.aweme.share.SystemShareActivity;

/* JADX INFO: renamed from: X.1B48, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
@C09DV(c = "com.ss.android.ugc.aweme.share.SystemShareActivity", f = "SystemShareActivity.kt", l = {1414}, m = "getScopeResponse")
public final class C1B48 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ SystemShareActivity LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1B48(SystemShareActivity systemShareActivity, InterfaceC1364105Vn<? super C1B48> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = systemShareActivity;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SystemShareActivity@a089.getScopeResponse$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLLLLZLL = this.LLILLJJLI.LLLLZLL(this);
        C1C7U.LIZIZ("SystemShareActivity@a089.getScopeResponse$1");
        return objLLLLZLL;
    }
}
