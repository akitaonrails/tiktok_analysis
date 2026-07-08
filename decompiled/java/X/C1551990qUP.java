package X;

import Y.ARunnableS8S0202000_23;
import android.text.TextUtils;
import com.bytedance.geckox.policy.v4.UpdateModel;
import com.bytedance.geckox.settings.model.GlobalConfigSettings;
import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0qUP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551990qUP {
    public static Map<String, Map<String, UpdateModel>> LJFF;
    public Map<String, List<GlobalConfigSettings.SyncItem>> LIZJ;
    public Map<String, List<GlobalConfigSettings.SyncItem>> LJ;
    public final AtomicBoolean LIZ = new AtomicBoolean(false);
    public final AtomicInteger LIZLLL = new AtomicInteger(-1);
    public final C1551530qTf LIZIZ = C797990VSb.LIZ.LJFF();

    public final List<GlobalConfigSettings.SyncItem> LIZIZ(String str, boolean z) {
        Map<String, List<GlobalConfigSettings.SyncItem>> map;
        List<GlobalConfigSettings.SyncItem> list;
        if (!C797990VSb.LIZ.LJIIIZ() || TextUtils.isEmpty(str) || (map = this.LIZJ) == null || ((HashMap) map).isEmpty()) {
            return null;
        }
        if (z) {
            list = (List) ((HashMap) this.LIZJ).remove(str);
            Map<String, Map<String, UpdateModel>> map2 = LJFF;
            if (map2 != null) {
                ((ConcurrentHashMap) map2).remove(str);
            }
        } else {
            list = (List) ((HashMap) this.LIZJ).get(str);
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("registered occasion is triggered:");
        sbLIZ.append(str);
        C1553130qWF.LIZ("gecko-debug-tag", C2188811AlT.LIZIZ(sbLIZ), list);
        return list;
    }

    public final void LIZ(int i, int i2, List list) {
        Map<String, List<GlobalConfigSettings.SyncItem>> map;
        boolean zLJI = MethodIDManager.LJI(137369);
        if (i == 6 && this.LIZLLL.decrementAndGet() == 0 && (map = this.LJ) != null && !((ConcurrentHashMap) map).isEmpty()) {
            C1553420qWi.LIZ.LIZ(new AbstractC1552990qW1() { // from class: X.0qUh
                @Override // X.AbstractC1552990qW1
                public final void LIZ() {
                    C1553130qWF.LIZ("gecko-debug-tag", "trigger update start delay 2s");
                    ArrayList arrayList = new ArrayList();
                    Iterator it2 = ((ConcurrentHashMap) this.LIZJ.LJ).entrySet().iterator();
                    while (it2.hasNext()) {
                        arrayList.addAll((Collection) ((Map.Entry) it2.next()).getValue());
                    }
                    ((ConcurrentHashMap) this.LIZJ.LJ).clear();
                    this.LIZJ.LIZ(7, 0, arrayList);
                }

                @Override // X.AbstractC1552990qW1
                public final int LIZIZ() {
                    return 7;
                }
            }, 2000L);
        }
        C1551510qTd.LIZ.LIZ().execute(new ARunnableS8S0202000_23(this, list, i2, i, 1));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
