package X;

import android.os.Handler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0j7s, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1268940j7s implements InterfaceC1272840jEA {
    public static final /* synthetic */ int LLILLJJLI = 0;
    public InterfaceC1268930j7r LL = new InterfaceC1268930j7r() { // from class: X.01BZ
        public int LIZ;
        public long LIZIZ;
        public final HashSet<Integer> LIZJ = new HashSet<>();
        public final Map<Integer, Integer> LIZLLL = new LinkedHashMap();
        public final Map<Integer, C291601Ba> LJ = new LinkedHashMap();
        public final Map<Integer, C291601Ba> LJFF = new LinkedHashMap();
        public volatile long LJI;

        @Override // X.InterfaceC1268930j7r
        public final void LIZIZ(Handler handler) {
        }

        @Override // X.InterfaceC1268930j7r
        public final synchronized String LIZLLL() {
            Integer[] numArr;
            Iterator<Integer> it2 = this.LIZJ.iterator();
            while (it2.hasNext()) {
                LJI(it2.next().intValue());
            }
            numArr = new Integer[11];
            for (int i = 0; i < 11; i++) {
                numArr[i] = -1;
            }
            for (Integer num : this.LIZJ) {
                Integer num2 = (Integer) ((LinkedHashMap) this.LIZLLL).get(num);
                if (num2 != null) {
                    int iLJFF = LJFF(num.intValue(), num2.intValue());
                    int iIntValue = num.intValue() - 2;
                    if (iIntValue >= 0 && iIntValue < 11) {
                        numArr[iIntValue] = Integer.valueOf(iLJFF);
                    }
                }
            }
            return Arrays.toString(numArr);
        }

        @Override // X.InterfaceC1268930j7r
        public final void release() {
        }

        @Override // X.InterfaceC1268930j7r
        public final synchronized int LJ(int i) {
            if (!this.LIZJ.contains(Integer.valueOf(i))) {
                return -1;
            }
            Integer num = (Integer) ((LinkedHashMap) this.LIZLLL).get(Integer.valueOf(i));
            if (num == null) {
                return -1;
            }
            int iIntValue = num.intValue();
            LJI(i);
            LJI(iIntValue);
            return LJFF(i, iIntValue);
        }

        public final void LJI(int i) {
            C291601Ba c291601Ba = (C291601Ba) ((LinkedHashMap) this.LJ).get(Integer.valueOf(i));
            if (c291601Ba == null) {
                return;
            }
            C291601Ba c291601Ba2 = (C291601Ba) ((LinkedHashMap) this.LJFF).get(Integer.valueOf(i));
            if (c291601Ba2 == null) {
                return;
            }
            synchronized (c291601Ba) {
                try {
                    int size = ((ArrayList) c291601Ba.LIZJ).size();
                    for (int i2 = 0; i2 < size; i2++) {
                        c291601Ba2.LIZ(((Number) ListProtector.get(c291601Ba.LIZJ, i2)).longValue(), ((Number) ListProtector.get(c291601Ba.LIZLLL, i2)).longValue(), false);
                    }
                    ((ArrayList) c291601Ba.LIZJ).clear();
                    ((ArrayList) c291601Ba.LIZLLL).clear();
                    ((LinkedHashMap) c291601Ba.LJ).clear();
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        public final int LJFF(int i, int i2) {
            long jLongValue;
            C291601Ba c291601Ba = (C291601Ba) ((LinkedHashMap) this.LJFF).get(Integer.valueOf(i));
            if (c291601Ba == null) {
                return -1;
            }
            c291601Ba.LIZJ(this.LJI);
            C291601Ba c291601Ba2 = (C291601Ba) ((LinkedHashMap) this.LJFF).get(Integer.valueOf(i2));
            if (c291601Ba2 == null) {
                return -1;
            }
            c291601Ba2.LIZJ(this.LJI);
            int size = ((ArrayList) c291601Ba.LIZJ).size();
            long j = 0;
            int i3 = 0;
            for (int i4 = 0; i4 < size; i4++) {
                long jLongValue2 = ((Number) ListProtector.get(c291601Ba.LIZJ, i4)).longValue();
                long jLongValue3 = ((Number) ListProtector.get(c291601Ba.LIZLLL, i4)).longValue();
                Long l = (Long) ((LinkedHashMap) c291601Ba2.LJ).get(Long.valueOf(jLongValue2));
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = 0;
                }
                if (jLongValue <= jLongValue3 && jLongValue != 0 && jLongValue3 != 0) {
                    j += jLongValue3 - jLongValue;
                    i3++;
                }
            }
            if (i3 <= 0) {
                return -1;
            }
            return (int) (j / ((long) i3));
        }

        @Override // X.InterfaceC1268930j7r
        public final void LIZ(int i, long j, long j2) {
            if (j > this.LJI) {
                this.LJI = j;
            }
            if (!this.LIZJ.contains(Integer.valueOf(i))) {
                return;
            }
            C291601Ba c291601Ba = (C291601Ba) ((LinkedHashMap) this.LJ).get(Integer.valueOf(i));
            if (c291601Ba == null) {
                return;
            }
            synchronized (c291601Ba) {
                try {
                    c291601Ba.LIZ(j, j2, true);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }

        @Override // X.InterfaceC1268930j7r
        public final void LIZJ(long j, int i, Map map) {
            if (i <= 0) {
                return;
            }
            this.LIZIZ = j;
            this.LIZ = i;
            this.LIZJ.clear();
            if (map == null) {
                return;
            }
            for (Map.Entry entry : map.entrySet()) {
                int iIntValue = ((Number) entry.getKey()).intValue();
                int iIntValue2 = ((Number) entry.getValue()).intValue();
                if (iIntValue >= 1 && iIntValue <= 12 && iIntValue2 >= 1 && iIntValue2 <= 12) {
                    this.LIZJ.add(Integer.valueOf(iIntValue));
                    this.LIZJ.add(Integer.valueOf(iIntValue2));
                    this.LIZLLL.put(Integer.valueOf(iIntValue), Integer.valueOf(iIntValue2));
                    if (!this.LJ.containsKey(Integer.valueOf(iIntValue))) {
                        this.LJ.put(Integer.valueOf(iIntValue), new C291601Ba(this.LIZ, this.LIZIZ));
                        this.LJFF.put(Integer.valueOf(iIntValue), new C291601Ba(this.LIZ, this.LIZIZ));
                    }
                    if (!this.LJ.containsKey(Integer.valueOf(iIntValue2))) {
                        this.LJ.put(Integer.valueOf(iIntValue2), new C291601Ba(this.LIZ, this.LIZIZ));
                        this.LJFF.put(Integer.valueOf(iIntValue2), new C291601Ba(this.LIZ, this.LIZIZ));
                    }
                }
            }
        }
    };

    @Override // X.InterfaceC1272840jEA
    public final void onRelease() {
        InterfaceC1268930j7r interfaceC1268930j7r = this.LL;
        if (interfaceC1268930j7r != null) {
            interfaceC1268930j7r.release();
        }
        this.LL = null;
    }

    public final int LIZ(int i) {
        InterfaceC1268930j7r interfaceC1268930j7r = this.LL;
        if (interfaceC1268930j7r != null) {
            return interfaceC1268930j7r.LJ(i);
        }
        return -1;
    }
}
