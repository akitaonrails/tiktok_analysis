package X;

import aho.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CYm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.tiktok.tools.performance.hippo.CreationSceneMonitor$startMetricScene$job$1", f = "CreationSceneMonitor.kt", l = {40}, m = "invokeSuspend")
public final class C315540CYm extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AbstractC2255811DRb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C315540CYm(AbstractC2255811DRb abstractC2255811DRb, InterfaceC1364105Vn<? super C315540CYm> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = abstractC2255811DRb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C315540CYm c315540CYm = new C315540CYm(this.LLILLL, interfaceC1364105Vn);
        c315540CYm.LLILLJJLI = obj;
        return c315540CYm;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        InterfaceC497601wk interfaceC497601wk;
        C1C7U.LIZ("CreationSceneMonitor@3f15.startMetricScene$job$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            interfaceC497601wk = (InterfaceC497601wk) this.LLILLJJLI;
            this.LLILLJJLI = interfaceC497601wk;
            this.LL = 1;
            if (AnonymousClass0958.LIZIZ(10000L, this) == objLJFF) {
                C1C7U.LIZIZ("CreationSceneMonitor@3f15.startMetricScene$job$1");
                return objLJFF;
            }
        }
        if (C2296808zG.LJI(interfaceC497601wk)) {
            b bVar = b.LIZ;
            b.LIZIZ(this.LLILLL, true);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CreationSceneMonitor timeout, scene=");
            sbLIZ.append(this.LLILLL);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("CreationSceneMonitor@3f15.startMetricScene$job$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
