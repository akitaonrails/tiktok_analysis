package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$fetchCommentList$8$2$1", f = "CommentListAssemVM.kt", l = {}, m = "invokeSuspend")
public final class C1220490hrj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1344210l5H LL;
    public final /* synthetic */ CommentItemList LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ C1220590hrt LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1220590hrt>> LLJ;
    public final /* synthetic */ C118300cf LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1220490hrj(int i, CommentItemList commentItemList, C1220590hrt c1220590hrt, C1344210l5H c1344210l5H, String str, String str2, String str3, String str4, InterfaceC1364105Vn interfaceC1364105Vn, InterfaceC1364105Vn interfaceC1364105Vn2, C118300cf c118300cf, boolean z) {
        super(2, interfaceC1364105Vn2);
        this.LL = c1344210l5H;
        this.LLILLJJLI = commentItemList;
        this.LLILLL = z;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = c1220590hrt;
        this.LLIZ = str3;
        this.LLIZLLLIL = str4;
        this.LLJ = interfaceC1364105Vn;
        this.LLJI = c118300cf;
        this.LLJIJIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1344210l5H c1344210l5H = this.LL;
        CommentItemList commentItemList = this.LLILLJJLI;
        boolean z = this.LLILLL;
        String str = this.LLILZ;
        String str2 = this.LLILZIL;
        return new C1220490hrj(this.LLJIJIL, commentItemList, this.LLILZLL, c1344210l5H, str, str2, this.LLIZ, this.LLIZLLLIL, this.LLJ, interfaceC1364105Vn, this.LLJI, z);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("CommentSortListVM@b6be.fetchCommentList$8$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJI(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI.element, this.LLJIJIL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentSortListVM@b6be.fetchCommentList$8$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
