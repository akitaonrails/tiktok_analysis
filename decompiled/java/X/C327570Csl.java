package X;

import android.text.TextPaint;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwnerKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS405S0200000_4;
import kotlin.jvm.internal.AwS583S0100000_4;

/* JADX INFO: renamed from: X.0Csl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C327570Csl extends C327620Csq {
    public final C0CVI LJIILL;
    public final float LJIILLIIL;
    public final Function1<? super C327630Csr, Unit> LJIIZILJ;
    public final Function0<Unit> LJIJ;
    public final LifecycleOwner LJIJI;
    public List<C327610Csp> LJIJJ;
    public final int LJIJJLI;

    @Override // X.C327620Csq
    public final void LIZIZ() {
        C23250099c.LIZLLL(LifecycleOwnerKt.getLifecycleScope(this.LJIJI), C0PEM.LIZ, null, new C327520Csg(this, null), 2);
    }

    @Override // X.C327620Csq
    public final Function1<C327630Csr, Unit> LIZJ() {
        return this.LJIIZILJ;
    }

    @Override // X.C327620Csq
    public final Function0<Unit> LJ() {
        return this.LJIJ;
    }

    @Override // X.C327620Csq
    public final LifecycleOwner LJFF() {
        return this.LJIJI;
    }

    @Override // X.C327620Csq
    public final float LJI() {
        return this.LJIILLIIL;
    }

    @Override // X.C327620Csq
    public final C0CVI LJII() {
        return this.LJIILL;
    }

    @Override // X.C327620Csq
    public final void LJIIJ(AbstractC327690Csx abstractC327690Csx) {
        this.LJIIIZ = abstractC327690Csx;
    }

    @Override // X.C327620Csq
    public final Object LIZ(C327630Csr c327630Csr, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        C327610Csp c327610Csp;
        C327610Csp c327610Csp2;
        ArrayList arrayList = new ArrayList();
        Iterator<C327610Csp> it2 = this.LJIJJ.iterator();
        while (true) {
            c327610Csp = null;
            if (!it2.hasNext()) {
                break;
            }
            C327610Csp next = it2.next();
            long j = c327630Csr.LLILLL;
            next.getClass();
            ArrayList arrayList2 = new ArrayList();
            for (C327630Csr c327630Csr2 : next.LJIIIZ) {
                if (c327630Csr2.LLILLL != j) {
                    arrayList2.add(c327630Csr2);
                }
            }
            if (!arrayList2.isEmpty()) {
                if (arrayList2.size() == next.LJIIIZ.size()) {
                    c327610Csp2 = next;
                } else {
                    C1085640eME<C327610Csp> c1085640eME = next.LIZ;
                    if (c1085640eME == null || (c327610Csp2 = c1085640eME.LIZIZ()) == null) {
                        c327610Csp2 = new C327610Csp(next.LIZ);
                        c327610Csp2.LIZIZ = next.LIZIZ;
                        c327610Csp2.LIZJ = next.LIZJ;
                        c327610Csp2.LIZLLL = next.LIZLLL;
                        c327610Csp2.LJ = next.LJ;
                        c327610Csp2.LJFF = next.LJFF;
                        c327610Csp2.LJI = next.LJI;
                        c327610Csp2.LJII = next.LJII;
                        c327610Csp2.LJIIIIZZ = next.LJIIIIZZ;
                        c327610Csp2.LJIIIZ = new CopyOnWriteArrayList<>(next.LJIIIZ);
                    }
                    c327610Csp2.LJIIIIZZ = true;
                    c327610Csp2.LJIIIZ = new CopyOnWriteArrayList<>(arrayList2);
                }
                arrayList.add(c327610Csp2);
            }
        }
        if (arrayList.size() > this.LIZJ) {
            while (arrayList.size() > this.LJIJJLI) {
                C19719612Di.LJJIIZ(arrayList);
            }
        }
        if (!arrayList.isEmpty()) {
            c327610Csp = (C327610Csp) C13LP.LJJLIIIJJI(arrayList);
        }
        Object objLJIIJJI = LJIIJJI(c327630Csr, c327610Csp, arrayList, interfaceC1364105Vn);
        if (objLJIIJJI == C099R.LJFF()) {
            return objLJIIJJI;
        }
        return Unit.LIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJIIJJI(X.C327630Csr r13, X.C327610Csp r14, java.util.List<X.C327610Csp> r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            r12 = this;
            r3 = r16
            boolean r0 = r3 instanceof X.C327560Csk
            r6 = r12
            if (r0 == 0) goto L87
            r4 = r3
            X.0Csk r4 = (X.C327560Csk) r4
            int r2 = r4.LLILZLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L87
            int r2 = r2 - r1
            r4.LLILZLL = r2
        L15:
            java.lang.Object r1 = r4.LLILZ
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r4.LLILZLL
            r2 = 1
            r11 = 0
            if (r0 == 0) goto L66
            if (r0 != r2) goto Lae
            java.lang.Object r15 = r4.LLILLL
            java.util.List r15 = (java.util.List) r15
            X.0Csp r14 = r4.LLILLJJLI
            X.0Csr r13 = r4.LL
            X.C155000ia.LIZIZ(r1)
        L2e:
            float r0 = r6.LJIILLIIL
            java.util.List r10 = r6.LJIIIZ(r13, r14, r0, r2)
            r15.addAll(r10)
            X.00cf r8 = new X.00cf
            r8.<init>()
            int r0 = r15.size()
            int r9 = r0 + (-1)
            java.util.Iterator r5 = r15.iterator()
            r4 = 0
            r3 = 0
        L48:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L91
            java.lang.Object r2 = r5.next()
            int r1 = r3 + 1
            if (r3 < 0) goto L8d
            X.0Csp r2 = (X.C327610Csp) r2
            boolean r0 = r2.LJIIIIZZ
            if (r0 == 0) goto L62
            int r0 = r8.element
            if (r0 <= r3) goto L62
            r8.element = r3
        L62:
            r2.LJIIIIZZ = r4
            r3 = r1
            goto L48
        L66:
            X.C155000ia.LIZIZ(r1)
            boolean r0 = r6.LJIIIIZZ
            if (r0 != 0) goto L2e
            r6.LJIIIIZZ = r2
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0Csh r0 = new X.0Csh
            r0.<init>(r6, r11)
            r4.LL = r13
            r4.LLILLJJLI = r14
            r4.LLILLL = r15
            r4.LLILZLL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r4, r1, r0)
            if (r0 != r3) goto L2e
            return r3
        L87:
            X.0Csk r4 = new X.0Csk
            r4.<init>(r6, r3)
            goto L15
        L8d:
            X.C1697810uHb.LJIJI()
            throw r11
        L91:
            r6.LJIJJ = r15
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>(r15)
            androidx.lifecycle.LifecycleOwner r0 = r6.LJIJI
            androidx.lifecycle.LifecycleCoroutineScope r2 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r0)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            X.0Csj r5 = new X.0Csj
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r0 = 2
            X.C23250099c.LIZLLL(r2, r1, r11, r5, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        Lae:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327570Csl.LJIIJJI(X.0Csr, X.0Csp, java.util.List, X.05Vn):java.lang.Object");
    }

    public C327570Csl(C0CVI c0cvi, TextPaint textPaint, float f, AwS583S0100000_4 awS583S0100000_4, AwS405S0200000_4 awS405S0200000_4, LifecycleOwner lifecycleOwner) {
        super(c0cvi, textPaint, 30, f, awS583S0100000_4, awS405S0200000_4, lifecycleOwner);
        this.LJIILL = c0cvi;
        this.LJIILLIIL = f;
        this.LJIIZILJ = awS583S0100000_4;
        this.LJIJ = awS405S0200000_4;
        this.LJIJI = lifecycleOwner;
        this.LJIJJ = new ArrayList();
        this.LJIJJLI = 10;
    }
}
