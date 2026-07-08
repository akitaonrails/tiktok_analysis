package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uCy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.text.input.internal.AndroidLegacyPlatformTextInputServiceAdapter$startInput$2$1", f = "LegacyPlatformTextInputServiceAdapter.android.kt", l = {149}, m = "invokeSuspend")
public final class C1694940uCy extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<?>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ InterfaceC1694980uD2 LLILLL;
    public final /* synthetic */ Function1<C1694800uCk, Unit> LLILZ;
    public final /* synthetic */ C1694790uCj LLILZIL;
    public final /* synthetic */ InterfaceC1694690uCZ LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1694940uCy(InterfaceC1694980uD2 interfaceC1694980uD2, Function1<? super C1694800uCk, Unit> function1, C1694790uCj c1694790uCj, InterfaceC1694690uCZ interfaceC1694690uCZ, InterfaceC1364105Vn<? super C1694940uCy> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = interfaceC1694980uD2;
        this.LLILZ = function1;
        this.LLILZIL = c1694790uCj;
        this.LLILZLL = interfaceC1694690uCZ;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1694940uCy c1694940uCy = new C1694940uCy(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c1694940uCy.LLILLJJLI = obj;
        return c1694940uCy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                InterfaceC497601wk interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                InterfaceC1694900uCu interfaceC1694900uCu = (InterfaceC1694900uCu) C1694990uD3.LIZ.invoke(this.LLILLL.getView());
                C1694800uCk c1694800uCk = new C1694800uCk(this.LLILLL.getView(), new C1694870uCr(this.LLILZLL), interfaceC1694900uCu);
                if (C1694930uCx.LIZ) {
                    C23250099c.LIZLLL(interfaceC497601wk, null, null, new C1694960uD0(this.LLILZIL, interfaceC1694900uCu, null), 3);
                }
                Function1<C1694800uCk, Unit> function1 = this.LLILZ;
                if (function1 != null) {
                    function1.invoke(c1694800uCk);
                }
                this.LLILZIL.LIZJ = c1694800uCk;
                InterfaceC1694980uD2 interfaceC1694980uD2 = this.LLILLL;
                this.LL = 1;
                if (interfaceC1694980uD2.LIZ(c1694800uCk, this) == objLJFF) {
                    return objLJFF;
                }
            }
            throw new C2197108jB();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILZIL.LIZJ = null;
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
