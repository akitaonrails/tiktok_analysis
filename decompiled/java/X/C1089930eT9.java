package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;

/* JADX INFO: renamed from: X.0eT9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1089930eT9 {
    public static final C1089930eT9 LIZ = new C1089930eT9();

    public static final Object LIZ(String str, String str2, Map<String, ? extends Object> map) {
        try {
            return C2215811Bnv.LIZ(str2, map);
        } catch (C2215701Bnk e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("execute failed strategyName = ");
            sbLIZ.append(str);
            sbLIZ.append(" error is ");
            sbLIZ.append(e.getMessage());
            C0J6C.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
            return Boolean.FALSE;
        }
    }
}
