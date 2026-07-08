package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0uUH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.growth.decoration.boardsdisplay.batch.BoardBatchRenderCoordinator$awaitInOrder$2$1$1$1", f = "BoardBatchRenderCoordinator.kt", l = {39}, m = "invokeSuspend")
public final class C1705670uUH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C07XT>, Object> {
    public int LL;
    public final /* synthetic */ C1705720uUM LLILLJJLI;
    public final /* synthetic */ C1705700uUK LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1705670uUH(C1705720uUM c1705720uUM, C1705700uUK c1705700uUK, InterfaceC1364105Vn<? super C1705670uUH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1705720uUM;
        this.LLILLL = c1705700uUK;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1705670uUH(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c07xk;
        C1C7U.LIZ("BoardBatchRenderCoordinator@7da7.awaitInOrder$2$1$1$1");
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
                C1705720uUM c1705720uUM = this.LLILLJJLI;
                this.LLILLL.getClass();
                this.LL = 1;
                obj = c1705720uUM.LIZ(2000L, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("BoardBatchRenderCoordinator@7da7.awaitInOrder$2$1$1$1");
                    return objLJFF;
                }
            }
            c07xk = (C07XT) obj;
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c07xk = new C07XK(th);
        }
        C1C7U.LIZIZ("BoardBatchRenderCoordinator@7da7.awaitInOrder$2$1$1$1");
        return c07xk;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C07XT> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
