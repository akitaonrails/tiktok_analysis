package X;

import com.bytedance.keva.Keva;
import com.bytedance.keva.KevaImpl;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Arrays;

/* JADX INFO: renamed from: X.053w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C12922053w {
    public static Keva LIZ() {
        String curUserId = ((C1400340mXo) C0I0B.LJFF.LIZ()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        return KevaImpl.getRepo(C786410Ut5.j4("ABConfigByUserKv%s", Arrays.copyOf(new Object[]{curUserId}, 1)), 1);
    }

    public static void LIZIZ(Object obj, String str) {
        Keva kevaLIZ = LIZ();
        if (obj instanceof Integer) {
            kevaLIZ.storeInt(str, ((Number) obj).intValue());
            return;
        }
        if (obj instanceof Boolean) {
            kevaLIZ.storeBoolean(str, ((Boolean) obj).booleanValue());
            return;
        }
        if (obj instanceof String) {
            kevaLIZ.storeString(str, (String) obj);
            return;
        }
        if (obj instanceof Float) {
            kevaLIZ.storeFloat(str, ((Number) obj).floatValue());
            return;
        }
        if (obj instanceof Long) {
            kevaLIZ.storeLong(str, ((Number) obj).longValue());
            return;
        }
        try {
            kevaLIZ.storeString(str, C051M.LIZ.LJIILL(obj));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Failed to store json for key ");
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }
}
