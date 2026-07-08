package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.react.bridge.ReadableMap;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BPH, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BPH implements InterfaceC2204471BPp<JSONObject, Map<?, ?>> {
    public final InterfaceC1063710dmr LIZ;

    public C1BPH(InterfaceC1063710dmr interfaceC1063710dmr) {
        this.LIZ = interfaceC1063710dmr;
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, C1BPO c1bpo, C2204431BPl c2204431BPl) {
        JSONObject jSONObject = (JSONObject) obj;
        InterfaceC1063710dmr interfaceC1063710dmr = this.LIZ;
        C1544610qIV c1544610qIV = new C1544610qIV();
        final String string = c1bp6.toString();
        c1544610qIV.LIZ(InterfaceC1887690zDr.class, new InterfaceC1887690zDr() { // from class: X.1BQQ
            @Override // X.InterfaceC1887690zDr
            public final String LIZ() {
                return string;
            }
        });
        c1544610qIV.LIZLLL = c1bp6.toString();
        c1544610qIV.LIZ(InterfaceC1878040yyI.class, new InterfaceC1878040yyI() { // from class: X.1BQR
            @Override // X.InterfaceC1878040yyI
            public final void getNameSpace() {
            }
        });
        c1544610qIV.LJ(Context.class, C1542560qFC.LIZ);
        final WeakReference weakReference = new WeakReference(c1bp6);
        c1544610qIV.LIZ(InterfaceC1063720dms.class, new InterfaceC1063720dms() { // from class: X.18Qc
            @Override // X.InterfaceC1063720dms
            public final void LIZ(String str, Map<String, ? extends Object> map) {
                InterfaceC21281518Qb interfaceC21281518Qb = weakReference.get();
                if (interfaceC21281518Qb != null) {
                    interfaceC21281518Qb.LIZ(map, str);
                }
            }
        });
        interfaceC1063710dmr.setBridgeContext(c1544610qIV);
        final C2203931BNn c2203931BNn = new C2203931BNn(c1bpo, c2204431BPl);
        InterfaceC1543380qGW interfaceC1543380qGW = new InterfaceC1543380qGW(this) { // from class: X.0dmq
            @Override // X.InterfaceC1543380qGW
            public final void LIZIZ(Object obj2) {
                Object c098200Yq;
                Map<String, ? extends Object> mapLJ;
                C2203931BNn c2203931BNn2 = this.LIZ;
                try {
                    if (obj2 instanceof JSONObject) {
                        C1543800qHC.LIZ.getClass();
                        mapLJ = C1543800qHC.LIZIZ((JSONObject) obj2);
                    } else if (obj2 instanceof ReadableMap) {
                        mapLJ = ((ReadableMap) obj2).toHashMap();
                    } else {
                        mapLJ = C2097608Jq.LJ();
                    }
                    c2203931BNn2.LIZ(mapLJ);
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                C2203931BNn c2203931BNn3 = this.LIZ;
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("code", 0);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("call bridge failed, error = ");
                    sbLIZ.append(thM5exceptionOrNullimpl.getMessage());
                    linkedHashMap.put("msg", C2188811AlT.LIZIZ(sbLIZ));
                    c2203931BNn3.LIZ(linkedHashMap);
                }
            }
        };
        InterfaceC1063710dmr interfaceC1063710dmr2 = this.LIZ;
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        new C1544470qIH(interfaceC1063710dmr2, jSONObject).LIZJ(interfaceC1543380qGW);
        c1bp6.LIZIZ.LIZJ(new InterfaceC1542530qF9() { // from class: X.1BQB
            @Override // X.InterfaceC1542530qF9
            public final void release() {
                this.LIZIZ.LIZ.release();
            }
        });
    }
}
