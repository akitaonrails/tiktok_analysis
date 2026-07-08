package X;

import androidx.lifecycle.LifecycleOwner;
import com.bytedance.scene.Scene;
import java.util.ArrayList;
import java.util.Stack;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0E5X, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E5X {
    public static final C0E5X LIZ = new C0E5X();
    public static final ConcurrentHashMap<String, ArrayList<C0E9K>> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C0E5Y> LIZJ = new ConcurrentHashMap<>();
    public static final Stack<String> LIZLLL = new Stack<>();

    public static LifecycleOwner LIZ() {
        Scene lifecycleOwner;
        String str = (String) C13LP.LJJLIIIJL(LIZLLL);
        if (str != null) {
            ConcurrentHashMap<String, C0E5Y> concurrentHashMap = LIZJ;
            if (concurrentHashMap.containsKey(str)) {
                C0E5Y c0e5y = concurrentHashMap.get(str);
                if (c0e5y != null && (lifecycleOwner = c0e5y.getLifecycleOwner()) != null) {
                    return lifecycleOwner;
                }
                "CKLifecycleManager lifecycleProvider is null ".toString();
                throw new IllegalArgumentException("CKLifecycleManager lifecycleProvider is null ");
            }
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CKLifecycleManager#lifecycleProviderMap does not contains key = ");
        sbLIZ.append(str);
        throw new IllegalStateException(C2188811AlT.LIZIZ(sbLIZ));
    }
}
