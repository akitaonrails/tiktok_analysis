package X;

import X.AbstractC1223200hw6;
import com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel;

/* JADX INFO: renamed from: X.0hw4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.compliance.privacy.checkup.relation.base.BaseCheckupRelationViewModel", f = "BaseCheckupRelationViewModel.kt", l = {54}, m = "onLoadMore$suspendImpl")
public final class C1223180hw4<S, B extends AbstractC1223200hw6<S>> extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ BaseCheckupRelationViewModel<S, B> LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223180hw4(BaseCheckupRelationViewModel<S, B> baseCheckupRelationViewModel, InterfaceC1364105Vn<? super C1223180hw4> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = baseCheckupRelationViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseCheckupRelationViewModel@6eb9.onLoadMore$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objWQ2 = BaseCheckupRelationViewModel.wQ2(this.LLILLJJLI, null, this);
        C1C7U.LIZIZ("BaseCheckupRelationViewModel@6eb9.onLoadMore$1");
        return objWQ2;
    }
}
