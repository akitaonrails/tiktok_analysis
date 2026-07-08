package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import go5.c;
import oo5.b;

/* JADX INFO: renamed from: X.0uyS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1724380uyS {
    public static String LIZ(String str) {
        try {
            b.LJIJJLI.getClass();
            c cVar = b.LIZLLL().LJIIIIZZ;
            if (cVar != null) {
                String value = cVar.getValue(str);
                if (value != null) {
                    return value;
                }
                return "";
            }
            return "";
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return "";
        }
    }
}
