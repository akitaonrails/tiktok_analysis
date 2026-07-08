package X;

import com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0xIA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
@C09DV(c = "com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog$onViewCreated$2", f = "AutoPostLivingPanelDialog.kt", l = {}, m = "invokeSuspend")
public final class C1813480xIA extends C09AX implements Function2<C1813430xI5<Boolean>, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ AutoPostLivingPanelDialog LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1813480xIA(AutoPostLivingPanelDialog autoPostLivingPanelDialog, InterfaceC1364105Vn<? super C1813480xIA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = autoPostLivingPanelDialog;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1813480xIA c1813480xIA = new C1813480xIA(this.LLILLJJLI, interfaceC1364105Vn);
        c1813480xIA.LL = obj;
        return c1813480xIA;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0035  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "AutoPostLivingPanelDialog@f7a.onViewCreated$2"
            X.C1C7U.LIZ(r5)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r7)
            java.lang.Object r4 = r6.LL
            X.0xI5 r4 = (X.C1813430xI5) r4
            com.ss.android.ugc.aweme.live.livehostimpl.livereply.autopost.AutoPostLivingPanelDialog r3 = r6.LLILLJJLI
            r3.getClass()
            X.0xI2 r0 = r4.LIZ
            int[] r1 = X.C1813420xI4.LIZ
            int r0 = r0.ordinal()
            r2 = r1[r0]
            r1 = 1
            if (r2 == r1) goto L35
            r0 = 3
            if (r2 == r0) goto L2d
            r0 = 4
            if (r2 == r0) goto L35
        L27:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L2d:
            X.18qq r0 = r3.LLLFF
            if (r0 == 0) goto L27
            r0.setLoading(r1)
            goto L27
        L35:
            X.18qq r0 = r3.LLLFF
            r2 = 0
            if (r0 == 0) goto L3d
            r0.setLoading(r2)
        L3d:
            X.18qq r1 = r3.LLLFF
            if (r1 == 0) goto L45
            r0 = 0
            X.C786410Ut5.C7(r1, r0)
        L45:
            X.18qq r1 = r3.LLLFF
            if (r1 == 0) goto L56
            T r0 = r4.LIZIZ
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L53
            boolean r2 = r0.booleanValue()
        L53:
            r1.setChecked(r2)
        L56:
            X.18qq r1 = r3.LLLFF
            if (r1 == 0) goto L27
            X.0yck r0 = r3.LLLIIL
            X.C786410Ut5.C7(r1, r0)
            goto L27
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1813480xIA.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1813430xI5<Boolean> c1813430xI5, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c1813430xI5, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
