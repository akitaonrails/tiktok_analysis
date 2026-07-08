package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01hm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C404801hm implements InterfaceC381401e0<Unit, List<? extends AbstractC405601hu>> {
    public final C1100730ekZ LIZ;
    public final int LIZIZ;
    public final String LIZJ;
    public final Function1<Unit, List<AbstractC405601hu>> LIZLLL;

    @Override // X.InterfaceC381401e0
    public final String getContext() {
        return this.LIZJ;
    }

    @Override // X.InterfaceC381401e0
    public final int getType() {
        return this.LIZIZ;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof X.C404901hn
            if (r0 == 0) goto L61
            r6 = r10
            X.01hn r6 = (X.C404901hn) r6
            int r2 = r6.LLILZIL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L61
            int r2 = r2 - r1
            r6.LLILZIL = r2
        L12:
            java.lang.Object r8 = r6.LLILLL
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r6.LLILZIL
            r5 = 0
            java.lang.String r4 = "AutoAdaptiveCenter"
            r3 = 1
            if (r0 == 0) goto L44
            if (r0 != r3) goto L67
            java.lang.Object r1 = r6.LLILLJJLI
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.0a9C r2 = r6.LL
            X.C155000ia.LIZIZ(r8)
        L2b:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L6f
            java.lang.Object r0 = r1.next()
            X.01hu r0 = (X.AbstractC405601hu) r0
            r6.LL = r2
            r6.LLILLJJLI = r1
            r6.LLILZIL = r3
            java.lang.Object r0 = r0.LIZ(r2, r6)
            if (r0 != r7) goto L2b
            return r7
        L44:
            X.C155000ia.LIZIZ(r8)
            java.lang.String r0 = "DispatchDataTask begin..."
            X.C20441214yg.LIZIZ(r4, r0)
            kotlin.jvm.functions.Function1<kotlin.Unit, java.util.List<X.01hu>> r0 = r9.LIZLLL
            java.lang.Object r1 = r0.invoke(r5)
            java.util.List r1 = (java.util.List) r1
            X.0ekZ r0 = r9.LIZ
            X.0a9C r2 = r0.LIZIZ()
            if (r2 == 0) goto L6f
            java.util.Iterator r1 = r1.iterator()
            goto L2b
        L61:
            X.01hn r6 = new X.01hn
            r6.<init>(r9, r10)
            goto L12
        L67:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L6f:
            java.lang.String r0 = "DispatchDataTask end..."
            X.C20441214yg.LIZIZ(r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C404801hm.LIZIZ(X.05Vn):java.lang.Object");
    }

    public C404801hm(C1100730ekZ c1100730ekZ, C5183020f c5183020f) {
        int iOrdinal = EnumC405401hs.DISPATCH_DATA.ordinal();
        this.LIZ = c1100730ekZ;
        this.LIZIZ = iOrdinal;
        this.LIZJ = "IO";
        this.LIZLLL = c5183020f;
    }

    @Override // X.InterfaceC381401e0
    public final /* bridge */ /* synthetic */ Object LIZ(Unit unit, InterfaceC1364105Vn<? super List<? extends AbstractC405601hu>> interfaceC1364105Vn) {
        return LIZIZ(interfaceC1364105Vn);
    }
}
