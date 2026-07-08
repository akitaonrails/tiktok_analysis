package X;

import android.view.ViewGroup;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.13af, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20037513af implements InterfaceC20035413aK {
    public final C20053713dH LL;
    public C13Z1 LLILLJJLI;
    public InterfaceC20029813Yq LLILLL;
    public int LLILZ;
    public int LLILZIL;
    public int LLJILLL;
    public int LLJJ;
    public final C19991913Kb<C20053713dH, C20037613ag> LLILZLL = C19992013Kc.LIZIZ();
    public final C19991913Kb<Object, C20053713dH> LLIZ = C19992013Kc.LIZIZ();
    public final C20047113cD LLIZLLLIL = new C20047113cD(this);
    public final C20047013cC LLJ = new C20047013cC(this);
    public final C19991913Kb<Object, C20053713dH> LLJI = C19992013Kc.LIZIZ();
    public final C19993013Km LLJIJIL = new C19993013Km(0);
    public final C19991913Kb<Object, InterfaceC20044613bo> LLJILJIL = C19992013Kc.LIZIZ();
    public final C19968013Aw<Object> LLJILJILJ = new C19968013Aw<>(new Object[16]);
    public final String LLJJI = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    @Override // X.InterfaceC20035413aK
    public final void LJIIJ() {
        LIZJ(false);
    }

    @Override // X.InterfaceC20035413aK
    public final void LJIIJJI() {
        LIZJ(true);
    }

    public final void LIZIZ() {
        int size = this.LL.LJJIIZ().size();
        if (this.LLILZLL.LJ != size) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Inconsistency between the count of nodes tracked by the state (");
            sbLIZ.append(this.LLILZLL.LJ);
            sbLIZ.append(") and the children count on the SubcomposeLayout (");
            sbLIZ.append(size);
            sbLIZ.append("). Are you trying to use the state of the disposed SubcomposeLayout?");
            C1696250uF5.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        if ((size - this.LLJILLL) - this.LLJJ < 0) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("Incorrect state. Total children ");
            sbLIZ2.append(size);
            sbLIZ2.append(". Reusable children ");
            sbLIZ2.append(this.LLJILLL);
            sbLIZ2.append(". Precomposed children ");
            sbLIZ2.append(this.LLJJ);
            C1696250uF5.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        }
        if (this.LLJI.LJ != this.LLJJ) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("Incorrect state. Precomposed children ");
            sbLIZ3.append(this.LLJJ);
            sbLIZ3.append(". Map size ");
            sbLIZ3.append(this.LLJI.LJ);
            C1696250uF5.LIZ(C2188811AlT.LIZIZ(sbLIZ3));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x004d  */
    @Override // X.InterfaceC20035413aK
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onRelease() {
        /*
            r17 = this;
            r6 = r17
            X.13dH r9 = r6.LL
            r0 = 1
            r9.LLJJIII = r0
            X.13Kb<X.13dH, X.13ag> r0 = r6.LLILZLL
            java.lang.Object[] r10 = r0.LIZJ
            long[] r8 = r0.LIZ
            int r0 = r8.length
            int r7 = r0 + (-2)
            r5 = 0
            if (r7 < 0) goto L52
            r4 = 0
        L14:
            r2 = r8[r4]
            long r0 = ~r2
            r11 = 7
            long r0 = r0 << r11
            long r0 = r0 & r2
            r12 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r12
            int r11 = (r0 > r12 ? 1 : (r0 == r12 ? 0 : -1))
            if (r11 == 0) goto L4d
            int r0 = r4 - r7
            int r0 = ~r0
            int r0 = r0 >>> 31
            r12 = 8
            int r11 = 8 - r0
            r1 = 0
        L2e:
            if (r1 >= r11) goto L4b
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r2
            r13 = 128(0x80, double:6.3E-322)
            int r0 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r0 >= 0) goto L47
            int r0 = r4 << 3
            int r0 = r0 + r1
            r0 = r10[r0]
            X.13ag r0 = (X.C20037613ag) r0
            X.13aY r0 = r0.LIZJ
            if (r0 == 0) goto L47
            r0.dispose()
        L47:
            long r2 = r2 >> r12
            int r1 = r1 + 1
            goto L2e
        L4b:
            if (r11 != r12) goto L52
        L4d:
            if (r4 == r7) goto L52
            int r4 = r4 + 1
            goto L14
        L52:
            X.13dH r0 = r6.LL
            r0.LJJJJZI()
            r9.LLJJIII = r5
            X.13Kb<X.13dH, X.13ag> r0 = r6.LLILZLL
            r0.LJFF()
            X.13Kb<java.lang.Object, X.13dH> r0 = r6.LLIZ
            r0.LJFF()
            r6.LLJJ = r5
            r6.LLJILLL = r5
            X.13Kb<java.lang.Object, X.13dH> r0 = r6.LLJI
            r0.LJFF()
            r6.LIZIZ()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20037513af.onRelease():void");
    }

    public final void LIZ(int i) {
        Function1<Object, Unit> function1LJ;
        this.LLJILLL = 0;
        List<C20053713dH> listLJJIIZ = this.LL.LJJIIZ();
        int size = (listLJJIIZ.size() - this.LLJJ) - 1;
        if (i <= size) {
            this.LLJIJIL.clear();
            if (i <= size) {
                int i2 = i;
                while (true) {
                    this.LLJIJIL.LL.LIZIZ(this.LLILZLL.LIZLLL((C20053713dH) ListProtector.get(listLJJIIZ, i2)).LIZ);
                    if (i2 == size) {
                        break;
                    } else {
                        i2++;
                    }
                }
            }
            this.LLILLL.LIZIZ(this.LLJIJIL);
            C13YG c13ygLIZ = C13YI.LIZ();
            if (c13ygLIZ != null) {
                function1LJ = c13ygLIZ.LJ();
            } else {
                function1LJ = null;
            }
            C13YG c13ygLIZIZ = C13YI.LIZIZ(c13ygLIZ);
            boolean z = false;
            while (size >= i) {
                try {
                    C20053713dH c20053713dH = listLJJIIZ.get(size);
                    C20037613ag c20037613agLIZLLL = this.LLILZLL.LIZLLL(c20053713dH);
                    Object obj = c20037613agLIZLLL.LIZ;
                    if (this.LLJIJIL.contains(obj)) {
                        this.LLJILLL++;
                        if (((Boolean) ((C13FE) c20037613agLIZLLL.LJFF).getValue()).booleanValue()) {
                            C20054013dK c20054013dK = c20053713dH.LLJLLL;
                            C20053813dI c20053813dI = c20054013dK.LJIILL;
                            EnumC20038113al enumC20038113al = EnumC20038113al.NotUsed;
                            c20053813dI.LLJILJIL = enumC20038113al;
                            C20053613dG c20053613dG = c20054013dK.LJIILLIIL;
                            if (c20053613dG != null) {
                                c20053613dG.LLJI = enumC20038113al;
                            }
                            ((C13FE) c20037613agLIZLLL.LJFF).setValue(Boolean.FALSE);
                            z = true;
                        }
                    } else {
                        C20053713dH c20053713dH2 = this.LL;
                        c20053713dH2.LLJJIII = true;
                        this.LLILZLL.LJIIIZ(c20053713dH);
                        InterfaceC20036813aY interfaceC20036813aY = c20037613agLIZLLL.LIZJ;
                        if (interfaceC20036813aY != null) {
                            interfaceC20036813aY.dispose();
                        }
                        this.LL.LJJJLIIL(size, 1);
                        c20053713dH2.LLJJIII = false;
                    }
                    this.LLIZ.LJIIIZ(obj);
                    size--;
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
                    throw th;
                }
            }
            C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
            if (z) {
                C13YI.LJFF();
            }
        }
        LIZIZ();
    }

    public final void LIZJ(boolean z) {
        Function1<Object, Unit> function1LJ;
        this.LLJJ = 0;
        this.LLJI.LJFF();
        List<C20053713dH> listLJJIIZ = this.LL.LJJIIZ();
        int size = listLJJIIZ.size();
        if (this.LLJILLL != size) {
            this.LLJILLL = size;
            C13YG c13ygLIZ = C13YI.LIZ();
            if (c13ygLIZ != null) {
                function1LJ = c13ygLIZ.LJ();
            } else {
                function1LJ = null;
            }
            C13YG c13ygLIZIZ = C13YI.LIZIZ(c13ygLIZ);
            for (int i = 0; i < size; i++) {
                try {
                    C20053713dH c20053713dH = listLJJIIZ.get(i);
                    C20037613ag c20037613agLIZLLL = this.LLILZLL.LIZLLL(c20053713dH);
                    if (c20037613agLIZLLL != null && ((Boolean) ((C13FE) c20037613agLIZLLL.LJFF).getValue()).booleanValue()) {
                        C20054013dK c20054013dK = c20053713dH.LLJLLL;
                        C20053813dI c20053813dI = c20054013dK.LJIILL;
                        EnumC20038113al enumC20038113al = EnumC20038113al.NotUsed;
                        c20053813dI.LLJILJIL = enumC20038113al;
                        C20053613dG c20053613dG = c20054013dK.LJIILLIIL;
                        if (c20053613dG != null) {
                            c20053613dG.LLJI = enumC20038113al;
                        }
                        if (z) {
                            InterfaceC20036813aY interfaceC20036813aY = c20037613agLIZLLL.LIZJ;
                            if (interfaceC20036813aY != null) {
                                interfaceC20036813aY.deactivate();
                            }
                            c20037613agLIZLLL.LJFF = C20028913Yh.LJI(Boolean.FALSE);
                        } else {
                            ((C13FE) c20037613agLIZLLL.LJFF).setValue(Boolean.FALSE);
                        }
                        c20037613agLIZLLL.LIZ = C1683060tto.LIZ;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
                    throw th;
                }
            }
            C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
            this.LLIZ.LJFF();
        }
        LIZIZ();
    }

    public final C20053713dH LJFF(Object obj) {
        if (this.LLJILLL == 0) {
            return null;
        }
        List<C20053713dH> listLJJIIZ = this.LL.LJJIIZ();
        int size = listLJJIIZ.size() - this.LLJJ;
        int i = size - this.LLJILLL;
        int i2 = size - 1;
        int i3 = i2;
        while (true) {
            if (i3 < i) {
                break;
            }
            if (Intrinsics.LJFF(this.LLILZLL.LIZLLL((C20053713dH) ListProtector.get(listLJJIIZ, i3)).LIZ, obj)) {
                if (i3 == -1) {
                    break;
                }
            } else {
                i3--;
            }
        }
        while (i2 >= i) {
            C20037613ag c20037613agLIZLLL = this.LLILZLL.LIZLLL((C20053713dH) ListProtector.get(listLJJIIZ, i2));
            Object obj2 = c20037613agLIZLLL.LIZ;
            if (obj2 != C1683060tto.LIZ && !this.LLILLL.LIZ(obj, obj2)) {
                i2--;
            } else {
                c20037613agLIZLLL.LIZ = obj;
                i3 = i2;
                if (i3 == -1) {
                    return null;
                }
                if (i3 != i) {
                    C20053713dH c20053713dH = this.LL;
                    c20053713dH.LLJJIII = true;
                    c20053713dH.LJJJJLI(i3, i, 1);
                    c20053713dH.LLJJIII = false;
                }
                this.LLJILLL--;
                C20053713dH c20053713dH2 = (C20053713dH) ListProtector.get(listLJJIIZ, i);
                C20037613ag c20037613agLIZLLL2 = this.LLILZLL.LIZLLL(c20053713dH2);
                c20037613agLIZLLL2.LJFF = C20028913Yh.LJI(Boolean.TRUE);
                c20037613agLIZLLL2.LJ = true;
                c20037613agLIZLLL2.LIZLLL = true;
                return c20053713dH2;
            }
        }
        return null;
    }

    public C20037513af(C20053713dH c20053713dH, InterfaceC20029813Yq interfaceC20029813Yq) {
        this.LL = c20053713dH;
        this.LLILLL = interfaceC20029813Yq;
    }

    public final InterfaceC20044613bo LIZLLL(final Object obj, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        if (!this.LL.LIZLLL()) {
            return new InterfaceC20044613bo() { // from class: X.13ai
                @Override // X.InterfaceC20044613bo
                public final /* synthetic */ int LIZIZ() {
                    return 0;
                }

                @Override // X.InterfaceC20044613bo
                public final /* synthetic */ void LIZJ(AwS609S0100000_30 awS609S0100000_30) {
                }

                @Override // X.InterfaceC20044613bo
                public final /* synthetic */ void LIZLLL(int i, long j) {
                }

                @Override // X.InterfaceC20044613bo
                public final void dispose() {
                }
            };
        }
        LIZIZ();
        if (!this.LLIZ.LIZIZ(obj)) {
            this.LLJILJIL.LJIIIZ(obj);
            C19991913Kb<Object, C20053713dH> c19991913Kb = this.LLJI;
            C20053713dH c20053713dHLIZLLL = c19991913Kb.LIZLLL(obj);
            if (c20053713dHLIZLLL == null) {
                c20053713dHLIZLLL = LJFF(obj);
                if (c20053713dHLIZLLL != null) {
                    int iIndexOf = this.LL.LJJIIZ().indexOf(c20053713dHLIZLLL);
                    int size = this.LL.LJJIIZ().size();
                    C20053713dH c20053713dH = this.LL;
                    c20053713dH.LLJJIII = true;
                    c20053713dH.LJJJJLI(iIndexOf, size, 1);
                    c20053713dH.LLJJIII = false;
                    this.LLJJ++;
                } else {
                    int size2 = this.LL.LJJIIZ().size();
                    c20053713dHLIZLLL = new C20053713dH(true, 2, 0);
                    C20053713dH c20053713dH2 = this.LL;
                    c20053713dH2.LLJJIII = true;
                    c20053713dH2.LJJJI(size2, c20053713dHLIZLLL);
                    c20053713dH2.LLJJIII = false;
                    this.LLJJ++;
                }
                c19991913Kb.LJIIJJI(obj, c20053713dHLIZLLL);
            }
            LJ(c20053713dHLIZLLL, obj, function2);
        }
        return new InterfaceC20044613bo() { // from class: X.13c6
            @Override // X.InterfaceC20044613bo
            public final int LIZIZ() {
                C20053713dH c20053713dHLIZLLL2 = this.LIZ.LLJI.LIZLLL(obj);
                if (c20053713dHLIZLLL2 != null) {
                    return c20053713dHLIZLLL2.LJJIIJZLJL().size();
                }
                return 0;
            }

            @Override // X.InterfaceC20044613bo
            public final void dispose() {
                this.LIZ.LIZIZ();
                C20053713dH c20053713dHLJIIIZ = this.LIZ.LLJI.LJIIIZ(obj);
                if (c20053713dHLJIIIZ != null) {
                    if (this.LIZ.LLJJ <= 0) {
                        C1696250uF5.LIZIZ("No pre-composed items to dispose");
                    }
                    int iIndexOf2 = this.LIZ.LL.LJJIIZ().indexOf(c20053713dHLJIIIZ);
                    if (iIndexOf2 < this.LIZ.LL.LJJIIZ().size() - this.LIZ.LLJJ) {
                        C1696250uF5.LIZIZ("Item is not in pre-composed item range");
                    }
                    C20037513af c20037513af = this.LIZ;
                    c20037513af.LLJILLL++;
                    c20037513af.LLJJ--;
                    int size3 = c20037513af.LL.LJJIIZ().size();
                    C20037513af c20037513af2 = this.LIZ;
                    int i = (size3 - c20037513af2.LLJJ) - c20037513af2.LLJILLL;
                    C20053713dH c20053713dH3 = c20037513af2.LL;
                    c20053713dH3.LLJJIII = true;
                    c20053713dH3.LJJJJLI(iIndexOf2, i, 1);
                    c20053713dH3.LLJJIII = false;
                    this.LIZ.LIZ(i);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r0v19 */
            /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.internal.AwS609S0100000_30] */
            /* JADX WARN: Type inference failed for: r3v0 */
            /* JADX WARN: Type inference failed for: r3v1 */
            /* JADX WARN: Type inference failed for: r3v10 */
            /* JADX WARN: Type inference failed for: r3v11 */
            /* JADX WARN: Type inference failed for: r3v2 */
            /* JADX WARN: Type inference failed for: r3v3 */
            /* JADX WARN: Type inference failed for: r3v4, types: [X.13Aw] */
            /* JADX WARN: Type inference failed for: r3v6 */
            /* JADX WARN: Type inference failed for: r3v7, types: [X.13Aw] */
            /* JADX WARN: Type inference failed for: r3v8 */
            /* JADX WARN: Type inference failed for: r3v9 */
            /* JADX WARN: Type inference failed for: r9v0 */
            /* JADX WARN: Type inference failed for: r9v1, types: [X.13dY] */
            /* JADX WARN: Type inference failed for: r9v10 */
            /* JADX WARN: Type inference failed for: r9v11 */
            /* JADX WARN: Type inference failed for: r9v2, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r9v3 */
            /* JADX WARN: Type inference failed for: r9v4 */
            /* JADX WARN: Type inference failed for: r9v5 */
            /* JADX WARN: Type inference failed for: r9v6 */
            /* JADX WARN: Type inference failed for: r9v7 */
            /* JADX WARN: Type inference failed for: r9v8, types: [X.13dY] */
            @Override // X.InterfaceC20044613bo
            public final void LIZJ(AwS609S0100000_30 awS609S0100000_30) {
                C20054913dT c20054913dT;
                AbstractC20055413dY abstractC20055413dY;
                Object objInvoke;
                C20053713dH c20053713dHLIZLLL2 = this.LIZ.LLJI.LIZLLL(obj);
                if (c20053713dHLIZLLL2 != null && (c20054913dT = c20053713dHLIZLLL2.LLJLLIL) != null && (abstractC20055413dY = c20054913dT.LJ) != null) {
                    if (!abstractC20055413dY.LL.LLJILLL) {
                        C1696250uF5.LIZIZ("visitSubtreeIf called on an unattached node");
                    }
                    C19968013Aw c19968013Aw = new C19968013Aw(new AbstractC20055413dY[16]);
                    AbstractC20055413dY abstractC20055413dY2 = abstractC20055413dY.LL;
                    AbstractC20055413dY abstractC20055413dY3 = abstractC20055413dY2.LLILZLL;
                    if (abstractC20055413dY3 == null) {
                        C20052513d5.LIZ(c19968013Aw, abstractC20055413dY2);
                    } else {
                        c19968013Aw.LIZLLL(abstractC20055413dY3);
                    }
                    while (true) {
                        int i = c19968013Aw.LLILLL;
                        if (i != 0) {
                            AbstractC20055413dY abstractC20055413dY4 = (AbstractC20055413dY) c19968013Aw.LJIILIIL(i - 1);
                            if ((abstractC20055413dY4.LLILZ & 262144) != 0) {
                                AbstractC20055413dY abstractC20055413dY5 = abstractC20055413dY4;
                                do {
                                    if ((abstractC20055413dY5.LLILLL & 262144) != 0) {
                                        ?? LIZIZ = abstractC20055413dY5;
                                        ?? c19968013Aw2 = 0;
                                        do {
                                            if (LIZIZ instanceof InterfaceC1697480uH4) {
                                                InterfaceC1697480uH4 interfaceC1697480uH4 = (InterfaceC1697480uH4) LIZIZ;
                                                if (Intrinsics.LJFF("androidx.compose.foundation.lazy.layout.TraversablePrefetchStateNode", interfaceC1697480uH4.LJJIJLIJ())) {
                                                    objInvoke = awS609S0100000_30.invoke(interfaceC1697480uH4);
                                                } else {
                                                    objInvoke = EnumC20045413bw.ContinueTraversal;
                                                }
                                                if (objInvoke != EnumC20045413bw.CancelTraversal) {
                                                    if (objInvoke == EnumC20045413bw.SkipSubtreeAndContinueTraversal) {
                                                        break;
                                                    }
                                                } else {
                                                    return;
                                                }
                                            } else if ((LIZIZ.LLILLL & 262144) != 0 && (LIZIZ instanceof AbstractC20055313dX)) {
                                                AbstractC20055413dY abstractC20055413dY6 = ((AbstractC20055313dX) LIZIZ).LLJJI;
                                                int i2 = 0;
                                                c19968013Aw2 = c19968013Aw2;
                                                LIZIZ = LIZIZ;
                                                while (abstractC20055413dY6 != null) {
                                                    if ((abstractC20055413dY6.LLILLL & 262144) != 0) {
                                                        i2++;
                                                        c19968013Aw2 = c19968013Aw2;
                                                        if (i2 == 1) {
                                                            LIZIZ = abstractC20055413dY6;
                                                        } else {
                                                            if (c19968013Aw2 == 0) {
                                                                c19968013Aw2 = new C19968013Aw(new AbstractC20055413dY[16]);
                                                            }
                                                            if (LIZIZ != 0) {
                                                                c19968013Aw2.LIZLLL(LIZIZ);
                                                                LIZIZ = 0;
                                                            }
                                                            c19968013Aw2.LIZLLL(abstractC20055413dY6);
                                                        }
                                                    }
                                                    abstractC20055413dY6 = abstractC20055413dY6.LLILZLL;
                                                    c19968013Aw2 = c19968013Aw2;
                                                    LIZIZ = LIZIZ;
                                                }
                                                if (i2 == 1) {
                                                }
                                            }
                                            LIZIZ = C20052513d5.LIZIZ(c19968013Aw2);
                                        } while (LIZIZ != 0);
                                    }
                                    abstractC20055413dY5 = abstractC20055413dY5.LLILZLL;
                                } while (abstractC20055413dY5 != null);
                            }
                            C20052513d5.LIZ(c19968013Aw, abstractC20055413dY4);
                        } else {
                            return;
                        }
                    }
                }
            }

            @Override // X.InterfaceC20044613bo
            public final void LIZLLL(int i, long j) {
                C20053713dH c20053713dHLIZLLL2 = this.LIZ.LLJI.LIZLLL(obj);
                if (c20053713dHLIZLLL2 != null && c20053713dHLIZLLL2.LIZLLL()) {
                    int size3 = c20053713dHLIZLLL2.LJJIIJZLJL().size();
                    if (i < 0 || i >= size3) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("Index (");
                        sbLIZ.append(i);
                        sbLIZ.append(") is out of bound of [0, ");
                        sbLIZ.append(size3);
                        sbLIZ.append(')');
                        C1696250uF5.LIZLLL(C2188811AlT.LIZIZ(sbLIZ));
                    }
                    if (!(!c20053713dHLIZLLL2.LJIJJ())) {
                        C1696250uF5.LIZ("Pre-measure called on node that is not placed");
                    }
                    C20053713dH c20053713dH3 = this.LIZ.LL;
                    c20053713dH3.LLJJIII = true;
                    C1696120uEs.LIZ(c20053713dHLIZLLL2).LJIIIIZZ((C20053713dH) ListProtector.get(c20053713dHLIZLLL2.LJJIIJZLJL(), i), j);
                    c20053713dH3.LLJJIII = false;
                }
            }
        };
    }

    public final void LJ(C20053713dH c20053713dH, Object obj, Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function2) {
        boolean zLJIIL;
        Function1<Object, Unit> function1LJ;
        C19991913Kb<C20053713dH, C20037613ag> c19991913Kb = this.LLILZLL;
        C20037613ag c20037613agLIZLLL = c19991913Kb.LIZLLL(c20053713dH);
        if (c20037613agLIZLLL == null) {
            c20037613agLIZLLL = new C20037613ag(obj, C20037013aa.LIZ);
            c19991913Kb.LJIIJJI(c20053713dH, c20037613agLIZLLL);
        }
        C20037613ag c20037613ag = c20037613agLIZLLL;
        InterfaceC20036813aY interfaceC20036813aY = c20037613ag.LIZJ;
        if (interfaceC20036813aY != null) {
            zLJIIL = interfaceC20036813aY.LJIIL();
        } else {
            zLJIIL = true;
        }
        if (c20037613ag.LIZIZ != function2 || zLJIIL || c20037613ag.LIZLLL) {
            c20037613ag.LIZIZ = function2;
            C13YG c13ygLIZ = C13YI.LIZ();
            if (c13ygLIZ != null) {
                function1LJ = c13ygLIZ.LJ();
            } else {
                function1LJ = null;
            }
            C13YG c13ygLIZIZ = C13YI.LIZIZ(c13ygLIZ);
            try {
                C20053713dH c20053713dH2 = this.LL;
                c20053713dH2.LLJJIII = true;
                Function2<? super InterfaceC1680500tpg, ? super Integer, Unit> function22 = c20037613ag.LIZIZ;
                InterfaceC20036813aY c20029913Yr = c20037613ag.LIZJ;
                C13Z1 c13z1 = this.LLILLJJLI;
                if (c13z1 != null) {
                    boolean z = c20037613ag.LJ;
                    C19719212De c19719212De = new C19719212De(-1750409193, new AwS460S0200000_25(c20037613ag, (C20037613ag) function22, (Function2<? super InterfaceC1680500tpg, ? super Integer, Unit>) 27), true);
                    if (c20029913Yr == null || c20029913Yr.isDisposed()) {
                        ViewGroup.LayoutParams layoutParams = C20037313ad.LIZ;
                        c20029913Yr = new C20029913Yr(c13z1, new C20037713ah(c20053713dH));
                    }
                    if (!z) {
                        c20029913Yr.LJIILJJIL(c19719212De);
                    } else {
                        c20029913Yr.LIZ(c19719212De);
                    }
                    c20037613ag.LIZJ = c20029913Yr;
                    c20037613ag.LJ = false;
                    c20053713dH2.LLJJIII = false;
                    C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
                    c20037613ag.LIZLLL = false;
                    return;
                }
                C1696250uF5.LIZJ("parent composition reference not set");
                throw new C2197108jB();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C13YI.LJ(c13ygLIZ, c13ygLIZIZ, function1LJ);
                throw th;
            }
        }
    }
}
