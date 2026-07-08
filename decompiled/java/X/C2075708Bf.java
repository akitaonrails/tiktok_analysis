package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.08Bf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2075708Bf {
    public static volatile C2075708Bf LIZ;

    public static C2075708Bf LIZ() {
        if (LIZ == null) {
            synchronized (C2075708Bf.class) {
                try {
                    if (LIZ == null) {
                        LIZ = new C2075708Bf();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LIZ;
    }

    public static List LIZIZ(String str) {
        ArrayList arrayList = new ArrayList();
        if (C2093608Ic.LJ(str)) {
            return arrayList;
        }
        for (String str2 : str.split(",")) {
            if (!C2093608Ic.LJ(str2)) {
                arrayList.add(str2.trim());
            }
        }
        return arrayList;
    }
}
