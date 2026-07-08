package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$onSendMessageEvent$1$2$2", f = "BaseSingleChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C15581068d extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C15581068d(InterfaceC1364105Vn<? super C15581068d> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15581068d c15581068d = new C15581068d(interfaceC1364105Vn);
        c15581068d.LL = obj;
        return c15581068d;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("BaseSingleChatNoticeViewModel@e9d5.onSendMessageEvent$1$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC1596306Mv enumC1596306Mv = ((C06OO) this.LL).LIZ;
        if (enumC1596306Mv != EnumC1596306Mv.GROUP_SHOT_GET_STARTED_PROMOTION && enumC1596306Mv != EnumC1596306Mv.WHEE_BUBBLE_DIVERSION_CARD) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.onSendMessageEvent$1$2$2");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
