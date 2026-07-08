package X;

import X.C1893670zNV;
import com.bytedance.touchpoint.api.model.Bubble;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.AwS607S0100000_28;

/* JADX INFO: renamed from: X.0zOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1894390zOf<T extends C1893670zNV> implements InterfaceC1894420zOi {
    public abstract Class<T[]> LIZLLL();

    public abstract int LJ();

    public abstract BaseTouchPointDataVM LJFF();

    public List LJI(List list) {
        return list;
    }

    public boolean LJII() {
        return this instanceof C1894400zOg;
    }

    public final void LIZIZ(HashMap<Integer, TouchPoint> map, List<? extends C1893670zNV> list) {
        LJI(list);
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
        c1894700zPALIZ.LJIIIZ.put(Integer.valueOf(LJ()), list);
    }

    public final void LIZJ(HashMap<Integer, TouchPoint> map, List<? extends C1893670zNV> list) {
        LJI(list);
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1894700zPA c1894700zPALIZ = C2178808gE.LIZ();
        int iLJ = LJ();
        List<C1893670zNV> list2 = c1894700zPALIZ.LJIIIZ.get(Integer.valueOf(iLJ));
        if (list2 != null) {
            ArrayList arrayList = new ArrayList(list2);
            if (list != null) {
                for (C1893670zNV c1893670zNV : list) {
                    if (c1893670zNV instanceof Bubble) {
                        C19719612Di.LJJIIJ(arrayList, new AwS607S0100000_28(c1893670zNV, 205), true);
                    }
                }
                arrayList.addAll(list);
                c1894700zPALIZ.LJIIIZ.put(Integer.valueOf(iLJ), arrayList);
                return;
            }
            return;
        }
        c1894700zPALIZ.LJIIIZ.put(Integer.valueOf(iLJ), list);
    }

    @Override // X.InterfaceC1894420zOi
    public final void LIZ(HashMap<Integer, TouchPoint> map, List<TouchPoint> list, boolean z) {
        try {
            if (LJII()) {
                ArrayList<TouchPoint> arrayList = new ArrayList();
                for (TouchPoint touchPoint : list) {
                    TouchPoint touchPoint2 = touchPoint;
                    if (touchPoint2 != null && touchPoint2.touchPointId == LJ()) {
                        arrayList.add(touchPoint);
                    }
                }
                if (!arrayList.isEmpty()) {
                    ArrayList arrayList2 = new ArrayList();
                    for (TouchPoint touchPoint3 : arrayList) {
                        if (touchPoint3 != null) {
                            List<C1893670zNV> listLIZLLL = C20484080s.LIZLLL(LIZLLL(), touchPoint3.data);
                            if (!listLIZLLL.isEmpty()) {
                                for (C1893670zNV c1893670zNV : listLIZLLL) {
                                    if (c1893670zNV != null) {
                                        c1893670zNV.LIZ = touchPoint3.touchPointId;
                                        c1893670zNV.LIZIZ = touchPoint3.touchPointName;
                                        int i = touchPoint3.launchPlanId;
                                        if (i == null) {
                                            i = -1;
                                        }
                                        c1893670zNV.LIZJ = i;
                                        String str = touchPoint3.abVersions;
                                        if (str == null) {
                                            str = "";
                                        }
                                        c1893670zNV.LIZLLL = str;
                                        c1893670zNV.LJ = touchPoint3.customEventParams;
                                        c1893670zNV.LJI = touchPoint3.product;
                                    }
                                }
                                arrayList2.addAll(listLIZLLL);
                            }
                        }
                    }
                    if (z) {
                        LIZJ(map, arrayList2);
                    } else {
                        LIZIZ(map, arrayList2);
                    }
                    BaseTouchPointDataVM baseTouchPointDataVMLJFF = LJFF();
                    if (baseTouchPointDataVMLJFF != null) {
                        baseTouchPointDataVMLJFF.wQ2();
                        return;
                    }
                    return;
                }
                if (this instanceof C1894610zP1) {
                    LIZIZ(map, null);
                    BaseTouchPointDataVM baseTouchPointDataVMLJFF2 = LJFF();
                    if (baseTouchPointDataVMLJFF2 != null) {
                        baseTouchPointDataVMLJFF2.wQ2();
                        return;
                    }
                    return;
                }
                return;
            }
            TouchPoint touchPoint4 = map.get(Integer.valueOf(LJ()));
            if (touchPoint4 != null) {
                List<? extends C1893670zNV> listLIZLLL2 = C20484080s.LIZLLL(LIZLLL(), touchPoint4.data);
                if (true ^ listLIZLLL2.isEmpty()) {
                    for (C1893670zNV c1893670zNV2 : listLIZLLL2) {
                        if (c1893670zNV2 != null) {
                            c1893670zNV2.LIZ = touchPoint4.touchPointId;
                            c1893670zNV2.LIZIZ = touchPoint4.touchPointName;
                            int i2 = touchPoint4.launchPlanId;
                            if (i2 == null) {
                                i2 = -1;
                            }
                            c1893670zNV2.LIZJ = i2;
                            String str2 = touchPoint4.abVersions;
                            if (str2 == null) {
                                str2 = "";
                            }
                            c1893670zNV2.LIZLLL = str2;
                            c1893670zNV2.LJ = touchPoint4.customEventParams;
                            c1893670zNV2.LJI = touchPoint4.product;
                        }
                    }
                }
                if (z) {
                    LIZJ(map, listLIZLLL2);
                } else {
                    LIZIZ(map, listLIZLLL2);
                }
                BaseTouchPointDataVM baseTouchPointDataVMLJFF3 = LJFF();
                if (baseTouchPointDataVMLJFF3 != null) {
                    baseTouchPointDataVMLJFF3.wQ2();
                    return;
                }
                return;
            }
            if (this instanceof C1894610zP1) {
                LIZIZ(map, null);
                BaseTouchPointDataVM baseTouchPointDataVMLJFF4 = LJFF();
                if (baseTouchPointDataVMLJFF4 != null) {
                    baseTouchPointDataVMLJFF4.wQ2();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
