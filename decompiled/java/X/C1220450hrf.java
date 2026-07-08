package X;

import com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM$fetchCommentList$1$3$1", f = "CommentListAssemVM.kt", l = {}, m = "invokeSuspend")
public final class C1220450hrf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentListAssemVM LL;
    public final /* synthetic */ Throwable LLILLJJLI;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1342550l2b>> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1220450hrf(CommentListAssemVM commentListAssemVM, Throwable th, InterfaceC1364105Vn<? super AbstractC316870CbV<C1342550l2b>> interfaceC1364105Vn, InterfaceC1364105Vn<? super C1220450hrf> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = commentListAssemVM;
        this.LLILLJJLI = th;
        this.LLILLL = interfaceC1364105Vn;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1220450hrf(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentListAssemVM@3a88.fetchCommentList$1$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.yQ2(this.LLILLJJLI, this.LLILLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentListAssemVM@3a88.fetchCommentList$1$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
