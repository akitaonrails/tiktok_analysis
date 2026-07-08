package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0uw6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.home.usecase.GetPiListUseCase", f = "GetPiListUseCase.kt", l = {61, BaseNotice.CREATOR, 69}, m = "serialRequest")
public final class C1722920uw6 extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public AbstractC1623806Xk LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ C1722900uw4 LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1722920uw6(C1722900uw4 c1722900uw4, InterfaceC1364105Vn<? super C1722920uw6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = c1722900uw4;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GetPiListUseCase@6b87.serialRequest$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLIZIZ = this.LLILZIL.LIZIZ(null, this);
        C1C7U.LIZIZ("GetPiListUseCase@6b87.serialRequest$1");
        return objLIZIZ;
    }
}
