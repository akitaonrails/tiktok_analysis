package X;

import com.ss.android.ugc.tiktok.location_api.service.experiment.JsbPassListFullPartialData;
import com.ss.android.ugc.tiktok.location_api.service.experiment.JsbPassListHostPathData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1AUZ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AUZ {
    public static boolean LIZ(EnumC1063300dmC enumC1063300dmC, String str, String str2) {
        List arrayList;
        List arrayList2;
        JsbPassListHostPathData jsbPassListHostPathData;
        JsbPassListHostPathData jsbPassListHostPathData2;
        List arrayList3;
        List arrayList4;
        JsbPassListHostPathData jsbPassListHostPathData3;
        JsbPassListHostPathData jsbPassListHostPathData4;
        if (str == null || str2 == null) {
            return false;
        }
        int i = C1063350dmH.LIZ[enumC1063300dmC.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            JsbPassListFullPartialData jsbPassListFullPartialData = C2180141AUa.LIZ().lynx;
            if (jsbPassListFullPartialData == null || (jsbPassListHostPathData4 = jsbPassListFullPartialData.full) == null || (arrayList3 = jsbPassListHostPathData4.path) == null) {
                arrayList3 = new ArrayList();
            }
            if (!arrayList3.contains(str)) {
                return false;
            }
            JsbPassListFullPartialData jsbPassListFullPartialData2 = C2180141AUa.LIZ().lynx;
            if (jsbPassListFullPartialData2 == null || (jsbPassListHostPathData3 = jsbPassListFullPartialData2.full) == null || (arrayList4 = jsbPassListHostPathData3.host) == null) {
                arrayList4 = new ArrayList();
            }
            if (!arrayList4.contains(str2)) {
                return false;
            }
        } else {
            JsbPassListFullPartialData jsbPassListFullPartialData3 = C2180141AUa.LIZ().web;
            if (jsbPassListFullPartialData3 == null || (jsbPassListHostPathData2 = jsbPassListFullPartialData3.full) == null || (arrayList = jsbPassListHostPathData2.path) == null) {
                arrayList = new ArrayList();
            }
            if (!arrayList.contains(str)) {
                return false;
            }
            JsbPassListFullPartialData jsbPassListFullPartialData4 = C2180141AUa.LIZ().web;
            if (jsbPassListFullPartialData4 == null || (jsbPassListHostPathData = jsbPassListFullPartialData4.full) == null || (arrayList2 = jsbPassListHostPathData.host) == null) {
                arrayList2 = new ArrayList();
            }
            if (!arrayList2.contains(str2)) {
                return false;
            }
        }
        return true;
    }

    public static boolean LIZIZ(EnumC1063300dmC enumC1063300dmC, String str, String str2) {
        List arrayList;
        List arrayList2;
        JsbPassListHostPathData jsbPassListHostPathData;
        JsbPassListHostPathData jsbPassListHostPathData2;
        List arrayList3;
        List arrayList4;
        JsbPassListHostPathData jsbPassListHostPathData3;
        JsbPassListHostPathData jsbPassListHostPathData4;
        if (str == null || str2 == null) {
            return false;
        }
        int i = C1063350dmH.LIZ[enumC1063300dmC.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return false;
            }
            JsbPassListFullPartialData jsbPassListFullPartialData = C2180141AUa.LIZ().lynx;
            if (jsbPassListFullPartialData == null || (jsbPassListHostPathData4 = jsbPassListFullPartialData.partial) == null || (arrayList3 = jsbPassListHostPathData4.path) == null) {
                arrayList3 = new ArrayList();
            }
            if (arrayList3.isEmpty()) {
                return false;
            }
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                if (a0.LJJIIZI(str, (String) it2.next(), false)) {
                    JsbPassListFullPartialData jsbPassListFullPartialData2 = C2180141AUa.LIZ().lynx;
                    if (jsbPassListFullPartialData2 == null || (jsbPassListHostPathData3 = jsbPassListFullPartialData2.partial) == null || (arrayList4 = jsbPassListHostPathData3.host) == null) {
                        arrayList4 = new ArrayList();
                    }
                    if (arrayList4.isEmpty()) {
                        return false;
                    }
                    Iterator it3 = arrayList4.iterator();
                    while (it3.hasNext()) {
                        if (a0.LJJIIZI(str2, (String) it3.next(), false)) {
                        }
                    }
                    return false;
                }
            }
            return false;
        }
        JsbPassListFullPartialData jsbPassListFullPartialData3 = C2180141AUa.LIZ().web;
        if (jsbPassListFullPartialData3 == null || (jsbPassListHostPathData2 = jsbPassListFullPartialData3.partial) == null || (arrayList = jsbPassListHostPathData2.path) == null) {
            arrayList = new ArrayList();
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            if (a0.LJJIIZI(str, (String) it4.next(), false)) {
                JsbPassListFullPartialData jsbPassListFullPartialData4 = C2180141AUa.LIZ().web;
                if (jsbPassListFullPartialData4 == null || (jsbPassListHostPathData = jsbPassListFullPartialData4.partial) == null || (arrayList2 = jsbPassListHostPathData.host) == null) {
                    arrayList2 = new ArrayList();
                }
                if (arrayList2.isEmpty()) {
                    return false;
                }
                Iterator it5 = arrayList2.iterator();
                while (it5.hasNext()) {
                    if (a0.LJJIIZI(str2, (String) it5.next(), false)) {
                    }
                }
                return false;
            }
        }
        return false;
        return true;
    }
}
