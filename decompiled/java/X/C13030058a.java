package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.058a, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.pitaya.manager.EcUgPitayaManager$schedulePitayaTask$1", f = "EcUgPitayaManager.kt", l = {}, m = "invokeSuspend")
public final class C13030058a extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ JSONObject LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13030058a(JSONObject jSONObject, InterfaceC1364105Vn<? super C13030058a> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C13030058a(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        IECommerceHostService iECommerceHostService;
        boolean z;
        String name;
        C1C7U.LIZ("EcUgPitayaManager@a4f0.schedulePitayaTask$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        JSONObject jSONObject = this.LL;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        if (((IApplicationDependencyService) iECommerceHostService).isLocalTest()) {
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("schedule");
            if (jSONObjectOptJSONObject != null) {
                int iOptInt = jSONObjectOptJSONObject.optInt("schedule_type");
                String strOptString = jSONObjectOptJSONObject.optString("bussiness_name");
                String strOptString2 = jSONObjectOptJSONObject.optString("group_id");
                if (iOptInt == EnumC13031058b.START.getValue()) {
                    EcUgPitayaManager.INSTANCE.createSchedulableTask(strOptString, strOptString2, jSONObjectOptJSONObject.optLong("delay_ts", -1L));
                } else if (iOptInt == EnumC13031058b.STOP.getValue()) {
                    EcUgPitayaManager.INSTANCE.cancelSchedulableTask(strOptString2);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } else {
            try {
                JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("schedule");
                if (jSONObjectOptJSONObject2 != null) {
                    int iOptInt2 = jSONObjectOptJSONObject2.optInt("schedule_type");
                    String strOptString3 = jSONObjectOptJSONObject2.optString("bussiness_name");
                    String strOptString4 = jSONObjectOptJSONObject2.optString("group_id");
                    if (iOptInt2 == EnumC13031058b.START.getValue()) {
                        EcUgPitayaManager.INSTANCE.createSchedulableTask(strOptString3, strOptString4, jSONObjectOptJSONObject2.optLong("delay_ts", -1L));
                    } else if (iOptInt2 == EnumC13031058b.STOP.getValue()) {
                        EcUgPitayaManager.INSTANCE.cancelSchedulableTask(strOptString4);
                    }
                }
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcUgPitayaManager@a4f0.schedulePitayaTask$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
