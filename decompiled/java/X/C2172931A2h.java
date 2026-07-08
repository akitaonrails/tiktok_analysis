package X;

import com.bytedance.keva.Keva;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1A2h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C2172931A2h {
    public final C01GW LIZ = C1509305vX.LIZ(new C2172941A2i());

    public final Keva LIZ() {
        return (Keva) this.LIZ.getValue();
    }

    public final boolean LIZIZ(String str) {
        String strLIZIZ = C461720I8s.LIZIZ();
        if (Intrinsics.LJFF(strLIZIZ, "-1")) {
            return false;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clicked_awemes_");
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("last_update_time_");
        sbLIZ2.append(strLIZIZ);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
        if (!C1387310mCn.LJFF(LIZ().getLong(strLIZIZ3, 0L))) {
            LIZ().storeStringSet(strLIZIZ2, C08CX.INSTANCE);
            LIZ().storeLong(strLIZIZ3, System.currentTimeMillis());
            return false;
        }
        return LIZ().getStringSet(strLIZIZ2, C08CX.INSTANCE).contains(str);
    }

    public final void LIZJ(String str) {
        String strLIZIZ = C461720I8s.LIZIZ();
        if (Intrinsics.LJFF(strLIZIZ, "-1")) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("clicked_awemes_");
        sbLIZ.append(strLIZIZ);
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("last_update_time_");
        sbLIZ2.append(strLIZIZ);
        if (!C1387310mCn.LJFF(LIZ().getLong(C2188811AlT.LIZIZ(sbLIZ2), 0L))) {
            LIZ().storeStringSet(strLIZIZ2, Collections.singleton(str));
            Keva kevaLIZ = LIZ();
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("last_update_time_");
            sbLIZ3.append(strLIZIZ);
            kevaLIZ.storeLong(C2188811AlT.LIZIZ(sbLIZ3), System.currentTimeMillis());
            return;
        }
        Set<String> stringSet = LIZ().getStringSet(strLIZIZ2, C08CX.INSTANCE);
        stringSet.add(str);
        LIZ().storeStringSet(strLIZIZ2, stringSet);
        Keva kevaLIZ2 = LIZ();
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("last_update_time_");
        sbLIZ4.append(strLIZIZ);
        kevaLIZ2.storeLong(C2188811AlT.LIZIZ(sbLIZ4), System.currentTimeMillis());
    }
}
