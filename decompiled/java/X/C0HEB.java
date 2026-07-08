package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0HEB, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarSocialAvatarHelper$updateLikeAvatar$1$2$1$2$1", f = "EnlargeAvatarSocialAvatarHelper.kt", l = {}, m = "invokeSuspend")
public final class C0HEB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C442840HYc LL;
    public final /* synthetic */ C0XIR LLILLJJLI;
    public final /* synthetic */ View LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HEB(C442840HYc c442840HYc, C0XIR c0xir, View view, InterfaceC1364105Vn<? super C0HEB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c442840HYc;
        this.LLILLJJLI = c0xir;
        this.LLILLL = view;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0HEB(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnlargeAvatarSocialAvatarHelper@38b.updateLikeAvatar$1$2$1$2$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1389890mGx c1389890mGx = new C1389890mGx(this.LL.LIZ);
        c1389890mGx.LJIIJ(this.LLILLJJLI.getErrorMsg());
        c1389890mGx.LJIIJJI();
        C442840HYc.LJIIL(this.LLILLL, this.LL.LJIJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.updateLikeAvatar$1$2$1$2$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
