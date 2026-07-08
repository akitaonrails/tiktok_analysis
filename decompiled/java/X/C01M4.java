package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.01M4, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.mall.feedreach.ecvideoguide.EcVideoGuideAssem$showNoAnchorGuide$3", f = "EcVideoGuideAssem.kt", l = {}, m = "invokeSuspend")
public final class C01M4 extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ Function1<Integer, Unit> LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C01M4(Function1<? super Integer, Unit> function1, InterfaceC1364105Vn<? super C01M4> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = function1;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EcVideoGuideAssem@5df3.showNoAnchorGuide$3");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invoke(C2286608xc.LJ(2));
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EcVideoGuideAssem@5df3.showNoAnchorGuide$3");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C01M4(this.LL, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
