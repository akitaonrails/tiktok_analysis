package X;

import com.bytedance.android.livesdk.comp.impl.game.partnership.mixlayout.framework.base.GlobalMixEventBase;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0z5i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1882640z5i extends C09AY implements Function0<Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ InterfaceC1881290z3X LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1882640z5i(String str, GlobalMixEventBase globalMixEventBase) {
        super(0);
        this.LL = str;
        this.LLILLJJLI = globalMixEventBase;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        Object jSONObject;
        ConcurrentHashMap concurrentHashMapLIZ = C1882650z5j.LIZ();
        String str = this.LL;
        InterfaceC1881290z3X interfaceC1881290z3X = this.LLILLJJLI;
        for (Map.Entry entry : concurrentHashMapLIZ.entrySet()) {
            if (((CopyOnWriteArraySet) entry.getValue()).contains(str)) {
                ((InterfaceC1882630z5h) entry.getKey()).LJIJJLI(str, interfaceC1881290z3X);
            }
        }
        InterfaceC1881290z3X interfaceC1881290z3X2 = this.LLILLJJLI;
        if (interfaceC1881290z3X2 != null) {
            try {
                jSONObject = new JSONObject(C476770Imp.LJ(interfaceC1881290z3X2));
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                jSONObject = new C098200Yq(th);
                C189200o6.m2constructorimpl(jSONObject);
            }
        } else {
            jSONObject = null;
        }
        C189200o6.m2constructorimpl(jSONObject);
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(jSONObject);
        if (thM5exceptionOrNullimpl != null) {
            Map<String, Object> map = C1338270kvh.LIZ;
            C20441214yg.LJFF("GlobalMixEventCenter", "sendEvent to Lynx parse param error, must be JSONObject", thM5exceptionOrNullimpl);
        }
        String str2 = this.LL;
        if (C189200o6.m8isSuccessimpl(jSONObject)) {
            C389001fE.LIZ(str2, (JSONObject) jSONObject, System.currentTimeMillis(), false);
        }
        Iterator it2 = ((CopyOnWriteArraySet) C1882650z5j.LLILZ.getValue()).iterator();
        while (it2.hasNext()) {
            ((InterfaceC1882710z5p) it2.next()).onEvent();
        }
        return Unit.LIZ;
    }
}
