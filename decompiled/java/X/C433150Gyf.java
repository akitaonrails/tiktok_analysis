package X;

import com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gyf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem$asyncInitView$1$outlineProvider$1", f = "TakoKeyboardCustomButtonAssem.kt", l = {}, m = "invokeSuspend")
public final class C433150Gyf extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C417890Ga3>, Object> {
    public final /* synthetic */ TakoKeyboardCustomButtonAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433150Gyf(TakoKeyboardCustomButtonAssem takoKeyboardCustomButtonAssem, InterfaceC1364105Vn<? super C433150Gyf> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = takoKeyboardCustomButtonAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433150Gyf(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x003d  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "TakoKeyboardCustomButtonAssem@7e7.asyncInitView$1$outlineProvider$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            X.0Ga3 r3 = new X.0Ga3
            r3.<init>()
            com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem r0 = r5.LL
            int r0 = r0.LLJLIL
            int r2 = com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem.mp(r0)
            r0 = 44
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)
            float r0 = X.C418440Gaw.LIZIZ(r0)
            int r0 = X.C814420VxA.LIZIZ(r0)
            int r2 = r2 - r0
            com.ss.android.ugc.aweme.search.pages.middlepage.takoentrance.ui.TakoKeyboardCustomButtonAssem r0 = r5.LL
            android.content.Context r0 = r0.getContext()
            if (r0 == 0) goto L3d
            boolean r1 = X.C426750GoL.LIZLLL(r0)
            r0 = 1
            if (r1 != r0) goto L3d
        L36:
            r3.LIZ(r2, r0)
            X.C1C7U.LIZIZ(r4)
            return r3
        L3d:
            r0 = 0
            goto L36
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C433150Gyf.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C417890Ga3> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
