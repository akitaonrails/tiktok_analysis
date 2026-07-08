package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Lyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.aiplayground.panel.component.AIPlaygroundLoadingComponent$showErrorToast$2", f = "AIPlaygroundLoadingComponent.kt", l = {}, m = "invokeSuspend")
public final class C560590Lyj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C560580Lyi LL;
    public final /* synthetic */ C377760ErW LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C560590Lyj(C560580Lyi c560580Lyi, C377760ErW c377760ErW, InterfaceC1364105Vn<? super C560590Lyj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c560580Lyi;
        this.LLILLJJLI = c377760ErW;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C560590Lyj(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIPlaygroundLoadingComponent@75a3.showErrorToast$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C384040F3y c384040F3y = C384040F3y.LIZ;
        C19EG c19eg = this.LL.LLJJ;
        C377760ErW c377760ErW = this.LLILLJJLI;
        c384040F3y.getClass();
        if (c377760ErW != null) {
            String strLIZ = C384040F3y.LIZ(c19eg, c377760ErW);
            if (!c19eg.isFinishing()) {
                C1389890mGx c1389890mGx = new C1389890mGx(c19eg);
                c1389890mGx.LJIIJ(strLIZ);
                c1389890mGx.LIZ(false);
                c1389890mGx.LJIIJJI();
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIPlaygroundLoadingComponent@75a3.showErrorToast$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
