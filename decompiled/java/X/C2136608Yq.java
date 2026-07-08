package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08Yq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.lightinteract.impl.serviceimpl.LightInteractionExitServiceImpl$initCache$1$1", f = "LightInteractionExitServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C2136608Yq extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2136608Yq(String str, InterfaceC1364105Vn<? super C2136608Yq> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C2136608Yq c2136608Yq = new C2136608Yq(this.LLILLJJLI, interfaceC1364105Vn);
        c2136608Yq.LL = obj;
        return c2136608Yq;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LightInteractionExitServiceImpl@10e1.initCache$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Object obj2 = this.LL;
        String str = this.LLILLJJLI;
        synchronized (obj2) {
            try {
                System.currentTimeMillis();
                C603760NmA c603760NmA = C603760NmA.LL;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("light_interaction_exit_bean_");
                sbLIZ.append(str);
                Keva repo = KevaImpl.getRepo(C2188811AlT.LIZIZ(sbLIZ), 1);
                if (((Boolean) C2136708Yr.LIZ.getValue()).booleanValue()) {
                    repo.clear();
                }
                Map<String, ?> all = repo.getAll();
                C603760NmA c603760NmA2 = C603760NmA.LL;
                C603760NmA.LIZLLL(all, repo);
                C603760NmA.LJIIJ(C603760NmA.LJIIIIZZ(all, repo), C603760NmA.LLILZ);
                C603760NmA.LLILZLL = repo;
                C603760NmA.LLIZLLLIL = null;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LightInteractionExitServiceImpl@10e1.initCache$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
