package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.NetworkInterface;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS231S0000000_3;

/* JADX INFO: renamed from: X.09GB, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09GB {
    public static String LIZ() {
        try {
            ArrayList list = Collections.list(NetworkInterface.getNetworkInterfaces());
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(Collections.list(((NetworkInterface) it2.next()).getInetAddresses()), arrayList);
            }
            return (String) C09RB.LJIIL(new C08LY(C09RB.LJIIIZ(new C08LY(C09RB.LJIIIZ(new C1939607ik(arrayList), AFwS231S0000000_3.get$arr$(30)), AFwS231S0000000_3.get$arr$(31)), new C020N(true, 1)), new C020N(true, 2)));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return null;
        }
    }
}
