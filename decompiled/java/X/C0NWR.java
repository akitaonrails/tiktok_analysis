package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS195S0000000_9;

/* JADX INFO: renamed from: X.0NWR, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NWR {
    public static long LIZLLL;
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final AtomicBoolean LIZJ = new AtomicBoolean(false);
    public static final List<C09AE> LJ = new ArrayList();
    public static final C01GW LJFF = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(494));
    public static final C01GW LJI = C452501pT.LIZIZ(AFwS195S0000000_9.get$arr$(598));

    public static Map LIZ(Long l, String str) {
        long jLongValue;
        Pair[] pairArr = new Pair[4];
        pairArr[0] = new Pair("page_name", "mall");
        int i = 1;
        pairArr[1] = new Pair(Scene.SCENE_SERVICE, str);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        pairArr[2] = new Pair("stay_time", Long.valueOf(jLongValue));
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) LJFF.getValue()).getRootPageMonitor();
        if (rootPageMonitor != null) {
            i = 1 ^ (rootPageMonitor.LJFF() ? 1 : 0);
        }
        pairArr[3] = new Pair("is_foreground", Integer.valueOf(i));
        return C2097608Jq.LJIIIIZZ(pairArr);
    }
}
