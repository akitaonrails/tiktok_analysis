package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS574S0100000_30;
import njp.a;

/* JADX INFO: renamed from: X.13fG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", l = {237}, m = "invokeSuspend")
public final class C20066013fG extends C09AX implements Function2<Unit, InterfaceC1364105Vn<?>, Object> {
    public int LL;
    public final /* synthetic */ C20065113f7 LLILLJJLI;
    public final /* synthetic */ InterfaceC1695000uD4 LLILLL;
    public final /* synthetic */ InterfaceC1697790uHZ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20066013fG(C20065113f7 c20065113f7, InterfaceC1695000uD4 interfaceC1695000uD4, InterfaceC1697790uHZ interfaceC1697790uHZ, InterfaceC1364105Vn<? super C20066013fG> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c20065113f7;
        this.LLILLL = interfaceC1695000uD4;
        this.LLILZ = interfaceC1697790uHZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C20066013fG(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
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
            C095D c095dLJIIIZ = C20028913Yh.LJIIIZ(new AwS574S0100000_30(this.LLILLJJLI, 8));
            C20066113fH c20066113fH = new C20066113fH(this.LLILLL, this.LLILZ, null);
            this.LL = 1;
            if (C09IC.LJII(c095dLJIIIZ, this, c20066113fH) == objLJFF) {
                return objLJFF;
            }
        }
        "Interceptors flow should never terminate.".toString();
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return ((a) create(unit, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
