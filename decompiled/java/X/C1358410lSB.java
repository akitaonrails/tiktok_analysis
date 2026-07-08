package X;

import com.ss.android.ugc.aweme.feed.model.upvote.RepostReplyStruct;
import com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0lSB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.upvote.detail.replypanel.vm.RepostInteractListViewModel$deleteReply$1$2$1", f = "RepostInteractListViewModel.kt", l = {}, m = "invokeSuspend")
public final class C1358410lSB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ RepostInteractListViewModel LL;
    public final /* synthetic */ RepostReplyStruct LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1358410lSB(RepostInteractListViewModel repostInteractListViewModel, RepostReplyStruct repostReplyStruct, InterfaceC1364105Vn<? super C1358410lSB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = repostInteractListViewModel;
        this.LLILLJJLI = repostReplyStruct;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1358410lSB(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("RepostInteractListViewModel@3304.deleteReply$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.wQ2(this.LLILLJJLI.replyId, false);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("RepostInteractListViewModel@3304.deleteReply$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
