package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0TjR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
@C09DV(c = "com.bytedance.android.livesdk.broadcast.guide.NewAnchorGuidanceDetectHelper$startBrightnessDetect$1", f = "NewAnchorGuidanceDetectHelper.kt", l = {64}, m = "invokeSuspend")
public final class C754950TjR extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ AbstractC1273900jFs LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C754950TjR(long j, AbstractC1273900jFs abstractC1273900jFs, InterfaceC1364105Vn<? super C754950TjR> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = abstractC1273900jFs;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C754950TjR(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047 A[Catch: Exception -> 0x0055, all -> 0x006b, TryCatch #1 {Exception -> 0x0055, blocks: (B:9:0x001e, B:10:0x0021, B:11:0x0037, B:13:0x0047), top: B:34:0x001e, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x004f -> B:10:0x0021). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "NewAnchorGuidanceDetectHelper@a760.startBrightnessDetect$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LL
            r2 = 0
            r4 = 1
            if (r0 == 0) goto L1a
            if (r0 != r4) goto L12
            goto L1e
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r10)
            goto L37
        L1e:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
        L21:
            X.0jFs r0 = r9.LLILLL     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            long r6 = r0.LJJ()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            java.util.List<java.lang.Long> r3 = X.C769380UGa.LIZJ     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            r0 = 1000000(0xf4240, float:1.401298E-39)
            long r0 = (long) r0     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            long r6 = r6 / r0
            java.lang.Long r0 = X.C2286608xc.LJFF(r6)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            r3.add(r0)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
        L37:
            java.util.List<java.lang.Long> r0 = X.C769380UGa.LIZJ     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            int r1 = r0.size()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceConfigSetting r0 = com.bytedance.android.livesdk.livesetting.broadcast.TryModeGuidanceConfigSetting.INSTANCE     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            int r0 = r0.brightnessDetectNumber()     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            if (r1 >= r0) goto L5e
            long r0 = r9.LLILLJJLI     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            r9.LL = r4     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)     // Catch: java.lang.Exception -> L55 java.lang.Throwable -> L6b
            if (r0 != r5) goto L21
            X.C1C7U.LIZIZ(r8)
            return r5
        L55:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6b
            X.0956 r0 = X.C769380UGa.LJ
            if (r0 == 0) goto L65
            goto L62
        L5e:
            X.0956 r0 = X.C769380UGa.LJ
            if (r0 == 0) goto L65
        L62:
            r0.LIZIZ(r2)
        L65:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L6b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L6b
            X.0956 r0 = X.C769380UGa.LJ
            if (r0 == 0) goto L76
            r0.LIZIZ(r2)
        L76:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C754950TjR.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
