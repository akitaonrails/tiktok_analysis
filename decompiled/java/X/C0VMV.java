package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.Intrinsics;
import webcast.api.room.BizStrategy;

/* JADX INFO: renamed from: X.0VMV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0VMV {
    public final C0VMO LIZ;
    public final ConcurrentHashMap<AbstractC1093440eYo, List<InterfaceC1093320eYc>> LIZIZ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<String, InterfaceC1092770eXj> LIZJ = new ConcurrentHashMap<>();

    public C0VMV(C0VMO c0vmo) {
        this.LIZ = c0vmo;
    }

    public final InterfaceC1092770eXj LIZ(String str) {
        return this.LIZJ.get(str);
    }

    public final List<C0VMZ> LIZIZ(String str) {
        List<C0VMI> listLIZJ;
        int i;
        C0VMO c0vmo = this.LIZ;
        ConcurrentHashMap<String, List<C0VMZ>> concurrentHashMap = c0vmo.LIZ.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(0L);
        sbLIZ.append(str);
        List<C0VMZ> list = concurrentHashMap.get(C2188811AlT.LIZIZ(sbLIZ));
        List<C0VMZ> list2 = list;
        if (list == null) {
            C0VMU c0vmuLIZJ = C0VMT.LIZ().LIZJ();
            C0VMN c0vmnLIZ = C0VMT.LIZ().LIZ();
            List listLJ = C0VMT.LIZ().LIZIZ().LJ(str);
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJ, 10));
            Iterator it2 = listLJ.iterator();
            while (it2.hasNext()) {
                arrayList.add(((C0VML) it2.next()).LIZLLL);
            }
            List<C0VMR> listLIZJ2 = c0vmuLIZJ.LIZJ(C13LP.LJJJJI(arrayList));
            if (!listLIZJ2.isEmpty()) {
                ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZJ2, 10));
                Iterator<C0VMR> it3 = listLIZJ2.iterator();
                while (it3.hasNext()) {
                    arrayList2.add(it3.next().LJFF);
                }
                listLIZJ = c0vmnLIZ.LIZJ(C13LP.LJJJJI(arrayList2));
            } else {
                listLIZJ = C13BV.INSTANCE;
            }
            C0VML c0vml = (C0VML) C13LP.LJJJLL(listLJ);
            if (c0vml != null) {
                i = c0vml.LIZJ;
            } else {
                i = 0;
            }
            C0VMW c0vmw = new C0VMW(listLJ, listLIZJ2, listLIZJ, i);
            ArrayList arrayList3 = new ArrayList();
            for (C0VMR c0vmr : listLIZJ2) {
                arrayList3.add(new C0VMZ(c0vmr.LIZLLL, (BizStrategy) GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, c0vmr.LJI, BizStrategy.class), new C796430VMb(c0vmr.LIZJ, c0vmw.LIZLLL, str, c0vmr.LIZIZ, Collections.emptyMap()), C0VMO.LIZ(c0vmr.LJFF, c0vmw.LIZJ)));
            }
            boolean z = !arrayList3.isEmpty();
            list2 = arrayList3;
            if (z) {
                ConcurrentHashMap<String, List<C0VMZ>> concurrentHashMap2 = c0vmo.LIZ.LIZ;
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(0L);
                sbLIZ2.append(str);
                concurrentHashMap2.put(C2188811AlT.LIZIZ(sbLIZ2), arrayList3);
                list2 = arrayList3;
            }
        }
        return list2;
    }

    public final List<C0VMZ> LIZJ(int i) {
        List<C0VMI> listLIZJ;
        int i2;
        this.LIZ.getClass();
        C0VMU c0vmuLIZJ = C0VMT.LIZ().LIZJ();
        C0VMN c0vmnLIZ = C0VMT.LIZ().LIZ();
        List<C0VML> listLIZJ2 = C0VMT.LIZ().LIZIZ().LIZJ(i);
        int i3 = 10;
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZJ2, 10));
        Iterator it2 = listLIZJ2.iterator();
        while (it2.hasNext()) {
            arrayList.add(((C0VML) it2.next()).LIZLLL);
        }
        List<C0VMR> listLIZJ3 = c0vmuLIZJ.LIZJ(C13LP.LJJJJI(arrayList));
        if (!listLIZJ3.isEmpty()) {
            ArrayList arrayList2 = new ArrayList(C15438062q.LJIJJ(listLIZJ3, 10));
            Iterator<C0VMR> it3 = listLIZJ3.iterator();
            while (it3.hasNext()) {
                arrayList2.add(it3.next().LJFF);
            }
            listLIZJ = c0vmnLIZ.LIZJ(C13LP.LJJJJI(arrayList2));
        } else {
            listLIZJ = C13BV.INSTANCE;
        }
        C0VML c0vml = (C0VML) C13LP.LJJJLL(listLIZJ2);
        if (c0vml != null) {
            i2 = c0vml.LIZJ;
        } else {
            i2 = 0;
        }
        C0VMW c0vmw = new C0VMW(listLIZJ2, listLIZJ3, listLIZJ, i2);
        ArrayList arrayList3 = new ArrayList();
        for (C0VML c0vml2 : listLIZJ2) {
            List<C0VMR> list = c0vmw.LIZIZ;
            ArrayList<C0VMR> arrayList4 = new ArrayList();
            for (C0VMR c0vmr : list) {
                if (Intrinsics.LJFF(c0vmr.LIZIZ, c0vml2.LIZLLL)) {
                    arrayList4.add(c0vmr);
                }
            }
            ArrayList arrayList5 = new ArrayList(C15438062q.LJIJJ(arrayList4, i3));
            for (C0VMR c0vmr2 : arrayList4) {
                arrayList5.add(Boolean.valueOf(arrayList3.add(new C0VMZ(c0vmr2.LIZLLL, (BizStrategy) GsonProtectorUtils.fromJson(C19748512Ol.LIZJ, c0vmr2.LJI, BizStrategy.class), new C796430VMb(c0vmr2.LIZJ, c0vmw.LIZLLL, c0vml2.LIZIZ, c0vmr2.LIZIZ, Collections.emptyMap()), C0VMO.LIZ(c0vmr2.LJFF, c0vmw.LIZJ)))));
                i3 = 10;
            }
        }
        return arrayList3;
    }

    public final void LIZLLL(String str) {
        for (Map.Entry<AbstractC1093440eYo, List<InterfaceC1093320eYc>> entry : this.LIZIZ.entrySet()) {
            AbstractC1093440eYo key = entry.getKey();
            List<InterfaceC1093320eYc> value = entry.getValue();
            if (key.LJ(str)) {
                key.LJI();
                Iterator<InterfaceC1093320eYc> it2 = value.iterator();
                while (it2.hasNext()) {
                    it2.next().stop();
                }
                if (this.LIZJ.get(key.LIZIZ) != null) {
                    this.LIZJ.remove(key.LIZIZ);
                }
            }
        }
    }
}
