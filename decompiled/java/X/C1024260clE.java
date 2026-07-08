package X;

import com.ss.android.ugc.aweme.feed.model.IAdTranslatableData;
import com.ss.android.ugc.aweme.translation.model.BatchTranslatableItem;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0clE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1024260clE {
    public static final List<InterfaceC1024290clH> LIZ = C1697810uHb.LJIIJJI(new InterfaceC1024290clH() { // from class: X.0clF
        @Override // X.InterfaceC1024290clH
        public final List<BatchTranslatableItem> LIZ(IAdTranslatableData iAdTranslatableData) {
            if (!(iAdTranslatableData instanceof C997740c4S)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            for (IAdTranslatableData iAdTranslatableData2 : ((C997740c4S) iAdTranslatableData).LIZ) {
                Iterator<InterfaceC1024290clH> it2 = C1024260clE.LIZ.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    List<BatchTranslatableItem> listLIZ = it2.next().LIZ(iAdTranslatableData2);
                    if (listLIZ != null) {
                        arrayList.addAll(listLIZ);
                        break;
                    }
                }
            }
            if (!(!arrayList.isEmpty())) {
                return null;
            }
            return Collections.unmodifiableList(arrayList);
        }
    }, new InterfaceC1024290clH() { // from class: X.0clB
        @Override // X.InterfaceC1024290clH
        public final List<BatchTranslatableItem> LIZ(IAdTranslatableData iAdTranslatableData) {
            if (!(iAdTranslatableData instanceof C1002620cCK)) {
                return null;
            }
            List<InterfaceC1002590cCH> list = ((C1002620cCK) iAdTranslatableData).LIZ;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC1002590cCH interfaceC1002590cCH : list) {
                if (interfaceC1002590cCH instanceof C1002610cCJ) {
                    arrayList.add(interfaceC1002590cCH);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((C1002610cCJ) it2.next()).LJFF, arrayList2);
            }
            ArrayList<C1012220cRo> arrayList3 = new ArrayList();
            for (Object obj : arrayList2) {
                if (((C1012220cRo) obj).LIZIZ.length() > 0) {
                    arrayList3.add(obj);
                }
            }
            ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(arrayList3, 10));
            for (C1012220cRo c1012220cRo : arrayList3) {
                C1024280clG c1024280clG = new C1024280clG();
                c1024280clG.LIZ = c1012220cRo.LIZIZ;
                arrayList4.add(c1024280clG.LIZ());
            }
            if (!(!arrayList4.isEmpty())) {
                return null;
            }
            return arrayList4;
        }
    }, new InterfaceC1024290clH() { // from class: X.0clD
        @Override // X.InterfaceC1024290clH
        public final List<BatchTranslatableItem> LIZ(IAdTranslatableData iAdTranslatableData) {
            String str;
            if (!(iAdTranslatableData instanceof C996860c32)) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            C996840c30 c996840c30 = ((C996860c32) iAdTranslatableData).LIZIZ;
            if (c996840c30 != null && (str = c996840c30.LIZ) != null) {
                C1024280clG c1024280clG = new C1024280clG();
                c1024280clG.LIZ = str;
                arrayList.add(c1024280clG.LIZ());
            }
            if (!(!arrayList.isEmpty())) {
                return null;
            }
            return Collections.unmodifiableList(arrayList);
        }
    }, new InterfaceC1024290clH() { // from class: X.0clA
        @Override // X.InterfaceC1024290clH
        public final List<BatchTranslatableItem> LIZ(IAdTranslatableData iAdTranslatableData) {
            if (!(iAdTranslatableData instanceof C997620c4G)) {
                return null;
            }
            List<InterfaceC997630c4H> list = ((C997620c4G) iAdTranslatableData).LIZ;
            ArrayList arrayList = new ArrayList();
            for (InterfaceC997630c4H interfaceC997630c4H : list) {
                if (interfaceC997630c4H instanceof C997660c4K) {
                    arrayList.add(interfaceC997630c4H);
                }
            }
            ArrayList<C1012220cRo> arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C19719612Di.LJJI(((C997660c4K) it2.next()).LJ, arrayList2);
            }
            ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(arrayList2, 10));
            for (C1012220cRo c1012220cRo : arrayList2) {
                C1024280clG c1024280clG = new C1024280clG();
                c1024280clG.LIZ = c1012220cRo.LIZIZ;
                arrayList3.add(c1024280clG.LIZ());
            }
            if (!(!arrayList3.isEmpty())) {
                return null;
            }
            return Collections.unmodifiableList(arrayList3);
        }
    }, new InterfaceC1024290clH() { // from class: X.0clC
        @Override // X.InterfaceC1024290clH
        public final List<BatchTranslatableItem> LIZ(IAdTranslatableData iAdTranslatableData) {
            if (!(iAdTranslatableData instanceof C997700c4O)) {
                return null;
            }
            List<C1012220cRo> list = ((C997700c4O) iAdTranslatableData).LIZLLL;
            ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list, 10));
            for (C1012220cRo c1012220cRo : list) {
                C1024280clG c1024280clG = new C1024280clG();
                c1024280clG.LIZ = c1012220cRo.LIZIZ;
                arrayList.add(c1024280clG.LIZ());
            }
            if (!(!arrayList.isEmpty())) {
                return null;
            }
            return Collections.unmodifiableList(arrayList);
        }
    });
}
