package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13fH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", l = {238}, m = "invokeSuspend")
public final class C20066113fH extends C09AX implements Function2<InterfaceC20066413fK, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1695000uD4 LLILLL;
    public final /* synthetic */ InterfaceC1697790uHZ LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20066113fH(InterfaceC1695000uD4 interfaceC1695000uD4, InterfaceC1697790uHZ interfaceC1697790uHZ, InterfaceC1364105Vn<? super C20066113fH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1695000uD4;
        this.LLILZ = interfaceC1697790uHZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20066113fH c20066113fH = new C20066113fH(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c20066113fH.LLILLJJLI = obj;
        return c20066113fH;
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
            InterfaceC20066413fK interfaceC20066413fK = (InterfaceC20066413fK) this.LLILLJJLI;
            this.LL = 1;
            if (interfaceC20066413fK.LIZ() == objLJFF) {
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC20066413fK interfaceC20066413fK, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC20066413fK, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
