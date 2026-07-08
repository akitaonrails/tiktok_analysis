package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0k03, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
@C09DV(c = "androidx.core.telecom.internal.CallSession$switchStartingCallEndpointOnCallStart$2", f = "CallSession.kt", l = {267, 273, 276}, m = "invokeSuspend")
public final class C1302530k03 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Integer>, Object> {
    public int LL;
    public final /* synthetic */ C1302520k02 LLILLJJLI;
    public final /* synthetic */ C1302410jzr LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1302530k03(C1302520k02 c1302520k02, C1302410jzr c1302410jzr, InterfaceC1364105Vn<? super C1302530k03> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1302520k02;
        this.LLILLL = c1302410jzr;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1302530k03(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x008b A[RETURN] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r7.LL
            r2 = 3
            r4 = 2
            r6 = 0
            r5 = 1
            if (r0 == 0) goto L30
            if (r0 == r5) goto L44
            if (r0 == r4) goto L7c
            if (r0 != r2) goto L8c
            X.C155000ia.LIZIZ(r8)
        L15:
            java.lang.String r2 = X.C1302520k02.LLJJIJIL
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "switchStartingCallEndpointOnCallStart: result="
            r1.append(r0)
            r1.append(r8)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            int r0 = android.util.Log.i(r2, r0)
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            return r0
        L30:
            X.C155000ia.LIZIZ(r8)
            X.0957[] r1 = new X.AnonymousClass0957[r5]
            X.0k02 r0 = r7.LLILLJJLI
            X.099F r0 = r0.LLJJIII
            r1[r6] = r0
            r7.LL = r5
            java.lang.Object r0 = X.C1D9F.LIZIZ(r1, r7)
            if (r0 != r3) goto L47
            return r3
        L44:
            X.C155000ia.LIZIZ(r8)
        L47:
            X.0k02 r0 = r7.LLILLJJLI
            java.util.List<X.0jzr> r1 = r0.LLJILLL
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L59
            r0 = r1
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L59
            goto L7f
        L59:
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            java.util.Iterator r1 = r1.iterator()
        L5f:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L7f
            java.lang.Object r0 = r1.next()
            X.0jzr r0 = (X.C1302410jzr) r0
            boolean r0 = r0.LIZJ()
            if (r0 == 0) goto L5f
            r7.LL = r4
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r3) goto L7f
            return r3
        L7c:
            X.C155000ia.LIZIZ(r8)
        L7f:
            X.0k02 r1 = r7.LLILLJJLI
            X.0jzr r0 = r7.LLILLL
            r7.LL = r2
            java.lang.Object r8 = r1.LJII(r0, r7)
            if (r8 != r3) goto L15
            return r3
        L8c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1302530k03.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Integer> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
