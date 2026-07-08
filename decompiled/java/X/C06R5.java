package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06R5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.service.AiChatGenerateService$initService$2$1", f = "AiChatGenerateService.kt", l = {}, m = "invokeSuspend")
public final class C06R5 extends C09AX implements Function2<InterfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C06R5(InterfaceC1364105Vn<? super C06R5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C06R5 c06r5 = new C06R5(interfaceC1364105Vn);
        c06r5.LL = obj;
        return c06r5;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatGenerateService@c920.initService$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL instanceof C1758306ub);
        C1C7U.LIZIZ("AiChatGenerateService@c920.initService$2$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC904740ZeS, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
