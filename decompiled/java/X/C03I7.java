package X;

import Y.ARunnableS1S2100000_1;
import android.content.Context;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.bottom.OspBottomViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.module.us.address.OspAddressViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.DynamicSchema;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.IdentityInfoCollectionStyle;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.OspPlaceOrderButton;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.RecipientIdentityInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.VerificationMode;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SaleProp;
import com.ss.android.ugc.aweme.ecommerce.base.sku.model.dto.SalePropValue;
import com.ss.android.ugc.aweme.ecommerce.base.sku.seanew.SeaSkuSpecViewModel;
import com.ss.android.ugc.aweme.ecommerce.common.ECBaseFragment;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AwS16S0010000_1;
import kotlin.jvm.internal.AwS89S0110000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.03I7, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03I7 implements C03LX {
    public final OrderSubmitAssemViewModel LIZ;
    public final ECBaseFragment LIZIZ;
    public final OspAddressViewModel LIZJ;
    public final OspBottomViewModel LIZLLL;

    @Override // X.C03LX
    public final C03LS LIZIZ(String str, String str2) {
        int value;
        ConstraintLayout constraintLayout;
        IdentityInfoCollectionStyle identityInfoCollectionStyle;
        VerificationMode identityInfoVerificationMode;
        IdentityInfo identityInfo;
        RecipientIdentityInfo recipientIdentityInfo;
        String identityInfoHashId;
        RecipientIdentityInfo recipientIdentityInfo2;
        SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment;
        final SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment2;
        C443120HZe c443120HZe;
        final C20691715xz c20691715xz;
        boolean zLJFF;
        SaleProp saleProp;
        String str3;
        String addressListSchema;
        Context context;
        DynamicSchema dynamicSchema;
        OspPlaceOrderButton ospPlaceOrderButton;
        Integer num;
        BillInfoData billInfoData = this.LIZ.LLJJI;
        if (billInfoData != null && (ospPlaceOrderButton = billInfoData.ospPlaceOrderButton) != null && (num = ospPlaceOrderButton.clickAction) != null) {
            value = num.intValue();
        } else {
            value = C03I9.NORMAL.getValue();
        }
        String strLJIIIIZZ = null;
        String strLJ = null;
        View view = null;
        String str4 = null;
        String strLJIIIIZZ2 = null;
        if (value == C03I9.CHANGE_ADDRESS.getValue()) {
            BillInfoData billInfoData2 = this.LIZ.LLJJI;
            if (billInfoData2 != null && (dynamicSchema = billInfoData2.schemaInfo) != null && (addressListSchema = dynamicSchema.getAddressListSchema()) != null) {
                try {
                    addressListSchema = UriProtector.parse(addressListSchema).buildUpon().appendQueryParameter("is_half_screen", "1").appendQueryParameter("sea_one_step_type", "1").appendQueryParameter("force_vertical", "1").build().toString();
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    C1019103yf.LIZ(EnumC1014603xw.ERR_OSP_ADDRESS_SCHEMA_ERROR, e, null);
                }
            } else {
                addressListSchema = null;
            }
            OspAddressViewModel ospAddressViewModel = this.LIZJ;
            ECBaseFragment eCBaseFragment = this.LIZIZ;
            if (eCBaseFragment != null) {
                context = eCBaseFragment.getContext();
            } else {
                context = null;
            }
            ECBaseFragment eCBaseFragment2 = this.LIZIZ;
            if (eCBaseFragment2 != null) {
                strLJ = C960603pE.LJ(eCBaseFragment2);
            }
            OspAddressViewModel.xQ2(ospAddressViewModel, context, strLJ, addressListSchema, null, this.LIZ, Float.valueOf(0.7f), Boolean.TRUE, 8);
            C03O0 c03o0 = C03O0.LIZ;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel = this.LIZ;
            OspBottomViewModel ospBottomViewModel = this.LIZLLL;
            c03o0.getClass();
            C03O0.LLFZ(str, orderSubmitAssemViewModel, str2, ospBottomViewModel, null, false);
            return C03LS.ADDRESS;
        }
        if (value == C03I9.FILL_ADDRESS.getValue()) {
            OspAddressViewModel ospAddressViewModel2 = this.LIZJ;
            ECBaseFragment eCBaseFragment3 = this.LIZIZ;
            if (eCBaseFragment3 != null) {
                view = eCBaseFragment3.getView();
            }
            OspAddressViewModel.wQ2(ospAddressViewModel2, view, null, null, this.LIZ, EnumC818803Hu.PLACE_ORDER.getValue(), null, Boolean.TRUE, 38);
            C03O0 c03o02 = C03O0.LIZ;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = this.LIZ;
            OspBottomViewModel ospBottomViewModel2 = this.LIZLLL;
            c03o02.getClass();
            C03O0.LLFZ(str, orderSubmitAssemViewModel2, str2, ospBottomViewModel2, null, false);
            return C03LS.ADDRESS;
        }
        final int i = -1;
        if (value == C03I9.SELECT_SKU.getValue()) {
            ECBaseFragment eCBaseFragment4 = this.LIZIZ;
            if ((eCBaseFragment4 instanceof SeaOneStepOrderSubmitFragment) && (seaOneStepOrderSubmitFragment2 = (SeaOneStepOrderSubmitFragment) eCBaseFragment4) != null) {
                SeaSkuSpecViewModel seaSkuSpecViewModelAS = seaOneStepOrderSubmitFragment2.aS();
                List<String> list = seaSkuSpecViewModelAS.getState().LL;
                List<SaleProp> list2 = seaSkuSpecViewModelAS.LLILZ;
                if (list.isEmpty()) {
                    if (list2 != null) {
                        saleProp = (SaleProp) C13LP.LJJJLL(list2);
                    } else {
                        saleProp = null;
                    }
                    if (saleProp != null) {
                        str3 = saleProp.propName;
                        str4 = saleProp.propId;
                    } else {
                        str3 = null;
                    }
                    c443120HZe = new C443120HZe(0, str3, str4);
                } else if (list2 != null) {
                    int i2 = 0;
                    int i3 = 0;
                    for (SaleProp saleProp2 : list2) {
                        int i4 = i2 + 1;
                        if (i2 >= 0) {
                            SaleProp saleProp3 = saleProp2;
                            List<SalePropValue> list3 = saleProp3.salePropValueList;
                            if (list3 != null && list3.size() >= 1) {
                                List<SalePropValue> list4 = saleProp3.salePropValueList;
                                if (list4 != null) {
                                    ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(list4, 10));
                                    Iterator<SalePropValue> it2 = list4.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(it2.next().propValueId);
                                    }
                                    if (arrayList.contains(C13LP.LJJJLZIJ(i2, list))) {
                                        i3++;
                                    }
                                }
                                c443120HZe = new C443120HZe(Integer.valueOf(i3), saleProp3.propName, saleProp3.propId);
                                break;
                            }
                            i2 = i4;
                        } else {
                            C1697810uHb.LJIJI();
                            throw null;
                        }
                    }
                    c443120HZe = new C443120HZe(-1, null, null);
                } else {
                    c443120HZe = new C443120HZe(-1, null, null);
                }
                int iIntValue = ((Number) c443120HZe.getFirst()).intValue();
                final String str5 = (String) c443120HZe.getSecond();
                Object third = c443120HZe.getThird();
                if (iIntValue >= 0 && (c20691715xz = seaOneStepOrderSubmitFragment2.LLJJIJIIJIL) != null) {
                    Iterator<InterfaceC1891350zJl> it3 = seaOneStepOrderSubmitFragment2.bS().getState().LLILLJJLI.iterator();
                    int i5 = 0;
                    while (true) {
                        if (!it3.hasNext()) {
                            break;
                        }
                        InterfaceC1891350zJl next = it3.next();
                        if (next instanceof C031C) {
                            zLJFF = Intrinsics.LJFF(((C031C) next).LLIZ.propId, third);
                        } else if (next instanceof C747202vu) {
                            zLJFF = Intrinsics.LJFF(((C747202vu) next).LLIZ.propId, third);
                        } else {
                            continue;
                            i5++;
                        }
                        if (zLJFF) {
                            i = i5;
                            break;
                        }
                        i5++;
                    }
                    C20691715xz c20691715xz2 = seaOneStepOrderSubmitFragment2.LLJJIJIIJIL;
                    if (c20691715xz2 != null) {
                        HandlerHook.viewPost(c20691715xz2, new Runnable() { // from class: X.03I8
                            public final void LIZ() {
                                int i6 = i;
                                if (i6 >= 0) {
                                    seaOneStepOrderSubmitFragment2.hS(i6);
                                }
                                if (C123100dR.LIZ(str5)) {
                                    Context context2 = c20691715xz.getContext();
                                    String string = context2 != null ? context2.getString(2131832582, str5) : null;
                                    C1389880mGw c1389880mGw = new C1389880mGw(c20691715xz);
                                    c1389880mGw.LJIIIZ(string);
                                    c1389880mGw.LJIIJ();
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("SeaOneStepOrderSubmitFragment@522e.handleSelectSkuClickAction$1$1");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("SeaOneStepOrderSubmitFragment@522e.handleSelectSkuClickAction$1$1");
                            }
                        });
                    }
                }
            }
            C03O0 c03o03 = C03O0.LIZ;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = this.LIZ;
            OspBottomViewModel ospBottomViewModel3 = this.LIZLLL;
            c03o03.getClass();
            C03O0.LLFZ(str, orderSubmitAssemViewModel3, str2, ospBottomViewModel3, null, false);
            return C03LS.SKU;
        }
        if (value == C03I9.CPF.getValue()) {
            C03JV state = this.LIZ.getState();
            ECBaseFragment eCBaseFragment5 = this.LIZIZ;
            if ((eCBaseFragment5 instanceof SeaOneStepOrderSubmitFragment) && (seaOneStepOrderSubmitFragment = (SeaOneStepOrderSubmitFragment) eCBaseFragment5) != null) {
                constraintLayout = seaOneStepOrderSubmitFragment.LLJJIJI;
            } else {
                constraintLayout = null;
            }
            if (this.LIZ.jS2() && constraintLayout != null) {
                IdentityInfo identityInfo2 = this.LIZ.LLZLI;
                if (identityInfo2 != null) {
                    C03I0.LIZ.getClass();
                    C03I2 c03i2LIZ = C03I0.LIZ(identityInfo2);
                    if (c03i2LIZ != null) {
                        int i6 = C03I4.LIZ[c03i2LIZ.ordinal()];
                        if (i6 != 1) {
                            if (i6 == 2) {
                                OspAddressViewModel ospAddressViewModel3 = this.LIZJ;
                                OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = this.LIZ;
                                String value2 = EnumC818803Hu.PLACE_ORDER.getValue();
                                OrderSubmitAssemViewModel orderSubmitAssemViewModel5 = this.LIZ;
                                BillInfoData billInfoData3 = orderSubmitAssemViewModel5.LLJJI;
                                if (billInfoData3 != null) {
                                    strLJIIIIZZ2 = C1741890vQh.LJIIIIZZ(C7806033c.LJIIIIZZ(billInfoData3, orderSubmitAssemViewModel5, false));
                                }
                                C03I0.LIZLLL(ospAddressViewModel3, identityInfo2, constraintLayout, constraintLayout, orderSubmitAssemViewModel4, value2, strLJIIIIZZ2);
                            }
                        } else {
                            OspAddressViewModel ospAddressViewModel4 = this.LIZJ;
                            OrderSubmitAssemViewModel orderSubmitAssemViewModel6 = this.LIZ;
                            String value3 = EnumC818803Hu.PLACE_ORDER.getValue();
                            OrderSubmitAssemViewModel orderSubmitAssemViewModel7 = this.LIZ;
                            BillInfoData billInfoData4 = orderSubmitAssemViewModel7.LLJJI;
                            if (billInfoData4 != null) {
                                strLJIIIIZZ = C1741890vQh.LJIIIIZZ(C7806033c.LJIIIIZZ(billInfoData4, orderSubmitAssemViewModel7, false));
                            }
                            C03I0.LIZIZ(ospAddressViewModel4, identityInfo2, constraintLayout, constraintLayout, orderSubmitAssemViewModel6, value3, strLJIIIIZZ);
                        }
                    }
                }
                C03O0 c03o04 = C03O0.LIZ;
                OrderSubmitAssemViewModel orderSubmitAssemViewModel8 = this.LIZ;
                OspBottomViewModel ospBottomViewModel4 = this.LIZLLL;
                c03o04.getClass();
                C03O0.LLFZ(str, orderSubmitAssemViewModel8, str2, ospBottomViewModel4, null, false);
                return C03LS.IDENTITY;
            }
            IdentityInfo identityInfo3 = this.LIZ.LLZLI;
            if (identityInfo3 != null) {
                identityInfoCollectionStyle = identityInfo3.getIdentityInfoCollectionStyle();
            } else {
                identityInfoCollectionStyle = null;
            }
            if (identityInfoCollectionStyle == IdentityInfoCollectionStyle.STYLE1) {
                IdentityInfo identityInfo4 = this.LIZ.LLZLI;
                if (identityInfo4 != null && (recipientIdentityInfo2 = identityInfo4.getRecipientIdentityInfo()) != null) {
                    identityInfoVerificationMode = recipientIdentityInfo2.getIdentityInfoVerificationMode();
                } else {
                    identityInfoVerificationMode = null;
                }
                if (identityInfoVerificationMode == VerificationMode.STRICT && ((identityInfo = this.LIZ.LLZLI) == null || (recipientIdentityInfo = identityInfo.getRecipientIdentityInfo()) == null || (identityInfoHashId = recipientIdentityInfo.getIdentityInfoHashId()) == null || a0.LJJJIL(identityInfoHashId))) {
                    OspAddressViewModel ospAddressViewModel5 = this.LIZJ;
                    ospAddressViewModel5.getClass();
                    ospAddressViewModel5.withState(new AwS89S0110000_1(ospAddressViewModel5, true, 0));
                    OrderSubmitAssemViewModel.oT2(this.LIZ, "shipping_address", true);
                    return C03LS.IDENTITY;
                }
            }
            if (state.LLLLILI && state.LLLLIL == null) {
                OrderSubmitAssemViewModel.YS2(this.LIZ, "cpf", null, null, 14);
                OrderSubmitAssemViewModel orderSubmitAssemViewModel9 = this.LIZ;
                orderSubmitAssemViewModel9.getClass();
                orderSubmitAssemViewModel9.setState(new AwS16S0010000_1(true, 24));
                C03O0 c03o05 = C03O0.LIZ;
                HashMap<String, Object> mapHi1 = this.LIZ.hi1(false);
                c03o05.getClass();
                C03O0.LJJLIIIJLJLI(mapHi1);
                C1091940eWO.LIZIZ(1000L, new ARunnableS1S2100000_1(this, str, str2, 2));
                return C03LS.IDENTITY;
            }
        }
        return null;
    }

    public C03I7(OrderSubmitAssemViewModel orderSubmitAssemViewModel, ECBaseFragment eCBaseFragment, OspAddressViewModel ospAddressViewModel, OspBottomViewModel ospBottomViewModel) {
        this.LIZ = orderSubmitAssemViewModel;
        this.LIZIZ = eCBaseFragment;
        this.LIZJ = ospAddressViewModel;
        this.LIZLLL = ospBottomViewModel;
    }
}
