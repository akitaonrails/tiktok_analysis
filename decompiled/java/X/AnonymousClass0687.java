package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0687, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseCommonChatNoticeViewModel$onGetMessageEvent$1$5", f = "BaseCommonChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class AnonymousClass0687 extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public AnonymousClass0687(InterfaceC1364105Vn<? super AnonymousClass0687> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        AnonymousClass0687 anonymousClass0687 = new AnonymousClass0687(interfaceC1364105Vn);
        anonymousClass0687.LL = obj;
        return anonymousClass0687;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1$5");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        if (((C06OO) this.LL).LIZ == EnumC1596306Mv.CHAT_REQUEST_SENT) {
            z = true;
        } else {
            z = false;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("BaseCommonChatNoticeViewModel@63e8.onGetMessageEvent$1$5");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
