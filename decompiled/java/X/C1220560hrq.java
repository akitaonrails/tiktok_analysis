package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$fetchCommentList$1$1$2", f = "CommentListAssemVM.kt", l = {}, m = "invokeSuspend")
public final class C1220560hrq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1344210l5H LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ C1220590hrt LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1220590hrt>> LLIZLLLIL;
    public final /* synthetic */ int LLJ;
    public final /* synthetic */ CommentItemList LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1220560hrq(C1344210l5H c1344210l5H, boolean z, String str, String str2, C1220590hrt c1220590hrt, String str3, String str4, InterfaceC1364105Vn<? super AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn, int i, CommentItemList commentItemList, InterfaceC1364105Vn<? super C1220560hrq> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = c1344210l5H;
        this.LLILLJJLI = z;
        this.LLILLL = str;
        this.LLILZ = str2;
        this.LLILZIL = c1220590hrt;
        this.LLILZLL = str3;
        this.LLIZ = str4;
        this.LLIZLLLIL = interfaceC1364105Vn;
        this.LLJ = i;
        this.LLJI = commentItemList;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1220560hrq(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("CommentSortListVM@b6be.fetchCommentList$1$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (this.LL.LJIJ()) {
            C1344210l5H c1344210l5H = this.LL;
            CommentItemList commentItemList = new CommentItemList();
            commentItemList.mockEmptyCommentResponse();
            c1344210l5H.LJJI(commentItemList, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, EnumC1220570hrr.DEFAULT.getValue(), this.LLJ);
        } else if (this.LLJI != null) {
            this.LL.LJJI(this.LLJI, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, this.LLIZLLLIL, EnumC1220570hrr.DEFAULT.getValue(), this.LLJ);
        } else {
            this.LL.LJJ(new C1494450ozb(), this.LLILLJJLI, this.LLIZLLLIL, this.LLILZ, this.LLJ);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentSortListVM@b6be.fetchCommentList$1$1$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
