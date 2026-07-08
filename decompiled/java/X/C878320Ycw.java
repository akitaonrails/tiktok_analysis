package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ycw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.revamp.common.datasource.conversation.ChatListConversationDataSource$solvePreloadResult$1$1$1", f = "ChatListConversationDataSource.kt", l = {}, m = "invokeSuspend")
public final class C878320Ycw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C878460YdA LL;
    public final /* synthetic */ C0Y6X LLILLJJLI;
    public final /* synthetic */ C878470YdB LLILLL;
    public final /* synthetic */ C0Y6P LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C878320Ycw(C0Y6P c0y6p, C0Y6X c0y6x, C878460YdA c878460YdA, C878470YdB c878470YdB, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c878460YdA;
        this.LLILLJJLI = c0y6x;
        this.LLILLL = c878470YdB;
        this.LLILZ = c0y6p;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C878460YdA c878460YdA = this.LL;
        return new C878320Ycw(this.LLILZ, this.LLILLJJLI, c878460YdA, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ChatListConversationDataSource@6f28.solvePreloadResult$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LIZIZ(this.LLILLJJLI, this.LLILLL, this.LLILZ);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ChatListConversationDataSource@6f28.solvePreloadResult$1$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
