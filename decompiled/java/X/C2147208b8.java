package X;

import com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08b8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.homepage.landing.ForceBackFYPViewModel$switchFYP$2", f = "ForceBackFYPViewModel.kt", l = {}, m = "invokeSuspend")
public final class C2147208b8 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ ForceBackFYPViewModel LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2147208b8(ForceBackFYPViewModel forceBackFYPViewModel, InterfaceC1364105Vn<? super C2147208b8> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = forceBackFYPViewModel;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2147208b8(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ForceBackFYPViewModel@d6ab.switchFYP$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.LLILLJJLI.TQ2(C799520VXy.LIZ(new Pair("fromStart", "MainFragment")), "For You", false);
        int i = C2187451AjH.LIZ;
        C1720106oR.LJI("LandingFYP", "switch to fyp!");
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ForceBackFYPViewModel@d6ab.switchFYP$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
