package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.experiment.LocationSlardarEventMonitorSettings;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0epa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tracker.LocationEventTracker$monitorSlardarEvent$1", f = "LocationEventTracker.kt", l = {}, m = "invokeSuspend")
public final class C1103840epa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ JSONObject LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1103840epa(String str, InterfaceC1364105Vn interfaceC1364105Vn, JSONObject jSONObject) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = jSONObject;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1103840epa(this.LL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Iterator<String> itKeys;
        C1C7U.LIZ("LocationEventTracker@d5ee.monitorSlardarEvent$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C054G c054g = C1103850epb.LIZ;
        String str = this.LL;
        JSONObject jSONObject = this.LLILLJJLI;
        LocationSlardarEventMonitorSettings.EventConfig eventConfig = (LocationSlardarEventMonitorSettings.EventConfig) ((Map) LocationSlardarEventMonitorSettings.LIZIZ.getValue()).get(str);
        if (eventConfig != null && C1087660ePU.LIZ(eventConfig.sampleRate)) {
            try {
                String str2 = eventConfig.eventName;
                JSONObject jSONObject2 = new JSONObject();
                JSONObject jSONObject3 = new JSONObject();
                if (jSONObject != null && (itKeys = jSONObject.keys()) != null) {
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        Object obj2 = jSONObject.get(next);
                        List<String> list = eventConfig.categories;
                        if (list != null && list.contains(next)) {
                            jSONObject3.put(next, obj2);
                        }
                        List<String> list2 = eventConfig.metrics;
                        if (list2 != null && list2.contains(next)) {
                            jSONObject2.put(next, obj2);
                        }
                    }
                }
                C793770VBv.LJII(str2, jSONObject3, jSONObject2, null);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("LocationEventTracker@d5ee.monitorSlardarEvent$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
