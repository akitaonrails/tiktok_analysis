package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LA6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.choosemv.MultiColTemplateScene$getLottieView$1$result$1", f = "MultiColTemplateScene.kt", l = {}, m = "invokeSuspend")
public final class C0LA6 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1292000jj4<C1294720jnS>>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LA6(String str, InterfaceC1364105Vn<? super C0LA6> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LA6(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C1C7U.LIZ("MultiColTemplateScene@5338.getLottieView$1$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0L62 c0l62 = C0L62.LIZ;
        C0L67 c0l67 = C0L67.LIZ;
        String str = this.LL;
        c0l62.getClass();
        ReentrantLock reentrantLockLJI = C0L62.LJI(c0l67, str);
        reentrantLockLJI.lock();
        try {
            Object obj2 = null;
            try {
                C0VSP c0vsp = new C0VSP(C0L62.LJII(c0l67, this.LL));
                try {
                    c098200Yq = C1294250jmh.LJFF(c0vsp, null);
                    C2107108Nh.LIZ(c0vsp, null);
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    th = th;
                    try {
                        try {
                            throw th;
                        } catch (Throwable th2) {
                            th = th2;
                            while (true) {
                                try {
                                    TryCatchGuardChecker.doCheck(th);
                                    C2107108Nh.LIZ(c0vsp, th);
                                    throw th;
                                } catch (Throwable th3) {
                                    th = th3;
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        th = null;
                    }
                }
            } catch (Throwable th5) {
                TryCatchGuardChecker.doCheck(th5);
                c098200Yq = new C098200Yq(th5);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                obj2 = c098200Yq;
            }
            C1292000jj4 c1292000jj4 = (C1292000jj4) obj2;
            reentrantLockLJI.unlock();
            C1C7U.LIZIZ("MultiColTemplateScene@5338.getLottieView$1$result$1");
            return c1292000jj4;
        } finally {
            TryCatchGuardChecker.doCheck(th);
            reentrantLockLJI.unlock();
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1292000jj4<C1294720jnS>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
