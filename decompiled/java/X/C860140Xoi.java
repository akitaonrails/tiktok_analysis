package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Xoi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "androidx.compose.foundation.text.input.internal.LegacyAdaptingPlatformTextInputModifierNode$launchTextInputSession$1", f = "LegacyAdaptingPlatformTextInputModifierNode.kt", l = {137}, m = "invokeSuspend")
public final class C860140Xoi extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1693190uA9 LLILLJJLI;
    public final /* synthetic */ Function2<InterfaceC1694980uD2, InterfaceC1364105Vn<?>, Object> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C860140Xoi(C1693190uA9 c1693190uA9, Function2<? super InterfaceC1694980uD2, ? super InterfaceC1364105Vn<?>, ? extends Object> function2, InterfaceC1364105Vn<? super C860140Xoi> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1693190uA9;
        this.LLILLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C860140Xoi(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            C1693190uA9 c1693190uA9 = this.LLILLJJLI;
            Function2<InterfaceC1694980uD2, InterfaceC1364105Vn<?>, Object> function2 = this.LLILLL;
            this.LL = 1;
            if (C20064813f4.LIZ(c1693190uA9, function2, this) == objLJFF) {
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
