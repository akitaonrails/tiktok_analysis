package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068H, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.GroupChatNoticeViewModel$onGetMessageEvent$1$3", f = "GroupChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C068H extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1509705vb LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C068H(C1509705vb c1509705vb, InterfaceC1364105Vn<? super C068H> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1509705vb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C068H c068h = new C068H(this.LLILLJJLI, interfaceC1364105Vn);
        c068h.LL = obj;
        return c068h;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatNoticeViewModel@b908.onGetMessageEvent$1$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(C1710406ms.LIZ((C06OO) this.LL, this.LLILLJJLI.LIZ));
        C1C7U.LIZIZ("GroupChatNoticeViewModel@b908.onGetMessageEvent$1$3");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
