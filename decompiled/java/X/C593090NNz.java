package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.PriorityQueue;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0NNz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.api.component.idlepreload.CommerceIDLEPreloadModule$submitPreLoadTask$1", f = "CommerceIDLEPreloadModule.kt", l = {284}, m = "invokeSuspend")
public final class C593090NNz extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1DEV LL;
    public C593080NNy LLILLJJLI;
    public C1001420cAO LLILLL;
    public int LLILZ;
    public final /* synthetic */ C593080NNy LLILZIL;
    public final /* synthetic */ C1001420cAO LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C593090NNz(C593080NNy c593080NNy, C1001420cAO c1001420cAO, InterfaceC1364105Vn<? super C593090NNz> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c593080NNy;
        this.LLILZLL = c1001420cAO;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C593090NNz(this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C593080NNy c593080NNy;
        C1DEV c1dev;
        C1001420cAO c1001420cAO;
        boolean z;
        C1C7U.LIZ("CommerceIDLEPreloadModule@18dd.submitPreLoadTask$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZ;
        boolean z2 = true;
        if (i != 0) {
            if (i == 1) {
                c1001420cAO = this.LLILLL;
                c593080NNy = this.LLILLJJLI;
                c1dev = this.LL;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            c593080NNy = this.LLILZIL;
            c1dev = c593080NNy.LIZJ;
            c1001420cAO = this.LLILZLL;
            this.LL = c1dev;
            this.LLILLJJLI = c593080NNy;
            this.LLILLL = c1001420cAO;
            this.LLILZ = 1;
            if (c1dev.LIZLLL(null, this) == objLJFF) {
                C1C7U.LIZIZ("CommerceIDLEPreloadModule@18dd.submitPreLoadTask$1");
                return objLJFF;
            }
        }
        try {
            c593080NNy.LJ();
            c593080NNy.LIZJ();
            String strLIZ = C0NO7.LIZ(c1001420cAO.LIZ, c1001420cAO.LIZIZ);
            PriorityQueue<C1001510cAX> priorityQueue = c593080NNy.LIZ;
            if (!(priorityQueue instanceof Collection) || !priorityQueue.isEmpty()) {
                for (C1001510cAX c1001510cAX : priorityQueue) {
                    C1001420cAO c1001420cAO2 = c1001510cAX.LL;
                    if (!Intrinsics.LJFF(C0NO7.LIZ(c1001420cAO2.LIZ, c1001420cAO2.LIZIZ), strLIZ) || c1001510cAX.LL.LJFF != EnumC1001490cAV.PENDING) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        break;
                    }
                }
            }
            z2 = false;
            if (z2) {
                C0NO7.LIZ(c1001420cAO.LIZ, c1001420cAO.LIZIZ);
            } else {
                C1001510cAX c1001510cAX2 = new C1001510cAX(c1001420cAO, c593080NNy.LJIIIZ);
                c593080NNy.LIZIZ.LIZLLL(strLIZ, c1001510cAX2);
                c593080NNy.LIZ.offer(c1001510cAX2);
                C0NO7.LIZ(c1001420cAO.LIZ, c1001420cAO.LIZIZ);
            }
            c1dev.LIZIZ(null);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("CommerceIDLEPreloadModule@18dd.submitPreLoadTask$1");
            return unit;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c1dev.LIZIZ(null);
            throw th;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
