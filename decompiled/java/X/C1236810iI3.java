package X;

import com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi;

/* JADX INFO: renamed from: X.0iI3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi", f = "TwoStepAuthApi.kt", l = {238}, m = "getAvailableWaysForHL")
public final class C1236810iI3 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TwoStepAuthApi LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1236810iI3(TwoStepAuthApi twoStepAuthApi, InterfaceC1364105Vn<? super C1236810iI3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = twoStepAuthApi;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TwoStepAuthApi@9f72.getAvailableWaysForHL$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(null, null, this);
        C1C7U.LIZIZ("TwoStepAuthApi@9f72.getAvailableWaysForHL$1");
        return objLIZLLL;
    }
}
