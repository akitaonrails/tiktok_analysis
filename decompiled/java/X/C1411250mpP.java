package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0mpP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1411250mpP {
    public static void LIZIZ(InterfaceC1411260mpQ interfaceC1411260mpQ, long j, String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Effect interface: ");
        sbLIZ.append(interfaceC1411260mpQ.LIZIZ());
        sbLIZ.append(" send effect Msg: arg2: ");
        sbLIZ.append(j);
        sbLIZ.append(" msg: ");
        sbLIZ.append(str);
        C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
        interfaceC1411260mpQ.getCameraApiComponent().St2().sendEffectMsg(41, 41L, j, str);
    }

    public static boolean LIZ(InterfaceC1411260mpQ interfaceC1411260mpQ, int i, int i2, int i3, String str) {
        if (str == null) {
            return false;
        }
        if (!interfaceC1411260mpQ.LIZLLL() && C0CHQ.LIZ().getAccountService().LIZ()) {
            return false;
        }
        try {
            if (!Intrinsics.LJFF(interfaceC1411260mpQ.LIZIZ(), new JSONObject(str).optString("interface"))) {
                return false;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Effect interface: ");
            sbLIZ.append(interfaceC1411260mpQ.LIZIZ());
            sbLIZ.append(" handle msg: ");
            sbLIZ.append(i);
            sbLIZ.append(" , ");
            sbLIZ.append(i2);
            sbLIZ.append(" , ");
            sbLIZ.append(i3);
            sbLIZ.append(" , ");
            sbLIZ.append(str);
            C201955140j.LJIIL(C2188811AlT.LIZIZ(sbLIZ));
            return true;
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
            return false;
        }
    }
}
