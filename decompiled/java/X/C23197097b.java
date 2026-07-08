package X;

import kotlin.Unit;

/* JADX INFO: renamed from: X.097b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.bytedance.android.livesdk.comp.impl.pcs.business.foundation.smbstate.SmbStateServiceImpl$audienceLiveEntranceVisible$1", f = "SmbStateServiceImpl.kt", l = {}, m = "invokeSuspend")
public final class C23197097b extends C09AX implements InterfaceC1631630sYr<C1889107ab, C1889207ac, Boolean, InterfaceC1364105Vn<? super Boolean>, Object> {
    public /* synthetic */ C1889107ab LL;
    public /* synthetic */ C1889207ac LLILLJJLI;
    public /* synthetic */ boolean LLILLL;
    public final /* synthetic */ C1142280fpa LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23197097b(C1142280fpa c1142280fpa, InterfaceC1364105Vn<? super C23197097b> interfaceC1364105Vn) {
        super(4, interfaceC1364105Vn);
        this.LLILZ = c1142280fpa;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0020  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "SmbStateServiceImpl@d96b.audienceLiveEntranceVisible$1"
            X.C1C7U.LIZ(r6)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r8)
            X.07ab r2 = r7.LL
            X.07ac r1 = r7.LLILLJJLI
            boolean r5 = r7.LLILLL
            X.0fpa r0 = r7.LLILZ
            r0.getClass()
            r3 = 0
            if (r2 == 0) goto L2a
            long r1 = r2.LIZ
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L33
        L20:
            r0 = r5 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L26:
            X.C1C7U.LIZIZ(r6)
            return r0
        L2a:
            if (r1 == 0) goto L36
            long r1 = r1.LIZJ
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L33
            goto L20
        L33:
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            goto L26
        L36:
            r0 = 0
            goto L26
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C23197097b.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // X.InterfaceC1631630sYr
    public final Object invoke(C1889107ab c1889107ab, C1889207ac c1889207ac, Boolean bool, InterfaceC1364105Vn<? super Boolean> interfaceC1364105Vn) {
        boolean zBooleanValue = bool.booleanValue();
        C23197097b c23197097b = new C23197097b(this.LLILZ, interfaceC1364105Vn);
        c23197097b.LL = c1889107ab;
        c23197097b.LLILLJJLI = c1889207ac;
        c23197097b.LLILLL = zBooleanValue;
        return c23197097b.invokeSuspend(Unit.LIZ);
    }
}
