package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04kE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1184404kE {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(String str, Function0<Boolean> function0) {
        try {
            return function0.invoke().booleanValue();
        } catch (ClassNotFoundException e) {
            TryCatchGuardChecker.doCheck(e);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ClassNotFound: ");
            if (str == null) {
                str = "";
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            return false;
        } catch (NoSuchMethodException e2) {
            TryCatchGuardChecker.doCheck(e2);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("NoSuchMethod: ");
            if (str == null) {
                str = "";
            }
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            return false;
        }
    }
}
