package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecmall.EcMallUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IEcMallUgDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.05A7, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mixmall.event.applog.ECMMKDataReportHelper$reportAppLog$1", f = "ECMMKDataReportHelper.kt", l = {}, m = "invokeSuspend")
public final class C05A7 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ Map<String, Object> LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05A7(String str, Map<String, ? extends Object> map, InterfaceC1364105Vn<? super C05A7> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = map;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C05A7(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        IECommerceHostService iECommerceHostService;
        AnonymousClass0317 anonymousClass0317CreateIEcMallUgDependencyServicebyMonsterPlugin;
        boolean z;
        boolean z2;
        String name;
        boolean z3;
        String name2;
        C1C7U.LIZ("ECMMKDataReportHelper@e43b.reportAppLog$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        try {
            C599820Nfo c599820Nfo = C599820Nfo.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("fallback to default reportAppLog, ");
            sbLIZ.append(this.LL);
            C2188811AlT.LIZIZ(sbLIZ);
            c599820Nfo.getClass();
            C599820Nfo.LIZLLL();
            JSONObject jSONObject = new JSONObject(this.LLILLJJLI);
            jSONObject.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            JSONObject jSONObject2 = new JSONObject();
            JSONObject jSONObject3 = new JSONObject();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj2 = jSONObject.get(next);
                jSONObject3.put(next, obj2);
                jSONObject2.put(next, obj2);
            }
            C05A8 c05a8 = C05A8.LIZ;
            String str = this.LL;
            c05a8.getClass();
            String name3 = null;
            C05A8.LIZ(str, jSONObject3, jSONObject2, null);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name4 = ILogDependencyService.class.getName();
                if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                    name2 = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name4, name2, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
            }
            ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).onEventV3(this.LL, jSONObject);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                if (iECommerceHostService2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name5 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService2 != null) {
                    name = iECommerceHostService2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name, z2);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            if (((IApplicationDependencyService) iECommerceHostService).boeCanUse()) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIEcMallUgDependencyServicebyMonsterPlugin = EcMallUgDependencyService.createIEcMallUgDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIEcMallUgDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name6 = IEcMallUgDependencyService.class.getName();
                    if (anonymousClass0317CreateIEcMallUgDependencyServicebyMonsterPlugin != null) {
                        name3 = anonymousClass0317CreateIEcMallUgDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name3, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIEcMallUgDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IEcMallUgDependencyService.class);
                }
                ((IEcMallUgDependencyService) anonymousClass0317CreateIEcMallUgDependencyServicebyMonsterPlugin).verifyTrackEvent(this.LL, this.LLILLJJLI);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C599820Nfo c599820Nfo2 = C599820Nfo.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("reportAppLog catch exception, ");
            sbLIZ2.append(this.LL);
            sbLIZ2.append(", msg=");
            sbLIZ2.append(th.getMessage());
            C2188811AlT.LIZIZ(sbLIZ2);
            c599820Nfo2.getClass();
            C599820Nfo.LIZIZ();
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ECMMKDataReportHelper@e43b.reportAppLog$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
