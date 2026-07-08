package X;

import Y.AComparatorS43S0000000_24;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.bubble.record.BubbleRecord;
import com.ss.android.ugc.aweme.experiment.ExitRules;
import com.ss.android.ugc.aweme.experiment.FcpTooltipConfig;
import com.ss.android.ugc.aweme.experiment.FrequencyRules;
import com.ss.android.ugc.aweme.experiment.TimeWindow;
import com.ss.android.ugc.aweme.experiment.TooltipBindConfig;
import com.ss.android.ugc.aweme.experiment.TooltipRuleConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0wWG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1783780wWG extends C09AY implements Function0<Map<String, ? extends List<InterfaceC1790610whH>>> {
    public final /* synthetic */ C1790450wh1 LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1783780wWG(C1790450wh1 c1790450wh1) {
        super(0);
        this.LL = c1790450wh1;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<String, ? extends List<InterfaceC1790610whH>> invoke() {
        List list;
        List list2;
        FcpTooltipConfig fcpTooltipConfig = (FcpTooltipConfig) C295110BhV.LIZ.getValue();
        if (fcpTooltipConfig == null) {
            return C2097608Jq.LJ();
        }
        C1790450wh1 c1790450wh1 = this.LL;
        c1790450wh1.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TooltipRuleConfig tooltipRuleConfig = fcpTooltipConfig.tooltipRuleConfig;
        if (tooltipRuleConfig == null || (list = tooltipRuleConfig.frequencyRules) == null) {
            list = C13BV.INSTANCE;
        }
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(iLIZIZ);
        for (Object obj : list) {
            linkedHashMap2.put(((FrequencyRules) obj).ruleId, obj);
        }
        TooltipRuleConfig tooltipRuleConfig2 = fcpTooltipConfig.tooltipRuleConfig;
        if (tooltipRuleConfig2 == null || (list2 = tooltipRuleConfig2.exitRules) == null) {
            list2 = C13BV.INSTANCE;
        }
        int iLIZIZ2 = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list2, 10));
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(iLIZIZ2 >= 16 ? iLIZIZ2 : 16);
        for (Object obj2 : list2) {
            linkedHashMap3.put(((ExitRules) obj2).ruleId, obj2);
        }
        for (TooltipBindConfig tooltipBindConfig : fcpTooltipConfig.tooltipBindConfigs) {
            String str = tooltipBindConfig.type;
            if (Intrinsics.LJFF(str, EnumC1778500wNk.EACH.getType())) {
                for (String str2 : tooltipBindConfig.ids) {
                    Object arrayList = linkedHashMap.get(str2);
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                        linkedHashMap.put(str2, arrayList);
                    }
                    List list3 = (List) arrayList;
                    List<String> list4 = tooltipBindConfig.frequencyRules;
                    ArrayList arrayList2 = new ArrayList();
                    Iterator<String> it2 = list4.iterator();
                    while (it2.hasNext()) {
                        FrequencyRules frequencyRules = (FrequencyRules) linkedHashMap2.get(it2.next());
                        if (frequencyRules != null) {
                            arrayList2.add(new C1790490wh5(c1790450wh1.LIZ, Collections.singletonList(str2), frequencyRules));
                        }
                    }
                    C19719612Di.LJJI(arrayList2, list3);
                    List<String> list5 = tooltipBindConfig.exitRules;
                    ArrayList arrayList3 = new ArrayList();
                    Iterator<String> it3 = list5.iterator();
                    while (it3.hasNext()) {
                        final ExitRules exitRules = (ExitRules) linkedHashMap3.get(it3.next());
                        if (exitRules != null) {
                            final C1790550whB c1790550whB = c1790450wh1.LIZ;
                            final List listSingletonList = Collections.singletonList(str2);
                            arrayList3.add(new InterfaceC1790610whH(c1790550whB, listSingletonList, exitRules) { // from class: X.0wh6
                                public final C1790550whB LIZ;
                                public final List<String> LIZIZ;
                                public final ExitRules LIZJ;
                                public final String LIZLLL;
                                public final EnumC1790480wh4 LJ;
                                public final int LJFF;
                                public final AbstractC1790510wh7 LJI;
                                public final AbstractC1790510wh7 LJII;

                                @Override // X.InterfaceC1790610whH
                                public final EnumC1790480wh4 LIZ() {
                                    return this.LJ;
                                }

                                @Override // X.InterfaceC1790610whH
                                public final int getPriority() {
                                    return this.LJFF;
                                }

                                @Override // X.InterfaceC1790610whH
                                public final String getRuleId() {
                                    return this.LIZLLL;
                                }

                                @Override // X.InterfaceC1790610whH
                                public final boolean LIZIZ(C1906460zi8 c1906460zi8) {
                                    boolean z = false;
                                    if (!this.LIZIZ.contains(c1906460zi8.LIZ)) {
                                        return false;
                                    }
                                    System.currentTimeMillis();
                                    long j = this.LIZ.LIZIZ(c1906460zi8.LIZ).LIZIZ;
                                    if (j != 0) {
                                        if (System.currentTimeMillis() <= j) {
                                            z = true;
                                        } else {
                                            for (String str3 : this.LIZIZ) {
                                                this.LIZ.LIZJ(0L, str3);
                                                this.LIZ.LIZIZ(str3).LIZJ.clear();
                                                Keva keva = C1790560whC.LIZ;
                                                C13BV c13bv = C13BV.INSTANCE;
                                                Keva keva2 = C1790560whC.LIZIZ;
                                                C1227904rF.LIZ.getClass();
                                                keva2.storeString(str3, C1227904rF.LJI(c13bv));
                                            }
                                        }
                                    }
                                    C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                                    Objects.toString(this.LJ);
                                    System.currentTimeMillis();
                                    c1586120rNS.getClass();
                                    return z;
                                }

                                @Override // X.InterfaceC1790610whH
                                public final boolean LIZJ(C1906460zi8 c1906460zi8) {
                                    Integer num;
                                    long jLIZ;
                                    if (!this.LIZIZ.contains(c1906460zi8.LIZ) || (num = this.LIZJ.showTimes) == null) {
                                        return false;
                                    }
                                    int iIntValue = num.intValue();
                                    AbstractC1790510wh7 abstractC1790510wh7 = this.LJI;
                                    if (abstractC1790510wh7 == null) {
                                        return false;
                                    }
                                    List<String> list6 = this.LIZIZ;
                                    long jCurrentTimeMillis2 = System.currentTimeMillis();
                                    Iterator<String> it4 = list6.iterator();
                                    int i = 0;
                                    boolean z = false;
                                    while (it4.hasNext()) {
                                        C1790530wh9 c1790530wh9LIZIZ = this.LIZ.LIZIZ(it4.next());
                                        int iLJIIJ = C1697810uHb.LJIIJ(c1790530wh9LIZIZ.LIZJ);
                                        while (true) {
                                            if (-1 < iLJIIJ) {
                                                BubbleRecord bubbleRecord = (BubbleRecord) ListProtector.get(c1790530wh9LIZIZ.LIZJ, iLJIIJ);
                                                if (bubbleRecord.dismissTime > System.currentTimeMillis() || abstractC1790510wh7.LIZIZ(bubbleRecord.dismissTime)) {
                                                    if (bubbleRecord.status == 0) {
                                                        i++;
                                                        if (i >= iIntValue) {
                                                            z = true;
                                                            break;
                                                        }
                                                        iLJIIJ--;
                                                    } else {
                                                        z = false;
                                                        break;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(this.LIZIZ);
                                    sbLIZ.append(" - ");
                                    sbLIZ.append(this.LJ);
                                    sbLIZ.append(" [");
                                    sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                                    sbLIZ.append("] postShow continuousShowCount: ");
                                    sbLIZ.append(i);
                                    sbLIZ.append(", toExit: ");
                                    sbLIZ.append(z);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    c1586120rNS.getClass();
                                    if (z) {
                                        for (String str3 : this.LIZIZ) {
                                            C1790550whB c1790550whB2 = this.LIZ;
                                            AbstractC1790510wh7 abstractC1790510wh72 = this.LJII;
                                            if (abstractC1790510wh72 != null) {
                                                jLIZ = abstractC1790510wh72.LIZ(System.currentTimeMillis());
                                            } else {
                                                jLIZ = 0;
                                            }
                                            c1790550whB2.LIZJ(jLIZ, str3);
                                        }
                                    }
                                    return z;
                                }

                                @Override // X.InterfaceC1790610whH
                                public final boolean LIZLLL(String str3) {
                                    if (!this.LIZIZ.contains(str3) || this.LIZ.LIZIZ(str3).LIZIZ == 0) {
                                        return false;
                                    }
                                    this.LIZ.LIZJ(0L, str3);
                                    C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(this.LIZIZ);
                                    sbLIZ.append(" - ");
                                    sbLIZ.append(this.LJ);
                                    sbLIZ.append(" revertExitOnConsume: ");
                                    sbLIZ.append(str3);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    c1586120rNS.getClass();
                                    return true;
                                }

                                {
                                    AbstractC1790510wh7 abstractC1790510wh7LIZ;
                                    String str3;
                                    String str4 = exitRules.ruleId;
                                    EnumC1790480wh4 enumC1790480wh4 = EnumC1790480wh4.EXIT;
                                    this.LIZ = c1790550whB;
                                    this.LIZIZ = listSingletonList;
                                    this.LIZJ = exitRules;
                                    this.LIZLLL = str4;
                                    this.LJ = enumC1790480wh4;
                                    this.LJFF = 100;
                                    TimeWindow timeWindow = exitRules.timeWindow;
                                    AbstractC1790510wh7 abstractC1790510wh7LIZ2 = null;
                                    if (timeWindow != null) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append(exitRules.ruleId);
                                        sbLIZ.append('-');
                                        TimeWindow timeWindow2 = exitRules.timeWindow;
                                        if (timeWindow2 != null) {
                                            str3 = timeWindow2.type;
                                        } else {
                                            str3 = null;
                                        }
                                        sbLIZ.append(str3);
                                        C2188811AlT.LIZIZ(sbLIZ);
                                        abstractC1790510wh7LIZ = C1387590mDF.LIZ(timeWindow);
                                    } else {
                                        abstractC1790510wh7LIZ = null;
                                    }
                                    this.LJI = abstractC1790510wh7LIZ;
                                    TimeWindow timeWindow3 = exitRules.blockTimeWindow;
                                    if (timeWindow3 != null) {
                                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                        sbLIZ2.append(exitRules.ruleId);
                                        sbLIZ2.append('-');
                                        TimeWindow timeWindow4 = exitRules.blockTimeWindow;
                                        sbLIZ2.append(timeWindow4 != null ? timeWindow4.type : null);
                                        C2188811AlT.LIZIZ(sbLIZ2);
                                        abstractC1790510wh7LIZ2 = C1387590mDF.LIZ(timeWindow3);
                                    }
                                    this.LJII = abstractC1790510wh7LIZ2;
                                }
                            });
                        }
                    }
                    C19719612Di.LJJI(arrayList3, list3);
                    if (list3.size() > 1) {
                        C08XD.LJJ(list3, new AComparatorS43S0000000_24(22));
                    }
                    linkedHashMap.put(str2, list3);
                }
            } else if (Intrinsics.LJFF(str, EnumC1778500wNk.MERGE.getType())) {
                List<String> list6 = tooltipBindConfig.frequencyRules;
                ArrayList arrayList4 = new ArrayList();
                Iterator<String> it4 = list6.iterator();
                while (it4.hasNext()) {
                    FrequencyRules frequencyRules2 = (FrequencyRules) linkedHashMap2.get(it4.next());
                    if (frequencyRules2 != null) {
                        arrayList4.add(new C1790490wh5(c1790450wh1.LIZ, tooltipBindConfig.ids, frequencyRules2));
                    }
                }
                List<String> list7 = tooltipBindConfig.exitRules;
                ArrayList arrayList5 = new ArrayList();
                Iterator<String> it5 = list7.iterator();
                while (it5.hasNext()) {
                    final ExitRules exitRules2 = (ExitRules) linkedHashMap3.get(it5.next());
                    if (exitRules2 != null) {
                        final C1790550whB c1790550whB2 = c1790450wh1.LIZ;
                        final List<String> list8 = tooltipBindConfig.ids;
                        arrayList5.add(new InterfaceC1790610whH(c1790550whB2, list8, exitRules2) { // from class: X.0wh6
                            public final C1790550whB LIZ;
                            public final List<String> LIZIZ;
                            public final ExitRules LIZJ;
                            public final String LIZLLL;
                            public final EnumC1790480wh4 LJ;
                            public final int LJFF;
                            public final AbstractC1790510wh7 LJI;
                            public final AbstractC1790510wh7 LJII;

                            @Override // X.InterfaceC1790610whH
                            public final EnumC1790480wh4 LIZ() {
                                return this.LJ;
                            }

                            @Override // X.InterfaceC1790610whH
                            public final int getPriority() {
                                return this.LJFF;
                            }

                            @Override // X.InterfaceC1790610whH
                            public final String getRuleId() {
                                return this.LIZLLL;
                            }

                            @Override // X.InterfaceC1790610whH
                            public final boolean LIZIZ(C1906460zi8 c1906460zi8) {
                                boolean z = false;
                                if (!this.LIZIZ.contains(c1906460zi8.LIZ)) {
                                    return false;
                                }
                                System.currentTimeMillis();
                                long j = this.LIZ.LIZIZ(c1906460zi8.LIZ).LIZIZ;
                                if (j != 0) {
                                    if (System.currentTimeMillis() <= j) {
                                        z = true;
                                    } else {
                                        for (String str3 : this.LIZIZ) {
                                            this.LIZ.LIZJ(0L, str3);
                                            this.LIZ.LIZIZ(str3).LIZJ.clear();
                                            Keva keva = C1790560whC.LIZ;
                                            C13BV c13bv = C13BV.INSTANCE;
                                            Keva keva2 = C1790560whC.LIZIZ;
                                            C1227904rF.LIZ.getClass();
                                            keva2.storeString(str3, C1227904rF.LJI(c13bv));
                                        }
                                    }
                                }
                                C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                                Objects.toString(this.LJ);
                                System.currentTimeMillis();
                                c1586120rNS.getClass();
                                return z;
                            }

                            @Override // X.InterfaceC1790610whH
                            public final boolean LIZJ(C1906460zi8 c1906460zi8) {
                                Integer num;
                                long jLIZ;
                                if (!this.LIZIZ.contains(c1906460zi8.LIZ) || (num = this.LIZJ.showTimes) == null) {
                                    return false;
                                }
                                int iIntValue = num.intValue();
                                AbstractC1790510wh7 abstractC1790510wh7 = this.LJI;
                                if (abstractC1790510wh7 == null) {
                                    return false;
                                }
                                List<String> list62 = this.LIZIZ;
                                long jCurrentTimeMillis2 = System.currentTimeMillis();
                                Iterator<String> it42 = list62.iterator();
                                int i = 0;
                                boolean z = false;
                                while (it42.hasNext()) {
                                    C1790530wh9 c1790530wh9LIZIZ = this.LIZ.LIZIZ(it42.next());
                                    int iLJIIJ = C1697810uHb.LJIIJ(c1790530wh9LIZIZ.LIZJ);
                                    while (true) {
                                        if (-1 < iLJIIJ) {
                                            BubbleRecord bubbleRecord = (BubbleRecord) ListProtector.get(c1790530wh9LIZIZ.LIZJ, iLJIIJ);
                                            if (bubbleRecord.dismissTime > System.currentTimeMillis() || abstractC1790510wh7.LIZIZ(bubbleRecord.dismissTime)) {
                                                if (bubbleRecord.status == 0) {
                                                    i++;
                                                    if (i >= iIntValue) {
                                                        z = true;
                                                        break;
                                                    }
                                                    iLJIIJ--;
                                                } else {
                                                    z = false;
                                                    break;
                                                }
                                            }
                                        }
                                    }
                                }
                                C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(" - ");
                                sbLIZ.append(this.LJ);
                                sbLIZ.append(" [");
                                sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis2);
                                sbLIZ.append("] postShow continuousShowCount: ");
                                sbLIZ.append(i);
                                sbLIZ.append(", toExit: ");
                                sbLIZ.append(z);
                                C2188811AlT.LIZIZ(sbLIZ);
                                c1586120rNS.getClass();
                                if (z) {
                                    for (String str3 : this.LIZIZ) {
                                        C1790550whB c1790550whB22 = this.LIZ;
                                        AbstractC1790510wh7 abstractC1790510wh72 = this.LJII;
                                        if (abstractC1790510wh72 != null) {
                                            jLIZ = abstractC1790510wh72.LIZ(System.currentTimeMillis());
                                        } else {
                                            jLIZ = 0;
                                        }
                                        c1790550whB22.LIZJ(jLIZ, str3);
                                    }
                                }
                                return z;
                            }

                            @Override // X.InterfaceC1790610whH
                            public final boolean LIZLLL(String str3) {
                                if (!this.LIZIZ.contains(str3) || this.LIZ.LIZIZ(str3).LIZIZ == 0) {
                                    return false;
                                }
                                this.LIZ.LIZJ(0L, str3);
                                C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                                StringBuilder sbLIZ = C2188811AlT.LIZ();
                                sbLIZ.append(this.LIZIZ);
                                sbLIZ.append(" - ");
                                sbLIZ.append(this.LJ);
                                sbLIZ.append(" revertExitOnConsume: ");
                                sbLIZ.append(str3);
                                C2188811AlT.LIZIZ(sbLIZ);
                                c1586120rNS.getClass();
                                return true;
                            }

                            {
                                AbstractC1790510wh7 abstractC1790510wh7LIZ;
                                String str3;
                                String str4 = exitRules2.ruleId;
                                EnumC1790480wh4 enumC1790480wh4 = EnumC1790480wh4.EXIT;
                                this.LIZ = c1790550whB2;
                                this.LIZIZ = list8;
                                this.LIZJ = exitRules2;
                                this.LIZLLL = str4;
                                this.LJ = enumC1790480wh4;
                                this.LJFF = 100;
                                TimeWindow timeWindow = exitRules2.timeWindow;
                                AbstractC1790510wh7 abstractC1790510wh7LIZ2 = null;
                                if (timeWindow != null) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(exitRules2.ruleId);
                                    sbLIZ.append('-');
                                    TimeWindow timeWindow2 = exitRules2.timeWindow;
                                    if (timeWindow2 != null) {
                                        str3 = timeWindow2.type;
                                    } else {
                                        str3 = null;
                                    }
                                    sbLIZ.append(str3);
                                    C2188811AlT.LIZIZ(sbLIZ);
                                    abstractC1790510wh7LIZ = C1387590mDF.LIZ(timeWindow);
                                } else {
                                    abstractC1790510wh7LIZ = null;
                                }
                                this.LJI = abstractC1790510wh7LIZ;
                                TimeWindow timeWindow3 = exitRules2.blockTimeWindow;
                                if (timeWindow3 != null) {
                                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                                    sbLIZ2.append(exitRules2.ruleId);
                                    sbLIZ2.append('-');
                                    TimeWindow timeWindow4 = exitRules2.blockTimeWindow;
                                    sbLIZ2.append(timeWindow4 != null ? timeWindow4.type : null);
                                    C2188811AlT.LIZIZ(sbLIZ2);
                                    abstractC1790510wh7LIZ2 = C1387590mDF.LIZ(timeWindow3);
                                }
                                this.LJII = abstractC1790510wh7LIZ2;
                            }
                        });
                    }
                }
                for (String str3 : tooltipBindConfig.ids) {
                    Object arrayList6 = linkedHashMap.get(str3);
                    if (arrayList6 == null) {
                        arrayList6 = new ArrayList();
                        linkedHashMap.put(str3, arrayList6);
                    }
                    Collection collection = (Collection) arrayList6;
                    C19719612Di.LJJI(arrayList4, collection);
                    C19719612Di.LJJI(arrayList5, collection);
                    linkedHashMap.put(str3, collection);
                }
            }
        }
        C1586120rNS c1586120rNS = C1586120rNS.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("buildRuleMap[");
        sbLIZ.append(System.currentTimeMillis() - jCurrentTimeMillis);
        sbLIZ.append(']');
        C2188811AlT.LIZIZ(sbLIZ);
        c1586120rNS.getClass();
        return linkedHashMap;
    }
}
