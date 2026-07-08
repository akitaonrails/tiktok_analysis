package X;

import Y.AObjectS78S0000000_28;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10c9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19282310c9 {
    public static final C01GW LIZ = C452501pT.LIZIZ(new AObjectS78S0000000_28(22));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new AObjectS78S0000000_28(23));
    public static final C01GW LIZJ = C452501pT.LIZIZ(new AObjectS78S0000000_28(24));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(new AObjectS78S0000000_28(25));

    public static void LIZ(Function0 function0) {
        if (!((Boolean) LIZ.getValue()).booleanValue()) {
            return;
        }
        List list = (List) LIZLLL.getValue();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0W4R.LIZIZ(System.currentTimeMillis()));
        sbLIZ.append("# ");
        sbLIZ.append((String) function0.invoke());
        sbLIZ.append(" \n");
        list.add(C2188811AlT.LIZIZ(sbLIZ));
    }

    public static void LIZIZ(String str, Function0 function0) {
        try {
            if (!((Boolean) LIZ.getValue()).booleanValue()) {
                return;
            }
            List list = (List) LIZJ.getValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C0W4R.LIZIZ(System.currentTimeMillis()));
            sbLIZ.append("# ");
            sbLIZ.append(str);
            sbLIZ.append(": ");
            sbLIZ.append((String) function0.invoke());
            sbLIZ.append(" \n");
            list.add(C2188811AlT.LIZIZ(sbLIZ));
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("putRunTimeInfo error: ");
            sbLIZ2.append(e.getMessage());
            System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ2));
        }
    }
}
