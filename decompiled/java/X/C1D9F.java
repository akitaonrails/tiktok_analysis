package X;

import java.util.Collection;
import java.util.List;

/* JADX INFO: renamed from: X.1D9F, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D9F {
    public static final <T> Object LIZ(Collection<? extends AnonymousClass0957<? extends T>> collection, InterfaceC1364105Vn<? super List<? extends T>> interfaceC1364105Vn) {
        if (collection.isEmpty()) {
            return C13BV.INSTANCE;
        }
        return new C1DE3((AnonymousClass0957[]) collection.toArray(new AnonymousClass0957[0])).LIZ(interfaceC1364105Vn);
    }

    public static final <T> Object LIZIZ(AnonymousClass0957<? extends T>[] anonymousClass0957Arr, InterfaceC1364105Vn<? super List<? extends T>> interfaceC1364105Vn) {
        if (anonymousClass0957Arr.length == 0) {
            return C13BV.INSTANCE;
        }
        return new C1DE3(anonymousClass0957Arr).LIZ(interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZJ(java.util.Collection<? extends X.C09AE> r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof X.C1D9D
            if (r0 == 0) goto L45
            r5 = r7
            X.1D9D r5 = (X.C1D9D) r5
            int r2 = r5.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.LLILLL = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILLL
            r2 = 1
            if (r0 == 0) goto L3d
            if (r0 != r2) goto L4e
            java.lang.Object r1 = r5.LL
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.C155000ia.LIZIZ(r4)
        L26:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L4b
            java.lang.Object r0 = r1.next()
            X.09AE r0 = (X.C09AE) r0
            r5.LL = r1
            r5.LLILLL = r2
            java.lang.Object r0 = r0.LJJZ(r5)
            if (r0 != r3) goto L26
            return r3
        L3d:
            X.C155000ia.LIZIZ(r4)
            java.util.Iterator r1 = r6.iterator()
            goto L26
        L45:
            X.1D9D r5 = new X.1D9D
            r5.<init>(r7)
            goto L12
        L4b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D9F.LIZJ(java.util.Collection, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x003c -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object LIZLLL(X.C09AE[] r6, X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            boolean r0 = r7 instanceof X.C1D9E
            if (r0 == 0) goto L45
            r5 = r7
            X.1D9E r5 = (X.C1D9E) r5
            int r2 = r5.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L45
            int r2 = r2 - r1
            r5.LLILZIL = r2
        L12:
            java.lang.Object r1 = r5.LLILZ
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r5.LLILZIL
            r3 = 1
            if (r0 == 0) goto L3f
            if (r0 != r3) goto L4e
            int r0 = r5.LLILLL
            int r2 = r5.LLILLJJLI
            java.lang.Object r6 = r5.LL
            X.09AE[] r6 = (X.C09AE[]) r6
            X.C155000ia.LIZIZ(r1)
        L2a:
            int r2 = r2 + 1
        L2c:
            if (r2 >= r0) goto L4b
            r1 = r6[r2]
            r5.LL = r6
            r5.LLILLJJLI = r2
            r5.LLILLL = r0
            r5.LLILZIL = r3
            java.lang.Object r1 = r1.LJJZ(r5)
            if (r1 != r4) goto L2a
            return r4
        L3f:
            X.C155000ia.LIZIZ(r1)
            int r0 = r6.length
            r2 = 0
            goto L2c
        L45:
            X.1D9E r5 = new X.1D9E
            r5.<init>(r7)
            goto L12
        L4b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L4e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1D9F.LIZLLL(X.09AE[], X.05Vn):java.lang.Object");
    }
}
