package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS391S0200000_25;
import njp.a;

/* JADX INFO: renamed from: X.0tzL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimation$animateAppearance$2", f = "LazyLayoutItemAnimation.kt", l = {183, 185}, m = "invokeSuspend")
public final class C1686490tzL extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C1686480tzK LLILLL;
    public final /* synthetic */ InterfaceC1675680thu<Float> LLILZ;
    public final /* synthetic */ C1695970uEd LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1686490tzL(boolean z, C1686480tzK c1686480tzK, InterfaceC1675680thu<Float> interfaceC1675680thu, C1695970uEd c1695970uEd, InterfaceC1364105Vn<? super C1686490tzL> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c1686480tzK;
        this.LLILZ = interfaceC1675680thu;
        this.LLILZIL = c1695970uEd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1686490tzL(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i != 1) {
                    if (i == 2) {
                        C155000ia.LIZIZ(obj);
                        this.LLILLL.LIZLLL(false);
                        return Unit.LIZ;
                    }
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C155000ia.LIZIZ(obj);
            } else {
                C155000ia.LIZIZ(obj);
                if (this.LLILLJJLI) {
                    C1677480tko<Float, C1677280tkU> c1677480tko = this.LLILLL.LJIILL;
                    Float fLIZLLL = C2286608xc.LIZLLL(0.0f);
                    this.LL = 1;
                    if (c1677480tko.LJFF(fLIZLLL, this) == objLJFF) {
                        return objLJFF;
                    }
                }
            }
            C1677480tko<Float, C1677280tkU> c1677480tko2 = this.LLILLL.LJIILL;
            Float fLIZLLL2 = C2286608xc.LIZLLL(1.0f);
            InterfaceC1675680thu<Float> interfaceC1675680thu = this.LLILZ;
            AwS391S0200000_25 awS391S0200000_25 = new AwS391S0200000_25(this.LLILZIL, this.LLILLL, 9);
            this.LL = 2;
            if (C1677480tko.LIZJ(c1677480tko2, fLIZLLL2, interfaceC1675680thu, null, awS391S0200000_25, this, 4) == objLJFF) {
                return objLJFF;
            }
            this.LLILLL.LIZLLL(false);
            return Unit.LIZ;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            this.LLILLL.LIZLLL(false);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
