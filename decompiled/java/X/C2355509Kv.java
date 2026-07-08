package X;

import com.ss.android.ugc.aweme.comment.model.CommentItemList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09Kv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commentv2.commentlist.viewmodel.CommentSortListVM$doLoadSpitData$1", f = "CommentListAssemVM.kt", l = {}, m = "invokeSuspend")
public final class C2355509Kv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C1344210l5H LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<CommentItemList> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C2355509Kv(C1344210l5H c1344210l5H, long j, AnonymousClass0957<? extends CommentItemList> anonymousClass0957, InterfaceC1364105Vn<? super C2355509Kv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c1344210l5H;
        this.LLILLJJLI = j;
        this.LLILLL = anonymousClass0957;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2355509Kv(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Exception {
        C1C7U.LIZ("CommentSortListVM@b6be.doLoadSpitData$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LJJIFFI(null, new C1220590hrt(this.LLILLJJLI, 0, null, this.LLILLL, null, 0, 54));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CommentSortListVM@b6be.doLoadSpitData$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
