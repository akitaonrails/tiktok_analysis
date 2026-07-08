package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sharepanel.impl.relations.data.core.loader.CombinedLoader$loadInternal$1", f = "CombinedLoader.kt", l = {90, 91}, m = "invokeSuspend")
public final class C328340Cu0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1382250m4d<R> LLILLL;
    public final /* synthetic */ boolean LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C328340Cu0(C1382250m4d<R> c1382250m4d, boolean z, InterfaceC1364105Vn<? super C328340Cu0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c1382250m4d;
        this.LLILZ = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C328340Cu0 c328340Cu0 = new C328340Cu0(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c328340Cu0.LLILLJJLI = obj;
        return c328340Cu0;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        boolean z;
        C1C7U.LIZ("CombinedLoader@3101.loadInternal$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        try {
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    C155000ia.LIZIZ(obj);
                    Unit unit = Unit.LIZ;
                    C1C7U.LIZIZ("CombinedLoader@3101.loadInternal$1");
                    return unit;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C155000ia.LIZIZ(obj);
        } else {
            C155000ia.LIZIZ(obj);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("start load list, ts: ");
            sbLIZ.append(SystemClock.elapsedRealtime());
            C2188811AlT.LIZIZ(sbLIZ);
            C1382250m4d<R> c1382250m4d = this.LLILLL;
            if (this.LLILZ) {
                z = true;
            } else {
                z = false;
            }
            this.LL = 1;
            obj = C1382250m4d.LJII(c1382250m4d, z, this);
            if (obj == objLJFF) {
                C1C7U.LIZIZ("CombinedLoader@3101.loadInternal$1");
                return objLJFF;
            }
        }
        c098200Yq = (List) obj;
        C189200o6.m2constructorimpl(c098200Yq);
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
        C328350Cu1 c328350Cu1 = new C328350Cu1(this.LLILLL, c098200Yq, this.LLILZ, null);
        this.LL = 2;
        if (C23250099c.LJI(this, abstractC2238408pq, c328350Cu1) == objLJFF) {
            C1C7U.LIZIZ("CombinedLoader@3101.loadInternal$1");
            return objLJFF;
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CombinedLoader@3101.loadInternal$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
