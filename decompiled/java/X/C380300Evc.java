package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Evc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.components.asyncedit.AsyncTasksScene$showNewText$1", f = "AsyncTasksScene.kt", l = {155, 157}, m = "invokeSuspend")
public final class C380300Evc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ boolean LLILLJJLI;
    public final /* synthetic */ C380350Evh LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C380300Evc(C380350Evh c380350Evh, InterfaceC1364105Vn interfaceC1364105Vn, boolean z) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = z;
        this.LLILLL = c380350Evh;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C380300Evc(this.LLILLL, interfaceC1364105Vn, this.LLILLJJLI);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0067 A[Catch: all -> 0x0088, TryCatch #0 {all -> 0x0088, blocks: (B:6:0x0015, B:16:0x003f, B:17:0x0042, B:20:0x0049, B:22:0x0052, B:25:0x0067, B:10:0x002d, B:12:0x0031), top: B:40:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007f  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "AsyncTasksScene@382.showNewText$1"
            X.C1C7U.LIZ(r7)
            java.lang.Object r4 = X.C099R.LJFF()
            int r0 = r8.LL
            r2 = 8
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L21
            if (r0 == r5) goto L3f
            if (r0 != r6) goto L19
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L88
            goto L6f
        L19:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L21:
            X.C155000ia.LIZIZ(r9)
            X.0M8t r3 = X.C563650M8t.LIZIZ
            java.lang.String r1 = "shiwei"
            java.lang.String r0 = "has new task!"
            X.C201955140j.LIZLLL(r3, r1, r0)
            boolean r0 = r8.LLILLJJLI     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L42
            X.0Evh r0 = r8.LLILLL     // Catch: java.lang.Throwable -> L88
            r8.LL = r5     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = r0.LLLLLLIL(r8)     // Catch: java.lang.Throwable -> L88
            if (r0 != r4) goto L42
            X.C1C7U.LIZIZ(r7)
            return r4
        L3f:
            X.C155000ia.LIZIZ(r9)     // Catch: java.lang.Throwable -> L88
        L42:
            X.0Evh r3 = r8.LLILLL     // Catch: java.lang.Throwable -> L88
            boolean r0 = r8.LLILLJJLI     // Catch: java.lang.Throwable -> L88
            if (r0 == 0) goto L49
            r5 = 0
        L49:
            r8.LL = r6     // Catch: java.lang.Throwable -> L88
            r3.LLLLLJIL()     // Catch: java.lang.Throwable -> L88
            com.bytedance.tux.input.TuxTextView r1 = r3.LLJJLIIIJLLLLLLLZ     // Catch: java.lang.Throwable -> L88
            if (r1 == 0) goto L67
            r0 = 2131850030(0x7f11732e, float:1.933361E38)
            java.lang.String r0 = r3.getString(r0)     // Catch: java.lang.Throwable -> L88
            r1.setText(r0)     // Catch: java.lang.Throwable -> L88
            java.lang.Object r1 = r3.LLLLLLJ(r1, r5, r8)     // Catch: java.lang.Throwable -> L88
            java.lang.Object r0 = X.C099R.LJFF()     // Catch: java.lang.Throwable -> L88
            if (r1 != r0) goto L67
            goto L69
        L67:
            kotlin.Unit r1 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L88
        L69:
            if (r1 != r4) goto L6f
            X.C1C7U.LIZIZ(r7)
            return r4
        L6f:
            X.0Evh r0 = r8.LLILLL
            r0.LLLLLJIL()
            X.0Evh r0 = r8.LLILLL
            r0.LLLLLLL()
            X.0Evh r0 = r8.LLILLL
            X.0Gne r0 = r0.LLJJJJJIL
            if (r0 == 0) goto L82
            X.C786410Ut5.LLLZZ(r0, r2)
        L82:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        L88:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L88
            X.0Evh r0 = r8.LLILLL
            r0.LLLLLJIL()
            X.0Evh r0 = r8.LLILLL
            r0.LLLLLLL()
            X.0Evh r0 = r8.LLILLL
            X.0Gne r0 = r0.LLJJJJJIL
            if (r0 == 0) goto L9f
            X.C786410Ut5.LLLZZ(r0, r2)
        L9f:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C380300Evc.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
