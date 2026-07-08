package X;

import android.view.View;
import android.widget.LinearLayout;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H5D, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.enlarge.EnlargeAvatarSocialAvatarHelper$addButtons$1$1", f = "EnlargeAvatarSocialAvatarHelper.kt", l = {}, m = "invokeSuspend")
public final class C0H5D extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ LinearLayout LL;
    public final /* synthetic */ C442840HYc LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H5D(LinearLayout linearLayout, C442840HYc c442840HYc, InterfaceC1364105Vn<? super C0H5D> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = linearLayout;
        this.LLILLJJLI = c442840HYc;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H5D(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("EnlargeAvatarSocialAvatarHelper@38b.addButtons$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        this.LL.addView((View) this.LLILLJJLI.LJIJJ.getValue(), 0);
        View view = new View(this.LLILLJJLI.LIZ);
        C786410Ut5.W5(view, new LinearLayout.LayoutParams(-1, C1BWL.LIZJ().getDimensionPixelSize(R.dimen.ee)));
        this.LL.addView(view, 1);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("EnlargeAvatarSocialAvatarHelper@38b.addButtons$1$1");
        return unit;
    }
}
