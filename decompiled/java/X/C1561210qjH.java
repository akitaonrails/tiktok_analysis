package X;

import android.util.LruCache;
import com.bytedance.ttnet.TTNetInit;
import com.ss.android.ugc.aweme.ecommerce.image.EcomPriorityData;
import kotlin.jvm.internal.AwS17S1001000_24;

/* JADX INFO: renamed from: X.0qjH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1561210qjH {
    public static final LruCache<String, Boolean> LIZ = new LruCache<>(100);
    public static final LruCache<String, Boolean> LIZIZ = new LruCache<>(100);
    public static boolean LIZJ;
    public static boolean LIZLLL;

    public static boolean LIZ(String str) {
        if (LIZIZ.get(str) != null) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(String str) {
        EcomPriorityData ecomPriorityData = C1326850kdH.LIZ;
        if (ecomPriorityData.weakNetworkControl) {
            int effectiveConnectionType = TTNetInit.getEffectiveConnectionType();
            if (ecomPriorityData.priorityReverse) {
                if (effectiveConnectionType > ecomPriorityData.weakNetworkLevel) {
                    new AwS17S1001000_24(effectiveConnectionType, str, 1);
                    return;
                } else {
                    new AwS17S1001000_24(effectiveConnectionType, str, 2);
                    LIZ.put(str, Boolean.TRUE);
                    return;
                }
            }
            if (effectiveConnectionType <= ecomPriorityData.weakNetworkLevel) {
                new AwS17S1001000_24(effectiveConnectionType, str, 3);
                return;
            } else {
                new AwS17S1001000_24(effectiveConnectionType, str, 4);
                LIZ.put(str, Boolean.TRUE);
                return;
            }
        }
        LIZ.put(str, Boolean.TRUE);
    }

    public static void LIZJ(String str) {
        EcomPriorityData ecomPriorityData = C1326850kdH.LIZ;
        if (ecomPriorityData.skipDuringMallRefresh) {
            if (!LIZLLL) {
                LIZIZ(str);
            }
        } else {
            if (ecomPriorityData.afterMallRefresh) {
                if (!LIZJ) {
                    return;
                }
                LIZIZ(str);
                return;
            }
            LIZIZ(str);
        }
    }
}
