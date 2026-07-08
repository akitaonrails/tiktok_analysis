package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$fetchCommentList$7", f = "CommentListAssemVM.kt", l = {739}, m = "invokeSuspend")
public final class C1220550hrp extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ CommentItemList LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ C1344210l5H LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ C1220590hrt LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ String LLJ;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1220590hrt>> LLJI;
    public final /* synthetic */ C118300cf LLJIJIL;
    public final /* synthetic */ int LLJILJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220550hrp(int i, CommentItemList commentItemList, C1220590hrt c1220590hrt, C1344210l5H c1344210l5H, String str, String str2, String str3, String str4, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1364105Vn interfaceC1364105Vn2, C118300cf c118300cf, boolean z) {
        super(2, interfaceC1364105Vn2);
        this.LLILLJJLI = commentItemList;
        this.LLILLL = str;
        this.LLILZ = c1344210l5H;
        this.LLILZIL = z;
        this.LLILZLL = str2;
        this.LLIZ = c1220590hrt;
        this.LLIZLLLIL = str3;
        this.LLJ = str4;
        this.LLJI = interfaceC1364105Vn;
        this.LLJIJIL = c118300cf;
        this.LLJILJIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        CommentItemList commentItemList = this.LLILLJJLI;
        String str = this.LLILLL;
        C1344210l5H c1344210l5H = this.LLILZ;
        boolean z = this.LLILZIL;
        String str2 = this.LLILZLL;
        return new C1220550hrp(this.LLJILJIL, commentItemList, this.LLIZ, c1344210l5H, str, str2, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn, this.LLJIJIL, z);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("CommentSortListVM@b6be.fetchCommentList$7");
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
            C1396050mQt c1396050mQt = C1396050mQt.LIZ;
            List<Comment> list = this.LLILLJJLI.items;
            String str = this.LLILLL;
            Aweme aweme = this.LLILZ.LJIILL;
            this.LL = 1;
            if (c1396050mQt.LIZIZ(list, str, aweme, this) == objLJFF) {
                C1C7U.LIZIZ("CommentSortListVM@b6be.fetchCommentList$7");
                return objLJFF;
            }
        }
        this.LLILZ.LJJI(this.LLILLJJLI, this.LLILZIL, this.LLILZLL, this.LLILLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL.element, this.LLJILJIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentSortListVM@b6be.fetchCommentList$7");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
