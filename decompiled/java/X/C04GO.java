package X;

import android.content.Context;
import android.view.View;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.CouponClaimSuccessEvent;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherRequest;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponse;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.ClaimVoucherResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.InstanceInfo;
import com.ss.android.ugc.aweme.ecommerce.base.coupon.repository.dto.Voucher;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.ProductPackStruct;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.PromotionDiscount;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.repository.dto.SellerInfo;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.vm.SeaPdpViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.starter.IPdpStarter;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.AwS86S1200000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.04GO, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04GO {
    public final SeaPdpViewModel LIZ;

    public C04GO(SeaPdpViewModel seaPdpViewModel) {
        this.LIZ = seaPdpViewModel;
    }

    public final boolean LIZIZ(Voucher voucher) {
        String instanceKey;
        List<PromotionDiscount> list;
        List<Voucher> list2;
        String instanceKey2;
        String voucherID;
        InstanceInfo instanceInfo;
        InstanceInfo instanceInfo2;
        String voucherTypeID = voucher.getVoucherTypeID();
        if (voucherTypeID == null) {
            voucherTypeID = "";
        }
        List<InstanceInfo> instanceInfoList = voucher.getInstanceInfoList();
        if (instanceInfoList == null || (instanceInfo2 = (InstanceInfo) C13LP.LJJJLL(instanceInfoList)) == null || (instanceKey = instanceInfo2.getInstanceKey()) == null) {
            instanceKey = "";
        }
        ProductPackStruct productPackStruct = this.LIZ.LLJIJIL;
        if (productPackStruct != null && (list = productPackStruct.promotionDiscounts) != null) {
            for (PromotionDiscount promotionDiscount : list) {
                Integer num = promotionDiscount.scene;
                if (num != null && num.intValue() == 1 && (list2 = promotionDiscount.discounts) != null) {
                    for (Voucher voucher2 : list2) {
                        if (Intrinsics.LJFF(voucher2.getVoucherTypeID(), voucherTypeID)) {
                            List<InstanceInfo> instanceInfoList2 = voucher2.getInstanceInfoList();
                            if (instanceInfoList2 == null || (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList2)) == null || (instanceKey2 = instanceInfo.getInstanceKey()) == null) {
                                instanceKey2 = "";
                            }
                            if (Intrinsics.LJFF(instanceKey2, instanceKey) && ((voucherID = voucher2.getVoucherID()) == null || voucherID.length() == 0)) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void LJFF(Voucher voucher) {
        List<PromotionDiscount> list;
        List<Voucher> list2;
        String instanceKey;
        InstanceInfo instanceInfo;
        InstanceInfo instanceInfo2;
        ProductPackStruct productPackStruct = this.LIZ.LLJIJIL;
        if (productPackStruct != null && (list = productPackStruct.promotionDiscounts) != null) {
            for (PromotionDiscount promotionDiscount : list) {
                Integer num = promotionDiscount.scene;
                if (num != null && num.intValue() == 1 && (list2 = promotionDiscount.discounts) != null) {
                    List<InstanceInfo> instanceInfoList = voucher.getInstanceInfoList();
                    String instanceKey2 = null;
                    if (instanceInfoList != null && (instanceInfo2 = (InstanceInfo) C13LP.LJJJLL(instanceInfoList)) != null) {
                        instanceKey2 = instanceInfo2.getInstanceKey();
                    }
                    if (instanceKey2 == null) {
                        instanceKey2 = "";
                    }
                    ArrayList arrayList = new ArrayList(list2);
                    int size = arrayList.size();
                    int i = 0;
                    while (true) {
                        if (i >= size) {
                            break;
                        }
                        if (Intrinsics.LJFF(((Voucher) ListProtector.get(arrayList, i)).getVoucherTypeID(), voucher.getVoucherTypeID())) {
                            List<InstanceInfo> instanceInfoList2 = ((Voucher) ListProtector.get(arrayList, i)).getInstanceInfoList();
                            if (instanceInfoList2 == null || (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList2)) == null || (instanceKey = instanceInfo.getInstanceKey()) == null) {
                                instanceKey = "";
                            }
                            if (Intrinsics.LJFF(instanceKey, instanceKey2)) {
                                ListProtector.set(arrayList, i, voucher);
                                break;
                            }
                        }
                        i++;
                    }
                    promotionDiscount.discounts = arrayList;
                }
            }
        }
        SeaPdpViewModel seaPdpViewModel = this.LIZ;
        C1054104Ah c1054104Ah = seaPdpViewModel.LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJJJI(seaPdpViewModel.LLJIJIL);
        }
        this.LIZ.setState(new AwS580S0100000_1(this, 952));
    }

    public final void LIZ(final Voucher voucher, final View view, final int i) {
        String instanceKey;
        InstanceInfo instanceInfo;
        C1017603yQ c1017603yQ = InterfaceC1018003yU.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLIZ;
        c1017603yQ.getClass();
        int iLIZ = C1017603yQ.LIZ(pdpEnterParam);
        String voucherTypeID = voucher.getVoucherTypeID();
        if (voucherTypeID == null) {
            voucherTypeID = "";
        }
        Integer numValueOf = Integer.valueOf(iLIZ);
        Map<String, String> transparentFields = voucher.getTransparentFields();
        List<InstanceInfo> instanceInfoList = voucher.getInstanceInfoList();
        if (instanceInfoList != null && (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList)) != null) {
            instanceKey = instanceInfo.getInstanceKey();
        } else {
            instanceKey = null;
        }
        ClaimVoucherRequest claimVoucherRequest = new ClaimVoucherRequest(voucherTypeID, 1, numValueOf, null, null, null, transparentFields, instanceKey);
        InterfaceC1069804Gi.LIZ.getClass();
        ((InterfaceC1069804Gi) C1069904Gj.LIZIZ.create(InterfaceC1069804Gi.class)).LIZJ(claimVoucherRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LIZIZ(new C11N2<ClaimVoucherResponse>() { // from class: X.04GP
            @Override // X.InterfaceC626120Oh8
            public final void onComplete() throws JSONException {
                LIZ(1, null, "");
                dispose();
            }

            @Override // X.InterfaceC626120Oh8
            public final void onError(Throwable th) throws JSONException {
                LIZ(1, null, "");
                dispose();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // X.InterfaceC626120Oh8
            public final void onNext(Object obj) throws JSONException {
                String strValueOf;
                Voucher voucher2;
                boolean z;
                Voucher voucher3;
                String voucherID;
                Response response = (Response) obj;
                int i2 = 4;
                if (response.isCodeOK()) {
                    ClaimVoucherResponseData claimVoucherResponseData = (ClaimVoucherResponseData) response.data;
                    if (claimVoucherResponseData != null && (voucher3 = claimVoucherResponseData.getVoucher()) != null && (voucherID = voucher3.getVoucherID()) != null && C123100dR.LIZ(voucherID)) {
                        z = true;
                    } else {
                        z = false;
                    }
                    strValueOf = "";
                    if (z) {
                        i2 = 3;
                    } else {
                        ClaimVoucherResponseData claimVoucherResponseData2 = (ClaimVoucherResponseData) response.data;
                        if (claimVoucherResponseData2 == null || !Intrinsics.LJFF(claimVoucherResponseData2.getCanRetry(), Boolean.FALSE)) {
                            i2 = 1;
                        }
                    }
                } else {
                    ClaimVoucherResponseData claimVoucherResponseData3 = (ClaimVoucherResponseData) response.data;
                    if (claimVoucherResponseData3 == null || !Intrinsics.LJFF(claimVoucherResponseData3.getCanRetry(), Boolean.FALSE)) {
                        i2 = 1;
                    }
                    strValueOf = String.valueOf(response.code);
                }
                ClaimVoucherResponseData claimVoucherResponseData4 = (ClaimVoucherResponseData) response.data;
                if (claimVoucherResponseData4 != null) {
                    voucher2 = claimVoucherResponseData4.getVoucher();
                } else {
                    voucher2 = null;
                }
                LIZ(i2, voucher2, strValueOf);
                dispose();
            }

            public final void LIZ(int i2, Voucher voucher2, String str) throws JSONException {
                int i3;
                InstanceInfo instanceInfo2;
                String instanceKey2;
                Voucher voucher3;
                int i4;
                String instanceKey3;
                List<PromotionDiscount> list;
                List<Voucher> list2;
                String instanceKey4;
                InstanceInfo instanceInfo3;
                InstanceInfo instanceInfo4;
                C04GO c04go = this.LLILLJJLI;
                View view2 = view;
                c04go.getClass();
                if (i2 != 3) {
                    if (i2 != 4) {
                        i3 = 2131832604;
                    } else {
                        i3 = 2131832605;
                    }
                } else {
                    i3 = 2131832603;
                }
                C1389890mGx c1389890mGx = new C1389890mGx(view2);
                c1389890mGx.LJIIIZ(i3);
                c1389890mGx.LJIIJJI();
                String str2 = "";
                if (voucher2 != null) {
                    List<InstanceInfo> instanceInfoList2 = voucher2.getInstanceInfoList();
                    if (instanceInfoList2 == null || (instanceInfo4 = (InstanceInfo) C13LP.LJJJLL(instanceInfoList2)) == null || (instanceKey3 = instanceInfo4.getInstanceKey()) == null) {
                        instanceKey3 = "";
                    }
                    ProductPackStruct productPackStruct = this.LLILLJJLI.LIZ.LLJIJIL;
                    if (productPackStruct != null && (list = productPackStruct.promotionDiscounts) != null) {
                        for (PromotionDiscount promotionDiscount : list) {
                            Integer num = promotionDiscount.scene;
                            if (num != null && num.intValue() == 1 && (list2 = promotionDiscount.discounts) != null) {
                                ArrayList arrayList = new ArrayList(list2);
                                int size = arrayList.size();
                                int i5 = 0;
                                while (true) {
                                    if (i5 >= size) {
                                        break;
                                    }
                                    if (Intrinsics.LJFF(((Voucher) ListProtector.get(arrayList, i5)).getVoucherTypeID(), voucher2.getVoucherTypeID())) {
                                        List<InstanceInfo> instanceInfoList3 = ((Voucher) ListProtector.get(arrayList, i5)).getInstanceInfoList();
                                        if (instanceInfoList3 == null || (instanceInfo3 = (InstanceInfo) C13LP.LJJJLL(instanceInfoList3)) == null || (instanceKey4 = instanceInfo3.getInstanceKey()) == null) {
                                            instanceKey4 = "";
                                        }
                                        if (Intrinsics.LJFF(instanceKey4, instanceKey3)) {
                                            ListProtector.set(arrayList, i5, voucher2);
                                            break;
                                        }
                                    }
                                    i5++;
                                }
                                promotionDiscount.discounts = arrayList;
                            }
                        }
                    }
                }
                SeaPdpViewModel seaPdpViewModel = this.LLILLJJLI.LIZ;
                C1054104Ah c1054104Ah = seaPdpViewModel.LLJLIL;
                if (c1054104Ah != null) {
                    c1054104Ah.LJJJJI(seaPdpViewModel.LLJIJIL);
                }
                C04GO c04go2 = this.LLILLJJLI;
                c04go2.LIZ.setState(new AwS580S0100000_1(c04go2, 950));
                C1054104Ah c1054104Ah2 = this.LLILLJJLI.LIZ.LLJLIL;
                if (c1054104Ah2 != null) {
                    if (voucher2 == null) {
                        voucher3 = voucher;
                    } else {
                        voucher3 = voucher2;
                    }
                    if (i2 == 3) {
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    c1054104Ah2.LJIILLIIL(voucher3, i4, str, i, Boolean.FALSE);
                }
                if (i2 == 3 && voucher2 != null) {
                    this.LLILLJJLI.getClass();
                    IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
                    iEventCenterLIZ.LIZ("ec_vouchers_claim_success_event", C1741890vQh.LJIIIIZZ(new CouponClaimSuccessEvent(C1741890vQh.LJIIIIZZ(Collections.singletonList(voucher2)))));
                    JSONObject jSONObject = new JSONObject();
                    String voucherTypeID2 = voucher2.getVoucherTypeID();
                    if (voucherTypeID2 == null) {
                        voucherTypeID2 = "";
                    }
                    jSONObject.put("voucher_type_id", voucherTypeID2);
                    List<InstanceInfo> instanceInfoList4 = voucher2.getInstanceInfoList();
                    if (instanceInfoList4 != null && (instanceInfo2 = (InstanceInfo) C13LP.LJJJLL(instanceInfoList4)) != null && (instanceKey2 = instanceInfo2.getInstanceKey()) != null) {
                        str2 = instanceKey2;
                    }
                    jSONObject.put("instance_key", str2);
                    iEventCenterLIZ.LIZ("ec_short_touch_claim_targeted_voucher", C786410Ut5.J3(jSONObject));
                }
            }
        });
    }

    public final void LIZJ(Context context, String str, String str2, String str3) {
        String str4;
        Object obj;
        String str5;
        Map<String, Object> map;
        Map<String, Object> map2;
        SellerInfo sellerInfo;
        ArrayList arrayList = new ArrayList();
        ProductPackStruct productPackStruct = this.LIZ.LLJIJIL;
        String str6 = null;
        if (productPackStruct != null && (sellerInfo = productPackStruct.sellerInfo) != null) {
            str4 = sellerInfo.sellerId;
        } else {
            str4 = null;
        }
        arrayList.add(String.valueOf(str4));
        C1013103xh c1013103xh = InterfaceC1012803xe.LIZ;
        String strLJII = this.LIZ.LLLLL.LJII("c5815.d0", str, null);
        IPdpStarter.PdpEnterParam pdpEnterParam = this.LIZ.LLIZ;
        if (pdpEnterParam != null && (map2 = pdpEnterParam.trackParams) != null) {
            obj = map2.get("entrance_info");
        } else {
            obj = null;
        }
        if (obj instanceof String) {
            str5 = (String) obj;
        } else {
            str5 = null;
        }
        IPdpStarter.PdpEnterParam pdpEnterParam2 = this.LIZ.LLIZ;
        if (pdpEnterParam2 != null) {
            map = pdpEnterParam2.trackParams;
        } else {
            map = null;
        }
        InterfaceC1018003yU.LIZ.getClass();
        String strValueOf = String.valueOf(C1017603yQ.LIZ(pdpEnterParam2));
        Boolean boolValueOf = Boolean.valueOf(this.LIZ.LLIZLLLIL);
        SeaPdpViewModel seaPdpViewModel = this.LIZ;
        IPdpStarter.PdpEnterParam pdpEnterParam3 = seaPdpViewModel.LLIZ;
        if (pdpEnterParam3 != null) {
            str6 = pdpEnterParam3.sourceInfo;
        }
        C1013103xh.LIZ(c1013103xh, context, strLJII, str5, map, str2, str3, strValueOf, boolValueOf, str6, seaPdpViewModel.getSkuId(), arrayList, false, null, null, 28672);
    }

    public final void LIZLLL(Context context, String str, C04GW c04gw, String str2) {
        InterfaceC1748810vbr interfaceC1748810vbrLJJIZ;
        C1054104Ah c1054104Ah = this.LIZ.LLJLIL;
        if (c1054104Ah != null && (interfaceC1748810vbrLJJIZ = c1054104Ah.LJJIZ()) != null) {
            C1748720vbi.LIZIZ(interfaceC1748810vbrLJJIZ, new C10516049i(), new AwS86S1200000_1(c1054104Ah, str2, c04gw, 24));
        }
        if (str == null) {
            return;
        }
        C919503ib.LIZIZ(context, str, C2097908Jt.LIZJ(new Pair("trackParams", C2097608Jq.LJI(new Pair("entrance_info", this.LIZ.PR2()), new Pair("previous_page", "product_detail")))), false).open();
    }

    public final void LJ(Context context, int i, int i2, String str, Voucher voucher, Voucher voucher2) throws JSONException {
        int i3;
        InstanceInfo instanceInfo;
        String instanceKey;
        int i4;
        ProductPackStruct productPackStruct;
        List<PromotionDiscount> list;
        List<Voucher> list2;
        String instanceKey2;
        String instanceKey3;
        InstanceInfo instanceInfo2;
        InstanceInfo instanceInfo3;
        Voucher voucher3 = voucher2;
        if (i2 != 3) {
            if (i2 != 4) {
                i3 = 2131832604;
            } else {
                i3 = 2131832605;
            }
        } else {
            i3 = 2131832938;
        }
        C1233040iBy c1233040iBy = new C1233040iBy(context);
        c1233040iBy.LIZIZ(i3);
        c1233040iBy.LIZLLL();
        String str2 = "";
        if (voucher != null && (productPackStruct = this.LIZ.LLJIJIL) != null && (list = productPackStruct.promotionDiscounts) != null) {
            for (PromotionDiscount promotionDiscount : list) {
                Integer num = promotionDiscount.scene;
                if (num != null && num.intValue() == 1 && (list2 = promotionDiscount.discounts) != null) {
                    ArrayList arrayList = new ArrayList(list2);
                    List<InstanceInfo> instanceInfoList = voucher.getInstanceInfoList();
                    if (instanceInfoList == null || (instanceInfo3 = (InstanceInfo) C13LP.LJJJLL(instanceInfoList)) == null || (instanceKey2 = instanceInfo3.getInstanceKey()) == null) {
                        instanceKey2 = "";
                    }
                    int size = arrayList.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 >= size) {
                            break;
                        }
                        if (Intrinsics.LJFF(((Voucher) ListProtector.get(arrayList, i5)).getVoucherTypeID(), voucher.getVoucherTypeID())) {
                            List<InstanceInfo> instanceInfoList2 = ((Voucher) ListProtector.get(arrayList, i5)).getInstanceInfoList();
                            if (instanceInfoList2 == null || (instanceInfo2 = (InstanceInfo) C13LP.LJJJLL(instanceInfoList2)) == null || (instanceKey3 = instanceInfo2.getInstanceKey()) == null) {
                                instanceKey3 = "";
                            }
                            if (Intrinsics.LJFF(instanceKey3, instanceKey2)) {
                                ListProtector.set(arrayList, i5, voucher);
                                break;
                            }
                        }
                        i5++;
                    }
                    promotionDiscount.discounts = arrayList;
                }
            }
        }
        SeaPdpViewModel seaPdpViewModel = this.LIZ;
        C1054104Ah c1054104Ah = seaPdpViewModel.LLJLIL;
        if (c1054104Ah != null) {
            c1054104Ah.LJJJJI(seaPdpViewModel.LLJIJIL);
        }
        this.LIZ.setState(new AwS580S0100000_1(this, 951));
        C1054104Ah c1054104Ah2 = this.LIZ.LLJLIL;
        if (c1054104Ah2 != null) {
            if (voucher != null) {
                voucher3 = voucher;
            }
            if (i2 == 3) {
                i4 = 1;
            } else {
                i4 = 0;
            }
            c1054104Ah2.LJIILLIIL(voucher3, i4, str, i, Boolean.TRUE);
        }
        if (i2 == 3 && voucher != null) {
            IEventCenter iEventCenterLIZ = AnonymousClass0378.LIZ();
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(voucher);
            iEventCenterLIZ.LIZ("ec_follow_and_claim_voucher", C1741890vQh.LJIIIIZZ(new CouponClaimSuccessEvent(C1741890vQh.LJIIIIZZ(arrayList2))));
            JSONObject jSONObject = new JSONObject();
            String voucherTypeID = voucher.getVoucherTypeID();
            if (voucherTypeID == null) {
                voucherTypeID = "";
            }
            jSONObject.put("voucher_type_id", voucherTypeID);
            List<InstanceInfo> instanceInfoList3 = voucher.getInstanceInfoList();
            if (instanceInfoList3 != null && (instanceInfo = (InstanceInfo) C13LP.LJJJLL(instanceInfoList3)) != null && (instanceKey = instanceInfo.getInstanceKey()) != null) {
                str2 = instanceKey;
            }
            jSONObject.put("instance_key", str2);
            iEventCenterLIZ.LIZ("ec_short_touch_claim_targeted_voucher", C786410Ut5.J3(jSONObject));
        }
    }
}
