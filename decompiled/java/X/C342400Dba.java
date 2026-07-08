package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Dba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.onboarding.AiChatOnboardingComponent$init$1$1", f = "AiChatOnboardingComponent.kt", l = {}, m = "invokeSuspend")
public final class C342400Dba extends C09AX implements Function2<InterfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C342400Dba(InterfaceC1364105Vn<? super C342400Dba> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C342400Dba c342400Dba = new C342400Dba(interfaceC1364105Vn);
        c342400Dba.LL = obj;
        return c342400Dba;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AiChatOnboardingComponent@20e1.init$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Boolean boolValueOf = Boolean.valueOf(this.LL instanceof C1758306ub);
        C1C7U.LIZIZ("AiChatOnboardingComponent@20e1.init$1$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC904740ZeS interfaceC904740ZeS, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC904740ZeS, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
