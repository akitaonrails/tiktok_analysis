package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentResponse;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l6t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentPublishViewModel$publishComment$3$1$resp$1", f = "CommentPublishViewModel.kt", l = {365, 367}, m = "invokeSuspend")
public final class C1345210l6t extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CommentResponse>, Object> {
    public int LL;
    public final /* synthetic */ C1345120l6k LLILLJJLI;
    public final /* synthetic */ CommentPublishViewModel LLILLL;
    public final /* synthetic */ Comment LLILZ;
    public final /* synthetic */ Aweme LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1345210l6t(C1345120l6k c1345120l6k, CommentPublishViewModel commentPublishViewModel, Comment comment, Aweme aweme, InterfaceC1364105Vn<? super C1345210l6t> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1345120l6k;
        this.LLILLL = commentPublishViewModel;
        this.LLILZ = comment;
        this.LLILZIL = aweme;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1345210l6t(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0162  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1345210l6t.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CommentResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
