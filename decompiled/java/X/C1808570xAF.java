package X;

import android.os.Build;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0xAF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1808570xAF implements InterfaceC497601wk, InterfaceC1502705uT {
    public final int LL = 3;
    public final int LLILLJJLI = 3;
    public final C1DFH LLILLL = C0PEM.LIZ;
    public final C2252321DDq LLILZ;
    public final AnonymousClass0951 LLILZIL;
    public final C2252321DDq LLILZLL;
    public final AnonymousClass0951 LLIZ;
    public final AnonymousClass0951 LLIZLLLIL;
    public final int LLJ;
    public final C1DEV LLJI;

    public final void LJFF() {
        LinkedList linkedList = new LinkedList((Collection) this.LLILZIL.getValue());
        LinkedList linkedList2 = new LinkedList((Collection) this.LLIZ.getValue());
        while (linkedList.size() < this.LL && (!linkedList2.isEmpty())) {
            C1808590xAH c1808590xAH = (C1808590xAH) linkedList2.remove();
            this.LLILZLL.setValue(C13LP.LLIIII(linkedList2));
            if (c1808590xAH.LIZJ > System.currentTimeMillis()) {
                linkedList.add(c1808590xAH);
                this.LLILZ.setValue(C13LP.LLIIII(linkedList));
                C23250099c.LIZLLL(this, null, null, new C1808550xAD(c1808590xAH.LIZJ - System.currentTimeMillis(), this, null), 3);
            }
        }
    }

    public C1808570xAF() {
        C13BV c13bv = C13BV.INSTANCE;
        C2252321DDq c2252321DDqLIZ = C1BNE.LIZ(c13bv);
        this.LLILZ = c2252321DDqLIZ;
        AnonymousClass0951 anonymousClass0951LIZIZ = C09IC.LIZIZ(c2252321DDqLIZ);
        this.LLILZIL = anonymousClass0951LIZIZ;
        C2252321DDq c2252321DDqLIZ2 = C1BNE.LIZ(c13bv);
        this.LLILZLL = c2252321DDqLIZ2;
        AnonymousClass0951 anonymousClass0951LIZIZ2 = C09IC.LIZIZ(c2252321DDqLIZ2);
        this.LLIZ = anonymousClass0951LIZIZ2;
        C414301jJ c414301jJ = new C414301jJ(anonymousClass0951LIZIZ, anonymousClass0951LIZIZ2, new C343301Ux(null));
        C05YW.LIZ.getClass();
        this.LLIZLLLIL = C09IC.LJJIJIL(c414301jJ, this, C1370905Yd.LIZJ, 0);
        this.LLJ = 6;
        this.LLJI = C2191201ApK.LIZ();
    }

    @Override // X.InterfaceC1515605wY
    public final C05YD<List<C1808590xAH>> LIZIZ() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1515605wY
    public final C05YD<Integer> LIZJ() {
        return this.LLIZLLLIL;
    }

    @Override // X.InterfaceC1515605wY
    public final int LIZLLL() {
        return this.LLJ;
    }

    @Override // X.InterfaceC497601wk
    public final CoroutineContext getCoroutineContext() {
        return this.LLILLL;
    }

    public static boolean LJI(LinkedList linkedList, final Function1 function1) {
        if (Build.VERSION.SDK_INT >= 24) {
            return linkedList.removeIf(new Predicate() { // from class: X.0xAI
                @Override // java.util.function.Predicate
                public final /* synthetic */ boolean test(Object obj) {
                    return ((Boolean) function1.invoke(obj)).booleanValue();
                }
            });
        }
        Iterator it2 = linkedList.iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (((Boolean) function1.invoke(it2.next())).booleanValue()) {
                it2.remove();
                z = true;
            }
        }
        return z;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    @Override // X.InterfaceC1503505ub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJ(X.C1504405uk r15, X.InterfaceC1364105Vn<? super kotlin.Unit> r16) {
        /*
            Method dump skipped, instruction units count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1808570xAF.LJ(X.05uk, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x008a  */
    @Override // X.InterfaceC1503505ub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZ(long r7, java.lang.String r9, X.InterfaceC1364105Vn r10) {
        /*
            r6 = this;
            boolean r0 = r10 instanceof X.C1808580xAG
            if (r0 == 0) goto L8a
            r5 = r10
            X.0xAG r5 = (X.C1808580xAG) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L8a
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r4 = r5.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r2 = 0
            r1 = 1
            if (r0 == 0) goto L78
            if (r0 != r1) goto L90
            long r7 = r5.LLILLJJLI
            java.lang.Object r9 = r5.LL
            java.lang.String r9 = (java.lang.String) r9
            X.C155000ia.LIZIZ(r4)
        L29:
            java.util.LinkedList r4 = new java.util.LinkedList
            X.0951 r0 = r6.LLILZIL
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r4.<init>(r0)
            java.util.LinkedList r3 = new java.util.LinkedList
            X.0951 r0 = r6.LLIZ
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            r3.<init>(r0)
            kotlin.jvm.internal.AwS8S1000100_27 r1 = new kotlin.jvm.internal.AwS8S1000100_27
            r0 = 1
            r1.<init>(r9, r7, r0)
            boolean r0 = LJI(r4, r1)
            if (r0 == 0) goto L58
            X.1DDq r1 = r6.LLILZ
            java.util.List r0 = X.C13LP.LLIIII(r4)
            r1.setValue(r0)
        L58:
            kotlin.jvm.internal.AwS8S1000100_27 r1 = new kotlin.jvm.internal.AwS8S1000100_27
            r0 = 2
            r1.<init>(r9, r7, r0)
            boolean r0 = LJI(r3, r1)
            if (r0 == 0) goto L6d
            X.1DDq r1 = r6.LLILZLL
            java.util.List r0 = X.C13LP.LLIIII(r3)
            r1.setValue(r0)
        L6d:
            r6.LJFF()
            X.1DEV r0 = r6.LLJI
            r0.LIZIZ(r2)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L78:
            X.C155000ia.LIZIZ(r4)
            X.1DEV r0 = r6.LLJI
            r5.LL = r9
            r5.LLILLJJLI = r7
            r5.LLILZIL = r1
            java.lang.Object r0 = r0.LIZLLL(r2, r5)
            if (r0 != r3) goto L29
            return r3
        L8a:
            X.0xAG r5 = new X.0xAG
            r5.<init>(r6, r10)
            goto L12
        L90:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1808570xAF.LIZ(long, java.lang.String, X.05Vn):java.lang.Object");
    }
}
