package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.api.model.ExceptionUX;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PollOrderStatusRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.utils.QueryOrderAfterAuthManager;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.03PJ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03PJ implements InterfaceC1164530gPT {
    public InterfaceC838003Pe LL;
    public final QueryOrderAfterAuthManager LLILLJJLI = new QueryOrderAfterAuthManager();
    public String LLILLL = "";
    public C7873035r LLILZ = new C7873035r(null, null, false, null, null, null, null, 32767);
    public C897703f5 LLILZIL;
    public PollOrderStatusRequest LLILZLL;
    public EcomPaymentInterceptor.PayResultEvent LLIZ;
    public EcomPaymentInterceptor.CommonPayResultEvent LLIZLLLIL;
    public String LLJ;
    public C1397510mTF LLJI;

    public final void LIZ() {
        QueryOrderAfterAuthManager queryOrderAfterAuthManager = this.LLILLJJLI;
        queryOrderAfterAuthManager.LIZ();
        queryOrderAfterAuthManager.LIZ = null;
        queryOrderAfterAuthManager.LJIIIIZZ = null;
        LJII();
        C03VQ.LIZ.getClass();
        C03VQ.LIZLLL = null;
        C03VQ.LJIILIIL = null;
        C03VQ.LJII = null;
        C1397510mTF c1397510mTF = this.LLJI;
        if (c1397510mTF != null) {
            c1397510mTF.LIZIZ(null);
        }
        this.LLJI = null;
        this.LL = null;
    }

    public final void LIZLLL() {
        InterfaceC838003Pe interfaceC838003Pe = this.LL;
        if (interfaceC838003Pe != null) {
            interfaceC838003Pe.wP1();
        }
        EcomPaymentInterceptor.PayResultEvent payResultEvent = this.LLIZ;
        if (payResultEvent != null) {
            this.LLILLJJLI.LIZLLL(this.LLILZLL, this.LLILZ.LJIIIIZZ, new C03N9() { // from class: X.03PS
                @Override // X.C03N9
                public final void LIZ(EnumC828303Ll enumC828303Ll, String str, ExceptionUX exceptionUX, C03N8 c03n8, PollOrderDisplayInfo pollOrderDisplayInfo) {
                    String str2;
                    if (enumC828303Ll == EnumC828303Ll.POLL_SUCCESS) {
                        C03VQ c03vq = C03VQ.LIZ;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        c03vq.getClass();
                        C03VQ.LJIJJLI = jCurrentTimeMillis;
                    }
                    C03PJ c03pj = this.LIZ;
                    InterfaceC838003Pe interfaceC838003Pe2 = c03pj.LL;
                    if (interfaceC838003Pe2 != null) {
                        EcomPaymentInterceptor.PayResultEvent payResultEvent2 = c03pj.LLIZ;
                        if (payResultEvent2 != null) {
                            str2 = payResultEvent2.errorCode;
                        } else {
                            str2 = null;
                        }
                        String str3 = c03pj.LLJ;
                        if (str3 == null) {
                            str3 = "";
                        }
                        interfaceC838003Pe2.Lv1(enumC828303Ll, str2, exceptionUX, c03n8, str3, payResultEvent2, null);
                    }
                }
            }, Boolean.valueOf(payResultEvent.enableSyncTradeSuccess));
            return;
        }
        QueryOrderAfterAuthManager queryOrderAfterAuthManager = this.LLILLJJLI;
        PollOrderStatusRequest pollOrderStatusRequest = this.LLILZLL;
        Integer num = this.LLILZ.LJIIIIZZ;
        C03N9 c03n9 = new C03N9() { // from class: X.03PT
            @Override // X.C03N9
            public final void LIZ(EnumC828303Ll enumC828303Ll, String str, ExceptionUX exceptionUX, C03N8 c03n8, PollOrderDisplayInfo pollOrderDisplayInfo) {
                String str2;
                if (enumC828303Ll == EnumC828303Ll.POLL_SUCCESS) {
                    C03VQ c03vq = C03VQ.LIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c03vq.getClass();
                    C03VQ.LJIJJLI = jCurrentTimeMillis;
                }
                C03PJ c03pj = this.LIZ;
                InterfaceC838003Pe interfaceC838003Pe2 = c03pj.LL;
                if (interfaceC838003Pe2 != null) {
                    EcomPaymentInterceptor.CommonPayResultEvent commonPayResultEvent = c03pj.LLIZLLLIL;
                    if (commonPayResultEvent != null) {
                        str2 = commonPayResultEvent.errorCode;
                    } else {
                        str2 = null;
                    }
                    interfaceC838003Pe2.Lv1(enumC828303Ll, str2, exceptionUX, c03n8, "", null, commonPayResultEvent);
                }
            }
        };
        EcomPaymentInterceptor.CommonPayResultEvent commonPayResultEvent = this.LLIZLLLIL;
        queryOrderAfterAuthManager.LIZLLL(pollOrderStatusRequest, num, c03n9, commonPayResultEvent != null ? commonPayResultEvent.enableSyncTradeSuccess : null);
    }

    public final void LJII() {
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZJ("ec_pay_result", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZJ("ec_payment_result_handler", this);
        }
    }

    public C03PJ(InterfaceC838003Pe interfaceC838003Pe) {
        this.LL = interfaceC838003Pe;
    }

    public final void LJ(C03WX c03wx) {
        this.LLILLJJLI.LIZJ(c03wx);
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_pay_result", this);
        }
        IEventCenter iEventCenter2 = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter2 != null) {
            iEventCenter2.LIZLLL("ec_payment_result_handler", this);
        }
    }

    @Override // X.InterfaceC1164530gPT
    public final void onEvent(String str, String str2) {
        Type type;
        InterfaceC838003Pe interfaceC838003Pe;
        EcomPaymentInterceptor.PayResultEvent payResultEvent;
        String str3;
        PaymentInfo paymentInfo;
        PaymentMethod paymentMethod;
        Type type2;
        if (Intrinsics.LJFF(str, "ec_pay_result")) {
            C03VQ.LIZ.getClass();
            C03VQ.LJJ();
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type2 = C2371409Qy.LIZJ(C13LE.LJII(EcomPaymentInterceptor.PayResultEvent.class));
                } else {
                    type2 = new TypeToken<EcomPaymentInterceptor.PayResultEvent>() { // from class: X.03Pg
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, str2, type2);
                if (!(objFromJson instanceof EcomPaymentInterceptor.PayResultEvent)) {
                    objFromJson = null;
                }
                payResultEvent = (EcomPaymentInterceptor.PayResultEvent) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                payResultEvent = null;
            }
            C2341109Fh.LIZ.getClass();
            C2341109Fh.LIZ("EC_PAY_RESULT: " + payResultEvent);
            if (payResultEvent != null) {
                if (payResultEvent.isSuccess) {
                    C03VQ c03vq = C03VQ.LIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c03vq.getClass();
                    C03VQ.LJIJJ = jCurrentTimeMillis;
                }
                String string = payResultEvent.middlePageUrl;
                if (string == null) {
                    string = this.LLILLL;
                }
                if (payResultEvent.isSuccess && this.LLILZ.LJIIJ) {
                    HashMap map = new HashMap();
                    map.put("payment_status", "success");
                    map.put("pay_route", "h5");
                    string = C919503ib.LIZLLL(string, map).toString();
                }
                C907803gi c907803gi = C907803gi.LIZ;
                long j = this.LLILZ.LJI;
                boolean z = payResultEvent.isSuccess;
                C897703f5 c897703f5 = this.LLILZIL;
                if (c897703f5 != null && (paymentInfo = c897703f5.LJI) != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                    str3 = paymentMethod.id;
                } else {
                    str3 = null;
                }
                C03WO c03wo = C03WO.QUERY_RESULT;
                C03PY c03py = C03PY.FE_QUERY;
                String str4 = payResultEvent.errorCode;
                c907803gi.getClass();
                C907803gi.LJJJLL(j, z, str3, str4, c03wo, c03py);
                InterfaceC838003Pe interfaceC838003Pe2 = this.LL;
                if (interfaceC838003Pe2 != null) {
                    boolean z2 = payResultEvent.isSuccess;
                    C03VQ.LIZ.getClass();
                    interfaceC838003Pe2.jM0(z2, C03VQ.LJIIJ(), string, payResultEvent.errorCode, null);
                }
                boolean zLJFF = Intrinsics.LJFF(payResultEvent.interrupter, "1");
                if (!payResultEvent.isSuccess && !zLJFF) {
                    C2341109Fh.LIZ("EC_PAY_RESULT fail: " + payResultEvent);
                    C897703f5 c897703f52 = this.LLILZIL;
                    if (c897703f52 != null && c897703f52.LJJIIJ) {
                        InterfaceC911103hF interfaceC911103hF = c897703f52.LJIILJJIL;
                        if (interfaceC911103hF != null) {
                            interfaceC911103hF.LJIIIZ(false);
                            return;
                        }
                        return;
                    }
                    if (C907803gi.LJIJ()) {
                        if (!payResultEvent.shouldHideError) {
                            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZ("ec_payment_error_dialog", C1741890vQh.LJIIIIZZ(new C03VO("", null, payResultEvent.pipoErrorAction)));
                            return;
                        }
                        return;
                    } else {
                        C842803Ra.LIZ.getClass();
                        C842803Ra.LIZJ(null, null);
                        return;
                    }
                }
                C03VQ.LIZ.getClass();
                if (C03VQ.LJIIJ()) {
                    if (!C0C64.LJIILLIIL().LJIIIZ(31744, "ecom_enable_poll_interrupted_payment", true, false) && zLJFF) {
                        return;
                    }
                    LIZJ(payResultEvent, null, string, zLJFF);
                    return;
                }
                return;
            }
            return;
        }
        if (Intrinsics.LJFF(str, "ec_payment_result_handler")) {
            try {
                Gson gsonLJFF2 = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ2 = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ2 != null && c1121904a9LIZIZ2.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(EcomPaymentInterceptor.PayResultEvent.class));
                } else {
                    type = new TypeToken<EcomPaymentInterceptor.PayResultEvent>() { // from class: X.03Ph
                    }.getType();
                }
                Object objFromJson2 = GsonProtectorUtils.fromJson(gsonLJFF2, str2, type);
                if (!(objFromJson2 instanceof EcomPaymentInterceptor.PayResultEvent)) {
                    objFromJson2 = null;
                }
                EcomPaymentInterceptor.PayResultEvent payResultEvent2 = (EcomPaymentInterceptor.PayResultEvent) objFromJson2;
                if (payResultEvent2 != null && (interfaceC838003Pe = this.LL) != null) {
                    boolean z3 = payResultEvent2.isSuccess;
                    String str5 = payResultEvent2.middlePageUrl;
                    if (str5 == null) {
                        str5 = this.LLILLL;
                    }
                    interfaceC838003Pe.XC(z3, str5, payResultEvent2.errorCode, payResultEvent2.mallAb, payResultEvent2.mallTab, payResultEvent2.mallSource, payResultEvent2.payType, payResultEvent2.shouldHideError, payResultEvent2.pipoErrorAction);
                }
            } catch (s e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
    }

    public final void LIZJ(EcomPaymentInterceptor.PayResultEvent payResultEvent, EcomPaymentInterceptor.CommonPayResultEvent commonPayResultEvent, String str, boolean z) {
        String str2;
        PaymentMethod paymentMethod;
        int i;
        C837903Pd c837903Pd;
        String str3;
        PaymentMethod paymentMethod2;
        PaymentInfo paymentInfo;
        this.LLIZ = payResultEvent;
        this.LLIZLLLIL = commonPayResultEvent;
        this.LLJ = str;
        String str4 = null;
        if (payResultEvent == null || (str2 = payResultEvent.payRequestId) == null) {
            if (commonPayResultEvent != null) {
                str2 = commonPayResultEvent.payRequestId;
            } else {
                str2 = null;
            }
        }
        GooglePayProcess googlePayProcess = GooglePayProcess.LIZ;
        C7873035r c7873035r = this.LLILZ;
        if (c7873035r != null && (paymentInfo = c7873035r.LJII) != null) {
            paymentMethod = paymentInfo.paymentMethod;
        } else {
            paymentMethod = null;
        }
        googlePayProcess.getClass();
        if (GooglePayProcess.LJIIIIZZ(paymentMethod)) {
            i = 2;
        } else {
            i = 0;
        }
        if (C03PN.LIZ && str2 != null && str2.length() != 0) {
            synchronized (C03PN.LIZIZ) {
                try {
                    C03PN.LIZ();
                    Map<String, C837903Pd> map = C03PN.LIZJ;
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("order_poll_");
                    sbLIZ.append(str2);
                    c837903Pd = (C837903Pd) ((LinkedHashMap) map).get(C2188811AlT.LIZIZ(sbLIZ));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } else {
            c837903Pd = null;
        }
        C7873035r c7873035r2 = this.LLILZ;
        String str5 = c7873035r2.LIZIZ;
        if (str5 == null) {
            if (c837903Pd != null) {
                str5 = c837903Pd.LIZ;
            } else {
                str5 = null;
            }
        }
        List<String> list = c7873035r2.LIZ;
        if (list == null) {
            if (c837903Pd != null) {
                list = c837903Pd.LIZIZ;
            } else {
                list = null;
            }
        }
        String str6 = c7873035r2.LIZLLL;
        if (str6 == null) {
            if (c837903Pd != null) {
                str4 = c837903Pd.LIZJ;
            }
            str6 = str4;
        }
        String str7 = c7873035r2.LJIIIZ;
        PaymentInfo paymentInfo2 = c7873035r2.LJII;
        if (paymentInfo2 == null || (paymentMethod2 = paymentInfo2.paymentMethod) == null || (str3 = paymentMethod2.id) == null) {
            str3 = "";
        }
        this.LLILZLL = new PollOrderStatusRequest(str5, list, 0, str6, str7, str3, Integer.valueOf(i), Integer.valueOf(z ? 1 : 0), null);
        LIZLLL();
    }

    public static void LJFF(C03PJ c03pj, C7873035r c7873035r, Boolean bool, String str, boolean z, String str2, int i) {
        String strLJI;
        String str3 = str;
        Boolean bool2 = bool;
        if ((i & 2) != 0) {
            bool2 = Boolean.FALSE;
        }
        String str4 = null;
        if ((i & 4) != 0) {
            str3 = null;
        }
        boolean zBooleanValue = false;
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            str2 = null;
        }
        c03pj.LLILZ = c7873035r;
        C03VQ.LIZ.getClass();
        C03VQ.LJIILIIL();
        boolean z2 = c7873035r.LJIIJ;
        long j = c7873035r.LJI;
        InterfaceC838003Pe interfaceC838003Pe = c03pj.LL;
        C03VQ.LJI = z2;
        C03VQ.LJFF = j;
        if (bool2 != null) {
            zBooleanValue = bool2.booleanValue();
        }
        C03VQ.LJIIJJI = zBooleanValue;
        if (str2 == null) {
            str2 = "normal_checkout";
        }
        C03VQ.LJIIL = str2;
        C03VQ.LIZLLL = c03pj;
        C03VQ.LJIILIIL = interfaceC838003Pe;
        if (!z) {
            C907803gi c907803gi = C907803gi.LIZ;
            String str5 = c7873035r.LIZIZ;
            List<String> list = c7873035r.LIZ;
            if (list != null) {
                str4 = (String) C13LP.LJJJLL(list);
            }
            PaymentInfo paymentInfo = c7873035r.LJII;
            Integer numValueOf = Integer.valueOf(Intrinsics.LJFF(c7873035r.LJ, Boolean.TRUE) ? 1 : 0);
            String str6 = c7873035r.LJFF;
            c907803gi.getClass();
            strLJI = C907803gi.LJI(str5, str4, "ordersubmit", paymentInfo, numValueOf, str6, bool2, null, str3);
        } else {
            C907803gi.LIZ.getClass();
            strLJI = C907803gi.LJFF;
        }
        c03pj.LLILLL = strLJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0093 A[PHI: r8
      0x0093: PHI (r8v1 java.lang.String) = (r8v0 java.lang.String), (r8v3 java.lang.String) binds: [B:27:0x0090, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJI(android.content.Context r22, java.lang.String r23, long r24, long r26, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r28, java.util.HashMap r29, java.lang.String r30, java.lang.String r31) {
        /*
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData r3 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData
            java.lang.Long r5 = java.lang.Long.valueOf(r24)
            java.lang.Long r6 = java.lang.Long.valueOf(r26)
            r7 = 0
            r2 = r28
            if (r2 == 0) goto L8f
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r2.paymentMethod
            if (r0 == 0) goto L8f
            java.lang.String r8 = r0.id
        L15:
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r2.paymentMethod
            if (r0 == 0) goto L93
            java.lang.String r9 = r0.LJJIIZ()
        L1d:
            r0 = 1
            java.lang.Integer r10 = java.lang.Integer.valueOf(r0)
            r1 = r29
            if (r1 == 0) goto L8d
            java.lang.String r0 = "entrance_info"
            java.util.HashMap r1 = X.C1741890vQh.LJ(r0, r1)
            if (r1 == 0) goto L8d
            java.lang.String r0 = "source_page_type"
            java.lang.Object r0 = r1.get(r0)
        L34:
            java.lang.String r11 = java.lang.String.valueOf(r0)
            if (r2 == 0) goto L8b
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r1 = r2.paymentMethod
            if (r1 == 0) goto L8b
            r0 = 0
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteInfo r0 = r1.LJJIIJ(r0)
            if (r0 == 0) goto L8b
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommuteType r12 = r0.commuteType
        L47:
            X.03VQ r0 = X.C03VQ.LIZ
            r0.getClass()
            long r0 = X.C03VQ.LJIILLIIL
            java.lang.Long r14 = java.lang.Long.valueOf(r0)
            long r0 = X.C03VQ.LJIIZILJ
            java.lang.Long r15 = java.lang.Long.valueOf(r0)
            long r0 = X.C03VQ.LJIJ
            java.lang.Long r16 = java.lang.Long.valueOf(r0)
            long r0 = X.C03VQ.LJIJI
            java.lang.Long r17 = java.lang.Long.valueOf(r0)
            long r0 = X.C03VQ.LJIJJ
            java.lang.Long r18 = java.lang.Long.valueOf(r0)
            long r0 = X.C03VQ.LJIJJLI
            java.lang.Long r19 = java.lang.Long.valueOf(r0)
            long r0 = X.C03VQ.LJIL
            java.lang.Long r20 = java.lang.Long.valueOf(r0)
            r21 = r31
            r13 = r30
            r4 = r23
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.0ymf r1 = X.C1323720kYE.LIZ(r22)
            java.lang.String r0 = X.C1741890vQh.LJIIIIZZ(r3)
            r1.LJIIIIZZ(r0, r4)
            return
        L8b:
            r12 = r7
            goto L47
        L8d:
            r0 = r7
            goto L34
        L8f:
            r8 = r7
            if (r2 == 0) goto L93
            goto L15
        L93:
            java.lang.String r9 = ""
            goto L1d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03PJ.LJI(android.content.Context, java.lang.String, long, long, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo, java.util.HashMap, java.lang.String, java.lang.String):void");
    }

    public static void LIZIZ(C03PJ c03pj, Context context, n nVar, String str, NewPayInfo newPayInfo, List list, String str2, PaymentInfo paymentInfo, boolean z, HashMap map, String str3, String str4, String str5, OneClickPayContext oneClickPayContext, String str6, String str7, InterfaceC911103hF interfaceC911103hF, InterfaceC877803bs interfaceC877803bs, Function1 function1, String str8, PaymentMethodsData paymentMethodsData, boolean z2, boolean z3, long j, String str9, boolean z4, int i) {
        String str10 = str4;
        String str11 = str5;
        HashMap map2 = map;
        boolean z5 = z4;
        String str12 = str9;
        long j2 = j;
        boolean z6 = z3;
        boolean z7 = z2;
        PaymentMethodsData paymentMethodsData2 = paymentMethodsData;
        String str13 = str8;
        Function1 function12 = function1;
        InterfaceC877803bs interfaceC877803bs2 = interfaceC877803bs;
        InterfaceC911103hF interfaceC911103hF2 = interfaceC911103hF;
        String str14 = str7;
        String str15 = str6;
        OneClickPayContext oneClickPayContext2 = oneClickPayContext;
        if ((i & 1024) != 0) {
            map2 = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            str10 = null;
        }
        if ((i & 8192) != 0) {
            str11 = null;
        }
        if ((i & 16384) != 0) {
            oneClickPayContext2 = null;
        }
        if ((32768 & i) != 0) {
            str15 = null;
        }
        if ((65536 & i) != 0) {
            str14 = null;
        }
        if ((131072 & i) != 0) {
            interfaceC911103hF2 = null;
        }
        if ((262144 & i) != 0) {
            interfaceC877803bs2 = null;
        }
        if ((524288 & i) != 0) {
            function12 = null;
        }
        if ((1048576 & i) != 0) {
            str13 = null;
        }
        if ((2097152 & i) != 0) {
            paymentMethodsData2 = null;
        }
        if ((4194304 & i) != 0) {
            z7 = false;
        }
        if ((8388608 & i) != 0) {
            z6 = false;
        }
        if ((16777216 & i) != 0) {
            j2 = 0;
        }
        if ((33554432 & i) != 0) {
            str12 = null;
        }
        if ((i & 67108864) != 0) {
            z5 = false;
        }
        c03pj.getClass();
        C03VQ c03vq = C03VQ.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c03vq.getClass();
        C03VQ.LJIIZILJ = jCurrentTimeMillis;
        C03PP c03pp = new C03PP(context);
        c03pp.LJI = nVar;
        c03pp.LJII = str;
        c03pp.LIZLLL = newPayInfo;
        c03pp.LIZIZ = list;
        c03pp.LIZJ = str2;
        c03pp.LJIIJ = "ordersubmit";
        c03pp.LJIIZILJ = str10;
        c03pp.LJIILJJIL = oneClickPayContext2;
        c03pp.LJ = interfaceC911103hF2;
        c03pp.LJIIIIZZ = paymentInfo;
        c03pp.LJIILIIL = Boolean.valueOf(z);
        HashMap<String, Object> map3 = new HashMap<>();
        if (map2 != null) {
            map3.putAll(map2);
        }
        c03pp.LJIIIZ = map3;
        c03pp.LJIIJJI = str3;
        c03pp.LJIIL = str11;
        c03pp.LJIILL = str15;
        c03pp.LJIILLIIL = str14;
        c03pp.LJFF = interfaceC877803bs2;
        c03pp.LJIJ = str13;
        c03pp.LJIJI = paymentMethodsData2;
        c03pp.LJIJJ = z7;
        c03pp.LJIJJLI = z6;
        c03pp.LJIL = j2;
        c03pp.LJJ = z5;
        C897703f5 c897703f5 = new C897703f5(c03pp);
        c03pj.LLILZIL = c897703f5;
        C03VQ.LJIIIIZZ = Boolean.valueOf(c897703f5.LJJIIJ);
        C03VQ.LJII = c897703f5.LJIILJJIL;
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C03PQ(function12, c897703f5, str12, null), 3);
    }
}
