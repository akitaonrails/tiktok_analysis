package X;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.bytedance.tux.input.TuxTextView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shop.USAggregationOrderSingleSkuCell;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillStarlingText;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderStarling;
import com.ss.android.ugc.aweme.ecommerce.base.osp.subpage.USAggregationShopMessageEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import njp.a;

/* JADX INFO: renamed from: X.03Kb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.shop.USAggregationOrderSingleSkuCell$initShopNotes$1$1$2$2", f = "USAggregationOrderSingleSkuCell.kt", l = {472}, m = "invokeSuspend")
public final class C824703Kb extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public boolean LL;
    public TuxTextView LLILLJJLI;
    public C719202rO LLILLL;
    public TuxTextView LLILZ;
    public int LLILZIL;
    public final /* synthetic */ TuxTextView LLILZLL;
    public final /* synthetic */ USAggregationOrderSingleSkuCell LLIZ;
    public final /* synthetic */ View LLIZLLLIL;
    public final /* synthetic */ C719202rO LLJ;
    public final /* synthetic */ boolean LLJI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C824703Kb(TuxTextView tuxTextView, USAggregationOrderSingleSkuCell uSAggregationOrderSingleSkuCell, View view, C719202rO c719202rO, boolean z, InterfaceC1364105Vn<? super C824703Kb> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILZLL = tuxTextView;
        this.LLIZ = uSAggregationOrderSingleSkuCell;
        this.LLIZLLLIL = view;
        this.LLJ = c719202rO;
        this.LLJI = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C824703Kb(this.LLILZLL, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        TuxTextView tuxTextView;
        boolean z;
        TuxTextView tuxTextView2;
        C719202rO c719202rO;
        BillStarlingText billStarlingText;
        BillStarlingText billStarlingText2;
        C1C7U.LIZ("USAggregationOrderSingleSkuCell@938f.initShopNotes$1$1$2$2");
        Object objLJFF = C099R.LJFF();
        int i = this.LLILZIL;
        String str = null;
        if (i != 0) {
            if (i == 1) {
                z = this.LL;
                tuxTextView = this.LLILZ;
                c719202rO = this.LLILLL;
                tuxTextView2 = this.LLILLJJLI;
                C155000ia.LIZIZ(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            C155000ia.LIZIZ(obj);
            Bundle bundle = new Bundle();
            C960603pE.LJFF(bundle, this.LLIZLLLIL, new AwS580S0100000_1(this.LLJ, 586));
            bundle.putInt("height", C814420VxA.LIZIZ(C418440Gaw.LIZIZ(C2286608xc.LJ(328))));
            tuxTextView = this.LLILZLL;
            Fragment fragment = this.LLIZ.getFragment();
            if (fragment != null) {
                z = this.LLJI;
                tuxTextView2 = this.LLILZLL;
                c719202rO = this.LLJ;
                C03LF c03lf = USAggregationShopMessageEditFragment.LLJJIII;
                this.LLILLJJLI = tuxTextView2;
                this.LLILLL = c719202rO;
                this.LLILZ = tuxTextView;
                this.LL = z;
                this.LLILZIL = 1;
                c03lf.getClass();
                obj = C03LF.LIZ(fragment, bundle, this);
                if (obj == objLJFF) {
                    C1C7U.LIZIZ("USAggregationOrderSingleSkuCell@938f.initShopNotes$1$1$2$2");
                    return objLJFF;
                }
            }
            tuxTextView.setText(str);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("USAggregationOrderSingleSkuCell@938f.initShopNotes$1$1$2$2");
            return unit;
        }
        if (((Boolean) obj).booleanValue()) {
            if (!z) {
                C1748720vbi.LIZLLL(tuxTextView2, new C049X(), AFwS228S0000000_1.get$arr$(592));
            }
            ShopOrderStarling shopOrderStarling = c719202rO.LLJJJIL;
            if (shopOrderStarling != null && (billStarlingText2 = shopOrderStarling.orderNotesEdit) != null) {
                str = billStarlingText2.text;
            }
        } else {
            if (z) {
                C1748720vbi.LIZLLL(tuxTextView2, new C049X(), AFwS228S0000000_1.get$arr$(593));
            }
            ShopOrderStarling shopOrderStarling2 = c719202rO.LLJJJIL;
            if (shopOrderStarling2 != null && (billStarlingText = shopOrderStarling2.orderNotesText) != null) {
                str = billStarlingText.text;
            }
        }
        tuxTextView.setText(str);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("USAggregationOrderSingleSkuCell@938f.initShopNotes$1$1$2$2");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
