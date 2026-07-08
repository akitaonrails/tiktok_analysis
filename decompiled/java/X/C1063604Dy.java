package X;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomActionConfig;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PdpBottomArea;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PurchaseLimit;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.ui.SeaPdpFragment;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.widget.SeaPdpBottomNavBarWidgetNew;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuItem;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SkuPrice;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS130S0400000_1;
import kotlin.jvm.internal.AwS580S0100000_1;

/* JADX INFO: renamed from: X.04Dy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1063604Dy implements InterfaceC960503pD, C04E8 {
    public final Fragment LL;
    public final String LLILLJJLI;
    public final InterfaceC1053404Aa LLILLL;
    public final Map<String, Object> LLILZ;
    public final Lifecycle LLILZIL;

    @Override // X.InterfaceC960503pD, X.C11E6
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // X.C11E9
    public final C11E6 getLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.C11DL
    public final InterfaceC874803bO getReceiver() {
        return this;
    }

    @Override // X.C11E9
    public final C11DL<InterfaceC960503pD> getReceiverHolder() {
        return this;
    }

    @Override // X.C11E9
    public final boolean getUniqueOnlyGlobal() {
        return true;
    }

    public final SeaPdpViewModel LJII() {
        try {
            return (SeaPdpViewModel) C2658011c.LIZ(this.LLILLJJLI, "pdp_view_model");
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            return null;
        }
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL;
    }

    @Override // X.C04E8
    public final void LIZ(C10503048v c10503048v) {
        C1054104Ah c1054104Ah;
        SeaPdpViewModel seaPdpViewModelLJII = LJII();
        if (seaPdpViewModelLJII != null && (c1054104Ah = seaPdpViewModelLJII.LLJLIL) != null) {
            C1054104Ah.LJIIL(c1054104Ah, (String) withState(seaPdpViewModelLJII, AFwS228S0000000_1.get$arr$(797)), LJI(seaPdpViewModelLJII, c10503048v.isEnabled(), true, c10503048v.LIZIZ()), this.LLILLL.LJ("c3256.d2546"), this.LLILZ, 4);
        }
    }

    @Override // X.C04E8
    public final void LIZIZ(C04E4 c04e4) {
        C1054104Ah c1054104Ah;
        SeaPdpViewModel seaPdpViewModelLJII = LJII();
        if (seaPdpViewModelLJII != null && (c1054104Ah = seaPdpViewModelLJII.LLJLIL) != null) {
            C1054104Ah.LJIIL(c1054104Ah, "add_to_cart", LJ(this, seaPdpViewModelLJII, c04e4.isEnabled(), false, 4), this.LLILLL.LJ("c3256.d6034"), this.LLILZ, 4);
        }
    }

    @Override // X.C04E8
    public final void LIZJ(C10503048v c10503048v) {
        ProductPackStruct productPackStruct;
        Integer num;
        SeaPdpFragment seaPdpFragment;
        PdpBottomArea pdpBottomArea;
        Map<String, PdpBottomActionConfig> map;
        PdpBottomActionConfig pdpBottomActionConfig;
        Integer num2;
        SeaPdpViewModel seaPdpViewModelLJII = LJII();
        if (seaPdpViewModelLJII == null) {
            return;
        }
        Map<String, Object> mapLJ = this.LLILLL.LJ("c3256.d2546");
        Integer num3 = (Integer) withState(seaPdpViewModelLJII, new AwS580S0100000_1(seaPdpViewModelLJII, 867));
        ProductPackStruct productPackStruct2 = seaPdpViewModelLJII.LLJIJIL;
        if (productPackStruct2 == null || (pdpBottomArea = productPackStruct2.bottomArea) == null || (map = pdpBottomArea.actionMap) == null || (pdpBottomActionConfig = map.get("dismiss")) == null || (num2 = pdpBottomActionConfig.type) == null || num2.intValue() != 3 ? !((productPackStruct = seaPdpViewModelLJII.LLJIJIL) == null || (num = productPackStruct.status) == null || num.intValue() != 1 || (C300330Bpv.LIZ() && !c10503048v.isEnabled())) : ((Boolean) AFwS228S0000000_1.get$arr$(796).invoke(seaPdpViewModelLJII.FQ2())).booleanValue()) {
            if (num3 != null && num3.intValue() == 3) {
                this.LL.getActivity();
                Fragment fragment = this.LL;
                if (fragment instanceof SeaPdpFragment) {
                    seaPdpFragment = (SeaPdpFragment) fragment;
                } else {
                    seaPdpFragment = null;
                }
                seaPdpViewModelLJII.uR2(seaPdpFragment, false);
                C1054104Ah c1054104Ah = seaPdpViewModelLJII.LLJLIL;
                if (c1054104Ah != null) {
                    C1054104Ah.LJIIJJI(c1054104Ah, (String) withState(seaPdpViewModelLJII, AFwS228S0000000_1.get$arr$(797)), LJI(seaPdpViewModelLJII, true, true, c10503048v.LIZIZ()), mapLJ, this.LLILZ, 12);
                    return;
                }
                return;
            }
            int i = SeaPdpBottomNavBarWidgetNew.LLJJLIIIJLLLLLLLZ;
            C10494048m.LIZ(this.LL.getActivity(), new AwS130S0400000_1(seaPdpViewModelLJII, (SeaPdpViewModel) c10503048v, (C10503048v) mapLJ, (Map<String, ? extends Object>) this, (C1063604Dy) 16));
            return;
        }
        C1054104Ah c1054104Ah2 = seaPdpViewModelLJII.LLJLIL;
        if (c1054104Ah2 != null) {
            C1054104Ah.LJIIJJI(c1054104Ah2, (String) withState(seaPdpViewModelLJII, AFwS228S0000000_1.get$arr$(797)), LJI(seaPdpViewModelLJII, false, true, c10503048v.LIZIZ()), mapLJ, this.LLILZ, 12);
        }
    }

    @Override // X.C04E8
    public final void LIZLLL(C04E4 c04e4) {
        SeaPdpViewModel seaPdpViewModelLJII = LJII();
        if (seaPdpViewModelLJII == null) {
            return;
        }
        Map<String, Object> mapLJ = this.LLILLL.LJ("c3256.d6034");
        if (c04e4.isEnabled()) {
            int i = SeaPdpBottomNavBarWidgetNew.LLJJLIIIJLLLLLLLZ;
            C10494048m.LIZ(this.LL.getActivity(), new AwS130S0400000_1(seaPdpViewModelLJII, c04e4, this, mapLJ, 17));
            return;
        }
        new AwS580S0100000_1(c04e4, 866).invoke(seaPdpViewModelLJII.FQ2());
        C1054104Ah c1054104Ah = seaPdpViewModelLJII.LLJLIL;
        if (c1054104Ah == null) {
            return;
        }
        C1054104Ah.LJIIJJI(c1054104Ah, "add_to_cart", LJ(this, seaPdpViewModelLJII, false, false, 4), mapLJ, this.LLILZ, 12);
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    public C1063604Dy(Fragment fragment, String str, InterfaceC1053404Aa interfaceC1053404Aa, Map<String, ? extends Object> map) {
        this.LL = fragment;
        this.LLILLJJLI = str;
        this.LLILLL = interfaceC1053404Aa;
        this.LLILZ = map;
        this.LLILZIL = fragment.getLifecycle();
    }

    public final HashMap<String, Object> LJI(SeaPdpViewModel seaPdpViewModel, boolean z, boolean z2, boolean z3) {
        return (HashMap) withState(seaPdpViewModel, new C1063504Dx(z, z2, this, seaPdpViewModel, z3));
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
    }

    public static HashMap LJ(C1063604Dy c1063604Dy, SeaPdpViewModel seaPdpViewModel, boolean z, boolean z2, int i) {
        String str;
        Object obj;
        PurchaseLimit purchaseLimit;
        Map<String, Object> mapLIZ;
        SkuPrice skuPrice;
        if ((i & 2) != 0) {
            z = true;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        c1063604Dy.getClass();
        HashMap map = new HashMap();
        map.put("pdp_unique_id", seaPdpViewModel.LLLZZIL);
        if (z) {
            str = "able_to_cart";
        } else {
            str = "unable_to_cart";
        }
        map.put("button_type", str);
        map.put("is_clickable", C893803eS.LIZ(z));
        SkuItem skuItemIR2 = seaPdpViewModel.IR2();
        if (skuItemIR2 == null || (skuPrice = skuItemIR2.price) == null || (obj = skuPrice.discount) == null) {
            obj = 0;
        }
        map.put("discount_percentage", obj);
        C1023203zK c1023203zK = PurchaseLimit.Companion;
        ProductPackStruct productPackStruct = seaPdpViewModel.LLJIJIL;
        if (productPackStruct != null) {
            purchaseLimit = productPackStruct.purchaseLimit;
        } else {
            purchaseLimit = null;
        }
        String skuId = seaPdpViewModel.getSkuId();
        c1023203zK.getClass();
        map.put("is_new_user_discount_limit1", C1023203zK.LIZ(purchaseLimit, skuId));
        if (z2 && (mapLIZ = seaPdpViewModel.XR2().LIZ()) != null) {
            map.putAll(mapLIZ);
        }
        return map;
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1765020w20<C11EF<A, B>> c1765020w20, InterfaceC1631620sYq<? super InterfaceC960503pD, ? super A, ? super B, Unit> interfaceC1631620sYq) {
        return C11EA.LJFF(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, c1765020w20, interfaceC1631620sYq);
    }

    @Override // X.C11E9
    public final <S extends C004I, T> InterfaceC420801kM asyncSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends AbstractC1252750ihl<? extends T>> interfaceC2217241BqE, C1765020w20<C11EC<AbstractC1252750ihl<T>>> c1765020w20, Function2<? super InterfaceC960503pD, ? super Throwable, Unit> function2, Function1<? super InterfaceC960503pD, Unit> function1, Function2<? super InterfaceC960503pD, ? super T, Unit> function22) {
        return C11EA.LIZ(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2, function1, function22);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1765020w20<C1634100scq<A, B, C>> c1765020w20, InterfaceC1631630sYr<? super InterfaceC960503pD, ? super A, ? super B, ? super C, Unit> interfaceC1631630sYr) {
        return C11EA.LJ(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, c1765020w20, interfaceC1631630sYr);
    }

    @Override // X.C11E9
    public final <S extends C004I, A, B, C, D> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1765020w20<C1644460stY<A, B, C, D>> c1765020w20, InterfaceC1685420txc<? super InterfaceC960503pD, ? super A, ? super B, ? super C, ? super D, Unit> interfaceC1685420txc) {
        return C11EA.LIZLLL(this, jediViewModel, interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, c1765020w20, interfaceC1685420txc);
    }
}
