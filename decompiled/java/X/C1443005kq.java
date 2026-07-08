package X;

import Y.AComparatorS21S0000000_2;
import Y.AComparatorS501S0100000_2;
import Y.AObjectS346S0100000_2;
import Y.AObjectS378S0100000_2;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.05kq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1443005kq implements InterfaceC1443705kx {
    public final InterfaceC1443305kt LIZ;
    public final Function0<Set<String>> LIZIZ;
    public final InterfaceC497601wk LIZJ;

    public final C1178104jD LIZIZ(InterfaceC1444205l2 interfaceC1444205l2) {
        List arrayList;
        List<InterfaceC1444205l2> listLIZ = interfaceC1444205l2.LIZ();
        ArrayList arrayList2 = new ArrayList();
        for (InterfaceC1444205l2 interfaceC1444205l22 : listLIZ) {
            if (interfaceC1444205l22.LJ().LJFF()) {
                arrayList2.add(interfaceC1444205l22);
            }
        }
        if (!arrayList2.isEmpty()) {
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                arrayList3.add(LIZIZ((InterfaceC1444205l2) it2.next()));
            }
            arrayList = new ArrayList();
            Iterator it3 = arrayList3.iterator();
            while (it3.hasNext()) {
                C19719612Di.LJJI(((C1178104jD) it3.next()).LIZIZ, arrayList);
            }
        } else {
            arrayList = C13BV.INSTANCE;
        }
        return LIZLLL(interfaceC1444205l2, arrayList);
    }

    public static InterfaceC1444205l2 LJ(InterfaceC1444205l2 interfaceC1444205l2, String str) {
        if (Intrinsics.LJFF(interfaceC1444205l2.getIdentifier(), str)) {
            return interfaceC1444205l2;
        }
        Iterator<InterfaceC1444205l2> it2 = interfaceC1444205l2.LIZ().iterator();
        while (it2.hasNext()) {
            InterfaceC1444205l2 interfaceC1444205l2LJ = LJ(it2.next(), str);
            if (interfaceC1444205l2LJ != null) {
                return interfaceC1444205l2LJ;
            }
        }
        return null;
    }

    public static C1178104jD LJFF(InterfaceC1444205l2 interfaceC1444205l2, List list) {
        if (list.isEmpty()) {
            return null;
        }
        List<InterfaceC1444205l2> listLIZ = interfaceC1444205l2.LIZ();
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLIZ, 10));
        Iterator<InterfaceC1444205l2> it2 = listLIZ.iterator();
        while (it2.hasNext()) {
            arrayList.add(LJFF(it2.next(), list));
        }
        InterfaceC1443605kw result = interfaceC1444205l2.getResult();
        if (result == null) {
            return null;
        }
        List listLJLI = C13LP.LJLI(result.LIZ(), C13LP.LLIIJI(list));
        interfaceC1444205l2.LJIJ(new C1177304j5(result.LIZIZ(), listLJLI));
        return new C1178104jD(result.LIZIZ(), listLJLI, new C1443205ks(list));
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.InterfaceC1444205l2 r8, X.InterfaceC1364105Vn<? super X.C1178104jD> r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof X.C1442805ko
            if (r0 == 0) goto L72
            r5 = r9
            X.05ko r5 = (X.C1442805ko) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L72
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLJJLI
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 1
            if (r0 == 0) goto L2b
            if (r0 != r4) goto L78
            X.05l2 r8 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L24:
            java.util.List r1 = (java.util.List) r1
        L26:
            X.04jD r0 = r7.LIZLLL(r8, r1)
            return r0
        L2b:
            X.C155000ia.LIZIZ(r1)
            java.util.List r0 = r8.LIZ()
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r2 = r0.iterator()
        L3b:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto L56
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.05l3 r0 = (X.InterfaceC1444305l3) r0
            X.050o r0 = r0.LJ()
            boolean r0 = r0.LJFF()
            if (r0 == 0) goto L3b
            r3.add(r1)
            goto L3b
        L56:
            boolean r0 = r3.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L6f
            X.05kj r1 = new X.05kj
            r0 = 0
            r1.<init>(r3, r7, r0)
            r5.LL = r8
            r5.LLILZ = r4
            java.lang.Object r1 = X.C2296808zG.LJ(r1, r5)
            if (r1 != r6) goto L24
            return r6
        L6f:
            X.13BV r1 = X.C13BV.INSTANCE
            goto L26
        L72:
            X.05ko r5 = new X.05ko
            r5.<init>(r7, r9)
            goto L12
        L78:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1443005kq.LIZJ(X.05l2, X.05Vn):java.lang.Object");
    }

    public final C1178104jD LIZLLL(InterfaceC1444205l2 interfaceC1444205l2, List list) {
        List listLJLIL;
        List listLJLILLLLZI;
        List<? extends InterfaceC1444205l2> listLJLLLL;
        InterfaceC1443505kv interfaceC1443505kvLIZIZ = interfaceC1444205l2.LIZIZ();
        if (!(!list.isEmpty()) && !interfaceC1444205l2.LJIILL()) {
            listLJLIL = C13BV.INSTANCE;
        } else {
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                InterfaceC1444205l2 interfaceC1444205l2LJ = LJ(interfaceC1444205l2, (String) it2.next());
                if (interfaceC1444205l2LJ != null) {
                    arrayList.add(interfaceC1444205l2LJ);
                }
            }
            listLJLIL = arrayList;
            if (interfaceC1444205l2.LJIILL()) {
                Set<String> setInvoke = this.LIZIZ.invoke();
                Set setLLIIJI = C13LP.LLIIJI(list);
                List<InterfaceC1444205l2> listLIZ = interfaceC1444205l2.LIZ();
                ArrayList arrayList2 = new ArrayList();
                for (InterfaceC1444205l2 interfaceC1444205l22 : listLIZ) {
                    InterfaceC1444205l2 interfaceC1444205l23 = interfaceC1444205l22;
                    if (setInvoke.contains(interfaceC1444205l23.getIdentifier()) && !setLLIIJI.contains(interfaceC1444205l23.getIdentifier())) {
                        Boolean boolLJ = interfaceC1444205l23.LJ().LJ("active");
                        Boolean bool = Boolean.FALSE;
                        if (!Intrinsics.LJFF(boolLJ, bool) && !Intrinsics.LJFF(interfaceC1444205l23.LJ().LJ("density"), bool)) {
                            arrayList2.add(interfaceC1444205l22);
                        }
                    }
                }
                listLJLIL = C13LP.LJLIL(arrayList2, arrayList);
            }
        }
        if (interfaceC1443505kvLIZIZ != null && (true ^ listLJLIL.isEmpty())) {
            if (interfaceC1444205l2.LJIILL()) {
                listLJLLLL = C13LP.LJLLLL(new AComparatorS501S0100000_2(this.LIZIZ.invoke(), 4), listLJLIL);
            } else {
                listLJLLLL = C13LP.LJLLLL(new AComparatorS21S0000000_2(13), listLJLIL);
            }
            C1177404j6 c1177404j6LIZ = this.LIZ.LIZ(interfaceC1443505kvLIZIZ, listLJLLLL);
            interfaceC1444205l2.LJIJ(new C1177304j5(c1177404j6LIZ.LIZ, c1177404j6LIZ.LIZIZ));
            listLJLILLLLZI = c1177404j6LIZ.LIZIZ;
        } else {
            listLJLILLLLZI = list;
        }
        if (interfaceC1444205l2.getNodeType() != EnumC1450305m1.BY_PASS) {
            if (listLJLILLLLZI.isEmpty()) {
                listLJLILLLLZI = Collections.singletonList(interfaceC1444205l2.getIdentifier());
            } else {
                listLJLILLLLZI = C13LP.LJLILLLLZI(interfaceC1444205l2.getIdentifier(), listLJLILLLLZI);
            }
        }
        if (list.isEmpty()) {
            list = Collections.singletonList(interfaceC1444205l2.getIdentifier());
        }
        return new C1178104jD(list, listLJLILLLLZI, C1443805ky.LIZ);
    }

    public C1443005kq(C1443405ku c1443405ku, AObjectS378S0100000_2 aObjectS378S0100000_2, C054G c054g) {
        this.LIZ = c1443405ku;
        this.LIZIZ = aObjectS378S0100000_2;
        this.LIZJ = c054g;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LJI(X.InterfaceC1444205l2 r7, java.util.List<java.lang.String> r8, X.InterfaceC1364105Vn<? super X.C1178104jD> r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof X.C1442905kp
            if (r0 == 0) goto L4c
            r5 = r9
            X.05kp r5 = (X.C1442905kp) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L4c
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r4 = r5.LLILLL
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r2 = 1
            r1 = 0
            if (r0 == 0) goto L30
            if (r0 != r2) goto L79
            java.lang.Object r8 = r5.LLILLJJLI
            java.util.List r8 = (java.util.List) r8
            X.05l2 r7 = r5.LL
            X.C155000ia.LIZIZ(r4)
        L29:
            X.05kw r4 = r7.getResult()
            if (r4 != 0) goto L52
            return r1
        L30:
            X.C155000ia.LIZIZ(r4)
            boolean r0 = r8.isEmpty()
            if (r0 == 0) goto L3a
            return r1
        L3a:
            X.05kn r0 = new X.05kn
            r0.<init>(r6, r7, r8, r1)
            r5.LL = r7
            r5.LLILLJJLI = r8
            r5.LLILZIL = r2
            java.lang.Object r0 = X.C2296808zG.LJ(r0, r5)
            if (r0 != r3) goto L29
            return r3
        L4c:
            X.05kp r5 = new X.05kp
            r5.<init>(r6, r9)
            goto L12
        L52:
            java.util.List r1 = r4.LIZ()
            java.util.Set r0 = X.C13LP.LLIIJI(r8)
            java.util.List r3 = X.C13LP.LJLI(r1, r0)
            X.04j5 r1 = new X.04j5
            java.util.List r0 = r4.LIZIZ()
            r1.<init>(r0, r3)
            r7.LJIJ(r1)
            X.04jD r2 = new X.04jD
            java.util.List r1 = r4.LIZIZ()
            X.05ks r0 = new X.05ks
            r0.<init>(r8)
            r2.<init>(r1, r3, r0)
            return r2
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1443005kq.LJI(X.05l2, java.util.List, X.05Vn):java.lang.Object");
    }

    @Override // X.InterfaceC1443705kx
    public final void LIZ(InterfaceC1444205l2 interfaceC1444205l2, AbstractC1443905kz abstractC1443905kz, boolean z, AObjectS346S0100000_2 aObjectS346S0100000_2) {
        C1178104jD c1178104jDLJFF;
        if (z) {
            C23250099c.LIZLLL(this.LIZJ, null, null, new C1442505kl(abstractC1443905kz, this, interfaceC1444205l2, aObjectS346S0100000_2, null), 3);
            return;
        }
        try {
            if (abstractC1443905kz instanceof C1443805ky) {
                c1178104jDLJFF = LIZIZ(interfaceC1444205l2);
            } else if (abstractC1443905kz instanceof C1443205ks) {
                c1178104jDLJFF = LJFF(interfaceC1444205l2, ((C1443205ks) abstractC1443905kz).LIZ);
            } else {
                throw new C1954807lC();
            }
            aObjectS346S0100000_2.invoke(c1178104jDLJFF);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            aObjectS346S0100000_2.invoke(null);
        }
    }
}
