package X;

import com.bytedance.keva.Keva;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.pipo.probe.ProbeService;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05CH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.pipo.probe.ProbeService$setup$4", f = "ProbeService.kt", l = {120}, m = "invokeSuspend")
public final class C05CH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;

    public C05CH(InterfaceC1364105Vn<? super C05CH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05CH(interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProbeService@86fa.setup$4");
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
            Keva keva = C05CF.LIZ;
            this.LL = 1;
            try {
                String string = C05CF.LIZ.getString("probe_sdk_cache_key", "");
                Type type = new TypeToken<ArrayList<AnonymousClass1489>>() { // from class: X.05CI
                }.getType();
                C1227904rF.LIZ.getClass();
                obj = C1227904rF.LIZJ(string, type);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C098200Yq c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
                    obj = null;
                } else {
                    throw new C2197108jB();
                }
            }
            if (obj == objLJFF) {
                C1C7U.LIZIZ("ProbeService@86fa.setup$4");
                return objLJFF;
            }
        }
        ArrayList arrayList = (ArrayList) obj;
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new AnonymousClass0679(ProbeService.LIZJ, (AnonymousClass1489) it2.next(), new C05JQ() { // from class: X.05CG
                    @Override // X.C05JQ
                    public final void LIZJ() {
                    }

                    @Override // X.C05JQ
                    public final void onSuccess() {
                        Keva keva2 = C05CF.LIZ;
                        C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C05CD(null), 2);
                    }
                }, null), 2);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ProbeService@86fa.setup$4");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C05CH(interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
