package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.095U, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.creative.camera.core.scheduler.IMCameraCoreScheduler$1", f = "IMCameraCoreScheduler.kt", l = {124, LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT}, m = "invokeSuspend")
public final class C095U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public AnonymousClass0954 LL;
    public InterfaceC824740WWy LLILLJJLI;
    public int LLILLL;
    public final /* synthetic */ C1783850wWN LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C095U(C1783850wWN c1783850wWN, InterfaceC1364105Vn<? super C095U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = c1783850wWN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C095U(this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0050 A[Catch: all -> 0x007e, TryCatch #4 {all -> 0x007e, blocks: (B:17:0x0048, B:19:0x0050), top: B:49:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0075  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x006a -> B:14:0x003b). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            java.lang.String r8 = "IMCameraCoreScheduler@e2e2.<init>$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILLL
            r6 = 0
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L2c
            if (r0 == r4) goto L24
            if (r0 != r5) goto L1c
            X.0WWy r2 = r9.LLILLJJLI
            X.0954 r3 = r9.LL
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L80
            goto L3b
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L24:
            X.0WWy r2 = r9.LLILLJJLI
            X.0954 r3 = r9.LL
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L80
            goto L48
        L2c:
            X.C155000ia.LIZIZ(r10)
            X.0wWN r0 = r9.LLILZ
            X.1DEK r3 = r0.LJ
            r3.getClass()     // Catch: java.lang.Throwable -> L80
            X.1DEL r2 = new X.1DEL     // Catch: java.lang.Throwable -> L80
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L80
        L3b:
            r9.LL = r3     // Catch: java.lang.Throwable -> L80
            r9.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L80
            r9.LLILLL = r4     // Catch: java.lang.Throwable -> L80
            java.lang.Object r10 = r2.LIZ(r9)     // Catch: java.lang.Throwable -> L80
            if (r10 != r7) goto L48
            goto L6d
        L48:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L7e
            boolean r0 = r10.booleanValue()     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L75
            java.lang.Object r0 = r2.next()     // Catch: java.lang.Throwable -> L7e
            kotlin.Pair r0 = (kotlin.Pair) r0     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r1 = r0.getSecond()     // Catch: java.lang.Throwable -> L7e
            kotlin.jvm.functions.Function2 r1 = (kotlin.jvm.functions.Function2) r1     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r0.getFirst()     // Catch: java.lang.Throwable -> L7e
            r9.LL = r3     // Catch: java.lang.Throwable -> L7e
            r9.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L7e
            r9.LLILLL = r5     // Catch: java.lang.Throwable -> L7e
            java.lang.Object r0 = r1.invoke(r0, r9)     // Catch: java.lang.Throwable -> L7e
            if (r0 != r7) goto L3b
            goto L71
        L6d:
            X.C1C7U.LIZIZ(r8)
            return r7
        L71:
            X.C1C7U.LIZIZ(r8)
            return r7
        L75:
            X.C094C.LIZ(r3, r6)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L7e:
            r1 = move-exception
            goto L81
        L80:
            r1 = move-exception
        L81:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L88
            throw r1     // Catch: java.lang.Throwable -> L85
        L85:
            r0 = move-exception
            r6 = r1
            goto L89
        L88:
            r0 = move-exception
        L89:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L8d
            goto L8f
        L8d:
            r0 = move-exception
            goto L89
        L8f:
            X.C094C.LIZ(r3, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C095U.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
