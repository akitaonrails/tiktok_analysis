package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1BOq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2204221BOq implements InterfaceC2204471BPp<JSONObject, Map<?, ?>> {
    public static final C1323820kYO LIZIZ = new C1323820kYO(new JSONObject());
    public final InterfaceC1063690dmp LIZ;

    public C2204221BOq(InterfaceC1063690dmp interfaceC1063690dmp) {
        this.LIZ = interfaceC1063690dmp;
    }

    @Override // X.InterfaceC2204471BPp
    public final void LIZ(C1BP6 c1bp6, Object obj, final C1BPO c1bpo, final C2204431BPl c2204431BPl) {
        C1323820kYO c1323820kYO;
        JSONObject jSONObject = (JSONObject) obj;
        InterfaceC1063690dmp interfaceC1063690dmp = this.LIZ;
        C1059860dge c1059860dge = new C1059860dge();
        final String string = c1bp6.toString();
        c1059860dge.LIZIZ(InterfaceC1052500dUm.class, new InterfaceC1052500dUm() { // from class: X.1BOs
            @Override // X.InterfaceC1052500dUm
            public final String LIZ() {
                return string;
            }
        });
        c1059860dge.LIZIZ(InterfaceC1878020yyG.class, new InterfaceC1878020yyG() { // from class: X.1BOt
            @Override // X.InterfaceC1878020yyG
            public final void getNameSpace() {
            }
        });
        c1059860dge.LIZLLL(Context.class, C1542560qFC.LIZ);
        final WeakReference weakReference = new WeakReference(c1bp6);
        c1059860dge.LIZIZ(InterfaceC1548390qOb.class, new InterfaceC1548390qOb() { // from class: X.18Qa
            @Override // X.InterfaceC1548390qOb
            public final void H4(InterfaceC1107590evd interfaceC1107590evd, String str) {
                Map<String, Object> mapLIZ;
                InterfaceC21281518Qb interfaceC21281518Qb = weakReference.get();
                if (interfaceC21281518Qb != null) {
                    if (interfaceC1107590evd != null) {
                        mapLIZ = interfaceC1107590evd.LIZ();
                    } else {
                        mapLIZ = null;
                    }
                    interfaceC21281518Qb.LIZ(mapLIZ, str);
                }
            }
        });
        interfaceC1063690dmp.LIZ(c1059860dge);
        if (jSONObject != null) {
            c1323820kYO = new C1323820kYO(jSONObject);
        } else {
            c1323820kYO = LIZIZ;
        }
        this.LIZ.LIZIZ(c1323820kYO, new InterfaceC1063920dnC() { // from class: X.1BNm
            @Override // X.InterfaceC1063920dnC
            public final void LIZ(Map<String, Object> map) {
                Object c098200Yq;
                String str;
                InterfaceC1530550pvp<Map<?, ?>> interfaceC1530550pvp = c1bpo;
                InterfaceC1530550pvp<C2204191BOn> interfaceC1530550pvp2 = c2204431BPl;
                try {
                    Object obj2 = map.get("code");
                    Object obj3 = map.get("msg");
                    Map<?, ?> map2 = null;
                    if (obj3 instanceof String) {
                        str = (String) obj3;
                    } else {
                        str = null;
                    }
                    if (Intrinsics.LJFF(obj2, 1)) {
                        Object obj4 = map.get("data");
                        if (obj4 instanceof Map) {
                            map2 = (Map) obj4;
                        }
                        interfaceC1530550pvp.accept(map2);
                    } else {
                        interfaceC1530550pvp2.accept(new C2204191BOn(((Integer) obj2).intValue(), str));
                    }
                    c098200Yq = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                InterfaceC1530550pvp<C2204191BOn> interfaceC1530550pvp3 = c2204431BPl;
                Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
                if (thM5exceptionOrNullimpl != null) {
                    interfaceC1530550pvp3.accept(new C2204191BOn(thM5exceptionOrNullimpl.getMessage()));
                }
            }
        }, EnumC1059790dgX.ALL);
        c1bp6.LIZIZ.LIZJ(new InterfaceC1542530qF9() { // from class: X.1BOr
            @Override // X.InterfaceC1542530qF9
            public final void release() {
                this.LIZIZ.LIZ.release();
            }
        });
    }
}
