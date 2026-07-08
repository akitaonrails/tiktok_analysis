package X;

import com.bytedance.tts.pigeon.paas.components.base.PigeonIMLogicComponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0YTD, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.bytedance.tts.pigeon.paas.components.base.PigeonIMLogicComponent$refreshPigeonAuthInfo$1", f = "PigeonIMLogicComponent.kt", l = {117, 118}, m = "invokeSuspend")
public final class C0YTD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ PigeonIMLogicComponent LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ Function1<C0YWT, Unit> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C0YTD(PigeonIMLogicComponent pigeonIMLogicComponent, boolean z, Function1<? super C0YWT, Unit> function1, InterfaceC1364105Vn<? super C0YTD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZ = pigeonIMLogicComponent;
        this.LLILZIL = z;
        this.LLILZLL = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0YTD c0ytd = new C0YTD(this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0ytd.LLILLL = obj;
        return c0ytd;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x007a A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:27:0x0071, B:28:0x0074, B:30:0x007a, B:33:0x0082, B:34:0x0087, B:19:0x0055, B:20:0x0058, B:22:0x005c, B:11:0x0036, B:15:0x0045), top: B:39:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0082 A[Catch: all -> 0x008b, TryCatch #0 {all -> 0x008b, blocks: (B:27:0x0071, B:28:0x0074, B:30:0x007a, B:33:0x0082, B:34:0x0087, B:19:0x0055, B:20:0x0058, B:22:0x005c, B:11:0x0036, B:15:0x0045), top: B:39:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "PigeonIMLogicComponent@e81b.refreshPigeonAuthInfo$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L2d
            if (r0 == r5) goto L24
            if (r0 != r6) goto L1c
            java.lang.Object r1 = r9.LL
            X.0YWT r1 = (X.C0YWT) r1
            java.lang.Object r4 = r9.LLILLL
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            goto L71
        L1c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L24:
            java.lang.Object r4 = r9.LL
            kotlin.jvm.functions.Function1 r4 = (kotlin.jvm.functions.Function1) r4
            java.lang.Object r3 = r9.LLILLL
            com.bytedance.tts.pigeon.paas.components.base.PigeonIMLogicComponent r3 = (com.bytedance.tts.pigeon.paas.components.base.PigeonIMLogicComponent) r3
            goto L55
        L2d:
            X.C155000ia.LIZIZ(r10)
            com.bytedance.tts.pigeon.paas.components.base.PigeonIMLogicComponent r3 = r9.LLILZ
            boolean r2 = r9.LLILZIL
            kotlin.jvm.functions.Function1<X.0YWT, kotlin.Unit> r4 = r9.LLILZLL
            com.bytedance.tts.pigeon.GECPigeon r0 = r3.LL     // Catch: java.lang.Throwable -> L8b
            X.0YWO r0 = r0.getPigeonDepend()     // Catch: java.lang.Throwable -> L8b
            X.0YOQ r1 = r0.LJFF()     // Catch: java.lang.Throwable -> L8b
            if (r2 == 0) goto L44
            r0 = 1
            goto L45
        L44:
            r0 = 0
        L45:
            r9.LLILLL = r3     // Catch: java.lang.Throwable -> L8b
            r9.LL = r4     // Catch: java.lang.Throwable -> L8b
            r9.LLILLJJLI = r5     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r10 = r1.LIZIZ(r0, r9)     // Catch: java.lang.Throwable -> L8b
            if (r10 != r7) goto L58
            X.C1C7U.LIZIZ(r8)
            return r7
        L55:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L8b
        L58:
            X.0YWT r10 = (X.C0YWT) r10     // Catch: java.lang.Throwable -> L8b
            if (r10 == 0) goto L80
            X.1DDq r0 = r3.LLILZLL     // Catch: java.lang.Throwable -> L8b
            r9.LLILLL = r4     // Catch: java.lang.Throwable -> L8b
            r9.LL = r10     // Catch: java.lang.Throwable -> L8b
            r9.LLILLJJLI = r6     // Catch: java.lang.Throwable -> L8b
            r0.setValue(r10)     // Catch: java.lang.Throwable -> L8b
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L8b
            if (r0 != r7) goto L6f
            X.C1C7U.LIZIZ(r8)
            return r7
        L6f:
            r1 = r10
            goto L74
        L71:
            X.C155000ia.LIZIZ(r10)     // Catch: java.lang.Throwable -> L8b
        L74:
            boolean r0 = X.C0YWN.LIZ(r1)     // Catch: java.lang.Throwable -> L8b
            if (r0 != 0) goto L82
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L8b
            X.C1C7U.LIZIZ(r8)     // Catch: java.lang.Throwable -> L8b
            return r0
        L80:
            r0 = 0
            goto L87
        L82:
            r4.invoke(r1)     // Catch: java.lang.Throwable -> L8b
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L8b
        L87:
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L8b
            goto L97
        L8b:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L97:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0YTD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
