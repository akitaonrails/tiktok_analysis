package X;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: renamed from: X.11aM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public abstract class AbstractC19526011aM implements InterfaceC19524311a5 {
    public InterfaceC19524411a6 LIZ;
    public AbstractC19526311aP LIZIZ;
    public AbstractC19527711ad LIZJ;
    public InterfaceC19523011Zs LIZLLL;
    public final C19527111aX LJ;
    public int LJFF;
    public boolean LJI;
    public boolean LJII;
    public String LJIIIIZZ;

    @Override // X.InterfaceC19524311a5
    public Object LIZ(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list, C11ZU c11zu, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return LJJIFFI(this, interfaceC19526511aR, list, c11zu, interfaceC1364105Vn);
    }

    @Override // X.InterfaceC19524311a5
    public final void LJIIJJI() {
        this.LJI = true;
    }

    public abstract Object LJIJI(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list, List<? extends InterfaceC19526611aS> list2, InterfaceC1364105Vn<? super String> interfaceC1364105Vn);

    public abstract boolean LJIJJ(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu);

    public abstract void LJIJJLI(InterfaceC19526611aS interfaceC19526611aS, C11ZU c11zu);

    /* JADX WARN: Multi-variable type inference failed */
    public List<InterfaceC19526611aS> LJIL(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list) {
        return list;
    }

    @Override // X.InterfaceC19524311a5
    public final boolean LJFF() {
        return this.LIZLLL != null;
    }

    public AbstractC19526011aM() {
        AbstractC19527711ad abstractC19527711adLIZ;
        AbstractC19526311aP abstractC19526311aPLIZ;
        AbstractC19529211as abstractC19529211as = C19527411aa.LIZ.get("schedule_handler_none");
        this.LIZIZ = (abstractC19529211as == null || (abstractC19526311aPLIZ = abstractC19529211as.LIZ()) == null) ? C19528411ak.LIZIZ.LIZ() : abstractC19526311aPLIZ;
        AbstractC19529311at abstractC19529311at = C19527511ab.LIZ.get("schedule_item_one_by_one");
        this.LIZJ = (abstractC19529311at == null || (abstractC19527711adLIZ = abstractC19529311at.LIZ()) == null) ? C19528211ai.LIZIZ.LIZ() : abstractC19527711adLIZ;
        this.LJ = new C19527111aX();
    }

    @Override // X.InterfaceC19524311a5
    public final AbstractC19527711ad LJIIIIZZ() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC19524311a5
    public final InterfaceC19524411a6 LJIILIIL() {
        return this.LIZ;
    }

    @Override // X.InterfaceC19524311a5
    public final AbstractC19526311aP LJIILJJIL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC19524311a5
    public int LJIIZILJ() {
        return this.LJFF;
    }

    @Override // X.InterfaceC19524311a5
    public final void LIZJ(String str) {
        this.LJIIIIZZ = str;
        this.LJII = true;
    }

    @Override // X.InterfaceC19524311a5
    public final void LIZLLL(C1891460zJw c1891460zJw) {
        this.LIZ = c1891460zJw;
    }

    @Override // X.InterfaceC19524311a5
    public final Set<InterfaceC19526611aS> LJ(InterfaceC19526511aR interfaceC19526511aR) {
        return interfaceC19526511aR.LIZIZ(this);
    }

    @Override // X.InterfaceC19524311a5
    public final void LJIIL(InterfaceC19523011Zs interfaceC19523011Zs) {
        this.LIZLLL = interfaceC19523011Zs;
    }

    @Override // X.InterfaceC19524311a5
    public final void LJIILL(InterfaceC19526511aR interfaceC19526511aR) {
        interfaceC19526511aR.LIZIZ(this).clear();
    }

    @Override // X.InterfaceC19524311a5
    public final void LJIIIZ(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list) {
        interfaceC19526511aR.LIZIZ(this).addAll(list);
    }

    public final void LJIJ(String str, String str2) {
        this.LJ.LIZ(str, str2);
    }

    public final <T> T LJJIII(InterfaceC19526611aS interfaceC19526611aS, String str) {
        String strLIZIZ = this.LJ.LIZIZ(str);
        if (strLIZIZ != null) {
            return (T) interfaceC19526611aS.LJIIL(strLIZIZ);
        }
        return null;
    }

    public final void LJJIIJ(String str, List<? extends InterfaceC19524311a5> list) {
        if (list == null) {
            LJJIIJZLJL(str, null);
            return;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<? extends InterfaceC19524311a5> it2 = list.iterator();
        while (it2.hasNext()) {
            linkedHashMap.put(it2.next(), "");
        }
        LJJIIJZLJL(str, linkedHashMap);
    }

    public final void LJJIIJZLJL(String str, Map<InterfaceC19524311a5, String> map) {
        AbstractC19526311aP abstractC19526311aPLIZ;
        LinkedHashMap linkedHashMap;
        Set setKeySet;
        AbstractC19529211as abstractC19529211as = C19527411aa.LIZ.get(str);
        if (abstractC19529211as == null || (abstractC19526311aPLIZ = abstractC19529211as.LIZ()) == null) {
            abstractC19526311aPLIZ = C19528411ak.LIZIZ.LIZ();
        }
        this.LIZIZ = abstractC19526311aPLIZ;
        LJIILLIIL();
        this.LIZIZ.LIZ = toString();
        AbstractC19526311aP abstractC19526311aP = this.LIZIZ;
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        if (map != null && (setKeySet = (linkedHashMap = (LinkedHashMap) map).keySet()) != null) {
            for (Object obj : setKeySet) {
                String string = obj.toString();
                Object obj2 = linkedHashMap.get(obj);
                if (obj2 == null) {
                    obj2 = "";
                }
                linkedHashMap2.put(string, obj2);
            }
        }
        abstractC19526311aP.LIZJ = linkedHashMap2;
    }

    public final void LJJIIZ(int i, String str) {
        AbstractC19527711ad abstractC19527711adLIZ;
        AbstractC19529311at abstractC19529311at = C19527511ab.LIZ.get(str);
        if (abstractC19529311at == null || (abstractC19527711adLIZ = abstractC19529311at.LIZ()) == null) {
            abstractC19527711adLIZ = C19528211ai.LIZIZ.LIZ();
        }
        this.LIZJ = abstractC19527711adLIZ;
        LJIILLIIL();
        this.LIZJ.LIZ = toString();
        this.LIZJ.LIZJ = i;
    }

    public final <T> void LJJIJIIJI(InterfaceC19526611aS interfaceC19526611aS, String str, T t) {
        String strLIZIZ = this.LJ.LIZIZ(str);
        if (strLIZIZ != null) {
            interfaceC19526611aS.LJJIFFI(t, strLIZIZ);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJJII(X.InterfaceC19526511aR r9, java.util.List<? extends X.InterfaceC19526611aS> r10, X.C11ZU r11, X.InterfaceC1364105Vn<? super X.C19528811ao> r12) {
        /*
            r8 = this;
            boolean r0 = r12 instanceof X.C19526411aQ
            if (r0 == 0) goto L83
            r7 = r12
            X.11aQ r7 = (X.C19526411aQ) r7
            int r2 = r7.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L83
            int r2 = r2 - r1
            r7.LLILZLL = r2
        L12:
            java.lang.Object r1 = r7.LLILZ
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILZLL
            r5 = 1
            if (r0 == 0) goto L49
            if (r0 != r5) goto L8a
            java.lang.Object r4 = r7.LLILLL
            java.util.List r4 = (java.util.List) r4
            java.lang.Object r3 = r7.LLILLJJLI
            java.util.List r3 = (java.util.List) r3
            X.11ZU r11 = r7.LL
            X.C155000ia.LIZIZ(r1)
        L2c:
            java.lang.String r1 = (java.lang.String) r1
            X.11ao r2 = new X.11ao
            r2.<init>(r1)
            r2.LIZIZ = r4
            java.util.Iterator r1 = r3.iterator()
        L39:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L89
            java.lang.Object r0 = r1.next()
            X.11aS r0 = (X.InterfaceC19526611aS) r0
            r8.LJIJJLI(r0, r11)
            goto L39
        L49:
            X.C155000ia.LIZIZ(r1)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r2 = r10.iterator()
        L5a:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L74
            java.lang.Object r1 = r2.next()
            X.11aS r1 = (X.InterfaceC19526611aS) r1
            boolean r0 = r8.LJIJJ(r1, r11)
            if (r0 == 0) goto L70
            r4.add(r1)
            goto L5a
        L70:
            r3.add(r1)
            goto L5a
        L74:
            r7.LL = r11
            r7.LLILLJJLI = r3
            r7.LLILLL = r4
            r7.LLILZLL = r5
            java.lang.Object r1 = r8.LJIJI(r9, r3, r10, r7)
            if (r1 != r6) goto L2c
            return r6
        L83:
            X.11aQ r7 = new X.11aQ
            r7.<init>(r8, r12)
            goto L12
        L89:
            return r2
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19526011aM.LJJII(X.11aR, java.util.List, X.11ZU, X.05Vn):java.lang.Object");
    }

    public static Object LJJ(InterfaceC19524311a5 interfaceC19524311a5, InterfaceC19526511aR interfaceC19526511aR, List list, C11ZU c11zu, C19526111aN c19526111aN) throws Throwable {
        int iLJIIZILJ = interfaceC19524311a5.LJIIZILJ();
        if (iLJIIZILJ != 0) {
            if (iLJIIZILJ != 1) {
                if (iLJIIZILJ != 2) {
                    if (iLJIIZILJ != 3) {
                        if (iLJIIZILJ == 4) {
                            interfaceC19526511aR.LJIIIIZZ(C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C19523611Zy(interfaceC19524311a5, interfaceC19526511aR, list, c11zu, null), 3));
                        }
                        return Unit.LIZ;
                    }
                    C1DFH c1dfh = C0PEM.LIZ;
                    Object objLJI = C23250099c.LJI(c19526111aN, C2107308Nj.LIZ, new C19523411Zw(interfaceC19524311a5, interfaceC19526511aR, list, c11zu, null));
                    if (objLJI == C099R.LJFF()) {
                        return objLJI;
                    }
                    return Unit.LIZ;
                }
                Object objLJI2 = C23250099c.LJI(c19526111aN, C0PEM.LIZ, new C19523511Zx(interfaceC19524311a5, interfaceC19526511aR, list, c11zu, null));
                if (objLJI2 == C099R.LJFF()) {
                    return objLJI2;
                }
                return Unit.LIZ;
            }
            Object objLJI3 = C23250099c.LJI(c19526111aN, C0PEM.LIZJ, new C19523311Zv(interfaceC19524311a5, interfaceC19526511aR, list, c11zu, null));
            if (objLJI3 == C099R.LJFF()) {
                return objLJI3;
            }
            return Unit.LIZ;
        }
        Object objLIZ = interfaceC19524311a5.LIZ(interfaceC19526511aR, list, c11zu, c19526111aN);
        if (objLIZ == C099R.LJFF()) {
            return objLIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00f8 A[LOOP:0: B:33:0x00f2->B:35:0x00f8, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x013a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x013b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJJIFFI(X.AbstractC19526011aM r15, X.InterfaceC19526511aR r16, java.util.List<? extends X.InterfaceC19526611aS> r17, X.C11ZU r18, X.InterfaceC1364105Vn<? super kotlin.Unit> r19) {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19526011aM.LJJIFFI(X.11aM, X.11aR, java.util.List, X.11ZU, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Path cross not found for [B:94:0x0288, B:90:0x0273], limit reached: 160 */
    /* JADX WARN: Removed duplicated region for block: B:103:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0302  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0239  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:117:0x02f2 -> B:118:0x02fc). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:76:0x020b -> B:79:0x021f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:77:0x020d -> B:12:0x004f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:78:0x0213 -> B:79:0x021f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJJI(X.AbstractC19526011aM r15, java.lang.String r16, X.InterfaceC19526511aR r17, java.util.List<? extends X.InterfaceC19526611aS> r18, X.C11ZU r19, X.InterfaceC1364105Vn<? super kotlin.Unit> r20) {
        /*
            Method dump skipped, instruction units count: 837
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC19526011aM.LJJI(X.11aM, java.lang.String, X.11aR, java.util.List, X.11ZU, X.05Vn):java.lang.Object");
    }

    public final void LJJIIZI(InterfaceC19526611aS interfaceC19526611aS, int i, String str, String str2, String str3, C11YJ c11yj) {
        String strLIZIZ = this.LJ.LIZIZ("pp_data_key_error_code");
        String strLIZIZ2 = this.LJ.LIZIZ("pp_data_key_error_msg");
        String strLIZIZ3 = this.LJ.LIZIZ("pp_data_key_error_handler");
        String strLIZIZ4 = this.LJ.LIZIZ("pp_data_key_error_extra");
        String strLIZIZ5 = this.LJ.LIZIZ("pp_data_key_error_source");
        if (strLIZIZ != null) {
            interfaceC19526611aS.LJJIFFI(Integer.valueOf(i), strLIZIZ);
        }
        if (strLIZIZ2 != null) {
            interfaceC19526611aS.LJJIFFI(str, strLIZIZ2);
        }
        if (strLIZIZ3 != null) {
            interfaceC19526611aS.LJJIFFI(str2, strLIZIZ3);
        }
        if (strLIZIZ4 != null) {
            interfaceC19526611aS.LJJIFFI(str3, strLIZIZ4);
        }
        if (strLIZIZ5 != null) {
            interfaceC19526611aS.LJJIFFI(c11yj, strLIZIZ5);
        }
    }
}
