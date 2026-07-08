package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.keva.Keva;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.CombinedSkuOrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.page.OrderSubmitActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.paycontroller.PaySchemaStoreParam;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcOrderPayStorageSchemaModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PostOrderSchema;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecmall.ECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.03VQ, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03VQ {
    public static boolean LIZIZ;
    public static boolean LIZJ;
    public static C03PJ LIZLLL;
    public static long LJFF;
    public static boolean LJI;
    public static InterfaceC911103hF LJII;
    public static String LJIIJ;
    public static boolean LJIIJJI;
    public static InterfaceC838003Pe LJIILIIL;
    public static boolean LJIILJJIL;
    public static long LJIILL;
    public static long LJIILLIIL;
    public static long LJIIZILJ;
    public static long LJIJ;
    public static long LJIJI;
    public static long LJIJJ;
    public static long LJIJJLI;
    public static long LJIL;
    public static boolean LJJ;
    public static String LJJI;
    public static final C03VQ LIZ = new C03VQ();
    public static int LJ = EnumC046700Ev.DEFAULT.getValue();
    public static Boolean LJIIIIZZ = Boolean.FALSE;
    public static final Map<String, PaySchemaStoreParam> LJIIIZ = new LinkedHashMap();
    public static String LJIIL = "normal_checkout";
    public static final C01GW LJJIFFI = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(548));
    public static final C843003Rc LJJII = new InterfaceC1164530gPT() { // from class: X.03Rc
        /* JADX WARN: Removed duplicated region for block: B:37:0x00da A[PHI: r2
          0x00da: PHI (r2v7 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData) = 
          (r2v6 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData)
          (r2v18 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData)
          (r2v18 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData)
         binds: [B:36:0x00d6, B:33:0x00d2, B:62:0x014a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:40:0x00df A[PHI: r2 r25
          0x00df: PHI (r2v9 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData) = 
          (r2v7 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData)
          (r2v10 com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResultTrackData)
         binds: [B:38:0x00dc, B:65:0x0152] A[DONT_GENERATE, DONT_INLINE]
          0x00df: PHI (r25v2 java.util.HashMap<java.lang.String, java.lang.Object>) = 
          (r25v0 java.util.HashMap<java.lang.String, java.lang.Object>)
          (r25v3 java.util.HashMap<java.lang.String, java.lang.Object>)
         binds: [B:38:0x00dc, B:65:0x0152] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:66:0x0154  */
        @Override // X.InterfaceC1164530gPT
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onEvent(java.lang.String r32, java.lang.String r33) throws org.json.JSONException {
            /*
                Method dump skipped, instruction units count: 568
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C843003Rc.onEvent(java.lang.String, java.lang.String):void");
        }
    };
    public static final C03VP LJJIII = new InterfaceC1164530gPT() { // from class: X.03VP
        /* JADX WARN: Removed duplicated region for block: B:154:0x0319 A[PHI: r7
          0x0319: PHI (r7v1 java.lang.String) = (r7v0 java.lang.String), (r7v4 java.lang.String), (r7v18 java.lang.String), (r7v19 java.lang.String) binds: [B:150:0x02fd, B:209:0x045f, B:74:0x015f, B:153:0x0315] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:156:0x031d  */
        /* JADX WARN: Removed duplicated region for block: B:166:0x033f  */
        /* JADX WARN: Removed duplicated region for block: B:169:0x035d  */
        /* JADX WARN: Removed duplicated region for block: B:171:0x0364  */
        /* JADX WARN: Removed duplicated region for block: B:173:0x036b  */
        /* JADX WARN: Removed duplicated region for block: B:175:0x0372  */
        /* JADX WARN: Removed duplicated region for block: B:177:0x0377  */
        /* JADX WARN: Removed duplicated region for block: B:179:0x037e  */
        /* JADX WARN: Removed duplicated region for block: B:181:0x0385  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x038c  */
        /* JADX WARN: Removed duplicated region for block: B:185:0x039b  */
        /* JADX WARN: Removed duplicated region for block: B:191:0x03c5  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x03c8  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0187  */
        @Override // X.InterfaceC1164530gPT
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onEvent(java.lang.String r23, java.lang.String r24) {
            /*
                Method dump skipped, instruction units count: 1156
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: X.C03VP.onEvent(java.lang.String, java.lang.String):void");
        }
    };

    public static void LJIIZILJ() {
        LJJ = true;
    }

    public static void LIZIZ() {
        LJIILL = 0L;
        LJIILLIIL = 0L;
        LJIIZILJ = 0L;
        LJIJ = 0L;
        LJIJI = 0L;
        LJIJJ = 0L;
        LJIJJLI = 0L;
        LJIL = 0L;
        LJJI = null;
    }

    public static boolean LJIIJ() {
        if (LJ != EnumC046700Ev.DEFAULT.getValue()) {
            return LJ == EnumC046700Ev.NEED_POLL.getValue();
        }
        C03P0.LIZ.getClass();
        return C03P0.LIZ() > 0;
    }

    public static void LJJ() {
        int i = LJ;
        EnumC046700Ev enumC046700Ev = EnumC046700Ev.DEFAULT;
        if (i == enumC046700Ev.getValue()) {
            LJ = ((Keva) LJJIFFI.getValue()).getInt("poll_order_from_server", enumC046700Ev.getValue());
        }
    }

    public static void LJIILIIL() {
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "ec_order_pay_event_register", true, false)) {
            if (!LIZJ) {
                LIZJ = true;
                ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_common_pay_result", LJJIII);
            }
            if (LIZIZ) {
                return;
            }
            LIZIZ = true;
            ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_order_pay_result_render", LJJII);
        }
    }

    public static boolean LIZ(String str) {
        boolean z;
        List<String> list;
        if (!Intrinsics.LJFF(str, "orderlist") && !Intrinsics.LJFF(str, "orderdetail")) {
            z = false;
        } else {
            z = true;
        }
        if (PipoCcdcAddCardRefreshConfigSettings.LIZ().sourceList != null && (!r0.isEmpty())) {
            if (!z && ((list = PipoCcdcAddCardRefreshConfigSettings.LIZ().sourceList) == null || !C13LP.LJJJJ(str, list))) {
                return false;
            }
        } else if (!z) {
            return false;
        }
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("pipo_tts_cashier_us_doublepay_direct_paymiddle", true)) {
            return false;
        }
        return true;
    }

    public static String LIZJ(String str) {
        Uri uri;
        AnonymousClass0317 anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin;
        String str2;
        HashMap<String, Object> map;
        Uri.Builder builderLJ;
        Uri uri2;
        Uri uriLIZ;
        boolean z;
        String name;
        Uri uri3;
        String strLIZIZ;
        if (str != null && (uri3 = UriProtector.parse(str)) != null && (strLIZIZ = C1942307jB.LIZIZ(uri3, "url")) != null) {
            uri = UriProtector.parse(strLIZIZ);
        } else {
            uri = null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin = ECommerceMallDependencyService.createIECommerceMallDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IECommerceMallDependencyService.class.getName();
            if (anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECommerceMallDependencyService.class);
        }
        if (((IECommerceMallDependencyService) anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin).hitTopTabExpExperiment()) {
            str2 = "homepage_mall";
        } else {
            str2 = "mall";
        }
        if (uri == null || (map = C1741890vQh.LIZJ(uri, "trackParams")) == null) {
            map = new HashMap<>();
        }
        map.put("enter_from", str2);
        if (uri != null) {
            builderLJ = C1976807ok.LJ(uri, new Pair("trackParams", C1741890vQh.LJIIIIZZ(map)));
        } else {
            builderLJ = null;
        }
        if (str == null || (uri2 = UriProtector.parse(str)) == null || (uriLIZ = C011J.LIZ(uri2, "url", String.valueOf(builderLJ))) == null) {
            return null;
        }
        return uriLIZ.toString();
    }

    public static void LJIILJJIL(List list) {
        String str;
        Object next;
        if (C03P7.LIZ()) {
            Iterator it2 = list.iterator();
            while (true) {
                str = null;
                if (it2.hasNext()) {
                    next = it2.next();
                    Integer num = ((PostOrderSchema) next).pageType;
                    int value = C03VS.MALL.getValue();
                    if (num != null && num.intValue() == value) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            PostOrderSchema postOrderSchema = (PostOrderSchema) next;
            if (postOrderSchema != null) {
                str = postOrderSchema.schema;
            }
            LJIIJ = str;
        }
    }

    public static void LJIJ(long j) {
        LJIL = j;
    }

    public static void LJIJI(String str) {
        LJJI = str;
    }

    public static void LJIJJ(long j) {
        LJIJI = j;
    }

    public static void LJIJJLI(long j) {
        LJIJ = j;
    }

    public static PaySchemaStoreParam LJ(String str, boolean z) {
        IECommerceHostService iECommerceHostService;
        Type type;
        boolean z2;
        String name;
        LJIILJJIL = false;
        PaySchemaStoreParam paySchemaStoreParam = (PaySchemaStoreParam) C7726030a.LIZ(str, LJIIIZ);
        if (z && paySchemaStoreParam == null) {
            LJIILJJIL = true;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("payment_code_key_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            String strValueOf = String.valueOf(C1323720kYE.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplication()).LIZ(strLIZIZ));
            try {
                Gson gsonLJFF = C1741890vQh.LJFF();
                C1120604Zw.LIZ.getClass();
                C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                if (c1121904a9LIZIZ != null && c1121904a9LIZIZ.LJII) {
                    type = C2371409Qy.LIZJ(C13LE.LJII(PaySchemaStoreParam.class));
                } else {
                    type = new TypeToken<PaySchemaStoreParam>() { // from class: X.03VT
                    }.getType();
                }
                Object objFromJson = GsonProtectorUtils.fromJson(gsonLJFF, strValueOf, type);
                if (!(objFromJson instanceof PaySchemaStoreParam)) {
                    objFromJson = null;
                }
                return (PaySchemaStoreParam) objFromJson;
            } catch (s e) {
                TryCatchGuardChecker.doCheck(e);
                return null;
            }
        }
        return paySchemaStoreParam;
    }

    public static String LJFF(int i, PaySchemaStoreParam paySchemaStoreParam) {
        List<PostOrderSchema> list;
        PostOrderSchema next;
        if (paySchemaStoreParam == null || (list = paySchemaStoreParam.postOrderSchemas) == null) {
            return null;
        }
        Iterator<PostOrderSchema> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Integer num = next.pageType;
                if (num != null && num.intValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PostOrderSchema postOrderSchema = next;
        if (postOrderSchema == null) {
            return null;
        }
        return postOrderSchema.schema;
    }

    public static String LJI(int i, String str) {
        List<PostOrderSchema> list;
        PostOrderSchema next;
        PaySchemaStoreParam paySchemaStoreParam = (PaySchemaStoreParam) C7726030a.LIZ(str, LJIIIZ);
        if (paySchemaStoreParam == null || (list = paySchemaStoreParam.postOrderSchemas) == null) {
            return null;
        }
        Iterator<PostOrderSchema> it2 = list.iterator();
        while (true) {
            if (it2.hasNext()) {
                next = it2.next();
                Integer num = next.pageType;
                if (num != null && num.intValue() == i) {
                    break;
                }
            } else {
                next = null;
                break;
            }
        }
        PostOrderSchema postOrderSchema = next;
        if (postOrderSchema == null) {
            return null;
        }
        return postOrderSchema.schema;
    }

    public static void LJIIIIZZ(String str, String str2, String str3, PaySchemaStoreParam paySchemaStoreParam) {
        String str4;
        String string;
        Integer num;
        try {
            C03VQ c03vq = LIZ;
            int value = C03VS.PAY_SUCCESS.getValue();
            c03vq.getClass();
            String str5 = null;
            final String strLIZLLL = LIZLLL(value, "success", str, null, paySchemaStoreParam);
            if (strLIZLLL != null) {
                C786410Ut5.LJLIIL(C03VW.LIZ().delayTime, new BPEAHandler(Looper.getMainLooper()), new Runnable() { // from class: X.03VR
                    public final void LIZ() {
                        IECommerceHostService iECommerceHostService;
                        IECommerceHostService iECommerceHostService2;
                        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
                        Context context;
                        C928103jz[] c928103jzArrLIZ;
                        C03VQ c03vq2 = C03VQ.LIZ;
                        String str6 = strLIZLLL;
                        c03vq2.getClass();
                        ArrayList arrayList = new ArrayList();
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                            C1AQS.LIZJ(jElapsedRealtime, 1, IApplicationDependencyService.class.getName(), iECommerceHostService != null ? iECommerceHostService.getClass().getName() : null, iECommerceHostService != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                        }
                        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
                        if (rootPageMonitor != null && (c928103jzArrLIZ = rootPageMonitor.LIZ()) != null) {
                            for (C928103jz c928103jz : c928103jzArrLIZ) {
                                Object obj = c928103jz.LIZLLL;
                                if (obj instanceof Activity) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                        Collections.reverse(arrayList);
                        if ((C13LP.LJJJLZIJ(0, arrayList) instanceof CombinedSkuOrderSubmitActivity) || (((C13LP.LJJJLZIJ(0, arrayList) instanceof OrderSubmitActivity) && C03VQ.LJI) || C03VQ.LJJ)) {
                            arrayList.remove(ListProtector.get(arrayList, 0));
                        }
                        if (C03VQ.LJJ) {
                            C03VQ.LJJ = false;
                        }
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            iECommerceHostService2 = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                            C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            iECommerceHostService2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                        }
                        Context applicationContext = ((IApplicationDependencyService) iECommerceHostService2).getApplicationContext();
                        if (arrayList.size() >= 1 && (context = (Context) C13LP.LJJJLZIJ(0, arrayList)) != null) {
                            applicationContext = context;
                        }
                        C03VQ.LJIL = System.currentTimeMillis();
                        C03O0.LIZ.getClass();
                        C03O0.LJJIZ(null, null, null);
                        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(applicationContext, str6);
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                            C1AQS.LIZJ(jElapsedRealtime3, 1, IComplianceDependencyService.class.getName(), anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
                        }
                        smartRouteBuildRoute.withParam(((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402681857"));
                        smartRouteBuildRoute.open();
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        boolean zLIZ;
                        C1C7U.LIZ("EcPayManager@acd.gotoPayHalfSuccessPage$1$1$1");
                        try {
                            LIZ();
                        } finally {
                            if (!zLIZ) {
                            }
                        }
                        C1C7U.LIZIZ("EcPayManager@acd.gotoPayHalfSuccessPage$1$1$1");
                    }
                });
                C03O0 c03o0 = C03O0.LIZ;
                if (paySchemaStoreParam != null && Intrinsics.LJFF(paySchemaStoreParam.fromSecondPay, Boolean.TRUE)) {
                    str4 = "orderlist";
                } else {
                    str4 = "ordersubmit";
                }
                String str6 = LJIIL;
                if (paySchemaStoreParam != null && (num = paySchemaStoreParam.mallAb) != null) {
                    string = num.toString();
                } else {
                    string = null;
                }
                if (paySchemaStoreParam != null) {
                    str5 = paySchemaStoreParam.paymentMethodId;
                }
                c03o0.getClass();
                C03O0.LJJLJ(str4, str6, string, "success", null, str3, str2, str5, strLIZLLL);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIL(java.lang.String r18, java.lang.String r19, java.lang.String r20, com.ss.android.ugc.aweme.ecommerce.base.osp.paycontroller.PaySchemaStoreParam r21) {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03VQ.LJIL(java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.paycontroller.PaySchemaStoreParam):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x00c1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZLLL(int r11, java.lang.String r12, java.lang.String r13, java.lang.String r14, com.ss.android.ugc.aweme.ecommerce.base.osp.paycontroller.PaySchemaStoreParam r15) {
        /*
            java.lang.String r10 = LJFF(r11, r15)
            r2 = 1
            java.lang.String r4 = "pay_result"
            java.lang.String r6 = "source_btm_token"
            java.lang.String r7 = "pay_route"
            java.lang.String r8 = "payment_status"
            r5 = 3
            java.lang.String r3 = "url"
            r1 = 0
            if (r10 == 0) goto Lc5
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r10)
            if (r0 == 0) goto Lc1
            java.lang.String r0 = X.C1942307jB.LIZIZ(r0, r3)
            if (r0 == 0) goto Lc1
            android.net.Uri r9 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            if (r9 == 0) goto Lc1
            kotlin.Pair[] r5 = new kotlin.Pair[r5]
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r8, r12)
            r5[r1] = r0
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r7, r13)
            r5[r2] = r0
            if (r15 == 0) goto Lbe
            java.lang.String r0 = r15.btmToken
        L39:
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r6, r0)
            r0 = 2
            r5[r0] = r1
            android.net.Uri$Builder r5 = X.C1976807ok.LIZ(r9, r5)
            if (r5 == 0) goto Lc1
            X.03VS r0 = X.C03VS.ORDER_DETAIL
            int r0 = r0.getValue()
            if (r11 != r0) goto L65
            kotlin.Pair[] r9 = new kotlin.Pair[r2]
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResult r0 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResult
            r0.<init>(r12, r14)
            java.lang.String r0 = X.C1741890vQh.LJIIIIZZ(r0)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r4, r0)
            r0 = 0
            r9[r0] = r1
            X.C1976807ok.LIZJ(r5, r9)
        L65:
            android.net.Uri r1 = com.bytedance.mt.protector.impl.UriProtector.parse(r10)
            if (r1 == 0) goto Lc5
            java.lang.String r0 = java.lang.String.valueOf(r5)
            android.net.Uri r5 = X.C011J.LIZ(r1, r3, r0)
            if (r5 == 0) goto Lc5
            r0 = 3
            kotlin.Pair[] r3 = new kotlin.Pair[r0]
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r8, r12)
            r0 = 0
            r3[r0] = r1
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r7, r13)
            r3[r2] = r0
            if (r15 == 0) goto Lbc
            java.lang.String r0 = r15.btmToken
        L8b:
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r6, r0)
            r0 = 2
            r3[r0] = r1
            android.net.Uri$Builder r3 = X.C1976807ok.LIZ(r5, r3)
            if (r3 == 0) goto Lc5
            X.03VS r0 = X.C03VS.ORDER_DETAIL
            int r0 = r0.getValue()
            if (r11 != r0) goto Lb7
            kotlin.Pair[] r2 = new kotlin.Pair[r2]
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResult r0 = new com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResult
            r0.<init>(r12, r14)
            java.lang.String r0 = X.C1741890vQh.LJIIIIZZ(r0)
            kotlin.Pair r1 = new kotlin.Pair
            r1.<init>(r4, r0)
            r0 = 0
            r2[r0] = r1
            X.C1976807ok.LIZJ(r3, r2)
        Lb7:
            java.lang.String r0 = r3.toString()
            return r0
        Lbc:
            r0 = 0
            goto L8b
        Lbe:
            r0 = 0
            goto L39
        Lc1:
            r5 = 0
            if (r10 == 0) goto Lc5
            goto L65
        Lc5:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C03VQ.LIZLLL(int, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.paycontroller.PaySchemaStoreParam):java.lang.String");
    }

    public static void LJIIIZ(String str, String str2, String str3, String str4, PaySchemaStoreParam paySchemaStoreParam) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        IECommerceHostService iECommerceHostService;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        String str5;
        String string;
        Integer num;
        boolean z;
        String name;
        boolean z2;
        String name2;
        boolean z3;
        String name3;
        try {
            C03VQ c03vq = LIZ;
            int value = C03VS.PAY_SUCCESS.getValue();
            c03vq.getClass();
            String str6 = null;
            String strLIZLLL = LIZLLL(value, str, str2, null, paySchemaStoreParam);
            if (strLIZLLL != null) {
                LJIL = System.currentTimeMillis();
                C03O0.LIZ.getClass();
                C03O0.LJJIZ(str3, str4, str);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String name4 = IBusinessDependencyService.class.getName();
                    if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                        name3 = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name3 = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name4, name3, z3);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
                }
                IBusinessDependencyService iBusinessDependencyService = (IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                    IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                    if (iECommerceHostService2 != null) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    String name5 = IApplicationDependencyService.class.getName();
                    if (iECommerceHostService2 != null) {
                        name2 = iECommerceHostService2.getClass().getName();
                    } else {
                        name2 = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name2, z2);
                    iECommerceHostService = (IECommerceHostService) service;
                } else {
                    C1120604Zw.LIZ.LIZ();
                    iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                }
                Context applicationContext = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name6 = IComplianceDependencyService.class.getName();
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
                }
                iBusinessDependencyService.bulletStart(applicationContext, strLIZLLL, null, ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402681857"));
                if (paySchemaStoreParam == null || !Intrinsics.LJFF(paySchemaStoreParam.fromSecondPay, Boolean.TRUE)) {
                    str5 = "ordersubmit";
                } else {
                    str5 = "orderlist";
                }
                String str7 = LJIIL;
                if (paySchemaStoreParam != null && (num = paySchemaStoreParam.mallAb) != null) {
                    string = num.toString();
                } else {
                    string = null;
                }
                if (paySchemaStoreParam != null) {
                    str6 = paySchemaStoreParam.paymentMethodId;
                }
                C03O0.LJJLJ(str5, str7, string, str, null, str4, str3, str6, strLIZLLL);
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJII(String str, String str2, String str3, String str4, String str5, PaySchemaStoreParam paySchemaStoreParam) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        IECommerceHostService iECommerceHostService;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        String str6;
        String str7;
        Integer num;
        boolean z;
        String name;
        boolean z2;
        String name2;
        boolean z3;
        String name3;
        try {
            if (!LJIIJJI) {
                LIZ.getClass();
                if (!LJIIJ() && !C836003Ok.LIZ()) {
                    C03VQ c03vq = LIZ;
                    int value = C03VS.ORDER_DETAIL.getValue();
                    c03vq.getClass();
                    String strLIZLLL = LIZLLL(value, str, str2, str3, paySchemaStoreParam);
                    if (strLIZLLL != null) {
                        String string = null;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            String name4 = IBusinessDependencyService.class.getName();
                            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                                name3 = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
                            } else {
                                name3 = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime, 1, name4, name3, z3);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
                        }
                        IBusinessDependencyService iBusinessDependencyService = (IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                            Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                            IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                            if (iECommerceHostService2 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            String name5 = IApplicationDependencyService.class.getName();
                            if (iECommerceHostService2 != null) {
                                name2 = iECommerceHostService2.getClass().getName();
                            } else {
                                name2 = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime2, 1, name5, name2, z2);
                            iECommerceHostService = (IECommerceHostService) service;
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
                        }
                        Context applicationContext = ((IApplicationDependencyService) iECommerceHostService).getApplicationContext();
                        if (C034S.LIZ()) {
                            C1120604Zw.LIZ.LIZ();
                            long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            String name6 = IComplianceDependencyService.class.getName();
                            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                                name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
                            } else {
                                name = null;
                            }
                            C1AQS.LIZJ(jElapsedRealtime3, 1, name6, name, z);
                        } else {
                            C1120604Zw.LIZ.LIZ();
                            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
                        }
                        iBusinessDependencyService.bulletStart(applicationContext, strLIZLLL, null, ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402681857"));
                        C03O0 c03o0 = C03O0.LIZ;
                        if (paySchemaStoreParam != null && Intrinsics.LJFF(paySchemaStoreParam.fromSecondPay, Boolean.TRUE)) {
                            str6 = "orderlist";
                        } else {
                            str6 = "ordersubmit";
                        }
                        String str8 = LJIIL;
                        if (paySchemaStoreParam != null && (num = paySchemaStoreParam.mallAb) != null) {
                            string = num.toString();
                        } else {
                            if (paySchemaStoreParam == null) {
                                str7 = null;
                            }
                            c03o0.getClass();
                            C03O0.LJJLJ(str6, str8, string, str, str3, str5, str4, str7, strLIZLLL);
                        }
                        str7 = paySchemaStoreParam.paymentMethodId;
                        c03o0.getClass();
                        C03O0.LJJLJ(str6, str8, string, str, str3, str5, str4, str7, strLIZLLL);
                    }
                }
            }
        } catch (CancellationException e) {
            TryCatchGuardChecker.doCheck(e);
            throw e;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static void LJIIJJI(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        PaySchemaStoreParam paySchemaStoreParamLJ = LJ(str, z);
        if (z2) {
            if (z3) {
                LJIIIIZZ(null, str, str2, paySchemaStoreParamLJ);
                return;
            } else {
                LJII("fail", "h5", str3, str, str2, paySchemaStoreParamLJ);
                return;
            }
        }
        if (LJI) {
            LJIIIIZZ("h5", str, str2, paySchemaStoreParamLJ);
            return;
        }
        if (LJIL("h5", str, str2, paySchemaStoreParamLJ)) {
            return;
        }
        C928203k0 c928203k0 = C928203k0.LIZ;
        String str4 = LJIIL;
        c928203k0.getClass();
        if (C928203k0.LJIILJJIL(str4)) {
            LJIIIIZZ("h5", str, str2, paySchemaStoreParamLJ);
        } else {
            LJIIIZ("success", "h5", str, str2, paySchemaStoreParamLJ);
        }
    }

    public static void LJIILL(String str, List list, String str2, Object obj, boolean z, String str3) {
        Integer num;
        boolean z2;
        IECommerceHostService iECommerceHostService;
        String name = null;
        if (obj instanceof Integer) {
            num = (Integer) obj;
        } else {
            num = null;
        }
        PaySchemaStoreParam paySchemaStoreParam = new PaySchemaStoreParam(list, str2, num, Boolean.valueOf(z), str3);
        LJIIIZ.put(str, paySchemaStoreParam);
        boolean zLIZ = C19373510qr.LIZ(str2);
        C01GW c01gw = C03VV.LIZIZ;
        boolean z3 = false;
        if (((EcOrderPayStorageSchemaModel) c01gw.getValue()).enable) {
            List<String> list2 = ((EcOrderPayStorageSchemaModel) c01gw.getValue()).blackPaymentMethods;
            if (str2 != null && str2.length() != 0 && list2 != null && !list2.isEmpty() && (!(list2 instanceof Collection) || !list2.isEmpty())) {
                Iterator<String> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (u.LJJIIJZLJL(str2, it2.next(), false)) {
                        z2 = false;
                        break;
                    }
                }
            }
            z2 = true;
        } else {
            z2 = false;
            break;
        }
        if (zLIZ || z2) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("payment_code_key_");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z3 = true;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            C1323720kYE.LIZ(((IApplicationDependencyService) iECommerceHostService).getApplication()).LJIIIIZZ(C1741890vQh.LJIIIIZZ(paySchemaStoreParam), strLIZIZ);
        }
    }
}
