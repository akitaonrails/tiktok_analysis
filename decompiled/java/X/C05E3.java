package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05E3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.chat.ui.base.assems.mesagelist.MessageListFooterViewModel$fetchPreshownSticker$1$1", f = "MessageListFooterViewModel.kt", l = {}, m = "invokeSuspend")
public final class C05E3 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05E3(String str, InterfaceC1364105Vn<? super C05E3> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05E3(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MessageListFooterViewModel@60fe.fetchPreshownSticker$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0YNP.LJIIIIZZ(this.LL, "last_enter_chat_timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MessageListFooterViewModel@60fe.fetchPreshownSticker$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
