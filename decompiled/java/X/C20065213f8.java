package X;

import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13f8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2", f = "PlatformTextInputModifierNode.kt", l = {248}, m = "invokeSuspend")
public final class C20065213f8 extends C09AX implements Function2<InterfaceC1697790uHZ, InterfaceC1364105Vn<?>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function2<InterfaceC1697790uHZ, InterfaceC1364105Vn<?>, Object> LLILLL;
    public final /* synthetic */ C20065113f7 LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C20065213f8(Function2<? super InterfaceC1697790uHZ, ? super InterfaceC1364105Vn<?>, ? extends Object> function2, C20065113f7 c20065113f7, InterfaceC1364105Vn<? super C20065213f8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function2;
        this.LLILZ = c20065113f7;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20065213f8 c20065213f8 = new C20065213f8(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c20065213f8.LLILLJJLI = obj;
        return c20065213f8;
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
            C20066213fI c20066213fI = new C20066213fI((InterfaceC1697790uHZ) this.LLILLJJLI, new AtomicReference(null), this.LLILZ);
            Function2<InterfaceC1697790uHZ, InterfaceC1364105Vn<?>, Object> function2 = this.LLILLL;
            this.LL = 1;
            if (function2.invoke(c20066213fI, this) == objLJFF) {
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1697790uHZ interfaceC1697790uHZ, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return ((a) create(interfaceC1697790uHZ, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
