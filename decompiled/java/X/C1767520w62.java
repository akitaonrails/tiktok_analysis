package X;

import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.DiversionEntranceRes;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.bean.ReachCfgData;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetRes;
import com.ss.android.ugc.aweme.ecommerce.ug.common.model.DiversionTargetResCfg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0w62, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767520w62 {
    public static final DiversionEntranceRes LIZ(ReachCfgData reachCfgData) {
        List<DiversionEntranceRes> list;
        if (reachCfgData != null && (list = reachCfgData.entranceResources) != null) {
            return (DiversionEntranceRes) C13LP.LJJJLL(list);
        }
        return null;
    }

    public static final DiversionEntranceRes LIZJ(ReachCfgData reachCfgData, EnumC1768680w7u enumC1768680w7u) {
        List<DiversionEntranceRes> list;
        DiversionEntranceRes diversionEntranceRes = null;
        if (reachCfgData == null || (list = reachCfgData.entranceResources) == null) {
            return null;
        }
        Iterator<DiversionEntranceRes> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DiversionEntranceRes next = it2.next();
            if (Intrinsics.LJFF(next.name, enumC1768680w7u.getValue())) {
                diversionEntranceRes = next;
                break;
            }
        }
        return diversionEntranceRes;
    }

    public static final DiversionTargetRes LIZLLL(ReachCfgData reachCfgData, EnumC1735580vGW enumC1735580vGW) {
        List<DiversionTargetRes> list;
        DiversionTargetRes diversionTargetRes = null;
        if (reachCfgData == null || (list = reachCfgData.targetResources) == null) {
            return null;
        }
        Iterator<DiversionTargetRes> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            DiversionTargetRes next = it2.next();
            if (Intrinsics.LJFF(next.name, enumC1735580vGW.getValue())) {
                diversionTargetRes = next;
                break;
            }
        }
        return diversionTargetRes;
    }

    public static final DiversionTargetRes LIZIZ(ReachCfgData reachCfgData, EnumC1768230w7B enumC1768230w7B, EnumC1768240w7C enumC1768240w7C) {
        Object next;
        Object next2;
        Object next3;
        String str;
        String str2;
        String str3;
        DiversionTargetResCfg diversionTargetResCfg;
        String str4;
        String str5;
        String str6;
        List<DiversionTargetRes> list = reachCfgData.targetResources;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (DiversionTargetRes diversionTargetRes : list) {
                if (Intrinsics.LJFF(diversionTargetRes.name, EnumC1735580vGW.MALL_SPARKVIEW.getValue())) {
                    arrayList.add(diversionTargetRes);
                }
            }
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    DiversionTargetRes diversionTargetRes2 = (DiversionTargetRes) next;
                    DiversionTargetResCfg diversionTargetResCfg2 = diversionTargetRes2.config;
                    if (diversionTargetResCfg2 != null) {
                        str5 = diversionTargetResCfg2.handleOnUiStatus;
                    } else {
                        str5 = null;
                    }
                    if (Intrinsics.LJFF(str5, enumC1768230w7B.getValue())) {
                        DiversionTargetResCfg diversionTargetResCfg3 = diversionTargetRes2.config;
                        if (diversionTargetResCfg3 != null) {
                            str6 = diversionTargetResCfg3.handleOnUiSubStage;
                        } else {
                            str6 = null;
                        }
                        if (Intrinsics.LJFF(str6, enumC1768240w7C.getValue())) {
                            break;
                        }
                    }
                } else {
                    next = null;
                    break;
                }
            }
            DiversionTargetRes diversionTargetRes3 = (DiversionTargetRes) next;
            if (diversionTargetRes3 != null) {
                return diversionTargetRes3;
            }
            if (arrayList != null) {
                Iterator it3 = arrayList.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        next2 = it3.next();
                        DiversionTargetRes diversionTargetRes4 = (DiversionTargetRes) next2;
                        DiversionTargetResCfg diversionTargetResCfg4 = diversionTargetRes4.config;
                        if (diversionTargetResCfg4 != null) {
                            str3 = diversionTargetResCfg4.handleOnUiStatus;
                        } else {
                            str3 = null;
                        }
                        if (Intrinsics.LJFF(str3, enumC1768230w7B.getValue()) && ((diversionTargetResCfg = diversionTargetRes4.config) == null || (str4 = diversionTargetResCfg.handleOnUiSubStage) == null || a0.LJJJIL(str4))) {
                            break;
                        }
                    } else {
                        next2 = null;
                        break;
                    }
                }
                DiversionTargetRes diversionTargetRes5 = (DiversionTargetRes) next2;
                if (diversionTargetRes5 != null) {
                    return diversionTargetRes5;
                }
                if (arrayList != null) {
                    Iterator it4 = arrayList.iterator();
                    while (true) {
                        if (it4.hasNext()) {
                            next3 = it4.next();
                            DiversionTargetRes diversionTargetRes6 = (DiversionTargetRes) next3;
                            DiversionTargetResCfg diversionTargetResCfg5 = diversionTargetRes6.config;
                            if (diversionTargetResCfg5 == null || (str2 = diversionTargetResCfg5.handleOnUiStatus) == null || a0.LJJJIL(str2)) {
                                DiversionTargetResCfg diversionTargetResCfg6 = diversionTargetRes6.config;
                                if (diversionTargetResCfg6 == null || (str = diversionTargetResCfg6.handleOnUiSubStage) == null || a0.LJJJIL(str)) {
                                    break;
                                }
                            }
                        } else {
                            next3 = null;
                            break;
                        }
                    }
                    DiversionTargetRes diversionTargetRes7 = (DiversionTargetRes) next3;
                    if (diversionTargetRes7 != null) {
                        return diversionTargetRes7;
                    }
                }
            }
        }
        return null;
    }
}
