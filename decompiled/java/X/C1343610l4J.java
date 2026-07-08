package X;

import com.ss.android.ugc.aweme.comment.model.BaseCommentResponse;
import com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0l4J, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentDeleteVM$deleteComment$1$1$resp$1", f = "CommentDeleteVM.kt", l = {194}, m = "invokeSuspend")
public final class C1343610l4J extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super BaseCommentResponse>, Object> {
    public int LL;
    public final /* synthetic */ CommentDeleteVM LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1343610l4J(CommentDeleteVM commentDeleteVM, String str, int i, int i2, InterfaceC1364105Vn<? super C1343610l4J> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentDeleteVM;
        this.LLILLL = str;
        this.LLILZ = i;
        this.LLILZIL = i2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1343610l4J(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentDeleteVM@9d4.deleteComment$1$1$resp$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0S28 c0s28 = (C0S28) this.LLILLJJLI.LLILLL.getValue().getOperator();
            String str = this.LLILLL;
            int i2 = this.LLILZ;
            int i3 = this.LLILZIL;
            this.LL = 1;
            obj = c0s28.LJJIJLIJ(i2, i3, str, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentDeleteVM@9d4.deleteComment$1$1$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentDeleteVM@9d4.deleteComment$1$1$resp$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super BaseCommentResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
