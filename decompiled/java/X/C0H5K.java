package X;

import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H5K, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssem$displayView$2", f = "AIGCOverLabelBannerAssemTrigger.kt", l = {}, m = "invokeSuspend")
public final class C0H5K extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIGCOverLabelBannerAssem LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H5K(AIGCOverLabelBannerAssem aIGCOverLabelBannerAssem, InterfaceC1364105Vn<? super C0H5K> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIGCOverLabelBannerAssem;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H5K(this.LL, interfaceC1364105Vn);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOverLabelBannerAssem@c4bb.displayView$2");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C786410Ut5.LJLLLLLL(0, this.LL.LJJIJL());
        C786410Ut5.LJLLLLLL(0, this.LL.getContentView());
        FeedBottomBannerView feedBottomBannerView = this.LL.LLJLLIL;
        if (feedBottomBannerView != null) {
            int visibility = feedBottomBannerView.getVisibility();
            feedBottomBannerView.setVisibility(0);
            C1602160rnK.LIZIZ(visibility, 0, feedBottomBannerView);
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOverLabelBannerAssem@c4bb.displayView$2");
        return unit;
    }
}
