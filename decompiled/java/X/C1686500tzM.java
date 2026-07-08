package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS391S0200000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tzM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateDisappearance$1", f = "LazyLayoutItemAnimation.kt", l = {204}, m = "invokeSuspend")
public final class C1686500tzM extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C1686480tzK LLILLJJLI;
    public final /* synthetic */ InterfaceC1675680thu<Float> LLILLL;
    public final /* synthetic */ C1695970uEd LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686500tzM(C1686480tzK c1686480tzK, InterfaceC1675680thu<Float> interfaceC1675680thu, C1695970uEd c1695970uEd, InterfaceC1364105Vn<? super C1686500tzM> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1686480tzK;
        this.LLILLL = interfaceC1675680thu;
        this.LLILZ = c1695970uEd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1686500tzM(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
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
                C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLJJLI.LJIILL;
                Float fLIZLLL = C2286608xc.LIZLLL(0.0f);
                InterfaceC1675680thu<Float> interfaceC1675680thu = this.LLILLL;
                AwS391S0200000_25 awS391S0200000_25 = new AwS391S0200000_25(this.LLILZ, this.LLILLJJLI, 361);
                this.LL = 1;
                if (C1677480tko.LIZJ(c1677480tko, fLIZLLL, interfaceC1675680thu, null, awS391S0200000_25, this, 4) == objLJFF) {
                    return objLJFF;
                }
            }
            ((C13FE) this.LLILLJJLI.LJIIJ).setValue(Boolean.TRUE);
            this.LLILLJJLI.LJ(false);
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLJJLI.LJ(false);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
