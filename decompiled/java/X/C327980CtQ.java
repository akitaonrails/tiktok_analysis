package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CtQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.speedtest.LiveSpeedTestAdapter$handlePreScheduleRequest$1", f = "LiveSpeedTestAdapter.kt", l = {564, 567, 569}, m = "invokeSuspend")
public final class C327980CtQ extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ C327950CtN LLILLJJLI;
    public final /* synthetic */ C2250021D4u LLILLL;
    public final /* synthetic */ long LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327980CtQ(long j, C2250021D4u c2250021D4u, C327950CtN c327950CtN, InterfaceC1364105Vn interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c327950CtN;
        this.LLILLL = c2250021D4u;
        this.LLILZ = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C327950CtN c327950CtN = this.LLILLJJLI;
        return new C327980CtQ(this.LLILZ, this.LLILLL, c327950CtN, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0086  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r15) {
        /*
            r14 = this;
            r8 = r15
            java.lang.String r5 = "LiveSpeedTestAdapter@58e5.handlePreScheduleRequest$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r0 = X.C099R.LJFF()
            int r2 = r14.LL
            r1 = 3
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L20
            if (r2 == r4) goto L46
            if (r2 == r3) goto L60
            if (r2 != r1) goto L8a
            X.C155000ia.LIZIZ(r8)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L20:
            X.C155000ia.LIZIZ(r8)
            X.0CtN r2 = r14.LLILLJJLI
            if (r2 == 0) goto L2a
            r2.LIZ()
        L2a:
            X.1DFH r2 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0CtR r6 = new X.0CtR
            X.1D4u r9 = r14.LLILLL
            long r7 = r14.LLILZ
            X.0CtN r10 = r14.LLILLJJLI
            r11 = 0
            r6.<init>(r7, r9, r10, r11)
            r14.LL = r4
            java.lang.Object r2 = X.C23250099c.LJI(r14, r2, r6)
            if (r2 != r0) goto L49
            X.C1C7U.LIZIZ(r5)
            return r0
        L46:
            X.C155000ia.LIZIZ(r8)
        L49:
            X.0CtN r4 = r14.LLILLJJLI
            r8 = 0
            if (r4 == 0) goto L65
            r14.LL = r3
            X.0CsZ r3 = new X.0CsZ
            r2 = 0
            r3.<init>(r4, r8, r2, r2)
            java.lang.Object r8 = X.C2296808zG.LJ(r3, r14)
            if (r8 != r0) goto L63
            X.C1C7U.LIZIZ(r5)
            return r0
        L60:
            X.C155000ia.LIZIZ(r8)
        L63:
            X.0CtW r8 = (X.C328040CtW) r8
        L65:
            X.1D4u r2 = r14.LLILLL
            r2.getClass()
            X.0Uoj r9 = X.C2250021D4u.LJIIIIZZ(r8)
            X.1DFH r2 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0Uoi r6 = new X.0Uoi
            X.1D4u r7 = r14.LLILLL
            long r10 = r14.LLILZ
            X.0CtN r12 = r14.LLILLJJLI
            r13 = 0
            r6.<init>(r7, r8, r9, r10, r12, r13)
            r14.LL = r1
            java.lang.Object r1 = X.C23250099c.LJI(r14, r2, r6)
            if (r1 != r0) goto L1a
            X.C1C7U.LIZIZ(r5)
            return r0
        L8a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327980CtQ.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
