package X;

import com.bytedance.android.livesdk.livesetting.broadcast.GeckoDownloadZipObserverABSetting;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.0qW3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1553010qW3 {
    public static final C1553010qW3 LIZ = new C1553010qW3();
    public static C1554340qYC LIZIZ;

    public static void LIZ() {
        C1554340qYC c1554340qYC;
        if (!GeckoDownloadZipObserverABSetting.INSTANCE.isMatch() || (c1554340qYC = LIZIZ) == null) {
            return;
        }
        synchronized (C1551820qU8.class) {
            Map<AbstractC1552040qUU, Map<Class<? extends AbstractC1552240qUo<?, ?>>, AbstractC1552800qVi>> map = C1551820qU8.LIZJ;
            if (map == null) {
                return;
            }
            Map map2 = (Map) ((ConcurrentHashMap) map).get(c1554340qYC);
            if (map2 == null) {
                return;
            }
            for (Map.Entry entry : map2.entrySet()) {
                C1552210qUl.LIZJ((Class) entry.getKey(), (AbstractC1552800qVi) entry.getValue());
            }
        }
    }
}
