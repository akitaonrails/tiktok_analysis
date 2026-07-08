package X;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/* JADX INFO: renamed from: X.1Bf8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2210361Bf8 {
    public final long LIZ;
    public final long LIZIZ;
    public final InterfaceC2211281Bgc LIZJ;
    public final LinkedList<C2210741Bfk> LIZLLL = new LinkedList<>();
    public final Map<String, C20018913Ul> LJ = new HashMap();
    public long LJFF;

    public final void LIZJ() {
        HashMap map = new HashMap(this.LJ);
        ((HashMap) this.LJ).clear();
        this.LIZLLL.clear();
        this.LJFF = 0L;
        InterfaceC2211281Bgc interfaceC2211281Bgc = this.LIZJ;
        if (interfaceC2211281Bgc != null) {
            C2211011BgB c2211011BgB = (C2211011BgB) interfaceC2211281Bgc;
            c2211011BgB.getClass();
            HashMap map2 = new HashMap();
            map2.put("events", map);
            c2211011BgB.LIZ.LIZJ(EnumC2210541BfQ.DataCollection, EnumC2210371Bf9.LargeSize, EnumC2210591BfV.Fatal, "large size events detected", map2);
        }
    }

    public final void LIZIZ(long j) {
        while (!this.LIZLLL.isEmpty() && this.LIZLLL.getFirst().LIZJ < j - this.LIZ) {
            C2210741Bfk c2210741BfkRemoveFirst = this.LIZLLL.removeFirst();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(c2210741BfkRemoveFirst.LIZ);
            sbLIZ.append(":");
            sbLIZ.append(c2210741BfkRemoveFirst.LIZIZ);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            C20018913Ul c20018913Ul = (C20018913Ul) ((HashMap) this.LJ).get(strLIZIZ);
            if (c20018913Ul != null) {
                int i = c20018913Ul.LIZIZ;
                if (i > 1) {
                    c20018913Ul.LIZIZ = i - 1;
                    c20018913Ul.LIZJ -= c2210741BfkRemoveFirst.LIZLLL;
                } else {
                    ((HashMap) this.LJ).remove(strLIZIZ);
                }
                this.LJFF -= c2210741BfkRemoveFirst.LIZLLL;
            }
        }
    }

    public C2210361Bf8(long j, long j2, C2211011BgB c2211011BgB) {
        this.LIZ = j;
        this.LIZIZ = j2;
        this.LIZJ = c2211011BgB;
    }

    public final synchronized void LIZ(EnumC2176421AFs enumC2176421AFs, String str, long j, long j2) {
        this.LIZLLL.add(new C2210741Bfk(enumC2176421AFs, str, j, j2));
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(enumC2176421AFs);
        sbLIZ.append(":");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        C20018913Ul c20018913Ul = (C20018913Ul) ((HashMap) this.LJ).get(strLIZIZ);
        if (c20018913Ul == null) {
            ((HashMap) this.LJ).put(strLIZIZ, new C20018913Ul(str, j2));
        } else {
            c20018913Ul.LIZIZ++;
            c20018913Ul.LIZJ += j2;
        }
        this.LJFF += j2;
        LIZIZ(j);
        if (this.LJFF > this.LIZIZ) {
            LIZJ();
        }
    }
}
