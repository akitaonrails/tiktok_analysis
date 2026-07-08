package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0LA8, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tools.mvtemplate.integration.MvTemplateBottomTabModule$createBottomTabItem$2$1$result$1", f = "MvTemplateBottomTabModule.kt", l = {}, m = "invokeSuspend")
public final class C0LA8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1292000jj4<C1294720jnS>>, Object> {
    public C0LA8(InterfaceC1364105Vn<? super C0LA8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LA8(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Object c098200Yq;
        C0VSP c0vsp;
        C1C7U.LIZ("MvTemplateBottomTabModule@add5.createBottomTabItem$2$1$result$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C0L62.LIZ.getClass();
        C0L62.LIZLLL.lock();
        Object obj2 = null;
        try {
            try {
                c0vsp = new C0VSP(C0L62.LIZLLL("template_eoy_camera_tab.json"));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            try {
                c098200Yq = C1294250jmh.LJFF(c0vsp, "template_eoy_camera_tab");
                C2107108Nh.LIZ(c0vsp, null);
                C189200o6.m2constructorimpl(c098200Yq);
                if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                    obj2 = c098200Yq;
                }
                C1292000jj4 c1292000jj4 = (C1292000jj4) obj2;
                C0L62.LIZ.getClass();
                C0L62.LIZLLL.unlock();
                C1C7U.LIZIZ("MvTemplateBottomTabModule@add5.createBottomTabItem$2$1$result$1");
                return c1292000jj4;
            } catch (Throwable th2) {
                th = th2;
                try {
                    TryCatchGuardChecker.doCheck(th);
                    try {
                        throw th;
                    } catch (Throwable th3) {
                        th = th3;
                        while (true) {
                            try {
                                TryCatchGuardChecker.doCheck(th);
                                C2107108Nh.LIZ(c0vsp, th);
                                throw th;
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        }
                    }
                } catch (Throwable th5) {
                    th = th5;
                    th = null;
                }
            }
        } catch (Throwable th6) {
            TryCatchGuardChecker.doCheck(th6);
            C0L62.LIZ.getClass();
            C0L62.LIZLLL.unlock();
            throw th6;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1292000jj4<C1294720jnS>> interfaceC1364105Vn) {
        return new C0LA8(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
