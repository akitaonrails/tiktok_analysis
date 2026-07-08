package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0hrc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$fetchCommentList$1$2$1", f = "CommentListAssemVM.kt", l = {}, m = "invokeSuspend")
public final class C1220420hrc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1344210l5H LL;
    public final /* synthetic */ Throwable LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ InterfaceC1364105Vn<AbstractC316870CbV<C1220590hrt>> LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1220420hrc(C1344210l5H c1344210l5H, Throwable th, boolean z, InterfaceC1364105Vn<? super AbstractC316870CbV<C1220590hrt>> interfaceC1364105Vn, String str, int i, InterfaceC1364105Vn<? super C1220420hrc> interfaceC1364105Vn2) {
        super(2, interfaceC1364105Vn2);
        this.LL = c1344210l5H;
        this.LLILLJJLI = th;
        this.LLILLL = z;
        this.LLILZ = interfaceC1364105Vn;
        this.LLILZIL = str;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1220420hrc(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("CommentSortListVM@b6be.fetchCommentList$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJ(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentSortListVM@b6be.fetchCommentList$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
