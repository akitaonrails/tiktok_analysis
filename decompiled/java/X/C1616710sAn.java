package X;

import android.content.Context;
import android.view.View;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.behavior.popup.MarketplacePopupParams;
import com.ss.android.ugc.aweme.purchasepanel.fragment.PurchasePanelFragment;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS568S0100000_24;
import kotlin.jvm.internal.Intrinsics;
import njp.a;

/* JADX INFO: renamed from: X.0sAn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
@C09DV(c = "com.ss.android.ugc.aweme.purchasepanel.fragment.PurchasePanelFragment$onViewCreated$2$1$1", f = "PurchasePanelFragment.kt", l = {}, m = "invokeSuspend")
public final class C1616710sAn extends C09AX implements Function2<C1615430s8j, InterfaceC1364105Vn<? super Unit>, Object> {
    public /* synthetic */ Object LL;
    public final /* synthetic */ TuxSheet LLILLJJLI;
    public final /* synthetic */ PurchasePanelFragment LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1616710sAn(TuxSheet tuxSheet, PurchasePanelFragment purchasePanelFragment, InterfaceC1364105Vn<? super C1616710sAn> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = tuxSheet;
        this.LLILLL = purchasePanelFragment;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1616710sAn c1616710sAn = new C1616710sAn(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
        c1616710sAn.LL = obj;
        return c1616710sAn;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        Context context;
        C1391280mJC c1391280mJC;
        C1C7U.LIZ("PurchasePanelFragment@fc7c.onViewCreated$2$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1615430s8j c1615430s8j = (C1615430s8j) this.LL;
        View view = this.LLILLJJLI.getView();
        if (view != null && (c1391280mJC = (C1391280mJC) view.findViewById(R.id.v4n)) != null) {
            C0OM1 c0om1 = (C0OM1) this.LLILLL.LLILLJJLI.getValue();
            C1250250idj c1250250idj = new C1250250idj();
            c1250250idj.LIZJ = c1615430s8j.LIZ;
            c0om1.LIZJ = c1250250idj;
            c1391280mJC.setNavActions(c0om1);
        }
        MarketplacePopupParams marketplacePopupParams = c1615430s8j.LJFF;
        if (marketplacePopupParams != null) {
            PurchasePanelFragment purchasePanelFragment = this.LLILLL;
            if (Intrinsics.LJFF(c1615430s8j.LJI, true) && (context = purchasePanelFragment.getContext()) != null) {
                C1674120tfO c1674120tfO = C1674120tfO.LIZ;
                AwS568S0100000_24 awS568S0100000_24 = new AwS568S0100000_24(purchasePanelFragment, 854);
                c1674120tfO.getClass();
                C1DFH c1dfh = C0PEM.LIZ;
                C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C1616730sAp(marketplacePopupParams, context, awS568S0100000_24, null), 3);
            }
        }
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("PurchasePanelFragment@fc7c.onViewCreated$2$1$1");
        return unit;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(C1615430s8j c1615430s8j, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(c1615430s8j, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
