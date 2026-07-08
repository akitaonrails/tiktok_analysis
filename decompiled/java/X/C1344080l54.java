package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l54, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$publishComment$4", f = "CommentPublishViewModel.kt", l = {430, 499, 548}, m = "invokeSuspend")
public final class C1344080l54 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1345120l6k LLILLL;
    public final /* synthetic */ CommentPublishViewModel LLILZ;
    public final /* synthetic */ Comment LLILZIL;
    public final /* synthetic */ C259800zU<String> LLILZLL;
    public final /* synthetic */ Aweme LLIZ;
    public final /* synthetic */ C0O8X LLIZLLLIL;
    public final /* synthetic */ long LLJ;
    public final /* synthetic */ Boolean LLJI;
    public final /* synthetic */ Function1<Comment, Unit> LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1344080l54(C1345120l6k c1345120l6k, CommentPublishViewModel commentPublishViewModel, Comment comment, C259800zU<String> c259800zU, Aweme aweme, C0O8X c0o8x, long j, Boolean bool, Function1<? super Comment, Unit> function1, InterfaceC1364105Vn<? super C1344080l54> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1345120l6k;
        this.LLILZ = commentPublishViewModel;
        this.LLILZIL = comment;
        this.LLILZLL = c259800zU;
        this.LLIZ = aweme;
        this.LLIZLLLIL = c0o8x;
        this.LLJ = j;
        this.LLJI = bool;
        this.LLJIJIL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1344080l54 c1344080l54 = new C1344080l54(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
        c1344080l54.LLILLJJLI = obj;
        return c1344080l54;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00b7  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1344080l54.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
