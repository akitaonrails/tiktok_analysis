package X;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS593S0100000_14;

/* JADX INFO: renamed from: X.0YGO, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0YGO {
    public final C0YEM LIZ;
    public final InterfaceC863890Xul LIZIZ;
    public final Function0<Long> LIZJ;
    public final C0YGU LIZLLL;
    public final Function1<Integer, InterfaceC871300YGa> LJ;
    public final C0YGT LJFF;

    public C0YGO() {
        throw null;
    }

    public final C868780Y6i LIZJ() {
        return this.LIZ.LIZLLL();
    }

    public final boolean LIZLLL() {
        SparseArray<C0YGS> sparseArray = this.LJFF.LIZ;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            if (sparseArray.get(sparseArray.keyAt(i)).LIZJ == 1) {
                return false;
            }
        }
        return true;
    }

    public final void LJI() {
        LIZJ().LJIIIIZZ("GetMsgByUserRequestBuffer", "reset pull intents", null);
        ArrayList arrayList = new ArrayList();
        SparseArray<C0YGS> sparseArray = this.LJFF.LIZ;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            int iKeyAt = sparseArray.keyAt(i);
            if (sparseArray.get(iKeyAt).LIZJ != 1) {
                arrayList.add(Integer.valueOf(iKeyAt));
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            this.LJFF.LIZ.delete(((Number) it2.next()).intValue());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:45:0x0116  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.InterfaceC1364105Vn<? super kotlin.Unit> r21) {
        /*
            Method dump skipped, instruction units count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YGO.LJ(X.05Vn):java.lang.Object");
    }

    public final void LJFF(int i) {
        C868780Y6i c868780Y6iLIZJ = LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("remove inboxType");
        sbLIZ.append(i);
        sbLIZ.append(" from buffer");
        c868780Y6iLIZJ.LJIIIIZZ("GetMsgByUserRequestBuffer", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LJFF.LIZ.delete(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJII(X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof X.C0YGR
            if (r0 == 0) goto L4e
            r7 = r9
            X.0YGR r7 = (X.C0YGR) r7
            int r2 = r7.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4e
            int r2 = r2 - r1
            r7.LLILLL = r2
        L12:
            java.lang.Object r1 = r7.LL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r7.LLILLL
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L28
            if (r0 == r4) goto L42
            if (r0 != r5) goto L54
            X.C155000ia.LIZIZ(r1)
        L25:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L28:
            X.C155000ia.LIZIZ(r1)
            X.0Y6i r3 = r8.LIZJ()
            java.lang.String r2 = "schedule an API request with delay: 50"
            r1 = 4
            java.lang.String r0 = "GetMsgByUserRequestBuffer"
            X.C868780Y6i.LJIILJJIL(r3, r0, r2, r1)
            r7.LLILLL = r4
            r0 = 50
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r6) goto L45
            return r6
        L42:
            X.C155000ia.LIZIZ(r1)
        L45:
            r7.LLILLL = r5
            java.lang.Object r0 = r8.LJ(r7)
            if (r0 != r6) goto L25
            return r6
        L4e:
            X.0YGR r7 = new X.0YGR
            r7.<init>(r8, r9)
            goto L12
        L54:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YGO.LJII(X.05Vn):java.lang.Object");
    }

    public C0YGO(C0YEM c0yem, InterfaceC863890Xul interfaceC863890Xul, AwS593S0100000_14 awS593S0100000_14) {
        final C1198604mW c1198604mW = new C1198604mW();
        final InterfaceC869500Y9c interfaceC869500Y9cLIZJ = c0yem.LJIIZILJ().LIZIZ().LIZJ();
        final C868140Y3w c868140Y3w = c0yem.LJIIZILJ().getDomain().LIZIZ;
        final C869040Y7i c869040Y7i = new C869040Y7i(c0yem);
        final C0YF6 c0yf6 = c0yem.LJIIIZ().LJJLIIIIJ.LIZ;
        final C868780Y6i c868780Y6iLIZLLL = c0yem.LIZLLL();
        C0YGU c0ygu = new C0YGU(interfaceC869500Y9cLIZJ, c868140Y3w, c869040Y7i, c0yf6, c868780Y6iLIZLLL, c1198604mW) { // from class: X.0YRo
            public final C868780Y6i LIZ;
            public final Function0<Long> LIZIZ;
            public final List<InterfaceC874380YRw> LIZJ;

            @Override // X.C0YGU
            public final boolean LIZ(int i, C0YGS c0ygs, C0YGT c0ygt) {
                C874360YRu c874360YRu = new C874360YRu(i, c0ygs, this.LIZIZ.invoke().longValue(), c0ygt);
                for (InterfaceC874380YRw interfaceC874380YRw : this.LIZJ) {
                    if (interfaceC874380YRw.LIZIZ(c874360YRu)) {
                        C868780Y6i c868780Y6i = this.LIZ;
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("debouncing inbox");
                        sbLIZ.append(i);
                        sbLIZ.append(" with ");
                        sbLIZ.append(interfaceC874380YRw.LIZ());
                        c868780Y6i.LJIIIIZZ("PullDebounceUseCase", C2188811AlT.LIZIZ(sbLIZ), null);
                        return true;
                    }
                }
                return false;
            }

            {
                this.LIZ = c868780Y6iLIZLLL;
                this.LIZIZ = c1198604mW;
                C13DV c13dvLIZIZ = C1697820uHc.LIZIZ();
                final boolean z = c0yf6.LIZJ;
                c13dvLIZIZ.add(new InterfaceC874380YRw(interfaceC869500Y9cLIZJ, c869040Y7i) { // from class: X.0YRp
                    public final InterfaceC869500Y9c LIZ;
                    public final Function1<Integer, Unit> LIZIZ;

                    @Override // X.InterfaceC874380YRw
                    public final String LIZ() {
                        return "CheckIsInit";
                    }

                    @Override // X.InterfaceC874380YRw
                    public final boolean LIZIZ(C874360YRu c874360YRu) {
                        if (this.LIZ.LJIIJJI(c874360YRu.LIZ)) {
                            return false;
                        }
                        this.LIZIZ.invoke(Integer.valueOf(c874360YRu.LIZ));
                        return true;
                    }

                    {
                        this.LIZ = interfaceC869500Y9cLIZJ;
                        this.LIZIZ = c869040Y7i;
                    }
                });
                c13dvLIZIZ.add(new InterfaceC874380YRw(c868140Y3w) { // from class: X.0YRv
                    public final C868140Y3w LIZ;

                    @Override // X.InterfaceC874380YRw
                    public final String LIZ() {
                        return "CheckOngoingInit";
                    }

                    {
                        this.LIZ = c868140Y3w;
                    }

                    @Override // X.InterfaceC874380YRw
                    public final boolean LIZIZ(C874360YRu c874360YRu) {
                        return this.LIZ.LJ(c874360YRu.LIZ);
                    }
                });
                c13dvLIZIZ.add(new InterfaceC874380YRw() { // from class: X.0YRs
                    @Override // X.InterfaceC874380YRw
                    public final String LIZ() {
                        return "CheckOngoingPull";
                    }

                    @Override // X.InterfaceC874380YRw
                    public final boolean LIZIZ(C874360YRu c874360YRu) {
                        if (c874360YRu.LIZLLL.LIZ.get(c874360YRu.LIZ) != null && !c874360YRu.LIZIZ.LJ) {
                            return true;
                        }
                        return false;
                    }
                });
                if (c0yf6.LIZ) {
                    final int i = 5000;
                    c13dvLIZIZ.add(new InterfaceC874380YRw(i, z) { // from class: X.0YRq
                        public final int LIZ;
                        public final boolean LIZIZ;

                        @Override // X.InterfaceC874380YRw
                        public final String LIZ() {
                            return "CheckPullInterval";
                        }

                        @Override // X.InterfaceC874380YRw
                        public final boolean LIZIZ(C874360YRu c874360YRu) {
                            long jLongValue;
                            if (this.LIZIZ && c874360YRu.LIZIZ.LJ) {
                                return false;
                            }
                            Long l = c874360YRu.LIZLLL.LIZIZ.get(c874360YRu.LIZ);
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            if (c874360YRu.LIZJ - jLongValue >= this.LIZ) {
                                return false;
                            }
                            return true;
                        }

                        {
                            this.LIZ = i;
                            this.LIZIZ = z;
                        }
                    });
                    final int i2 = 10000;
                    c13dvLIZIZ.add(new InterfaceC874380YRw(i2, z) { // from class: X.0YRr
                        public final int LIZ;
                        public final boolean LIZIZ;

                        @Override // X.InterfaceC874380YRw
                        public final String LIZ() {
                            return "CheckSuccessPullInterval";
                        }

                        @Override // X.InterfaceC874380YRw
                        public final boolean LIZIZ(C874360YRu c874360YRu) {
                            long jLongValue;
                            if (this.LIZIZ && c874360YRu.LIZIZ.LJ) {
                                return false;
                            }
                            Long l = c874360YRu.LIZLLL.LIZJ.get(c874360YRu.LIZ);
                            if (l != null) {
                                jLongValue = l.longValue();
                            } else {
                                jLongValue = 0;
                            }
                            if (c874360YRu.LIZJ - jLongValue >= this.LIZ) {
                                return false;
                            }
                            return true;
                        }

                        {
                            this.LIZ = i2;
                            this.LIZIZ = z;
                        }
                    });
                    c13dvLIZIZ.add(new InterfaceC874380YRw(interfaceC869500Y9cLIZJ) { // from class: X.0YRt
                        public final InterfaceC869500Y9c LIZ;

                        @Override // X.InterfaceC874380YRw
                        public final String LIZ() {
                            return "CheckPassivePullTime";
                        }

                        {
                            this.LIZ = interfaceC869500Y9cLIZJ;
                        }

                        @Override // X.InterfaceC874380YRw
                        public final boolean LIZIZ(C874360YRu c874360YRu) {
                            int i3 = c874360YRu.LIZIZ.LIZ;
                            if (i3 != 11 && i3 != 8 && i3 != 10 && i3 != 3) {
                                return false;
                            }
                            if (c874360YRu.LIZJ >= this.LIZ.LJJIII(c874360YRu.LIZ)) {
                                return false;
                            }
                            return true;
                        }
                    });
                }
                this.LIZJ = C1697820uHc.LIZ(c13dvLIZIZ);
            }
        };
        this.LIZ = c0yem;
        this.LIZIZ = interfaceC863890Xul;
        this.LIZJ = c1198604mW;
        this.LIZLLL = c0ygu;
        this.LJ = awS593S0100000_14;
        this.LJFF = new C0YGT(0);
    }

    public final Object LIZ(int i, C0YGS c0ygs, C0YGP c0ygp) {
        C868780Y6i c868780Y6iLIZJ = LIZJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("add new intent to buffer, inbox ");
        sbLIZ.append(i);
        c868780Y6iLIZJ.LJIIIIZZ("GetMsgByUserRequestBuffer", C2188811AlT.LIZIZ(sbLIZ), null);
        this.LJFF.LIZ.put(i, c0ygs);
        if (this.LJFF.LIZ.size() == C870740YDw.LJ(this.LIZ.LJIIIZ()).length) {
            Object objLJ = LJ(c0ygp);
            if (objLJ == C099R.LJFF()) {
                return objLJ;
            }
            return Unit.LIZ;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:58:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01fd A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:75:0x01d8 -> B:78:0x01e8). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(int r16, X.C0YGS r17, X.InterfaceC1364105Vn<? super kotlin.Unit> r18) {
        /*
            Method dump skipped, instruction units count: 516
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YGO.LIZIZ(int, X.0YGS, X.05Vn):java.lang.Object");
    }

    public final C872330YJz LJIIIIZZ(C0YGS c0ygs, int i, C0YFV c0yfv) {
        return new C872330YJz(i, c0ygs.LIZ, c0ygs.LIZIZ, c0yfv, this.LIZ.LJIIZILJ().LIZIZ().LIZJ().LJJJJLI(i, c0yfv), c0ygs.LIZLLL);
    }
}
