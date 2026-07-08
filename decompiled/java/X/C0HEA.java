package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HEA, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarSocialAvatarHelper$showButtons$2$2", f = "EnlargeAvatarSocialAvatarHelper.kt", l = {}, m = "invokeSuspend")
public final class C0HEA extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C442840HYc LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HEA(C442840HYc c442840HYc, InterfaceC1364105Vn<? super C0HEA> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c442840HYc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HEA(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnlargeAvatarSocialAvatarHelper@38b.showButtons$2$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C442840HYc c442840HYc = this.LL;
        View view = (View) c442840HYc.LJIL.getValue();
        C442840HYc.LJIIL(view, c442840HYc.LJIJJLI);
        C948503nH.LJIILIIL(view, null, new C0HE9(c442840HYc, view, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.showButtons$2$2");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
