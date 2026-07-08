package X;

import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0vTh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1743750vTh {
    public static void LIZ(InterfaceC1743770vTj interfaceC1743770vTj) {
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        HashSet<String> hashSetRemove = C1743760vTi.LIZ.remove(interfaceC1743770vTj);
        if (hashSetRemove != null) {
            Iterator<String> it2 = hashSetRemove.iterator();
            while (it2.hasNext()) {
                iEventCenter.LIZJ(it2.next(), interfaceC1743770vTj);
            }
        }
    }

    public static void LIZIZ(InterfaceC1743770vTj interfaceC1743770vTj, String... strArr) {
        IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        HashSet<String> hashSet = C1743760vTi.LIZ.get(interfaceC1743770vTj);
        if (hashSet == null) {
            hashSet = new HashSet<>();
        }
        for (String str : strArr) {
            iEventCenter.LIZLLL(str, interfaceC1743770vTj);
        }
        C19719612Di.LJJII(hashSet, strArr);
        C1743760vTi.LIZ.put(interfaceC1743770vTj, hashSet);
    }
}
