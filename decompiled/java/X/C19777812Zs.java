package X;

import X.C830490Whz;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.12Zs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19777812Zs {
    public final String LIZ;
    public final boolean LIZIZ;
    public final C19778212Zw LIZJ;
    public final BitSet LIZLLL;
    public final BitSet LJ;
    public final Map<Integer, Long> LJFF;
    public final C830490Whz LJI;
    public final /* synthetic */ C19777412Zo LJII;

    public C19777812Zs() {
        throw null;
    }

    public final void LIZ(AbstractC19777912Zt abstractC19777912Zt) {
        int iLIZ = abstractC19777912Zt.LIZ();
        Boolean bool = abstractC19777912Zt.LIZJ;
        if (bool != null) {
            this.LJ.set(iLIZ, bool.booleanValue());
        }
        Boolean bool2 = abstractC19777912Zt.LIZLLL;
        if (bool2 != null) {
            this.LIZLLL.set(iLIZ, bool2.booleanValue());
        }
        if (abstractC19777912Zt.LJ != null) {
            Long l = this.LJFF.get(Integer.valueOf(iLIZ));
            long jLongValue = abstractC19777912Zt.LJ.longValue() / 1000;
            if (l == null || jLongValue > l.longValue()) {
                this.LJFF.put(Integer.valueOf(iLIZ), Long.valueOf(jLongValue));
            }
        }
        if (abstractC19777912Zt.LJFF != null) {
            List arrayList = (List) this.LJI.get(Integer.valueOf(iLIZ));
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.LJI.put(Integer.valueOf(iLIZ), arrayList);
            }
            if (abstractC19777912Zt.LJI()) {
                arrayList.clear();
            }
            C19820312gj.LIZ();
            C19791812c8 c19791812c8 = this.LJII.LIZ.LJI;
            String str = this.LIZ;
            C19812612fU<Boolean> c19812612fU = C19817012gC.LJJLIIIJILLIZJL;
            if (c19791812c8.LJIJI(str, c19812612fU) && abstractC19777912Zt.LJFF()) {
                arrayList.clear();
            }
            C19820312gj.LIZ();
            if (this.LJII.LIZ.LJI.LJIJI(this.LIZ, c19812612fU)) {
                long jLongValue2 = abstractC19777912Zt.LJFF.longValue() / 1000;
                if (!arrayList.contains(Long.valueOf(jLongValue2))) {
                    arrayList.add(Long.valueOf(jLongValue2));
                    return;
                }
                return;
            }
            arrayList.add(Long.valueOf(abstractC19777912Zt.LJFF.longValue() / 1000));
        }
    }

    public C19777812Zs(C19777412Zo c19777412Zo, String str) {
        this.LJII = c19777412Zo;
        this.LIZ = str;
        this.LIZIZ = true;
        this.LIZLLL = new BitSet();
        this.LJ = new BitSet();
        this.LJFF = new C830490Whz();
        this.LJI = new C830490Whz();
    }

    public C19777812Zs(C19777412Zo c19777412Zo, String str, C19778212Zw c19778212Zw, BitSet bitSet, BitSet bitSet2, C830490Whz c830490Whz, C830490Whz c830490Whz2) {
        this.LJII = c19777412Zo;
        this.LIZ = str;
        this.LIZLLL = bitSet;
        this.LJ = bitSet2;
        this.LJFF = c830490Whz;
        this.LJI = new C830490Whz();
        for (Object obj : (C830490Whz.c) c830490Whz2.keySet()) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(c830490Whz2.get(obj));
            this.LJI.put(obj, arrayList);
        }
        this.LIZIZ = false;
        this.LIZJ = c19778212Zw;
    }
}
