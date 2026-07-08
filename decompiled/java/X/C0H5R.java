package X;

import com.bytedance.tux.icon.TuxIconView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H5R, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.platform.standard.ui.ProfileStandardResourceHelperKt$byProfileStandardAttr$1$1", f = "ProfileStandardResourceHelper.kt", l = {}, m = "invokeSuspend")
public final class C0H5R extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C698190Ra5 LL;
    public final /* synthetic */ Integer LLILLJJLI;
    public final /* synthetic */ Integer LLILLL;
    public final /* synthetic */ TuxIconView LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H5R(C698190Ra5 c698190Ra5, Integer num, Integer num2, TuxIconView tuxIconView, Function0<Unit> function0, InterfaceC1364105Vn<? super C0H5R> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c698190Ra5;
        this.LLILLJJLI = num;
        this.LLILLL = num2;
        this.LLILZ = tuxIconView;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H5R(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0024 A[PHI: r2
      0x0024: PHI (r2v1 java.lang.Integer) = (r2v0 java.lang.Integer), (r2v2 java.lang.Integer) binds: [B:31:0x0078, B:5:0x0022] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "ProfileStandardResourceHelperKt@e35e.byProfileStandardAttr$1$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            X.0Ra5 r0 = r5.LL
            r3 = 0
            if (r0 == 0) goto L76
            int r0 = r0.LIZ
            java.lang.Integer r2 = X.C2286608xc.LJ(r0)
            int r0 = r2.intValue()
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            boolean r0 = X.C0H5S.LIZ(r0)
            if (r0 == 0) goto L76
        L24:
            com.bytedance.tux.icon.TuxIconView r1 = r5.LLILZ
            int r0 = r2.intValue()
            r1.setIconRes(r0)
        L2d:
            X.0Ra5 r0 = r5.LL
            if (r0 == 0) goto L33
            java.lang.Integer r3 = r0.LIZIZ
        L33:
            boolean r0 = X.C0H5S.LIZ(r3)
            if (r0 == 0) goto L57
            X.0Ra5 r0 = r5.LL
            if (r0 == 0) goto L4a
            java.lang.Integer r0 = r0.LIZIZ
            if (r0 == 0) goto L4a
            com.bytedance.tux.icon.TuxIconView r1 = r5.LLILZ
            int r0 = r0.intValue()
            r1.setTintColor(r0)
        L4a:
            kotlin.jvm.functions.Function0<kotlin.Unit> r0 = r5.LLILZIL
            if (r0 == 0) goto L51
            r0.invoke()
        L51:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r4)
            return r0
        L57:
            java.lang.Integer r0 = r5.LLILLL
            if (r0 == 0) goto L68
            int r1 = r0.intValue()
            r0 = -1
            if (r1 != r0) goto L68
            com.bytedance.tux.icon.TuxIconView r0 = r5.LLILZ
            r0.LIZ()
            goto L4a
        L68:
            java.lang.Integer r0 = r5.LLILLL
            if (r0 == 0) goto L4a
            com.bytedance.tux.icon.TuxIconView r1 = r5.LLILZ
            int r0 = r0.intValue()
            r1.setTintColor(r0)
            goto L4a
        L76:
            java.lang.Integer r2 = r5.LLILLJJLI
            if (r2 == 0) goto L2d
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0H5R.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
