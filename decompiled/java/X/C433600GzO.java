package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.bytedance.lighten.loader.SmartImageView;
import com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0GzO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.ui.MusProfileEditFragment$showSocialAvatarEntranceBanner$5$1", f = "MusProfileEditFragment.kt", l = {}, m = "invokeSuspend")
public final class C433600GzO extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ SmartImageView LLILLJJLI;
    public final /* synthetic */ MusProfileEditFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C433600GzO(String str, SmartImageView smartImageView, MusProfileEditFragment musProfileEditFragment, InterfaceC1364105Vn<? super C433600GzO> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
        this.LLILLJJLI = smartImageView;
        this.LLILLL = musProfileEditFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C433600GzO(this.LL, this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        ViewGroup.LayoutParams layoutParams;
        RelativeLayout.LayoutParams layoutParams2;
        C1C7U.LIZ("MusProfileEditFragment@fdf.showSocialAvatarEntranceBanner$5$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1331670kl3 c1331670kl3LJIIIZ = C1331660kl2.LJIIIZ(this.LL);
        c1331670kl3LJIIIZ.LJJ(this.LLILLJJLI);
        C786410Ut5.h3(c1331670kl3LJIIIZ);
        View view = this.LLILLL.LLZLL;
        RelativeLayout.LayoutParams layoutParams3 = null;
        if (view != null) {
            layoutParams = view.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if ((layoutParams instanceof RelativeLayout.LayoutParams) && (layoutParams2 = (RelativeLayout.LayoutParams) layoutParams) != null) {
            layoutParams2.addRule(3, R.id.vni);
            layoutParams3 = layoutParams2;
        }
        View view2 = this.LLILLL.LLZLL;
        if (view2 != null) {
            C786410Ut5.W5(view2, layoutParams3);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("MusProfileEditFragment@fdf.showSocialAvatarEntranceBanner$5$1");
        return unit;
    }
}
