package X;

import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0qV4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1552400qV4 {
    public List<AbstractC1553220qWO> LIZ;

    public final void LIZ() {
        List<AbstractC1553220qWO> list = this.LIZ;
        if (list == null || ((CopyOnWriteArrayList) list).isEmpty()) {
            return;
        }
        C1553130qWF.LIZ("gecko-debug-tag", "global settings notify finish");
        Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it2.hasNext()) {
            ((AbstractC1553220qWO) it2.next()).LIZ();
        }
    }

    public final void LIZIZ(GlobalConfigSettings globalConfigSettings) {
        List<AbstractC1553220qWO> list = this.LIZ;
        if (list != null && !((CopyOnWriteArrayList) list).isEmpty()) {
            C1553130qWF.LIZ("gecko-debug-tag", "global settings notify update");
            Iterator it2 = ((CopyOnWriteArrayList) this.LIZ).iterator();
            while (it2.hasNext()) {
                ((AbstractC1553220qWO) it2.next()).LIZIZ(globalConfigSettings);
            }
        }
    }
}
