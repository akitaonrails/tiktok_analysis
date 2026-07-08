package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.model.AnchorProductInfoModel;
import com.ss.android.ugc.aweme.multi.maker.ShopWindowAnchorMaker;
import com.ss.android.ugc.aweme.platform.AnchorEventCenter;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS600S0100000_21;

/* JADX INFO: renamed from: X.0mFH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1388850mFH extends C09AY implements Function1<View, Unit> {
    public final /* synthetic */ InterfaceC1393560mMs LL;
    public final /* synthetic */ AnchorProductInfoModel LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ C1388830mFF LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1388850mFH(InterfaceC1393560mMs interfaceC1393560mMs, AnchorProductInfoModel anchorProductInfoModel, C2344009Gk c2344009Gk, int i, C1388830mFF c1388830mFF) {
        super(1);
        this.LL = interfaceC1393560mMs;
        this.LLILLJJLI = anchorProductInfoModel;
        this.LLILLL = i;
        this.LLILZ = c1388830mFF;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(View view) {
        View view2 = view;
        ShopWindowAnchorMaker shopWindowAnchorMaker = (ShopWindowAnchorMaker) this.LL;
        AnchorProductInfoModel anchorProductInfoModel = this.LLILLJJLI;
        int i = this.LLILLL;
        if (shopWindowAnchorMaker.LLJI) {
            shopWindowAnchorMaker.LLJI = false;
            C2487409ou.LIZLLL(300L, shopWindowAnchorMaker.LLJIJIL);
            InterfaceC1394860mOy interfaceC1394860mOy = shopWindowAnchorMaker.LLJ;
            InterfaceC1392640mLO interfaceC1392640mLO = shopWindowAnchorMaker.LL;
            if (interfaceC1392640mLO == null) {
                interfaceC1392640mLO = null;
            }
            interfaceC1394860mOy.LJJIIJ(view2, anchorProductInfoModel, i, interfaceC1392640mLO, new AwS600S0100000_21(shopWindowAnchorMaker, 261));
        }
        if (C04UD.LIZ()) {
            C1361920lXq c1361920lXq = (C1361920lXq) C1361900lXo.LIZ("event_entrance_click");
            if (c1361920lXq != null) {
                C1388830mFF c1388830mFF = this.LLILZ;
                InterfaceC1393560mMs interfaceC1393560mMs = this.LL;
                c1361920lXq.LIZJ = "click_anchor";
                c1361920lXq.LIZLLL = true;
                AnchorEventCenter anchorEventCenter = c1388830mFF.LIZJ;
                if (anchorEventCenter != null) {
                    anchorEventCenter.kF(c1361920lXq, interfaceC1393560mMs);
                }
            }
            C1361910lXp c1361910lXp = (C1361910lXp) C1361900lXo.LIZ("event_enter_detail");
            if (c1361910lXp != null) {
                C1388830mFF c1388830mFF2 = this.LLILZ;
                InterfaceC1393560mMs interfaceC1393560mMs2 = this.LL;
                c1361910lXp.LIZJ = "click_anchor";
                c1361910lXp.LIZLLL = true;
                AnchorEventCenter anchorEventCenter2 = c1388830mFF2.LIZJ;
                if (anchorEventCenter2 != null) {
                    anchorEventCenter2.kF(c1361910lXp, interfaceC1393560mMs2);
                }
            }
        }
        return Unit.LIZ;
    }
}
