package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Csa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.game.broadcast.stream.quality.preschedule.GamePreScheduleRequest$request$2", f = "GamePreScheduleRequest.kt", l = {69, 75}, m = "invokeSuspend")
public final class C327460Csa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C783680Uog>, Object> {
    public C327470Csb LL;
    public int LLILLJJLI;
    public final /* synthetic */ C327470Csb LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327460Csa(C327470Csb c327470Csb, InterfaceC1364105Vn<? super C327460Csa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c327470Csb;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327460Csa(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "GamePreScheduleRequest@966d.request$2"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LLILLJJLI
            java.lang.String r5 = "GamePreScheduleRequest"
            r3 = 2
            r6 = 1
            r1 = 0
            if (r0 == 0) goto L1e
            if (r0 == r6) goto L76
            if (r0 != r3) goto Lba
            X.C155000ia.LIZIZ(r9)
        L19:
            r1 = r9
        L1a:
            X.C1C7U.LIZIZ(r7)
            return r1
        L1e:
            X.C155000ia.LIZIZ(r9)
            X.0Csb r2 = r8.LLILLL
            X.0957<X.0Uog> r0 = r2.LIZ
            if (r0 == 0) goto L2f
            boolean r0 = r2.LIZJ
            if (r0 != 0) goto L2f
            boolean r0 = r2.LIZIZ
            if (r0 == 0) goto L7f
        L2f:
            java.lang.StringBuilder r2 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "request for request = "
            r2.append(r0)
            X.0Csb r0 = r8.LLILLL
            X.0957<X.0Uog> r0 = r0.LIZ
            r2.append(r0)
            java.lang.String r0 = " or isPreRequestFail = "
            r2.append(r0)
            X.0Csb r0 = r8.LLILLL
            boolean r0 = r0.LIZJ
            r2.append(r0)
            java.lang.String r0 = " or isPreRequestExpire = "
            r2.append(r0)
            X.0Csb r0 = r8.LLILLL
            boolean r0 = r0.LIZIZ
            r2.append(r0)
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r2)
            X.C20441214yg.LIZIZ(r5, r0)
            X.0Csb r2 = r8.LLILLL
            r8.LL = r2
            r8.LLILLJJLI = r6
            r2.getClass()
            X.05eT r0 = new X.05eT
            r0.<init>(r1)
            java.lang.Object r9 = X.C2296808zG.LJ(r0, r8)
            if (r9 != r4) goto L7b
            X.C1C7U.LIZIZ(r7)
            return r4
        L76:
            X.0Csb r2 = r8.LL
            X.C155000ia.LIZIZ(r9)
        L7b:
            X.0957 r9 = (X.AnonymousClass0957) r9
            r2.LIZ = r9
        L7f:
            java.lang.String r0 = "request start"
            X.C20441214yg.LIZIZ(r5, r0)
            X.0Csb r0 = r8.LLILLL
            X.0957<X.0Uog> r0 = r0.LIZ
            if (r0 == 0) goto La4
            boolean r0 = r0.isCompleted()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L92:
            boolean r0 = X.C500260Jjc.LJJJI(r0)
            if (r0 == 0) goto La6
            X.0Csb r0 = r8.LLILLL
            X.0957<X.0Uog> r0 = r0.LIZ
            if (r0 == 0) goto L1a
            java.lang.Object r1 = r0.LIZLLL()
            goto L1a
        La4:
            r0 = r1
            goto L92
        La6:
            X.0Csb r0 = r8.LLILLL
            X.0957<X.0Uog> r0 = r0.LIZ
            if (r0 == 0) goto L1a
            r8.LL = r1
            r8.LLILLJJLI = r3
            java.lang.Object r9 = r0.LJLIIIL(r8)
            if (r9 != r4) goto L19
            X.C1C7U.LIZIZ(r7)
            return r4
        Lba:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327460Csa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C783680Uog> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
