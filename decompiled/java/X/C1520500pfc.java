package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS212S0000000_23;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pfc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1520500pfc {
    public static final C1520500pfc LIZ = new C1520500pfc();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(110));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS212S0000000_23.get$arr$(111));

    public static void LIZ(C1520560pfi c1520560pfi) {
        try {
            C1521040pgU c1521040pgU = new C1521040pgU(c1520560pfi.LJII());
            AbstractC1521020pgS[] abstractC1521020pgSArr = (AbstractC1521020pgS[]) LIZIZ.getValue();
            int length = abstractC1521020pgSArr.length;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (abstractC1521020pgSArr[i].LIZ(c1521040pgU)) {
                        break;
                    } else {
                        i++;
                    }
                } else if (c1520560pfi.LJIIIIZZ != EnumC993170bx5.Slardar) {
                    new AbstractC1521020pgS() { // from class: X.0pgW
                        @Override // X.AbstractC1521020pgS
                        public final boolean LIZ(C1521040pgU c1521040pgU2) {
                            if (!Intrinsics.LJFF(c1521040pgU2.LIZ("ev_type"), "custom")) {
                                return false;
                            }
                            String strValueOf = String.valueOf(c1521040pgU2.LIZJ("client_extra.event_name", ""));
                            JSONObject jSONObject = new JSONObject();
                            C12868051u.LJFF(jSONObject, c1521040pgU2.LIZ("client_category"), c1521040pgU2.LIZ("client_metric"), AbstractC1521020pgS.LIZIZ(c1521040pgU2));
                            AbstractC1521020pgS.LIZJ(strValueOf, C12868051u.LJIIIZ(jSONObject, C12868051u.LIZIZ));
                            return true;
                        }
                    }.LIZ(c1521040pgU);
                }
            }
            C189200o6.m2constructorimpl(Unit.LIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
