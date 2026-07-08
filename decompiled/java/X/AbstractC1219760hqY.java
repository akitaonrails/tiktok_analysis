package X;

import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0hqY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public abstract class AbstractC1219760hqY extends AbstractC19526011aM {
    @Override // X.AbstractC19526011aM
    public Object LJIJI(InterfaceC19526511aR interfaceC19526511aR, List<? extends InterfaceC19526611aS> list, List<? extends InterfaceC19526611aS> list2, InterfaceC1364105Vn<? super String> interfaceC1364105Vn) {
        return LJJIJIIJIL(this, interfaceC19526511aR, list, list2, interfaceC1364105Vn);
    }

    public abstract Object LJJIJIL(InterfaceC19526511aR interfaceC19526511aR, InterfaceC19526611aS interfaceC19526611aS, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn);

    public abstract Object LJJIJL(List list);

    /* JADX WARN: Removed duplicated region for block: B:31:0x0075  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object LJJIJIIJIL(X.AbstractC1219760hqY r7, X.InterfaceC19526511aR r8, java.util.List<? extends X.InterfaceC19526611aS> r9, java.util.List<? extends X.InterfaceC19526611aS> r10, X.InterfaceC1364105Vn<? super java.lang.String> r11) throws java.lang.Throwable {
        /*
            boolean r0 = r11 instanceof X.C1219750hqX
            if (r0 == 0) goto L75
            r5 = r11
            X.0hqX r5 = (X.C1219750hqX) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L75
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r2 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r1 = r5.LLILZIL
            r4 = 2
            r0 = 1
            r3 = 0
            if (r1 == 0) goto L27
            if (r1 == r0) goto L5f
            if (r1 != r4) goto L7b
            X.C155000ia.LIZIZ(r2)
        L26:
            return r2
        L27:
            X.C155000ia.LIZIZ(r2)
            X.0hqV r2 = new X.0hqV
            r2.<init>(r9, r7, r8, r3)
            r5.LL = r7
            r5.LLILLJJLI = r10
            r5.LLILZIL = r0
            int r1 = r7.LJFF
            if (r1 == r0) goto L5c
            if (r1 == r4) goto L59
            r0 = 3
            if (r1 == r0) goto L54
            X.1DFH r1 = X.C0PEM.LIZ
        L40:
            X.01LV r0 = new X.01LV
            r0.<init>(r2, r3)
            java.lang.Object r1 = X.C23250099c.LJI(r5, r1, r0)
            java.lang.Object r0 = X.C099R.LJFF()
            if (r1 == r0) goto L51
            kotlin.Unit r1 = kotlin.Unit.LIZ
        L51:
            if (r1 != r6) goto L68
            return r6
        L54:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r1 = X.C2107308Nj.LIZ
            goto L40
        L59:
            X.1DFH r1 = X.C0PEM.LIZ
            goto L40
        L5c:
            X.1DFB r1 = X.C0PEM.LIZJ
            goto L40
        L5f:
            java.lang.Object r10 = r5.LLILLJJLI
            java.util.List r10 = (java.util.List) r10
            X.0hqY r7 = r5.LL
            X.C155000ia.LIZIZ(r2)
        L68:
            r5.LL = r3
            r5.LLILLJJLI = r3
            r5.LLILZIL = r4
            java.lang.Object r2 = r7.LJJIJL(r10)
            if (r2 != r6) goto L26
            return r6
        L75:
            X.0hqX r5 = new X.0hqX
            r5.<init>(r7, r11)
            goto L12
        L7b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC1219760hqY.LJJIJIIJIL(X.0hqY, X.11aR, java.util.List, java.util.List, X.05Vn):java.lang.Object");
    }
}
