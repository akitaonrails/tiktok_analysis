package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05PH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.tux.compose.TuxPanelKt$TuxPanel$2$1$2$1$2", f = "TuxPanel.kt", l = {143}, m = "invokeSuspend")
public final class C05PH extends C09AX implements Function2<Boolean, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ Function0<Unit> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05PH(Function0<Unit> function0, InterfaceC1364105Vn<? super C05PH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05PH c05ph = new C05PH(this.LLILLL, interfaceC1364105Vn);
        c05ph.LLILLJJLI = ((Boolean) obj).booleanValue();
        return c05ph;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("TuxPanelKt@b49d.TuxPanel$2$1$2$1$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            if (!this.LLILLJJLI) {
                long jLJII = C19990313Jl.LJII(250, EnumC19990213Jk.MILLISECONDS);
                this.LL = 1;
                if (AnonymousClass0958.LIZJ(jLJII, this) == objLJFF) {
                    C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanel$2$1$2$1$2");
                    return objLJFF;
                }
            }
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanel$2$1$2$1$2");
            return unit;
        }
        Function0<Unit> function0 = this.LLILLL;
        if (function0 != null) {
            function0.invoke();
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("TuxPanelKt@b49d.TuxPanel$2$1$2$1$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Boolean bool, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(Boolean.valueOf(bool.booleanValue()), interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
