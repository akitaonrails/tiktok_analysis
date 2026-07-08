package X;

import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.experiment.TabChangeInfluencingFactors;
import com.ss.android.ugc.aweme.experiment.TabConfig;
import com.ss.android.ugc.aweme.experiment.TraceInfo;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.tab.stability.TabStabilityData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0CXR, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CXR {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v8, types: [X.13BV] */
    /* JADX WARN: Type inference failed for: r1v9 */
    /* JADX WARN: Type inference failed for: r23v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r24v0, types: [java.util.List] */
    public static TabStabilityData LIZ(EnumC1585090rLn enumC1585090rLn, TabConfig tabConfig, String str) {
        String strLJ;
        k kVar;
        n nVar;
        k kVar2;
        n nVar2;
        k kVar3;
        n nVar3;
        Map<String, Map<String, Boolean>> mapLJ;
        k kVar4;
        n nVar4;
        String str2;
        String str3;
        ?? arrayList;
        ?? arrayList2;
        List<? extends InterfaceC1570900qyu> second;
        List<? extends InterfaceC1570900qyu> first;
        TabChangeInfluencingFactors tabChangeInfluencingFactors;
        TabChangeInfluencingFactors tabChangeInfluencingFactors2;
        TabChangeInfluencingFactors tabChangeInfluencingFactors3;
        TabChangeInfluencingFactors tabChangeInfluencingFactors4;
        TabChangeInfluencingFactors tabChangeInfluencingFactors5;
        TabChangeInfluencingFactors tabChangeInfluencingFactors6;
        TabChangeInfluencingFactors tabChangeInfluencingFactors7;
        C343720Ddi c343720Ddi = C343720Ddi.LIZIZ;
        if (c343720Ddi.LIZLLL()) {
            strLJ = c343720Ddi.LJ();
        } else {
            strLJ = null;
        }
        Map<String, Map<String, Boolean>> mapLJFF = c343720Ddi.LJFF();
        boolean zBooleanValue = C1514430pVp.LIZLLL().booleanValue();
        boolean zLIZ = C307020C1s.LIZ();
        TraceInfo traceInfo = tabConfig.traceInfo;
        if (traceInfo != null && (tabChangeInfluencingFactors7 = traceInfo.tabChangeInfluencingFactors) != null) {
            kVar = tabChangeInfluencingFactors7.abExpInfo;
        } else {
            kVar = null;
        }
        if (kVar instanceof n) {
            nVar = (n) kVar;
        } else {
            nVar = null;
        }
        if (traceInfo != null && (tabChangeInfluencingFactors6 = traceInfo.tabChangeInfluencingFactors) != null) {
            kVar2 = tabChangeInfluencingFactors6.abExpVidInfo;
        } else {
            kVar2 = null;
        }
        if (kVar2 instanceof n) {
            nVar2 = (n) kVar2;
        } else {
            nVar2 = null;
        }
        if (traceInfo != null && (tabChangeInfluencingFactors5 = traceInfo.tabChangeInfluencingFactors) != null) {
            kVar3 = tabChangeInfluencingFactors5.tabReqInfo;
        } else {
            kVar3 = null;
        }
        if (kVar3 instanceof n) {
            nVar3 = (n) kVar3;
        } else {
            nVar3 = null;
        }
        if (traceInfo == null || (tabChangeInfluencingFactors4 = traceInfo.tabChangeInfluencingFactors) == null || (mapLJ = tabChangeInfluencingFactors4.tabServerFilterResult) == null) {
            mapLJ = C2097608Jq.LJ();
        }
        TraceInfo traceInfo2 = tabConfig.traceInfo;
        if (traceInfo2 != null && (tabChangeInfluencingFactors3 = traceInfo2.tabChangeInfluencingFactors) != null) {
            kVar4 = tabChangeInfluencingFactors3.tabPersonalizeTabChange;
        } else {
            kVar4 = null;
        }
        if (kVar4 instanceof n) {
            nVar4 = (n) kVar4;
        } else {
            nVar4 = null;
        }
        String str4 = CardStruct.IStatusCode.DEFAULT;
        if (traceInfo2 == null || (tabChangeInfluencingFactors2 = traceInfo2.tabChangeInfluencingFactors) == null || (str2 = tabChangeInfluencingFactors2.userId) == null || str2.length() == 0) {
            str2 = CardStruct.IStatusCode.DEFAULT;
        }
        if (str != null && str.length() != 0) {
            str4 = str;
        }
        TraceInfo traceInfo3 = tabConfig.traceInfo;
        if (traceInfo3 == null || (tabChangeInfluencingFactors = traceInfo3.tabChangeInfluencingFactors) == null || (str3 = tabChangeInfluencingFactors.commonLogId) == null) {
            str3 = "";
        }
        C1584320rKY.LIZ.getClass();
        String str5 = C1584320rKY.LJIIIZ;
        C1585070rLl.LIZ.getClass();
        CopyOnWriteArrayList<InterfaceC1583870rJp> copyOnWriteArrayList = C1585070rLl.LIZIZ;
        ArrayList arrayList3 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList, 10));
        Iterator<InterfaceC1583870rJp> it2 = copyOnWriteArrayList.iterator();
        while (it2.hasNext()) {
            arrayList3.add(it2.next().tag());
        }
        C1585070rLl.LIZ.getClass();
        CopyOnWriteArrayList<InterfaceC1583870rJp> copyOnWriteArrayList2 = C1585070rLl.LIZJ;
        ArrayList arrayList4 = new ArrayList(C15438062q.LJIJJ(copyOnWriteArrayList2, 10));
        Iterator<InterfaceC1583870rJp> it3 = copyOnWriteArrayList2.iterator();
        while (it3.hasNext()) {
            arrayList4.add(it3.next().tag());
        }
        C1585070rLl.LIZ.getClass();
        Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> pair = C1585070rLl.LIZLLL;
        if (pair != null && (first = pair.getFirst()) != null) {
            arrayList = new ArrayList();
            Iterator<? extends InterfaceC1570900qyu> it4 = first.iterator();
            while (it4.hasNext()) {
                String tag = it4.next().getTag();
                if (tag != null) {
                    arrayList.add(tag);
                }
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        C1585070rLl.LIZ.getClass();
        Pair<? extends List<? extends InterfaceC1570900qyu>, ? extends List<? extends InterfaceC1570900qyu>> pair2 = C1585070rLl.LIZLLL;
        if (pair2 != null && (second = pair2.getSecond()) != null) {
            arrayList2 = new ArrayList();
            Iterator<? extends InterfaceC1570900qyu> it5 = second.iterator();
            while (it5.hasNext()) {
                String tag2 = it5.next().getTag();
                if (tag2 != null) {
                    arrayList2.add(tag2);
                }
            }
        } else {
            arrayList2 = C13BV.INSTANCE;
        }
        return new TabStabilityData(tabConfig, zBooleanValue, zLIZ, nVar, nVar2, nVar3, mapLJ, nVar4, str2, str4, str3, strLJ, mapLJFF, str5, arrayList3, arrayList4, arrayList, arrayList2, enumC1585090rLn.getType(), System.currentTimeMillis());
    }
}
