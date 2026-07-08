package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H5U, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.standard.ui.ProfileStandardResourceHelperKt$byProfileStandardAttr$2$1", f = "ProfileStandardResourceHelper.kt", l = {}, m = "invokeSuspend")
public final class C0H5U extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C698190Ra5 LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ C197039127h LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H5U(C698190Ra5 c698190Ra5, Integer num, Integer num2, C197039127h c197039127h, InterfaceC1364105Vn<? super C0H5U> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c698190Ra5;
        this.LLILLJJLI = num;
        this.LLILLL = num2;
        this.LLILZ = c197039127h;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H5U(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024 A[PHI: r2
      0x0024: PHI (r2v1 java.lang.Integer) = (r2v0 java.lang.Integer), (r2v2 java.lang.Integer) binds: [B:23:0x0064, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "ProfileStandardResourceHelperKt@e35e.byProfileStandardAttr$2$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            X.0Ra5 r0 = r5.LL
            r3 = 0
            if (r0 == 0) goto L62
            int r0 = r0.LIZ
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)
            int r0 = r2.intValue()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            boolean r0 = X.C0H5S.LIZ(r0)
            if (r0 == 0) goto L62
        L24:
            X.127h r1 = r5.LLILZ
            int r0 = r2.intValue()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            r1.setButtonStartIcon(r0)
        L31:
            X.0Ra5 r0 = r5.LL
            if (r0 == 0) goto L37
            java.lang.Integer r3 = r0.LIZIZ
        L37:
            boolean r0 = X.C0H5S.LIZ(r3)
            if (r0 == 0) goto L54
            X.0Ra5 r0 = r5.LL
            if (r0 == 0) goto L4e
            java.lang.Integer r0 = r0.LIZIZ
            if (r0 == 0) goto L4e
            X.127h r1 = r5.LLILZ
            int r0 = r0.intValue()
            r1.setIconTintColor(r0)
        L4e:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L54:
            java.lang.Integer r0 = r5.LLILLL
            if (r0 == 0) goto L4e
            X.127h r1 = r5.LLILZ
            int r0 = r0.intValue()
            r1.setIconTintColor(r0)
            goto L4e
        L62:
            java.lang.Integer r2 = r5.LLILLJJLI
            if (r2 == 0) goto L31
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H5U.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
