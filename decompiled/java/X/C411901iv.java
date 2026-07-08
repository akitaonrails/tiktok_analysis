package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01iv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.tiktok.kmp.fcp.manager.FcpManagerImpl$dispatchPipeline$1", f = "FcpManagerImpl.kt", l = {470, 143}, m = "invokeSuspend")
public final class C411901iv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public Function0 LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1446505lP LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C411901iv(C1446505lP c1446505lP, Function0<Unit> function0, InterfaceC1364105Vn<? super C411901iv> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1446505lP;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C411901iv(this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        InterfaceC383701eN interfaceC383701eN;
        Function0<Unit> function0;
        C1C7U.LIZ("FcpManagerImpl@d3ab.dispatchPipeline$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILLL;
        try {
            try {
                if (i != 0) {
                    if (i != 1) {
                        if (i == 2) {
                            interfaceC383701eN = this.LL;
                            C155000ia.LIZIZ(obj);
                            interfaceC383701eN.LIZIZ(null);
                            Unit unit = Unit.LIZ;
                            C1C7U.LIZIZ("FcpManagerImpl@d3ab.dispatchPipeline$1");
                            return unit;
                        }
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    function0 = this.LLILLJJLI;
                    interfaceC383701eN = this.LL;
                    C155000ia.LIZIZ(obj);
                } else {
                    C155000ia.LIZIZ(obj);
                    interfaceC383701eN = this.LLILZ.LJIIIIZZ;
                    function0 = this.LLILZIL;
                    this.LL = interfaceC383701eN;
                    this.LLILLJJLI = function0;
                    this.LLILLL = 1;
                    if (interfaceC383701eN.LIZLLL(null, this) == objLJFF) {
                        C1C7U.LIZIZ("FcpManagerImpl@d3ab.dispatchPipeline$1");
                        return objLJFF;
                    }
                }
                C1DFH c1dfh = C0PEM.LIZ;
                C411801iu c411801iu = new C411801iu(function0, null);
                this.LL = interfaceC383701eN;
                this.LLILLJJLI = null;
                this.LLILLL = 2;
                if (C23250099c.LJI(this, c1dfh, c411801iu) == objLJFF) {
                    C1C7U.LIZIZ("FcpManagerImpl@d3ab.dispatchPipeline$1");
                    return objLJFF;
                }
                interfaceC383701eN.LIZIZ(null);
                Unit unit2 = Unit.LIZ;
                C1C7U.LIZIZ("FcpManagerImpl@d3ab.dispatchPipeline$1");
                return unit2;
            } catch (Throwable th) {
                th = th;
                TryCatchGuardChecker.doCheck(th);
                interfaceC383701eN.LIZIZ(null);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
