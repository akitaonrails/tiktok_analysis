package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068T, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$dismissNoticeWithIds$1$1", f = "BaseSingleChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C068T extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ EnumC1596306Mv[] LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C068T(EnumC1596306Mv[] enumC1596306MvArr, InterfaceC1364105Vn<? super C068T> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = enumC1596306MvArr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C068T c068t = new C068T(this.LLILLJJLI, interfaceC1364105Vn);
        c068t.LL = obj;
        return c068t;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSingleChatNoticeViewModel@e9d5.dismissNoticeWithIds$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C06OO c06oo = (C06OO) this.LL;
        Boolean boolValueOf = Boolean.valueOf(C13LQ.LJIILLIIL(c06oo.LIZ, this.LLILLJJLI));
        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.dismissNoticeWithIds$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
