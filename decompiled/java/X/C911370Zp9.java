package X;

import com.ss.android.ugc.aweme.im.saas.host.impl.camera.IMCameraBridgeService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Zp9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.saas.host.impl.camera.IMCameraBridgeService$getAccessCriteriaCopy$1", f = "IMCameraBridgeService.kt", l = {371, 373}, m = "invokeSuspend")
public final class C911370Zp9 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ IMCameraBridgeService LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C911370Zp9(IMCameraBridgeService iMCameraBridgeService, String str, Function1<? super String, Unit> function1, InterfaceC1364105Vn<? super C911370Zp9> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = iMCameraBridgeService;
        this.LLILLL = str;
        this.LLILZ = function1;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C911370Zp9(this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0089  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "IMCameraBridgeService@a6bf.getAccessCriteriaCopy$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LL
            r6 = 2
            r2 = 1
            if (r0 == 0) goto L1c
            if (r0 == r2) goto L3d
            if (r0 != r6) goto L8b
            X.C155000ia.LIZIZ(r10)
        L16:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L1c:
            X.C155000ia.LIZIZ(r10)
            X.0i6r r1 = X.C1229870i6r.LIZ
            com.ss.android.ugc.aweme.im.saas.host.impl.camera.IMCameraBridgeService r0 = r9.LLILLJJLI
            r0.getClass()
            boolean r0 = X.C294790Bgz.LIZ()
            if (r0 == 0) goto L3a
            X.0ZpG r0 = X.EnumC911440ZpG.ALL_PUBLIC_GROUP
        L2e:
            r9.LL = r2
            java.lang.Object r10 = r1.LIZ(r0, r9)
            if (r10 != r5) goto L40
            X.C1C7U.LIZIZ(r8)
            return r5
        L3a:
            X.0ZpG r0 = X.EnumC911440ZpG.FAN_GROUP_ONLY
            goto L2e
        L3d:
            X.C155000ia.LIZIZ(r10)
        L40:
            java.util.List r10 = (java.util.List) r10
            r4 = 0
            if (r10 == 0) goto L89
            java.lang.String r7 = r9.LLILLL
            java.util.Iterator r3 = r10.iterator()
        L4b:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L87
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta r0 = (com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta) r0
            com.ss.android.ugc.aweme.publicgroup.data.GroupForPreview r0 = r0.groupInfo
            long r0 = r0.convShortId
            java.lang.String r0 = java.lang.String.valueOf(r0)
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r0, r7)
            if (r0 == 0) goto L4b
        L66:
            com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta r2 = (com.ss.android.ugc.aweme.publicgroup.data.GroupPreviewDisplayMeta) r2
            if (r2 == 0) goto L89
            com.ss.android.ugc.aweme.publicgroup.data.GroupForPreview r0 = r2.groupInfo
            if (r0 == 0) goto L89
            java.lang.String r3 = r0.accessCriteriaDesc
        L70:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r2 = X.C2107308Nj.LIZ
            X.01qV r1 = new X.01qV
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r0 = r9.LLILZ
            r1.<init>(r3, r0, r4)
            r9.LL = r6
            java.lang.Object r0 = X.C23250099c.LJI(r9, r2, r1)
            if (r0 != r5) goto L16
            X.C1C7U.LIZIZ(r8)
            return r5
        L87:
            r2 = r4
            goto L66
        L89:
            r3 = r4
            goto L70
        L8b:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C911370Zp9.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
