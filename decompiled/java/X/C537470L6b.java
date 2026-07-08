package X;

import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0L6b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.theater.navigation.AITheaterCreationRouteHandler$navigateToCreation$1", f = "AITheaterCreationRouteHandler.kt", l = {88, 90}, m = "invokeSuspend")
public final class C537470L6b extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public Object LLILLJJLI;
    public C0Y8T LLILLL;
    public Object LLILZ;
    public boolean LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ String LLIZ;
    public final /* synthetic */ String LLIZLLLIL;
    public final /* synthetic */ C0Y8T LLJ;
    public final /* synthetic */ boolean LLJI;
    public final /* synthetic */ Activity LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C537470L6b(String str, String str2, C0Y8T c0y8t, boolean z, Activity activity, InterfaceC1364105Vn<? super C537470L6b> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = str;
        this.LLIZLLLIL = str2;
        this.LLJ = c0y8t;
        this.LLJI = z;
        this.LLJIJIL = activity;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C537470L6b(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0093  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r16) {
        /*
            r15 = this;
            r1 = r16
            java.lang.String r6 = "AITheaterCreationRouteHandler@84e9.navigateToCreation$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r15.LLILZLL
            r4 = 2
            r12 = 1
            r14 = 0
            if (r0 == 0) goto L34
            if (r0 == r12) goto L23
            if (r0 != r4) goto L1b
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L97
            goto L9b
        L1b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L23:
            boolean r2 = r15.LLILZIL
            java.lang.Object r13 = r15.LLILZ
            android.app.Activity r13 = (android.app.Activity) r13
            X.0Y8T r11 = r15.LLILLL
            java.lang.Object r10 = r15.LLILLJJLI
            java.lang.String r10 = (java.lang.String) r10
            java.lang.Object r9 = r15.LL
            java.lang.String r9 = (java.lang.String) r9
            goto L6c
        L34:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r0 = r15.LLIZ     // Catch: java.lang.Exception -> L97
            java.lang.Long r0 = X.C2095008Iq.LJIILIIL(r0)     // Catch: java.lang.Exception -> L97
            if (r0 == 0) goto L9b
            java.lang.String r9 = r15.LLIZLLLIL     // Catch: java.lang.Exception -> L97
            java.lang.String r10 = r15.LLIZ     // Catch: java.lang.Exception -> L97
            X.0Y8T r11 = r15.LLJ     // Catch: java.lang.Exception -> L97
            boolean r2 = r15.LLJI     // Catch: java.lang.Exception -> L97
            android.app.Activity r13 = r15.LLJIJIL     // Catch: java.lang.Exception -> L97
            long r0 = r0.longValue()     // Catch: java.lang.Exception -> L97
            X.0LPI r5 = X.C0LPI.LIZ     // Catch: java.lang.Exception -> L97
            r5.getClass()     // Catch: java.lang.Exception -> L97
            com.ss.android.ugc.aweme.aigc.IMService r5 = X.C0LPI.LIZ()     // Catch: java.lang.Exception -> L97
            r15.LL = r9     // Catch: java.lang.Exception -> L97
            r15.LLILLJJLI = r10     // Catch: java.lang.Exception -> L97
            r15.LLILLL = r11     // Catch: java.lang.Exception -> L97
            r15.LLILZ = r13     // Catch: java.lang.Exception -> L97
            r15.LLILZIL = r2     // Catch: java.lang.Exception -> L97
            r15.LLILZLL = r12     // Catch: java.lang.Exception -> L97
            java.lang.Object r1 = r5.LIZLLL(r0, r14, r15)     // Catch: java.lang.Exception -> L97
            if (r1 != r3) goto L6f
            X.C1C7U.LIZIZ(r6)
            return r3
        L6c:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Exception -> L97
        L6f:
            kotlin.Pair r1 = (kotlin.Pair) r1     // Catch: java.lang.Exception -> L97
            java.lang.Object r8 = r1.getFirst()     // Catch: java.lang.Exception -> L97
            java.util.List r8 = (java.util.List) r8     // Catch: java.lang.Exception -> L97
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Exception -> L97
            X.08pq r0 = X.C2107308Nj.LIZ     // Catch: java.lang.Exception -> L97
            X.0LgC r7 = new X.0LgC     // Catch: java.lang.Exception -> L97
            if (r2 != 0) goto L80
            r12 = 0
        L80:
            r7.<init>(r8, r9, r10, r11, r12, r13, r14)     // Catch: java.lang.Exception -> L97
            r15.LL = r14     // Catch: java.lang.Exception -> L97
            r15.LLILLJJLI = r14     // Catch: java.lang.Exception -> L97
            r15.LLILLL = r14     // Catch: java.lang.Exception -> L97
            r15.LLILZ = r14     // Catch: java.lang.Exception -> L97
            r15.LLILZLL = r4     // Catch: java.lang.Exception -> L97
            java.lang.Object r0 = X.C23250099c.LJI(r15, r0, r7)     // Catch: java.lang.Exception -> L97
            if (r0 != r3) goto L9b
            X.C1C7U.LIZIZ(r6)
            return r3
        L97:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L9b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C537470L6b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
