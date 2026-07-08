package X;

import com.ss.android.ugc.aweme.bubble.record.BubbleRecord;
import com.ss.android.ugc.aweme.experiment.FrequencyRules;
import com.ss.android.ugc.aweme.experiment.TimeWindow;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0wh5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1790490wh5 implements InterfaceC1790610whH {
    public final C1790550whB LIZ;
    public final List<String> LIZIZ;
    public final FrequencyRules LIZJ;
    public final String LIZLLL;
    public final EnumC1790480wh4 LJ;
    public final int LJFF;
    public String LJI;
    public final AbstractC1790510wh7 LJII;

    public C1790490wh5() {
        throw null;
    }

    @Override // X.InterfaceC1790610whH
    public final boolean LIZJ(C1906460zi8 c1906460zi8) {
        return false;
    }

    @Override // X.InterfaceC1790610whH
    public final boolean LIZLLL(String str) {
        return false;
    }

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
        AbstractC1790510wh7 abstractC1790510wh7;
        int iIntValue;
        String str;
        List list;
        int i;
        if (!this.LIZIZ.contains(c1906460zi8.LIZ) || (abstractC1790510wh7 = this.LJII) == null) {
            return false;
        }
        C1790550whB c1790550whB = this.LIZ;
        List<String> list2 = this.LIZIZ;
        c1790550whB.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        ArrayList arrayList = new ArrayList();
        Iterator<String> it2 = list2.iterator();
        int i2 = 0;
        while (true) {
            boolean z = true;
            if (it2.hasNext()) {
                String next = it2.next();
                C1790530wh9 c1790530wh9 = (C1790530wh9) ((Map) c1790550whB.LIZ.getValue()).get(next);
                if (c1790530wh9 == null || (list = c1790530wh9.LIZJ) == null) {
                    list = C13BV.INSTANCE;
                }
                if ((list instanceof Collection) && list.isEmpty()) {
                    i = 0;
                } else {
                    Iterator it3 = list.iterator();
                    i = 0;
                    while (it3.hasNext()) {
                        long j = ((BubbleRecord) it3.next()).dismissTime;
                        if (j <= jCurrentTimeMillis && abstractC1790510wh7.LIZIZ(j) && (i = i + 1) < 0) {
                            C1697810uHb.LJIJ();
                            throw null;
                        }
                    }
                }
                if (i > 0) {
                    arrayList.add(next);
                }
                i2 += i;
            } else {
                Pair pair = new Pair(Integer.valueOf(i2), arrayList);
                int iIntValue2 = ((Number) pair.getFirst()).intValue();
                List list3 = (List) pair.getSecond();
                Integer num = this.LIZJ.limit;
                if (num != null) {
                    iIntValue = num.intValue();
                } else {
                    iIntValue = 0;
                }
                if (iIntValue2 < iIntValue) {
                    z = false;
                }
                C1586120rNS c1586120rNS = C1586120rNS.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append('[');
                sbLIZ.append(c1906460zi8.LIZ);
                sbLIZ.append("] FrequencyRuleProcessor preShow: ");
                sbLIZ.append(iIntValue2);
                sbLIZ.append(", ");
                sbLIZ.append(z);
                C2188811AlT.LIZIZ(sbLIZ);
                c1586120rNS.getClass();
                if (!z || (str = (String) C13LP.LJJJLL(list3)) == null) {
                    str = "";
                }
                this.LJI = str;
                return z;
            }
        }
    }

    public C1790490wh5(C1790550whB c1790550whB, List list, FrequencyRules frequencyRules) {
        String str = frequencyRules.ruleId;
        EnumC1790480wh4 enumC1790480wh4 = EnumC1790480wh4.FREQUENCY;
        this.LIZ = c1790550whB;
        this.LIZIZ = list;
        this.LIZJ = frequencyRules;
        this.LIZLLL = str;
        this.LJ = enumC1790480wh4;
        this.LJFF = 101;
        this.LJI = "";
        TimeWindow timeWindow = frequencyRules.timeWindow;
        AbstractC1790510wh7 abstractC1790510wh7LIZ = null;
        if (timeWindow != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(frequencyRules.ruleId);
            sbLIZ.append('-');
            TimeWindow timeWindow2 = frequencyRules.timeWindow;
            sbLIZ.append(timeWindow2 != null ? timeWindow2.type : null);
            C2188811AlT.LIZIZ(sbLIZ);
            abstractC1790510wh7LIZ = C1387590mDF.LIZ(timeWindow);
        }
        this.LJII = abstractC1790510wh7LIZ;
    }
}
