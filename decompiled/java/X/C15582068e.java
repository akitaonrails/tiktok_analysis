package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$onSendMessageEvent$1$2$1", f = "BaseSingleChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C15582068e extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C15582068e(InterfaceC1364105Vn<? super C15582068e> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C15582068e c15582068e = new C15582068e(interfaceC1364105Vn);
        c15582068e.LL = obj;
        return c15582068e;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("BaseSingleChatNoticeViewModel@e9d5.onSendMessageEvent$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((C06OO) this.LL).LIZ == EnumC1596306Mv.MESSAGE_REQUEST_BANNER) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.onSendMessageEvent$1$2$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
