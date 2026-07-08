package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LPE, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.portrait.notify.push.AIPortraitGenerationPushProcessor$isAsyncTaskDownloadFinished$state$1$1", f = "AIPortraitGenerationPushProcessor.kt", l = {136, 137}, m = "invokeSuspend")
public final class C0LPE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1346605Ou>, Object> {
    public int LL;
    public final /* synthetic */ C0LPC LLILLJJLI;
    public final /* synthetic */ String LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LPE(C0LPC c0lpc, String str, InterfaceC1364105Vn<? super C0LPE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c0lpc;
        this.LLILLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LPE(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "AIPortraitGenerationPushProcessor@e693.isAsyncTaskDownloadFinished$state$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r7.LL
            r2 = 0
            r4 = 2
            r3 = 1
            if (r0 == 0) goto L23
            if (r0 == r3) goto L36
            if (r0 != r4) goto L55
            X.C155000ia.LIZIZ(r8)
        L17:
            X.0LiW r8 = (X.InterfaceC550540LiW) r8
            if (r8 == 0) goto L1f
            java.lang.Object r2 = X.C550520LiU.LIZ(r8)
        L1f:
            X.C1C7U.LIZIZ(r6)
            return r2
        L23:
            X.C155000ia.LIZIZ(r8)
            X.0LPC r1 = r7.LLILLJJLI
            java.lang.String r0 = r7.LLILLL
            r7.LL = r3
            java.lang.Object r8 = r1.LJFF(r0, r7)
            if (r8 != r5) goto L39
            X.C1C7U.LIZIZ(r6)
            return r5
        L36:
            X.C155000ia.LIZIZ(r8)
        L39:
            X.0LmO r8 = (X.C552940LmO) r8
            if (r8 != 0) goto L41
            X.C1C7U.LIZIZ(r6)
            return r2
        L41:
            X.0LPC r0 = r7.LLILLJJLI
            com.ss.android.ugc.aweme.aigc.graph.api.AIGCWorkflowManagementApi r1 = r0.LIZIZ
            if (r1 == 0) goto L1f
            java.lang.String r0 = r8.LIZ
            r7.LL = r4
            java.lang.Object r8 = r1.LIZ(r0, r7)
            if (r8 != r5) goto L17
            X.C1C7U.LIZIZ(r6)
            return r5
        L55:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LPE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1346605Ou> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
