package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.01R9, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01R9 {
    public static final C01R9 LIZ = new C01R9();
    public static final C01R8 LIZIZ = new InterfaceC914420Zu4() { // from class: X.01R8
        @Override // X.InterfaceC914420Zu4
        public final void LIZ(String str) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onRemoved, businessId: ");
            sbLIZ.append(str);
            C20441214yg.LIZIZ("AnchorAudienceSyncSend", C2188811AlT.LIZIZ(sbLIZ));
        }

        @Override // X.InterfaceC914420Zu4
        public final void LIZIZ(String str, Map<String, String> map) {
            if (Intrinsics.LJFF(str, "gift_sync_sei")) {
                C01R9.LIZ.getClass();
                if (!map.isEmpty()) {
                    try {
                        C189200o6.m2constructorimpl(C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C317601La(map, null), 2));
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        C189200o6.m2constructorimpl(new C098200Yq(th));
                    }
                }
            }
        }
    };
}
