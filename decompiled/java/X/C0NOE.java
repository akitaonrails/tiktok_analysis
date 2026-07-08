package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.internal.AwS158S1100000_9;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0NOE, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NOE {
    public static final C1775130wIJ LIZ(InterfaceC606320NqI interfaceC606320NqI, final String str, final InterfaceC1631620sYq<? super InterfaceC21159017rA, ? super JSONObject, ? super C0NOA, Unit> interfaceC1631620sYq) {
        C1775130wIJ c1775130wIJLJFF = interfaceC606320NqI.LJFF(str, new InterfaceC1775150wIL() { // from class: X.0NOD
            @Override // X.InterfaceC1775150wIL
            public final void LIZ(Map map, Map map2, C21175917tt c21175917tt) {
                InterfaceC21159017rA interfaceC21159017rA;
                Object c098200Yq;
                new C020Q(str, (String) map, (Map<String, ? extends Object>) 15);
                C0NOA c0noa = new C0NOA(str, c21175917tt);
                Object obj = map2.get("bridge_center_extra_bridge_center_context");
                if (obj instanceof InterfaceC21159017rA) {
                    interfaceC21159017rA = (InterfaceC21159017rA) obj;
                } else {
                    interfaceC21159017rA = null;
                }
                if (C7879035x.LIZLLL()) {
                    c098200Yq = new JSONObject(map);
                    C189200o6.m2constructorimpl(c098200Yq);
                } else {
                    try {
                        c098200Yq = new JSONObject(map);
                        C189200o6.m2constructorimpl(c098200Yq);
                    } catch (CancellationException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw e;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C1AF0.LJ(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                JSONObject jSONObject = (JSONObject) c098200Yq;
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ.LLIILII()), null, null, new C0NO9(interfaceC1631620sYq, interfaceC21159017rA, jSONObject, c0noa, null), 3);
            }
        });
        new AwS158S1100000_9(str, c1775130wIJLJFF, 33);
        return c1775130wIJLJFF;
    }

    public static final void LIZIZ(InterfaceC606320NqI interfaceC606320NqI, String str, Map<String, Object> map, boolean z) {
        if (C7879035x.LIZLLL()) {
            if (map == null) {
                map = new LinkedHashMap<>();
            }
            map.put("ec_mix_mall_event_id", UUID.randomUUID().toString());
            C1741420vPw.LIZ.getClass();
            C0NOF.LIZ.getClass();
            interfaceC606320NqI.LIZLLL(str, map, null, z);
            new AwS158S1100000_9(str, (String) map, (Map<String, Object>) 34);
            C189200o6.m2constructorimpl(Unit.LIZ);
            return;
        }
        if (map == null) {
            try {
                map = new LinkedHashMap<>();
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return;
            }
        }
        map.put("ec_mix_mall_event_id", UUID.randomUUID().toString());
        C1741420vPw.LIZ.getClass();
        C0NOF.LIZ.getClass();
        interfaceC606320NqI.LIZLLL(str, map, null, z);
        new AwS158S1100000_9(str, (String) map, (Map<String, Object>) 34);
        C189200o6.m2constructorimpl(Unit.LIZ);
    }
}
