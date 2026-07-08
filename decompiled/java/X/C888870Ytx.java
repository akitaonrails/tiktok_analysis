package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Ytx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.chatlist.impl.feature.messagerequest.notice.engine.MessageRequestNoticeEngine$triggerShow$1", f = "MessageRequestNoticeEngine.kt", l = {97, 67}, m = "invokeSuspend")
public final class C888870Ytx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC383701eN LL;
    public C888890Ytz LLILLJJLI;
    public Object LLILLL;
    public InterfaceC888860Ytw LLILZ;
    public int LLILZIL;
    public final /* synthetic */ C888890Ytz LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C888870Ytx(C888890Ytz c888890Ytz, InterfaceC1364105Vn<? super C888870Ytx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = c888890Ytz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C888870Ytx(this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0067 A[Catch: Exception -> 0x00a9, all -> 0x00b6, PHI: r1 r4 r6
      0x0067: PHI (r1v2 java.util.Iterator) = (r1v1 java.util.Iterator), (r1v3 java.util.Iterator) binds: [B:20:0x0056, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r4v6 X.01eN) = (r4v5 X.01eN), (r4v7 X.01eN) binds: [B:20:0x0056, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0067: PHI (r6v2 X.0Ytz) = (r6v1 X.0Ytz), (r6v3 X.0Ytz) binds: [B:20:0x0056, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE], TryCatch #1 {all -> 0x00b6, blocks: (B:7:0x001e, B:21:0x0067, B:23:0x006d, B:40:0x00b7, B:36:0x00aa, B:15:0x0049, B:17:0x004d, B:20:0x0056), top: B:43:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006d A[Catch: Exception -> 0x00a9, all -> 0x00b6, TryCatch #1 {all -> 0x00b6, blocks: (B:7:0x001e, B:21:0x0067, B:23:0x006d, B:40:0x00b7, B:36:0x00aa, B:15:0x0049, B:17:0x004d, B:20:0x0056), top: B:43:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008e A[Catch: all -> 0x00a5, Exception -> 0x00a7, TRY_LEAVE, TryCatch #4 {Exception -> 0x00a7, all -> 0x00a5, blocks: (B:26:0x0086, B:28:0x008e), top: B:45:0x0086 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0083 -> B:45:0x0086). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) throws java.lang.Throwable {
        /*
            r10 = this;
            java.lang.String r9 = "MessageRequestNoticeEngine@fb1d.triggerShow$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r8 = X.C099R.LJFF()
            int r0 = r10.LLILZIL
            r7 = 2
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L32
            if (r0 == r2) goto L2a
            if (r0 != r7) goto L22
            X.0Ytw r3 = r10.LLILZ
            java.lang.Object r1 = r10.LLILLL
            java.util.Iterator r1 = (java.util.Iterator) r1
            X.0Ytz r6 = r10.LLILLJJLI
            X.01eN r4 = r10.LL
            X.C155000ia.LIZIZ(r11)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            goto L86
        L22:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2a:
            X.0Ytz r6 = r10.LLILLJJLI
            X.01eN r4 = r10.LL
            X.C155000ia.LIZIZ(r11)
            goto L49
        L32:
            X.C155000ia.LIZIZ(r11)
            X.0Ytz r6 = r10.LLILZLL
            X.1DEV r4 = r6.LJI
            r10.LL = r4
            r10.LLILLJJLI = r6
            r10.LLILZIL = r2
            java.lang.Object r0 = r4.LIZLLL(r5, r10)
            if (r0 != r8) goto L49
            X.C1C7U.LIZIZ(r9)
            return r8
        L49:
            boolean r0 = r6.LJFF     // Catch: java.lang.Throwable -> Lb6
            if (r0 == 0) goto L56
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> Lb6
            r4.LIZIZ(r5)
            X.C1C7U.LIZIZ(r9)
            return r0
        L56:
            java.util.Set<X.0Ytw> r3 = r6.LIZLLL     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            Y.AComparatorS33S0000000_14 r1 = new Y.AComparatorS33S0000000_14     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            r0 = 21
            r1.<init>(r0)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            java.util.List r0 = X.C13LP.LJLLLL(r1, r3)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
        L67:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            if (r0 == 0) goto Lad
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            X.0Ytw r3 = (X.InterfaceC888860Ytw) r3     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            android.content.Context r0 = r6.LIZIZ     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            r10.LL = r4     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            r10.LLILLJJLI = r6     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            r10.LLILLL = r1     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            r10.LLILZ = r3     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            r10.LLILZIL = r7     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            java.lang.Object r11 = r3.LJIIIIZZ(r0, r10)     // Catch: java.lang.Exception -> La9 java.lang.Throwable -> Lb6
            if (r11 != r8) goto L86
            goto La1
        L86:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La7
            boolean r0 = r11.booleanValue()     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La7
            if (r0 == 0) goto L67
            r6.LJ = r3     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La7
            r6.LJFF = r2     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La7
            androidx.lifecycle.LifecycleCoroutineScope r2 = r6.LIZJ     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La7
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La7
            X.08pq r1 = X.C2107308Nj.LIZ     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La7
            X.0Yty r0 = new X.0Yty     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La7
            r0.<init>(r6, r3, r5)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La7
            X.C23250099c.LIZLLL(r2, r1, r5, r0, r7)     // Catch: java.lang.Throwable -> La5 java.lang.Exception -> La7
            goto Lad
        La1:
            X.C1C7U.LIZIZ(r9)
            return r8
        La5:
            r0 = move-exception
            goto Lb7
        La7:
            r0 = move-exception
            goto Laa
        La9:
            r0 = move-exception
        Laa:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb6
        Lad:
            r4.LIZIZ(r5)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        Lb6:
            r0 = move-exception
        Lb7:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb6
            r4.LIZIZ(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C888870Ytx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
