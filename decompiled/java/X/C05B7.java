package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05B7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.chatnoticenew.viewmodel.SingleChatNoticeViewModel$handleChatRequestStateNotice$2", f = "SingleChatNoticeViewModel.kt", l = {}, m = "invokeSuspend")
public final class C05B7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05B7(String str, String str2, InterfaceC1364105Vn<? super C05B7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05B7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SingleChatNoticeViewModel@3e8d.handleChatRequestStateNotice$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        String str = this.LL;
        String str2 = this.LLILLJJLI;
        if (str2 == null) {
            str2 = "";
        }
        C0YNP.LJIIIIZZ(str, "request_state_to_chat_notice_code", str2);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SingleChatNoticeViewModel@3e8d.handleChatRequestStateNotice$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
