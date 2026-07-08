package X;

import android.widget.TextView;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.18tt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21430718tt extends AbstractC21425218t0 {
    public final int LIZ = 29;
    public final int LIZIZ = 2;
    public final AtomicReference<String> LIZJ = new AtomicReference<>();

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final String LIZ(String str) {
        this.LIZJ.set(str);
        return str;
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZIZ(TextView textView) {
        this.LIZJ.set("");
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZJ(C21433918uP c21433918uP) {
        if (this.LIZ != 0) {
            ((ArrayList) c21433918uP.LIZJ).add(new InterfaceC21447418wa() { // from class: X.18up
                @Override // X.InterfaceC21447418wa
                public final AbstractC21430218to LIZ(AbstractC21430218to abstractC21430218to) {
                    AbstractC21430218to abstractC21430218to2;
                    AbstractC21430218to abstractC21430218to3 = abstractC21430218to;
                    while (true) {
                        AbstractC21430218to abstractC21430218to4 = abstractC21430218to3.LIZJ;
                        if (abstractC21430218to4 == null) {
                            break;
                        }
                        abstractC21430218to3 = abstractC21430218to4;
                    }
                    if (!(abstractC21430218to3 instanceof C21430618ts) && (abstractC21430218to2 = abstractC21430218to3.LIZ) != null) {
                        abstractC21430218to3 = abstractC21430218to2;
                    }
                    LIZIZ(abstractC21430218to, abstractC21430218to3);
                    return abstractC21430218to;
                }

                public static void LIZIZ(AbstractC21430218to abstractC21430218to, AbstractC21430218to abstractC21430218to2) {
                    AbstractC21430218to abstractC21430218to3 = abstractC21430218to.LIZIZ;
                    while (abstractC21430218to3 != null) {
                        AbstractC21430218to abstractC21430218to4 = abstractC21430218to3.LJ;
                        if ((abstractC21430218to3 instanceof C21430618ts) && abstractC21430218to3 != abstractC21430218to2) {
                            AbstractC21430218to abstractC21430218to5 = abstractC21430218to3.LIZIZ;
                            abstractC21430218to5.LJFF();
                            AbstractC21430218to abstractC21430218to6 = abstractC21430218to3.LJ;
                            abstractC21430218to5.LJ = abstractC21430218to6;
                            if (abstractC21430218to6 != null) {
                                abstractC21430218to6.LIZLLL = abstractC21430218to5;
                            }
                            abstractC21430218to5.LIZLLL = abstractC21430218to3;
                            abstractC21430218to3.LJ = abstractC21430218to5;
                            AbstractC21430218to abstractC21430218to7 = abstractC21430218to3.LIZ;
                            abstractC21430218to5.LIZ = abstractC21430218to7;
                            if (abstractC21430218to5.LJ == null) {
                                abstractC21430218to7.LIZJ = abstractC21430218to5;
                            }
                            abstractC21430218to3.LJFF();
                        } else {
                            LIZIZ(abstractC21430218to3, abstractC21430218to2);
                        }
                        abstractC21430218to3 = abstractC21430218to4;
                    }
                }
            });
        }
        if ((this.LIZ & 16) != 0) {
            Set<Class<? extends AbstractC21439018vE>> setLLIIIZ = C13LP.LLIIIZ(C21440618vU.LJIILL);
            setLLIIIZ.remove(C21440218vQ.class);
            c21433918uP.LIZLLL = setLLIIIZ;
            c21433918uP.LIZ(new AbstractC21447518wb() { // from class: X.18vb
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
                        X.18vX r1 = new X.18vX
                        r1.<init>(r2, r3, r8)
                        goto L54
                    L4f:
                        X.18vX r1 = new X.18vX
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
                    throw new UnsupportedOperationException("Method not decompiled: X.C21441318vb.LIZ(X.18ww, X.18vy):X.18wq");
                }
            });
        }
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LIZLLL(C21427518tN c21427518tN) {
        c21427518tN.LIZ(C21430618ts.class, new InterfaceC21427718tP() { // from class: X.18tw
            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC21427718tP
            public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to) {
                AbstractC21430218to abstractC21430218to2;
                InterfaceC21427718tP<AbstractC21430218to> interfaceC21427718tPLJIIJJI;
                AbstractC21430218to abstractC21430218to3;
                InterfaceC21427718tP<AbstractC21430218to> interfaceC21427718tPLJIIJJI2;
                C21430618ts c21430618ts = (C21430618ts) abstractC21430218to;
                C21430718tt c21430718tt = this.LIZ;
                if ((c21430718tt.LIZ & 1) != 0) {
                    Target target = c21430618ts.LJFF;
                    if (target instanceof C21437218uw) {
                        C21437218uw c21437218uw = (C21437218uw) target;
                        C21451518xF c21451518xF = new C21451518xF(new C21451718xH(c21437218uw.LJFF), C21445818wK.noTracking());
                        if (c21451518xF.LJIILJJIL().LIZ == EnumC21448718wn.EOF) {
                            AbstractC21450218x2 abstractC21450218x2 = c21451518xF.LJIIIIZZ;
                            if (abstractC21450218x2 != null) {
                                C21437218uw c21437218uw2 = new C21437218uw();
                                c21437218uw2.LJFF = abstractC21450218x2.toString();
                                InterfaceC21427718tP<AbstractC21430218to> interfaceC21427718tPLJIIJJI3 = interfaceC21427218tK.LJIIJJI(c21437218uw2);
                                if (interfaceC21427718tPLJIIJJI3 != null) {
                                    interfaceC21427718tPLJIIJJI3.LIZ(interfaceC21427218tK, c21437218uw2);
                                } else {
                                    throw new IllegalStateException("HTML feature require HtmlPlugin!!");
                                }
                            }
                        } else {
                            InterfaceC21427718tP<AbstractC21430218to> interfaceC21427718tPLJIIJJI4 = interfaceC21427218tK.LJIIJJI(c21437218uw);
                            if (interfaceC21427718tPLJIIJJI4 != null) {
                                interfaceC21427718tPLJIIJJI4.LIZ(interfaceC21427218tK, c21437218uw);
                                return;
                            }
                            throw new IllegalStateException("HTML feature require HtmlPlugin!!");
                        }
                    }
                }
                if ((c21430718tt.LIZ & 2) != 0) {
                    Target target2 = c21430618ts.LJFF;
                    if ((target2 instanceof C21436318un) && (interfaceC21427718tPLJIIJJI2 = interfaceC21427218tK.LJIIJJI((abstractC21430218to3 = (AbstractC21430218to) target2))) != null) {
                        interfaceC21427718tPLJIIJJI2.LIZ(interfaceC21427218tK, abstractC21430218to3);
                        return;
                    }
                }
                int i = c21430718tt.LIZ;
                if ((i & 4) != 0) {
                    Target target3 = c21430618ts.LJFF;
                    if (target3 instanceof C21436418uo) {
                        interfaceC21427218tK.builder().LIZJ(((C21436418uo) target3).LJI);
                        return;
                    }
                }
                if ((i & 8) != 0) {
                    Target target4 = c21430618ts.LJFF;
                    if ((target4 instanceof C21428718tZ) && (interfaceC21427718tPLJIIJJI = interfaceC21427218tK.LJIIJJI((abstractC21430218to2 = (AbstractC21430218to) target4))) != null) {
                        interfaceC21427718tPLJIIJJI.LIZ(interfaceC21427218tK, abstractC21430218to2);
                        return;
                    }
                }
                new C21427318tL(interfaceC21427218tK) { // from class: X.18tQ
                    @Override // X.InterfaceC21437318ux
                    public final void LJJIIJ(C21437418uy c21437418uy) {
                    }
                }.LJJIIZ(c21430618ts);
            }
        });
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LJI(C448870Hiv c448870Hiv) {
        boolean z;
        if ((this.LIZ & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        c448870Hiv.LJIJI = z;
    }

    @Override // X.AbstractC21425218t0, X.InterfaceC21434318uT
    public final void LJIIIIZZ(C13A5 c13a5) {
        if ((this.LIZ & 1) != 0 || (this.LIZIZ & 1) != 0) {
            ((C21432018u6) ((C21435718uh) ((C13A4) c13a5).LIZJ(C21435718uh.class)).LIZ).LIZ(new AbstractC21442818vq() { // from class: X.18uG
                public static final Set<String> LJ = C13LQ.LJLIIL(new String[]{"img", "a", "blockquote", "sub", "sup", "b", "strong", "s", "del", "u", "ins", "ol", "ul", "i", "em", "cite", "dfn", "h1", "h2", "h3", "h4", "h5", "h6", "p", "div", "span"});
                public static final Pattern LJFF;
                public static final Pattern LJI;
                public static final Pattern LJII;
                public static final Pattern LJIIIIZZ;

                @Override // X.AbstractC21442818vq
                public final char LIZLLL() {
                    return '<';
                }

                static {
                    try {
                        PatternProtector.compile("(^<![-\\w][^>]*$)|(^<[A-Za-z][-_/\\w\\d]*(\\s+[^>]*)?(?!>)$)");
                        try {
                            LJFF = PatternProtector.compile("^<$", 0);
                            try {
                                LJI = PatternProtector.compile("^<[A-Za-z0-9]*$");
                                try {
                                    LJII = PatternProtector.compile("^<[A-Za-z0-9]+ [^>\\n]*$");
                                    try {
                                        LJIIIIZZ = PatternProtector.compile("^</[A-Za-z0-9]*$", 0);
                                    } catch (Exception e) {
                                        TryCatchGuardChecker.doCheck(e);
                                        throw new IllegalStateException("Invalid regex", e);
                                    }
                                } catch (Exception e2) {
                                    TryCatchGuardChecker.doCheck(e2);
                                    throw new IllegalStateException("Invalid regex", e2);
                                }
                            } catch (Exception e3) {
                                TryCatchGuardChecker.doCheck(e3);
                                throw new IllegalStateException("Invalid regex", e3);
                            }
                        } catch (Exception e4) {
                            TryCatchGuardChecker.doCheck(e4);
                            throw new IllegalStateException("Invalid regex", e4);
                        }
                    } catch (Exception e5) {
                        TryCatchGuardChecker.doCheck(e5);
                        throw new IllegalStateException("Invalid regex", e5);
                    }
                }

                @Override // X.AbstractC21442818vq
                public final AbstractC21430218to LIZIZ() {
                    if (LIZ(LJFF) != null) {
                        return LJI();
                    }
                    String strLIZ = LIZ(LJI);
                    if (strLIZ != null) {
                        String strSubstring = strLIZ.substring(1);
                        for (Object obj : LJ) {
                            if (u.LJJIIJZLJL((String) obj, strSubstring, false)) {
                                if (obj == null) {
                                    return null;
                                }
                                return LJI();
                            }
                        }
                        return null;
                    }
                    String strLIZ2 = LIZ(LJII);
                    if (strLIZ2 != null) {
                        if (!LJ.contains(strLIZ2.substring(1, a0.LJJJ(strLIZ2, " ", 0, false, 6)))) {
                            return null;
                        }
                        return LJI();
                    }
                    String strLIZ3 = LIZ(LJIIIIZZ);
                    if (strLIZ3 == null) {
                        return null;
                    }
                    String strSubstring2 = strLIZ3.substring(2);
                    for (Object obj2 : LJ) {
                        if (u.LJJIIJZLJL((String) obj2, strSubstring2, false)) {
                            if (obj2 == null) {
                                return null;
                            }
                            return LJI();
                        }
                    }
                    return null;
                }

                public final C21430618ts LJI() {
                    C21437218uw c21437218uw = new C21437218uw();
                    c21437218uw.LJFF = "";
                    C21430618ts c21430618ts = new C21430618ts(c21437218uw);
                    c21430618ts.LIZIZ(LJFF(""));
                    return c21430618ts;
                }
            });
        }
        if ((this.LIZ & 2) != 0 || (this.LIZIZ & 2) != 0) {
            C21432018u6 c21432018u6 = (C21432018u6) ((C21435718uh) ((C13A4) c13a5).LIZJ(C21435718uh.class)).LIZ;
            c21432018u6.LIZIZ(C21442918vr.class);
            final AtomicReference<String> atomicReference = this.LIZJ;
            c21432018u6.LIZ(new C21442918vr(atomicReference) { // from class: X.18tv
                public static final Pattern LJFF = PatternProtector.compile("^!\\[[^\\)\\[]*$");
                public static final Pattern LJI = PatternProtector.compile("(?![!\\[])([^\\]])*");
                public final AtomicReference<String> LJ;

                @Override // X.C21442918vr, X.AbstractC21442818vq
                public final AbstractC21430218to LIZIZ() {
                    String strLIZ;
                    if (!u.LJIIZILJ(this.LJ.get(), ((C21442318vl) this.LIZ).LJI, false) || (strLIZ = LIZ(LJFF)) == null) {
                        return super.LIZIZ();
                    }
                    Matcher matcher = LJI.matcher(strLIZ);
                    C21430618ts c21430618ts = new C21430618ts(new C21436318un("", matcher.find() ? matcher.group() : ""));
                    c21430618ts.LIZIZ(LJFF(strLIZ));
                    return c21430618ts;
                }

                {
                    this.LJ = atomicReference;
                }
            });
        }
        if ((this.LIZ & 4) != 0 || (this.LIZIZ & 4) != 0) {
            C21432018u6 c21432018u62 = (C21432018u6) ((C21435718uh) ((C13A4) c13a5).LIZJ(C21435718uh.class)).LIZ;
            c21432018u62.LIZIZ(C21443118vt.class);
            final AtomicReference<String> atomicReference2 = this.LIZJ;
            c21432018u62.LIZ(new C21443118vt(atomicReference2) { // from class: X.18tu
                public static final Pattern LJFF = PatternProtector.compile("^\\[[^\\[\\]\\(\\)]+\\]\\([^\\[\\)]*$");
                public static final Pattern LJI = PatternProtector.compile("(?!\\[)([^\\]])*");
                public final AtomicReference<String> LJ;

                @Override // X.C21443118vt, X.AbstractC21442818vq
                public final AbstractC21430218to LIZIZ() {
                    String strLIZ;
                    if (!u.LJIIZILJ(this.LJ.get(), ((C21442318vl) this.LIZ).LJI, false) || (strLIZ = LIZ(LJFF)) == null) {
                        return super.LIZIZ();
                    }
                    Matcher matcher = LJI.matcher(strLIZ);
                    C21430618ts c21430618ts = new C21430618ts(new C21436418uo("", matcher.find() ? matcher.group() : ""));
                    c21430618ts.LIZIZ(LJFF(strLIZ));
                    return c21430618ts;
                }

                {
                    this.LJ = atomicReference2;
                }
            });
        }
        if ((this.LIZ & 8) != 0 || (this.LIZIZ & 8) != 0) {
            InterfaceC21447718wd interfaceC21447718wd = ((C21435718uh) ((C13A4) c13a5).LIZJ(C21435718uh.class)).LIZ;
            final AtomicReference<String> atomicReference3 = this.LIZJ;
            ((C21432018u6) interfaceC21447718wd).LIZ(new AbstractC21442818vq(atomicReference3) { // from class: X.18tq
                public static final Pattern LJFF = PatternProtector.compile("^\\|.*\\|.*$|^\\|([^\\|\\n]*\\|)+ ?\\n *\\|?[- :\\|]*$");
                public final AtomicReference<String> LJ;

                @Override // X.AbstractC21442818vq
                public final char LIZLLL() {
                    return '|';
                }

                @Override // X.AbstractC21442818vq
                public final AbstractC21430218to LIZIZ() {
                    String strLIZ;
                    if (!u.LJIIZILJ(a0.LJJJLL("\n", this.LJ.get()), ((C21442318vl) this.LIZ).LJI, false) || (strLIZ = LIZ(LJFF)) == null) {
                        return null;
                    }
                    C21428718tZ c21428718tZ = new C21428718tZ();
                    AbstractC21430218to c21428518tX = new C21428518tX();
                    AbstractC21430218to c21428618tY = new C21428618tY();
                    int iLJJIZ = a0.LJJIZ(strLIZ, '\n', 0, false, 6);
                    List listLJJLIIIJ = a0.LJJLIIIJ(iLJJIZ > 0 ? strLIZ.substring(0, iLJJIZ) : strLIZ, new char[]{'|'}, false, 0, 6);
                    ArrayList<String> arrayList = new ArrayList();
                    Iterator it2 = listLJJLIIIJ.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(a0.LJLIIIL((String) it2.next()).toString());
                    }
                    if ((!arrayList.isEmpty()) && a0.LJJJIL((CharSequence) C13LP.LJJLIIIJJI(arrayList))) {
                        ListProtector.remove(arrayList, arrayList.size() - 1);
                    }
                    if ((!arrayList.isEmpty()) && a0.LJJJIL((CharSequence) C13LP.LJJJJZI(arrayList))) {
                        ListProtector.remove(arrayList, 0);
                    }
                    for (String str : arrayList) {
                        C21428218tU c21428218tU = new C21428218tU();
                        c21428218tU.LJFF = EnumC21429518th.LEFT;
                        c21428218tU.LIZIZ(LJFF(str));
                        c21428618tY.LIZIZ(c21428218tU);
                    }
                    c21428718tZ.LIZIZ(c21428518tX);
                    c21428518tX.LIZIZ(c21428618tY);
                    C21430618ts c21430618ts = new C21430618ts(c21428718tZ);
                    c21430618ts.LIZIZ(LJFF(strLIZ));
                    return c21430618ts;
                }

                {
                    this.LJ = atomicReference3;
                }
            });
        }
    }
}
