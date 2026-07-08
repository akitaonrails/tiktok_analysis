package X;

import com.ss.android.ugc.aweme.lemon.postmode.ui.fragment.Lemon8PostCommentListFragment;
import com.ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Tcq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lemon.postmode.ui.fragment.Lemon8PostCommentListFragment$observe$2$1$1$1", f = "Lemon8PostCommentListFragment.kt", l = {}, m = "invokeSuspend")
public final class C750860Tcq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Lemon8PostCommentListFragment LL;
    public final /* synthetic */ C1355860lO4 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C750860Tcq(Lemon8PostCommentListFragment lemon8PostCommentListFragment, C1355860lO4 c1355860lO4, InterfaceC1364105Vn<? super C750860Tcq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = lemon8PostCommentListFragment;
        this.LLILLJJLI = c1355860lO4;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C750860Tcq(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("Lemon8PostCommentListFragment@54ef.observe$2$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        WrapLinearLayoutManager wrapLinearLayoutManager = this.LL.LLJ;
        if (wrapLinearLayoutManager != null) {
            wrapLinearLayoutManager.startSmoothScroll(this.LLILLJJLI);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("Lemon8PostCommentListFragment@54ef.observe$2$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
