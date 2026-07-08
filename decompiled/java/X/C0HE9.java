package X;

import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0HE9, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarSocialAvatarHelper$updateLikeAvatar$1", f = "EnlargeAvatarSocialAvatarHelper.kt", l = {}, m = "invokeSuspend")
public final class C0HE9 extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C442840HYc LL;
    public final /* synthetic */ View LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0HE9(C442840HYc c442840HYc, View view, InterfaceC1364105Vn<? super C0HE9> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = c442840HYc;
        this.LLILLJJLI = view;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnlargeAvatarSocialAvatarHelper@38b.updateLikeAvatar$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        Function0<Unit> function0 = this.LL.LJIILLIIL;
        if (function0 != null) {
            function0.invoke();
        }
        C442840HYc.LJIIL(this.LLILLJJLI, !this.LL.LJIJJLI);
        C0HWW c0hww = C0HWW.LIZ;
        boolean zLJI = this.LL.LJI();
        C442840HYc c442840HYc = this.LL;
        String str = c442840HYc.LIZJ.LIZ;
        String strLJFF = c442840HYc.LJFF();
        String strLJ = this.LL.LJ();
        c0hww.getClass();
        C0HWW.LJIIJ("like", str, strLJFF, strLJ, zLJI);
        C23250099c.LIZLLL((InterfaceC497601wk) this.LL.LJIIIZ.getValue(), null, null, new C0HEC(this.LL, this.LLILLJJLI, null), 3);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.updateLikeAvatar$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C0HE9(this.LL, this.LLILLJJLI, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
