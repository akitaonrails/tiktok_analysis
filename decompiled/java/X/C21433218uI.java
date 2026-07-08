package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.18uI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21433218uI {
    public final List<InterfaceC21445718wJ> LIZ;
    public final List<InterfaceC21444318w5> LIZIZ;
    public final InterfaceC21446618wS LIZJ;
    public final List<InterfaceC21447418wa> LIZLLL;

    public C21433218uI(C21433918uP c21433918uP) {
        List<InterfaceC21445718wJ> list = c21433918uP.LIZ;
        Set<Class<? extends AbstractC21439018vE>> set = c21433918uP.LIZLLL;
        Set<Class<? extends AbstractC21439018vE>> set2 = C21440618vU.LJIILL;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(list);
        Iterator<Class<? extends AbstractC21439018vE>> it2 = set.iterator();
        while (it2.hasNext()) {
            arrayList.add(C21440618vU.LJIILLIIL.get(it2.next()));
        }
        this.LIZ = arrayList;
        InterfaceC21446618wS interfaceC21446618wS = c21433918uP.LJ;
        interfaceC21446618wS = interfaceC21446618wS == null ? new InterfaceC21446618wS() { // from class: X.18vC
            @Override // X.InterfaceC21446618wS
            public final InterfaceC21429918tl LIZ(final C21444018w2 c21444018w2) {
                return new InterfaceC21429918tl(c21444018w2) { // from class: X.18vk
                    public static final Pattern LJIIIIZZ = PatternProtector.compile("^[!\"#\\$%&'\\(\\)\\*\\+,\\-\\./:;<=>\\?@\\[\\\\\\]\\^_`\\{\\|\\}~\\p{Pc}\\p{Pd}\\p{Pe}\\p{Pf}\\p{Pi}\\p{Po}\\p{Ps}]");
                    public static final Pattern LJIIIZ = PatternProtector.compile("^(?:<[A-Za-z][A-Za-z0-9-_]*(?:\\s+[a-zA-Z_:][a-zA-Z0-9:._-]*(?:\\s*=\\s*(?:[^\"'=<>`\\x00-\\x20]+|'[^']*'|\"[^\"]*\"))?)*\\s*/?>|</[A-Za-z][A-Za-z0-9-_]*\\s*[>]|<!---->|<!--(?:-?[^>-])(?:-?[^-])*-->|[<][?].*?[?][>]|<![A-Z]+\\s+[^>]*>|<!\\[CDATA\\[[\\s\\S]*?\\]\\]>)", 2);
                    public static final Pattern LJIIJ = PatternProtector.compile("^[!\"#$%&'()*+,./:;<=>?@\\[\\\\\\]^_`{|}~-]");
                    public static final Pattern LJIIJJI = PatternProtector.compile("^&(?:#x[a-f0-9]{1,6}|#[0-9]{1,7}|[a-z][a-z0-9]{1,31});", 2);
                    public static final Pattern LJIIL = PatternProtector.compile("`+");
                    public static final Pattern LJIILIIL = PatternProtector.compile("^`+");
                    public static final Pattern LJIILJJIL = PatternProtector.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
                    public static final Pattern LJIILL = PatternProtector.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");
                    public static final Pattern LJIILLIIL = PatternProtector.compile("^ *(?:\n *)?");
                    public static final Pattern LJIIZILJ = PatternProtector.compile("^[\\p{Zs}\t\r\n\f]");
                    public static final Pattern LJIJ = PatternProtector.compile("\\s+");
                    public static final Pattern LJIJI = PatternProtector.compile(" *$");
                    public final BitSet LIZ;
                    public final BitSet LIZIZ;
                    public final Map<Character, InterfaceC21444318w5> LIZJ;
                    public final InterfaceC21449518wv LIZLLL;
                    public String LJ;
                    public int LJFF;
                    public C21443918w1 LJI;
                    public C21444118w3 LJII;

                    public final char LJI() {
                        if (this.LJFF < this.LJ.length()) {
                            return this.LJ.charAt(this.LJFF);
                        }
                        return (char) 0;
                    }

                    {
                        List<InterfaceC21444318w5> list2 = c21444018w2.LIZ;
                        HashMap map = new HashMap();
                        LIZJ(Arrays.asList(new C21445518wH(), new C21445618wI()), map);
                        LIZJ(list2, map);
                        this.LIZJ = map;
                        Set setKeySet = map.keySet();
                        BitSet bitSet = new BitSet();
                        Iterator it3 = setKeySet.iterator();
                        while (it3.hasNext()) {
                            bitSet.set(((Character) it3.next()).charValue());
                        }
                        this.LIZIZ = bitSet;
                        BitSet bitSet2 = new BitSet();
                        bitSet2.or(bitSet);
                        bitSet2.set(10);
                        bitSet2.set(96);
                        bitSet2.set(91);
                        bitSet2.set(93);
                        bitSet2.set(92);
                        bitSet2.set(33);
                        bitSet2.set(60);
                        bitSet2.set(38);
                        this.LIZ = bitSet2;
                        this.LIZLLL = c21444018w2;
                    }

                    public final String LIZLLL(Pattern pattern) {
                        if (this.LJFF >= this.LJ.length()) {
                            return null;
                        }
                        Matcher matcher = pattern.matcher(this.LJ);
                        matcher.region(this.LJFF, this.LJ.length());
                        if (!matcher.find()) {
                            return null;
                        }
                        this.LJFF = matcher.end();
                        return matcher.group();
                    }

                    /* JADX WARN: Removed duplicated region for block: B:56:0x00c9 A[EDGE_INSN: B:56:0x00c9->B:68:? BREAK  A[LOOP:1: B:8:0x0011->B:57:0x0011], SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:59:0x0011 A[SYNTHETIC] */
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LJII(X.C21443918w1 r11) {
                        /*
                            Method dump skipped, instruction units count: 212
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21442218vk.LJII(X.18w1):void");
                    }

                    public final void LJIIIIZZ(C21443918w1 c21443918w1) {
                        C21443918w1 c21443918w12 = c21443918w1.LJ;
                        if (c21443918w12 != null) {
                            c21443918w12.LJFF = c21443918w1.LJFF;
                        }
                        C21443918w1 c21443918w13 = c21443918w1.LJFF;
                        if (c21443918w13 == null) {
                            this.LJI = c21443918w12;
                        } else {
                            c21443918w13.LJ = c21443918w12;
                        }
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Type inference failed for: r0v5, types: [X.18vo] */
                    public static void LIZJ(Iterable<InterfaceC21444318w5> iterable, Map<Character, InterfaceC21444318w5> map) {
                        C21442618vo c21442618vo;
                        for (InterfaceC21444318w5 interfaceC21444318w5 : iterable) {
                            final char cLJ = interfaceC21444318w5.LJ();
                            char cLIZLLL = interfaceC21444318w5.LIZLLL();
                            if (cLJ == cLIZLLL) {
                                HashMap map2 = (HashMap) map;
                                InterfaceC21444318w5 interfaceC21444318w52 = (InterfaceC21444318w5) map2.get(Character.valueOf(cLJ));
                                if (interfaceC21444318w52 != null && interfaceC21444318w52.LJ() == interfaceC21444318w52.LIZLLL()) {
                                    if (interfaceC21444318w52 instanceof C21442618vo) {
                                        c21442618vo = (C21442618vo) interfaceC21444318w52;
                                    } else {
                                        ?? r0 = new InterfaceC21444318w5(cLJ) { // from class: X.18vo
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
                                                        throw new IllegalArgumentException("Cannot add two delimiter processors for char '" + this.LIZ + "' and minimum length " + iLIZJ);
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
                                        c21442618vo = r0;
                                    }
                                    c21442618vo.LJFF(interfaceC21444318w5);
                                    map2.put(Character.valueOf(cLJ), c21442618vo);
                                } else {
                                    LIZIZ(cLJ, interfaceC21444318w5, map);
                                }
                            } else {
                                LIZIZ(cLJ, interfaceC21444318w5, map);
                                LIZIZ(cLIZLLL, interfaceC21444318w5, map);
                            }
                        }
                    }

                    public static void LJFF(AbstractC21430218to abstractC21430218to, AbstractC21430218to abstractC21430218to2) {
                        C21437418uy c21437418uy = null;
                        C21437418uy c21437418uy2 = null;
                        int length = 0;
                        while (abstractC21430218to != null) {
                            if (abstractC21430218to instanceof C21437418uy) {
                                c21437418uy2 = (C21437418uy) abstractC21430218to;
                                if (c21437418uy == null) {
                                    c21437418uy = c21437418uy2;
                                }
                                length += c21437418uy2.LJFF.length();
                            } else {
                                LJ(c21437418uy, c21437418uy2, length);
                                c21437418uy = null;
                                c21437418uy2 = null;
                                length = 0;
                            }
                            if (abstractC21430218to == abstractC21430218to2) {
                                break;
                            } else {
                                abstractC21430218to = abstractC21430218to.LJ;
                            }
                        }
                        LJ(c21437418uy, c21437418uy2, length);
                    }

                    /* JADX WARN: Multi-variable type inference failed */
                    /* JADX WARN: Removed duplicated region for block: B:105:0x025a  */
                    /* JADX WARN: Removed duplicated region for block: B:158:0x03d5  */
                    /* JADX WARN: Removed duplicated region for block: B:159:0x03db  */
                    /* JADX WARN: Removed duplicated region for block: B:167:0x03fd  */
                    /* JADX WARN: Removed duplicated region for block: B:220:0x04c2 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:224:0x03f0 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:244:0x03f0 A[SYNTHETIC] */
                    /* JADX WARN: Removed duplicated region for block: B:54:0x010f  */
                    /* JADX WARN: Removed duplicated region for block: B:57:0x011a A[LOOP:3: B:56:0x0118->B:57:0x011a, LOOP_END] */
                    /* JADX WARN: Removed duplicated region for block: B:58:0x0121  */
                    /* JADX WARN: Removed duplicated region for block: B:63:0x0147  */
                    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
                    /* JADX WARN: Removed duplicated region for block: B:80:0x0192  */
                    /* JADX WARN: Removed duplicated region for block: B:83:0x01c5  */
                    /* JADX WARN: Removed duplicated region for block: B:88:0x01dd  */
                    /* JADX WARN: Removed duplicated region for block: B:91:0x01ef A[ADDED_TO_REGION, LOOP:4: B:91:0x01ef->B:95:0x01f8, LOOP_START, PHI: r3
                      0x01ef: PHI (r3v37 X.18w3) = (r3v36 X.18w3), (r3v38 X.18w3) binds: [B:90:0x01ed, B:95:0x01f8] A[DONT_GENERATE, DONT_INLINE]] */
                    /* JADX WARN: Type inference failed for: r10v0 */
                    /* JADX WARN: Type inference failed for: r10v1 */
                    /* JADX WARN: Type inference failed for: r10v10, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v11, types: [X.18uw] */
                    /* JADX WARN: Type inference failed for: r10v12, types: [X.18to, X.18uo] */
                    /* JADX WARN: Type inference failed for: r10v13, types: [X.18to, X.18uo] */
                    /* JADX WARN: Type inference failed for: r10v14, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v15, types: [X.18uz] */
                    /* JADX WARN: Type inference failed for: r10v16, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v17, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v18, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v19, types: [X.18v6] */
                    /* JADX WARN: Type inference failed for: r10v2, types: [X.18vA] */
                    /* JADX WARN: Type inference failed for: r10v21, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v23, types: [X.18to] */
                    /* JADX WARN: Type inference failed for: r10v25, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v26, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v27, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v29, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v30 */
                    /* JADX WARN: Type inference failed for: r10v31 */
                    /* JADX WARN: Type inference failed for: r10v32 */
                    /* JADX WARN: Type inference failed for: r10v4, types: [X.18vA] */
                    /* JADX WARN: Type inference failed for: r10v5, types: [X.18v6] */
                    /* JADX WARN: Type inference failed for: r10v6, types: [X.18to] */
                    /* JADX WARN: Type inference failed for: r10v7, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v8, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r10v9, types: [X.18uy] */
                    /* JADX WARN: Type inference failed for: r17v0, types: [X.18to] */
                    @Override // X.InterfaceC21429918tl
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct add '--show-bad-code' argument
                    */
                    public final void LIZ(java.lang.String r16, X.AbstractC21430218to r17) {
                        /*
                            Method dump skipped, instruction units count: 1242
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: X.C21442218vk.LIZ(java.lang.String, X.18to):void");
                    }

                    public static void LIZIZ(char c, InterfaceC21444318w5 interfaceC21444318w5, Map<Character, InterfaceC21444318w5> map) {
                        if (((HashMap) map).put(Character.valueOf(c), interfaceC21444318w5) == null) {
                            return;
                        }
                        throw new IllegalArgumentException("Delimiter processor conflict with delimiter char '" + c + "'");
                    }

                    public static void LJ(C21437418uy c21437418uy, C21437418uy c21437418uy2, int i) {
                        if (c21437418uy != null && c21437418uy2 != null && c21437418uy != c21437418uy2) {
                            StringBuilder sb = new StringBuilder(i);
                            sb.append(c21437418uy.LJFF);
                            AbstractC21430218to abstractC21430218to = c21437418uy.LJ;
                            AbstractC21430218to abstractC21430218to2 = c21437418uy2.LJ;
                            while (abstractC21430218to != abstractC21430218to2) {
                                sb.append(((C21437418uy) abstractC21430218to).LJFF);
                                AbstractC21430218to abstractC21430218to3 = abstractC21430218to.LJ;
                                abstractC21430218to.LJFF();
                                abstractC21430218to = abstractC21430218to3;
                            }
                            c21437418uy.LJFF = sb.toString();
                        }
                    }
                };
            }
        } : interfaceC21446618wS;
        this.LIZJ = interfaceC21446618wS;
        this.LIZLLL = c21433918uP.LIZJ;
        List<InterfaceC21444318w5> list2 = c21433918uP.LIZIZ;
        this.LIZIZ = list2;
        interfaceC21446618wS.LIZ(new C21444018w2(list2, Collections.emptyMap()));
    }
}
