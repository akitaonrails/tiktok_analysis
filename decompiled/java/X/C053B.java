package X;

import com.ss.android.ugc.aweme.im.frequencycontrol.api.frequencyrule.FrequencyMarkRecord;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.AwS403S0200000_2;

/* JADX INFO: renamed from: X.053B, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C053B extends C053H<C12907053h, InterfaceC12901053b, FrequencyMarkRecord> {
    public final C01GW LIZLLL;

    public C053B() {
        throw null;
    }

    @Override // X.C053S
    public final C053I<FrequencyMarkRecord> LJ() {
        return (C053I) this.LIZLLL.getValue();
    }

    @Override // X.C053H, X.C053S
    public final void LIZLLL(String str) {
        LJ().LJFF(FrequencyMarkRecord.LIZ(FrequencyMarkRecord.LIZ, Boolean.TRUE), str);
    }

    @Override // X.C053S
    public final void LJFF(String str) {
        String strLJIIIZ = LJIIIZ(str);
        Pair<Boolean, FrequencyMarkRecord> pairLJII = LJII(str);
        boolean zBooleanValue = pairLJII.getFirst().booleanValue();
        FrequencyMarkRecord second = pairLJII.getSecond();
        if (!zBooleanValue) {
            return;
        }
        LJIIIIZZ().LJFF(C051M.LJ(second, false), strLJIIIZ);
    }

    public C053B(C12907053h c12907053h, AnonymousClass0531 anonymousClass0531) {
        super(c12907053h, anonymousClass0531);
        this.LIZLLL = C452501pT.LIZIZ(new AwS403S0200000_2(anonymousClass0531, (C053I) null, 59));
    }

    @Override // X.C053H, X.C053S
    public final Pair LIZJ(long j, String str) {
        Long l;
        boolean zLJI = LJI(j, str);
        FrequencyMarkRecord second = LJII(str).getSecond();
        C12907053h c12907053h = this.LIZ;
        long timeInMs = c12907053h.LIZIZ.getTimeInMs(c12907053h.LIZ);
        long jLongValue = 0;
        if (zLJI) {
            if (this.LIZ.LIZJ > 0) {
                Boolean bool = Boolean.TRUE;
                Long l2 = second.lastShowTimeMs;
                if (l2 != null) {
                    jLongValue = l2.longValue();
                }
                return new Pair(bool, Long.valueOf(jLongValue));
            }
            List<Long> list = second.hitTimestamps;
            if ((list != null && (l = (Long) C13LP.LJJJLL(list)) != null) || (l = second.lastShowTimeMs) != null) {
                jLongValue = l.longValue();
            }
            return new Pair(Boolean.TRUE, Long.valueOf(jLongValue + timeInMs));
        }
        return new Pair(Boolean.FALSE, 0L);
    }

    @Override // X.C053H, X.C053S
    public final boolean LJI(long j, String str) {
        Long l;
        long jLongValue;
        Long l2;
        Pair<Boolean, FrequencyMarkRecord> pairLJII = LJII(str);
        boolean zBooleanValue = pairLJII.getFirst().booleanValue();
        FrequencyMarkRecord second = pairLJII.getSecond();
        if (zBooleanValue && (l = second.lastShowTimeMs) != null) {
            long jLongValue2 = l.longValue();
            if (jLongValue2 > 0) {
                C12907053h c12907053h = this.LIZ;
                long timeInMs = c12907053h.LIZIZ.getTimeInMs(c12907053h.LIZ);
                List<Long> list = second.hitTimestamps;
                if (list != null && (l2 = (Long) C13LP.LJJJLL(list)) != null) {
                    jLongValue = l2.longValue();
                } else {
                    jLongValue = jLongValue2;
                }
                if (this.LIZ.LIZJ > 0) {
                    Pair pair = new Pair(Long.valueOf(jLongValue2 - timeInMs), Long.valueOf(jLongValue2));
                    List list2 = second.hitTimestamps;
                    if (list2 == null) {
                        list2 = C13BV.INSTANCE;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : list2) {
                        long jLongValue3 = ((Number) obj).longValue();
                        if (jLongValue3 >= ((Number) pair.getFirst()).longValue() && jLongValue3 <= ((Number) pair.getSecond()).longValue()) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.size() < this.LIZ.LIZJ) {
                        return false;
                    }
                } else if (j < jLongValue + timeInMs) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    @Override // X.C053S
    public final void LIZIZ(long j, long j2, String str) {
        if (LJI(j2, str)) {
            return;
        }
        Pair<Boolean, FrequencyMarkRecord> pairLJII = LJII(str);
        boolean zBooleanValue = pairLJII.getFirst().booleanValue();
        FrequencyMarkRecord second = pairLJII.getSecond();
        int iIntValue = 0;
        if (!zBooleanValue) {
            LJ().LJFF(new FrequencyMarkRecord(1, Long.valueOf(j), C1697810uHb.LJIILJJIL(Long.valueOf(j)), null, 8, null), str);
            return;
        }
        C053I<FrequencyMarkRecord> c053iLJ = LJ();
        Integer num = second.count;
        if (num != null) {
            iIntValue = num.intValue();
        }
        Integer numValueOf = Integer.valueOf(iIntValue + 1);
        Long lValueOf = Long.valueOf(j);
        Collection collection = second.hitTimestamps;
        if (collection == null) {
            collection = C13BV.INSTANCE;
        }
        c053iLJ.LJFF(new FrequencyMarkRecord(numValueOf, lValueOf, C13LP.LJLILLLLZI(Long.valueOf(j), collection), null, 8, null), str);
    }
}
