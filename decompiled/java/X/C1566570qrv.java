package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0qrv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.component.instantfeed.RecommendInstantFeedManager$onSignalReceived$1", f = "RecommendInstantFeedManager.kt", l = {123, 128}, m = "invokeSuspend")
public final class C1566570qrv extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ AbstractC1566610qrz LLILLJJLI;
    public final /* synthetic */ C1566580qrw LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1566570qrv(C1566580qrw c1566580qrw, AbstractC1566610qrz abstractC1566610qrz, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = abstractC1566610qrz;
        this.LLILLL = c1566580qrw;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1566570qrv(this.LLILLL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x007a  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "RecommendInstantFeedManager@6e14.onSignalReceived$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r8.LL
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L35
            if (r0 != r6) goto L7e
            X.C155000ia.LIZIZ(r9)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r9)
            X.0qrz r1 = r8.LLILLJJLI
            boolean r0 = r1.LIZIZ
            if (r0 != 0) goto L64
            X.0qrw r0 = r8.LLILLL
            X.0qs6 r0 = r0.LIZLLL
            r8.LL = r2
            java.lang.Object r9 = r0.LIZ(r1, r8)
            if (r9 != r5) goto L38
            X.C1C7U.LIZIZ(r7)
            return r5
        L35:
            X.C155000ia.LIZIZ(r9)
        L38:
            java.lang.Boolean r9 = (java.lang.Boolean) r9
            boolean r0 = r9.booleanValue()
            if (r0 != 0) goto L64
            X.0qrz r0 = r8.LLILLJJLI
            X.0qry r0 = r0.LIZ()
            if (r0 == 0) goto L4b
            r0.LIZ()
        L4b:
            X.0qrz r0 = r8.LLILLJJLI
            java.lang.String r2 = r0.LIZIZ()
            X.0qrw r0 = r8.LLILLL
            X.0qs1 r0 = r0.LIZ
            java.lang.String r1 = r0.LIZJ()
            java.lang.String r0 = "frequency_control"
            X.C1566590qrx.LIZ(r2, r0, r1)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L64:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r4 = X.C2107308Nj.LIZ
            X.0qrj r3 = new X.0qrj
            X.0qrw r2 = r8.LLILLL
            X.0qrz r1 = r8.LLILLJJLI
            r0 = 0
            r3.<init>(r2, r1, r0)
            r8.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r8, r4, r3)
            if (r0 != r5) goto L16
            X.C1C7U.LIZIZ(r7)
            return r5
        L7e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1566570qrv.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
