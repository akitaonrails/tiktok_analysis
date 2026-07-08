package X;

import com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0NMx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController$callApi$2", f = "BlockUserController.kt", l = {257, 257, 260, 269}, m = "invokeSuspend")
public final class C592810NMx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public BlockUserController LL;
    public int LLILLJJLI;
    public final /* synthetic */ BlockUserController LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C592810NMx(BlockUserController blockUserController, String str, String str2, int i, InterfaceC1364105Vn<? super C592810NMx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = blockUserController;
        this.LLILZ = str;
        this.LLILZIL = str2;
        this.LLILZLL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C592810NMx(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x005f A[Catch: Exception -> 0x008b, TryCatch #0 {Exception -> 0x008b, blocks: (B:35:0x007f, B:36:0x0082, B:24:0x0058, B:25:0x005b, B:27:0x005f, B:29:0x0067, B:32:0x006d, B:18:0x0046, B:19:0x0049, B:21:0x004d, B:37:0x0085, B:13:0x0029, B:15:0x0035), top: B:52:0x0010 }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.String r11 = "BlockUserController@aeb9.callApi$2"
            X.C1C7U.LIZ(r11)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r12.LLILLJJLI
            r6 = 4
            r3 = 3
            r10 = 2
            r9 = 1
            r4 = 0
            if (r0 == 0) goto L26
            if (r0 == r9) goto L23
            if (r0 == r10) goto L58
            if (r0 == r3) goto L7f
            if (r0 != r6) goto La8
            X.C155000ia.LIZIZ(r13)
        L1d:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L23:
            com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController r8 = r12.LL
            goto L46
        L26:
            X.C155000ia.LIZIZ(r13)
            com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController r8 = r12.LLILLL     // Catch: java.lang.Exception -> L8b
            java.lang.Class<com.ss.android.ugc.aweme.im.common.util.IImApiUtil> r0 = com.ss.android.ugc.aweme.im.common.util.IImApiUtil.class
            java.lang.Object r7 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpiForReal(r0)     // Catch: java.lang.Exception -> L8b
            com.ss.android.ugc.aweme.im.common.util.IImApiUtil r7 = (com.ss.android.ugc.aweme.im.common.util.IImApiUtil) r7     // Catch: java.lang.Exception -> L8b
            if (r7 == 0) goto L85
            java.lang.String r2 = r12.LLILZ     // Catch: java.lang.Exception -> L8b
            java.lang.String r1 = r12.LLILZIL     // Catch: java.lang.Exception -> L8b
            int r0 = r12.LLILZLL     // Catch: java.lang.Exception -> L8b
            r12.LL = r8     // Catch: java.lang.Exception -> L8b
            r12.LLILLJJLI = r9     // Catch: java.lang.Exception -> L8b
            java.lang.Object r13 = r7.LIZ(r2, r1, r0, r12)     // Catch: java.lang.Exception -> L8b
            if (r13 != r5) goto L49
            goto Lb0
        L46:
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Exception -> L8b
        L49:
            com.ss.android.ugc.aweme.im.common.model.BlockResponse r13 = (com.ss.android.ugc.aweme.im.common.model.BlockResponse) r13     // Catch: java.lang.Exception -> L8b
            if (r13 == 0) goto L85
            r12.LL = r4     // Catch: java.lang.Exception -> L8b
            r12.LLILLJJLI = r10     // Catch: java.lang.Exception -> L8b
            java.lang.Object r0 = r8.LJIIIIZZ(r13, r12)     // Catch: java.lang.Exception -> L8b
            if (r0 != r5) goto L5b
            goto Lb4
        L58:
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Exception -> L8b
        L5b:
            int r0 = r12.LLILZLL     // Catch: java.lang.Exception -> L8b
            if (r0 != r9) goto L1d
            com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController r2 = r12.LLILLL     // Catch: java.lang.Exception -> L8b
            android.app.Activity r1 = r2.LL     // Catch: java.lang.Exception -> L8b
            boolean r0 = r1 instanceof X.C19EG     // Catch: java.lang.Exception -> L8b
            if (r0 == 0) goto L6a
            X.19EG r1 = (X.C19EG) r1     // Catch: java.lang.Exception -> L8b
            goto L6b
        L6a:
            r1 = r4
        L6b:
            if (r1 == 0) goto L1d
            X.1DFH r0 = X.C0PEM.LIZ     // Catch: java.lang.Exception -> L8b
            X.08pq r1 = X.C2107308Nj.LIZ     // Catch: java.lang.Exception -> L8b
            X.0NMy r0 = new X.0NMy     // Catch: java.lang.Exception -> L8b
            r0.<init>(r2, r4)     // Catch: java.lang.Exception -> L8b
            r12.LLILLJJLI = r3     // Catch: java.lang.Exception -> L8b
            java.lang.Object r13 = X.C23250099c.LJI(r12, r1, r0)     // Catch: java.lang.Exception -> L8b
            if (r13 != r5) goto L82
            goto Lb8
        L7f:
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Exception -> L8b
        L82:
            kotlin.Unit r13 = (kotlin.Unit) r13     // Catch: java.lang.Exception -> L8b
            goto L1d
        L85:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Exception -> L8b
            X.C1C7U.LIZIZ(r11)     // Catch: java.lang.Exception -> L8b
            goto Lbc
        L8b:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.0NNU r1 = new X.0NNU
            com.ss.android.ugc.aweme.im.sdk.common.controller.block.BlockUserController r0 = r12.LLILLL
            r1.<init>(r0, r3, r4)
            r12.LL = r4
            r12.LLILLJJLI = r6
            java.lang.Object r0 = X.C23250099c.LJI(r12, r2, r1)
            if (r0 != r5) goto L1d
            X.C1C7U.LIZIZ(r11)
            return r5
        La8:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lb0:
            X.C1C7U.LIZIZ(r11)
            return r5
        Lb4:
            X.C1C7U.LIZIZ(r11)
            return r5
        Lb8:
            X.C1C7U.LIZIZ(r11)
            return r5
        Lbc:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C592810NMx.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
