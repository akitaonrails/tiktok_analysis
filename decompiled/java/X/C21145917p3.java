package X;

import android.app.Activity;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.17p3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21145917p3 {
    public final Map<Integer, List<C21143617og>> LIZ = new ConcurrentHashMap();

    public final List<C21143617og> LIZ(int i) {
        List<C21143617og> arrayList = (List) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
        if (arrayList == null) {
            synchronized (this) {
                try {
                    arrayList = (List) ((ConcurrentHashMap) this.LIZ).get(Integer.valueOf(i));
                    if (arrayList == null) {
                        Map<Integer, List<C21143617og>> map = this.LIZ;
                        Integer numValueOf = Integer.valueOf(i);
                        arrayList = new ArrayList<>();
                        ((ConcurrentHashMap) map).put(numValueOf, arrayList);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return arrayList;
    }

    public static void LIZIZ(List list, List list2, C19EG c19eg, InterfaceC21143917oj interfaceC21143917oj) {
        boolean z;
        String type;
        Activity activityLIZ = C21145417oy.LIZ(c19eg);
        if (activityLIZ != null) {
            ArrayList<C21143617og> arrayList = new ArrayList();
            for (Object obj : list2) {
                if (true ^ ((C21143617og) obj).LJII) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                list.removeAll(arrayList);
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(arrayList, 10));
                for (C21143617og c21143617og : arrayList) {
                    int iHashCode = activityLIZ.hashCode();
                    if (interfaceC21143917oj != null) {
                        z = true;
                        type = interfaceC21143917oj.getType();
                    } else {
                        z = false;
                        type = null;
                    }
                    arrayList2.add(new C21143617og(c21143617og.LIZIZ, c21143617og.LIZJ, c21143617og.LIZLLL, c21143617og.LJ, c21143617og.LJFF, iHashCode, true, z, type));
                }
                list.addAll(arrayList2);
            }
        }
    }
}
