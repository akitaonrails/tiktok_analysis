package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.network.spi.INetworkStateService;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.05M3, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05M3 {
    public static final C05M3 LIZ = new C05M3();
    public static final AtomicBoolean LIZIZ = new AtomicBoolean(false);
    public static final C1DEV LIZJ = C2191201ApK.LIZ();

    public static void LIZ(final C05M0 c05m0, final InterfaceC497601wk interfaceC497601wk) {
        INetworkStateService iNetworkStateService;
        AtomicBoolean atomicBoolean = LIZIZ;
        if (atomicBoolean.get() || (iNetworkStateService = (INetworkStateService) ServiceManager.get().getService(INetworkStateService.class)) == null || !atomicBoolean.compareAndSet(false, true)) {
            return;
        }
        iNetworkStateService.observerNetworkChange(new C0CSC() { // from class: X.0596
            @Override // X.C0CSC
            public final void LIZ(EnumC325100Com enumC325100Com) {
                if (enumC325100Com != EnumC325100Com.NOT_AVAILABLE && enumC325100Com != EnumC325100Com.FAKE && C1210404oQ.LIZ()) {
                    C23250099c.LIZLLL(interfaceC497601wk, null, null, new AnonymousClass0595(c05m0, null), 3);
                }
            }
        });
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:42|(2:44|(2:46|77))|48|49|(2:51|78)|53|56|(1:58)|59|(3:61|(2:63|79)|65)|97|68|(2:70|80)|72|38|(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x018b, code lost:
    
        r1 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x018c, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1);
        X.C189200o6.m2constructorimpl(new X.C098200Yq(r1));
        r1 = r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00be A[Catch: all -> 0x01a8, TryCatch #2 {all -> 0x01a8, blocks: (B:38:0x00c3, B:40:0x00c9, B:42:0x00d1, B:44:0x00d5, B:48:0x00ef, B:56:0x0123, B:59:0x012f, B:76:0x018c, B:67:0x015d, B:55:0x0118, B:81:0x019e, B:82:0x01a1, B:83:0x01a2, B:47:0x00ec, B:32:0x00ad, B:35:0x00b6, B:37:0x00be, B:31:0x00a2, B:21:0x0082, B:49:0x00f1, B:53:0x0109, B:52:0x0106, B:61:0x0137, B:65:0x0156, B:64:0x0153), top: B:94:0x001b, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9 A[Catch: all -> 0x01a8, TryCatch #2 {all -> 0x01a8, blocks: (B:38:0x00c3, B:40:0x00c9, B:42:0x00d1, B:44:0x00d5, B:48:0x00ef, B:56:0x0123, B:59:0x012f, B:76:0x018c, B:67:0x015d, B:55:0x0118, B:81:0x019e, B:82:0x01a1, B:83:0x01a2, B:47:0x00ec, B:32:0x00ad, B:35:0x00b6, B:37:0x00be, B:31:0x00a2, B:21:0x0082, B:49:0x00f1, B:53:0x0109, B:52:0x0106, B:61:0x0137, B:65:0x0156, B:64:0x0153), top: B:94:0x001b, inners: #1, #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0137 A[Catch: all -> 0x015c, TRY_ENTER, TryCatch #5 {all -> 0x015c, blocks: (B:61:0x0137, B:65:0x0156, B:64:0x0153), top: B:99:0x0153, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0088 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:69:0x017b -> B:72:0x0181). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.C05M0 r13, X.InterfaceC1364105Vn<? super kotlin.Unit> r14) {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05M3.LIZIZ(X.05M0, X.05Vn):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZJ(X.C05M1 r10, X.InterfaceC1364105Vn<? super java.lang.Boolean> r11) {
        /*
            r9 = this;
            boolean r0 = r11 instanceof X.C05M5
            if (r0 == 0) goto L21
            r6 = r11
            X.05M5 r6 = (X.C05M5) r6
            int r2 = r6.LLILLL
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L21
            int r2 = r2 - r1
            r6.LLILLL = r2
        L12:
            java.lang.Object r1 = r6.LL
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LLILLL
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L2f
            if (r0 != r3) goto L27
            goto L59
        L21:
            X.05M5 r6 = new X.05M5
            r6.<init>(r9, r11)
            goto L12
        L27:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L2f:
            X.C155000ia.LIZIZ(r1)
            java.lang.String r8 = r10.LIZJ     // Catch: java.lang.Throwable -> L64
            java.lang.String r7 = r10.LIZIZ     // Catch: java.lang.Throwable -> L64
            int r0 = r10.LIZLLL     // Catch: java.lang.Throwable -> L64
            java.lang.String r2 = java.lang.String.valueOf(r0)     // Catch: java.lang.Throwable -> L64
            X.011f r1 = com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi.LIZ     // Catch: java.lang.Throwable -> L64
            java.lang.Class<com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi$RealApi> r0 = com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi.RealApi.class
            java.lang.Object r0 = r1.create(r0)     // Catch: java.lang.Throwable -> L64
            com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi$RealApi r0 = (com.ss.android.ugc.aweme.comment.commentlist.api.CommentApi.RealApi) r0     // Catch: java.lang.Throwable -> L64
            X.11NZ r2 = r0.LJ(r8, r7, r2, r4)     // Catch: java.lang.Throwable -> L64
            r0 = 1
            X.11Mn r0 = r2.LJJLIIIJJIZ(r0)     // Catch: java.lang.Throwable -> L64
            r6.LLILLL = r3     // Catch: java.lang.Throwable -> L64
            java.lang.Object r0 = X.C11UD.LIZJ(r0, r6)     // Catch: java.lang.Throwable -> L64
            if (r0 != r5) goto L5c
            return r5
        L59:
            X.C155000ia.LIZIZ(r1)     // Catch: java.lang.Throwable -> L64
        L5c:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r3)     // Catch: java.lang.Throwable -> L64
            X.C189200o6.m2constructorimpl(r2)     // Catch: java.lang.Throwable -> L64
            goto L70
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r2 = new X.00Yq
            r2.<init>(r0)
            X.C189200o6.m2constructorimpl(r2)
        L70:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r4)
            boolean r0 = X.C189200o6.m7isFailureimpl(r2)
            if (r0 == 0) goto L7b
            return r1
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05M3.LIZJ(X.05M1, X.05Vn):java.lang.Object");
    }
}
