package X;

import android.view.ViewGroup;
import com.bytedance.lighten.loader.SmartImageView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.06VY, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.assem.quickcomment.emojianim.quickemoji.IMSocialAvatarCreationView$initView$1$1$1", f = "IMSocialAvatarCreationView.kt", l = {}, m = "invokeSuspend")
public final class C06VY extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ C1617606Va LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06VY(String str, C1617606Va c1617606Va, InterfaceC1364105Vn<? super C06VY> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = c1617606Va;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C06VY(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMSocialAvatarCreationView@c84e.initView$1$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(this.LL);
        c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI.LL);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        SmartImageView smartImageView = this.LLILLJJLI.LL;
        ViewGroup.LayoutParams layoutParams = smartImageView.getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(156)));
            layoutParams.height = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(72)));
            C786410Ut5.W5(smartImageView, layoutParams);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("IMSocialAvatarCreationView@c84e.initView$1$1$1");
            return unit;
        }
        throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }
}
