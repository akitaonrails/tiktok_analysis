package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0DbZ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tools.chat.message.onboarding.AiChatOnboardingComponent$init$1$dataState$1", f = "AiChatOnboardingComponent.kt", l = {}, m = "invokeSuspend")
public final class C342390DbZ extends C09AX implements Function2<InterfaceC1157570gEF<? extends List<? extends C342360DbW>>, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ Object LL;

    public C342390DbZ(InterfaceC1364105Vn<? super C342390DbZ> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C342390DbZ c342390DbZ = new C342390DbZ(interfaceC1364105Vn);
        c342390DbZ.LL = obj;
        return c342390DbZ;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        C1C7U.LIZ("AiChatOnboardingComponent@20e1.init$1$dataState$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        if (!(obj2 instanceof C1155990gBh) && !(obj2 instanceof C1157450gE3)) {
            z = false;
        } else {
            z = true;
        }
        Boolean boolValueOf = Boolean.valueOf(z);
        C1C7U.LIZIZ("AiChatOnboardingComponent@20e1.init$1$dataState$1");
        return boolValueOf;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1157570gEF<? extends List<? extends C342360DbW>> interfaceC1157570gEF, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        return ((a) create(interfaceC1157570gEF, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
