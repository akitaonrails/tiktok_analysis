package X;

import Y.ARunnableS101S0100000_1;
import Y.AfS170S0100000_1;
import android.app.Application;
import android.content.Context;
import android.content.res.Resources;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.n;
import com.ss.android.ugc.aweme.PopupMonitorServiceImpl;
import com.ss.android.ugc.aweme.ecommerce.api.model.Response;
import com.ss.android.ugc.aweme.ecommerce.base.address.dto.Address;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.EnterParams;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentCacheHelper;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentHalfFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPaymentSecurityConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsPaymentResultNativeQuerySettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.api.PaymentApi;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ElementDTO;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.ErrorInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.InstallmentPlan;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.OrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayTrackInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentElement;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentListResponseData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentPrice;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.InteractionConfiguration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PayRiskControlParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.pipo.PipoPackageDiffSPI;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS12S0401000_1;
import kotlin.jvm.internal.AwS471S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03PI, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03PI {
    public static final C03SE LJIJI = new C03SE();
    public static final int LJIJJ = 10003007;
    public static final int LJIJJLI = 10003008;
    public static final int LJIL = 98001001;
    public static final String LJJ;
    public static final String LJJI;
    public static volatile String LJJIFFI;
    public final Context LIZ;
    public final String LIZIZ;
    public final List<String> LIZJ;
    public final String LIZLLL;
    public final String LJ;
    public final String LJFF;
    public final String LJI;
    public final HashMap<String, Object> LJII;
    public final String LJIIIIZZ;
    public final boolean LJIIIZ;
    public final OneClickPayContext LJIIJ;
    public final String LJIIJJI;
    public PayResponseData LJIIL;
    public PaymentListResponseData LJIILIIL;
    public String LJIILJJIL;
    public final C03PJ LJIILL = new C03PJ(null);
    public final C01GW LJIILLIIL = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1251));
    public final C01GW LJIIZILJ = C452501pT.LIZIZ(new AwS545S0100000_1(this, 1252));
    public CharSequence LJIJ;

    static {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str = null;
        PipoPackageDiffSPI pipoPackageDiffSPI = (PipoPackageDiffSPI) PluggableExtentionKt.pluggableSpi$default(PipoPackageDiffSPI.class, false, false, false, 14, null);
        String str2 = "snssdk1180";
        if (pipoPackageDiffSPI != null) {
            pipoPackageDiffSPI.LIZIZ();
            str = "snssdk1180";
        }
        sbLIZ.append(str);
        sbLIZ.append("://ec/app_bind_result");
        LJJ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        PipoPackageDiffSPI pipoPackageDiffSPI2 = (PipoPackageDiffSPI) PluggableExtentionKt.pluggableSpi$default(PipoPackageDiffSPI.class, false, false, false, 14, null);
        if (pipoPackageDiffSPI2 != null) {
            pipoPackageDiffSPI2.LIZIZ();
        } else {
            str2 = null;
        }
        sbLIZ2.append(str2);
        sbLIZ2.append("://ec/bind_result?commute_type=17");
        LJJI = C2188811AlT.LIZIZ(sbLIZ2);
    }

    public final boolean LJI() {
        Integer num;
        OneClickPayContext oneClickPayContext = this.LJIIJ;
        return (oneClickPayContext == null || (num = oneClickPayContext.payMethodSelectEnable) == null || num.intValue() != 1 || this.LJII.get("ocp_retry_cashier_type") == null) ? false : true;
    }

    public final void LJFF() {
        if (!Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new ARunnableS101S0100000_1(this, 16));
            return;
        }
        if (!Intrinsics.LJFF(((EcPaymentSecurityConfig) C895903en.LIZIZ.getValue()).useLottieInSecondPay, Boolean.TRUE)) {
            try {
                C786410Ut5.LJIIJ((DialogC1389620mGW) this.LJIILLIIL.getValue());
                return;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        try {
            C423190Gib c423190Gib = (C423190Gib) this.LJIIZILJ.getValue();
            if (c423190Gib != null) {
                c423190Gib.dismiss();
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        try {
            C786410Ut5.LJIIJ((DialogC1389620mGW) this.LJIILLIIL.getValue());
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
        }
    }

    public static C11O8 LIZJ(PayRequest payRequest) {
        PaymentApi.LIZ.getClass();
        return ((PaymentApi) C877403bo.LIZIZ.create(PaymentApi.class)).LJI(payRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ());
    }

    public final boolean LIZ(String str) {
        PaymentListResponseData paymentListResponseData;
        PaymentMethodsData paymentMethodsData;
        List<PaymentMethod> list;
        if (str != null && str.length() != 0 && (paymentListResponseData = this.LJIILIIL) != null && (paymentMethodsData = paymentListResponseData.paymentMethodsData) != null && (list = paymentMethodsData.storedMethods) != null) {
            for (PaymentMethod paymentMethod : list) {
                if (Intrinsics.LJFF(paymentMethod.LJIIJ(), str)) {
                    if (paymentMethod != null) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        }
        return false;
    }

    public final void LIZIZ(View view) {
        ViewGroup viewGroup;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ != null && !c19egLIZIZ.isFinishing() && !c19egLIZIZ.isDestroyed()) {
            if (Intrinsics.LJFF(((EcPaymentSecurityConfig) C895903en.LIZIZ.getValue()).useLottieInSecondPay, Boolean.TRUE)) {
                C423190Gib c423190Gib = (C423190Gib) this.LJIIZILJ.getValue();
                if (c423190Gib != null) {
                    String string = this.LJIJ.toString();
                    if (string != null) {
                        ((TextView) c423190Gib.getContentView().findViewById(R.id.message_tv)).setText(string);
                    }
                    if (view != null) {
                        try {
                            if (c423190Gib.isShowing()) {
                                c423190Gib.dismiss();
                            }
                            View contentView = c423190Gib.getContentView();
                            if (contentView != null) {
                                ViewParent parent = contentView.getParent();
                                if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                                    C786410Ut5.LJJJLZIJ(contentView, viewGroup);
                                }
                            }
                            c423190Gib.showAtLocation(view, 0, 0, 0);
                            PopupMonitorServiceImpl.LIZ.getClass();
                            PopupMonitorServiceImpl.LJJJI(c423190Gib);
                            C787990Uvd.LIZ.getClass();
                            C994003uc.LIZ();
                            return;
                        } catch (Exception e) {
                            TryCatchGuardChecker.doCheck(e);
                            C1AF0.LJ(e);
                            return;
                        }
                    }
                    return;
                }
                return;
            }
            DialogC1389620mGW dialogC1389620mGW = (DialogC1389620mGW) this.LJIILLIIL.getValue();
            dialogC1389620mGW.setCanceledOnTouchOutside(false);
            C786410Ut5.J4(dialogC1389620mGW);
            return;
        }
        C03SE c03se = LJIJI;
        AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(98);
        c03se.getClass();
        C03SE.LJJIFFI(aFwS185S0000000_1);
    }

    public final void LJIIIZ(final String str) {
        Object obj;
        final String str2;
        final boolean z;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ);
        if (c19egLIZIZ != null && !c19egLIZIZ.isFinishing() && !c19egLIZIZ.isDestroyed()) {
            final long jCurrentTimeMillis = System.currentTimeMillis();
            HashMap<String, Object> map = this.LJII;
            String strLIZ = null;
            if (map != null) {
                obj = map.get("previous_page");
            } else {
                obj = null;
            }
            if (!(obj instanceof String) || (str2 = (String) obj) == null) {
                str2 = "";
            }
            int iLJIIJJI = AnonymousClass0408.LJIIJJI(AnonymousClass0408.LIZ, EnumC955203oM.TTS, "payment_method", null, null, 12);
            if (!Intrinsics.LJFF(str, "1") && !Intrinsics.LJFF(str, "2")) {
                z = false;
            } else {
                z = true;
            }
            String str3 = this.LIZIZ;
            List<String> list = this.LIZJ;
            LJIJI.getClass();
            PayRiskControlParam payRiskControlParamLJIIJJI = C03SE.LJIIJJI(null);
            String str4 = this.LJIIIIZZ;
            Boolean boolValueOf = Boolean.valueOf(z);
            if (z) {
                C921103ir.LIZ.getClass();
                strLIZ = C921103ir.LIZ("retry_cashier", "payment");
            }
            final PaymentListRequest paymentListRequest = new PaymentListRequest(str3, list, payRiskControlParamLJIIJJI, AnonymousClass0368.LIZ(), iLJIIJJI, str4, null, null, boolValueOf, strLIZ);
            PaymentApi.LIZ.getClass();
            final String str5 = str2;
            C877403bo.LIZ(paymentListRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJIJIL(new AfS170S0100000_1(this, 8)).LJJIIJ(new InterfaceC781210Ukh() { // from class: X.03Pi
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    this.LIZ.LJFF();
                }
            }).LJJLL(new C09JN() { // from class: X.03PK
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    String str6;
                    C03PI c03pi;
                    PaymentListResponseData paymentListResponseData;
                    String str7;
                    PaymentMethodsData paymentMethodsData;
                    PaymentMethodsData paymentMethodsData2;
                    PaymentMethodsData paymentMethodsData3;
                    List<PaymentPrice> list2;
                    Summary summary;
                    Address address;
                    n nVar;
                    OrderInfo orderInfo;
                    boolean z2;
                    String string;
                    int i;
                    List<PaymentMethod> listLJI;
                    FragmentManager supportFragmentManager;
                    PaymentMethodsData paymentMethodsData4;
                    PayTrackInfo payTrackInfo;
                    HashMap<String, Object> map2;
                    String str8;
                    HashMap<String, Object> map3;
                    String str9;
                    PaymentMethodsData paymentMethodsData5;
                    ErrorInfo errorInfo;
                    String str10;
                    PaymentMethodsData paymentMethodsData6;
                    ErrorInfo errorInfo2;
                    PaymentMethod paymentMethodLJIIL;
                    PaymentMethod paymentMethodLJIIJ;
                    PaymentMethodsData paymentMethodsData7;
                    String str11;
                    C1C7U.LIZ("PayHelper@ece4.schedulePaymentProcess$job$2");
                    Response response = (Response) obj2;
                    this.LL.LJIILIIL = (PaymentListResponseData) response.data;
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    PaymentInfo paymentInfoLJ = null;
                    InstallmentPlan installmentPlanLJIILL = null;
                    paymentInfoLJ = null;
                    paymentInfoLJ = null;
                    if (response.isCodeOK() && (paymentListResponseData = (c03pi = this.LL).LJIILIIL) != null) {
                        PaymentMethodsData paymentMethodsData8 = paymentListResponseData.paymentMethodsData;
                        if (paymentMethodsData8 != null && (str11 = paymentMethodsData8.cashierLoadingText) != null) {
                            c03pi.LJIJ = str11;
                        }
                        C914303hl c914303hl = C914303hl.LIZ;
                        if (paymentMethodsData8 != null) {
                            str7 = paymentMethodsData8.saleRegion;
                        } else {
                            str7 = null;
                        }
                        c914303hl.getClass();
                        C914303hl.LJFF(str7, "payment_method");
                        PaymentCacheHelper paymentCacheHelper = PaymentCacheHelper.LIZ;
                        C19EG c19egLIZIZ2 = C1388190mED.LIZIZ(this.LL.LIZ);
                        paymentCacheHelper.getClass();
                        PaymentCacheHelper.LJIIJ(c19egLIZIZ2);
                        if (C03YG.LIZ()) {
                            GooglePayProcess googlePayProcess = GooglePayProcess.LIZ;
                            Context context = this.LL.LIZ;
                            googlePayProcess.getClass();
                            GooglePayProcess.LJFF(context);
                            PaymentListResponseData paymentListResponseData2 = this.LL.LJIILIIL;
                            if (paymentListResponseData2 != null) {
                                paymentMethodsData7 = paymentListResponseData2.paymentMethodsData;
                            } else {
                                paymentMethodsData7 = null;
                            }
                            GooglePayProcess.LJIIJ(Boolean.FALSE, GooglePayProcess.LIZJ(paymentMethodsData7));
                        }
                        C03SE c03se = C03PI.LJIJI;
                        PaymentListResponseData paymentListResponseData3 = this.LL.LJIILIIL;
                        if (paymentListResponseData3 != null) {
                            paymentMethodsData = paymentListResponseData3.paymentMethodsData;
                        } else {
                            paymentMethodsData = null;
                        }
                        c03se.getClass();
                        C03SE.LIZLLL(paymentMethodsData, "payment list raw data", false);
                        PaymentHalfFragment paymentHalfFragment = new PaymentHalfFragment();
                        C03PI c03pi2 = this.LL;
                        boolean z3 = z;
                        PaymentListRequest paymentListRequest2 = paymentListRequest;
                        String str12 = str;
                        paymentHalfFragment.LLJJIII = new C842403Qw(paymentListRequest2, c03pi2, null);
                        int iOrdinal = EnumC882203ca.PAY_NOW.ordinal();
                        PaymentListResponseData paymentListResponseData4 = c03pi2.LJIILIIL;
                        if (paymentListResponseData4 != null) {
                            paymentMethodsData2 = paymentListResponseData4.paymentMethodsData;
                        } else {
                            paymentMethodsData2 = null;
                        }
                        String str13 = c03pi2.LJ;
                        if (paymentListResponseData4 != null) {
                            paymentMethodsData3 = paymentListResponseData4.paymentMethodsData;
                            if (paymentMethodsData3 != null && (paymentMethodLJIIJ = paymentMethodsData3.LJIIJ(AFwS228S0000000_1.get$arr$(847))) != null) {
                                if (z3) {
                                    installmentPlanLJIILL = paymentMethodLJIIJ.LJIILL();
                                }
                                paymentInfoLJ = C03PI.LJ(c03pi2, paymentMethodLJIIJ, installmentPlanLJIILL);
                            }
                        } else {
                            paymentMethodsData3 = null;
                        }
                        if (z3 && paymentInfoLJ != null && !paymentInfoLJ.LIZLLL() && (paymentMethodLJIIL = paymentMethodsData3.LJIIL(AFwS228S0000000_1.get$arr$(848))) != null) {
                            PaymentInfo paymentInfoLJ2 = C03PI.LJ(c03pi2, paymentMethodLJIIL, paymentMethodLJIIL.LJIILL());
                            paymentInfoLJ2.LIZ = paymentInfoLJ.LIZ;
                            paymentInfoLJ = paymentInfoLJ2;
                        }
                        PaymentListResponseData paymentListResponseData5 = c03pi2.LJIILIIL;
                        if (paymentListResponseData5 != null) {
                            list2 = paymentListResponseData5.paymentPrice;
                            summary = paymentListResponseData5.defaultSummary;
                            address = paymentListResponseData5.shippingAddress;
                        } else {
                            list2 = null;
                            summary = null;
                            address = null;
                        }
                        HashMap<String, Object> map4 = c03pi2.LJII;
                        String str14 = c03pi2.LJI;
                        String str15 = c03pi2.LJFF;
                        String str16 = c03pi2.LIZLLL;
                        if (paymentListResponseData5 != null) {
                            nVar = paymentListResponseData5.preRiskParam;
                        } else {
                            nVar = null;
                        }
                        String str17 = c03pi2.LIZIZ;
                        List<String> list3 = c03pi2.LIZJ;
                        String str18 = c03pi2.LJIIIIZZ;
                        if (paymentListResponseData5 != null) {
                            orderInfo = paymentListResponseData5.orderInfo;
                        } else {
                            orderInfo = null;
                        }
                        if (C03MT.LIZ() && C835903Oj.LIZ() && z3) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        String str19 = c03pi2.LJIIJJI;
                        if (C835903Oj.LIZ() && z3) {
                            string = c03pi2.LIZ.getResources().getString(2131833063);
                        } else {
                            string = null;
                        }
                        EnterParams enterParams = new EnterParams(null, null, Integer.valueOf(iOrdinal), paymentMethodsData2, str13, false, paymentInfoLJ, map4, list2, summary, address, str14, str15, str16, Long.valueOf(jCurrentTimeMillis2), null, null, null, null, str19, false, nVar, null, Boolean.FALSE, null, null, Boolean.FALSE, false, string, null, null, null, null, null, paymentListRequest2, null, null, str17, list3, str18, str12, false, orderInfo, null, false, false, null, z2, false, false);
                        enterParams.LJJIJIIJI = EnumC837803Pc.SECOND_PAY;
                        if (z3 && (map3 = enterParams.trackParams) != null) {
                            String str20 = "1";
                            map3.put("is_auto", "1");
                            PaymentListResponseData paymentListResponseData6 = c03pi2.LJIILIIL;
                            String str21 = "";
                            if (paymentListResponseData6 == null || (paymentMethodsData6 = paymentListResponseData6.paymentMethodsData) == null || (errorInfo2 = paymentMethodsData6.errorInfo) == null || (str9 = errorInfo2.failDetailedMessage) == null) {
                                str9 = "";
                            }
                            map3.put("last_fail_reason", str9);
                            PaymentListResponseData paymentListResponseData7 = c03pi2.LJIILIIL;
                            if (paymentListResponseData7 != null && (paymentMethodsData5 = paymentListResponseData7.paymentMethodsData) != null && (errorInfo = paymentMethodsData5.errorInfo) != null && (str10 = errorInfo.errorCode) != null) {
                                str21 = str10;
                            }
                            map3.put("last_error_code", str21);
                            PaymentInfo paymentInfo = enterParams.paymentInfo;
                            if (paymentInfo != null) {
                                i = 1;
                                if (!paymentInfo.LIZLLL()) {
                                }
                                map3.put("is_default", str20);
                            } else {
                                i = 1;
                            }
                            str20 = CardStruct.IStatusCode.DEFAULT;
                            map3.put("is_default", str20);
                        } else {
                            i = 1;
                        }
                        PaymentListResponseData paymentListResponseData8 = c03pi2.LJIILIIL;
                        if (paymentListResponseData8 != null && (paymentMethodsData4 = paymentListResponseData8.paymentMethodsData) != null && (payTrackInfo = paymentMethodsData4.payTrackInfo) != null && (map2 = enterParams.trackParams) != null && (str8 = payTrackInfo.mainTrackId) != null) {
                            map2.put("cashier_original_track_id", str8);
                            map2.put("rendering_num", Integer.valueOf(i));
                        }
                        paymentHalfFragment.LLJIJIL = enterParams;
                        C03WH c03wh = new C03WH(paymentHalfFragment.LLJIJIL);
                        PaymentMethodsData paymentMethodsData9 = paymentHalfFragment.LLJIJIL.paymentData;
                        if (paymentMethodsData9 != null) {
                            listLJI = paymentMethodsData9.LJI();
                        } else {
                            listLJI = C13BV.INSTANCE;
                        }
                        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJI, 10));
                        Iterator<PaymentMethod> it2 = listLJI.iterator();
                        while (it2.hasNext()) {
                            arrayList.add(it2.next().LJJIIZ());
                        }
                        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, ",", null, null, 0, null, AFwS228S0000000_1.get$arr$(235), 30);
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        linkedHashMap.putAll(c03wh.LIZ);
                        linkedHashMap.put("payment_option", strLJJLIIIJ);
                        linkedHashMap.put("payment_option_cnt", Integer.valueOf(listLJI.size()));
                        C03WH.LJJII("tiktokec_first_refresh_page", linkedHashMap);
                        paymentHalfFragment.LLJILJIL = new AwS471S0200000_1(c03pi2, paymentHalfFragment, 9);
                        paymentHalfFragment.LLJILLL = new C03PO(c03pi2);
                        paymentHalfFragment.LLJJI = new AwS545S0100000_1(c03pi2, 1179);
                        C19EG c19egLIZIZ3 = C1388190mED.LIZIZ(this.LL.LIZ);
                        if (c19egLIZIZ3 != null && (supportFragmentManager = c19egLIZIZ3.getSupportFragmentManager()) != null) {
                            paymentHalfFragment.show(supportFragmentManager, "payment_fragment");
                        }
                    } else {
                        this.LL.LJIIJ(response.message);
                        String str22 = str5;
                        String str23 = response.message;
                        String strValueOf = String.valueOf(response.code);
                        List<String> list4 = this.LL.LIZJ;
                        if (list4 != null) {
                            str6 = (String) C13LP.LJJJLL(list4);
                        } else {
                            str6 = null;
                        }
                        C03WD.LIZJ(0L, jCurrentTimeMillis2, str22, str23, strValueOf, null, null, null, str6, false);
                    }
                    C1C7U.LIZIZ("PayHelper@ece4.schedulePaymentProcess$job$2");
                }
            }, new C09JN() { // from class: X.03PR
                @Override // X.C09JN
                public final void accept(Object obj2) {
                    String message;
                    C1C7U.LIZ("PayHelper@ece4.schedulePaymentProcess$job$3");
                    Throwable th = (Throwable) obj2;
                    String str6 = null;
                    this.LL.LJIIJ(null);
                    long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
                    String str7 = str2;
                    if (th != null) {
                        message = th.getMessage();
                    } else {
                        message = null;
                    }
                    List<String> list2 = this.LL.LIZJ;
                    if (list2 != null) {
                        str6 = (String) C13LP.LJJJLL(list2);
                    }
                    C03WD.LIZJ(0L, jCurrentTimeMillis2, str7, message, "-1", null, null, null, str6, false);
                    C1C7U.LIZIZ("PayHelper@ece4.schedulePaymentProcess$job$3");
                }
            });
            return;
        }
        C03SE c03se = LJIJI;
        AFwS185S0000000_1 aFwS185S0000000_1 = AFwS185S0000000_1.get$arr$(99);
        c03se.getClass();
        C03SE.LJJIFFI(aFwS185S0000000_1);
    }

    public final void LJIIJ(String str) {
        C19EG c19egLIZIZ;
        Resources resources;
        if ((str != null || ((resources = this.LIZ.getResources()) != null && (str = resources.getString(2131848101)) != null)) && (c19egLIZIZ = C1388190mED.LIZIZ(this.LIZ)) != null) {
            C1389890mGx c1389890mGx = new C1389890mGx(c19egLIZIZ);
            c1389890mGx.LJIIJ(str);
            c1389890mGx.LJIIJJI();
        }
    }

    public static PaymentInfo LJ(C03PI c03pi, PaymentMethod paymentMethod, InstallmentPlan installmentPlan) {
        String str;
        String str2;
        boolean z;
        PaymentMethodInfo paymentMethodInfo;
        Boolean boolIsChooseSave = null;
        if (installmentPlan != null) {
            str = installmentPlan.tenure;
            str2 = installmentPlan.id;
        } else {
            str = null;
            str2 = null;
        }
        ArrayList arrayList = new ArrayList();
        List<ElementDTO> listLJJIII = paymentMethod.LJJIII();
        if (listLJJIII != null && C13LP.LJJJLL(listLJJIII) != null) {
            z = false;
        } else {
            z = true;
        }
        if (paymentMethod.LIZIZ) {
            PaymentCacheHelper paymentCacheHelper = PaymentCacheHelper.LIZ;
            String strLJIIJ = paymentMethod.LJIIJ();
            paymentCacheHelper.getClass();
            PaymentInfo paymentInfoLJII = PaymentCacheHelper.LJII(strLJIIJ);
            if (paymentInfoLJII != null && (paymentMethodInfo = paymentInfoLJII.paymentMethodInfo) != null) {
                boolIsChooseSave = paymentMethodInfo.isChooseSave();
                List<PaymentElement> list = paymentMethodInfo.paymentElements;
                if (list != null) {
                    arrayList = new ArrayList(C03S8.LJJII(list, arrayList));
                }
            }
        }
        if (paymentMethod.LJJLI()) {
            return new PaymentInfo(null, null, null, null, null, null, paymentMethod, null, null, new LinkedHashMap(), null);
        }
        return new PaymentInfo(new PaymentMethodInfo(paymentMethod.id, paymentMethod.token, arrayList, boolIsChooseSave, str, str2, null, null, null, null, null, null, null, null, null, null, null), paymentMethod, null, Boolean.valueOf(z), null, null, null, null, null, new LinkedHashMap(), null);
    }

    public final Map LIZLLL(PaymentMethodsData paymentMethodsData, String str, PaymentInfo paymentInfo) {
        boolean z;
        String str2;
        C03Q4.LIZ.getClass();
        String str3 = null;
        Map mapLIZLLL = C03Q4.LIZLLL(paymentMethodsData, str, null);
        PaymentMethodInfo paymentMethodInfo = paymentInfo.paymentMethodInfo;
        if (paymentMethodInfo != null && (str2 = paymentMethodInfo.consultationId) != null) {
            mapLIZLLL.put("consultation_id", str2);
        }
        PaymentMethod paymentMethod = paymentInfo.paymentMethod;
        if (paymentMethod != null) {
            str3 = paymentMethod.id;
        }
        if (PipoTtsPaymentResultNativeQuerySettings.LIZ(str3) && !LJI()) {
            z = true;
        } else {
            z = false;
        }
        mapLIZLLL.put("interaction_configuration", C1741890vQh.LJIIIIZZ(new InteractionConfiguration(Boolean.valueOf(z))));
        C03SE c03se = LJIJI;
        Application applicationLIZ = C7879035x.LIZ();
        c03se.getClass();
        C03SE.LIZ(applicationLIZ, mapLIZLLL);
        if (C03S8.LJJIIZ(paymentInfo, paymentMethodsData, C03PV.RETRY_CASHIER_ORDER_PAY)) {
            mapLIZLLL.put("update_payment_method", "true");
        }
        return mapLIZLLL;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(72:0|2|(1:4)(1:319)|5|(1:7)(1:318)|8|(1:10)|11|(1:13)(1:317)|14|(6:16|(1:18)(1:316)|19|(1:(2:225|(2:301|(4:305|(2:306|(2:308|(1:483)(1:484))(2:482|315))|310|(1:314)))(4:227|(1:280)(1:231)|232|(0)(2:236|(4:238|(1:240)(1:279)|241|(3:278|257|(2:259|(2:261|(2:275|273)(5:265|(2:266|(2:268|(1:477)(1:478))(2:476|274))|270|(1:272)(0)|273))(3:281|(1:283)(1:285)|284)))(6:247|(2:248|(3:250|(2:252|473)(2:276|474)|(1:472)(1:475))(2:471|277))|254|(1:256)(0)|257|(0)))(2:286|(4:290|(2:291|(2:293|(1:480)(1:481))(2:479|300))|295|(1:299))))))(2:24|(4:28|(2:29|(3:31|(5:465|33|(1:35)(1:223)|36|(1:467)(1:470))(1:469)|468)(2:466|224))|38|(1:42))))|43|(3:45|(1:47)(1:222)|48))|49|(1:51)(1:221)|52|(1:220)(1:56)|57|(1:59)(1:219)|60|(1:62)(1:218)|63|(1:217)(1:67)|68|(1:70)(1:216)|71|(1:73)(1:215)|74|(1:76)(1:(2:205|(1:207))(46:208|(0)|78|(1:80)|81|(1:83)(1:203)|84|(1:86)|87|(1:89)(1:202)|90|(1:92)(1:201)|93|(5:95|(2:97|(1:99)(1:190))|100|(1:102)(1:189)|103)(4:191|(1:193)(1:199)|194|(1:198))|104|(3:182|(1:188)(1:186)|187)(8:107|(1:181)(1:111)|112|(3:114|(1:116)(1:180)|117)|118|(1:120)(1:179)|121|(1:127))|(1:(1:130)(1:178))|131|(1:177)(1:135)|136|(3:172|(1:174)(1:176)|175)(1:139)|140|(5:142|(1:170)(1:146)|147|(1:149)(1:169)|150)(1:171)|151|(22:153|(1:155)|156|(1:158)(1:166)|159|(3:161|(1:163)(1:165)|164)|463|320|(40:322|(1:324)(1:332)|325|(1:327)(1:331)|328|(2:330|333)(1:334)|335|(1:432)(1:339)|340|(1:431)(1:344)|345|(1:347)(1:430)|348|(1:429)(1:352)|353|(1:355)(1:428)|356|(1:358)(1:427)|359|(1:426)(1:365)|366|(1:425)(1:372)|373|(20:421|(1:423)|424|381|(1:420)(1:385)|386|(1:419)(1:390)|391|(1:418)(1:395)|396|(1:398)(1:417)|399|(1:401)(1:416)|402|(1:404)(1:415)|405|(1:407)(1:414)|408|(1:410)(1:413)|411)(1:377)|378|(1:380)(1:424)|381|(4:383|420|386|(4:388|419|391|(13:393|418|396|(0)(0)|399|(0)(0)|402|(0)(0)|405|(0)(0)|408|(0)(0)|411)(0))(0))(0)|435|(1:437)(1:449)|438|(1:442)|443|(1:445)|446|(4:461|450|(1:452)|453)|456|(1:458)|459|460)|412|435|(0)(0)|438|(2:440|442)(0)|443|(0)|446|(0)|456|(0)|459|460)(1:167)|168|156|(0)(0)|159|(0)|463|320|(0)|412|435|(0)(0)|438|(0)(0)|443|(0)|446|(0)|456|(0)|459|460))|77|78|(0)|81|(0)(0)|84|(0)|87|(0)(0)|90|(0)(0)|93|(0)(0)|104|(2:182|(3:184|188|187)(0))(0)|(0)|131|(2:133|177)(0)|136|(3:172|(0)(0)|175)(0)|140|(0)(0)|151|(0)(0)|168|156|(0)(0)|159|(0)|463|320|(0)|412|435|(0)(0)|438|(0)(0)|443|(0)|446|(0)|456|(0)|459|460) */
    /* JADX WARN: Code restructure failed: missing block: B:433:0x07bf, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:434:0x07c0, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2);
        X.C1AF0.LJ(r2);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0383  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x038e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0399  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x03a0  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x03b0  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x03b2  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03fa  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x04f0  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x052d  */
    /* JADX WARN: Removed duplicated region for block: B:278:0x0538  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x058f  */
    /* JADX WARN: Removed duplicated region for block: B:322:0x05d0 A[Catch: all -> 0x07bf, TryCatch #1 {all -> 0x07bf, blocks: (B:320:0x05ca, B:322:0x05d0, B:324:0x05d4, B:325:0x05d8, B:327:0x05e4, B:328:0x05e8, B:335:0x05f8, B:337:0x0600, B:339:0x0604, B:340:0x0608, B:342:0x060e, B:344:0x0612, B:345:0x0616, B:347:0x061a, B:348:0x0622, B:350:0x0628, B:352:0x062c, B:353:0x0630, B:355:0x0639, B:356:0x063d, B:358:0x0641, B:359:0x0645, B:361:0x0659, B:363:0x065d, B:365:0x0661, B:366:0x0665, B:368:0x0669, B:370:0x066d, B:372:0x0671, B:373:0x0675, B:375:0x067f, B:377:0x0683, B:378:0x0685, B:380:0x0689, B:381:0x068d, B:383:0x0695, B:385:0x0699, B:386:0x069d, B:388:0x06a5, B:390:0x06a9, B:391:0x06ad, B:393:0x06b1, B:395:0x06b5, B:396:0x06b9, B:398:0x06c1, B:399:0x06ca, B:401:0x06d6, B:402:0x06de, B:404:0x06e2, B:405:0x06e4, B:407:0x06ea, B:408:0x06ec, B:410:0x06f0, B:411:0x06f8, B:412:0x0719), top: B:463:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:398:0x06c1 A[Catch: all -> 0x07bf, TryCatch #1 {all -> 0x07bf, blocks: (B:320:0x05ca, B:322:0x05d0, B:324:0x05d4, B:325:0x05d8, B:327:0x05e4, B:328:0x05e8, B:335:0x05f8, B:337:0x0600, B:339:0x0604, B:340:0x0608, B:342:0x060e, B:344:0x0612, B:345:0x0616, B:347:0x061a, B:348:0x0622, B:350:0x0628, B:352:0x062c, B:353:0x0630, B:355:0x0639, B:356:0x063d, B:358:0x0641, B:359:0x0645, B:361:0x0659, B:363:0x065d, B:365:0x0661, B:366:0x0665, B:368:0x0669, B:370:0x066d, B:372:0x0671, B:373:0x0675, B:375:0x067f, B:377:0x0683, B:378:0x0685, B:380:0x0689, B:381:0x068d, B:383:0x0695, B:385:0x0699, B:386:0x069d, B:388:0x06a5, B:390:0x06a9, B:391:0x06ad, B:393:0x06b1, B:395:0x06b5, B:396:0x06b9, B:398:0x06c1, B:399:0x06ca, B:401:0x06d6, B:402:0x06de, B:404:0x06e2, B:405:0x06e4, B:407:0x06ea, B:408:0x06ec, B:410:0x06f0, B:411:0x06f8, B:412:0x0719), top: B:463:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:401:0x06d6 A[Catch: all -> 0x07bf, TryCatch #1 {all -> 0x07bf, blocks: (B:320:0x05ca, B:322:0x05d0, B:324:0x05d4, B:325:0x05d8, B:327:0x05e4, B:328:0x05e8, B:335:0x05f8, B:337:0x0600, B:339:0x0604, B:340:0x0608, B:342:0x060e, B:344:0x0612, B:345:0x0616, B:347:0x061a, B:348:0x0622, B:350:0x0628, B:352:0x062c, B:353:0x0630, B:355:0x0639, B:356:0x063d, B:358:0x0641, B:359:0x0645, B:361:0x0659, B:363:0x065d, B:365:0x0661, B:366:0x0665, B:368:0x0669, B:370:0x066d, B:372:0x0671, B:373:0x0675, B:375:0x067f, B:377:0x0683, B:378:0x0685, B:380:0x0689, B:381:0x068d, B:383:0x0695, B:385:0x0699, B:386:0x069d, B:388:0x06a5, B:390:0x06a9, B:391:0x06ad, B:393:0x06b1, B:395:0x06b5, B:396:0x06b9, B:398:0x06c1, B:399:0x06ca, B:401:0x06d6, B:402:0x06de, B:404:0x06e2, B:405:0x06e4, B:407:0x06ea, B:408:0x06ec, B:410:0x06f0, B:411:0x06f8, B:412:0x0719), top: B:463:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:404:0x06e2 A[Catch: all -> 0x07bf, TryCatch #1 {all -> 0x07bf, blocks: (B:320:0x05ca, B:322:0x05d0, B:324:0x05d4, B:325:0x05d8, B:327:0x05e4, B:328:0x05e8, B:335:0x05f8, B:337:0x0600, B:339:0x0604, B:340:0x0608, B:342:0x060e, B:344:0x0612, B:345:0x0616, B:347:0x061a, B:348:0x0622, B:350:0x0628, B:352:0x062c, B:353:0x0630, B:355:0x0639, B:356:0x063d, B:358:0x0641, B:359:0x0645, B:361:0x0659, B:363:0x065d, B:365:0x0661, B:366:0x0665, B:368:0x0669, B:370:0x066d, B:372:0x0671, B:373:0x0675, B:375:0x067f, B:377:0x0683, B:378:0x0685, B:380:0x0689, B:381:0x068d, B:383:0x0695, B:385:0x0699, B:386:0x069d, B:388:0x06a5, B:390:0x06a9, B:391:0x06ad, B:393:0x06b1, B:395:0x06b5, B:396:0x06b9, B:398:0x06c1, B:399:0x06ca, B:401:0x06d6, B:402:0x06de, B:404:0x06e2, B:405:0x06e4, B:407:0x06ea, B:408:0x06ec, B:410:0x06f0, B:411:0x06f8, B:412:0x0719), top: B:463:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:407:0x06ea A[Catch: all -> 0x07bf, TryCatch #1 {all -> 0x07bf, blocks: (B:320:0x05ca, B:322:0x05d0, B:324:0x05d4, B:325:0x05d8, B:327:0x05e4, B:328:0x05e8, B:335:0x05f8, B:337:0x0600, B:339:0x0604, B:340:0x0608, B:342:0x060e, B:344:0x0612, B:345:0x0616, B:347:0x061a, B:348:0x0622, B:350:0x0628, B:352:0x062c, B:353:0x0630, B:355:0x0639, B:356:0x063d, B:358:0x0641, B:359:0x0645, B:361:0x0659, B:363:0x065d, B:365:0x0661, B:366:0x0665, B:368:0x0669, B:370:0x066d, B:372:0x0671, B:373:0x0675, B:375:0x067f, B:377:0x0683, B:378:0x0685, B:380:0x0689, B:381:0x068d, B:383:0x0695, B:385:0x0699, B:386:0x069d, B:388:0x06a5, B:390:0x06a9, B:391:0x06ad, B:393:0x06b1, B:395:0x06b5, B:396:0x06b9, B:398:0x06c1, B:399:0x06ca, B:401:0x06d6, B:402:0x06de, B:404:0x06e2, B:405:0x06e4, B:407:0x06ea, B:408:0x06ec, B:410:0x06f0, B:411:0x06f8, B:412:0x0719), top: B:463:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:410:0x06f0 A[Catch: all -> 0x07bf, TryCatch #1 {all -> 0x07bf, blocks: (B:320:0x05ca, B:322:0x05d0, B:324:0x05d4, B:325:0x05d8, B:327:0x05e4, B:328:0x05e8, B:335:0x05f8, B:337:0x0600, B:339:0x0604, B:340:0x0608, B:342:0x060e, B:344:0x0612, B:345:0x0616, B:347:0x061a, B:348:0x0622, B:350:0x0628, B:352:0x062c, B:353:0x0630, B:355:0x0639, B:356:0x063d, B:358:0x0641, B:359:0x0645, B:361:0x0659, B:363:0x065d, B:365:0x0661, B:366:0x0665, B:368:0x0669, B:370:0x066d, B:372:0x0671, B:373:0x0675, B:375:0x067f, B:377:0x0683, B:378:0x0685, B:380:0x0689, B:381:0x068d, B:383:0x0695, B:385:0x0699, B:386:0x069d, B:388:0x06a5, B:390:0x06a9, B:391:0x06ad, B:393:0x06b1, B:395:0x06b5, B:396:0x06b9, B:398:0x06c1, B:399:0x06ca, B:401:0x06d6, B:402:0x06de, B:404:0x06e2, B:405:0x06e4, B:407:0x06ea, B:408:0x06ec, B:410:0x06f0, B:411:0x06f8, B:412:0x0719), top: B:463:0x05ca }] */
    /* JADX WARN: Removed duplicated region for block: B:413:0x077a  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:415:0x0781  */
    /* JADX WARN: Removed duplicated region for block: B:416:0x0784  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x0788  */
    /* JADX WARN: Removed duplicated region for block: B:418:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x0790  */
    /* JADX WARN: Removed duplicated region for block: B:420:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x07ca  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x07d2  */
    /* JADX WARN: Removed duplicated region for block: B:442:0x07d6  */
    /* JADX WARN: Removed duplicated region for block: B:445:0x07de  */
    /* JADX WARN: Removed duplicated region for block: B:449:0x07f7  */
    /* JADX WARN: Removed duplicated region for block: B:458:0x0834  */
    /* JADX WARN: Removed duplicated region for block: B:461:0x07f9 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01da  */
    /* JADX WARN: Type inference failed for: r2v151 */
    /* JADX WARN: Type inference failed for: r2v152, types: [T] */
    /* JADX WARN: Type inference failed for: r2v157, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary] */
    /* JADX WARN: Type inference failed for: r2v167, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary] */
    /* JADX WARN: Type inference failed for: r2v176 */
    /* JADX WARN: Type inference failed for: r2v177, types: [T] */
    /* JADX WARN: Type inference failed for: r2v182 */
    /* JADX WARN: Type inference failed for: r2v183, types: [T] */
    /* JADX WARN: Type inference failed for: r2v188 */
    /* JADX WARN: Type inference failed for: r2v189, types: [T] */
    /* JADX WARN: Type inference failed for: r2v211, types: [T, com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary] */
    /* JADX WARN: Type inference failed for: r2v215 */
    /* JADX WARN: Type inference failed for: r2v216 */
    /* JADX WARN: Type inference failed for: r2v217 */
    /* JADX WARN: Type inference failed for: r2v218 */
    /* JADX WARN: Type inference failed for: r2v219 */
    /* JADX WARN: Type inference failed for: r2v220 */
    /* JADX WARN: Type inference failed for: r2v221 */
    /* JADX WARN: Type inference failed for: r2v222 */
    /* JADX WARN: Type inference failed for: r2v76 */
    /* JADX WARN: Type inference failed for: r2v77, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v89 */
    /* JADX WARN: Type inference failed for: r2v90, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v92 */
    /* JADX WARN: Type inference failed for: r2v93, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v96 */
    /* JADX WARN: Type inference failed for: r2v97, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r41v2 */
    /* JADX WARN: Type inference failed for: r41v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r41v5 */
    /* JADX WARN: Type inference failed for: r46v2 */
    /* JADX WARN: Type inference failed for: r46v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r46v5 */
    /* JADX WARN: Type inference failed for: r49v2 */
    /* JADX WARN: Type inference failed for: r49v3, types: [java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r49v5 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData] */
    /* JADX WARN: Type inference failed for: r5v81 */
    /* JADX WARN: Type inference failed for: r68v0, types: [X.03PI] */
    /* JADX WARN: Type inference failed for: r6v17, types: [com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData] */
    /* JADX WARN: Type inference failed for: r6v41 */
    /* JADX WARN: Type inference failed for: r6v42 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJII(final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r69, java.lang.String r70, java.lang.Boolean r71, final android.view.View r72, final kotlin.jvm.functions.Function0<kotlin.Unit> r73) {
        /*
            Method dump skipped, instruction units count: 2161
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03PI.LJII(com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.lang.String, java.lang.Boolean, android.view.View, kotlin.jvm.functions.Function0):void");
    }

    public final void LJIIIIZZ(List<? extends InterfaceC838503Pj> list, int i, PaymentInfo paymentInfo, PaymentMethodsData paymentMethodsData, Function1<? super PaymentInfo, Unit> function1) {
        if (i >= list.size()) {
            function1.invoke(paymentInfo);
        } else if (((InterfaceC838503Pj) ListProtector.get(list, i)).LIZ(paymentInfo, paymentMethodsData, new AwS12S0401000_1(this, (C03PI) list, (List<? extends InterfaceC838503Pj>) i, (int) paymentMethodsData, (PaymentMethodsData) function1, (Function1<? super PaymentInfo, Unit>) 0))) {
            LJIIIIZZ(list, i + 1, paymentInfo, paymentMethodsData, function1);
        }
    }

    public C03PI(Context context, String str, List<String> list, String str2, String str3, String str4, String str5, HashMap<String, Object> map, String str6, boolean z, OneClickPayContext oneClickPayContext, String str7) {
        this.LIZ = context;
        this.LIZIZ = str;
        this.LIZJ = list;
        this.LIZLLL = str2;
        this.LJ = str3;
        this.LJFF = str4;
        this.LJI = str5;
        this.LJII = map;
        this.LJIIIIZZ = str6;
        this.LJIIIZ = z;
        this.LJIIJ = oneClickPayContext;
        this.LJIIJJI = str7;
        this.LJIJ = context.getResources().getText(2131835638);
    }
}
