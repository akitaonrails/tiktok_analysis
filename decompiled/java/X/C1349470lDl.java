package X;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0lDl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1349470lDl {
    public static final AtomicBoolean LIZ = new AtomicBoolean(false);

    public static void LIZ() {
        if (LIZ.compareAndSet(false, true)) {
            C1349500lDo c1349500lDo = C1349500lDo.LIZ;
            ConcurrentHashMap<EnumC1347870lBB, InterfaceC1348290lBr> concurrentHashMap = C1348280lBq.LIZ;
            concurrentHashMap.put(c1349500lDo.getId(), c1349500lDo);
            C1349460lDk c1349460lDk = C1349460lDk.LIZ;
            concurrentHashMap.put(c1349460lDk.getId(), c1349460lDk);
            C1349480lDm c1349480lDm = C1349480lDm.LIZ;
            concurrentHashMap.put(c1349480lDm.getId(), c1349480lDm);
            C1349490lDn c1349490lDn = C1349490lDn.LIZ;
            concurrentHashMap.put(c1349490lDn.getId(), c1349490lDn);
        }
    }
}
