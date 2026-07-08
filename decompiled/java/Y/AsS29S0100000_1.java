package Y;

import X.AbstractC1585810rMx;
import X.C03T6;
import X.C03Z4;
import X.C04FA;
import X.C0P0T;
import X.C1018703yb;
import X.C10523049p;
import X.C1064604Ei;
import X.C123100dR;
import X.C13LP;
import X.C1748720vbi;
import X.C2188811AlT;
import X.C2341109Fh;
import X.C430110Gtl;
import X.C703302op;
import X.C736680Sv4;
import X.C873003b6;
import X.C890103dr;
import X.C893803eS;
import X.C903203fy;
import X.C926303jh;
import X.C926403ji;
import X.EnumC1064704Ej;
import X.InterfaceC1065204Eo;
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.MiniOspFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.SeaOneStepOrderSubmitFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ccdc.cci.BankInstallmentAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.Availability;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.BindInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.subpayment.SubPaymentListAssem;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.AddressSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoSetting;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.core.module.ModuleManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Set;
import kotlin.jvm.internal.AwS227S0000000_1;
import kotlin.jvm.internal.AwS245S0300000_1;
import kotlin.jvm.internal.AwS367S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import nla.b;
import oqa.h;

/* JADX INFO: loaded from: classes2.dex */
public class AsS29S0100000_1 extends AbstractC1585810rMx {
    public final int $t;
    public Object l0;

