package X;

import android.view.View;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillItem;
import kotlin.Unit;
import kotlin.jvm.internal.AFwS228S0000000_1;

/* JADX INFO: renamed from: X.03Kt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.sea.shop.ShopSummaryView$updateSalesTaxView$1", f = "ShopSummaryView.kt", l = {}, m = "invokeSuspend")
public final class C826503Kt extends C09AX implements InterfaceC1631620sYq<InterfaceC497601wk, View, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C7942038i LL;
    public final /* synthetic */ BillItem LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C826503Kt(C7942038i c7942038i, BillItem billItem, InterfaceC1364105Vn<? super C826503Kt> interfaceC1364105Vn) {
        super(3, interfaceC1364105Vn);
        this.LL = c7942038i;
        this.LLILLJJLI = billItem;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        C1C7U.LIZ("ShopSummaryView@532f.updateSalesTaxView$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C7942038i c7942038i = this.LL;
        BillItem billItem = this.LLILLJJLI;
        c7942038i.getClass();
        C1397580mTM c1397580mTM = new C1397580mTM(c7942038i.getContext());
        String str3 = "";
        if (billItem == null || (str = billItem.itemName) == null) {
            str = "";
        }
        c1397580mTM.LJI(str);
        if (billItem != null && (str2 = billItem.itemText) != null) {
            str3 = str2;
        }
        c1397580mTM.LIZIZ(str3);
        C985403tE.LIZ(c1397580mTM, AFwS228S0000000_1.get$arr$(665));
        new C1397510mTF(c1397580mTM).LIZLLL();
        Unit unit = Unit.LIZ;
        C1C7U.LIZIZ("ShopSummaryView@532f.updateSalesTaxView$1");
        return unit;
    }

    @Override // X.InterfaceC1631620sYq
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, View view, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return new C826503Kt(this.LL, this.LLILLJJLI, interfaceC1364105Vn).invokeSuspend(Unit.LIZ);
    }
}
