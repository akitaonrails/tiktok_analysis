package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.utils.PollOrderManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.03Lw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.utils.PollOrderManager$queryOrderStateInternal$1", f = "PollOrderManager.kt", l = {77}, m = "invokeSuspend")
public final class C829403Lw extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public PollOrderManager LL;
    public int LLILLJJLI;
    public final /* synthetic */ PollOrderManager LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C829403Lw(PollOrderManager pollOrderManager, InterfaceC1364105Vn<? super C829403Lw> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = pollOrderManager;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C829403Lw(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0042 A[Catch: all -> 0x0046, TRY_LEAVE, TryCatch #0 {all -> 0x0046, blocks: (B:18:0x0039, B:19:0x003c, B:20:0x003e, B:22:0x0042, B:9:0x001f, B:11:0x0025, B:13:0x0029), top: B:29:0x000d }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "PollOrderManager@2b6b.queryOrderStateInternal$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LLILLJJLI
            r4 = 0
            r3 = 1
            if (r0 == 0) goto L1c
            if (r0 != r3) goto L14
            com.ss.android.ugc.aweme.ecommerce.base.osp.utils.PollOrderManager r2 = r7.LL
            goto L39
        L14:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1c:
            X.C155000ia.LIZIZ(r8)
            com.ss.android.ugc.aweme.ecommerce.base.osp.utils.PollOrderManager r2 = r7.LLILLL     // Catch: java.lang.Throwable -> L46
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest r1 = r2.LIZJ     // Catch: java.lang.Throwable -> L46
            if (r1 == 0) goto L53
            X.03WX r0 = r2.LIZIZ     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L37
            r7.LL = r2     // Catch: java.lang.Throwable -> L46
            r7.LLILLJJLI = r3     // Catch: java.lang.Throwable -> L46
            java.lang.Object r8 = r0.LJJJJJL(r1, r7)     // Catch: java.lang.Throwable -> L46
            if (r8 != r5) goto L3c
            X.C1C7U.LIZIZ(r6)
            return r5
        L37:
            r8 = r4
            goto L3e
        L39:
            X.C155000ia.LIZIZ(r8)     // Catch: java.lang.Throwable -> L46
        L3c:
            X.03NA r8 = (X.C03NA) r8     // Catch: java.lang.Throwable -> L46
        L3e:
            X.03Ly r0 = r2.LIZLLL     // Catch: java.lang.Throwable -> L46
            if (r0 == 0) goto L53
            r0.LIZLLL(r8)     // Catch: java.lang.Throwable -> L46
            goto L53
        L46:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            com.ss.android.ugc.aweme.ecommerce.base.osp.utils.PollOrderManager r0 = r7.LLILLL
            X.03Ly r0 = r0.LIZLLL
            if (r0 == 0) goto L53
            r0.LIZLLL(r4)
        L53:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C829403Lw.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
