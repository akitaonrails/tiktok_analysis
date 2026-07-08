package X;

import java.util.Map;

/* JADX INFO: renamed from: X.18ty, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21431218ty implements InterfaceC21427218tK {
    public final C21432118u7 LIZ;
    public final C14S7 LIZIZ;
    public final C21423918sn LIZJ;
    public final Map<Class<? extends AbstractC21430218to>, InterfaceC21427718tP<? extends AbstractC21430218to>> LIZLLL;
    public final InterfaceC21437018uu LJ;

    @Override // X.InterfaceC21427218tK
    public final void LJIIJ() {
        if (this.LIZJ.length() > 0) {
            if ('\n' != this.LIZJ.LL.charAt(r0.length() - 1)) {
                this.LIZJ.LIZ('\n');
            }
        }
    }

    @Override // X.InterfaceC21427218tK
    public final void LJJIJ() {
        this.LIZJ.LIZ('\n');
    }

    @Override // X.InterfaceC21427218tK
    public final int length() {
        return this.LIZJ.length();
    }

    @Override // X.InterfaceC21427218tK
    public final C14S7 LJIL() {
        return this.LIZIZ;
    }

    @Override // X.InterfaceC21427218tK
    public final C21432118u7 LJJIII() {
        return this.LIZ;
    }

    @Override // X.InterfaceC21427218tK
    public final C21423918sn builder() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC21437318ux
    public final void LIZ(C21439218vG c21439218vG) {
        LJJIJIL(c21439218vG);
    }

    @Override // X.InterfaceC21437318ux
    public final void LIZIZ(C21438118v5 c21438118v5) {
        LJJIJIL(c21438118v5);
    }

    @Override // X.InterfaceC21437318ux
    public final void LIZJ(AbstractC21438918vD abstractC21438918vD) {
        LJJIJIL(abstractC21438918vD);
    }

    @Override // X.InterfaceC21437318ux
    public final void LIZLLL(C21440318vR c21440318vR) {
        LJJIJIL(c21440318vR);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJ(C21440518vT c21440518vT) {
        LJJIJIL(c21440518vT);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJFF(C21445018wC c21445018wC) {
        LJJIJIL(c21445018wC);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJI(AbstractC21430318tp abstractC21430318tp) {
        LJJIJIL(abstractC21430318tp);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJII(C21436418uo c21436418uo) {
        LJJIJIL(c21436418uo);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJIIIIZZ(C21439118vF c21439118vF) {
        LJJIJIL(c21439118vF);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJIIIZ(C21438218v6 c21438218v6) {
        LJJIJIL(c21438218v6);
    }

    @Override // X.InterfaceC21427218tK
    public final InterfaceC21427718tP<AbstractC21430218to> LJIIJJI(AbstractC21430218to abstractC21430218to) {
        if (this.LIZ.LIZ.LJIJJ) {
            AbstractC21430218to abstractC21430218to2 = abstractC21430218to.LIZLLL;
            if ((abstractC21430218to2 instanceof C21437218uw) && ((C21437218uw) abstractC21430218to2).LJFF.startsWith("<sup") && ((C21437218uw) abstractC21430218to.LIZLLL).LJFF.endsWith(">")) {
                AbstractC21430218to abstractC21430218to3 = abstractC21430218to.LJ;
                if ((abstractC21430218to3 instanceof C21437218uw) && ((C21437218uw) abstractC21430218to3).LJFF.equals("</sup>") && (abstractC21430218to instanceof C21437418uy) && this.LIZ.LIZLLL != null) {
                    return new InterfaceC21427718tP<AbstractC21430218to>() { // from class: X.18tx
                        @Override // X.InterfaceC21427718tP
                        public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to4) {
                            int length = interfaceC21427218tK.length();
                            interfaceC21427218tK.builder().LIZJ(((C21437418uy) abstractC21430218to4).LJFF);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(((C21437218uw) abstractC21430218to4.LIZLLL).LJFF);
                            sbLIZ.append(((C21437418uy) abstractC21430218to4).LJFF);
                            sbLIZ.append(((C21437218uw) abstractC21430218to4.LJ).LJFF);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                            C21431218ty c21431218ty = this.LIZ;
                            c21431218ty.LJIJI(length, c21431218ty.LIZ.LIZLLL.LIZ(strLIZIZ));
                        }
                    };
                }
            }
            return (InterfaceC21427718tP) this.LIZLLL.get(abstractC21430218to.getClass());
        }
        AbstractC21430218to abstractC21430218to4 = abstractC21430218to.LIZLLL;
        if ((abstractC21430218to4 instanceof C21437218uw) && ((C21437218uw) abstractC21430218to4).LJFF.equals("<sup>")) {
            AbstractC21430218to abstractC21430218to5 = abstractC21430218to.LJ;
            if ((abstractC21430218to5 instanceof C21437218uw) && ((C21437218uw) abstractC21430218to5).LJFF.equals("</sup>") && (abstractC21430218to instanceof C21437418uy) && this.LIZ.LIZLLL != null) {
                return new InterfaceC21427718tP<AbstractC21430218to>() { // from class: X.18u5
                    @Override // X.InterfaceC21427718tP
                    public final void LIZ(InterfaceC21427218tK interfaceC21427218tK, AbstractC21430218to abstractC21430218to6) {
                        int length = interfaceC21427218tK.length();
                        C21437418uy c21437418uy = (C21437418uy) abstractC21430218to6;
                        interfaceC21427218tK.builder().LIZJ(c21437418uy.LJFF);
                        C21431218ty c21431218ty = this.LIZ;
                        c21431218ty.LJIJI(length, c21431218ty.LIZ.LIZLLL.LIZ(c21437418uy.LJFF));
                    }
                };
            }
        }
        return (InterfaceC21427718tP) this.LIZLLL.get(abstractC21430218to.getClass());
    }

    @Override // X.InterfaceC21437318ux
    public final void LJIIL(C21445118wD c21445118wD) {
        LJJIJIL(c21445118wD);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJIILIIL(C21437518uz c21437518uz) {
        LJJIJIL(c21437518uz);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJIILJJIL(C21440218vQ c21440218vQ) {
        LJJIJIL(c21440218vQ);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJIILL(C21439318vH c21439318vH) {
        LJJIJIL(c21439318vH);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJIILLIIL(C21438618vA c21438618vA) {
        LJJIJIL(c21438618vA);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJIIZILJ(C21438718vB c21438718vB) {
        LJJIJIL(c21438718vB);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJIJ(C21437218uw c21437218uw) {
        LJJIJIL(c21437218uw);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJIJJ(C21440118vP c21440118vP) {
        LJJIJIL(c21440118vP);
    }

    @Override // X.InterfaceC21427218tK
    public final boolean LJIJJLI(AbstractC21430218to abstractC21430218to) {
        if (abstractC21430218to.LJ != null) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC21427218tK
    public final void LJJ(AbstractC21430218to abstractC21430218to) {
        this.LJ.LIZ(this, abstractC21430218to);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJJI(C21444918wB c21444918wB) {
        LJJIJIL(c21444918wB);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJJIFFI(C21437618v0 c21437618v0) {
        LJJIJIL(c21437618v0);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJJII(C21436318un c21436318un) {
        LJJIJIL(c21436318un);
    }

    @Override // X.InterfaceC21437318ux
    public final void LJJIIJ(C21437418uy c21437418uy) {
        LJJIJIL(c21437418uy);
    }

    @Override // X.InterfaceC21427218tK
    public final void LJJIIZ(AbstractC21430218to abstractC21430218to) {
        AbstractC21430218to abstractC21430218to2 = abstractC21430218to.LIZIZ;
        while (abstractC21430218to2 != null) {
            AbstractC21430218to abstractC21430218to3 = abstractC21430218to2.LJ;
            abstractC21430218to2.LIZ(this);
            abstractC21430218to2 = abstractC21430218to3;
        }
    }

    @Override // X.InterfaceC21437318ux
    public final void LJJIJIIJI(C21437718v1 c21437718v1) {
        LJJIJIL(c21437718v1);
    }

    @Override // X.InterfaceC21427218tK
    public final void LJJIJIIJIL(AbstractC21430218to abstractC21430218to) {
        this.LJ.LIZIZ(this, abstractC21430218to);
    }

    public final void LJJIJIL(AbstractC21430218to abstractC21430218to) {
        InterfaceC21427718tP<AbstractC21430218to> interfaceC21427718tPLJIIJJI = LJIIJJI(abstractC21430218to);
        if (interfaceC21427718tPLJIIJJI != null) {
            interfaceC21427718tPLJIIJJI.LIZ(this, abstractC21430218to);
        } else {
            LJJIIZ(abstractC21430218to);
        }
    }

    @Override // X.InterfaceC21427218tK
    public final void LJIJI(int i, Object obj) {
        C21423918sn c21423918sn = this.LIZJ;
        C21423918sn.LJI(c21423918sn, obj, i, c21423918sn.length());
    }

    @Override // X.InterfaceC21427218tK
    public final <N extends AbstractC21430218to> void LJJIIJZLJL(N n, int i) {
        InterfaceC21446318wP interfaceC21446318wPLIZ = ((C21435218uc) this.LIZ.LJFF).LIZ(n.getClass());
        if (interfaceC21446318wPLIZ != null) {
            LJIJI(i, interfaceC21446318wPLIZ.LIZ(this.LIZ, this.LIZIZ));
        }
    }

    @Override // X.InterfaceC21427218tK
    public final <N extends AbstractC21430218to> void LJJIIZI(N n, int i) {
        Class<?> cls = n.getClass();
        InterfaceC21446318wP interfaceC21446318wPLIZ = ((C21435218uc) this.LIZ.LJFF).LIZ(cls);
        if (interfaceC21446318wPLIZ != null) {
            LJIJI(i, interfaceC21446318wPLIZ.LIZ(this.LIZ, this.LIZIZ));
            return;
        }
        throw new NullPointerException(cls.getName());
    }

    public C21431218ty(C21432118u7 c21432118u7, C14S6 c14s6, C21423918sn c21423918sn, Map map, InterfaceC21437018uu interfaceC21437018uu) {
        this.LIZ = c21432118u7;
        this.LIZIZ = c14s6;
        this.LIZJ = c21423918sn;
        this.LIZLLL = map;
        this.LJ = interfaceC21437018uu;
    }
}
