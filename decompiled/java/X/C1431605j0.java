package X;

import com.ss.android.ugc.aweme.lemon8.Lemon8AnchorHelper;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05j0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.multi.maker.AbsLemon8AnchorMaker$reportShowToAF$1", f = "AbsLemon8AnchorMaker.kt", l = {}, m = "invokeSuspend")
public final class C1431605j0 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AbstractC1064990dov LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1431605j0(AbstractC1064990dov abstractC1064990dov, InterfaceC1364105Vn<? super C1431605j0> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = abstractC1064990dov;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1431605j0(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AbsLemon8AnchorMaker@c606.reportShowToAF$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLJIJIL = true;
        Lemon8AnchorHelper.LIZ.getClass();
        Lemon8AnchorHelper.LIZLLL("tiktok_anchor_create");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AbsLemon8AnchorMaker@c606.reportShowToAF$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
