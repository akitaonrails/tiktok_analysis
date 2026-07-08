package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS575S0100000_31;
import kotlin.jvm.internal.AwS610S0100000_31;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.163D, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C163D extends C164O<AbstractC903430ZcL, AbstractC207157164l> implements AnonymousClass1645<C207134163o, AbstractC903430ZcL> {
    public final EnumC207101162h LIZLLL;
    public C207134163o LJ;
    public String LJFF;
    public EnumC715590S5d LJI;
    public boolean LJII;
    public C162V LJIIIIZZ;
    public final C11NJ LJIIIZ = new C11NJ();
    public boolean LJIIJ;
    public C163T LJIIJJI;
    public int LJIIL;
    public final C054G LJIILIIL;
    public final C163C LJIILJJIL;
    public final C163M LJIILL;
    public final AnonymousClass1638<C207134163o> LJIILLIIL;
    public EnumC715680S5m LJIIZILJ;
    public final C2252321DDq LJIJ;
    public final C2252321DDq LJIJI;
    public final C2252321DDq LJIJJ;
    public final List<C09AE> LJIJJLI;

    @Override // X.C164P
    public final String getTag() {
        return "BizCompTranslationStateMachine";
    }

    public final EnumC715680S5m LJIJI() {
        return C161N.LIZIZ.LJJLI(this.LJ) ? EnumC715680S5m.OVERRIDE_TO_TRANSLATED : this.LJIIZILJ;
    }

    public final void LJIL() {
        C207134163o c207134163o = this.LJ;
        if (c207134163o != null && this.LJIIJ) {
            boolean zLJ = this.LJIILLIIL.LJ(c207134163o, LJIJI());
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("reEvaluateTranslationState: state=");
            sbLIZ.append(((AbstractC903430ZcL) this.LJIJ.getValue()).LIZ);
            sbLIZ.append(", lastError=");
            sbLIZ.append(this.LJIIJJI);
            sbLIZ.append(", shouldTranslate=");
            sbLIZ.append(zLJ);
            sbLIZ.append(", autoTranslate=");
            sbLIZ.append(this.LJII);
            sbLIZ.append(", overrideStatus=");
            sbLIZ.append(LJIJI());
            sbLIZ.append(", requestType=");
            sbLIZ.append(this.LJI);
            sbLIZ.append(", targetLang=");
            sbLIZ.append(C161N.LIZIZ.LLIIZ());
            sbLIZ.append(", sourceLang=");
            C207134163o c207134163o2 = this.LJ;
            sbLIZ.append(c207134163o2 != null ? c207134163o2.LJ : null);
            sbLIZ.append(", detectedSrcLang=");
            C207134163o c207134163o3 = this.LJ;
            sbLIZ.append(c207134163o3 != null ? c207134163o3.LJII : null);
            sbLIZ.append(", sourceContent=");
            C207134163o c207134163o4 = this.LJ;
            sbLIZ.append(c207134163o4 != null ? c207134163o4.LIZLLL : null);
            sbLIZ.append(", id=");
            C207134163o c207134163o5 = this.LJ;
            sbLIZ.append(c207134163o5 != null ? c207134163o5.LIZJ : null);
            C2188811AlT.LIZIZ(sbLIZ);
            if (zLJ) {
                if (this.LJIJ.getValue() instanceof C903390ZcH) {
                    onEvent(C207164164s.LIZIZ);
                    return;
                }
            } else if (this.LJIJ.getValue() instanceof C903400ZcI) {
                onEvent(C207162164q.LIZIZ);
                return;
            } else if (this.LJIJ.getValue() instanceof C903420ZcK) {
                onEvent(C207158164m.LIZIZ);
                return;
            }
            EnumC715680S5m enumC715680S5mLJIJI = LJIJI();
            EnumC715680S5m enumC715680S5m = EnumC715680S5m.NOT_OVERWRITTEN;
            if (enumC715680S5mLJIJI != enumC715680S5m) {
                Object value = this.LJIJ.getValue();
                this.LJIJ.setValue(value instanceof C903390ZcH ? LJIJ((AbstractC903430ZcL) this.LJIJ.getValue()) : value instanceof C903400ZcI ? LJIJJ((AbstractC903430ZcL) this.LJIJ.getValue()) : this.LJIJ.getValue());
            }
            C163T c163t = this.LJIIJJI;
            if (c163t == null || c163t == C163T.LANGUAGE_SAME || c163t == C163T.TRANSLATION_NOT_REQUIRED) {
                return;
            }
            LJJI(enumC715680S5m);
        }
    }

    public final void LJJ() {
        if (this.LJIJ.getValue() instanceof C903420ZcK) {
            onEvent(C207158164m.LIZIZ);
        }
        C163T c163t = this.LJIIJJI;
        if (c163t != null) {
            if (c163t != C163T.LANGUAGE_SAME && c163t != C163T.TRANSLATION_NOT_REQUIRED) {
                C161N.LIZIZ.LJJLIIIJJI(this.LJ, false);
            }
            this.LJIIJJI = null;
        }
        this.LJIIIZ.LJ();
    }

    @Override // X.C164O
    public final InterfaceC332260D0u<AbstractC903430ZcL> LJIIZILJ() {
        return this.LJIJ;
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x00d0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C903390ZcH LJIJ(X.AbstractC903430ZcL r13) {
        /*
            Method dump skipped, instruction units count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163D.LJIJ(X.0ZcL):X.0ZcH");
    }

    public final C903400ZcI LJIJJ(AbstractC903430ZcL abstractC903430ZcL) {
        boolean z;
        if (abstractC903430ZcL instanceof C903420ZcK) {
            z = ((C903420ZcK) abstractC903430ZcL).LIZIZ;
        } else {
            z = this.LJII;
        }
        AnonymousClass1643 anonymousClass1643 = new AnonymousClass1643(LJIJI(), C161N.LIZIZ.LLIIZ(), z);
        C207134163o c207134163o = this.LJ;
        if (c207134163o != null) {
            Iterator<AnonymousClass1636<C207134163o, C163A<C207134163o, ? extends C164B, ? extends AbstractC1361510lXB<C207134163o, ? extends C164B>>>> it2 = this.LJIILLIIL.LIZ.iterator();
            while (it2.hasNext()) {
                it2.next().LJIIIIZZ(c207134163o, anonymousClass1643);
            }
        }
        return new C903400ZcI(anonymousClass1643.LIZ, anonymousClass1643.LIZIZ, anonymousClass1643.LIZLLL);
    }

    public final void LJIJJLI(EnumC715590S5d enumC715590S5d) {
        String str;
        this.LJI = enumC715590S5d;
        this.LJII = false;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("original: state=");
        sbLIZ.append(((AbstractC903430ZcL) this.LJIJ.getValue()).LIZ);
        sbLIZ.append(", id=");
        C207134163o c207134163o = this.LJ;
        if (c207134163o != null) {
            str = c207134163o.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (enumC715590S5d == EnumC715590S5d.CLICK) {
            LJJI(EnumC715680S5m.OVERRIDE_TO_ORIGINAL);
            LJIL();
        }
    }

    public final void LJJI(EnumC715680S5m enumC715680S5m) {
        boolean z;
        this.LJIIZILJ = enumC715680S5m;
        C161N c161n = C161N.LIZIZ;
        C207134163o c207134163o = this.LJ;
        if (enumC715680S5m == EnumC715680S5m.OVERRIDE_TO_TRANSLATED) {
            z = true;
        } else {
            z = false;
        }
        c161n.LJJLIIIJJI(c207134163o, z);
    }

    public final void LJJIFFI(AbstractC903430ZcL abstractC903430ZcL) {
        String str;
        LJ(abstractC903430ZcL, LJIJI());
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("setTranslationState: state=");
        sbLIZ.append(abstractC903430ZcL);
        sbLIZ.append(", _state.value=");
        sbLIZ.append(this.LJIJ.getValue());
        sbLIZ.append(", id=");
        C207134163o c207134163o = this.LJ;
        if (c207134163o != null) {
            str = c207134163o.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJIJ.setValue(abstractC903430ZcL);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJII(X.C162U r4) {
        /*
            r3 = this;
            if (r4 == 0) goto L1b
            X.163o r0 = r3.LJ
            if (r0 == 0) goto L21
            java.lang.Integer r2 = r0.LJI
            X.163T r0 = X.C163T.LANGUAGE_SAME
            int r1 = r0.getValue()
            if (r2 == 0) goto L21
            int r0 = r2.intValue()
            if (r0 != r1) goto L21
        L16:
            X.162V r0 = X.C162V.SUCCESS
        L18:
            r4.LIZ(r0)
        L1b:
            X.164o r0 = X.C207160164o.LIZIZ
            r3.onEvent(r0)
            return
        L21:
            X.163o r0 = r3.LJ
            if (r0 == 0) goto L36
            java.lang.Integer r2 = r0.LJI
            X.163T r0 = X.C163T.TRANSLATION_NOT_REQUIRED
            int r1 = r0.getValue()
            if (r2 == 0) goto L36
            int r0 = r2.intValue()
            if (r0 != r1) goto L36
            goto L16
        L36:
            X.162V r0 = X.C162V.FAILURE
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C163D.LJJII(X.162U):void");
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [X.1637, X.163M] */
    public C163D(InterfaceC497601wk interfaceC497601wk, final EnumC207101162h enumC207101162h) {
        this.LIZLLL = enumC207101162h;
        this.LJIILIIL = C2296808zG.LIZ(interfaceC497601wk.getCoroutineContext().plus(C164O.LIZJ));
        final C163C c163c = new C163C(enumC207101162h);
        this.LJIILJJIL = c163c;
        ?? r3 = new AnonymousClass1637<C207134163o, C163C, C903380ZcG, AbstractC903430ZcL>(enumC207101162h, c163c) { // from class: X.163M
            public final EnumC207101162h LJII;

            @Override // X.AnonymousClass1637
            public final C164G LIZJ() {
                return new C903380ZcG("", "", null, false, false);
            }

            {
                super(c163c, new C1055510dZd());
                this.LJII = enumC207101162h;
            }

            /* JADX WARN: Removed duplicated region for block: B:26:0x005c  */
            @Override // X.AnonymousClass1637
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final X.C164G LIZIZ(X.C0S5Q r6, X.C0S5Q r7, X.C207134163o r8, X.EnumC715680S5m r9) {
                /*
                    r5 = this;
                    X.0ZcL r7 = (X.AbstractC903430ZcL) r7
                    X.163o r8 = (X.C207134163o) r8
                    r4 = 0
                    if (r8 == 0) goto L35
                    if (r7 == 0) goto L5e
                    X.0SKK r1 = r7.LIZ
                Lb:
                    X.0SKK r0 = X.C0SKK.TRANSLATED
                    r3 = 1
                    if (r1 == r0) goto L5c
                    X.162h r1 = r5.LJII
                    X.162h r0 = X.EnumC207101162h.DIRECT_MESSAGE
                    if (r1 != r0) goto L53
                    com.ss.android.ugc.aweme.translation.service.ITranslationKevaService r0 = X.C161T.LIZ()
                    boolean r0 = r0.LJFF()
                L1e:
                    if (r0 == 0) goto L5c
                    r2 = 1
                L21:
                    boolean r0 = r6 instanceof X.C903390ZcH
                    if (r0 == 0) goto L36
                    X.163j r1 = new X.163j
                    r1.<init>(r2, r9)
                    USECASE extends X.1636<ITEM, ? extends X.163A<ITEM, ? extends X.164B, ? extends X.0lXB<ITEM, ? extends X.164B>>> r0 = r5.LIZ
                    X.163C r0 = (X.C163C) r0
                    r0.LJIILIIL(r8, r1)
                    X.0ZcG r4 = r1.LIZ()
                L35:
                    return r4
                L36:
                    boolean r0 = r6 instanceof X.C903410ZcJ
                    if (r0 != 0) goto L35
                    boolean r0 = r6 instanceof X.C903420ZcK
                    if (r0 != 0) goto L35
                    boolean r0 = r6 instanceof X.C903400ZcI
                    if (r0 == 0) goto L60
                    X.163j r1 = new X.163j
                    r1.<init>(r3, r9)
                    USECASE extends X.1636<ITEM, ? extends X.163A<ITEM, ? extends X.164B, ? extends X.0lXB<ITEM, ? extends X.164B>>> r0 = r5.LIZ
                    X.163C r0 = (X.C163C) r0
                    r0.LJIILIIL(r8, r1)
                    X.0ZcG r4 = r1.LIZ()
                    return r4
                L53:
                    com.ss.android.ugc.aweme.translation.service.ITranslationKevaService r0 = X.C161T.LIZ()
                    boolean r0 = r0.LIZ()
                    goto L1e
                L5c:
                    r2 = 0
                    goto L21
                L5e:
                    r1 = r4
                    goto Lb
                L60:
                    X.07lC r0 = new X.07lC
                    r0.<init>()
                    throw r0
                */
                throw new UnsupportedOperationException("Method not decompiled: X.C163M.LIZIZ(X.0S5Q, X.0S5Q, java.lang.Object, X.0S5m):X.164G");
            }
        };
        this.LJIILL = r3;
        this.LJIILLIIL = new AnonymousClass1638<>(C1697810uHb.LJIILJJIL(c163c));
        this.LJIIZILJ = EnumC715680S5m.NOT_OVERWRITTEN;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(C903410ZcJ.LIZIZ);
        this.LJIJ = c2252321DDqLIZ;
        this.LJIJI = c2252321DDqLIZ;
        this.LJIJJ = r3.LJI;
        this.LJIJJLI = new ArrayList();
        new AwS610S0100000_31(this, 336).invoke(this);
    }

    @Override // X.AnonymousClass1645
    public final void LJIIIIZZ(EnumC715590S5d enumC715590S5d, boolean z) {
        String str;
        if (!this.LJIIJ) {
            return;
        }
        this.LJII = z;
        this.LJI = enumC715590S5d;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("translate: state=");
        sbLIZ.append(((AbstractC903430ZcL) this.LJIJ.getValue()).LIZ);
        sbLIZ.append(", id=");
        C207134163o c207134163o = this.LJ;
        if (c207134163o != null) {
            str = c207134163o.LIZJ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        if (enumC715590S5d == EnumC715590S5d.CLICK) {
            LJJI(EnumC715680S5m.OVERRIDE_TO_TRANSLATED);
            LJIL();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC903430ZcL LJJIII(C207134163o c207134163o, String str) {
        String str2;
        String str3;
        Boolean boolValueOf;
        AbstractC903430ZcL abstractC903430ZcLLJIJ;
        String str4;
        String str5;
        C207134163o c207134163o2;
        LJJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("updateItemSyncState: enterFrom=");
        sbLIZ.append(str);
        sbLIZ.append(", new id=");
        sbLIZ.append(c207134163o.LIZJ);
        sbLIZ.append(", new sourceContent=");
        sbLIZ.append(c207134163o.LIZLLL);
        sbLIZ.append(", old id=");
        C207134163o c207134163o3 = this.LJ;
        if (c207134163o3 != null) {
            str2 = c207134163o3.LIZJ;
        } else {
            str2 = null;
        }
        sbLIZ.append(str2);
        sbLIZ.append(", old sourceContent=");
        C207134163o c207134163o4 = this.LJ;
        if (c207134163o4 != null) {
            str3 = c207134163o4.LIZLLL;
        } else {
            str3 = null;
        }
        sbLIZ.append(str3);
        sbLIZ.append(", sourceLanguage=");
        sbLIZ.append(c207134163o.LJ);
        sbLIZ.append(", manualTranslate=");
        C903380ZcG c903380ZcG = c207134163o.LJFF;
        if (c903380ZcG != null) {
            boolValueOf = Boolean.valueOf(c903380ZcG.LIZLLL);
        } else {
            boolValueOf = null;
        }
        sbLIZ.append(boolValueOf);
        sbLIZ.append(", overrideStatus=");
        sbLIZ.append(LJIJI());
        C2188811AlT.LIZIZ(sbLIZ);
        this.LJ = c207134163o;
        this.LJFF = str;
        C163M c163m = this.LJIILL;
        c163m.LIZLLL = c207134163o;
        c163m.LJ = str;
        c163m.LJFF = null;
        C161N c161n = C161N.LIZIZ;
        if (!c161n.LJJLI(c207134163o)) {
            LJJI(EnumC715680S5m.NOT_OVERWRITTEN);
        }
        if (C0SCC.LIZ[this.LIZLLL.ordinal()] == 1 && (c207134163o2 = this.LJ) != null && this.LJIILJJIL.LIZ(c207134163o2) && this.LJIILLIIL.LJ(this.LJ, LJIJI())) {
            abstractC903430ZcLLJIJ = LJIJJ(C903410ZcJ.LIZIZ);
        } else {
            abstractC903430ZcLLJIJ = LJIJ(C903410ZcJ.LIZIZ);
        }
        LJJIFFI(abstractC903430ZcLLJIJ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("autoTranslateIfNeeded: cur state=");
        sbLIZ2.append(((AbstractC903430ZcL) this.LJIJ.getValue()).LIZ);
        sbLIZ2.append(", id=");
        C207134163o c207134163o5 = this.LJ;
        if (c207134163o5 != null) {
            str4 = c207134163o5.LIZJ;
        } else {
            str4 = null;
        }
        sbLIZ2.append(str4);
        C2188811AlT.LIZIZ(sbLIZ2);
        if (this.LJIJ.getValue() instanceof C903390ZcH) {
            if (c161n.LJJJJLI(this.LJ)) {
                this.LJI = EnumC715590S5d.LAND_ON_ITEM;
                this.LJII = true;
                LJIL();
            }
        } else if (this.LJIJ.getValue() instanceof C903400ZcI) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("autoTranslateIfNeeded: do et report for already translated, state=");
            sbLIZ3.append(this.LJIJ.getValue());
            sbLIZ3.append(", id=");
            C207134163o c207134163o6 = this.LJ;
            if (c207134163o6 != null) {
                str5 = c207134163o6.LIZJ;
            } else {
                str5 = null;
            }
            sbLIZ3.append(str5);
            C2188811AlT.LIZIZ(sbLIZ3);
            String strLLIIZ = c161n.LLIIZ();
            this.LJIILLIIL.LIZIZ(this.LJ, strLLIIZ, C1485670olR.LIZ().LIZLLL(c161n.LJJIJIIJIL(null, null, this.LJFF), strLLIIZ, C0S61.LIZ(EnumC715590S5d.LAND_ON_ITEM), new AwS575S0100000_31(this, 1351), new AwS610S0100000_31(this, 338)));
            return abstractC903430ZcLLJIJ;
        }
        return abstractC903430ZcLLJIJ;
    }

    @Override // X.C164P
    public final void LIZLLL(C0S5Q c0s5q, C13IQ c13iq, InterfaceC710780RuO interfaceC710780RuO) {
        AbstractC903430ZcL abstractC903430ZcLLJIJJ;
        AbstractC903430ZcL abstractC903430ZcL = (AbstractC903430ZcL) c0s5q;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("from: ");
        sbLIZ.append(abstractC903430ZcL.LIZ.getId());
        sbLIZ.append(" to: ");
        sbLIZ.append(c13iq.LJI());
        sbLIZ.append(", event = ");
        sbLIZ.append(interfaceC710780RuO);
        sbLIZ.append(", thread = ");
        sbLIZ.append(C786410Ut5.u3());
        C2344809Gs.LIZLLL(4, "BizCompTranslationStateMachine", C2188811AlT.LIZIZ(sbLIZ));
        String str = null;
        if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C903410ZcJ.class))) {
            abstractC903430ZcLLJIJJ = C903410ZcJ.LIZIZ;
        } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C903390ZcH.class))) {
            abstractC903430ZcLLJIJJ = LJIJ(abstractC903430ZcL);
        } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C903420ZcK.class))) {
            abstractC903430ZcLLJIJJ = new C903420ZcK(this.LJII);
        } else if (Intrinsics.LJFF(c13iq, C13LE.LIZ(C903400ZcI.class))) {
            abstractC903430ZcLLJIJJ = LJIJJ(abstractC903430ZcL);
        } else {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("performTransition: Transitioning to an unknown state ");
            sbLIZ2.append(c13iq.LJI());
            sbLIZ2.append(", id=");
            C207134163o c207134163o = this.LJ;
            if (c207134163o != null) {
                str = c207134163o.LIZJ;
            }
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
            return;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("performTransition: newState=");
        sbLIZ3.append(abstractC903430ZcLLJIJJ.LIZ);
        sbLIZ3.append(", id=");
        C207134163o c207134163o2 = this.LJ;
        if (c207134163o2 != null) {
            str = c207134163o2.LIZJ;
        }
        sbLIZ3.append(str);
        C2188811AlT.LIZIZ(sbLIZ3);
        LJJIFFI(abstractC903430ZcLLJIJJ);
    }
}
