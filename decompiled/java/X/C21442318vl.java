package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.18vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21442318vl implements InterfaceC21429918tl, InterfaceC21449118wr {
    public static final Pattern LJIIJ = PatternProtector.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
    public static final Pattern LJIIJJI = PatternProtector.compile("^ *(?:\n *)?");
    public static final Pattern LJIIL = PatternProtector.compile("^[\\p{Zs}\t\r\n\f]");
    public static final Pattern LJIILIIL = PatternProtector.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
    public static final Pattern LJIILJJIL = PatternProtector.compile("\\s+");
    public final InterfaceC21449518wv LIZ;
    public final boolean LIZIZ;
    public final BitSet LIZJ;
    public final Map<Character, List<AbstractC21442818vq>> LIZLLL;
    public final Map<Character, InterfaceC21444318w5> LJ;
    public AbstractC21430218to LJFF;
    public String LJI;
    public int LJII;
    public C21443918w1 LJIIIIZZ;
    public C21444118w3 LJIIIZ;

    public final char LIZLLL() {
        if (this.LJII < this.LJI.length()) {
            return this.LJI.charAt(this.LJII);
        }
        return (char) 0;
    }

    public final String LIZJ(Pattern pattern) {
        if (this.LJII >= this.LJI.length()) {
            return null;
        }
        Matcher matcher = pattern.matcher(this.LJI);
        matcher.region(this.LJII, this.LJI.length());
        if (!matcher.find()) {
            return null;
        }
        this.LJII = matcher.end();
        return matcher.group();
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9 A[EDGE_INSN: B:56:0x00c9->B:68:? BREAK  A[LOOP:1: B:8:0x0011->B:57:0x0011], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0011 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJ(X.C21443918w1 r11) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21442318vl.LJ(X.18w1):void");
    }

    public final void LJFF(C21443918w1 c21443918w1) {
        C21443918w1 c21443918w12 = c21443918w1.LJ;
        if (c21443918w12 != null) {
            c21443918w12.LJFF = c21443918w1.LJFF;
        }
        C21443918w1 c21443918w13 = c21443918w1.LJFF;
        if (c21443918w13 == null) {
            this.LJIIIIZZ = c21443918w12;
        } else {
            c21443918w13.LJ = c21443918w12;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [X.18uy] */
    /* JADX WARN: Type inference failed for: r10v2, types: [X.18uy] */
    /* JADX WARN: Type inference failed for: r10v3, types: [X.18uy] */
    /* JADX WARN: Type inference failed for: r10v4, types: [X.18to] */
    /* JADX WARN: Type inference failed for: r10v5, types: [X.18to] */
    /* JADX WARN: Type inference failed for: r17v0, types: [X.18to] */
    @Override // X.InterfaceC21429918tl
    public final void LIZ(String str, AbstractC21430218to abstractC21430218to) {
        ?? c21437418uy;
        String strSubstring;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        this.LJI = str.trim();
        this.LJII = 0;
        this.LJIIIIZZ = null;
        this.LJIIIZ = null;
        this.LJFF = abstractC21430218to;
        while (true) {
            char cLIZLLL = LIZLLL();
            if (cLIZLLL == 0) {
                break;
            }
            List<AbstractC21442818vq> list = (List) ((HashMap) this.LIZLLL).get(Character.valueOf(cLIZLLL));
            if (list != null) {
                int i = this.LJII;
                for (AbstractC21442818vq abstractC21442818vq : list) {
                    abstractC21442818vq.LIZ = this;
                    abstractC21442818vq.LIZIZ = this.LJFF;
                    abstractC21442818vq.LIZJ = this.LJI;
                    abstractC21442818vq.LIZLLL = this.LJII;
                    c21437418uy = abstractC21442818vq.LIZIZ();
                    this.LJII = abstractC21442818vq.LIZLLL;
                    if (c21437418uy == 0) {
                        this.LJII = i;
                    }
                }
                this.LJII++;
                c21437418uy = new C21437418uy(String.valueOf(cLIZLLL));
            } else {
                InterfaceC21444318w5 interfaceC21444318w5 = (InterfaceC21444318w5) ((HashMap) this.LJ).get(Character.valueOf(cLIZLLL));
                if (interfaceC21444318w5 != null) {
                    int i2 = this.LJII;
                    int i3 = 0;
                    while (LIZLLL() == cLIZLLL) {
                        i3++;
                        this.LJII++;
                    }
                    if (i3 < interfaceC21444318w5.LIZJ()) {
                        this.LJII = i2;
                        this.LJII++;
                        c21437418uy = new C21437418uy(String.valueOf(cLIZLLL));
                    } else {
                        String strValueOf = "\n";
                        if (i2 == 0) {
                            strSubstring = "\n";
                        } else {
                            strSubstring = this.LJI.substring(i2 - 1, i2);
                        }
                        char cLIZLLL2 = LIZLLL();
                        if (cLIZLLL2 != 0) {
                            strValueOf = String.valueOf(cLIZLLL2);
                        }
                        Pattern pattern = LJIIJ;
                        boolean zMatches = pattern.matcher(strSubstring).matches();
                        Pattern pattern2 = LJIIL;
                        boolean zMatches2 = pattern2.matcher(strSubstring).matches();
                        boolean zMatches3 = pattern.matcher(strValueOf).matches();
                        boolean zMatches4 = pattern2.matcher(strValueOf).matches();
                        if (!zMatches4 && (!zMatches3 || zMatches2 || zMatches)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!zMatches2 && (!zMatches || zMatches4 || zMatches3)) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (cLIZLLL == '_') {
                            if (z && (!z2 || zMatches)) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2 && (!z || zMatches3)) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        } else {
                            if (z && cLIZLLL == interfaceC21444318w5.LJ()) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            if (z2 && cLIZLLL == interfaceC21444318w5.LIZLLL()) {
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        this.LJII = i2;
                        C21444718w9 c21444718w9 = new C21444718w9(i3, z3, z4);
                        int i4 = c21444718w9.LIZ;
                        int i5 = this.LJII;
                        int i6 = i5 + i4;
                        this.LJII = i6;
                        c21437418uy = new C21437418uy(this.LJI.substring(i5, i6));
                        C21443918w1 c21443918w1 = new C21443918w1(c21437418uy, cLIZLLL, c21444718w9.LIZJ, c21444718w9.LIZIZ, this.LJIIIIZZ);
                        this.LJIIIIZZ = c21443918w1;
                        c21443918w1.LJI = i4;
                        c21443918w1.LJII = i4;
                        C21443918w1 c21443918w12 = c21443918w1.LJ;
                        if (c21443918w12 != null) {
                            c21443918w12.LJFF = c21443918w1;
                        }
                    }
                } else {
                    int i7 = this.LJII;
                    int length = this.LJI.length();
                    while (true) {
                        int i8 = this.LJII;
                        if (i8 == length || this.LIZJ.get(this.LJI.charAt(i8))) {
                            break;
                        } else {
                            this.LJII++;
                        }
                    }
                    int i9 = this.LJII;
                    if (i7 != i9) {
                        c21437418uy = new C21437418uy(this.LJI.substring(i7, i9));
                    } else {
                        this.LJII++;
                        c21437418uy = new C21437418uy(String.valueOf(cLIZLLL));
                    }
                }
            }
            abstractC21430218to.LIZIZ(c21437418uy);
        }
        LJ(null);
        AbstractC21430218to abstractC21430218to2 = abstractC21430218to.LIZIZ;
        AbstractC21430218to abstractC21430218to3 = abstractC21430218to.LIZJ;
        if (abstractC21430218to2 != abstractC21430218to3) {
            AbstractC21443818w0.LIZIZ(abstractC21430218to2, abstractC21430218to3);
        }
    }

    public static void LIZIZ(char c, InterfaceC21444318w5 interfaceC21444318w5, Map<Character, InterfaceC21444318w5> map) {
        if (((HashMap) map).put(Character.valueOf(c), interfaceC21444318w5) == null) {
            return;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Delimiter processor conflict with delimiter char '");
        sbLIZ.append(c);
        sbLIZ.append("'");
        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v18, types: [X.18vn] */
    public C21442318vl(C21444018w2 c21444018w2, boolean z, List list, List list2) {
        C21442518vn c21442518vn;
        this.LIZ = c21444018w2;
        this.LIZIZ = z;
        HashMap map = new HashMap(list.size());
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            AbstractC21442818vq abstractC21442818vq = (AbstractC21442818vq) it2.next();
            char cLIZLLL = abstractC21442818vq.LIZLLL();
            List arrayList = (List) map.get(Character.valueOf(cLIZLLL));
            if (arrayList == null) {
                arrayList = new ArrayList(1);
                map.put(Character.valueOf(cLIZLLL), arrayList);
            }
            arrayList.add(abstractC21442818vq);
        }
        this.LIZLLL = map;
        HashMap map2 = new HashMap();
        Iterator it3 = list2.iterator();
        while (it3.hasNext()) {
            InterfaceC21444318w5 interfaceC21444318w5 = (InterfaceC21444318w5) it3.next();
            final char cLJ = interfaceC21444318w5.LJ();
            char cLIZLLL2 = interfaceC21444318w5.LIZLLL();
            if (cLJ == cLIZLLL2) {
                InterfaceC21444318w5 interfaceC21444318w52 = (InterfaceC21444318w5) map2.get(Character.valueOf(cLJ));
                if (interfaceC21444318w52 != null && interfaceC21444318w52.LJ() == interfaceC21444318w52.LIZLLL()) {
                    if (interfaceC21444318w52 instanceof C21442518vn) {
                        c21442518vn = (C21442518vn) interfaceC21444318w52;
                    } else {
                        ?? r0 = new InterfaceC21444318w5(cLJ) { // from class: X.18vn
                            public final char LIZ;
                            public int LIZIZ;
                            public final LinkedList<InterfaceC21444318w5> LIZJ = new LinkedList<>();

                            @Override // X.InterfaceC21444318w5
                            public final int LIZJ() {
                                return this.LIZIZ;
                            }

                            @Override // X.InterfaceC21444318w5
                            public final char LIZLLL() {
                                return this.LIZ;
                            }

                            @Override // X.InterfaceC21444318w5
                            public final char LJ() {
                                return this.LIZ;
                            }

                            {
                                this.LIZ = cLJ;
                            }

                            public final void LJFF(InterfaceC21444318w5 interfaceC21444318w53) {
                                int iLIZJ = interfaceC21444318w53.LIZJ();
                                ListIterator<InterfaceC21444318w5> listIterator = this.LIZJ.listIterator();
                                while (listIterator.hasNext()) {
                                    int iLIZJ2 = listIterator.next().LIZJ();
                                    if (iLIZJ > iLIZJ2) {
                                        listIterator.previous();
                                        listIterator.add(interfaceC21444318w53);
                                        return;
                                    } else if (iLIZJ == iLIZJ2) {
                                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                                        sbLIZ.append("Cannot add two delimiter processors for char '");
                                        sbLIZ.append(this.LIZ);
                                        sbLIZ.append("' and minimum length ");
                                        sbLIZ.append(iLIZJ);
                                        throw new IllegalArgumentException(C2188811AlT.LIZIZ(sbLIZ));
                                    }
                                }
                                this.LIZJ.add(interfaceC21444318w53);
                                this.LIZIZ = iLIZJ;
                            }

                            public final InterfaceC21444318w5 LJI(int i) {
                                for (InterfaceC21444318w5 interfaceC21444318w53 : this.LIZJ) {
                                    if (interfaceC21444318w53.LIZJ() <= i) {
                                        return interfaceC21444318w53;
                                    }
                                }
                                return this.LIZJ.getFirst();
                            }

                            @Override // X.InterfaceC21444318w5
                            public final int LIZIZ(C21443918w1 c21443918w1, C21443918w1 c21443918w12) {
                                return LJI(c21443918w1.LJI).LIZIZ(c21443918w1, c21443918w12);
                            }

                            @Override // X.InterfaceC21444318w5
                            public final void LIZ(C21437418uy c21437418uy, C21437418uy c21437418uy2, int i) {
                                LJI(i).LIZ(c21437418uy, c21437418uy2, i);
                            }
                        };
                        r0.LJFF(interfaceC21444318w52);
                        c21442518vn = r0;
                    }
                    c21442518vn.LJFF(interfaceC21444318w5);
                    map2.put(Character.valueOf(cLJ), c21442518vn);
                } else {
                    LIZIZ(cLJ, interfaceC21444318w5, map2);
                }
            } else {
                LIZIZ(cLJ, interfaceC21444318w5, map2);
                LIZIZ(cLIZLLL2, interfaceC21444318w5, map2);
            }
        }
        this.LJ = map2;
        Set setKeySet = ((HashMap) this.LIZLLL).keySet();
        Set setKeySet2 = map2.keySet();
        BitSet bitSet = new BitSet();
        Iterator it4 = setKeySet.iterator();
        while (it4.hasNext()) {
            bitSet.set(((Character) it4.next()).charValue());
        }
        Iterator it5 = setKeySet2.iterator();
        while (it5.hasNext()) {
            bitSet.set(((Character) it5.next()).charValue());
        }
        this.LIZJ = bitSet;
    }
}
