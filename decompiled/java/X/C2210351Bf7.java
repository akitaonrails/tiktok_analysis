package X;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: X.1Bf7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210351Bf7 {
    public final long LIZ;
    public final long LIZIZ;
    public final InterfaceC2211271Bgb LIZJ;
    public final LinkedList<C2210821Bfs> LIZLLL = new LinkedList<>();
    public final Map<String, Integer> LJ = new HashMap();

    public final void LIZJ() {
        HashMap map = new HashMap(this.LJ);
        ((HashMap) this.LJ).clear();
        this.LIZLLL.clear();
        InterfaceC2211271Bgb interfaceC2211271Bgb = this.LIZJ;
        if (interfaceC2211271Bgb != null) {
            C2211001BgA c2211001BgA = (C2211001BgA) interfaceC2211271Bgb;
            c2211001BgA.getClass();
            HashMap map2 = new HashMap();
            map2.put("events", map);
            c2211001BgA.LIZ.LIZJ(EnumC2210541BfQ.DataCollection, EnumC2210371Bf9.HighFrequency, EnumC2210591BfV.Fatal, "high frequency events detected", map2);
        }
    }

    public final void LIZIZ(long j) {
        while (!this.LIZLLL.isEmpty() && this.LIZLLL.getFirst().LIZJ < j - this.LIZ) {
            C2210821Bfs c2210821BfsRemoveFirst = this.LIZLLL.removeFirst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c2210821BfsRemoveFirst.LIZ);
            sbLIZ.append(":");
            sbLIZ.append(c2210821BfsRemoveFirst.LIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Integer num = (Integer) ((HashMap) this.LJ).get(strLIZIZ);
            if (num != null) {
                if (num.intValue() > 1) {
                    ((HashMap) this.LJ).put(strLIZIZ, Integer.valueOf(num.intValue() - 1));
                } else {
                    ((HashMap) this.LJ).remove(strLIZIZ);
                }
            }
        }
    }

    public C2210351Bf7(long j, long j2, C2211001BgA c2211001BgA) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = c2211001BgA;
    }

    public final synchronized void LIZ(EnumC2176421AFs enumC2176421AFs, String str, long j) {
        this.LIZLLL.add(new C2210821Bfs(enumC2176421AFs, str, j));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC2176421AFs);
        sbLIZ.append(":");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Integer num = (Integer) ((HashMap) this.LJ).get(strLIZIZ);
        if (num == null) {
            ((HashMap) this.LJ).put(strLIZIZ, 1);
        } else {
            ((HashMap) this.LJ).put(strLIZIZ, Integer.valueOf(num.intValue() + 1));
        }
        LIZIZ(j);
        if (this.LIZLLL.size() > this.LIZIZ) {
            LIZJ();
        }
    }
}
