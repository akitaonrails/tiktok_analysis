package X;

import android.content.Context;
import android.view.View;
import androidx.lifecycle.LifecycleCoroutineScope;
import androidx.lifecycle.LifecycleOwnerKt;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.AddItemResult;
import com.ss.android.ugc.aweme.ecommerce.base.cart.repository.dto.BundleAddItemsToCartData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.BundleInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bundle.SeaPdpBundleDealVH;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS18S0401000_26;
import njp.a;

/* JADX INFO: renamed from: X.0vjd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.modulesdui.listitem.bundle.SeaPdpBundleDealVH$addCart$1$1", f = "SeaPdpBundleDealVH.kt", l = {}, m = "invokeSuspend")
public final class C1753630vjd extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ SeaPdpBundleDealVH LL;
    public final /* synthetic */ BundleInfo LLILLJJLI;
    public final /* synthetic */ Object LLILLL;
    public final /* synthetic */ int LLILZ;
    public final /* synthetic */ View LLILZIL;
    public final /* synthetic */ String LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1753630vjd(SeaPdpBundleDealVH seaPdpBundleDealVH, BundleInfo bundleInfo, Object obj, int i, View view, String str, InterfaceC1364105Vn<? super C1753630vjd> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = seaPdpBundleDealVH;
        this.LLILLJJLI = bundleInfo;
        this.LLILLL = obj;
        this.LLILZ = i;
        this.LLILZIL = view;
        this.LLILZLL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1753630vjd(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        BundleAddItemsToCartData bundleAddItemsToCartData;
        ExceptionUX exceptionUX;
        BundleAddItemsToCartData bundleAddItemsToCartData2;
        List<AddItemResult> list;
        C1C7U.LIZ("SeaPdpBundleDealVH@9d88.addCart$1$1");
        C099R.LJFF();
        C155000ia.LIZIZ(obj);
        C1753650vjf c1753650vjfC6 = this.LL.c6();
        SeaPdpBundleDealVH seaPdpBundleDealVH = this.LL;
        BundleInfo bundleInfo = this.LLILLJJLI;
        Object obj2 = this.LLILLL;
        if (obj2 instanceof BundleAddItemsToCartData) {
            bundleAddItemsToCartData = (BundleAddItemsToCartData) obj2;
        } else {
            bundleAddItemsToCartData = null;
        }
        int i = this.LLILZ;
        Map<String, Object> mapLJ = seaPdpBundleDealVH.d6().LLLLL.LJ("c1720.d9604");
        c1753650vjfC6.getClass();
        if (bundleAddItemsToCartData != null && (list = bundleAddItemsToCartData.addItemResults) != null) {
            Iterator<AddItemResult> it2 = list.iterator();
            while (it2.hasNext()) {
                C1748720vbi.LIZIZ(seaPdpBundleDealVH, new C10482048a(), new AwS18S0401000_26(c1753650vjfC6, (C1753650vjf) bundleInfo, (BundleInfo) it2.next(), (AddItemResult) i, (int) mapLJ, (Map<String, ? extends Object>) 5));
            }
        }
        if (this.LLILZ != 0) {
            C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
            View view = this.LLILZIL;
            String str = this.LLILZLL;
            c1750820vf6.getClass();
            C1750820vf6.LIZLLL(view, str);
            Unit unit = Unit.LIZ;
            C1C7U.LIZIZ("SeaPdpBundleDealVH@9d88.addCart$1$1");
            return unit;
        }
        SeaPdpViewModel seaPdpViewModelD6 = this.LL.d6();
        Context context = this.LL.itemView.getContext();
        View view2 = this.LLILZIL;
        String str2 = this.LLILZLL;
        Object obj3 = this.LLILLL;
        LifecycleCoroutineScope lifecycleScope = LifecycleOwnerKt.getLifecycleScope(this.LL);
        Object obj4 = this.LLILLL;
        if ((obj4 instanceof BundleAddItemsToCartData) && (bundleAddItemsToCartData2 = (BundleAddItemsToCartData) obj4) != null) {
            exceptionUX = bundleAddItemsToCartData2.exceptionUX;
        } else {
            exceptionUX = null;
        }
        seaPdpViewModelD6.xR2(context, view2, str2, obj3, lifecycleScope, exceptionUX);
        Unit unit2 = Unit.LIZ;
        C1C7U.LIZIZ("SeaPdpBundleDealVH@9d88.addCart$1$1");
        return unit2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
