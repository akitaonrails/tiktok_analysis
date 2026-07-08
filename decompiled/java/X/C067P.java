package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.067P, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel$handleChatUnavailableNotice$4", f = "SingleChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C067P extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C067P(InterfaceC1364105Vn<? super C067P> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C067P c067p = new C067P(interfaceC1364105Vn);
        c067p.LL = obj;
        return c067p;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("SingleChatNoticeViewModel@3e8d.handleChatUnavailableNotice$4");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC1596306Mv enumC1596306Mv = ((C06OO) this.LL).LIZ;
        if (enumC1596306Mv != EnumC1596306Mv.CHAT_UNAVAILABLE_ACCOUNT && enumC1596306Mv != EnumC1596306Mv.CHAT_UNAVAILABLE_DM) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("SingleChatNoticeViewModel@3e8d.handleChatUnavailableNotice$4");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
