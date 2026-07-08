package X;

import Y.ARunnableS90S0200000_21;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0mQ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.report.report.MinisReportInstance$startFunctionReport$1", f = "MinisReportInstance.kt", l = {146}, m = "invokeSuspend")
public final class C1395540mQ4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1395560mQ6 LL;
    public int LLILLJJLI;
    public final /* synthetic */ C1395560mQ6 LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ Function2<String, Throwable, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1395540mQ4(C1395560mQ6 c1395560mQ6, String str, String str2, Function2<? super String, ? super Throwable, Unit> function2, InterfaceC1364105Vn<? super C1395540mQ4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1395560mQ6;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1395540mQ4(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ARunnableS90S0200000_21 aRunnableS90S0200000_21;
        C1395560mQ6 c1395560mQ6;
        C1C7U.LIZ("MinisReportInstance@2783.startFunctionReport$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLJJLI;
        try {
            if (i != 0) {
                if (i == 1) {
                    c1395560mQ6 = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                c1395560mQ6 = this.LLILLL;
                String str = this.LLILZ;
                String str2 = this.LLILZIL;
                this.LL = c1395560mQ6;
                this.LLILLJJLI = 1;
                obj = c1395560mQ6.LIZ(str, str2, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("MinisReportInstance@2783.startFunctionReport$1");
                    return objLJFF;
                }
            }
            c1395560mQ6.LJII = (String) obj;
            this.LLILLL.LJI.set(EnumC1395570mQ7.COMPLETED);
            aRunnableS90S0200000_21 = new ARunnableS90S0200000_21(this.LLILLL, this.LLILZLL, 57);
        } catch (Throwable th) {
            try {
                TryCatchGuardChecker.doCheck(th);
                C1395560mQ6 c1395560mQ62 = this.LLILLL;
                c1395560mQ62.LJIIIIZZ = th;
                c1395560mQ62.LJI.set(EnumC1395570mQ7.COMPLETED);
                aRunnableS90S0200000_21 = new ARunnableS90S0200000_21(this.LLILLL, this.LLILZLL, 57);
            } catch (Throwable th2) {
                TryCatchGuardChecker.doCheck(th2);
                this.LLILLL.LJI.set(EnumC1395570mQ7.COMPLETED);
                C2487409ou.LIZJ(new ARunnableS90S0200000_21(this.LLILLL, this.LLILZLL, 57));
                throw th2;
            }
        }
        C2487409ou.LIZJ(aRunnableS90S0200000_21);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisReportInstance@2783.startFunctionReport$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
