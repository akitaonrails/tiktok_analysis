package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0CVW, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.preview.speedtest.PreScheduleRequest$preRequest$1", f = "PreScheduleRequest.kt", l = {69}, m = "invokeSuspend")
public final class C0CVW extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C327950CtN LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C327950CtN LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CVW(boolean z, C327950CtN c327950CtN, InterfaceC1364105Vn<? super C0CVW> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
        this.LLILZ = c327950CtN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0CVW(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        if (r0.sdkParams != null) goto L7;
     */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "PreScheduleRequest@d280.preRequest$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L1f
            if (r0 != r4) goto L58
            X.0CtN r2 = r7.LL
            X.C155000ia.LIZIZ(r8)
        L15:
            X.0957 r8 = (X.AnonymousClass0957) r8
            r2.LIZ = r8
        L19:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L1f:
            X.C155000ia.LIZIZ(r8)
            boolean r0 = r7.LLILLL
            r3 = 0
            if (r0 != 0) goto L36
            X.0CtN r0 = r7.LLILZ
            r0.getClass()
            webcast.api.creator.PreScheduleStream r0 = X.C327950CtN.LIZIZ()
            if (r0 == 0) goto L36
            java.lang.String r0 = r0.sdkParams
            if (r0 != 0) goto L19
        L36:
            X.0CtN r2 = r7.LLILZ
            long r0 = java.lang.System.currentTimeMillis()
            r2.LIZLLL = r0
            X.0CtN r2 = r7.LLILZ
            boolean r1 = r7.LLILLL
            r7.LL = r2
            r7.LLILLJJLI = r4
            r2.getClass()
            X.0CVX r0 = new X.0CVX
            r0.<init>(r2, r3, r1, r4)
            java.lang.Object r8 = X.C2296808zG.LJ(r0, r7)
            if (r8 != r5) goto L15
            X.C1C7U.LIZIZ(r6)
            return r5
        L58:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0CVW.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
