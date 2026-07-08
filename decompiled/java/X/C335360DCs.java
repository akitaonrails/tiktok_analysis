package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.cashier.IPIPOCashierAgentBridgeService;
import java.util.HashMap;
import kotlin.jvm.internal.AwS548S0100000_4;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0DCs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C335360DCs implements InterfaceC335770DEh {
    public static final C335360DCs LIZ = new C335360DCs();
    public static final HashMap<String, InterfaceC335280DCk> LIZIZ = new HashMap<>();
    public static final HashMap<String, C335380DCu> LIZJ = new HashMap<>();

    @Override // X.InterfaceC335770DEh
    public final InterfaceC335280DCk LIZ(C0DF6 c0df6) {
        boolean z;
        synchronized (this) {
            try {
                String str = c0df6.LIZIZ;
                boolean z2 = false;
                if (str == null || a0.LJJJIL(str)) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    InterfaceC335280DCk interfaceC335280DCk = C335370DCt.LIZ.get(str);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("get: containerId=");
                    sbLIZ.append(str);
                    sbLIZ.append(", hit=");
                    if (interfaceC335280DCk != null) {
                        z2 = true;
                    }
                    sbLIZ.append(z2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    if (interfaceC335280DCk != null) {
                        return interfaceC335280DCk;
                    }
                }
                HashMap<String, InterfaceC335280DCk> map = LIZIZ;
                InterfaceC335280DCk interfaceC335280DCk2 = map.get(c0df6.LIZIZ);
                if (interfaceC335280DCk2 != null) {
                    return interfaceC335280DCk2;
                }
                IPIPOCashierAgentBridgeService iPIPOCashierAgentBridgeService = (IPIPOCashierAgentBridgeService) PluggableExtentionKt.pluggableSpi$default(IPIPOCashierAgentBridgeService.class, false, false, false, 14, null);
                if (iPIPOCashierAgentBridgeService == null) {
                    return null;
                }
                C1712870uft c1712870uftLIZ = iPIPOCashierAgentBridgeService.LIZ(c0df6.LIZ);
                map.put(c0df6.LIZIZ, c1712870uftLIZ);
                C335360DCs c335360DCs = LIZ;
                Context context = c0df6.LIZ;
                String str2 = c0df6.LIZIZ;
                c335360DCs.getClass();
                LIZJ(c1712870uftLIZ, context, str2);
                return c1712870uftLIZ;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(C1896707bp c1896707bp) {
        synchronized (this) {
            try {
                String str = c1896707bp.LIZ;
                if (str != null) {
                    C335380DCu c335380DCuRemove = LIZJ.remove(str);
                    InterfaceC335280DCk interfaceC335280DCkRemove = LIZIZ.remove(str);
                    if (interfaceC335280DCkRemove != null && c335380DCuRemove != null) {
                        interfaceC335280DCkRemove.LJFF(null);
                    }
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(InterfaceC335280DCk interfaceC335280DCk, Context context, String str) {
        InterfaceC333090D3z interfaceC333090D3z;
        C335000DBi.LIZJ.getClass();
        C332750D2r c332750D2r = null;
        if ((context instanceof InterfaceC333090D3z) && (interfaceC333090D3z = (InterfaceC333090D3z) context) != null) {
            C335000DBi c335000DBiG4 = interfaceC333090D3z.g4();
            if ((c335000DBiG4 instanceof C335000DBi) && c335000DBiG4 != null) {
                c332750D2r = new C332750D2r(c335000DBiG4, interfaceC333090D3z.ee());
            }
        }
        C335380DCu c335380DCu = new C335380DCu(new AwS548S0100000_4(c332750D2r, 485));
        interfaceC335280DCk.LJFF(c335380DCu);
        LIZJ.put(str, c335380DCu);
    }
}
