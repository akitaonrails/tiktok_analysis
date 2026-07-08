package X;

import Y.AComparatorS32S0000000_13;
import com.ss.android.ugc.aweme.frequency.model.RuleHitState;
import com.ss.android.ugc.aweme.report.OutreachFlowReportItem;
import com.ss.android.ugc.aweme.report.OutreachInfo;
import com.ss.android.ugc.aweme.report.ShowReportInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS247S0000000_13;
import kotlin.jvm.internal.AwS162S1100000_13;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0WPe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C822720WPe {
    public InterfaceC822750WPh LIZIZ;
    public Map<String, ? extends Map<String, ? extends Map<String, ? extends InterfaceC822760WPi>>> LIZ = new LinkedHashMap();
    public final Map<String, InterfaceC822740WPg> LIZJ = new LinkedHashMap();

    public final void LIZJ(String str, OutreachFlowReportItem outreachFlowReportItem) {
        String str2;
        OutreachInfo outreachInfo = outreachFlowReportItem.outreachInfo;
        String str3 = null;
        if (outreachInfo != null) {
            str2 = outreachInfo.outreachType;
        } else {
            str2 = null;
        }
        String str4 = outreachFlowReportItem.triggerScene;
        if (outreachInfo != null) {
            str3 = outreachInfo.outreachKey;
        }
        if (C123100dR.LIZ(str2) && C123100dR.LIZ(str4) && C123100dR.LIZ(str3)) {
            Map<String, InterfaceC822740WPg> map = this.LIZJ;
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it2 = ((LinkedHashMap) map).entrySet().iterator();
            while (it2.hasNext()) {
                arrayList.add(((Map.Entry) it2.next()).getValue());
            }
            List listLLIIII = C13LP.LLIIII(arrayList);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : listLLIIII) {
                if (Intrinsics.LJFF(((InterfaceC822740WPg) obj).LIZJ(), str2)) {
                    arrayList2.add(obj);
                }
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : arrayList2) {
                if (Intrinsics.LJFF(((InterfaceC822740WPg) obj2).getScene(), str4)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList();
            for (Object obj3 : arrayList3) {
                if (((InterfaceC822740WPg) obj3).LIZLLL().contains(str3)) {
                    arrayList4.add(obj3);
                }
            }
            for (InterfaceC822740WPg interfaceC822740WPg : C13LP.LLIIII(arrayList4)) {
                InterfaceC822750WPh interfaceC822750WPh = this.LIZIZ;
                if (interfaceC822750WPh != null && interfaceC822750WPh.getLogger() != null) {
                    new AwS162S1100000_13(str, interfaceC822740WPg, 9);
                }
                interfaceC822740WPg.LIZ(str, outreachFlowReportItem);
            }
        }
    }

    public final InterfaceC822740WPg LIZIZ(final String str, final String str2, final String str3, final List<String> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('-');
        sbLIZ.append(str2);
        sbLIZ.append('-');
        sbLIZ.append(str3);
        final String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        InterfaceC822740WPg interfaceC822740WPg = (InterfaceC822740WPg) ((LinkedHashMap) this.LIZJ).get(strLIZIZ);
        if (interfaceC822740WPg == null) {
            InterfaceC822740WPg interfaceC822740WPg2 = new InterfaceC822740WPg(strLIZIZ, str3, list, str, str2) { // from class: X.0W8r
                public static final /* synthetic */ int LJII = 0;
                public final String LIZ;
                public final String LIZIZ;
                public final List<String> LIZJ;
                public final String LIZLLL;
                public final String LJ;
                public final LinkedList<OutreachFlowReportItem> LJFF;
                public final Map<String, OutreachFlowReportItem> LJI;

                public final String toString() {
                    StringBuilder sb = new StringBuilder("RecordItemStack(ruleId=");
                    sb.append(this.LIZIZ);
                    sb.append(", bindKeys=");
                    sb.append(this.LIZJ);
                    sb.append(", outreachType=");
                    sb.append(this.LIZLLL);
                    sb.append(", scene=");
                    sb.append(this.LJ);
                    sb.append(", cacheMap=");
                    Map<String, OutreachFlowReportItem> map = this.LJI;
                    ArrayList arrayList = new ArrayList(map.size());
                    for (Map.Entry<String, OutreachFlowReportItem> entry : map.entrySet()) {
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("CacheItem: key=");
                        sbLIZ2.append(entry.getKey());
                        sbLIZ2.append(", value=");
                        sbLIZ2.append(entry.getValue());
                        arrayList.add(C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    sb.append(C13LP.LJJLIIIJ(arrayList, ", ", null, null, 0, null, null, 62));
                    sb.append(", recordDeque=");
                    sb.append(C13LP.LJJLIIIJ(this.LJFF, ", ", null, null, 0, null, AFwS247S0000000_13.get$arr$(67), 30));
                    sb.append(')');
                    return sb.toString();
                }

                @Override // X.InterfaceC822740WPg
                public final String LIZIZ() {
                    return this.LIZ;
                }

                @Override // X.InterfaceC822740WPg
                public final String LIZJ() {
                    return this.LIZLLL;
                }

                @Override // X.InterfaceC822740WPg
                public final List<String> LIZLLL() {
                    return this.LIZJ;
                }

                @Override // X.InterfaceC822740WPg
                public final String getScene() {
                    return this.LJ;
                }

                @Override // X.InterfaceC822740WPg
                public final synchronized void doLoop(Function1<? super OutreachFlowReportItem, Boolean> function1) {
                    ArrayList arrayList = new ArrayList();
                    for (OutreachFlowReportItem outreachFlowReportItem : this.LJFF) {
                        ShowReportInfo showReportInfo = outreachFlowReportItem.showReportInfo;
                        if (showReportInfo != null && C818420W8q.LIZ(showReportInfo) > 0) {
                            arrayList.add(outreachFlowReportItem);
                        }
                    }
                    if (arrayList.size() > 1) {
                        C08XD.LJJ(arrayList, new AComparatorS32S0000000_13(38));
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext() && function1.invoke((OutreachFlowReportItem) it2.next()).booleanValue()) {
                    }
                }

                @Override // X.InterfaceC822740WPg
                public final void LIZ(String str4, OutreachFlowReportItem outreachFlowReportItem) {
                    OutreachFlowReportItem outreachFlowReportItem2 = this.LJI.get(str4);
                    this.LJI.put(str4, outreachFlowReportItem);
                    if (outreachFlowReportItem2 == null) {
                        synchronized (this) {
                            this.LJFF.addLast(outreachFlowReportItem);
                        }
                    }
                }

                {
                    LinkedList<OutreachFlowReportItem> linkedList = new LinkedList<>();
                    ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
                    this.LIZ = strLIZIZ;
                    this.LIZIZ = str3;
                    this.LIZJ = list;
                    this.LIZLLL = str;
                    this.LJ = str2;
                    this.LJFF = linkedList;
                    this.LJI = concurrentHashMap;
                }
            };
            this.LIZJ.put(strLIZIZ, interfaceC822740WPg2);
            return interfaceC822740WPg2;
        }
        return interfaceC822740WPg;
    }

    public static void LIZ(String str, InterfaceC822840WPq interfaceC822840WPq, List list, Map map, Map map2, Function1 function1) {
        String ruleId = interfaceC822840WPq.getRuleId();
        if (ruleId == null) {
            return;
        }
        final InterfaceC822760WPi interfaceC822760WPi = (InterfaceC822760WPi) ((LinkedHashMap) map).get(str);
        final InterfaceC822760WPi interfaceC822760WPi2 = (InterfaceC822760WPi) ((LinkedHashMap) map2).get(ruleId);
        if (interfaceC822760WPi2 == null) {
            interfaceC822760WPi2 = (InterfaceC822760WPi) function1.invoke(list);
            map2.put(ruleId, interfaceC822760WPi2);
        }
        map.put(str, new InterfaceC822760WPi() { // from class: X.0WPf
            @Override // X.InterfaceC822760WPi
            public final RuleHitState LIZ(String str2, String str3) {
                RuleHitState ruleHitStateLIZ;
                Collection collection;
                Iterable iterable;
                InterfaceC822760WPi interfaceC822760WPi3 = interfaceC822760WPi;
                RuleHitState ruleHitStateLIZ2 = null;
                if (interfaceC822760WPi3 != null) {
                    ruleHitStateLIZ = interfaceC822760WPi3.LIZ(str2, str3);
                } else {
                    ruleHitStateLIZ = null;
                }
                if (ruleHitStateLIZ != null && Intrinsics.LJFF(ruleHitStateLIZ.isHit(), Boolean.TRUE)) {
                    return ruleHitStateLIZ;
                }
                InterfaceC822760WPi interfaceC822760WPi4 = interfaceC822760WPi2;
                if (interfaceC822760WPi4 != null && (ruleHitStateLIZ2 = interfaceC822760WPi4.LIZ(str2, str3)) != null && Intrinsics.LJFF(ruleHitStateLIZ2.isHit(), Boolean.TRUE)) {
                    return ruleHitStateLIZ2;
                }
                Boolean bool = Boolean.FALSE;
                if (ruleHitStateLIZ == null || (collection = ruleHitStateLIZ.hitRuleIds) == null) {
                    collection = C13BV.INSTANCE;
                }
                if (ruleHitStateLIZ2 == null || (iterable = ruleHitStateLIZ2.hitRuleIds) == null) {
                    iterable = C13BV.INSTANCE;
                }
                return new RuleHitState(str2, str3, bool, C13LP.LJLIL(iterable, collection), null, System.currentTimeMillis());
            }
        });
    }
}
