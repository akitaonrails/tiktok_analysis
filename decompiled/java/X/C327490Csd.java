package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Csd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.push.impl.innerpush.workflow.IMInnerPushShowDelegate$showNotificationAsync$1", f = "IMInnerPushShowDelegate.kt", l = {662, 417, 423}, m = "invokeSuspend")
public final class C327490Csd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C259800zU LL;
    public InterfaceC383701eN LLILLJJLI;
    public C0Z2O LLILLL;
    public C259800zU LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C0Z2O LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C327490Csd(C0Z2O c0z2o, InterfaceC1364105Vn<? super C327490Csd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c0z2o;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C327490Csd(this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0073 A[Catch: all -> 0x00a8, TryCatch #0 {all -> 0x00a8, blocks: (B:22:0x006a, B:23:0x006d, B:25:0x0073, B:16:0x0051, B:18:0x0055), top: B:41:0x000f }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x007d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "IMInnerPushShowDelegate@a92c.showNotificationAsync$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r10.LLILZIL
            r6 = 3
            r2 = 2
            r8 = 1
            r4 = 0
            if (r0 == 0) goto L33
            if (r0 == r8) goto L29
            if (r0 == r2) goto L20
            if (r0 != r6) goto L9c
            X.C155000ia.LIZIZ(r11)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L20:
            X.00zU r3 = r10.LLILZ
            X.0Z2O r1 = r10.LLILLL
            X.01eN r7 = r10.LLILLJJLI
            X.00zU r2 = r10.LL
            goto L6a
        L29:
            X.0Z2O r1 = r10.LLILLL
            X.01eN r7 = r10.LLILLJJLI
            X.00zU r3 = r10.LL
            X.C155000ia.LIZIZ(r11)
            goto L51
        L33:
            X.C155000ia.LIZIZ(r11)
            X.00zU r3 = new X.00zU
            r3.<init>()
            X.0Z2O r1 = r10.LLILZLL
            X.1DEV r7 = r1.LJII
            r10.LL = r3
            r10.LLILLJJLI = r7
            r10.LLILLL = r1
            r10.LLILZIL = r8
            java.lang.Object r0 = r7.LIZLLL(r4, r10)
            if (r0 != r5) goto L51
            X.C1C7U.LIZIZ(r9)
            return r5
        L51:
            boolean r0 = r1.LIZLLL     // Catch: java.lang.Throwable -> La8
            if (r0 != 0) goto L76
            X.0YeB r0 = r1.LIZ     // Catch: java.lang.Throwable -> La8
            r10.LL = r3     // Catch: java.lang.Throwable -> La8
            r10.LLILLJJLI = r7     // Catch: java.lang.Throwable -> La8
            r10.LLILLL = r1     // Catch: java.lang.Throwable -> La8
            r10.LLILZ = r3     // Catch: java.lang.Throwable -> La8
            r10.LLILZIL = r2     // Catch: java.lang.Throwable -> La8
            java.lang.Object r11 = r0.LJII(r10)     // Catch: java.lang.Throwable -> La8
            if (r11 != r5) goto L68
            goto La4
        L68:
            r2 = r3
            goto L6d
        L6a:
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Throwable -> La8
        L6d:
            r3.element = r11     // Catch: java.lang.Throwable -> La8
            T r0 = r2.element     // Catch: java.lang.Throwable -> La8
            if (r0 == 0) goto L75
            r1.LIZLLL = r8     // Catch: java.lang.Throwable -> La8
        L75:
            r3 = r2
        L76:
            r7.LIZIZ(r4)
            T r0 = r3.element
            if (r0 == 0) goto L1a
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0Yak r1 = new X.0Yak
            X.0Z2O r0 = r10.LLILZLL
            r1.<init>(r3, r0, r4)
            r10.LL = r4
            r10.LLILLJJLI = r4
            r10.LLILLL = r4
            r10.LLILZ = r4
            r10.LLILZIL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r10, r2, r1)
            if (r0 != r5) goto L1a
            X.C1C7U.LIZIZ(r9)
            return r5
        L9c:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        La4:
            X.C1C7U.LIZIZ(r9)
            return r5
        La8:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La8
            r7.LIZIZ(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C327490Csd.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
