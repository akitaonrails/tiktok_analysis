package X;

import Y.AObjectS56S0000000_3;
import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;

/* JADX INFO: renamed from: X.08ee, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2169008ee {
    public static Context LIZJ;
    public static boolean LIZLLL;
    public static final C2169008ee LIZ = new C2169008ee();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("CutSameJni", "DavinciResourceJni", "NLEResourcesDAVJni", "NLETemplateModelJni");
    public static final AObjectS56S0000000_3 LJ = new AObjectS56S0000000_3(2);

    public final void LIZ() {
        if (LIZLLL) {
            return;
        }
        synchronized (this) {
            try {
                if (LIZLLL) {
                    return;
                }
                for (String str : LIZIZ) {
                    LJ.getClass();
                    new C2168808ec().LIZ(str);
                }
                LIZLLL = true;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
