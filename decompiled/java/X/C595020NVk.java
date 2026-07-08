package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NVk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "androidx.compose.foundation.text.TextFieldPressGestureFilterKt$tapPressTextFieldModifier$1$2$1$1$2", f = "TextFieldPressGestureFilter.kt", l = {76}, m = "invokeSuspend")
public final class C595020NVk extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C05P0 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C05P0<C0NW2> LLILLL;
    public final /* synthetic */ boolean LLILZ;
    public final /* synthetic */ InterfaceC595010NVj LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C595020NVk(C05P0<C0NW2> c05p0, boolean z, InterfaceC595010NVj interfaceC595010NVj, InterfaceC1364105Vn<? super C595020NVk> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c05p0;
        this.LLILZ = z;
        this.LLILZIL = interfaceC595010NVj;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C595020NVk(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C05P0<C0NW2> c05p0;
        C0NNS c595030NVl;
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        if (i != 0) {
            if (i == 1) {
                c05p0 = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C0NW2 value = this.LLILLL.getValue();
            if (value != null) {
                boolean z = this.LLILZ;
                InterfaceC595010NVj interfaceC595010NVj = this.LLILZIL;
                c05p0 = this.LLILLL;
                if (z) {
                    c595030NVl = new C595040NVm(value);
                } else {
                    c595030NVl = new C595030NVl(value);
                }
                if (interfaceC595010NVj != null) {
                    this.LL = c05p0;
                    this.LLILLJJLI = 1;
                    if (interfaceC595010NVj.LIZ(c595030NVl, this) == objLJFF) {
                        return objLJFF;
                    }
                }
            }
            return Unit.LIZ;
        }
        c05p0.setValue(null);
        return Unit.LIZ;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
