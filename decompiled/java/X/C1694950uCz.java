package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uCz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {125}, m = "invokeSuspend")
public final class C1694950uCz extends C09AX implements Function2<InterfaceC1694980uD2, InterfaceC1364105Vn<?>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ Function1<C1694800uCk, Unit> LLILLL;
    public final /* synthetic */ C1694790uCj LLILZ;
    public final /* synthetic */ InterfaceC1694690uCZ LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1694950uCz(Function1<? super C1694800uCk, Unit> function1, C1694790uCj c1694790uCj, InterfaceC1694690uCZ interfaceC1694690uCZ, InterfaceC1364105Vn<? super C1694950uCz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function1;
        this.LLILZ = c1694790uCj;
        this.LLILZIL = interfaceC1694690uCZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1694950uCz c1694950uCz = new C1694950uCz(this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
        c1694950uCz.LLILLJJLI = obj;
        return c1694950uCz;
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
            C1694940uCy c1694940uCy = new C1694940uCy((InterfaceC1694980uD2) this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, null);
            this.LL = 1;
            if (C2296808zG.LJ(c1694940uCy, this) == objLJFF) {
                return objLJFF;
            }
        }
        throw new C2197108jB();
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC1694980uD2 interfaceC1694980uD2, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return ((a) create(interfaceC1694980uD2, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
