package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068P, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$onGetMessageEvent$1$2", f = "BaseSingleChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C068P extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C068P(InterfaceC1364105Vn<? super C068P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C068P c068p = new C068P(interfaceC1364105Vn);
        c068p.LL = obj;
        return c068p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("BaseSingleChatNoticeViewModel@e9d5.onGetMessageEvent$1$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(C1697810uHb.LJIIJJI(EnumC1596306Mv.GROUP_SHOT_GET_STARTED_PROMOTION, EnumC1596306Mv.GAME_CHALLENGE_GET_STARTED_CREATION, EnumC1596306Mv.WHEE_BUBBLE_DIVERSION_CARD).contains(((C06OO) this.LL).LIZ));
        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.onGetMessageEvent$1$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
