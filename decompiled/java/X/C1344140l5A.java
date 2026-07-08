package X;

import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l5A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$publishComment$2$2$1", f = "CommentPublishViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1344140l5A extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentPublishViewModel LL;
    public final /* synthetic */ C1345120l6k LLILLJJLI;
    public final /* synthetic */ C0O8X LLILLL;
    public final /* synthetic */ CommentResponse LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1344140l5A(CommentPublishViewModel commentPublishViewModel, C1345120l6k c1345120l6k, C0O8X c0o8x, CommentResponse commentResponse, InterfaceC1364105Vn<? super C1344140l5A> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentPublishViewModel;
        this.LLILLJJLI = c1345120l6k;
        this.LLILLL = c0o8x;
        this.LLILZ = commentResponse;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1344140l5A(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentPublishViewModel@7f7.publishComment$2$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.GQ2(this.LLILLJJLI, true, false, 0);
        CommentPublishViewModel commentPublishViewModel = this.LL;
        C0O8X c0o8x = this.LLILLL;
        CommentResponse commentResponse = this.LLILZ;
        commentPublishViewModel.getClass();
        CommentPublishViewModel.KQ2(c0o8x, commentResponse);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentPublishViewModel@7f7.publishComment$2$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
