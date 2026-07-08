package X;

import android.content.Context;
import android.os.Looper;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PaymentSyncPayResultOptimizationConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MaterialCollectionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S4710000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03gj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C907903gj implements InterfaceC919903if {
    public final /* synthetic */ C897703f5 LIZ;
    public final /* synthetic */ long LIZIZ;
    public final /* synthetic */ boolean LIZJ;
    public final /* synthetic */ boolean LIZLLL;
    public final /* synthetic */ List<String> LJ;
    public final /* synthetic */ NewPayInfo LJFF;
    public final /* synthetic */ boolean LJI;
    public final /* synthetic */ boolean LJII;
    public final /* synthetic */ Context LJIIIIZZ;
    public final /* synthetic */ boolean LJIIIZ;
    public final /* synthetic */ boolean LJIIJ;
    public final /* synthetic */ boolean LJIIJJI;
    public final /* synthetic */ boolean LJIIL;
    public final /* synthetic */ InterfaceC911103hF LJIILIIL;
    public final /* synthetic */ String LJIILJJIL;
    public final /* synthetic */ String LJIILL;
    public final /* synthetic */ Object LJIILLIIL;
    public final /* synthetic */ String LJIIZILJ;
    public final /* synthetic */ Object LJIJ;
    public final /* synthetic */ C898003f8 LJIJI;
    public final /* synthetic */ String LJIJJ;
    public final /* synthetic */ String LJIJJLI;
    public final /* synthetic */ String LJIL;

    public C907903gj(C897703f5 c897703f5, long j, boolean z, boolean z2, List<String> list, NewPayInfo newPayInfo, boolean z3, boolean z4, Context context, boolean z5, boolean z6, boolean z7, boolean z8, InterfaceC911103hF interfaceC911103hF, String str, String str2, Object obj, String str3, Object obj2, C898003f8 c898003f8, String str4, String str5, String str6) {
        this.LIZ = c897703f5;
        this.LIZIZ = j;
        this.LIZJ = z;
        this.LIZLLL = z2;
        this.LJ = list;
        this.LJFF = newPayInfo;
        this.LJI = z3;
        this.LJII = z4;
        this.LJIIIIZZ = context;
        this.LJIIIZ = z5;
        this.LJIIJ = z6;
        this.LJIIJJI = z7;
        this.LJIIL = z8;
        this.LJIILIIL = interfaceC911103hF;
        this.LJIILJJIL = str;
        this.LJIILL = str2;
        this.LJIILLIIL = obj;
        this.LJIIZILJ = str3;
        this.LJIJ = obj2;
        this.LJIJI = c898003f8;
        this.LJIJJ = str4;
        this.LJIJJLI = str5;
        this.LJIL = str6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0031 A[PHI: r1
      0x0031: PHI (r1v6 java.lang.Object) = (r1v26 java.lang.Object), (r1v27 java.lang.Object) binds: [B:11:0x0024, B:13:0x0028] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:291:0x06ce  */
    /* JADX WARN: Type inference failed for: r1v8 */
    @Override // X.InterfaceC919903if
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C910203h6 r61) {
        /*
            Method dump skipped, instruction units count: 2210
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907903gj.LIZ(X.03h6):void");
    }

    public static final boolean LIZJ(final Context context, final C910203h6 c910203h6, final C897703f5 c897703f5, final NewPayInfo newPayInfo, final Function0 function0, final boolean z) {
        boolean z2;
        String str;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        if (c897703f5.LJIIJJI != null) {
            z2 = true;
        } else {
            z2 = false;
        }
        MaterialCollectionInfo materialCollectionInfoLIZIZ = newPayInfo.LIZIZ();
        PaymentSyncPayResultOptimizationConfig.PaymentSyncPayResultOptimizationConfigModel paymentSyncPayResultOptimizationConfigModel = PaymentSyncPayResultOptimizationConfig.LIZ;
        PaymentInfo paymentInfo = c897703f5.LJI;
        String str2 = null;
        if (paymentInfo != null && (paymentMethod2 = paymentInfo.paymentMethod) != null) {
            str = paymentMethod2.id;
        } else {
            str = null;
        }
        if (!PaymentSyncPayResultOptimizationConfig.LIZ(str) || !z || c910203h6.LJII != EnumC934003kw.SUCCESS || materialCollectionInfoLIZIZ == null || z2) {
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("payment_sync_pay_info_collect_main_thread", true) && !Intrinsics.LJFF(Looper.myLooper(), Looper.getMainLooper())) {
            C786410Ut5.LJJZZIII(new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.03hA
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("PaymentResultProcess@6ad4.payResultProcess$4$handlePaySyncInfoCollectionIfNeeded$1");
                    try {
                        C897703f5 c897703f52 = c897703f5;
                        NewPayInfo newPayInfo2 = newPayInfo;
                        boolean z3 = z;
                        C907903gj.LIZJ(context, c910203h6, c897703f52, newPayInfo2, function0, z3);
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("PaymentResultProcess@6ad4.payResultProcess$4$handlePaySyncInfoCollectionIfNeeded$1");
                }
            });
            return true;
        }
        C907803gi c907803gi = C907803gi.LIZ;
        long j = c897703f5.LJJIIZI;
        PaymentInfo paymentInfo2 = c897703f5.LJI;
        if (paymentInfo2 != null && (paymentMethod = paymentInfo2.paymentMethod) != null) {
            str2 = paymentMethod.id;
        }
        String str3 = c910203h6.LJFF;
        C03WO c03wo = C03WO.QUERY_RESULT;
        C03PY c03py = C03PY.CLIENT_QUERY;
        c907803gi.getClass();
        C907803gi.LJJJLL(j, true, str2, str3, c03wo, c03py);
        AwS545S0100000_1 awS545S0100000_1 = new AwS545S0100000_1(function0, (Function0<Unit>) 1194);
        c907803gi.getClass();
        C907803gi.LJIIL(context, c897703f5, materialCollectionInfoLIZIZ, awS545S0100000_1);
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(X.C910203h6 r23, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo r24, X.InterfaceC911103hF r25, X.C897703f5 r26, java.lang.String r27, java.lang.String r28, java.lang.Object r29, java.lang.String r30, java.lang.Object r31, java.lang.String r32, android.content.Context r33, boolean r34) {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907903gj.LIZLLL(X.03h6, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo, X.03hF, X.03f5, java.lang.String, java.lang.String, java.lang.Object, java.lang.String, java.lang.Object, java.lang.String, android.content.Context, boolean):void");
    }

    public static final void LIZIZ(C910203h6 c910203h6, C897703f5 c897703f5, Context context, C898003f8 c898003f8, String str, NewPayInfo newPayInfo, InterfaceC911103hF interfaceC911103hF, String str2, Object obj, String str3, Object obj2, String str4, boolean z) {
        C914003hi c914003hi;
        String str5;
        boolean z2;
        String str6;
        PaymentMethod paymentMethod;
        boolean z3;
        String str7;
        PaymentMethod paymentMethod2;
        boolean z4;
        PaymentMethod paymentMethod3;
        ArrayList<C914003hi> arrayList = c910203h6.LJIILIIL;
        String str8 = null;
        if (arrayList != null && (c914003hi = (C914003hi) C13LP.LJJJLL(arrayList)) != null) {
            if (Intrinsics.LJFF(c914003hi.LIZ, "PIN_FREE")) {
                if (c897703f5.LJJ) {
                    C907803gi c907803gi = C907803gi.LIZ;
                    long j = c897703f5.LJJIIZI;
                    if (c910203h6.LJII == EnumC934003kw.SUCCESS) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    PaymentInfo paymentInfo = c897703f5.LJI;
                    if (paymentInfo != null && (paymentMethod3 = paymentInfo.paymentMethod) != null) {
                        str8 = paymentMethod3.id;
                    }
                    String str9 = c910203h6.LJFF;
                    C03WO c03wo = C03WO.COLLECT_INFO;
                    C03PY c03py = C03PY.CLIENT_QUERY;
                    c907803gi.getClass();
                    C907803gi.LJJJLL(j, z4, str8, str9, c03wo, c03py);
                    C907803gi.LJIILLIIL(context, c914003hi.LIZIZ, c897703f5.LJIIIIZZ, new AwS0S4710000_1(c910203h6, newPayInfo, interfaceC911103hF, c897703f5, str, str2, obj, str3, obj2, str4, context, z, 1));
                    return;
                }
                LIZLLL(c910203h6, newPayInfo, interfaceC911103hF, c897703f5, str, str2, obj, str3, obj2, str4, context, z);
                return;
            }
            if (Intrinsics.LJFF(c914003hi.LIZ, "BIOMETRIC")) {
                C907803gi c907803gi2 = C907803gi.LIZ;
                long j2 = c897703f5.LJJIIZI;
                if (c910203h6.LJII == EnumC934003kw.SUCCESS) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                PaymentInfo paymentInfo2 = c897703f5.LJI;
                if (paymentInfo2 != null && (paymentMethod2 = paymentInfo2.paymentMethod) != null) {
                    str7 = paymentMethod2.id;
                } else {
                    str7 = null;
                }
                String str10 = c910203h6.LJFF;
                C03WO c03wo2 = C03WO.COLLECT_INFO;
                C03PY c03py2 = C03PY.CLIENT_QUERY;
                c907803gi2.getClass();
                C907803gi.LJJJLL(j2, z3, str7, str10, c03wo2, c03py2);
                String str11 = c914003hi.LIZIZ;
                String str12 = c897703f5.LJIIIIZZ;
                Object obj3 = c897703f5.LJII.get("previous_page");
                if (obj3 instanceof String) {
                    str8 = (String) obj3;
                }
                C907803gi.LJIILJJIL(str11, str12, str8, new AwS0S4710000_1(c910203h6, newPayInfo, interfaceC911103hF, c897703f5, str, str2, obj, str3, obj2, str4, context, z, 2));
                return;
            }
            if (Intrinsics.LJFF(c914003hi.LIZ, "BNPL")) {
                C907803gi c907803gi3 = C907803gi.LIZ;
                String str13 = c914003hi.LIZIZ;
                AwS0S4710000_1 awS0S4710000_1 = new AwS0S4710000_1(c910203h6, newPayInfo, interfaceC911103hF, c897703f5, str, str2, obj, str3, obj2, str4, context, z, 3);
                c907803gi3.getClass();
                C907803gi.LJIIZILJ(context, str13, "bnpl after payment", awS0S4710000_1);
                return;
            }
            String str14 = "VISA_PAYMENT_SIGNAL";
            if (!Intrinsics.LJFF(c914003hi.LIZ, "BACKUP_PAYMENT") && !Intrinsics.LJFF(c914003hi.LIZ, "VISA_PAYMENT_SIGNAL")) {
                if (Intrinsics.LJFF(c914003hi.LIZ, "AFTER_PAYMENT_BIND_RETAIN")) {
                    C907803gi c907803gi4 = C907803gi.LIZ;
                    String str15 = c914003hi.LIZJ;
                    AwS0S4710000_1 awS0S4710000_12 = new AwS0S4710000_1(c910203h6, newPayInfo, interfaceC911103hF, c897703f5, str, str2, obj, str3, obj2, str4, context, z, 5);
                    c907803gi4.getClass();
                    C907803gi.LJIIJ(context, str15, c897703f5, awS0S4710000_12);
                    return;
                }
                if (Intrinsics.LJFF(c914003hi.LIZ, "LARGE_AMOUNT_PAYMENT_VERIFICATION")) {
                    C907803gi c907803gi5 = C907803gi.LIZ;
                    String str16 = c914003hi.LIZIZ;
                    AwS0S4710000_1 awS0S4710000_13 = new AwS0S4710000_1(c910203h6, newPayInfo, interfaceC911103hF, c897703f5, str, str2, obj, str3, obj2, str4, context, z, 6);
                    c907803gi5.getClass();
                    C907803gi.LJIIZILJ(context, str16, "large amount payment verification", awS0S4710000_13);
                    return;
                }
                if (Intrinsics.LJFF(c914003hi.LIZ, "COLLECT_INFO")) {
                    C907803gi c907803gi6 = C907803gi.LIZ;
                    boolean z5 = c897703f5.LJII.get("previous_page") instanceof String;
                    c907803gi6.getClass();
                    if (C907803gi.LIZ(context) && (str5 = c914003hi.LIZJ) != null && C123100dR.LIZ(str5)) {
                        long j3 = c897703f5.LJJIIZI;
                        if (c910203h6.LJII == EnumC934003kw.SUCCESS) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        PaymentInfo paymentInfo3 = c897703f5.LJI;
                        if (paymentInfo3 != null && (paymentMethod = paymentInfo3.paymentMethod) != null) {
                            str6 = paymentMethod.id;
                        } else {
                            str6 = null;
                        }
                        C907803gi.LJJJLL(j3, z2, str6, c910203h6.LJFF, C03WO.COLLECT_INFO, C03PY.CLIENT_QUERY);
                        String str17 = c914003hi.LIZIZ;
                        String str18 = c897703f5.LJIIIIZZ;
                        Object obj4 = c897703f5.LJII.get("previous_page");
                        if (obj4 instanceof String) {
                            str8 = (String) obj4;
                        }
                        C907803gi.LJIIJJI(str17, str18, str8, c914003hi.LIZJ, new AwS0S4710000_1(c910203h6, newPayInfo, interfaceC911103hF, c897703f5, str, str2, obj, str3, obj2, str4, context, z, 7));
                        return;
                    }
                }
                LIZLLL(c910203h6, newPayInfo, interfaceC911103hF, c897703f5, str, str2, obj, str3, obj2, str4, context, z);
                return;
            }
            if (!Intrinsics.LJFF(c914003hi.LIZ, "VISA_PAYMENT_SIGNAL")) {
                str14 = "BACKUP_PAYMENT";
            }
            C907803gi c907803gi7 = C907803gi.LIZ;
            String str19 = c914003hi.LIZIZ;
            String str20 = c898003f8.LIZ;
            String str21 = c898003f8.LJIILLIIL;
            String str22 = c914003hi.LIZJ;
            String str23 = c897703f5.LJIIIIZZ;
            boolean z6 = c897703f5.LJII.get("previous_page") instanceof String;
            C900203fU c900203fU = c897703f5.LJIJ.LJI;
            String str24 = c898003f8.LJIIJJI;
            AwS0S4710000_1 awS0S4710000_14 = new AwS0S4710000_1(c910203h6, newPayInfo, interfaceC911103hF, c897703f5, str, str2, obj, str3, obj2, str4, context, z, 4);
            c907803gi7.getClass();
            C907803gi.LJIILIIL(str19, str20, str21, str, str23, str22, str24, c900203fU, c897703f5, str14, awS0S4710000_14);
            return;
        }
        LIZLLL(c910203h6, newPayInfo, interfaceC911103hF, c897703f5, str, str2, obj, str3, obj2, str4, context, z);
    }

    public static final void LJ(C910203h6 c910203h6, C897703f5 c897703f5, String str, boolean z, boolean z2, String str2, InterfaceC911103hF interfaceC911103hF, C013C c013c, NewPayInfo newPayInfo, String str3, Object obj, String str4, Object obj2, String str5, Long l) {
        boolean z3;
        PaymentMethod paymentMethod;
        String str6;
        PaymentMethod paymentMethod2;
        String str7;
        long jCurrentTimeMillis;
        boolean z4;
        String strLIZ;
        String value;
        Boolean boolIsChooseSave;
        List<PaymentMethod> list;
        String strLJIIJ;
        PaymentMethod paymentMethod3;
        PaymentMethodInfo paymentMethodInfo;
        PaymentMethod paymentMethod4;
        CommuteInfo commuteInfoLJJIIJ;
        CommuteType commuteType;
        PayResult payResult;
        EnumC899203fK enumC899203fK;
        String strLJJIIZ;
        boolean z5;
        PaymentMethod paymentMethod5;
        String str8 = "1";
        boolean z6 = true;
        if (C925303jX.LIZ()) {
            IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
            EnumC934003kw enumC934003kw = c910203h6.LJII;
            EnumC934003kw enumC934003kw2 = EnumC934003kw.SUCCESS;
            if (enumC934003kw == enumC934003kw2) {
                enumC899203fK = EnumC899203fK.SUCCESS;
            } else {
                enumC899203fK = EnumC899203fK.FAIL;
            }
            String value2 = enumC899203fK.getValue();
            String str9 = c910203h6.LJFF;
            PaymentInfo paymentInfo = c897703f5.LJI;
            if (paymentInfo != null && (paymentMethod5 = paymentInfo.paymentMethod) != null) {
                strLJJIIZ = paymentMethod5.LJJIIZ();
            } else {
                strLJJIIZ = null;
            }
            C907803gi.LIZ.getClass();
            if (C907803gi.LJIJ() && c910203h6.LJII != enumC934003kw2) {
                z5 = true;
            } else {
                z5 = false;
            }
            Boolean boolValueOf = Boolean.valueOf(z5);
            Boolean boolValueOf2 = Boolean.valueOf(z);
            String str10 = c910203h6.LJIILJJIL;
            if (!c897703f5.LJIL) {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            iEventCenter.LIZ("ec_common_pay_result", C1741890vQh.LJIIIIZZ(new EcomPaymentInterceptor.CommonPayResultEvent(value2, str9, strLJJIIZ, null, str, boolValueOf, boolValueOf2, str10, str8, Boolean.valueOf(z2), Boolean.FALSE, str2, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE)));
        } else {
            IEventCenter iEventCenter2 = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
            HashMap map = new HashMap();
            EnumC934003kw enumC934003kw3 = c910203h6.LJII;
            EnumC934003kw enumC934003kw4 = EnumC934003kw.SUCCESS;
            if (enumC934003kw3 == enumC934003kw4) {
                z3 = true;
            } else {
                z3 = false;
            }
            map.put("is_success", Boolean.valueOf(z3));
            map.put("error_code", c910203h6.LJFF);
            if (!c897703f5.LJIL) {
                str8 = CardStruct.IStatusCode.DEFAULT;
            }
            map.put("is_interrupted", str8);
            if (str != null) {
                map.put("pay_request_id", str);
            }
            if (obj != null) {
                map.put("mall_ab", obj);
            }
            if (str4 != null) {
                map.put("mall_tab", str4);
            }
            if (obj2 != null) {
                map.put("mall_source", obj2);
            }
            C907803gi.LIZ.getClass();
            if (C907803gi.LJIJ() && c910203h6.LJII != enumC934003kw4) {
                map.put("should_hide_error", Boolean.TRUE);
            }
            String str11 = c910203h6.LJIILJJIL;
            if (str11 != null) {
                map.put("pipo_error_action", str11);
            }
            map.put("enable_sync_trade_success", Boolean.valueOf(z));
            PaymentInfo paymentInfo2 = c897703f5.LJI;
            if (paymentInfo2 != null && (paymentMethod = paymentInfo2.paymentMethod) != null) {
                map.put("pay_type", paymentMethod.LJJIIZ());
            }
            iEventCenter2.LIZ("ec_pay_result", C1741890vQh.LJIIIIZZ(map));
        }
        EnumC934003kw enumC934003kw5 = c910203h6.LJII;
        EnumC934003kw enumC934003kw6 = EnumC934003kw.SUCCESS;
        if (enumC934003kw5 != enumC934003kw6 && !c897703f5.LJIL) {
            str6 = c910203h6.LJFF;
        } else {
            str6 = null;
        }
        if (interfaceC911103hF != null) {
            interfaceC911103hF.LJFF(PayResult.DONE, str6, null, c910203h6.LJIILJJIL, Boolean.valueOf(c013c.element), str5);
        }
        PaymentInfo paymentInfo3 = c897703f5.LJI;
        if (paymentInfo3 != null) {
            paymentMethod2 = paymentInfo3.paymentMethod;
        } else {
            paymentMethod2 = null;
        }
        if (c897703f5.LJJIJ) {
            str7 = "payment_method";
        } else {
            str7 = "order_submit";
        }
        if (l != null) {
            jCurrentTimeMillis = System.currentTimeMillis() - l.longValue();
        } else {
            jCurrentTimeMillis = 0;
        }
        if (c910203h6.LJII == enumC934003kw6) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (newPayInfo != null && (payResult = newPayInfo.payResult) != null) {
            strLIZ = C906603gW.LIZ(payResult);
        } else {
            strLIZ = null;
        }
        PaymentInfo paymentInfo4 = c897703f5.LJI;
        if (paymentInfo4 != null && (paymentMethod4 = paymentInfo4.paymentMethod) != null && (commuteInfoLJJIIJ = paymentMethod4.LJJIIJ(false)) != null && (commuteType = commuteInfoLJJIIJ.commuteType) != null) {
            value = commuteType.getValue();
        } else {
            value = null;
        }
        PaymentInfo paymentInfo5 = c897703f5.LJI;
        if (paymentInfo5 != null && (paymentMethodInfo = paymentInfo5.paymentMethodInfo) != null) {
            boolIsChooseSave = paymentMethodInfo.isChooseSave();
        } else {
            boolIsChooseSave = null;
        }
        PaymentMethodsData paymentMethodsData = c897703f5.LJJIIJZLJL;
        if (paymentMethodsData != null && (list = paymentMethodsData.storedMethods) != null) {
            Iterator<PaymentMethod> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                PaymentMethod next = it2.next();
                String strLJIIJ2 = next.LJIIJ();
                PaymentInfo paymentInfo6 = c897703f5.LJI;
                if (paymentInfo6 != null && (paymentMethod3 = paymentInfo6.paymentMethod) != null) {
                    strLJIIJ = paymentMethod3.LJIIJ();
                } else {
                    strLJIIJ = null;
                }
                if (Intrinsics.LJFF(strLJIIJ2, strLJIIJ)) {
                    if (next == null) {
                        break;
                    }
                }
            }
            z6 = false;
        } else {
            z6 = false;
        }
        C834803Ny.LIZ("pay", paymentMethod2, boolIsChooseSave, Boolean.valueOf(z6), strLIZ, Long.valueOf(jCurrentTimeMillis), null, null, null, null, Boolean.valueOf(z4), null, null, null, null, null, str7, null, null, null, null, null, null, null, "send_event_and_finish", null, str3, null, value, null, null, null, null, null, null, null, null, str5, null, -704775232, 191);
    }
}
