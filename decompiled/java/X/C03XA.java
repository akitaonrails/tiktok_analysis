package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OspXmlPreloadScene;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03XA, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03XA {
    public static final C03XA LIZ = new C03XA();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(141));

    public static int LIZIZ() {
        Activity activityLIZ = C036A.LIZ();
        return (activityLIZ == null || !C960203pA.LIZIZ(activityLIZ)) ? R.style.xx : R.style.y0;
    }

    public static int LIZ(BillInfoData billInfoData, List list) {
        int i;
        int iIntValue;
        Integer num;
        PaymentMethod paymentMethodLJIIIZ;
        Availability availability;
        PaymentMethodsData paymentMethodsData = billInfoData.paymentMethods;
        if (paymentMethodsData != null && (paymentMethodLJIIIZ = paymentMethodsData.LJIIIZ()) != null && (availability = paymentMethodLJIIIZ.availability) != null && Intrinsics.LJFF(availability.isAvailable(), Boolean.TRUE)) {
            i = 3;
        } else {
            i = 0;
        }
        Iterable iterableLIZIZ = C03QF.LIZIZ(list);
        if (iterableLIZIZ == null) {
            iterableLIZIZ = C13BV.INSTANCE;
        }
        PaymentMethodsData paymentMethodsData2 = billInfoData.paymentMethods;
        if (paymentMethodsData2 != null && Intrinsics.LJFF(paymentMethodsData2.isFoldRecommendPaymentMethods, Boolean.TRUE)) {
            iIntValue = 1;
        } else {
            PaymentMethodsData paymentMethodsData3 = billInfoData.paymentMethods;
            if (paymentMethodsData3 != null && (num = paymentMethodsData3.recommendMethodShowCount) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 4;
            }
        }
        Iterator it2 = C13LP.LL(iterableLIZIZ, iIntValue).iterator();
        while (it2.hasNext()) {
            it2.next();
            i++;
        }
        return i;
    }

    public static List LJ(Integer num, String str) {
        List listLJIIJJI;
        Map<String, Integer> mapLJ;
        OspXmlPreloadScene ospXmlPreloadScene;
        String strLIZIZ = str;
        int template = EnumC969503qf.US_OSP_V1.getTemplate();
        if (num != null && num.intValue() == template) {
            if (Intrinsics.LJFF(strLIZIZ, "scene_full_page")) {
                listLJIIJJI = C1697810uHb.LJIIJJI(C03XH.LIZ(R.layout.b3l, 1), C03XH.LIZ(R.layout.b3x, 1), C03XH.LIZ(R.layout.b28, 1), C03XH.LIZ(R.layout.b1q, 1), C03XH.LIZ(R.layout.b2m, 1), C03XH.LIZ(R.layout.b20, 1), C03XH.LIZ(R.layout.b25, 1), C03XH.LIZ(R.layout.b1t, 1), C03XH.LIZ(R.layout.b1r, 1), C03XH.LIZ(R.layout.aom, 1), C03XH.LIZ(R.layout.b1w, 1), C03XH.LIZ(R.layout.apk, 1), C03XH.LIZ(R.layout.b2g, 1), C03XH.LIZ(R.layout.b2n, 3));
            } else if (Intrinsics.LJFF(strLIZIZ, "scene_combine_sku_page")) {
                listLJIIJJI = C1697810uHb.LJIIJJI(C03XH.LIZ(R.layout.b3l, 1), C03XH.LIZ(R.layout.b3n, 1), C03XH.LIZ(R.layout.auh, 1), C03XH.LIZ(R.layout.b0o, 1), C03XH.LIZ(R.layout.b2_, 1), C03XH.LIZ(R.layout.b2u, 1), C03XH.LIZ(R.layout.b2v, 1), C03XH.LIZ(R.layout.b10, 1), C03XH.LIZ(R.layout.b0v, 1), C03XH.LIZ(R.layout.b0w, 1), C03XH.LIZ(R.layout.b13, 1), C03XH.LIZ(R.layout.b0y, 1), C03XH.LIZ(R.layout.b15, 1), C03XH.LIZ(R.layout.b3p, 1), C03XH.LIZ(R.layout.amz, 1), C03XH.LIZ(R.layout.b0q, 1), C03XH.LIZ(R.layout.b3m, 1));
            } else {
                listLJIIJJI = Collections.singletonList(C03XH.LIZ(R.layout.b3l, 1));
            }
        } else {
            listLJIIJJI = C1697810uHb.LJIIJJI(C03XH.LIZ(R.layout.b3l, 1), C03XH.LIZ(R.layout.b3x, 1), C03XH.LIZ(R.layout.avt, 1), C03XH.LIZ(R.layout.b3w, 1), C03XH.LIZ(R.layout.ais, 1), C03XH.LIZ(R.layout.aom, 1), C03XH.LIZ(R.layout.b47, 1), C03XH.LIZ(R.layout.b3z, 1), C03XH.LIZ(R.layout.b44, 1), C03XH.LIZ(R.layout.auc, 1), C03XH.LIZ(R.layout.ap1, 1), C03XH.LIZ(R.layout.b4a, 1));
        }
        if (num != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(num);
            sbLIZ.append('_');
            sbLIZ.append(strLIZIZ);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        }
        Map<String, OspXmlPreloadScene> map = C03XD.LIZJ().preloadScene;
        if (map == null || (ospXmlPreloadScene = map.get(strLIZIZ)) == null || (mapLJ = ospXmlPreloadScene.preloadXmlAppList) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : mapLJ.entrySet()) {
            int iIntValue = entry.getValue().intValue();
            String key = entry.getKey();
            if (iIntValue > 0 && C123100dR.LIZ(key)) {
                arrayList.add(new C03XI(iIntValue, null, key, 1));
            }
        }
        return C13LP.LJLIL(arrayList, listLJIIJJI);
    }

    public static List LJFF(List list, List list2) {
        int iIntValue;
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        for (C03XI c03xi : (ArrayList) list2) {
            linkedHashMap.put(c03xi.LIZ, Integer.valueOf(c03xi.LIZJ));
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            C03XI c03xi2 = (C03XI) it2.next();
            Integer num = (Integer) linkedHashMap.get(c03xi2.LIZ);
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            int i = c03xi2.LIZJ - iIntValue;
            if (i > 0) {
                arrayList.add(new C03XI(i, c03xi2.LIZ, null, 2));
            }
        }
        return arrayList;
    }

    public static void LIZLLL(Activity activity, String str, Integer num) {
        Collection collectionSingletonList;
        Map<String, Integer> mapLJ;
        OspXmlPreloadScene ospXmlPreloadScene;
        SystemClock.elapsedRealtime();
        C940303lx c940303lx = (C940303lx) LIZIZ.getValue();
        int template = EnumC969503qf.US_OSP_V1.getTemplate();
        if (num != null && num.intValue() == template) {
            collectionSingletonList = C13BV.INSTANCE;
        } else {
            collectionSingletonList = Collections.singletonList(C03XH.LIZ(R.layout.b3y, 2));
        }
        if (num != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(num);
            sbLIZ.append('_');
            sbLIZ.append(str);
            str = C2188811AlT.LIZIZ(sbLIZ);
        }
        Map<String, OspXmlPreloadScene> map = C03XD.LIZJ().preloadScene;
        if (map == null || (ospXmlPreloadScene = map.get(str)) == null || (mapLJ = ospXmlPreloadScene.preloadActivityXmlList) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, Integer> entry : mapLJ.entrySet()) {
            int iIntValue = entry.getValue().intValue();
            String key = entry.getKey();
            if (iIntValue > 0 && C123100dR.LIZ(key)) {
                arrayList.add(new C03XI(iIntValue, null, key, 1));
            }
        }
        c940303lx.LIZ(activity, C13LP.LJLIL(arrayList, collectionSingletonList), null);
    }

    public static View LIZJ(Context context, int i, ViewGroup viewGroup, boolean z) {
        return ((C940303lx) LIZIZ.getValue()).inflate(context, i, viewGroup, z);
    }
}
