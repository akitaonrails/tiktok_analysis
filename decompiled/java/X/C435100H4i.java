package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H4i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommercelive.common.biz.us.billboard.ECBillboardContentView$startAutoSliding$1$1", f = "ECBillboardContentView.kt", l = {415}, m = "invokeSuspend")
public final class C435100H4i extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C1733010vCN LL;
    public Object LLILLJJLI;
    public int LLILLL;
    public int LLILZ;
    public final /* synthetic */ C1733010vCN LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C435100H4i(C1733010vCN c1733010vCN, InterfaceC1364105Vn<? super C435100H4i> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZIL = c1733010vCN;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C435100H4i(this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Path cross not found for [B:31:0x0070, B:37:0x0083], limit reached: 63 */
    /* JADX WARN: Path cross not found for [B:40:0x0088, B:42:0x008d], limit reached: 63 */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0042 A[Catch: all -> 0x00b6, CancellationException -> 0x00be, TryCatch #2 {CancellationException -> 0x00be, all -> 0x00b6, blocks: (B:25:0x0061, B:26:0x0064, B:28:0x0068, B:29:0x006c, B:31:0x0070, B:33:0x0076, B:35:0x007c, B:38:0x0084, B:41:0x008a, B:43:0x008e, B:45:0x009d, B:47:0x00a3, B:48:0x00a6, B:16:0x003c, B:18:0x0042, B:20:0x004a, B:22:0x004e, B:52:0x00af, B:53:0x00b2, B:54:0x00b3, B:9:0x0027, B:11:0x002b, B:13:0x0031, B:15:0x0037), top: B:62:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0068 A[Catch: all -> 0x00b6, CancellationException -> 0x00be, TryCatch #2 {CancellationException -> 0x00be, all -> 0x00b6, blocks: (B:25:0x0061, B:26:0x0064, B:28:0x0068, B:29:0x006c, B:31:0x0070, B:33:0x0076, B:35:0x007c, B:38:0x0084, B:41:0x008a, B:43:0x008e, B:45:0x009d, B:47:0x00a3, B:48:0x00a6, B:16:0x003c, B:18:0x0042, B:20:0x004a, B:22:0x004e, B:52:0x00af, B:53:0x00b2, B:54:0x00b3, B:9:0x0027, B:11:0x002b, B:13:0x0031, B:15:0x0037), top: B:62:0x000d }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00b3 A[Catch: all -> 0x00b6, CancellationException -> 0x00be, TRY_LEAVE, TryCatch #2 {CancellationException -> 0x00be, all -> 0x00b6, blocks: (B:25:0x0061, B:26:0x0064, B:28:0x0068, B:29:0x006c, B:31:0x0070, B:33:0x0076, B:35:0x007c, B:38:0x0084, B:41:0x008a, B:43:0x008e, B:45:0x009d, B:47:0x00a3, B:48:0x00a6, B:16:0x003c, B:18:0x0042, B:20:0x004a, B:22:0x004e, B:52:0x00af, B:53:0x00b2, B:54:0x00b3, B:9:0x0027, B:11:0x002b, B:13:0x0031, B:15:0x0037), top: B:62:0x000d }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x004c -> B:49:0x00a9). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x005e -> B:26:0x0064). Please report as a decompilation issue!!! */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            java.lang.String r10 = "ECBillboardContentView@5ff7.startAutoSliding$1$1"
            X.C1C7U.LIZ(r10)
            java.lang.Object r7 = X.C099R.LJFF()
            int r0 = r11.LLILZ
            r9 = 0
            r6 = 1
            if (r0 == 0) goto L22
            if (r0 != r6) goto L1a
            int r5 = r11.LLILLL
            java.lang.Object r4 = r11.LLILLJJLI
            java.util.Iterator r4 = (java.util.Iterator) r4
            X.0vCN r3 = r11.LL
            goto L61
        L1a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L22:
            X.C155000ia.LIZIZ(r12)
            X.0vCN r3 = r11.LLILZIL
            X.15oD r0 = r3.LLIZ     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r0 == 0) goto Lba
            X.0vDc r0 = r0.getViewItemOperator()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r0 == 0) goto Lba
            java.util.List r0 = r0.LIZ()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r0 == 0) goto Lba
            java.util.Iterator r4 = r0.iterator()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            r1 = 0
        L3c:
            boolean r0 = r4.hasNext()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r0 == 0) goto Lb3
            java.lang.Object r0 = r4.next()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            int r5 = r1 + 1
            if (r1 < 0) goto Laf
            X.0zJl r0 = (X.InterfaceC1891350zJl) r0     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r1 <= 0) goto La9
            long r0 = r3.getLoopInterval()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            r11.LL = r3     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            r11.LLILLJJLI = r4     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            r11.LLILLL = r5     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            r11.LLILZ = r6     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r11)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r0 != r7) goto L64
            goto Lab
        L61:
            X.C155000ia.LIZIZ(r12)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
        L64:
            X.15oD r0 = r3.LLIZ     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r0 == 0) goto L81
            int r8 = r0.getCurrentItem()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
        L6c:
            X.15oD r0 = r3.LLIZ     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r0 == 0) goto L83
            X.0vDc r0 = r0.getViewItemOperator()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r0 == 0) goto L83
            java.util.List r0 = r0.LIZ()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r0 == 0) goto L83
            int r1 = r0.size()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            goto L84
        L81:
            r8 = 0
            goto L6c
        L83:
            r1 = 0
        L84:
            int r0 = r1 + (-1)
            if (r8 >= r0) goto L8d
            if (r1 <= 0) goto L8d
            int r2 = r8 + 1
            goto L8e
        L8d:
            r2 = 0
        L8e:
            X.0H4j r1 = new X.0H4j     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            android.content.Context r0 = r3.getContext()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            r1.<init>(r0, r3)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            r1.LIZ = r2     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            X.15oD r0 = r3.LLIZ     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r0 == 0) goto La6
            androidx.recyclerview.widget.RecyclerView$LayoutManager r0 = r0.getLayoutManager()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            if (r0 == 0) goto La6
            r0.startSmoothScroll(r1)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
        La6:
            r3.LJIIIZ(r8, r2)     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
        La9:
            r1 = r5
            goto L3c
        Lab:
            X.C1C7U.LIZIZ(r10)
            return r7
        Laf:
            X.C1697810uHb.LJIJI()     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            throw r9     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
        Lb3:
            kotlin.Unit r9 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> Lb6 java.util.concurrent.CancellationException -> Lbe
            goto Lba
        Lb6:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lba:
            X.C1C7U.LIZIZ(r10)
            return r9
        Lbe:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C435100H4i.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
