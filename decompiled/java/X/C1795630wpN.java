package X;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0wpN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public class C1795630wpN {
    public AbstractC19884912r9 LIZ;

    public final C1796050wq3 LIZ() {
        if (this.LIZ != null) {
            return new C1796050wq3(this);
        }
        throw new IllegalArgumentException("Product list must be set to a non empty list.");
    }

    public final void LIZIZ(List list) {
        if (list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                C1795970wpv c1795970wpv = (C1795970wpv) it2.next();
                if (!"play_pass_subs".equals(c1795970wpv.LIZIZ)) {
                    hashSet.add(c1795970wpv.LIZIZ);
                }
            }
            if (hashSet.size() <= 1) {
                this.LIZ = AbstractC19884912r9.zzj(list);
                return;
            }
            throw new IllegalArgumentException("All products should be of the same product type.");
        }
        throw new IllegalArgumentException("Product list cannot be empty.");
    }
}
