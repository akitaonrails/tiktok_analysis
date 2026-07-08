package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0jcL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287830jcL {
    public static final C01GW LIZ = C452501pT.LIZIZ(new C1287820jcK());

    public static boolean LIZ(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        try {
            Iterator it2 = ((List) LIZ.getValue()).iterator();
            while (it2.hasNext()) {
                if (((Regex) it2.next()).matches(str)) {
                    if (Intrinsics.LJFF(a0.LJJLIIIJ(str, new char[]{'.'}, false, 0, 6).get(1), "b0")) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return true;
        }
    }

    public static void LIZIZ(int i, String str, PageInfo pageInfo, Object obj) {
        C18CE.LJII(C18CE.LIZ, i, str, obj, pageInfo, true, false, null, false, null, null, 992);
    }
}
