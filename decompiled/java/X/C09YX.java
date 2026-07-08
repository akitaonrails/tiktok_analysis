package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.09YX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.minis.performance.MinisPreloadWorkFlow$runOneGroup$2$1$1", f = "MinisPreloadWorkFlow.kt", l = {61}, m = "invokeSuspend")
public final class C09YX extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C09YW LLILLJJLI;
    public final /* synthetic */ C2390309Yf LLILLL;
    public final /* synthetic */ List<Throwable> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C09YX(C09YW c09yw, C2390309Yf c2390309Yf, List<Throwable> list, InterfaceC1364105Vn<? super C09YX> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c09yw;
        this.LLILLL = c2390309Yf;
        this.LLILZ = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C09YX(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("MinisPreloadWorkFlow@4198.runOneGroup$2$1$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
            if (i != 0) {
                if (i == 1) {
                    C155000ia.LIZIZ(obj);
                } else {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            } else {
                C155000ia.LIZIZ(obj);
                C09YW c09yw = this.LLILLJJLI;
                C2390309Yf c2390309Yf = this.LLILLL;
                this.LL = 1;
                if (c09yw.LIZ(c2390309Yf, this) == objLJFF) {
                    C1C7U.LIZIZ("MinisPreloadWorkFlow@4198.runOneGroup$2$1$1");
                    return objLJFF;
                }
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            List<Throwable> list = this.LLILZ;
            synchronized (list) {
                try {
                    list.add(th);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    throw th2;
                }
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MinisPreloadWorkFlow@4198.runOneGroup$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
