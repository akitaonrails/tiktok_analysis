package X;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AwS158S1100000_9;
import kotlin.jvm.internal.AwS431S0200000_30;
import kotlin.jvm.internal.AwS578S0100000_34;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.1Daz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public final class C2258751Daz implements C0N88, InterfaceC1065950dqT {
    public final C0N23 LJ;
    public final C0N28 LJFF;
    public final InterfaceC2258661Daq LJI;
    public final InterfaceC2258811Db5 LJII;
    public final AbstractC2192061Aqi LJIIIIZZ;
    public final AbstractC2200351B9t LJIIIZ;
    public final C2258761Db0 LJIIJ;
    public final AbstractC2258621Dam LJIIJJI;
    public final InterfaceC2258861DbA LJIIL;
    public final C0N23 LJIILIIL;
    public final C2258841Db8 LJIILJJIL;

    @Override // X.C0N86
    public final void LIZ(String str, String str2) {
    }

    @Override // X.C0N86
    public final void LIZIZ(String str, String str2) {
    }

    @Override // X.C0N87
    public final void LJI(C0N23 c0n23, String str, Map map) {
    }

    @Override // X.C0N87
    public final void LJII(C0N23 c0n23, String str, Map map) {
    }

    @Override // X.C0N86
    public final void LJIIIIZZ(String str, String str2) {
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("MeasurementTarget@");
        sbLIZ.append(this.LJFF);
        return C2088108Fz.LIZIZ(this, C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC1065950dqT
    public final C0N23 LJ() {
        return this.LJIILIIL;
    }

    @Override // X.InterfaceC1065950dqT
    public final void LIZJ(C1065930dqR c1065930dqR) {
        long jLLLJL = this.LJII.LLLJL();
        C2258761Db0 c2258761Db0 = this.LJIIJ;
        c2258761Db0.getClass();
        if (jLLLJL == -10002) {
            C589080N8o.LIZLLL(c2258761Db0, null, new AwS579S0100000_35(c2258761Db0, 22));
        } else if (jLLLJL == -10003) {
            C589080N8o.LIZLLL(c2258761Db0, null, new AwS579S0100000_35(c2258761Db0, 23));
        } else {
            this.LJII.LJIILJJIL(jLLLJL);
            LJIIJ(this, this.LJII.LJIJ(), "progress", c1065930dqR, jLLLJL, false, 16);
        }
    }

    public final void LJIIIZ(C19980813Fu c19980813Fu) {
        C589080N8o.LIZLLL(this, null, new AwS431S0200000_30(this, c19980813Fu, 9));
        this.LJIIL.LIZLLL(c19980813Fu);
    }

    @Override // X.C0N86
    public final void LIZLLL(C0N23 c0n23, String str, Map map) {
        C2258761Db0 c2258761Db0 = this.LJIIJ;
        C19980813Fu c19980813FuLJFF = c2258761Db0.LJFF(c0n23);
        if (c19980813FuLJFF != null) {
            C13BS.LIZ("play");
            c2258761Db0.LIZJ.LIZJ(c19980813FuLJFF);
            Object objLJFF = c2258761Db0.LIZ.LJFF(c0n23.LIZIZ());
            long j = c0n23.LIZIZ;
            if (C189200o6.m5exceptionOrNullimpl(objLJFF) != null) {
                objLJFF = -10001L;
            }
            C2258891DbD.LIZ(c19980813FuLJFF, j, ((Number) objLJFF).longValue(), c2258761Db0.LIZIZ.LIZJ().intValue(), str, "loop");
            LJIIIZ(c19980813FuLJFF);
        }
    }

    @Override // X.C0N87
    public final void LJFF(C0N23 c0n23, String str, Map map) {
        String str2;
        C2258761Db0 c2258761Db0 = this.LJIIJ;
        C19980813Fu c19980813FuLIZIZ = c2258761Db0.LIZIZ(c0n23);
        if (c19980813FuLIZIZ != null) {
            C13BS.LIZ("show");
            c2258761Db0.LIZJ.LIZJ(c19980813FuLIZIZ);
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            Map<String, Object> mapLIZIZ = C0N2R.LIZIZ(linkedHashMap);
            Object objRemove = null;
            if (mapLIZIZ != null) {
                objRemove = mapLIZIZ.remove("expose_from");
            }
            if (!(objRemove instanceof String) || (str2 = (String) objRemove) == null) {
                str2 = "";
            }
            C0N2R.LIZJ(c19980813FuLIZIZ.LJFF, mapLIZIZ);
            c19980813FuLIZIZ.LJI.putAll(linkedHashMap);
            long j = c0n23.LIZIZ;
            int iLIZIZ = C2258891DbD.LIZIZ(c19980813FuLIZIZ);
            c19980813FuLIZIZ.LIZLLL.put("video_length", Long.valueOf(j));
            c19980813FuLIZIZ.LIZLLL.put("page_from", str);
            if (!a0.LJJJIL(str2)) {
                c19980813FuLIZIZ.LIZLLL.put("from", str2);
            }
            c19980813FuLIZIZ.LIZLLL.put("should_drop", Integer.valueOf(iLIZIZ));
            LJIIIZ(c19980813FuLIZIZ);
        }
    }

    @Override // X.C0N86
    public final void LJIILIIL(C0N23 c0n23, String str, Map map) {
        C2258841Db8 c2258841Db8 = this.LJIILJJIL;
        c2258841Db8.LIZIZ = false;
        c2258841Db8.LIZ.LIZ();
        C589080N8o.LJ(this, this.LJIIIIZZ.getClass().getSimpleName(), new AwS578S0100000_34(this, 3));
        C2258761Db0 c2258761Db0 = this.LJIIJ;
        C19980813Fu c19980813FuLIZLLL = c2258761Db0.LIZLLL(c0n23);
        if (c19980813FuLIZLLL != null) {
            C13BS.LIZ("play");
            c2258761Db0.LIZJ.LIZJ(c19980813FuLIZLLL);
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            C0N2R.LIZJ(c19980813FuLIZLLL.LJFF, C0N2R.LIZIZ(linkedHashMap));
            c19980813FuLIZLLL.LJI.putAll(linkedHashMap);
            Object objLJFF = c2258761Db0.LIZ.LJFF(c0n23.LIZIZ());
            long j = c0n23.LIZIZ;
            if (C189200o6.m5exceptionOrNullimpl(objLJFF) != null) {
                objLJFF = -10001L;
            }
            C2258891DbD.LIZ(c19980813FuLIZLLL, j, ((Number) objLJFF).longValue(), c2258761Db0.LIZIZ.LIZJ().intValue(), str, "render");
            LJIIIZ(c19980813FuLIZLLL);
        }
    }

    @Override // X.C0N86
    public final void LJIILL(C0N23 c0n23, String str, Map map) {
        String strLIZIZ;
        String strLIZ;
        C354710DvR c354710DvR;
        Object objLJFF = this.LJII.LJFF(c0n23.LIZIZ());
        C589080N8o.LJ(this, null, new C5182020e(objLJFF, 15));
        C1023830ckX c1023830ckXLJIIJ = LJIIJ(this, str, "over", null, c0n23.LIZIZ, true, 4);
        C2258761Db0 c2258761Db0 = this.LJIIJ;
        Object objValueOf = Long.valueOf(c0n23.LIZIZ);
        if (!C189200o6.m7isFailureimpl(objLJFF)) {
            objValueOf = objLJFF;
        }
        long jLongValue = ((Number) objValueOf).longValue();
        if (C189200o6.m5exceptionOrNullimpl(objLJFF) == null) {
            ((Number) objLJFF).longValue();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("match_");
            sbLIZ.append(jLongValue);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("not_match_");
            sbLIZ2.append(jLongValue);
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        }
        C19980813Fu c19980813FuLJI = c2258761Db0.LJI(c0n23);
        if (c19980813FuLJI != null) {
            C13BS.LIZ("over");
            c2258761Db0.LIZJ.LIZJ(c19980813FuLJI);
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            C0N2R.LIZJ(c19980813FuLJI.LJFF, C0N2R.LIZIZ(linkedHashMap));
            c19980813FuLJI.LJI.putAll(linkedHashMap);
            long j = c0n23.LIZIZ;
            C2258891DbD.LIZ(c19980813FuLJI, j, j, c2258761Db0.LIZIZ.LIZJ().intValue(), str, strLIZIZ);
            int i = c1023830ckXLJIIJ.LIZ;
            C2190041AnS c2190041AnS = c1023830ckXLJIIJ.LIZIZ;
            if (c2190041AnS == null || (c354710DvR = c2190041AnS.LIZIZ) == null || (strLIZ = C589080N8o.LIZ(c354710DvR)) == null) {
                strLIZ = "";
            }
            C2258891DbD.LJ(c19980813FuLJI, i, strLIZ);
            LJIIIZ(c19980813FuLJI);
        }
        this.LJIIJ.LIZ();
        C589080N8o.LJ(this, this.LJIIIIZZ.getClass().getSimpleName(), new C020B(this.LJIIIIZZ.LJ.incrementAndGet(), 0));
    }

    @Override // X.C0N87
    public final void LJIIZILJ(C0N23 c0n23, String str, Map map) {
        Object objRemove;
        String str2;
        String strLIZ;
        C354710DvR c354710DvR;
        long jLJII = this.LJII.LJII(c0n23.LIZIZ());
        C589080N8o.LJ(this, null, new C020S(jLJII, 0));
        C2258761Db0 c2258761Db0 = this.LJIIJ;
        C19980813Fu c19980813FuLJ = c2258761Db0.LJ(c0n23);
        if (c19980813FuLJ != null) {
            C13BS.LIZ("break");
            c2258761Db0.LIZJ.LIZJ(c19980813FuLJ);
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            Map<String, Object> mapLIZIZ = C0N2R.LIZIZ(linkedHashMap);
            if (mapLIZIZ != null) {
                objRemove = mapLIZIZ.remove("disappear_from");
            } else {
                objRemove = null;
            }
            if (objRemove instanceof String) {
                str2 = (String) objRemove;
            } else {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "";
            }
            C0N2R.LIZJ(c19980813FuLJ.LJFF, mapLIZIZ);
            c19980813FuLJ.LJI.putAll(linkedHashMap);
            C2258891DbD.LIZ(c19980813FuLJ, c0n23.LIZIZ, jLJII, c2258761Db0.LIZIZ.LIZJ().intValue(), str, str2);
            C1023830ckX c1023830ckXLJIIJ = LJIIJ(this, str, "break", null, jLJII, true, 4);
            int i = c1023830ckXLJIIJ.LIZ;
            C2190041AnS c2190041AnS = c1023830ckXLJIIJ.LIZIZ;
            if (c2190041AnS == null || (c354710DvR = c2190041AnS.LIZIZ) == null || (strLIZ = C589080N8o.LIZ(c354710DvR)) == null) {
                strLIZ = "";
            }
            C2258891DbD.LJ(c19980813FuLJ, i, strLIZ);
            LJIIIZ(c19980813FuLJ);
        } else {
            C589080N8o.LIZLLL(c2258761Db0, null, new AwS579S0100000_35(c2258761Db0, 21));
        }
        this.LJIIJ.LJII();
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00ad, code lost:
    
        if (r4 == false) goto L40;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C1023830ckX LJIIJ(X.C2258751Daz r20, java.lang.String r21, java.lang.String r22, X.C1065930dqR r23, long r24, boolean r26, int r27) {
        /*
            Method dump skipped, instruction units count: 492
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2258751Daz.LJIIJ(X.1Daz, java.lang.String, java.lang.String, X.0dqR, long, boolean, int):X.0ckX");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [X.0N85] */
    public C2258751Daz(C0N23 c0n23, C0N28 c0n28, InterfaceC2258661Daq interfaceC2258661Daq, AbstractC21592019eo abstractC21592019eo, AbstractC2192061Aqi abstractC2192061Aqi, AbstractC2200351B9t abstractC2200351B9t, C19980713Ft c19980713Ft, C2258761Db0 c2258761Db0, AbstractC2258621Dam abstractC2258621Dam, InterfaceC2258861DbA interfaceC2258861DbA) {
        this.LJ = c0n23;
        this.LJFF = c0n28;
        this.LJI = interfaceC2258661Daq;
        this.LJII = abstractC21592019eo;
        this.LJIIIIZZ = abstractC2192061Aqi;
        this.LJIIIZ = abstractC2200351B9t;
        this.LJIIJ = c2258761Db0;
        this.LJIIJJI = abstractC2258621Dam;
        this.LJIIL = interfaceC2258861DbA;
        abstractC2258621Dam.LJFF = this;
        final List listSingletonList = Collections.singletonList(abstractC2258621Dam);
        final List listLJIIJJI = C1697810uHb.LJIIJJI(abstractC2200351B9t, abstractC2192061Aqi, c19980713Ft);
        ?? r0 = new C0N88(this, listSingletonList, listLJIIJJI) { // from class: X.0N85
            public final C0N88 LJ;
            public final List<C0N88> LJFF;
            public final List<C0N88> LJI;

            @Override // X.C0N86
            public final void LIZ(String str, String str2) {
                this.LJ.LIZ(str, str2);
            }

            @Override // X.C0N86
            public final void LIZIZ(String str, String str2) {
                this.LJ.LIZIZ(str, str2);
            }

            @Override // X.C0N86
            public final void LJIIIIZZ(String str, String str2) {
                this.LJ.LJIIIIZZ(str, str2);
            }

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.LJ = this;
                this.LJFF = listSingletonList == null ? C13BV.INSTANCE : listSingletonList;
                this.LJI = listLJIIJJI == null ? C13BV.INSTANCE : listLJIIJJI;
            }

            @Override // X.C0N86
            public final void LIZLLL(C0N23 c0n232, String str, Map map) {
                C589080N8o.LJ(this, null, new AwS158S1100000_9(str, c0n232, 2));
                Iterator<C0N88> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().LIZLLL(c0n232, str, map);
                }
                this.LJ.LIZLLL(c0n232, str, map);
                Iterator<C0N88> it3 = this.LJI.iterator();
                while (it3.hasNext()) {
                    it3.next().LIZLLL(c0n232, str, map);
                }
            }

            @Override // X.C0N87
            public final void LJFF(C0N23 c0n232, String str, Map map) {
                C589080N8o.LJ(this, null, new AwS158S1100000_9(str, c0n232, 1));
                Iterator<C0N88> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().LJFF(c0n232, str, map);
                }
                this.LJ.LJFF(c0n232, str, map);
                Iterator<C0N88> it3 = this.LJI.iterator();
                while (it3.hasNext()) {
                    it3.next().LJFF(c0n232, str, map);
                }
            }

            @Override // X.C0N87
            public final void LJI(C0N23 c0n232, String str, Map map) {
                C589080N8o.LJ(this, null, new C0N83(str, c0n232));
                Iterator<C0N88> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().LJI(c0n232, str, map);
                }
                this.LJ.LJI(c0n232, str, map);
                Iterator<C0N88> it3 = this.LJI.iterator();
                while (it3.hasNext()) {
                    it3.next().LJI(c0n232, str, map);
                }
            }

            @Override // X.C0N87
            public final void LJII(C0N23 c0n232, String str, Map map) {
                C589080N8o.LJ(this, null, new AwS158S1100000_9(str, c0n232, 5));
                Iterator<C0N88> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().LJII(c0n232, str, map);
                }
                this.LJ.LJII(c0n232, str, map);
                Iterator<C0N88> it3 = this.LJI.iterator();
                while (it3.hasNext()) {
                    it3.next().LJII(c0n232, str, map);
                }
            }

            @Override // X.C0N86
            public final void LJIILIIL(C0N23 c0n232, String str, Map map) {
                C589080N8o.LJ(this, null, new AwS158S1100000_9(str, c0n232, 4));
                Iterator<C0N88> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIILIIL(c0n232, str, map);
                }
                this.LJ.LJIILIIL(c0n232, str, map);
                Iterator<C0N88> it3 = this.LJI.iterator();
                while (it3.hasNext()) {
                    it3.next().LJIILIIL(c0n232, str, map);
                }
            }

            @Override // X.C0N86
            public final void LJIILL(C0N23 c0n232, String str, Map map) {
                C589080N8o.LJ(this, null, new AwS158S1100000_9(str, c0n232, 3));
                Iterator<C0N88> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIILL(c0n232, str, map);
                }
                this.LJ.LJIILL(c0n232, str, map);
                Iterator<C0N88> it3 = this.LJI.iterator();
                while (it3.hasNext()) {
                    it3.next().LJIILL(c0n232, str, map);
                }
            }

            @Override // X.C0N87
            public final void LJIIZILJ(C0N23 c0n232, String str, Map map) {
                C589080N8o.LJ(this, null, new AwS158S1100000_9(str, c0n232, 0));
                Iterator<C0N88> it2 = this.LJFF.iterator();
                while (it2.hasNext()) {
                    it2.next().LJIIZILJ(c0n232, str, map);
                }
                this.LJ.LJIIZILJ(c0n232, str, map);
                Iterator<C0N88> it3 = this.LJI.iterator();
                while (it3.hasNext()) {
                    it3.next().LJIIZILJ(c0n232, str, map);
                }
            }
        };
        interfaceC2258661Daq.LJIIJ(r0);
        abstractC21592019eo.LJIIL(r0);
        this.LJIILIIL = c0n23;
        this.LJIILJJIL = new C2258841Db8(3);
    }
}
