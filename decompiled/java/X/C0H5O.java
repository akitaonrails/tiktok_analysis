package X;

import com.ss.android.ugc.aweme.base.ui.bottom.banner.FeedBottomBannerView;
import com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0H5O, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
@C09DV(c = "com.ss.android.ugc.feed.platform.cell.interact.bottom.banner.aigc.AIGCOverLabelBannerAssem$hideView$1", f = "AIGCOverLabelBannerAssemTrigger.kt", l = {}, m = "invokeSuspend")
public final class C0H5O extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ AIGCOverLabelBannerAssem LL;
    public final /* synthetic */ C1AV2 LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0H5O(AIGCOverLabelBannerAssem aIGCOverLabelBannerAssem, C1AV2 c1av2, InterfaceC1364105Vn<? super C0H5O> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = aIGCOverLabelBannerAssem;
        this.LLILLJJLI = c1av2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0H5O(this.LL, this.LLILLJJLI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("AIGCOverLabelBannerAssem@c4bb.hideView$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        FeedBottomBannerView feedBottomBannerView = this.LL.LLJLLIL;
        if (feedBottomBannerView != null) {
            C2180521AVm.LIZLLL(feedBottomBannerView, 8, this.LLILLJJLI);
        }
        C2180521AVm.LIZLLL(this.LL.LJJIJL(), 8, this.LLILLJJLI);
        C2180521AVm.LIZLLL(this.LL.getContentView(), 8, this.LLILLJJLI);
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("AIGCOverLabelBannerAssem@c4bb.hideView$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
