package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.13hd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
@C09DV(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$startReceivingMouseWheelEvents$1", f = "MouseWheelScrollable.kt", l = {107, 110}, m = "invokeSuspend")
public final class C20080713hd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C20083813i8 LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20080713hd(C20083813i8 c20083813i8, InterfaceC1364105Vn<? super C20080713hd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c20083813i8;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C20080713hd c20080713hd = new C20080713hd(this.LLILLL, interfaceC1364105Vn);
        c20080713hd.LLILLJJLI = obj;
        return c20080713hd;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x003b A[Catch: all -> 0x0078, TryCatch #0 {all -> 0x0078, blocks: (B:15:0x0031, B:17:0x003b), top: B:33:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x006c -> B:33:0x0031). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:? -> B:29:0x007d). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            r9 = r13
            java.lang.Object r6 = X.C099R.LJFF()
            int r0 = r12.LL
            r3 = 0
            r5 = 2
            r4 = 1
            if (r0 == 0) goto L2a
            if (r0 == r4) goto L20
            if (r0 != r5) goto L18
            java.lang.Object r2 = r12.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L28
            goto L31
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            java.lang.Object r2 = r12.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L28
            goto L4a
        L28:
            r1 = move-exception
            goto L79
        L2a:
            X.C155000ia.LIZIZ(r9)
            java.lang.Object r2 = r12.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
        L31:
            kotlin.coroutines.CoroutineContext r0 = r2.getCoroutineContext()     // Catch: java.lang.Throwable -> L78
            boolean r0 = X.C23118094a.LJIIIIZZ(r0)     // Catch: java.lang.Throwable -> L78
            if (r0 == 0) goto L71
            X.13i8 r0 = r12.LLILLL     // Catch: java.lang.Throwable -> L78
            X.1DEK r0 = r0.LJ     // Catch: java.lang.Throwable -> L78
            r12.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L78
            r12.LL = r4     // Catch: java.lang.Throwable -> L78
            java.lang.Object r9 = r0.LJIILIIL(r12)     // Catch: java.lang.Throwable -> L78
            if (r9 != r6) goto L4a
            goto L6f
        L4a:
            X.13gg r9 = (X.C20074813gg) r9     // Catch: java.lang.Throwable -> L7d
            X.13i8 r0 = r12.LLILLL     // Catch: java.lang.Throwable -> L7d
            X.0u5o r1 = r0.LIZLLL     // Catch: java.lang.Throwable -> L7d
            float r0 = X.C20080813he.LIZ     // Catch: java.lang.Throwable -> L7d
            float r10 = r1.LJJJJLL(r0)     // Catch: java.lang.Throwable -> L7d
            X.13i8 r0 = r12.LLILLL     // Catch: java.lang.Throwable -> L7d
            X.0u5o r1 = r0.LIZLLL     // Catch: java.lang.Throwable -> L7d
            float r0 = X.C20080813he.LIZIZ     // Catch: java.lang.Throwable -> L7d
            float r11 = r1.LJJJJLL(r0)     // Catch: java.lang.Throwable -> L7d
            X.13i8 r7 = r12.LLILLL     // Catch: java.lang.Throwable -> L7d
            X.13hx r8 = r7.LIZ     // Catch: java.lang.Throwable -> L7d
            r12.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L7d
            r12.LL = r5     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = X.C20083813i8.LIZIZ(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L7d
            if (r0 != r6) goto L31
            goto L70
        L6f:
            return r6
        L70:
            return r6
        L71:
            X.13i8 r0 = r12.LLILLL
            r0.LJI = r3
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        L78:
            r1 = move-exception
        L79:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L7d
            goto L7f
        L7d:
            r1 = move-exception
            goto L79
        L7f:
            X.13i8 r0 = r12.LLILLL
            r0.LJI = r3
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20080713hd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
