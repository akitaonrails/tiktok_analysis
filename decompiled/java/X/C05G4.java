package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.05G4, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.creatorcenter.InspirationSetting", f = "InspirationSetting.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "isCheckSuspend")
public final class C05G4 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1891120zJO LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05G4(C1891120zJO c1891120zJO, InterfaceC1364105Vn<? super C05G4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1891120zJO;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("InspirationSetting@a510.isCheckSuspend$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILLJJLI.LIZIZ(this);
        C1C7U.LIZIZ("InspirationSetting@a510.isCheckSuspend$1");
        return objLIZIZ;
    }
}
