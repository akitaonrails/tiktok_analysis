package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: renamed from: X.04y5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1270304y5 {
    public static <T> T LIZ(Class<T> cls) {
        Set<T> services = ServiceManager.get().getServices(cls);
        if (services != null && !services.isEmpty()) {
            return (T) ListProtector.get(new ArrayList(services), 0);
        }
        return null;
    }
}
