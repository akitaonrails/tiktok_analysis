package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.059v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.casting.api.plugin.CastingPluginInstaller$onInstallPluginSuccess$1", f = "CastingPluginInstaller.kt", l = {156}, m = "invokeSuspend")
public final class C13077059v extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ Function1<Boolean, Unit> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C13077059v(Function1<? super Boolean, Unit> function1, InterfaceC1364105Vn<? super C13077059v> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13077059v(this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        boolean z;
        Object c098200Yq;
        C1C7U.LIZ("CastingPluginInstaller@5be8.onInstallPluginSuccess$1");
        Object objLJFF = C099R.LJFF();
        int i = this.LL;
        if (i != 0) {
            if (i == 1) {
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            C2110408Oo c2110408Oo = C2110408Oo.LIZ;
            c2110408Oo.getClass();
            if (C2110408Oo.LIZLLL) {
                z = true;
            } else {
                try {
                    synchronized (c2110408Oo) {
                        try {
                            c098200Yq = Class.forName("com.byted.cast.common.source.ServiceInfo");
                            C189200o6.m2constructorimpl(c098200Yq);
                        } catch (Throwable th) {
                            TryCatchGuardChecker.doCheck(th);
                            c098200Yq = new C098200Yq(th);
                            C189200o6.m2constructorimpl(c098200Yq);
                        } finally {
                        }
                        if (C189200o6.m7isFailureimpl(c098200Yq)) {
                            c098200Yq = null;
                        }
                        if (((Class) c098200Yq) != null) {
                            C2110408Oo.LIZLLL = true;
                        }
                    }
                } catch (Exception th2) {
                }
                z = C2110408Oo.LIZLLL;
            }
            if (z) {
                C1DFH c1dfh = C0PEM.LIZ;
                AbstractC2238408pq abstractC2238408pq = C2107308Nj.LIZ;
                C13078059w c13078059w = new C13078059w(null);
                this.LL = 1;
                if (C23250099c.LJI(this, abstractC2238408pq, c13078059w) == objLJFF) {
                    C1C7U.LIZIZ("CastingPluginInstaller@5be8.onInstallPluginSuccess$1");
                    return objLJFF;
                }
            } else {
                Function1<Boolean, Unit> function1 = this.LLILLJJLI;
                if (function1 != null) {
                    function1.invoke(false);
                }
                Unit unit = Unit.LIZ;
                C1C7U.LIZIZ("CastingPluginInstaller@5be8.onInstallPluginSuccess$1");
                return unit;
            }
        }
        Function1<Boolean, Unit> function12 = this.LLILLJJLI;
        if (function12 != null) {
            function12.invoke(true);
        }
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("CastingPluginInstaller@5be8.onInstallPluginSuccess$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
