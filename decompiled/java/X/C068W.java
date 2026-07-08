package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.068W, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.chatnotice.viewmodel.BaseSingleChatNoticeViewModel$handleForChatRequest$2$1", f = "BaseSingleChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C068W extends C09AX implements Function2<C06OO, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C068W(InterfaceC1364105Vn<? super C068W> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C068W c068w = new C068W(interfaceC1364105Vn);
        c068w.LL = obj;
        return c068w;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("BaseSingleChatNoticeViewModel@e9d5.handleForChatRequest$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        EnumC1596306Mv enumC1596306Mv = ((C06OO) this.LL).LIZ;
        if (enumC1596306Mv != EnumC1596306Mv.CHAT_REQUEST_SENT && enumC1596306Mv != EnumC1596306Mv.CHAT_REQUEST_START) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("BaseSingleChatNoticeViewModel@e9d5.handleForChatRequest$2$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C06OO c06oo, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(c06oo, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
