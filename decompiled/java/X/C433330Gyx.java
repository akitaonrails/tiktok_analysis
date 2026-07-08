package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Gyx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.socialavatar.views.SocialAvatarNewStickersCollageView$load$1$1", f = "SocialAvatarNewStickersCollageView.kt", l = {}, m = "invokeSuspend")
public final class C433330Gyx extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C416810GVz LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433330Gyx(C416810GVz c416810GVz, InterfaceC1364105Vn<? super C433330Gyx> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c416810GVz;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433330Gyx(this.LL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("SocialAvatarNewStickersCollageView@3d11.load$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.invalidate();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("SocialAvatarNewStickersCollageView@3d11.load$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
