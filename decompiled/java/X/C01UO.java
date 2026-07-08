package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.01UO, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.tako.ui.TakoContentAssem$frameDeteriorationExperiment$2", f = "TakoContentAssem.kt", l = {1782}, m = "invokeSuspend")
public final class C01UO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C118300cf LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ long LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C01UO(int i, int i2, long j, InterfaceC1364105Vn<? super C01UO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = i;
        this.LLILZIL = i2;
        this.LLILZLL = j;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C01UO c01uo = new C01UO(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c01uo.LLILLL = obj;
        return c01uo;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0031 A[Catch: Exception -> 0x005a, TryCatch #0 {Exception -> 0x005a, blocks: (B:17:0x004c, B:18:0x004f, B:10:0x002b, B:12:0x0031, B:14:0x0037, B:9:0x0026), top: B:25:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x0049 -> B:18:0x004f). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "TakoContentAssem@bd9.frameDeteriorationExperiment$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 1
            if (r0 == 0) goto L1f
            if (r0 != r4) goto L17
            X.00cf r3 = r7.LL
            java.lang.Object r2 = r7.LLILLL
            X.01wk r2 = (X.InterfaceC497601wk) r2
            goto L4c
        L17:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1f:
            X.C155000ia.LIZIZ(r8)
            java.lang.Object r2 = r7.LLILLL
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.00cf r3 = new X.00cf     // Catch: java.lang.Exception -> L5a
            r3.<init>()     // Catch: java.lang.Exception -> L5a
        L2b:
            boolean r0 = X.C2296808zG.LJI(r2)     // Catch: java.lang.Exception -> L5a
            if (r0 == 0) goto L5e
            int r1 = r3.element     // Catch: java.lang.Exception -> L5a
            int r0 = r7.LLILZ     // Catch: java.lang.Exception -> L5a
            if (r1 >= r0) goto L5e
            int r0 = r7.LLILZIL     // Catch: java.lang.Exception -> L5a
            long r0 = (long) r0     // Catch: java.lang.Exception -> L5a
            java.lang.Thread.sleep(r0)     // Catch: java.lang.Exception -> L5a
            long r0 = r7.LLILZLL     // Catch: java.lang.Exception -> L5a
            r7.LLILLL = r2     // Catch: java.lang.Exception -> L5a
            r7.LL = r3     // Catch: java.lang.Exception -> L5a
            r7.LLILLJJLI = r4     // Catch: java.lang.Exception -> L5a
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)     // Catch: java.lang.Exception -> L5a
            if (r0 != r5) goto L4f
            goto L56
        L4c:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Exception -> L5a
        L4f:
            int r0 = r3.element     // Catch: java.lang.Exception -> L5a
            int r0 = r0 + 1
            r3.element = r0     // Catch: java.lang.Exception -> L5a
            goto L2b
        L56:
            X.C1C7U.LIZIZ(r6)
            return r5
        L5a:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L5e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C01UO.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
