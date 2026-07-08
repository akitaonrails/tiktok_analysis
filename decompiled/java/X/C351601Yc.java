package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01Yc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.offlinepush.signal.OfflinePushPreScheduleGate$ensureThenSchedule$1", f = "OfflinePushPreScheduleGate.kt", l = {84, 86}, m = "invokeSuspend")
public final class C351601Yc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Function2<Integer, InterfaceC1364105Vn<? super Unit>, Object> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C351601Yc(int i, Function2<? super Integer, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, InterfaceC1364105Vn<? super C351601Yc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = i;
        this.LLILZ = function2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C351601Yc c351601Yc = new C351601Yc(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c351601Yc.LLILLJJLI = obj;
        return c351601Yc;
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) throws java.lang.Throwable {
        /*
            r8 = this;
            java.lang.String r7 = "OfflinePushPreScheduleGate@4fa6.ensureThenSchedule$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r8.LL
            r5 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L3b
            if (r0 != r4) goto L15
            goto L5a
        L15:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1d:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r1 = r8.LLILLJJLI
            X.10i8 r0 = X.C380901dv.LIZ
            int r2 = r8.LLILLL
            r8.LLILLJJLI = r1
            r8.LL = r3
            X.1DFB r1 = X.C0PEM.LIZJ
            X.0qrc r0 = new X.0qrc
            r0.<init>(r2, r5)
            java.lang.Object r9 = X.C23250099c.LJI(r8, r1, r0)
            if (r9 != r6) goto L3e
            X.C1C7U.LIZIZ(r7)
            return r6
        L3b:
            X.C155000ia.LIZIZ(r9)
        L3e:
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 == 0) goto L9a
            int r0 = r9.intValue()
            kotlin.jvm.functions.Function2<java.lang.Integer, X.05Vn<? super kotlin.Unit>, java.lang.Object> r1 = r8.LLILZ
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Throwable -> L63
            r8.LLILLJJLI = r5     // Catch: java.lang.Throwable -> L63
            r8.LL = r4     // Catch: java.lang.Throwable -> L63
            java.lang.Object r0 = r1.invoke(r0, r8)     // Catch: java.lang.Throwable -> L63
            if (r0 != r6) goto L5d
            X.C1C7U.LIZIZ(r7)
            return r6
        L5a:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L63
        L5d:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L63
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L63
            goto L6f
        L63:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L6f:
            int r4 = r8.LLILLL
            java.lang.Throwable r3 = X.C189200o6.m5exceptionOrNullimpl(r0)
            if (r3 == 0) goto L94
            X.10i8 r2 = X.C380901dv.LIZ
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "[Gate] onPass failed strategy="
            r1.append(r0)
            r1.append(r4)
            r0 = 32
            r1.append(r0)
            r1.append(r3)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r1)
            r2.LJ(r0)
        L94:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L9a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C351601Yc.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
