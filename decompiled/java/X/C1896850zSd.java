package X;

import Y.AComparatorS47S0000000_28;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.model.ActivityTask;
import com.bytedance.touchpoint.api.model.NormalPendant;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0zSd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1896850zSd {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZJ() {
        String strLIZLLL;
        String strLJ;
        C1896890zSh c1896890zSh = (C1896890zSh) C1619720sFe.LIZ.LIZ(1);
        Pair[] pairArr = new Pair[3];
        if (c1896890zSh == null || (strLIZLLL = c1896890zSh.LIZLLL()) == null) {
            strLIZLLL = "";
        }
        Pair pair = new Pair("group_id", strLIZLLL);
        boolean z = false;
        pairArr[0] = pair;
        if (c1896890zSh != null && c1896890zSh.LJIIIZ()) {
            z = true;
        }
        String str = CardStruct.IStatusCode.DEFAULT;
        pairArr[1] = new Pair("is_ad", z ? "1" : CardStruct.IStatusCode.DEFAULT);
        if (c1896890zSh != null && (strLJ = c1896890zSh.LJ()) != null) {
            str = strLJ;
        }
        pairArr[2] = new Pair("aweme_type", str);
        return C2097608Jq.LJIIJ(pairArr);
    }

    public static String LIZLLL() {
        String strLJIJI;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        return (abstractC1896090zRP == null || (strLJIJI = abstractC1896090zRP.LJIJI()) == null) ? "other" : Intrinsics.LJFF(strLJIJI, "fyp") ? "homepage_hot" : Intrinsics.LJFF(strLJIJI, "follow") ? "homepage_follow" : "other";
    }

    public static int LJ(C1894690zP9 c1894690zP9) {
        NormalPendant normalPendant;
        if (c1894690zP9 != null && (normalPendant = c1894690zP9.LIZ) != null) {
            return normalPendant.showAfter;
        }
        return 0;
    }

    public static List LIZIZ(int i, List list) {
        ArrayList arrayList = new ArrayList();
        if (list != null && (!list.isEmpty())) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                ActivityTask activityTask = (ActivityTask) it2.next();
                if (activityTask.taskType == i) {
                    arrayList.add(activityTask);
                }
            }
            if (arrayList.size() > 1) {
                C08XD.LJJ(arrayList, new AComparatorS47S0000000_28(1));
            }
        }
        return arrayList;
    }

    public static Map LIZ(String str, String str2, Map map) {
        Object c098200Yq;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", str2);
        try {
            c098200Yq = UriProtector.parse(str).getPath();
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        if (c098200Yq == null) {
            c098200Yq = "";
        }
        linkedHashMap.put("current_page", c098200Yq);
        linkedHashMap.putAll(LIZJ());
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }
}
