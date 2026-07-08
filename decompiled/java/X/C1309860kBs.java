package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.lynx.tasm.LynxEnv;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0kBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1309860kBs {
    public final boolean LIZ = LynxEnv.inst().enableFSP();
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public boolean LJIIJ;

    public static int LIZ(int i, String str, HashMap map) {
        Object obj;
        if (map == null || (obj = map.get(str)) == null) {
            return i;
        }
        if (obj instanceof String) {
            try {
                i = CastIntegerProtector.parseInt(((String) obj).trim());
                return i;
            } catch (NumberFormatException e) {
                TryCatchGuardChecker.doCheck(e);
                return i;
            }
        }
        if (obj instanceof Number) {
            return ((Number) obj).intValue();
        }
        return i;
    }
}
