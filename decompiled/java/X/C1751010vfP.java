package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0vfP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.compliance.utils.PassportHelper", f = "PassportHelper.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "isShowToast")
public final class C1751010vfP extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1750960vfK LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1751010vfP(C1750960vfK c1750960vfK, InterfaceC1364105Vn<? super C1751010vfP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1750960vfK;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("PassportHelper@b0c0.isShowToast$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZLLL = this.LLILLJJLI.LIZLLL(this);
        C1C7U.LIZIZ("PassportHelper@b0c0.isShowToast$1");
        return objLIZLLL;
    }
}
