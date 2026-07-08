package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.sticker.repository.internals.ab.HorizontalCarouselRecentEffectsLimitAB;
import com.tts.oecverify.BdTuring;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.18vU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21440618vU implements InterfaceC21449618ww {
    public static final Set<Class<? extends AbstractC21439018vE>> LJIILL = new LinkedHashSet(Arrays.asList(C21445018wC.class, C21439318vH.class, C21440218vQ.class, C21440118vP.class, C21444918wB.class, AbstractC21445918wL.class, C21440318vR.class));
    public static final Map<Class<? extends AbstractC21439018vE>, InterfaceC21445718wJ> LJIILLIIL;
    public CharSequence LIZ;
    public int LIZIZ;
    public int LIZJ;
    public boolean LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public final List<InterfaceC21445718wJ> LJIIIIZZ;
    public final InterfaceC21446618wS LJIIIZ;
    public final List<InterfaceC21444318w5> LJIIJ;
    public final C21435618ug LJIIJJI;
    public final Map<String, C21440518vT> LJIIL = new LinkedHashMap();
    public final List<InterfaceC21443518vx> LJIILIIL;
    public final Set<InterfaceC21443518vx> LJIILJJIL;

    static {
        HashMap map = new HashMap();
        map.put(C21445018wC.class, new AbstractC21447518wb() { // from class: X.18vf
            @Override // X.InterfaceC21445718wJ
            public final AbstractC21449018wq LIZ(InterfaceC21449618ww interfaceC21449618ww, C21443618vy c21443618vy) {
                char cCharAt;
                int i = ((C21440618vU) interfaceC21449618ww).LJ;
                if (C21441818vg.LJIIIIZZ(interfaceC21449618ww, i)) {
                    C21440618vU c21440618vU = (C21440618vU) interfaceC21449618ww;
                    int i2 = c21440618vU.LIZJ + c21440618vU.LJI + 1;
                    CharSequence charSequence = c21440618vU.LIZ;
                    int i3 = i + 1;
                    if (i3 < charSequence.length() && ((cCharAt = charSequence.charAt(i3)) == '\t' || cCharAt == ' ')) {
                        i2++;
                    }
                    C21444418w6 c21444418w6 = new C21444418w6(new AbstractC21440018vO() { // from class: X.18vg
                        public final C21445018wC LIZ = new AbstractC21439018vE() { // from class: X.18wC
                            @Override // X.AbstractC21430218to
                            public final void LIZ(InterfaceC21437318ux interfaceC21437318ux) {
                                interfaceC21437318ux.LJFF(this);
                            }
                        };

                        @Override // X.InterfaceC21443518vx
                        public final /* bridge */ /* synthetic */ AbstractC21439018vE LIZIZ() {
                            return this.LIZ;
                        }

                        @Override // X.InterfaceC21443518vx
                        public final C21445418wG LJFF(InterfaceC21449618ww interfaceC21449618ww2) {
                            char cCharAt2;
                            int i4 = ((C21440618vU) interfaceC21449618ww2).LJ;
                            if (LJIIIIZZ(interfaceC21449618ww2, i4)) {
                                C21440618vU c21440618vU2 = (C21440618vU) interfaceC21449618ww2;
                                int i5 = c21440618vU2.LIZJ + c21440618vU2.LJI + 1;
                                CharSequence charSequence2 = c21440618vU2.LIZ;
                                int i6 = i4 + 1;
                                if (i6 < charSequence2.length() && ((cCharAt2 = charSequence2.charAt(i6)) == '\t' || cCharAt2 == ' ')) {
                                    i5++;
                                }
                                return new C21445318wF(-1, i5, false);
                            }
                            return null;
                        }

                        public static boolean LJIIIIZZ(InterfaceC21449618ww interfaceC21449618ww2, int i4) {
                            CharSequence charSequence2 = ((C21440618vU) interfaceC21449618ww2).LIZ;
                            if (((C21440618vU) interfaceC21449618ww2).LJI < 4 && i4 < charSequence2.length() && charSequence2.charAt(i4) == '>') {
                                return true;
                            }
                            return false;
                        }
                    });
                    c21444418w6.LIZJ = i2;
                    return c21444418w6;
                }
                return null;
            }
        });
        map.put(C21439318vH.class, new C21439718vL());
        map.put(C21440218vQ.class, new AbstractC21447518wb() { // from class: X.18vc
            /* JADX WARN: Code restructure failed: missing block: B:22:0x003f, code lost:
            
                if (r3 != (-1)) goto L23;
             */
            @Override // X.InterfaceC21445718wJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC21449018wq LIZ(X.InterfaceC21449618ww r13, X.C21443618vy r14) {
                /*
                    r12 = this;
                    X.18vU r13 = (X.C21440618vU) r13
                    int r8 = r13.LJI
                    r0 = 4
                    r6 = 0
                    if (r8 < r0) goto L9
                    return r6
                L9:
                    int r5 = r13.LJ
                    java.lang.CharSequence r10 = r13.LIZ
                    int r11 = r10.length()
                    r9 = 0
                    r1 = r5
                    r7 = 0
                    r3 = 0
                L15:
                    r4 = 96
                    r2 = 126(0x7e, float:1.77E-43)
                    if (r1 >= r11) goto L2b
                    char r0 = r10.charAt(r1)
                    if (r0 == r4) goto L28
                    if (r0 != r2) goto L2b
                    int r3 = r3 + 1
                L25:
                    int r1 = r1 + 1
                    goto L15
                L28:
                    int r7 = r7 + 1
                    goto L25
                L2b:
                    r0 = 3
                    if (r7 < r0) goto L45
                    if (r3 != 0) goto L45
                    int r3 = r5 + r7
                    int r2 = r10.length()
                L36:
                    r1 = -1
                    if (r3 >= r2) goto L4f
                    char r0 = r10.charAt(r3)
                    if (r0 != r4) goto L42
                    if (r3 == r1) goto L4f
                L41:
                    return r6
                L42:
                    int r3 = r3 + 1
                    goto L36
                L45:
                    if (r3 < r0) goto L41
                    if (r7 != 0) goto L41
                    X.18vW r1 = new X.18vW
                    r1.<init>(r2, r3, r8)
                    goto L54
                L4f:
                    X.18vW r1 = new X.18vW
                    r1.<init>(r4, r7, r8)
                L54:
                    r0 = 1
                    X.18vx[] r0 = new X.InterfaceC21443518vx[r0]
                    r0[r9] = r1
                    X.18w6 r6 = new X.18w6
                    r6.<init>(r0)
                    X.18vQ r0 = r1.LIZ
                    int r0 = r0.LJI
                    int r5 = r5 + r0
                    r6.LIZIZ = r5
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21441418vc.LIZ(X.18ww, X.18vy):X.18wq");
            }
        });
        map.put(C21440118vP.class, new AbstractC21447518wb() { // from class: X.18vZ
            @Override // X.InterfaceC21445718wJ
            public final AbstractC21449018wq LIZ(InterfaceC21449618ww interfaceC21449618ww, C21443618vy c21443618vy) {
                C21440618vU c21440618vU = (C21440618vU) interfaceC21449618ww;
                int i = c21440618vU.LJ;
                CharSequence charSequence = c21440618vU.LIZ;
                if (c21440618vU.LJI < 4 && charSequence.charAt(i) == '<') {
                    int i2 = 1;
                    while (true) {
                        Pattern[] patternArr = C21441218va.LJ[i2];
                        Pattern pattern = patternArr[0];
                        Pattern pattern2 = patternArr[1];
                        if (pattern.matcher(charSequence.subSequence(i, charSequence.length())).find()) {
                            C21444418w6 c21444418w6 = new C21444418w6(new C21441218va(pattern2));
                            c21444418w6.LIZIZ = c21440618vU.LIZIZ;
                            return c21444418w6;
                        }
                        i2++;
                        if (i2 <= 7) {
                            if (i2 == 7 && (c21443618vy.LIZ.LIZIZ() instanceof C21439218vG)) {
                                return null;
                            }
                        } else {
                            return null;
                        }
                    }
                } else {
                    return null;
                }
            }
        });
        map.put(C21444918wB.class, new AbstractC21447518wb() { // from class: X.18vh
            /* JADX WARN: Code restructure failed: missing block: B:28:0x0046, code lost:
            
                if (r3 == 0) goto L29;
             */
            @Override // X.InterfaceC21445718wJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC21449018wq LIZ(X.InterfaceC21449618ww r11, X.C21443618vy r12) {
                /*
                    r10 = this;
                    X.18vU r11 = (X.C21440618vU) r11
                    int r1 = r11.LJI
                    r0 = 4
                    r9 = 0
                    if (r1 < r0) goto L9
                    return r9
                L9:
                    int r8 = r11.LJ
                    java.lang.CharSequence r6 = r11.LIZ
                    int r7 = r6.length()
                    r5 = 0
                    r4 = 0
                    r3 = 0
                    r2 = 0
                L15:
                    r1 = 1
                    if (r8 >= r7) goto L3b
                    char r1 = r6.charAt(r8)
                    r0 = 9
                    if (r1 == r0) goto L32
                    r0 = 32
                    if (r1 == r0) goto L32
                    r0 = 42
                    if (r1 == r0) goto L38
                    r0 = 45
                    if (r1 == r0) goto L35
                    r0 = 95
                    if (r1 != r0) goto L64
                    int r3 = r3 + 1
                L32:
                    int r8 = r8 + 1
                    goto L15
                L35:
                    int r4 = r4 + 1
                    goto L32
                L38:
                    int r2 = r2 + 1
                    goto L32
                L3b:
                    r0 = 3
                    if (r4 < r0) goto L5d
                    if (r3 != 0) goto L5d
                    if (r2 == 0) goto L48
                L42:
                    if (r2 < r0) goto L64
                    if (r4 != 0) goto L64
                    if (r3 != 0) goto L64
                L48:
                    X.18vx[] r2 = new X.InterfaceC21443518vx[r1]
                    X.18w4 r0 = new X.18w4
                    r0.<init>()
                    r2[r5] = r0
                    X.18w6 r1 = new X.18w6
                    r1.<init>(r2)
                    int r0 = r6.length()
                    r1.LIZIZ = r0
                    return r1
                L5d:
                    if (r3 < r0) goto L42
                    if (r4 != 0) goto L42
                    if (r2 == 0) goto L48
                    goto L42
                L64:
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21441918vh.LIZ(X.18ww, X.18vy):X.18wq");
            }
        });
        map.put(AbstractC21445918wL.class, new AbstractC21447518wb() { // from class: X.18vV
            /* JADX WARN: Code restructure failed: missing block: B:71:0x0114, code lost:
            
                if (r0 == null) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:72:0x0116, code lost:
            
                r0 = new X.C21444418w6(r4);
                r0.LIZJ = r3;
             */
            /* JADX WARN: Code restructure failed: missing block: B:73:0x0122, code lost:
            
                return r0;
             */
            /* JADX WARN: Code restructure failed: missing block: B:80:0x013d, code lost:
            
                if (r0 == null) goto L72;
             */
            /* JADX WARN: Code restructure failed: missing block: B:84:0x0149, code lost:
            
                if (r0 != false) goto L72;
             */
            /* JADX WARN: Removed duplicated region for block: B:62:0x00dc  */
            /* JADX WARN: Removed duplicated region for block: B:65:0x00f2  */
            @Override // X.InterfaceC21445718wJ
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.AbstractC21449018wq LIZ(X.InterfaceC21449618ww r17, X.C21443618vy r18) {
                /*
                    Method dump skipped, instruction units count: 380
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C21440718vV.LIZ(X.18ww, X.18vy):X.18wq");
            }
        });
        map.put(C21440318vR.class, new AbstractC21447518wb() { // from class: X.18ve
            @Override // X.InterfaceC21445718wJ
            public final AbstractC21449018wq LIZ(InterfaceC21449618ww interfaceC21449618ww, C21443618vy c21443618vy) {
                C21440618vU c21440618vU = (C21440618vU) interfaceC21449618ww;
                if (c21440618vU.LJI >= 4 && !c21440618vU.LJII && !(c21440618vU.LJII().LIZIZ() instanceof C21439218vG)) {
                    C21444418w6 c21444418w6 = new C21444418w6(new AbstractC21440018vO() { // from class: X.18vY
                        public final C21440318vR LIZ = new C21440318vR();
                        public final List<CharSequence> LIZIZ = new ArrayList();

                        @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
                        public final void LJII() {
                            int i;
                            int size = ((ArrayList) this.LIZIZ).size() - 1;
                            while (true) {
                                if (size >= 0) {
                                    CharSequence charSequence = (CharSequence) ListProtector.get(this.LIZIZ, size);
                                    int length = charSequence.length();
                                    int i2 = 0;
                                    while (true) {
                                        if (i2 >= length) {
                                            break;
                                        }
                                        char cCharAt = charSequence.charAt(i2);
                                        if (cCharAt != ' ') {
                                            switch (cCharAt) {
                                                case BdTuring.TYPE_ECAF /* 9 */:
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_10 /* 10 */:
                                                case BdTuring.TYPE_EMAIL /* 11 */:
                                                case HorizontalCarouselRecentEffectsLimitAB.LIMIT_12 /* 12 */:
                                                case BdTuring.TYPE_SMS_VOICE /* 13 */:
                                                    break;
                                                default:
                                                    if (i2 == -1) {
                                                    }
                                                    break;
                                            }
                                        }
                                        i2++;
                                    }
                                    size--;
                                }
                            }
                            StringBuilder sb = new StringBuilder();
                            for (i = 0; i < size + 1; i++) {
                                sb.append((CharSequence) ListProtector.get(this.LIZIZ, i));
                                sb.append('\n');
                            }
                            this.LIZ.LJFF = sb.toString();
                        }

                        @Override // X.InterfaceC21443518vx
                        public final AbstractC21439018vE LIZIZ() {
                            return this.LIZ;
                        }

                        @Override // X.AbstractC21440018vO, X.InterfaceC21443518vx
                        public final void LIZJ(CharSequence charSequence) {
                            ((ArrayList) this.LIZIZ).add(charSequence);
                        }

                        @Override // X.InterfaceC21443518vx
                        public final C21445418wG LJFF(InterfaceC21449618ww interfaceC21449618ww2) {
                            C21440618vU c21440618vU2 = (C21440618vU) interfaceC21449618ww2;
                            if (c21440618vU2.LJI >= 4) {
                                return new C21445318wF(-1, c21440618vU2.LIZJ + 4, false);
                            }
                            if (c21440618vU2.LJII) {
                                return C21445418wG.LIZ(c21440618vU2.LJ);
                            }
                            return null;
                        }
                    });
                    c21444418w6.LIZJ = c21440618vU.LIZJ + 4;
                    return c21444418w6;
                }
                return null;
            }
        });
        LJIILLIIL = Collections.unmodifiableMap(map);
    }

    public final void LIZJ() {
        CharSequence charSequenceSubSequence;
        if (this.LIZLLL) {
            int i = this.LIZIZ + 1;
            CharSequence charSequence = this.LIZ;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i, charSequence.length());
            int i2 = 4 - (this.LIZJ % 4);
            StringBuilder sb = new StringBuilder(charSequenceSubSequence2.length() + i2);
            for (int i3 = 0; i3 < i2; i3++) {
                sb.append(' ');
            }
            sb.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb.toString();
        } else {
            CharSequence charSequence2 = this.LIZ;
            charSequenceSubSequence = charSequence2.subSequence(this.LIZIZ, charSequence2.length());
        }
        LJII().LIZJ(charSequenceSubSequence);
    }

    public final void LIZLLL() {
        if (this.LIZ.charAt(this.LIZIZ) != '\t') {
            this.LIZIZ++;
            this.LIZJ++;
        } else {
            this.LIZIZ++;
            int i = this.LIZJ;
            this.LIZJ = i + (4 - (i % 4));
        }
    }

    public final void LJI() {
        int i = this.LIZIZ;
        int i2 = this.LIZJ;
        this.LJII = true;
        int length = this.LIZ.length();
        while (true) {
            if (i >= length) {
                break;
            }
            char cCharAt = this.LIZ.charAt(i);
            if (cCharAt == '\t') {
                i++;
                i2 += 4 - (i2 % 4);
            } else if (cCharAt != ' ') {
                this.LJII = false;
                break;
            } else {
                i++;
                i2++;
            }
        }
        this.LJ = i;
        this.LJFF = i2;
        this.LJI = i2 - this.LIZJ;
    }

    public final InterfaceC21443518vx LJII() {
        return (InterfaceC21443518vx) ListProtector.get(this.LJIILIIL, ((ArrayList) r1).size() - 1);
    }

    public final void LIZ(InterfaceC21443518vx interfaceC21443518vx) {
        while (!LJII().LJI(interfaceC21443518vx.LIZIZ())) {
            LJ(LJII());
        }
        LJII().LIZIZ().LIZIZ(interfaceC21443518vx.LIZIZ());
        ((ArrayList) this.LJIILIIL).add(interfaceC21443518vx);
        this.LJIILJJIL.add(interfaceC21443518vx);
    }

    public final void LIZIZ(C21442118vj c21442118vj) {
        C21442718vp c21442718vp = c21442118vj.LIZIZ;
        c21442718vp.LIZ();
        for (C21440518vT c21440518vT : (ArrayList) c21442718vp.LIZJ) {
            C21439218vG c21439218vG = c21442118vj.LIZ;
            c21439218vG.getClass();
            c21440518vT.LJFF();
            AbstractC21430218to abstractC21430218to = c21439218vG.LIZLLL;
            c21440518vT.LIZLLL = abstractC21430218to;
            if (abstractC21430218to != null) {
                abstractC21430218to.LJ = c21440518vT;
            }
            c21440518vT.LJ = c21439218vG;
            c21439218vG.LIZLLL = c21440518vT;
            AbstractC21430218to abstractC21430218to2 = c21439218vG.LIZ;
            c21440518vT.LIZ = abstractC21430218to2;
            if (c21440518vT.LIZLLL == null) {
                abstractC21430218to2.LIZIZ = c21440518vT;
            }
            String str = c21440518vT.LJFF;
            if (!this.LJIIL.containsKey(str)) {
                this.LJIIL.put(str, c21440518vT);
            }
        }
    }

    public final void LJ(InterfaceC21443518vx interfaceC21443518vx) {
        if (LJII() == interfaceC21443518vx) {
            ListProtector.remove(this.LJIILIIL, ((ArrayList) r1).size() - 1);
        }
        if (interfaceC21443518vx instanceof C21442118vj) {
            LIZIZ((C21442118vj) interfaceC21443518vx);
        }
        interfaceC21443518vx.LJII();
    }

    public final void LJFF(List<InterfaceC21443518vx> list) {
        ArrayList arrayList = (ArrayList) list;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size >= 0) {
                LJ((InterfaceC21443518vx) ListProtector.get(arrayList, size));
            } else {
                return;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x011a, code lost:
    
        r7 = (X.C21444418w6) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x011c, code lost:
    
        if (r7 == null) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x011e, code lost:
    
        if (r9 != false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0120, code lost:
    
        LJFF(r4);
        r9 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0124, code lost:
    
        r0 = r7.LIZIZ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0126, code lost:
    
        if (r0 == (-1)) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0128, code lost:
    
        LJIIJ(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x012d, code lost:
    
        if (r7.LIZLLL == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x012f, code lost:
    
        r2 = LJII();
        com.bytedance.mt.protector.impl.collections.ListProtector.remove(r10.LJIILIIL, ((java.util.ArrayList) r1).size() - 1);
        r10.LJIILJJIL.remove(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0148, code lost:
    
        if ((r2 instanceof X.C21442118vj) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x014a, code lost:
    
        LIZIZ((X.C21442118vj) r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0150, code lost:
    
        r2.LIZIZ().LJFF();
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0157, code lost:
    
        r2 = r7.LIZ;
        r1 = r2.length;
        r0 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015b, code lost:
    
        if (r0 >= r1) goto L103;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015d, code lost:
    
        r3 = r2[r0];
        LIZ(r3);
        r8 = r3.LIZ();
        r0 = r0 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0169, code lost:
    
        r0 = r7.LIZJ;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x016b, code lost:
    
        if (r0 == (-1)) goto L70;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016d, code lost:
    
        LJIIIZ(r0);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIIZZ(java.lang.CharSequence r11) {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21440618vU.LJIIIIZZ(java.lang.CharSequence):void");
    }

    public final void LJIIIZ(int i) {
        int i2;
        int i3 = this.LJFF;
        if (i >= i3) {
            this.LIZIZ = this.LJ;
            this.LIZJ = i3;
        }
        int length = this.LIZ.length();
        while (true) {
            i2 = this.LIZJ;
            if (i2 >= i || this.LIZIZ == length) {
                break;
            } else {
                LIZLLL();
            }
        }
        if (i2 > i) {
            this.LIZIZ--;
            this.LIZJ = i;
            this.LIZLLL = true;
            return;
        }
        this.LIZLLL = false;
    }

    public final void LJIIJ(int i) {
        int i2 = this.LJ;
        if (i >= i2) {
            this.LIZIZ = i2;
            this.LIZJ = this.LJFF;
        }
        int length = this.LIZ.length();
        while (true) {
            int i3 = this.LIZIZ;
            if (i3 >= i || i3 == length) {
                break;
            } else {
                LIZLLL();
            }
        }
        this.LIZLLL = false;
    }

    public C21440618vU(List list, InterfaceC21446618wS interfaceC21446618wS, List list2) {
        ArrayList arrayList = new ArrayList();
        this.LJIILIIL = arrayList;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.LJIILJJIL = linkedHashSet;
        this.LJIIIIZZ = list;
        this.LJIIIZ = interfaceC21446618wS;
        this.LJIIJ = list2;
        C21435618ug c21435618ug = new C21435618ug();
        this.LJIIJJI = c21435618ug;
        arrayList.add(c21435618ug);
        linkedHashSet.add(c21435618ug);
    }
}
