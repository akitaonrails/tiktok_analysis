package X;

import X.C1893670zNV;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.viewmodel.BaseTouchPointDataVM;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0zOe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public abstract class AbstractC1894380zOe<T extends C1893670zNV> implements InterfaceC1894420zOi {
    public abstract Class<T> LIZIZ();

    public abstract int LIZJ();

    public abstract BaseTouchPointDataVM LIZLLL();

    @Override // X.InterfaceC1894420zOi
    public final void LIZ(HashMap<Integer, TouchPoint> map, List<TouchPoint> list, boolean z) {
        try {
            ArrayList arrayList = new ArrayList();
            for (TouchPoint touchPoint : list) {
                if (touchPoint != null && touchPoint.touchPointId == LIZJ()) {
                    C1893670zNV c1893670zNV = (C1893670zNV) C20484080s.LIZ(touchPoint.data, LIZIZ());
                    if (c1893670zNV != null) {
                        c1893670zNV.LJFF = touchPoint.data;
                        c1893670zNV.LIZ = touchPoint.touchPointId;
                        c1893670zNV.LIZIZ = touchPoint.touchPointName;
                        int i = touchPoint.launchPlanId;
                        if (i == null) {
                            i = -1;
                        }
                        c1893670zNV.LIZJ = i;
                        String str = touchPoint.abVersions;
                        if (str == null) {
                            str = "";
                        }
                        c1893670zNV.LIZLLL = str;
                        c1893670zNV.LJ = touchPoint.customEventParams;
                        c1893670zNV.LJI = touchPoint.product;
                    }
                    arrayList.add(c1893670zNV);
                }
            }
            if (!arrayList.isEmpty()) {
                C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
                C2178808gE.LIZ().LJIIIZ.put(Integer.valueOf(LIZJ()), arrayList);
                BaseTouchPointDataVM baseTouchPointDataVMLIZLLL = LIZLLL();
                if (baseTouchPointDataVMLIZLLL != null) {
                    baseTouchPointDataVMLIZLLL.wQ2();
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }
}
