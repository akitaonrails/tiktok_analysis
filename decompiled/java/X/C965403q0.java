package X;

import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ChangeOnOrderStruct;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.ClosePudoMapEventParams;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.DeliveryPanelStarter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.address.AddressSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticSelectFragment;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticDTO;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticExpressionArea;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.LogisticPanelModule;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.ReachableAddress;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.repo.dto.SelectionBar;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelState;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.zhiliaoapp.musically.R;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS115S1100000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS615S0100000_1;
import kotlin.jvm.internal.AwS650S0100000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03q0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C965403q0 extends C040Q implements InterfaceC1171660gay, InterfaceC1164530gPT {
    public boolean LLJIJIL;
    public final long LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;

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

    public final void LJIILIIL() {
        Fragment fragment = this.LLJ;
        if (fragment instanceof DialogFragment) {
            ((DialogFragment) fragment).dismissAllowingStateLoss();
        } else {
            AnonymousClass0378.LIZ().LIZ("event_request_close_delivery", "{}");
        }
    }

    public final String LJIILJJIL() {
        Integer num;
        DeliveryPanelStarter.EnterParam enterParam = this.LLJI.LLILZIL;
        if (enterParam == null) {
            return "click_other_area";
        }
        String str = enterParam.enterMethod;
        return str == null ? (enterParam == null || (num = enterParam.selectTab) == null || num.intValue() != 2) ? "click_other_area" : "click_pickup_location" : str;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLJ.getLifecycle();
    }

    @Override // X.C040Q
    public final void LJIIIZ() {
        AnonymousClass0378.LIZ().LIZJ("ec_close_pudo_map", this);
        AnonymousClass0378.LIZ().LIZJ("ec_update_address_location", this);
        withState(this.LLJI, new AwS580S0100000_1(this, 1131));
    }

    @Override // X.C040Q
    public final void LJIIJJI() {
        withState(this.LLJI, new AwS89S0110000_1(this, C036A.LIZIZ(), 32));
    }

    @Override // X.C040Q
    public final void LJ(Bundle bundle) {
        String str;
        HashMap<String, Object> mapLJIIJ;
        String str2 = null;
        if (this.LLJI.LLIZ == 3) {
            LJIIL(new AddressSelectFragment(), true);
        } else {
            LogisticSelectFragment logisticSelectFragment = new LogisticSelectFragment();
            Bundle bundle2 = new Bundle();
            C128Y c128y = this.LLJ;
            if (c128y instanceof InterfaceC1748810vbr) {
                C960603pE.LJI(bundle2, (InterfaceC1748810vbr) c128y, null);
            }
            logisticSelectFragment.setArguments(bundle2);
            LJIIL(logisticSelectFragment, true);
        }
        if (this.LLJI.pR2()) {
            Parcelable parcelable = this.LLJI.LLILZLL;
            if ((parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (str = ((DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable).trackParams) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str)) != null && Intrinsics.LJFF(mapLJIIJ.get("no_ship_to_addr"), Boolean.TRUE)) {
                DeliveryPanelViewModel deliveryPanelViewModel = this.LLJI;
                EnumC966703qD enumC966703qD = EnumC966703qD.PUSH_AREA_PAGE;
                DeliveryPanelStarter.EnterParam enterParam = deliveryPanelViewModel.LLILZIL;
                if (enterParam != null) {
                    str2 = enterParam.btmToken;
                }
                deliveryPanelViewModel.nR2(enumC966703qD, str2);
            }
        }
        C11EA.LJII(this, this.LLJI, new C2217381BqS() { // from class: X.03qK
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Boolean.valueOf(((DeliveryPanelState) obj).getApply());
            }
        }, new AwS615S0100000_1(this, 352));
        C11EA.LJII(this, this.LLJI, new C2217381BqS() { // from class: X.03qQ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return ((DeliveryPanelState) obj).getChangePage();
            }
        }, new AwS615S0100000_1(this, 353));
        C11EA.LJIIIIZZ(this, this.LLJI, new C2217381BqS() { // from class: X.03qG
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((DeliveryPanelState) obj).getStatus());
            }
        }, new C2217381BqS() { // from class: X.03qJ
            @Override // X.C2217381BqS, X.AbstractC2217351BqP, X.InterfaceC2217241BqE
            public final Object get(Object obj) {
                return Integer.valueOf(((DeliveryPanelState) obj).getGetPudoAddressStatus());
            }
        }, new AwS650S0100000_1(this, 39));
        AnonymousClass0378.LIZ().LIZLLL("ec_update_address_location", this);
        AnonymousClass0378.LIZ().LIZLLL("ec_close_pudo_map", this);
    }

    @Override // X.C040Q
    public final void LJI(DialogInterface dialogInterface) {
        C1054004Ag c1054004AgLIZ;
        if ((this.LLJI.LLILZLL instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) && (c1054004AgLIZ = C740070T1h.LIZ(this.LLJ.getContext())) != null) {
            C1054004Ag.LJIIZILJ(c1054004AgLIZ, "glide_close", null, null, 6);
        }
    }

    @Override // X.C040Q
    public final void LJII(Bundle bundle) {
        DeliveryPanelStarter.EnterParam enterParam;
        this.LLJI.LLIZLLLIL = new AwS545S0100000_1(this, 1819);
        Bundle arguments = this.LLJ.getArguments();
        if (arguments != null && (enterParam = (DeliveryPanelStarter.EnterParam) arguments.getParcelable("enter_param")) != null) {
            DeliveryPanelViewModel deliveryPanelViewModel = this.LLJI;
            deliveryPanelViewModel.LLILZIL = enterParam;
            deliveryPanelViewModel.LLJL = enterParam.addressSelectScene;
            if (Intrinsics.LJFF(enterParam.fromScene, "order_detail")) {
                DeliveryPanelViewModel deliveryPanelViewModel2 = this.LLJI;
                deliveryPanelViewModel2.LLILZLL = enterParam;
                deliveryPanelViewModel2.LLIZ = 4;
            } else {
                Integer num = enterParam.scene;
                if (num != null && num.intValue() == 0) {
                    if (enterParam.logisticList == null && !Intrinsics.LJFF(enterParam.fromScene, "osp")) {
                        DeliveryPanelViewModel deliveryPanelViewModel3 = this.LLJI;
                        deliveryPanelViewModel3.LLJIJIL = enterParam.bizType;
                        deliveryPanelViewModel3.LLIZ = 0;
                        deliveryPanelViewModel3.LLILZLL = new DeliveryPanelStarter.EnterParamForProductDetailPage(enterParam.selectedDeliveryTypeId, enterParam.selectedBuyerAddressId, enterParam.selectedArea, enterParam.productId, enterParam.skuId, enterParam.quantity, enterParam.trackParams, enterParam.priceVal, enterParam.currency, enterParam.extraParamsForLynx, enterParam.enterMethod);
                    } else {
                        DeliveryPanelViewModel deliveryPanelViewModel4 = this.LLJI;
                        deliveryPanelViewModel4.LLIZ = 1;
                        String str = enterParam.selectedDeliveryTypeId;
                        List list = enterParam.logisticList;
                        if (list == null) {
                            list = C13BV.INSTANCE;
                        }
                        deliveryPanelViewModel4.LLILZLL = new DeliveryPanelStarter.EnterParamForOrderSubmitPage(list, str, enterParam.trackParams, enterParam.panelTitle, enterParam.multiLogisticsPanelInfo, enterParam.logisticsPanelModule, enterParam.enterMethod, enterParam.selfCollectionOpt, 960);
                    }
                } else {
                    DeliveryPanelViewModel deliveryPanelViewModel5 = this.LLJI;
                    deliveryPanelViewModel5.LLILZLL = enterParam;
                    deliveryPanelViewModel5.LLIZ = 3;
                }
            }
            Set<String> set = C03FA.LIZ;
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(enterParam.trackParams);
            LinkedHashMap<String, Object> linkedHashMap = C03FA.LIZIZ;
            linkedHashMap.clear();
            C03FA.LIZJ = null;
            C03FA.LIZLLL = null;
            C03FA.LIZ.clear();
            System.currentTimeMillis();
            if (mapLJIIJ != null) {
                linkedHashMap.putAll(mapLJIIJ);
            }
            linkedHashMap.put("EVENT_ORIGIN_FEATURE", "TEMAI");
            linkedHashMap.put("page_name", "logistics");
            linkedHashMap.put("is_fullscreen", 0);
            linkedHashMap.remove("shipping_price");
            linkedHashMap.remove("shipping_currency");
            linkedHashMap.remove("free_shipping_condition");
        }
    }

    @Override // X.C040Q
    public final void LJIIJ(Dialog dialog) {
        dialog.setOnKeyListener(new DialogInterface.OnKeyListener() { // from class: X.03q9
            @Override // android.content.DialogInterface.OnKeyListener
            public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
                if (i != 4 || keyEvent == null || keyEvent.getAction() != 1) {
                    return false;
                }
                boolean zBooleanValue = this.LL.LLJI.LLJ.invoke().booleanValue();
                if (!zBooleanValue && this.LL.LLJ.getChildFragmentManager().LJJLIIIJL().size() > 1) {
                    this.LL.LLJI.nR2(EnumC966703qD.POP, null);
                    return true;
                }
                return zBooleanValue;
            }
        });
    }

    public final DeliveryPanelStarter.PackedDeliverySelectResult LJIILLIIL(DeliveryPanelState deliveryPanelState) {
        Address address;
        String str;
        boolean z;
        Address address2;
        if (deliveryPanelState.getPudoSelectedLogistic() != null) {
            return new DeliveryPanelStarter.PackedDeliverySelectResult(deliveryPanelState.getPudoSelectedLogistic(), null, null, null, null, null, Boolean.FALSE, Boolean.TRUE, deliveryPanelState.getPudoSource());
        }
        DeliveryPanelStarter.PackedDeliverySelectResult packedDeliverySelectResultVR2 = this.LLJI.vR2(deliveryPanelState);
        if (packedDeliverySelectResultVR2 != null) {
            return packedDeliverySelectResultVR2;
        }
        if (deliveryPanelState.getApply()) {
            Parcelable parcelable = this.LLJI.LLILZLL;
            String str2 = null;
            if (parcelable instanceof DeliveryPanelStarter.EnterParamForProductDetailPage) {
                ReachableAddress reachableAddressLIZ = deliveryPanelState.getSelectedShipToInfo().LIZ();
                if (reachableAddressLIZ != null && (address2 = reachableAddressLIZ.address) != null) {
                    str = address2.id;
                } else {
                    str = null;
                }
                DeliveryPanelStarter.EnterParamForProductDetailPage enterParamForProductDetailPage = (DeliveryPanelStarter.EnterParamForProductDetailPage) parcelable;
                if (Intrinsics.LJFF(str, enterParamForProductDetailPage.selectedBuyerAddressId) && Intrinsics.LJFF(deliveryPanelState.getSelectedShipToInfo().LIZIZ(), enterParamForProductDetailPage.selectedArea)) {
                    z = false;
                } else {
                    z = true;
                }
                C1054004Ag c1054004AgLIZ = C740070T1h.LIZ(this.LLJ.getContext());
                if (c1054004AgLIZ != null) {
                    C1054004Ag.LJIIZILJ(c1054004AgLIZ, "continue", Boolean.valueOf(z), null, 4);
                }
            }
            LogisticDTO selectedLogistic = deliveryPanelState.getSelectedLogistic();
            ReachableAddress reachableAddressLIZ2 = deliveryPanelState.getSelectedShipToInfo().LIZ();
            if (reachableAddressLIZ2 != null && (address = reachableAddressLIZ2.address) != null) {
                str2 = address.id;
            }
            return new DeliveryPanelStarter.PackedDeliverySelectResult(selectedLogistic, str2, deliveryPanelState.getSelectedShipToInfo().LIZIZ(), deliveryPanelState.getShippingToAddressInfo(), deliveryPanelState.getLogistics(), deliveryPanelState.getPdpLogisticModule(), Boolean.valueOf(deliveryPanelState.getHasMapLocationChanged()), null, null);
        }
        return new DeliveryPanelStarter.PackedDeliverySelectResult(null, null, null, null, null, null, Boolean.valueOf(deliveryPanelState.getHasMapLocationChanged()), null, null);
    }

    public C965403q0(Fragment fragment, DeliveryPanelViewModel deliveryPanelViewModel) {
        super(fragment, deliveryPanelViewModel);
        this.LLJILJIL = SystemClock.elapsedRealtime();
    }

    public final void LJIIL(Fragment fragment, boolean z) {
        C19EH c19ehLJIIJ = this.LLJ.getChildFragmentManager().LJIIJ();
        if (!z) {
            c19ehLJIIJ.LJIJJLI(R.anim.f475bc, R.anim.bd, R.anim.f475bc, R.anim.bd);
        }
        c19ehLJIIJ.LIZIZ(R.id.flg, fragment);
        c19ehLJIIJ.LJII(null);
        c19ehLJIIJ.LJIIJ();
    }

    public final LogisticExpressionArea LJIILL(LogisticExpressionArea logisticExpressionArea, DeliveryPanelState deliveryPanelState) {
        LogisticDTO selectedLogistic;
        DeliveryPanelStarter.EnterParamForOrderSubmitPage enterParamForOrderSubmitPage;
        LogisticPanelModule logisticPanelModule;
        List<SelectionBar> list;
        List<LogisticExpressionArea> list2;
        LogisticExpressionArea logisticExpressionArea2;
        if (logisticExpressionArea == null && (selectedLogistic = deliveryPanelState.getSelectedLogistic()) != null && selectedLogistic.logisticsServiceId != null) {
            Parcelable parcelable = this.LLJI.LLILZLL;
            if ((parcelable instanceof DeliveryPanelStarter.EnterParamForOrderSubmitPage) && (enterParamForOrderSubmitPage = (DeliveryPanelStarter.EnterParamForOrderSubmitPage) parcelable) != null && (logisticPanelModule = enterParamForOrderSubmitPage.logisticsPanelModule) != null && (list = logisticPanelModule.selectionBar) != null) {
                Iterator<SelectionBar> it2 = list.iterator();
                while (it2.hasNext()) {
                    LogisticArea logisticArea = it2.next().logisticArea;
                    if (logisticArea != null && (list2 = logisticArea.logisticExpressionAreas) != null && (logisticExpressionArea2 = (LogisticExpressionArea) C13LP.LJJJLL(list2)) != null) {
                        logisticExpressionArea = logisticExpressionArea2;
                    }
                }
            }
        }
        return logisticExpressionArea;
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Type type;
        Type type2;
        if (Intrinsics.LJFF(str, "ec_update_address_location")) {
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(C854203Vk.class));
                } else {
                    type = new TypeToken<C854203Vk>() { // from class: X.03qL
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type);
                if (!(objFromJson instanceof C854203Vk)) {
                    objFromJson = null;
                }
                C854203Vk c854203Vk = (C854203Vk) objFromJson;
                if (c854203Vk != null) {
                    if (Intrinsics.LJFF(c854203Vk.LIZ, "order_submit_logistics")) {
                        DeliveryPanelViewModel deliveryPanelViewModel = this.LLJI;
                        deliveryPanelViewModel.getClass();
                        deliveryPanelViewModel.setState(AFwS228S0000000_1.get$arr$(416));
                        return;
                    } else {
                        if (Intrinsics.LJFF(c854203Vk.LIZ, "product_detail_logistics")) {
                            this.LLJI.uR2(this.LLJ.getContext());
                            return;
                        }
                        return;
                    }
                }
                return;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        if (Intrinsics.LJFF(str, "ec_close_pudo_map")) {
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                    type2 = C2371409Qy.LIZJ(C13LE.LJII(ClosePudoMapEventParams.class));
                } else {
                    type2 = new TypeToken<ClosePudoMapEventParams>() { // from class: X.03qP
                    }.getType();
                }
                Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type2);
                if (!(objFromJson2 instanceof ClosePudoMapEventParams)) {
                    objFromJson2 = null;
                }
                ClosePudoMapEventParams closePudoMapEventParams = (ClosePudoMapEventParams) objFromJson2;
                if (closePudoMapEventParams != null) {
                    this.LLJILJILJ = true;
                    Boolean bool = closePudoMapEventParams.hasSearch;
                    Boolean bool2 = Boolean.TRUE;
                    this.LLJILLL = Intrinsics.LJFF(bool, bool2);
                    if (Intrinsics.LJFF(closePudoMapEventParams.isSelectPudo, bool2)) {
                        if (this.LLJI.zR2()) {
                            DeliveryPanelViewModel deliveryPanelViewModel2 = this.LLJI;
                            String str3 = closePudoMapEventParams.toastMessage;
                            deliveryPanelViewModel2.getClass();
                            AnonymousClass0378.LIZ().LIZ("ec_change_address_on_order", C1741890vQh.LJIIIIZZ(new ChangeOnOrderStruct(0, str3)));
                        }
                        DeliveryPanelViewModel deliveryPanelViewModel3 = this.LLJI;
                        String str4 = closePudoMapEventParams.source;
                        if (str4 == null) {
                            str4 = "";
                        }
                        deliveryPanelViewModel3.getClass();
                        deliveryPanelViewModel3.setState(new AwS115S1100000_1(deliveryPanelViewModel3, str4, 31));
                    }
                }
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    @Override // X.C11E9
    public final <VM1 extends JediViewModel<S1>, S1 extends C004I, R> R withState(VM1 vm1, Function1<? super S1, ? extends R> function1) {
        return function1.invoke(vm1.FQ2());
    }

    @Override // X.C040Q
    public final View LJIIIIZZ(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C786410Ut5.Td(layoutInflater, R.layout.am6, viewGroup, false);
    }

    @Override // X.C11E9
    public final <S extends C004I> InterfaceC420801kM subscribe(JediViewModel<S> jediViewModel, C1765020w20<S> c1765020w20, Function2<? super InterfaceC960503pD, ? super S, Unit> function2) {
        return C11EA.LJIIJJI(this, jediViewModel, c1765020w20, function2);
    }

    @Override // X.C11E9
    public final <S extends C004I, A> InterfaceC420801kM selectSubscribe(JediViewModel<S> jediViewModel, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1765020w20<C11EC<A>> c1765020w20, Function2<? super InterfaceC960503pD, ? super A, Unit> function2) {
        return C11EA.LJI(this, jediViewModel, interfaceC2217241BqE, c1765020w20, function2);
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
