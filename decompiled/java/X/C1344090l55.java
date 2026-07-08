package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.perfmonitor.CommentPerfMonitorUtil;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l55, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$publishComment$4$3$1", f = "CommentPublishViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1344090l55 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ CommentPublishViewModel LL;
    public final /* synthetic */ C0O8X LLILLJJLI;
    public final /* synthetic */ Throwable LLILLL;
    public final /* synthetic */ Comment LLILZ;
    public final /* synthetic */ C259800zU<String> LLILZIL;
    public final /* synthetic */ long LLILZLL;
    public final /* synthetic */ Function1<Comment, Unit> LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1344090l55(CommentPublishViewModel commentPublishViewModel, C0O8X c0o8x, Throwable th, Comment comment, C259800zU<String> c259800zU, long j, Function1<? super Comment, Unit> function1, InterfaceC1364105Vn<? super C1344090l55> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = commentPublishViewModel;
        this.LLILLJJLI = c0o8x;
        this.LLILLL = th;
        this.LLILZ = comment;
        this.LLILZIL = c259800zU;
        this.LLILZLL = j;
        this.LLIZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1344090l55(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("CommentPublishViewModel@7f7.publishComment$4$3$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        CommentPerfMonitorUtil.LIZ.getClass();
        CommentPerfMonitorUtil.LIZIZ();
        CommentPublishViewModel commentPublishViewModel = this.LL;
        C0O8X c0o8x = this.LLILLJJLI;
        Throwable th = this.LLILLL;
        commentPublishViewModel.getClass();
        CommentPublishViewModel.LQ2(c0o8x, th);
        this.LL.DQ2(this.LLILLL, this.LLILZ, this.LLILZIL.element);
        C1222210huV.LIZIZ(System.currentTimeMillis() - this.LLILZLL, false);
        Function1<Comment, Unit> function1 = this.LLIZ;
        if (function1 != null) {
            function1.invoke(this.LLILZ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentPublishViewModel@7f7.publishComment$4$3$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
