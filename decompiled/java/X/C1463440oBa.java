package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0oBa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.StickPointVideoPresenter$startDefaultStickPointNew$1$3", f = "StickPointVideoPresenter.kt", l = {}, m = "invokeSuspend")
public final class C1463440oBa extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ int LL;
    public final /* synthetic */ InterfaceC358010E1v LLILLJJLI;
    public final /* synthetic */ C1463030oAv LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ boolean LLILZIL;
    public final /* synthetic */ List<Integer> LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1463440oBa(int i, InterfaceC358010E1v interfaceC358010E1v, C1463030oAv c1463030oAv, int i2, boolean z, List<Integer> list, InterfaceC1364105Vn<? super C1463440oBa> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = i;
        this.LLILLJJLI = interfaceC358010E1v;
        this.LLILLL = c1463030oAv;
        this.LLILZ = i2;
        this.LLILZIL = z;
        this.LLILZLL = list;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1463440oBa(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.String r4 = "StickPointVideoPresenter@671e.startDefaultStickPointNew$1$3"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            int r1 = r5.LL
            r0 = -1
            if (r1 != r0) goto L1d
            X.0E1v r0 = r5.LLILLJJLI
            if (r0 == 0) goto L34
            r0.onFailed()
            kotlin.Unit r0 = kotlin.Unit.LIZ
        L19:
            X.C1C7U.LIZIZ(r4)
            return r0
        L1d:
            X.0oAv r3 = r5.LLILLL
            int r2 = r5.LLILZ
            boolean r1 = r5.LLILZIL
            java.util.List<java.lang.Integer> r0 = r5.LLILZLL
            r3.LJFF(r2, r1, r0)
            X.0E1v r1 = r5.LLILLJJLI
            if (r1 == 0) goto L34
            int r0 = r5.LL
            r1.LIZ(r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            goto L19
        L34:
            r0 = 0
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1463440oBa.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
