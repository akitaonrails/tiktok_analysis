package X;

import android.content.Context;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.event.PaymentResultReceivedEvent;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PlatformPromotion;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS0S2300200_1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.035q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7872035q {
    public static final C7872035q LIZ = new C7872035q();
    public static OrderSubmitAssemViewModel LIZIZ;

    /* JADX WARN: Removed duplicated region for block: B:60:0x00b2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData r6, java.lang.String r7, long r8, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r10) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitAssemViewModel r4 = X.C7872035q.LIZIZ
            if (r4 == 0) goto La9
            X.035r r5 = r4.r
            r3 = 0
            if (r6 == 0) goto L2d
            java.lang.String r0 = r6.comboId
        Lb:
            r5.LIZIZ = r0
            if (r6 == 0) goto L2b
            java.util.List<java.lang.String> r0 = r6.orderIds
        L11:
            r5.LIZ = r0
            if (r6 == 0) goto L29
            java.lang.String r0 = r6.logId
        L17:
            r5.LIZLLL = r0
            if (r6 == 0) goto L27
            java.lang.Boolean r0 = r6.missCashback
        L1d:
            r5.LJ = r0
            r2 = 1
            if (r6 == 0) goto Lb2
            com.google.gson.n r6 = r6.cashier
            if (r6 == 0) goto Lb2
            goto L2f
        L27:
            r0 = r3
            goto L1d
        L29:
            r0 = r3
            goto L17
        L2b:
            r0 = r3
            goto L11
        L2d:
            r0 = r3
            goto Lb
        L2f:
            com.google.gson.Gson r1 = X.C1741890vQh.LJFF()     // Catch: com.google.gson.s -> Lae
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: com.google.gson.s -> Lae
            r0.getClass()     // Catch: com.google.gson.s -> Lae
            X.04a9 r0 = X.C1120604Zw.LIZIZ()     // Catch: com.google.gson.s -> Lae
            if (r0 == 0) goto L55
            boolean r0 = r0.LJII     // Catch: com.google.gson.s -> Lae
            if (r0 != r2) goto L55
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier> r0 = com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier.class
            X.13JW r0 = X.C13LE.LJII(r0)     // Catch: com.google.gson.s -> Lae
            java.lang.reflect.Type r0 = X.C2371409Qy.LIZJ(r0)     // Catch: com.google.gson.s -> Lae
        L4c:
            java.lang.Object r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.fromJson(r1, r6, r0)     // Catch: com.google.gson.s -> Lae
            boolean r0 = r1 instanceof com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier     // Catch: com.google.gson.s -> Lae
            if (r0 != 0) goto L60
            goto L5f
        L55:
            X.035s r0 = new X.035s     // Catch: com.google.gson.s -> Lae
            r0.<init>()     // Catch: com.google.gson.s -> Lae
            java.lang.reflect.Type r0 = r0.getType()     // Catch: com.google.gson.s -> Lae
            goto L4c
        L5f:
            r1 = r3
        L60:
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier r1 = (com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier) r1     // Catch: com.google.gson.s -> Lae
            if (r1 == 0) goto Lb2
            com.ss.android.ugc.aweme.ecommerce.base.payment.dto.PaymentParams r0 = r1.paymentParams
            if (r0 == 0) goto Lb2
            java.lang.String r0 = r0.chargeId
        L6a:
            r5.LJIIJJI = r0
            X.035r r1 = r4.r
            r1.LJFF = r7
            r1.LJI = r8
            r1.LJII = r10
            java.lang.Integer r0 = r4.m
            r1.LJIIIIZZ = r0
            com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r0 = r4.LLJJI
            if (r0 == 0) goto Lac
            java.lang.String r0 = r0.createOrderInfoFromBill
        L7e:
            r1.LJIIIZ = r0
            java.util.HashMap<java.lang.String, java.lang.Object> r1 = r4.LLLIL
            if (r1 == 0) goto Laa
            java.lang.String r0 = "source_page_type"
            java.lang.Object r1 = r1.get(r0)
        L8a:
            boolean r0 = r1 instanceof java.lang.String
            if (r0 == 0) goto L91
            r3 = r1
            java.lang.String r3 = (java.lang.String) r3
        L91:
            X.035r r1 = r4.r
            java.lang.String r0 = "fifty_percent_off_campaign"
            boolean r0 = kotlin.jvm.internal.Intrinsics.LJFF(r3, r0)
            if (r0 != 0) goto La7
            X.03ld r0 = X.C938303ld.LIZ
            r0.getClass()
            boolean r0 = X.C938303ld.LIZ(r3)
            if (r0 != 0) goto La7
            r2 = 0
        La7:
            r1.LJIIJ = r2
        La9:
            return
        Laa:
            r1 = r3
            goto L8a
        Lac:
            r0 = r3
            goto L7e
        Lae:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        Lb2:
            r0 = r3
            goto L6a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7872035q.LIZ(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.CreateOrderData, java.lang.String, long, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LIZJ(Context context, C03NB c03nb, Throwable th, long j, String str, Integer num, OrderSubmitAssemViewModel orderSubmitAssemViewModel) {
        String str2;
        HashMap<String, Object> map;
        ExceptionUX exceptionUX;
        String str3;
        Integer num2;
        CreateOrderData createOrderData;
        String str4;
        HashMap<String, Object> mapLJIIJ;
        Integer numValueOf;
        String string;
        Integer numValueOf2;
        PlatformPromotion platformPromotion;
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        ExceptionUX exceptionUX2 = null;
        if (iEventCenter != null) {
            iEventCenter.LIZ("ec_order_result_received", C1741890vQh.LJIIIIZZ(new PaymentResultReceivedEvent(true, true)));
        }
        LIZIZ = orderSubmitAssemViewModel;
        long jCurrentTimeMillis = System.currentTimeMillis() - j;
        C03VQ c03vq = C03VQ.LIZ;
        long jCurrentTimeMillis2 = System.currentTimeMillis();
        c03vq.getClass();
        C03VQ.LJIILLIIL = jCurrentTimeMillis2;
        String strLIZIZ = C7848034s.LIZIZ(orderSubmitAssemViewModel.LLILZLL, orderSubmitAssemViewModel.LLLLLLIL);
        BillInfoData billInfoData = orderSubmitAssemViewModel.LLJJI;
        if (billInfoData != null && (platformPromotion = billInfoData.platformPromotion) != null) {
            str2 = platformPromotion.daInfo;
        } else {
            str2 = null;
        }
        HashMap<String, Object> mapLJIIJ2 = C1741890vQh.LJIIJ(str2);
        Boolean bool = C7875035t.LIZIZ().enableAutoRetry;
        if (bool != null && bool.booleanValue()) {
            List list = C7875035t.LIZIZ().errorCodeList;
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            if (c03nb != null) {
                numValueOf = Integer.valueOf(c03nb.code);
            } else {
                numValueOf = null;
            }
            if (list.contains(String.valueOf(numValueOf))) {
                if (c03nb != null) {
                    numValueOf2 = Integer.valueOf(c03nb.code);
                } else {
                    numValueOf2 = null;
                }
                orderSubmitAssemViewModel.LLJJIJI = String.valueOf(numValueOf2);
                orderSubmitAssemViewModel.setState(AFwS228S0000000_1.get$arr$(865));
            } else if (th != null) {
                Integer numLIZ = C2371809Rc.LIZ(th);
                if (numLIZ != null) {
                    string = numLIZ.toString();
                } else {
                    string = null;
                }
                Iterable iterable = C7875035t.LIZIZ().httpCodeList;
                if (iterable == null) {
                    iterable = C13BV.INSTANCE;
                }
                if (C13LP.LJJJJ(string, iterable)) {
                    orderSubmitAssemViewModel.setState(AFwS228S0000000_1.get$arr$(866));
                } else {
                    orderSubmitAssemViewModel.setState(AFwS228S0000000_1.get$arr$(867));
                }
            } else {
                orderSubmitAssemViewModel.setState(AFwS228S0000000_1.get$arr$(868));
            }
        } else {
            orderSubmitAssemViewModel.setState(AFwS228S0000000_1.get$arr$(869));
        }
        C03O0 c03o0 = C03O0.LIZ;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel2 = LIZIZ;
        if (orderSubmitAssemViewModel2 != null) {
            map = orderSubmitAssemViewModel2.hi1(false);
        } else {
            map = new HashMap<>();
        }
        if (c03nb != null && (createOrderData = (CreateOrderData) c03nb.data) != null && (str4 = createOrderData.daInfo) != null && (mapLJIIJ = C1741890vQh.LJIIJ(str4)) != null) {
            map.putAll(mapLJIIJ);
        }
        if (mapLJIIJ2 != null) {
            map.putAll(mapLJIIJ2);
        }
        map.put("enter_method", "order_submit_module");
        c03o0.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap(C03O0.LIZIZ);
        linkedHashMap.put("module_name", "card_activation");
        linkedHashMap.putAll(map);
        C1421105hJ.LIZJ("tiktokec_module_result", linkedHashMap);
        if (c03nb == null) {
            orderSubmitAssemViewModel.setState(AFwS228S0000000_1.get$arr$(870));
            orderSubmitAssemViewModel.nT2();
            OrderSubmitAssemViewModel orderSubmitAssemViewModel3 = LIZIZ;
            if (orderSubmitAssemViewModel3 != null) {
                orderSubmitAssemViewModel3.withState(new C833703Nn(orderSubmitAssemViewModel3, null, th, strLIZIZ, null, jCurrentTimeMillis, null, str));
                return;
            }
            return;
        }
        CreateOrderData createOrderData2 = (CreateOrderData) c03nb.data;
        orderSubmitAssemViewModel.LLJJIJI = String.valueOf(c03nb.code);
        if (!c03nb.isCodeOK()) {
            orderSubmitAssemViewModel.setState(AFwS228S0000000_1.get$arr$(871));
            if (createOrderData2 != null) {
                exceptionUX2 = createOrderData2.exceptionUX;
            }
            orderSubmitAssemViewModel.LLJJIII = exceptionUX2;
            if ((exceptionUX2 != null && (num2 = exceptionUX2.exceptionUXType) != null && num2.intValue() == 2) || ((exceptionUX = orderSubmitAssemViewModel.LLJJIII) != null && Intrinsics.LJFF(exceptionUX.renderPage, Boolean.TRUE))) {
                str3 = "query_bill_info";
            } else {
                str3 = "create_order";
            }
            orderSubmitAssemViewModel.LLLFF = str3;
            orderSubmitAssemViewModel.aT2(1);
            String str5 = orderSubmitAssemViewModel.LLJJIJI;
            OrderSubmitAssemViewModel orderSubmitAssemViewModel4 = LIZIZ;
            if (orderSubmitAssemViewModel4 != null) {
                orderSubmitAssemViewModel4.withState(new C833703Nn(orderSubmitAssemViewModel4, c03nb, th, strLIZIZ, str5, jCurrentTimeMillis, num, str));
                return;
            }
            return;
        }
        orderSubmitAssemViewModel.withState(new AwS0S2300200_1(context, createOrderData2, orderSubmitAssemViewModel, str, j, strLIZIZ, jCurrentTimeMillis, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZLLL(android.content.Context r20, X.C03NB r21, java.lang.Throwable r22, long r23, java.lang.String r25, java.lang.Integer r26, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel r27) {
        /*
            Method dump skipped, instruction units count: 352
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7872035q.LIZLLL(android.content.Context, X.03NB, java.lang.Throwable, long, java.lang.String, java.lang.Integer, com.ss.android.ugc.aweme.ecommerce.base.osp.vm.MiniOspViewModel):void");
    }

    public static void LIZIZ(Context context, CreateOrderData createOrderData, PaymentInfo paymentInfo, String str, String str2, String str3, long j, long j2) {
        NewPayInfo newPayInfo;
        List<String> list;
        String str4;
        Boolean bool;
        OrderSubmitAssemViewModel orderSubmitAssemViewModel = LIZIZ;
        if (orderSubmitAssemViewModel != null) {
            n nVar = null;
            String strLIZJ = orderSubmitAssemViewModel.LLLZLZ.LIZJ("c7497.d4784", null);
            C03PJ.LJFF(orderSubmitAssemViewModel.LLZZ, orderSubmitAssemViewModel.r, Boolean.valueOf(orderSubmitAssemViewModel.rS2()), strLIZJ, false, orderSubmitAssemViewModel.n, 8);
            if (createOrderData != null) {
                nVar = createOrderData.cashier;
                newPayInfo = createOrderData.newPayInfo;
                list = createOrderData.orderIds;
                str4 = createOrderData.comboId;
                bool = createOrderData.missCashback;
            } else {
                newPayInfo = null;
                list = null;
                str4 = null;
                bool = null;
            }
            OrderSubmitAssemViewModel.fR2(orderSubmitAssemViewModel, context, nVar, newPayInfo, list, str4, paymentInfo, str, str2, str3, j, j2, strLIZJ, false, bool, createOrderData, SpeechEngineDefines.TTS_WORK_MODE_BOTH);
        }
    }
}
