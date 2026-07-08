package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LtD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ailivephoto.AILivePhotoRestoreTaskHandler$restoreTask$1", f = "AILivePhotoRestoreTaskHandler.kt", l = {73, 75, 77, 80}, m = "invokeSuspend")
public final class C557170LtD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public C0LSZ LL;
    public int LLILLJJLI;
    public final /* synthetic */ C557190LtF LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C557170LtD(C557190LtF c557190LtF, InterfaceC1364105Vn<? super C557170LtD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c557190LtF;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C557170LtD(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00b5  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.String r8 = "AILivePhotoRestoreTaskHandler@7924.restoreTask$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r9.LLILLJJLI
            r6 = 4
            r4 = 3
            r7 = 2
            r2 = 1
            if (r0 == 0) goto L22
            if (r0 == r2) goto L3d
            if (r0 == r7) goto L8c
            if (r0 == r4) goto L8c
            if (r0 != r6) goto Lb9
            X.C155000ia.LIZIZ(r10)
        L1c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L22:
            X.C155000ia.LIZIZ(r10)
            X.0LtF r0 = r9.LLILLL
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = r0.LIZ()
            if (r1 == 0) goto Lc1
            X.0LtF r0 = r9.LLILLL
            java.lang.String r0 = r0.LIZ
            r9.LLILLJJLI = r2
            java.lang.Object r10 = r1.LIZJ(r0, r9)
            if (r10 != r5) goto L40
            X.C1C7U.LIZIZ(r8)
            return r5
        L3d:
            X.C155000ia.LIZIZ(r10)
        L40:
            r3 = r10
            X.0LSZ r3 = (X.C0LSZ) r3
            if (r3 == 0) goto Lc1
            X.0LtF r1 = r9.LLILLL
            boolean r0 = r1.LJ
            if (r0 == 0) goto L68
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r2 = r1.LIZ()
            if (r2 == 0) goto L91
            java.lang.String r1 = r3.LIZ
            X.0LtF r0 = r9.LLILLL
            X.01GW r0 = r0.LJFF
            r0.getValue()
            r9.LL = r3
            r9.LLILLJJLI = r7
            java.lang.Object r0 = r2.LJIIJJI(r1, r9)
            if (r0 != r5) goto L91
            X.C1C7U.LIZIZ(r8)
            return r5
        L68:
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r2 = r1.LIZ()
            if (r2 == 0) goto L91
            java.lang.String r0 = r3.LIZ
            java.util.List r1 = java.util.Collections.singletonList(r0)
            X.0LtF r0 = r9.LLILLL
            X.01GW r0 = r0.LJFF
            java.lang.Object r0 = r0.getValue()
            java.lang.String r0 = (java.lang.String) r0
            r9.LL = r3
            r9.LLILLJJLI = r4
            java.lang.Object r0 = r2.LJIJI(r0, r1, r9)
            if (r0 != r5) goto L91
            X.C1C7U.LIZIZ(r8)
            return r5
        L8c:
            X.0LSZ r3 = r9.LL
            X.C155000ia.LIZIZ(r10)
        L91:
            X.0LtF r0 = r9.LLILLL
            com.ss.android.ugc.aweme.aigc.asynctask.ICreationAsyncTaskManager r1 = r0.LIZ()
            r4 = 0
            if (r1 == 0) goto L1c
            java.lang.String r0 = r3.LIZ
            X.01Wa r3 = r1.LJJJJL(r0)
            if (r3 == 0) goto L1c
            Y.AgS289S0100000_8 r2 = new Y.AgS289S0100000_8
            X.0LtF r1 = r9.LLILLL
            r0 = 8
            r2.<init>(r1, r0)
            r9.LL = r4
            r9.LLILLJJLI = r6
            java.lang.Object r0 = r3.collect(r2, r9)
            if (r0 != r5) goto L1c
            X.C1C7U.LIZIZ(r8)
            return r5
        Lb9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        Lc1:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C557170LtD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
