package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.lemon.comment.viewmodel.CommentListAssemVM$fetchCommentList$1$1$resp$1", f = "CommentListAssemVM.kt", l = {177}, m = "invokeSuspend")
public final class C1220470hrh extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super CommentItemList>, Object> {
    public int LL;
    public final /* synthetic */ CommentListAssemVM LLILLJJLI;
    public final /* synthetic */ C1342550l2b LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220470hrh(CommentListAssemVM commentListAssemVM, C1342550l2b c1342550l2b, int i, InterfaceC1364105Vn<? super C1220470hrh> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = commentListAssemVM;
        this.LLILLL = c1342550l2b;
        this.LLILZ = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1220470hrh(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String aid;
        String aid2;
        C1C7U.LIZ("CommentListAssemVM@3a88.fetchCommentList$1$1$resp$1");
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
            InterfaceC1220480hri interfaceC1220480hri = (InterfaceC1220480hri) this.LLILLJJLI.LLILZLL.getValue().getOperator();
            Aweme aweme = this.LLILLJJLI.LLILZIL;
            String authorUid = null;
            if (aweme != null) {
                aid = aweme.getAid();
            } else {
                aid = null;
            }
            Aweme aweme2 = this.LLILLJJLI.LLILZIL;
            if (aweme2 != null) {
                aid2 = aweme2.getAid();
            } else {
                aid2 = null;
            }
            Aweme aweme3 = this.LLILLJJLI.LLILZIL;
            if (aweme3 != null) {
                authorUid = AwemeExtKt.getAuthorUid(aweme3);
            }
            C1353000lJS c1353000lJS = new C1353000lJS(aid, C2286608xc.LJ(this.LLILZ), aid2, authorUid, C2286608xc.LJFF(this.LLILLL.LIZ));
            this.LL = 1;
            obj = interfaceC1220480hri.H(c1353000lJS, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CommentListAssemVM@3a88.fetchCommentList$1$1$resp$1");
                return objLJFF;
            }
        }
        C1C7U.LIZIZ("CommentListAssemVM@3a88.fetchCommentList$1$1$resp$1");
        return obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super CommentItemList> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
