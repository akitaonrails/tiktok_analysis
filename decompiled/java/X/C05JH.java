package X;

import com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05JH, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage$initPollingMode$1", f = "ViewerWishesQueuePage.kt", l = {210, 211}, m = "invokeSuspend")
public final class C05JH extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ViewerWishesQueuePage LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05JH(ViewerWishesQueuePage viewerWishesQueuePage, InterfaceC1364105Vn<? super C05JH> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = viewerWishesQueuePage;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05JH c05jh = new C05JH(this.LLILLL, interfaceC1364105Vn);
        c05jh.LLILLJJLI = obj;
        return c05jh;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0036 A[Catch: CancellationException -> 0x006f, Exception -> 0x0074, TryCatch #2 {CancellationException -> 0x006f, Exception -> 0x0074, blocks: (B:11:0x002d, B:12:0x0030, B:14:0x0036, B:18:0x0050, B:17:0x004d), top: B:31:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0066  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x0064 -> B:12:0x0030). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "ViewerWishesQueuePage@a1a.initPollingMode$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 2
            r5 = 1
            if (r0 == 0) goto L25
            if (r0 == r5) goto L20
            if (r0 != r6) goto L18
            java.lang.Object r4 = r9.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            goto L2d
        L18:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L20:
            java.lang.Object r4 = r9.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            goto L4d
        L25:
            X.C155000ia.LIZIZ(r10)
            java.lang.Object r4 = r9.LLILLJJLI
            X.01wk r4 = (X.InterfaceC497601wk) r4
            goto L30
        L2d:
            X.C155000ia.LIZIZ(r10)     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
        L30:
            boolean r0 = X.C2296808zG.LJI(r4)     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            if (r0 == 0) goto L78
            X.01GW<java.lang.Long> r0 = X.C2176871AHl.LJII     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            java.lang.Object r0 = r0.getValue()     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            java.lang.Number r0 = (java.lang.Number) r0     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            long r0 = r0.longValue()     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            r9.LLILLJJLI = r4     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            r9.LL = r5     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r9)     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            if (r0 != r7) goto L50
            goto L67
        L4d:
            X.C155000ia.LIZIZ(r10)     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
        L50:
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            X.08pq r3 = X.C2107308Nj.LIZ     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            X.05JI r2 = new X.05JI     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            com.bytedance.android.livesdk.viewerwishestmp.queue.ViewerWishesQueuePage r1 = r9.LLILLL     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            r0 = 0
            r2.<init>(r1, r0)     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            r9.LLILLJJLI = r4     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            r9.LL = r6     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            java.lang.Object r0 = X.C23250099c.LJI(r9, r3, r2)     // Catch: java.util.concurrent.CancellationException -> L6f java.lang.Exception -> L74
            if (r0 != r7) goto L30
            goto L6b
        L67:
            X.C1C7U.LIZIZ(r8)
            return r7
        L6b:
            X.C1C7U.LIZIZ(r8)
            return r7
        L6f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L78
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L78:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05JH.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