    public static final void LJJIIZI$1(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i, int i2) {
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIJ(RecyclerView recyclerView, int i) {
        switch (this.$t) {
            case 0:
                LJJIIJ$0(this, recyclerView, i);
                break;
            case 1:
                LJJIIJ$1(this, recyclerView, i);
                break;
            case 2:
                LJJIIJ$2(this, recyclerView, i);
                break;
            case 3:
                LJJIIJ$3(this, recyclerView, i);
                break;
            case 4:
            case 6:
            default:
                super.LJJIIJ(recyclerView, i);
                break;
            case 5:
                LJJIIJ$4(this, recyclerView, i);
                break;
            case 7:
                LJJIIJ$5(this, recyclerView, i);
                break;
            case 8:
                LJJIIJ$6(this, recyclerView, i);
                break;
        }
    }

    @Override // X.AbstractC1585810rMx
    public final void LJJIIZI(RecyclerView recyclerView, int i, int i2) {
        switch (this.$t) {
            case 0:
                LJJIIZI$0(this, recyclerView, i, i2);
                break;
            case 1:
                LJJIIZI$1(this, recyclerView, i, i2);
                break;
            case 2:
                LJJIIZI$2(this, recyclerView, i, i2);
                break;
            case 3:
                LJJIIZI$3(this, recyclerView, i, i2);
                break;
            case 4:
                LJJIIZI$4(this, recyclerView, i, i2);
                break;
            case 5:
                LJJIIZI$5(this, recyclerView, i, i2);
                break;
            case 6:
                LJJIIZI$6(this, recyclerView, i, i2);
                break;
            case 7:
                LJJIIZI$7(this, recyclerView, i, i2);
                break;
            case 8:
                LJJIIZI$8(this, recyclerView, i, i2);
                break;
            default:
                super.LJJIIZI(recyclerView, i, i2);
                break;
        }
    }

    public AsS29S0100000_1(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LJJIIJ$0(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i) {
        ((CombinedSkuOrderSubmitFragment) asS29S0100000_1.l0).VR().dR2(new AwS227S0000000_1(recyclerView, i, 0));
        if (i == 1) {
            OrderSubmitAssemViewModel orderSubmitAssemViewModelVR = ((CombinedSkuOrderSubmitFragment) asS29S0100000_1.l0).VR();
            C0P0T c0p0t = orderSubmitAssemViewModelVR.b0;
            AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(orderSubmitAssemViewModelVR, 1518);
            if (c0p0t != null) {
                c0p0t.dismiss();
            }
            awS545S0100000_1.invoke();
            return;
        }
        if (i != 0) {
            return;
        }
        CombinedSkuOrderSubmitFragment combinedSkuOrderSubmitFragment = (CombinedSkuOrderSubmitFragment) asS29S0100000_1.l0;
        if (!combinedSkuOrderSubmitFragment.LLJLILLLLZIIL) {
            combinedSkuOrderSubmitFragment.ZR(recyclerView);
        }
        if (!((CombinedSkuOrderSubmitFragment) asS29S0100000_1.l0).VR().c0) {
            return;
        }
        ((CombinedSkuOrderSubmitFragment) asS29S0100000_1.l0).aS(recyclerView);
    }

    public static final void LJJIIJ$1(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i) {
        ModuleManager moduleManager = ((MiniOspFragment) asS29S0100000_1.l0).WR().LLLFFI;
        if (moduleManager != null && i != 0) {
            moduleManager.LJJI = true;
            if (ModuleManager.LJJJJZI == 0) {
                ModuleManager.LJJJJZI = ModuleManager.LJJJJZ;
            }
        }
    }

    public static final void LJJIIJ$2(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i) {
        LinearLayoutManager linearLayoutManager;
        BillInfoData billInfoData;
        PlatformPromotion platformPromotion;
        View view;
        View viewFindViewByPosition;
        b bVar;
        BillInfoData billInfoData2;
        BillInfoSetting billInfoSetting;
        AddressSetting addressSetting;
        Integer num;
        ModuleManager moduleManager = ((OrderSubmitFragment) asS29S0100000_1.l0).ZR().LLZIL;
        if (moduleManager != null) {
            if (i != 0) {
                moduleManager.LJJI = true;
                if (ModuleManager.LJJJJZI == 0) {
                    ModuleManager.LJJJJZI = ModuleManager.LJJJJZ;
                    return;
                }
                return;
            }
        } else if (i != 0) {
            return;
        }
        OrderSubmitFragment orderSubmitFragment = (OrderSubmitFragment) asS29S0100000_1.l0;
        if (!orderSubmitFragment.LLJZ) {
            orderSubmitFragment.rS(recyclerView);
        }
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            linearLayoutManager = (LinearLayoutManager) layoutManager;
        } else {
            linearLayoutManager = null;
        }
        if (linearLayoutManager != null && (viewFindViewByPosition = linearLayoutManager.findViewByPosition(linearLayoutManager.findFirstVisibleItemPosition())) != null && (((bVar = ((OrderSubmitFragment) asS29S0100000_1.l0).LLJJL) != null && bVar.LJJJJZ()) || ((billInfoData2 = ((OrderSubmitFragment) asS29S0100000_1.l0).ZR().LLJJI) != null && (billInfoSetting = billInfoData2.settings) != null && (addressSetting = billInfoSetting.addressSetting) != null && (num = addressSetting.pinToTopAddress) != null && num.intValue() == 1))) {
            C736680Sv4.LJIJJ(((OrderSubmitFragment) asS29S0100000_1.l0).ZR(), new AwS367S0200000_1(viewFindViewByPosition, (OrderSubmitFragment) asS29S0100000_1.l0, 79));
        }
        ((OrderSubmitFragment) asS29S0100000_1.l0).ZR().LLLILZLLLI = null;
        OrderSubmitFragment orderSubmitFragment2 = (OrderSubmitFragment) asS29S0100000_1.l0;
        if (orderSubmitFragment2.LLL && orderSubmitFragment2.ZR().f349Y != null && (billInfoData = orderSubmitFragment2.ZR().LLJJI) != null && (platformPromotion = billInfoData.platformPromotion) != null && platformPromotion.bonusInfo != null) {
            C03T6 c03t6 = orderSubmitFragment2.ZR().W;
            Context context = orderSubmitFragment2.getContext();
            if (context != null && c03t6 != null && (view = c03t6.LIZ.LLLF) != null) {
                C430110Gtl.LIZ(view, new AwS245S0300000_1(context, c03t6, orderSubmitFragment2, 44));
            }
        }
        ((OrderSubmitFragment) asS29S0100000_1.l0).LLL = false;
    }

    public static final void LJJIIJ$3(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i) {
        boolean z;
        SeaOneStepOrderSubmitFragment seaOneStepOrderSubmitFragment = (SeaOneStepOrderSubmitFragment) asS29S0100000_1.l0;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        seaOneStepOrderSubmitFragment.LLLIIIIL = z;
    }

    public static final void LJJIIJ$4(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i) {
        String str;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScrollStateChanged, newState: ");
        sbLIZ.append(i);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        if (i != 0) {
            if (i == 1) {
                ((SubPaymentListAssem) asS29S0100000_1.l0).LLJJJ = 0;
                return;
            }
            return;
        }
        SubPaymentListAssem subPaymentListAssem = (SubPaymentListAssem) asS29S0100000_1.l0;
        if (subPaymentListAssem.LLJJJ >= 0) {
            str = "more";
        } else {
            str = "less";
        }
        C926303jh c926303jh = subPaymentListAssem.Jo().LLILZIL;
        c926303jh.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.putAll(c926303jh.LIZ);
        linkedHashMap.put("glide_type", str);
        C1018703yb.LIZIZ("tiktokec_glide_page", linkedHashMap);
    }

    public static final void LJJIIJ$5(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i) {
        C04FA c04fa = (C04FA) asS29S0100000_1.l0;
        if (c04fa.LLJJIJIIJIL != 0) {
            if (i == 0) {
                if (c04fa.LLJJIJI > 8) {
                    C1748720vbi.LIZLLL(c04fa, new C10523049p(), new AwS580S0100000_1((C04FA) asS29S0100000_1.l0, 736));
                }
                ((C04FA) asS29S0100000_1.l0).LLJJIJI = 0;
            }
        } else if (i == 0) {
            ((C04FA) asS29S0100000_1.l0).LLJJIJI = 0;
        }
        ((C04FA) asS29S0100000_1.l0).LLJJIJIIJIL = i;
    }

    public static final void LJJIIJ$6(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i) {
        C1064604Ei c1064604Ei = (C1064604Ei) asS29S0100000_1.l0;
        if (c1064604Ei.LLJJI != 0) {
            if (i == 0) {
                if (c1064604Ei.LLJJ != 8) {
                    C1748720vbi.LIZLLL(c1064604Ei, new C10523049p(), new AwS580S0100000_1((C1064604Ei) asS29S0100000_1.l0, 795));
                }
                ((C1064604Ei) asS29S0100000_1.l0).LLJJ = 0;
            }
        } else if (i == 0) {
            ((C1064604Ei) asS29S0100000_1.l0).LLJJ = 0;
        }
        ((C1064604Ei) asS29S0100000_1.l0).LLJJI = i;
    }

    public static final void LJJIIZI$0(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i, int i2) {
        ((CombinedSkuOrderSubmitFragment) asS29S0100000_1.l0).VR().dR2(new AwS227S0000000_1(recyclerView, i, i2, 1));
    }

    public static final void LJJIIZI$2(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i, int i2) {
        ((OrderSubmitFragment) asS29S0100000_1.l0).sS(recyclerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0100  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIZI$3(Y.AsS29S0100000_1 r10, androidx.recyclerview.widget.RecyclerView r11, int r12, int r13) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: Y.AsS29S0100000_1.LJJIIZI$3(Y.AsS29S0100000_1, androidx.recyclerview.widget.RecyclerView, int, int):void");
    }

    public static final void LJJIIZI$4(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i, int i2) {
        PaymentMethod paymentMethod;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        recyclerView.getLocationOnScreen(iArr2);
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        PaymentFragment paymentFragment = (PaymentFragment) asS29S0100000_1.l0;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null) {
                if (viewFindViewByPosition instanceof h) {
                    paymentMethod = ((h) viewFindViewByPosition).getPaymentMethod();
                } else if (viewFindViewByPosition instanceof C03Z4) {
                    paymentMethod = ((C03Z4) viewFindViewByPosition).getPaymentMethod();
                }
                if (paymentMethod != null) {
                    viewFindViewByPosition.getLocationOnScreen(iArr);
                    if ((recyclerView.getHeight() + iArr2[1]) - iArr[1] > 0) {
                        paymentFragment.withState(paymentFragment.yS(), new AwS367S0200000_1(paymentFragment, paymentMethod, 105));
                    }
                }
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    public static final void LJJIIZI$5(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i, int i2) {
        boolean zLJFF;
        String str;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onScrolled, dy: ");
        sbLIZ.append(i2);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LJ(strLIZIZ);
        ((SubPaymentListAssem) asS29S0100000_1.l0).LLJJJ += i2;
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        SubPaymentListAssem subPaymentListAssem = (SubPaymentListAssem) asS29S0100000_1.l0;
        int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        if (iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
            return;
        }
        while (true) {
            C926403ji c926403ji = (C926403ji) C13LP.LJJJLZIJ(iFindFirstVisibleItemPosition, subPaymentListAssem.LLJJIJI);
            if (c926403ji != null) {
                String str2 = subPaymentListAssem.LLJJIJIIJIL;
                if (str2 == null) {
                    if (iFindFirstVisibleItemPosition == 0) {
                        zLJFF = true;
                    } else {
                        zLJFF = false;
                    }
                } else {
                    zLJFF = Intrinsics.LJFF(str2, c926403ji.LLILLJJLI.id);
                }
                C926303jh c926303jh = subPaymentListAssem.Jo().LLILZIL;
                PaymentMethod paymentMethod = c926403ji.LLILLJJLI;
                String strLJJIIZ = c926403ji.LL.LJJIIZ();
                String strLJJIIZ2 = c926403ji.LLILLJJLI.LJJIIZ();
                boolean zLIZ = C123100dR.LIZ(c926403ji.LLILLJJLI.extraInfo);
                Availability availability = c926403ji.LLILLJJLI.availability;
                if (availability != null) {
                    str = availability.statusCode;
                } else {
                    str = null;
                }
                if (!((ArrayList) c926303jh.LIZJ).contains(paymentMethod.LJIIJ())) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.putAll(c926303jh.LIZ);
                    linkedHashMap.put("parent_option_name", strLJJIIZ);
                    linkedHashMap.put("option_name", strLJJIIZ2);
                    linkedHashMap.put("option_type", "sub_payment_type");
                    linkedHashMap.put("is_option_discounted", Integer.valueOf(zLIZ ? 1 : 0));
                    linkedHashMap.put("original_rank", Integer.valueOf(iFindFirstVisibleItemPosition));
                    if (str != null && str.length() != 0) {
                        linkedHashMap.put("status_code", str);
                    }
                    if (zLJFF) {
                        linkedHashMap.put("is_default", 1);
                    }
                    String strLJIJJ = paymentMethod.LJIJJ(false);
                    linkedHashMap.put("is_payment_promoted", Integer.valueOf(C703302op.LIZ(strLJIJJ) ? 1 : 0));
                    String str3 = "";
                    if (strLJIJJ == null) {
                        strLJIJJ = "";
                    }
                    linkedHashMap.put("promotion_info", strLJIJJ);
                    String strLJIJ = paymentMethod.LJIJ();
                    if (strLJIJ != null) {
                        str3 = strLJIJ;
                    }
                    linkedHashMap.put("marketing_batch_id", str3);
                    C1018703yb.LIZIZ("tiktokec_option_show", linkedHashMap);
                    ((ArrayList) c926303jh.LIZJ).add(paymentMethod.LJIIJ());
                }
            }
            if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                iFindFirstVisibleItemPosition++;
            } else {
                return;
            }
        }
    }

    public static final void LJJIIZI$6(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        String str;
        String strLJJIIZ;
        PaymentMethod paymentMethod;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        String str2;
        BindInfo bindInfo;
        String str3;
        PaymentMethod paymentMethod2;
        String str4;
        PaymentMethod paymentMethod3;
        String str5;
        String str6;
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        recyclerView.getLocationOnScreen(iArr2);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (iFindFirstVisibleItemPosition == -1 || iFindLastVisibleItemPosition == -1 || iFindFirstVisibleItemPosition > iFindLastVisibleItemPosition) {
                return;
            }
            while (true) {
                if (linearLayoutManager != null) {
                    View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
                    if (viewFindViewByPosition != null) {
                        viewFindViewByPosition.getLocationOnScreen(iArr);
                        if ((recyclerView.getHeight() + iArr2[1]) - iArr[1] > 0 && (viewFindViewByPosition instanceof C903203fy)) {
                            Set<String> set = ((BankInstallmentAssem) asS29S0100000_1.l0).LLJILLL;
                            C903203fy c903203fy = (C903203fy) viewFindViewByPosition;
                            C873003b6 bankInfo = c903203fy.getBankInfo();
                            if (bankInfo != null) {
                                str = bankInfo.LIZJ;
                            } else {
                                str = null;
                            }
                            if (!set.contains(str)) {
                                C890103dr c890103dr = C890103dr.LIZ;
                                C873003b6 bankInfo2 = c903203fy.getBankInfo();
                                if (bankInfo2 != null && (str6 = bankInfo2.LIZJ) != null) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append(str6);
                                    sbLIZ.append("_INSTALLMENT");
                                    strLJJIIZ = C2188811AlT.LIZIZ(sbLIZ);
                                } else {
                                    strLJJIIZ = null;
                                }
                                C873003b6 bankInfo3 = c903203fy.getBankInfo();
                                if (bankInfo3 != null) {
                                    paymentMethod = bankInfo3.LJFF;
                                } else {
                                    paymentMethod = null;
                                }
                                Integer numValueOf = Integer.valueOf(((BankInstallmentAssem) asS29S0100000_1.l0).Lo().vQ2(c903203fy.getBankInfo()));
                                C873003b6 bankInfo4 = c903203fy.getBankInfo();
                                if (bankInfo4 != null && (paymentMethod3 = bankInfo4.LJFF) != null && (str5 = paymentMethod3.extraInfo) != null) {
                                    boolValueOf = Boolean.valueOf(C123100dR.LIZ(str5));
                                } else {
                                    boolValueOf = null;
                                }
                                Boolean bool = Boolean.FALSE;
                                C873003b6 bankInfo5 = c903203fy.getBankInfo();
                                if (bankInfo5 != null && (paymentMethod2 = bankInfo5.LJFF) != null && (str4 = paymentMethod2.balance) != null) {
                                    boolValueOf2 = Boolean.valueOf(C123100dR.LIZ(str4));
                                } else {
                                    boolValueOf2 = null;
                                }
                                c890103dr.getClass();
                                LinkedHashMap linkedHashMap = new LinkedHashMap();
                                linkedHashMap.putAll(C890103dr.LIZJ);
                                if (strLJJIIZ != null || (paymentMethod != null && (strLJJIIZ = paymentMethod.LJJIIZ()) != null)) {
                                    linkedHashMap.put("option_name", strLJJIIZ);
                                }
                                if (numValueOf != null) {
                                    linkedHashMap.put("rank", Integer.valueOf(numValueOf.intValue()));
                                }
                                if (boolValueOf != null) {
                                    linkedHashMap.put("is_option_discounted", Integer.valueOf(boolValueOf.booleanValue() ? 1 : 0));
                                }
                                linkedHashMap.put("option_type", "payment_type");
                                if (bool != null) {
                                    linkedHashMap.put("is_pay_saved", 0);
                                }
                                if (boolValueOf2 != null) {
                                    linkedHashMap.put("is_balance_shown", Integer.valueOf(boolValueOf2.booleanValue() ? 1 : 0));
                                }
                                if (bool != null) {
                                    linkedHashMap.put("is_default", C893803eS.LIZ(false));
                                }
                                if (paymentMethod != null && (bindInfo = paymentMethod.bindInfo) != null && (str3 = bindInfo.bindStatus) != null && str3.length() > 0) {
                                    linkedHashMap.put("pay_bind_status", str3);
                                }
                                C890103dr.LJIJ("tiktokec_option_show", linkedHashMap);
                                Set<String> set2 = ((BankInstallmentAssem) asS29S0100000_1.l0).LLJILLL;
                                C873003b6 bankInfo6 = c903203fy.getBankInfo();
                                if (bankInfo6 != null) {
                                    str2 = bankInfo6.LIZJ;
                                } else {
                                    str2 = null;
                                }
                                set2.add(str2);
                            }
                        }
                    }
                }
                if (iFindFirstVisibleItemPosition != iFindLastVisibleItemPosition) {
                    iFindFirstVisibleItemPosition++;
                } else {
                    return;
                }
            }
        }
    }

    public static final void LJJIIZI$7(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i, int i2) {
        String str;
        LinearLayoutManager linearLayoutManager;
        int iIntValue;
        C04FA c04fa = (C04FA) asS29S0100000_1.l0;
        if (i < 0) {
            str = "show_left";
        } else {
            str = "show_right";
        }
        c04fa.LLJJIII = str;
        c04fa.LLJJIJI += Math.abs(i);
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof GridLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            C04FA c04fa2 = (C04FA) asS29S0100000_1.l0;
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            c04fa2.LLJJJ = iFindFirstVisibleItemPosition;
            View viewFindViewByPosition = linearLayoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition != null) {
                iIntValue = Integer.valueOf(viewFindViewByPosition.getLeft() - recyclerView.getPaddingStart()).intValue();
            } else {
                iIntValue = 0;
            }
            c04fa2.LLJJJIL = iIntValue;
            c04fa2.i0(recyclerView);
        }
    }

    public static final void LJJIIZI$8(AsS29S0100000_1 asS29S0100000_1, RecyclerView recyclerView, int i, int i2) {
        LinearLayoutManager linearLayoutManager;
        ((C1064604Ei) asS29S0100000_1.l0).LLJJ += i;
        RecyclerView.LayoutManager layoutManager = recyclerView.getLayoutManager();
        if ((layoutManager instanceof LinearLayoutManager) && (linearLayoutManager = (LinearLayoutManager) layoutManager) != null) {
            int iFindFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
            int iFindLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
            if (i < 0) {
                if (iFindFirstVisibleItemPosition != -1) {
                    C1064604Ei c1064604Ei = (C1064604Ei) asS29S0100000_1.l0;
                    if (c1064604Ei.LLJJIJIIJIL > iFindFirstVisibleItemPosition) {
                        c1064604Ei.LLJJIJIIJIL = iFindFirstVisibleItemPosition;
                        InterfaceC1065204Eo interfaceC1065204Eo = c1064604Ei.LLJI;
                        if (interfaceC1065204Eo != null) {
                            interfaceC1065204Eo.Z(iFindFirstVisibleItemPosition, c1064604Ei.LLJJJ, EnumC1064704Ej.LEFT, c1064604Ei.LLJILJILJ);
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            }
            if (i <= 0 || iFindLastVisibleItemPosition == -1) {
                return;
            }
            C1064604Ei c1064604Ei2 = (C1064604Ei) asS29S0100000_1.l0;
            if (c1064604Ei2.LLJJIJIL >= iFindLastVisibleItemPosition) {
                return;
            }
            c1064604Ei2.LLJJIJIL = iFindLastVisibleItemPosition;
            InterfaceC1065204Eo interfaceC1065204Eo2 = c1064604Ei2.LLJI;
            if (interfaceC1065204Eo2 == null) {
                return;
            }
            interfaceC1065204Eo2.Z(iFindLastVisibleItemPosition, c1064604Ei2.LLJJJ, EnumC1064704Ej.RIGHT, c1064604Ei2.LLJILJILJ);
        }
    }
}
