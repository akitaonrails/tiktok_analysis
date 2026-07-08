package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0tTc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.social.creation.common.toolbar.ExpandableScrollableToolbarLayoutKt$ExpandableScrollableToolbarLayout2$5$1", f = "ExpandableScrollableToolbarLayout.kt", l = {}, m = "invokeSuspend")
public final class C1666820tTc extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1665510tRV<Unit> LLILLJJLI;
    public final /* synthetic */ C1666830tTd LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1666820tTc(C1665510tRV<Unit> c1665510tRV, C1666830tTd c1666830tTd, InterfaceC1364105Vn<? super C1666820tTc> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = c1665510tRV;
        this.LLILLL = c1666830tTd;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1666820tTc c1666820tTc = new C1666820tTc(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1666820tTc.LL = obj;
        return c1666820tTc;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [T, kotlin.Unit] */
    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ExpandableScrollableToolbarLayoutKt@66be.ExpandableScrollableToolbarLayout2$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1665510tRV<Unit> c1665510tRV = this.LLILLJJLI;
        if (c1665510tRV.LIZ != null) {
            C1666830tTd c1666830tTd = this.LLILLL;
            c1666830tTd.LIZ = 0;
            c1666830tTd.LIZIZ = 0;
            c1666830tTd.LIZJ = false;
        } else {
            c1665510tRV.LIZ = Unit.LIZ;
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ExpandableScrollableToolbarLayoutKt@66be.ExpandableScrollableToolbarLayout2$5$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
