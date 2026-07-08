package X;

import android.app.Activity;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.18EN, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18EN {
    public static final ConcurrentHashMap<C589920NBu<Activity>, C18E9> LIZ = new ConcurrentHashMap<>();

    public static InterfaceC21252118Et LIZ(Object obj) {
        C18E9 c18e9LIZIZ = LIZIZ(obj);
        if (c18e9LIZIZ != null) {
            return c18e9LIZIZ.LIZIZ(obj);
        }
        return null;
    }

    public static C18E9 LIZIZ(Object obj) {
        if (obj instanceof Activity) {
            return LIZ.get(new C589920NBu(obj));
        }
        Activity activityLIZJ = C789730UyR.LIZJ(obj);
        if (activityLIZJ != null) {
            return LIZ.get(new C589920NBu(activityLIZJ));
        }
        return null;
    }

    public static C18E9 LIZJ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        for (Map.Entry<C589920NBu<Activity>, C18E9> entry : LIZ.entrySet()) {
            if (Intrinsics.LJFF(entry.getValue().LL, str)) {
                return entry.getValue();
            }
        }
        return null;
    }

    public static void LIZLLL(C18E9 c18e9) {
        Object objLJIIJ = c18e9.LLILLL.LJIIJ();
        if ((objLJIIJ instanceof Activity) && objLJIIJ != null) {
            LIZ.put(new C589920NBu<>(objLJIIJ), c18e9);
        }
    }
}
