package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.05Vl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1363905Vl {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0068  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0065 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZ(X.C05ZT r7, X.EnumC20065813fE r8, X.InterfaceC1364105Vn<? super kotlin.Unit> r9) {
        /*
            boolean r0 = r9 instanceof X.C1364005Vm
            if (r0 == 0) goto L68
            r5 = r9
            X.05Vm r5 = (X.C1364005Vm) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L68
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r1 = r5.LLILLL
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r4 = 1
            if (r0 == 0) goto L3e
            if (r0 != r4) goto L6e
            X.13fE r8 = r5.LLILLJJLI
            X.05ZT r7 = r5.LL
            X.C155000ia.LIZIZ(r1)
        L26:
            X.13fT r1 = (X.C20067313fT) r1
            java.util.List<X.13fO> r3 = r1.LIZ
            int r2 = r3.size()
            r1 = 0
        L2f:
            if (r1 >= r2) goto L76
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            X.13fO r0 = (X.C20066813fO) r0
            boolean r0 = r0.LIZLLL
            if (r0 != 0) goto L5b
            int r1 = r1 + 1
            goto L2f
        L3e:
            X.C155000ia.LIZIZ(r1)
            X.13fT r0 = r7.LJJJJJL()
            java.util.List<X.13fO> r3 = r0.LIZ
            int r2 = r3.size()
            r1 = 0
        L4c:
            if (r1 >= r2) goto L76
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r3, r1)
            X.13fO r0 = (X.C20066813fO) r0
            boolean r0 = r0.LIZLLL
            if (r0 != 0) goto L5b
            int r1 = r1 + 1
            goto L4c
        L5b:
            r5.LL = r7
            r5.LLILLJJLI = r8
            r5.LLILZ = r4
            java.lang.Object r1 = r7.LJJIJIL(r8, r5)
            if (r1 != r6) goto L26
            return r6
        L68:
            X.05Vm r5 = new X.05Vm
            r5.<init>(r9)
            goto L12
        L6e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L76:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1363905Vl.LIZ(X.05ZT, X.13fE, X.05Vn):java.lang.Object");
    }

    public static final Object LIZIZ(InterfaceC1369205Xm interfaceC1369205Xm, Function2<? super C05ZT, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        Object objLJJJLIIL = interfaceC1369205Xm.LJJJLIIL(new C1363805Vk(null, interfaceC1364105Vn.getContext(), function2), interfaceC1364105Vn);
        if (objLJJJLIIL == C099R.LJFF()) {
            return objLJJJLIIL;
        }
        return Unit.LIZ;
    }
}
