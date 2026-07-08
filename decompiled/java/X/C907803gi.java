package X;

import Y.ACListenerS105S0200000_1;
import Y.ARunnableS1S2200000_1;
import Y.ARunnableS70S0200000_1;
import Y.AfS0S0100100_1;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tux.input.TuxTextView;
import com.bytedance.tux.sheet.sheet.TuxSheet;
import com.ss.android.ugc.aweme.ecommerce.api.model.DialogButton;
import com.ss.android.ugc.aweme.ecommerce.base.oneclickpay.OneClickPayContext;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.EcPipoPollingConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PaymentSyncPayResultOptimizationConfig;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoCcdcAddCardRefreshConfigSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoPaymentFailedPopupMessage;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.AgreementConfiguration;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.CommonRetainDisplayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.EcUploadPayInfoRequest;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.HeaderBlock;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MaterialCollectionInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.MerchantOperationAdvicePrompt;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayErrorToast;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PayResult;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethodsData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentGuideFragment;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.generalpostpayment.GeneralPostPaymentGuideModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.view.PaymentTransitionActivity;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.MainOrderInfo;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.PackedSku;
import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.ShopOrderNew;
import com.ss.android.ugc.aweme.ecommerce.core.router.EcomPaymentInterceptor;
import com.ss.android.ugc.aweme.ecommerce.dependency.ActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.business.BusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.ecmall.ECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.dependency.location.LocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.IBusinessDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.activitystack.IActivityStackDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.ecmall.IECommerceMallDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.location.ILocationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IEventCenter;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoAccountService;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import com.ss.android.ugc.aweme.pipo.PipoPackageDiffSPI;
import com.zhiliaoapp.musically.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.AFwS228S0000000_1;
import kotlin.jvm.internal.AwS18S1100100_1;
import kotlin.jvm.internal.AwS1S1300100_1;
import kotlin.jvm.internal.AwS28S1110000_1;
import kotlin.jvm.internal.AwS37S0500000_1;
import kotlin.jvm.internal.AwS402S0200000_1;
import kotlin.jvm.internal.AwS545S0100000_1;
import kotlin.jvm.internal.AwS580S0100000_1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03gi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C907803gi {
    public static C908003gk LIZIZ;
    public static InterfaceC420801kM LIZJ;
    public static InterfaceC911103hF LJ;
    public static final boolean LJII;
    public static DialogC1389620mGW LJIIIIZZ;
    public static final C01GW LJIIIZ;
    public static Function0<Unit> LJIIJ;
    public static Function0<Unit> LJIIJJI;
    public static final C909903h3 LJIIL;
    public static final C909103gv LJIILIIL;
    public static final C907803gi LIZ = new C907803gi();
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(false);
    public static final String LJFF = "aweme://ec/pay/mini_osp_pay_result";
    public static final String LJI = "aweme://ec/pay/mini_osp_pay_result?payment_status=quit";

    /* JADX WARN: Type inference failed for: r0v10, types: [X.03h3] */
    /* JADX WARN: Type inference failed for: r0v11, types: [X.03gv] */
    static {
        SettingsManager.LIZLLL().getClass();
        LJII = SettingsManager.LIZ("ec_pay_result_use_spark", false);
        LJIIIZ = C452501pT.LIZIZ(AFwS185S0000000_1.get$arr$(94));
        LJIIL = new InterfaceC1164530gPT() { // from class: X.03h3
            @Override // X.InterfaceC1164530gPT
            public final void onEvent(String str, String str2) {
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receive pin free event ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                Function0<Unit> function0 = C907803gi.LJIIJ;
                if (function0 != null) {
                    function0.invoke();
                }
                C907803gi.LIZ.getClass();
                C907803gi.LJIIJ = null;
                ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZJ("ec_pipo_pin_free_exit", C907803gi.LJIIL);
            }
        };
        LJIILIIL = new InterfaceC1164530gPT() { // from class: X.03gv
            @Override // X.InterfaceC1164530gPT
            public final void onEvent(String str, String str2) {
                String strOptString;
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("receive guide exit event ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZ(strLIZIZ);
                Function0<Unit> function0 = C907803gi.LJIIJJI;
                if (function0 != null) {
                    function0.invoke();
                }
                C907803gi.LIZ.getClass();
                C907803gi.LJIIJJI = null;
                IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
                if (iEventCenter != null) {
                    iEventCenter.LIZJ("ec_checkout_guide_exit", C907803gi.LJIILIIL);
                }
                try {
                    strOptString = new JSONObject(str2).optString("action_type");
                    if (strOptString == null) {
                        strOptString = "";
                    }
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                    strOptString = "exception";
                }
                C834803Ny.LIZ("post_pay_receive_exit", null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, strOptString, null, -4, 191);
            }
        };
    }

    public static InterfaceC497601wk LJ() {
        return (InterfaceC497601wk) LJIIIZ.getValue();
    }

    public static boolean LJIJ() {
        SettingsManager.LIZLLL().getClass();
        return SettingsManager.LJ("ec_payment_failed_message_type", 1) == 2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(18:873|(1:889)(1:877)|878|(1:888)(1:882)|883|(2:885|(3:891|(1:893)|894))|895|(1:897)(2:(0)(2:908|(9:910|(1:918)(1:914)|915|(2:917|919)(1:920)|921|(2:923|(4:925|(1:927)|928|(3:930|(5:932|(1:934)(1:935)|936|(1:938)(1:940)|939)(1:941)|942)))|943|1013|944)(0))|951)|1002|899|1006|900|(1:902)|905|(1:907)|908|(0)(0)|951) */
    /* JADX WARN: Code restructure failed: missing block: B:903:0x14d8, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:946:0x15eb, code lost:
    
        r1 = th;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x0554 A[PHI: r2
      0x0554: PHI (r2v218 X.19EG) = (r2v217 X.19EG), (r2v227 X.19EG) binds: [B:255:0x0508, B:273:0x0552] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05ef A[PHI: r2
      0x05ef: PHI (r2v203 X.19EG) = (r2v202 X.19EG), (r2v212 X.19EG) binds: [B:290:0x05a3, B:308:0x05ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0742  */
    /* JADX WARN: Removed duplicated region for block: B:368:0x0764  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x077e  */
    /* JADX WARN: Removed duplicated region for block: B:382:0x07bb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:397:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:403:0x085b  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x095e A[FALL_THROUGH] */
    /* JADX WARN: Removed duplicated region for block: B:443:0x097a  */
    /* JADX WARN: Removed duplicated region for block: B:446:0x0991  */
    /* JADX WARN: Removed duplicated region for block: B:456:0x09cd  */
    /* JADX WARN: Removed duplicated region for block: B:498:0x0ade  */
    /* JADX WARN: Removed duplicated region for block: B:501:0x0af3  */
    /* JADX WARN: Removed duplicated region for block: B:526:0x0b73  */
    /* JADX WARN: Removed duplicated region for block: B:529:0x0b79  */
    /* JADX WARN: Removed duplicated region for block: B:545:0x0bac  */
    /* JADX WARN: Removed duplicated region for block: B:548:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:555:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:556:0x0c20  */
    /* JADX WARN: Removed duplicated region for block: B:557:0x0c23  */
    /* JADX WARN: Removed duplicated region for block: B:560:0x0c2a  */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0c2d  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0c3d  */
    /* JADX WARN: Removed duplicated region for block: B:609:0x0d71 A[PHI: r3
      0x0d71: PHI (r3v81 java.lang.String) = (r3v80 java.lang.String), (r3v104 java.lang.String) binds: [B:607:0x0d6d, B:494:0x0ab0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:710:0x1026  */
    /* JADX WARN: Removed duplicated region for block: B:910:0x14ed A[Catch: all -> 0x15eb, TryCatch #5 {all -> 0x15eb, blocks: (B:900:0x14cc, B:905:0x14db, B:907:0x14df, B:908:0x14e5, B:910:0x14ed, B:912:0x14f3, B:914:0x14f7, B:915:0x14f9, B:921:0x1507, B:923:0x1516, B:925:0x1552, B:927:0x1556, B:928:0x1561, B:930:0x1565, B:932:0x156b, B:936:0x157f, B:938:0x1589, B:939:0x1591, B:942:0x15a6, B:941:0x1598, B:943:0x15af), top: B:1006:0x14cc }] */
    /* JADX WARN: Removed duplicated region for block: B:920:0x1505  */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.03gn] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v27 */
    /* JADX WARN: Type inference failed for: r7v35, types: [T, java.lang.String] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIJJLI(final X.C897703f5 r92, java.lang.String r93, boolean r94) {
        /*
            Method dump skipped, instruction units count: 5860
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907803gi.LJIJJLI(X.03f5, java.lang.String, boolean):void");
    }

    public static AtomicBoolean LIZLLL() {
        return LIZLLL;
    }

    public static String LJFF() {
        return LJFF;
    }

    public static InterfaceC911103hF LJIIIIZZ() {
        return LJ;
    }

    public static boolean LIZ(Context context) {
        IECommerceHostService iECommerceHostService;
        C928103jz top;
        boolean z;
        String name;
        if (context == null || C1388190mED.LIZIZ(context) == null) {
            Object obj = null;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null) {
                obj = top.LIZLLL;
            }
            if (!(obj instanceof C19EG) || obj == null) {
                return false;
            }
        }
        if (PluggableExtentionKt.pluggableSpi$default(IPipoAccountService.class, false, false, false, 14, null) != null) {
            return true;
        }
        return false;
    }

    public static String LIZIZ(JSONObject jSONObject) {
        Object c098200Yq;
        if (jSONObject != null) {
            try {
                c098200Yq = C09RB.LJIILLIIL(C09R4.LIZIZ(jSONObject.keys()), "&", null, null, new AwS580S0100000_1(jSONObject, 193), 30);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = "";
            }
            String str = (String) c098200Yq;
            if (str != null) {
                return str;
            }
        }
        return "";
    }

    public static String LIZJ(String str) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        String str2 = C03PU.LJ().schema;
        if (str2 == null) {
            PipoPackageDiffSPI pipoPackageDiffSPI = (PipoPackageDiffSPI) PluggableExtentionKt.pluggableSpi$default(PipoPackageDiffSPI.class, false, false, false, 14, null);
            if (pipoPackageDiffSPI != null) {
                pipoPackageDiffSPI.LIZIZ();
                str2 = "snssdk1180";
            } else {
                str2 = null;
            }
        }
        sbLIZ.append(str2);
        sbLIZ.append("://ec/order/middle_page");
        Uri.Builder builderLIZ = C1976807ok.LIZ(UriProtector.parse(C2188811AlT.LIZIZ(sbLIZ)), new Pair("url", str));
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ecom_deep_link_spark", false)) {
            C1976807ok.LIZJ(builderLIZ, new Pair("use_spark", "1"));
        }
        return String.valueOf(builderLIZ);
    }

    public static final String LJIL(String str) {
        if (C123100dR.LIZ(str)) {
            return C1976807ok.LIZ(UriProtector.parse(str), new Pair("payment_status", "paying")).toString();
        }
        return str;
    }

    public static final String LJJ(C897703f5 c897703f5) {
        Uri.Builder builderLIZ;
        Uri uri;
        Uri uriLIZ;
        Uri.Builder builderLIZ2;
        String string;
        Uri uri2;
        String strLIZIZ;
        Uri uri3;
        String str = c897703f5.LJIILIIL;
        if (str != null && (uri2 = UriProtector.parse(str)) != null && (strLIZIZ = C1942307jB.LIZIZ(uri2, "url")) != null && (uri3 = UriProtector.parse(strLIZIZ)) != null) {
            builderLIZ = C1976807ok.LIZ(uri3, new Pair("payment_status", "paying"), new Pair("pay_result", C1741890vQh.LJIIIIZZ(new PaymentResult("paying", null))));
        } else {
            builderLIZ = null;
        }
        String str2 = c897703f5.LJIILIIL;
        if (str2 == null || (uri = UriProtector.parse(str2)) == null || (uriLIZ = C011J.LIZ(uri, "url", String.valueOf(builderLIZ))) == null || (builderLIZ2 = C1976807ok.LIZ(uriLIZ, new Pair("payment_status", "paying"), new Pair("pay_result", C1741890vQh.LJIIIIZZ(new PaymentResult("paying", null))))) == null || (string = builderLIZ2.toString()) == null) {
            return "";
        }
        return string;
    }

    public static final boolean LJJI(String str) {
        boolean z;
        List<String> list;
        if (!Intrinsics.LJFF(str, "orderlist") && !Intrinsics.LJFF(str, "orderdetail")) {
            z = false;
        } else {
            z = true;
        }
        if (PipoCcdcAddCardRefreshConfigSettings.LIZ().sourceList != null && (!r0.isEmpty())) {
            if (!z && ((list = PipoCcdcAddCardRefreshConfigSettings.LIZ().sourceList) == null || !list.contains(str))) {
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

    public static void LJJJJI(InterfaceC877803bs interfaceC877803bs) {
        if (LJIJ()) {
            if (interfaceC877803bs != null) {
                interfaceC877803bs.onDismiss();
                return;
            }
            return;
        }
        try {
            DialogC1389620mGW dialogC1389620mGW = LJIIIIZZ;
            if (dialogC1389620mGW != null) {
                dialogC1389620mGW.dismiss();
                C785410UrT.LIZ(dialogC1389620mGW);
            }
            LJIIIIZZ = null;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public static String LJJJJZ(String str) {
        int iHashCode = str.hashCode();
        if (iHashCode != -1747807002) {
            if (iHashCode != -390864660) {
                if (iHashCode == 2103471391 && str.equals("orderdetail")) {
                    return "order_detail";
                }
                return "";
            }
            if (str.equals("orderlist")) {
                return "ecommerce_centre_page";
            }
            return "";
        }
        if (str.equals("ordersubmit")) {
            return "order_submit";
        }
        return "";
    }

    public static void LJJJJZI(Function0 function0) {
        LJIIJJI = function0;
        IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
        if (iEventCenter != null) {
            iEventCenter.LIZLLL("ec_checkout_guide_exit", LJIILIIL);
        }
    }

    public static void LJJJZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("popup_name", "blik_expired");
        linkedHashMap.put("button_name", str);
        C1018703yb.LIZIZ("tiktokec_popup_click", linkedHashMap);
    }

    public static void LJIILL(EcUploadPayInfoRequest ecUploadPayInfoRequest, C897703f5 c897703f5) {
        String str;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (ecUploadPayInfoRequest.actionInfo == null) {
            C900403fW c900403fW = new C900403fW();
            C898003f8 c898003f8 = c897703f5.LJIJ;
            if (c898003f8 != null) {
                str = c898003f8.LJIIJJI;
            } else {
                str = null;
            }
            c900403fW.LIZ = new C901203fe(str);
            ecUploadPayInfoRequest.actionInfo = c900403fW.toString();
        }
        InterfaceC907103gb.LIZ.getClass();
        ((InterfaceC907103gb) C907003ga.LIZIZ.create(InterfaceC907103gb.class)).LIZJ(ecUploadPayInfoRequest).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS0S0100100_1(c897703f5, jCurrentTimeMillis, 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x042b  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:255:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0312 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [android.app.Activity] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static kotlin.Pair[] LJIJI(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData r24, java.util.Map r25) {
        /*
            Method dump skipped, instruction units count: 1261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907803gi.LJIJI(com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.BillInfoData, java.util.Map):kotlin.Pair[]");
    }

    public static final boolean LJIJJ(BillInfoData billInfoData, int i) {
        List<ShopOrderNew> list;
        List<PackedSku> list2;
        if (i == 7 && billInfoData != null && (list = billInfoData.newShopOrders) != null) {
            Iterator<ShopOrderNew> it2 = list.iterator();
            while (it2.hasNext()) {
                List<MainOrderInfo> list3 = it2.next().mainOrderInfos;
                if (list3 != null) {
                    for (MainOrderInfo mainOrderInfo : list3) {
                        if (C7806033c.LJIJI(mainOrderInfo) && (list2 = mainOrderInfo.packedSkus) != null && !list2.isEmpty()) {
                            Iterator<PackedSku> it3 = list2.iterator();
                            while (it3.hasNext()) {
                                Integer num = it3.next().bizType;
                                if (num != null && num.intValue() == 2) {
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean LJJII(boolean z, C897703f5 c897703f5) {
        String str;
        PaymentMethod paymentMethod;
        if (z) {
            PaymentSyncPayResultOptimizationConfig.PaymentSyncPayResultOptimizationConfigModel paymentSyncPayResultOptimizationConfigModel = PaymentSyncPayResultOptimizationConfig.LIZ;
            PaymentInfo paymentInfo = c897703f5.LJI;
            if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                str = paymentMethod.id;
            } else {
                str = null;
            }
            if (PaymentSyncPayResultOptimizationConfig.LIZ(str)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static void LJJJJ(Context context, String str) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        boolean z2;
        String name2;
        C03VQ c03vq = C03VQ.LIZ;
        long jCurrentTimeMillis = System.currentTimeMillis();
        c03vq.getClass();
        C03VQ.LJIL = jCurrentTimeMillis;
        C03O0.LIZ.getClass();
        C03O0.LJJIZ(null, null, null);
        HashMap map = new HashMap();
        map.put("payment_status", "success");
        map.put("pay_route", "h5");
        String string = C919503ib.LIZLLL(str, map).toString();
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        IBusinessDependencyService iBusinessDependencyService = (IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IComplianceDependencyService.class.getName();
            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
        }
        iBusinessDependencyService.bulletStart(context, string, null, ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402681857"));
    }

    public static void LJJJJL(Context context, InterfaceC877803bs interfaceC877803bs) {
        if (LJIJ()) {
            if (interfaceC877803bs != null) {
                interfaceC877803bs.onShow();
                return;
            }
            return;
        }
        if (LJIIIIZZ == null) {
            DialogC1389620mGW dialogC1389620mGW = new DialogC1389620mGW(context);
            dialogC1389620mGW.setCanceledOnTouchOutside(false);
            LJIIIIZZ = dialogC1389620mGW;
        }
        DialogC1389620mGW dialogC1389620mGW2 = LJIIIIZZ;
        if (dialogC1389620mGW2 == null) {
            return;
        }
        C786410Ut5.J4(dialogC1389620mGW2);
    }

    public static void LJJJJLL(Context context, C897703f5 c897703f5) {
        Integer num;
        OneClickPayContext oneClickPayContext = c897703f5.LJIIJJI;
        if (oneClickPayContext != null && (num = oneClickPayContext.payMethodSelectEnable) != null && num.intValue() == 1) {
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ecom_checkout_ocp_enable_payment_switch", false) && c897703f5.LJII.get("ocp_retry_cashier_type") == null) {
                LJJJJL(context, c897703f5.LJIILL);
            }
        }
    }

    public static void LJJIIZ(C897703f5 c897703f5, String str, long j) {
        IECommerceHostService iECommerceHostService;
        String name;
        boolean z = true;
        LIZLLL.set(true);
        C11JF c11jfLIZLLL = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService == null) {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        if (rootPageMonitor != null) {
            c11jfLIZLLL = rootPageMonitor.LIZLLL(new AwS1S1300100_1((Function0) null, (Function0<Unit>) c897703f5, (C897703f5) null, (Function0<Unit>) str, (String) j, 0L));
        }
        LIZJ = c11jfLIZLLL;
    }

    public static final void LJJIJIIJI(Context context, MerchantOperationAdvicePrompt merchantOperationAdvicePrompt, C910903hD c910903hD) {
        C1397580mTM c1397580mTM = new C1397580mTM(context);
        String str = merchantOperationAdvicePrompt.message;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        c1397580mTM.LIZIZ(str);
        String str3 = merchantOperationAdvicePrompt.title;
        if (str3 != null) {
            str2 = str3;
        }
        c1397580mTM.LJI(str2);
        C985403tE.LIZ(c1397580mTM, AFwS228S0000000_1.get$arr$(218));
        c1397580mTM.LJII = false;
        c1397580mTM.LIZLLL(new AwS580S0100000_1(c910903hD, 158));
        new C1397510mTF(c1397580mTM).LIZLLL();
    }

    public static final void LJJIZ(C897703f5 c897703f5, String str, boolean z) {
        C1018703yb.LIZLLL("tiktokec_payroute_result", new AwS28S1110000_1(c897703f5, str, z, 0));
    }

    public static final void LJJJ(String str, List<String> list, C897703f5 c897703f5) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        String str2;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        boolean z2;
        String name2;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IBusinessDependencyService.class.getName();
            if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                name2 = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name2 = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
        }
        IBusinessDependencyService iBusinessDependencyService = (IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
        Application applicationLIZ = C7879035x.LIZ();
        C907803gi c907803gi = LIZ;
        if (list != null) {
            str2 = (String) C13LP.LJJJLL(list);
        } else {
            str2 = null;
        }
        String strLJIIIZ = LJIIIZ(c907803gi, str, str2, c897703f5.LJI, true, false, c897703f5.LJJI, c897703f5.LJII, c897703f5.LJIIIIZZ, 16);
        if (C034S.LIZ()) {
            c1120604Zw.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name4 = IComplianceDependencyService.class.getName();
            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
        } else {
            c1120604Zw.LIZ();
            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
        }
        iBusinessDependencyService.bulletStart(applicationLIZ, strLJIIIZ, null, ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402681857"));
    }

    public static final void LJJJI(C897703f5 c897703f5, Boolean bool, String str) {
        NewPayInfo newPayInfo = new NewPayInfo(null, PayResult.DONE, new PayErrorToast(null, "", null, null), null, null, null, null, null, null, null);
        C907803gi c907803gi = LIZ;
        c897703f5.LIZLLL = newPayInfo;
        c897703f5.LJIL = Intrinsics.LJFF(bool, Boolean.TRUE);
        c907803gi.LJIJJLI(c897703f5, str, false);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJJJJIZL(X.C907803gi r9, android.content.Context r10, X.C897703f5 r11) {
        /*
            r9.getClass()
            r3 = 0
            boolean r0 = X.C034S.LIZ()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            if (r0 == 0) goto L3e
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            r0.LIZ()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            com.ss.android.ugc.aweme.framework.services.ServiceManager r1 = com.ss.android.ugc.aweme.framework.services.ServiceManager.get()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.Object r2 = r1.getService(r0)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            r1 = r2
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r1 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r1     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            if (r1 == 0) goto L24
            r9 = 1
            goto L25
        L24:
            r9 = 0
        L25:
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            java.lang.String r7 = r0.getName()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            if (r1 == 0) goto L3c
            java.lang.Class r0 = r1.getClass()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            java.lang.String r8 = r0.getName()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
        L35:
            r6 = 1
            X.C1AQS.LIZJ(r4, r6, r7, r8, r9)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r2 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r2     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            goto L4d
        L3c:
            r8 = r3
            goto L35
        L3e:
            X.04Zw r0 = X.C1120604Zw.LIZ     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            r0.LIZ()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            X.04aq r1 = X.C1120604Zw.LIZJ     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            java.lang.Class<com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService> r0 = com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService.class
            X.0317 r2 = r1.LIZLLL(r0)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService r2 = (com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService) r2     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
        L4d:
            com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService r2 = (com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService) r2     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            X.03hK r0 = r2.getRootPageMonitor()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            if (r0 == 0) goto L6f
            X.03jz r0 = r0.getTop()     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            if (r0 == 0) goto L6f
            android.content.Context r0 = r0.LIZ     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            if (r0 == 0) goto L6f
            X.19EG r4 = X.C1388190mED.LIZIZ(r0)     // Catch: java.lang.Exception -> L66 java.lang.Throwable -> L9d
            if (r4 != 0) goto L76
            goto L6f
        L66:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L9d
            java.lang.String r0 = "fail to launch app not installed dialog"
            X.C1AF0.LJFF(r1, r0)     // Catch: java.lang.Throwable -> L9d
        L6f:
            X.19EG r4 = X.C1388190mED.LIZIZ(r10)     // Catch: java.lang.Throwable -> L9d
            if (r4 != 0) goto L76
            return
        L76:
            boolean r0 = r4.isFinishing()     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto La4
            boolean r0 = r4.isDestroyed()     // Catch: java.lang.Throwable -> L9d
            if (r0 != 0) goto La4
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentInfo r0 = r11.LJI     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L8e
            com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod r0 = r0.paymentMethod     // Catch: java.lang.Throwable -> L9d
            if (r0 == 0) goto L8e
            java.lang.String r2 = r0.displayName     // Catch: java.lang.Throwable -> L9d
            if (r2 != 0) goto L90
        L8e:
            java.lang.String r2 = ""
        L90:
            androidx.lifecycle.LifecycleCoroutineScope r1 = androidx.lifecycle.LifecycleOwnerKt.getLifecycleScope(r4)     // Catch: java.lang.Throwable -> L9d
            X.03iX r0 = new X.03iX     // Catch: java.lang.Throwable -> L9d
            r0.<init>(r4, r2, r3, r3)     // Catch: java.lang.Throwable -> L9d
            r1.launchWhenResumed(r0)     // Catch: java.lang.Throwable -> L9d
            return
        L9d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        La4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907803gi.LJJJJIZL(X.03gi, android.content.Context, X.03f5):void");
    }

    public static void LJJJJLI(Context context, String str, InterfaceC877803bs interfaceC877803bs) {
        if (!EcPipoPollingConfigSettings.LIZ(str)) {
            return;
        }
        LJJJJL(context, interfaceC877803bs);
    }

    public static void LJIIJ(Context context, String str, C897703f5 c897703f5, Function0 function0) {
        Object c098200Yq;
        CommonRetainDisplayInfo commonRetainDisplayInfo;
        IECommerceHostService iECommerceHostService;
        Context context2;
        C19EG c19eg;
        String str2;
        C19EG c19eg2;
        Object c098200Yq2;
        C197039127h c197039127h;
        C928103jz top;
        boolean z;
        String name;
        try {
            c098200Yq = (GeneralPostPaymentGuideModel) C1280004ze.LIZ(str, GeneralPostPaymentGuideModel.class);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        GeneralPostPaymentGuideModel generalPostPaymentGuideModel = (GeneralPostPaymentGuideModel) c098200Yq;
        if (generalPostPaymentGuideModel != null && (commonRetainDisplayInfo = generalPostPaymentGuideModel.commonRetainDisplayInfo) != null) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name = iECommerceHostService.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            if (rootPageMonitor == null || (top = rootPageMonitor.getTop()) == null || (context2 = top.LIZ) == null) {
                context2 = context;
            }
            if ((context2 instanceof C19EG) && (c19eg = (C19EG) context2) != null) {
                C883303cl c883303cl = new C883303cl();
                C901403fg c901403fg = new C901403fg(c897703f5, null);
                C1717030umb c1717030umb = new C1717030umb(generalPostPaymentGuideModel, null);
                AwS402S0200000_1 awS402S0200000_1 = new AwS402S0200000_1(new AtomicBoolean(false), (AtomicBoolean) function0, (Function0<Unit>) 21);
                C259800zU c259800zU = new C259800zU();
                HeaderBlock headerBlock = commonRetainDisplayInfo.header;
                List list = commonRetainDisplayInfo.dialogButtons;
                if (list == null) {
                    list = C13BV.INSTANCE;
                }
                AwS37S0500000_1 awS37S0500000_1 = new AwS37S0500000_1(c259800zU, c901403fg, commonRetainDisplayInfo, c19eg, awS402S0200000_1, 3);
                C020Y c020y = new C020Y(awS402S0200000_1, c1717030umb, 22);
                LinearLayout linearLayout = new LinearLayout(c19eg);
                C786410Ut5.d6(linearLayout, new LinearLayout.LayoutParams(-1, -2));
                linearLayout.setOrientation(1);
                DialogButton dialogButton = (DialogButton) C13LP.LJJJLZIJ(1, list);
                if (dialogButton == null || (str2 = dialogButton.text) == null || !(!a0.LJJJIL(str2))) {
                    str2 = null;
                }
                if (str2 != null) {
                    FrameLayout frameLayout = new FrameLayout(c19eg);
                    C786410Ut5.a6(frameLayout, new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52))));
                    frameLayout.setPaddingRelative(0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(6)), C814420VxA.LIZIZ(C418440Gaw.LIZIZ(4)));
                    c19eg2 = c19eg;
                    TuxTextView tuxTextViewLIZIZ = C883303cl.LIZIZ(c883303cl, c19eg2, dialogButton, -1, linearLayout, c020y, true, 64);
                    if (tuxTextViewLIZIZ != null) {
                        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 8388629);
                        layoutParams.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        layoutParams.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
                        C786410Ut5.W5(tuxTextViewLIZIZ, layoutParams);
                        frameLayout.addView(tuxTextViewLIZIZ);
                    }
                    linearLayout.addView(frameLayout);
                } else {
                    c19eg2 = c19eg;
                }
                C21578619ce c21578619ce = new C21578619ce(c19eg2);
                C786410Ut5.o6(c21578619ce, new LinearLayout.LayoutParams(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(c19eg2);
                C786410Ut5.d6(linearLayout2, new LinearLayout.LayoutParams(-1, -2));
                linearLayout2.setOrientation(1);
                linearLayout2.setPaddingRelative(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)), 0);
                C883303cl.LJII(c19eg2, headerBlock, commonRetainDisplayInfo, linearLayout2, Integer.valueOf(R.attr.a1k));
                if (linearLayout2.getChildCount() != 0) {
                    c21578619ce.addView(linearLayout2);
                    linearLayout.addView(c21578619ce);
                }
                TuxTextView tuxTextViewLIZIZ2 = C883303cl.LIZIZ(c883303cl, c19eg2, (DialogButton) C13LP.LJJJLZIJ(0, list), 0, linearLayout, null, false, 112);
                if ((tuxTextViewLIZIZ2 instanceof C197039127h) && (c197039127h = (C197039127h) tuxTextViewLIZIZ2) != null) {
                    C786410Ut5.U8(c197039127h, new ACListenerS105S0200000_1(awS37S0500000_1, c197039127h, 4));
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(52)));
                    layoutParams2.setMarginStart(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                    layoutParams2.setMarginEnd(C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32)));
                    layoutParams2.topMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    layoutParams2.bottomMargin = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16));
                    C786410Ut5.J6(c197039127h, layoutParams2);
                    linearLayout.addView(c197039127h);
                }
                try {
                    float fLIZJ = C958103op.LIZJ();
                    linearLayout.measure(View.MeasureSpec.makeMeasureSpec(c19eg2.getResources().getDisplayMetrics().widthPixels, 1073741824), View.MeasureSpec.makeMeasureSpec(0, 0));
                    int iLJ = C13LZ.LJ(linearLayout.getMeasuredHeight(), (int) (0.6f * fLIZJ), (int) (fLIZJ * 0.78f));
                    C1390920mIc c1390920mIc = new C1390920mIc(false, 0);
                    c1390920mIc.LJIIIIZZ(1);
                    TuxSheet tuxSheet = c1390920mIc.LIZ;
                    tuxSheet.LLJJIJIIJIL = true;
                    tuxSheet.LLJJIII = linearLayout;
                    tuxSheet.LLJLILLLLZIIL = false;
                    tuxSheet.LLJLLL = true;
                    tuxSheet.LLILLL = false;
                    tuxSheet.LLJLLIL = true;
                    tuxSheet.LLILLJJLI = new DialogInterfaceOnDismissListenerC512601zA(c259800zU, awS402S0200000_1, 0);
                    tuxSheet.LLJJL = iLJ;
                    tuxSheet.show(c19eg2.getSupportFragmentManager(), "after_payment_bind_retain");
                    c098200Yq2 = Unit.LIZ;
                    C189200o6.m2constructorimpl(c098200Yq2);
                } catch (Throwable th2) {
                    TryCatchGuardChecker.doCheck(th2);
                    c098200Yq2 = new C098200Yq(th2);
                    C189200o6.m2constructorimpl(c098200Yq2);
                }
                if (C189200o6.m5exceptionOrNullimpl(c098200Yq2) != null) {
                    awS402S0200000_1.invoke();
                    return;
                }
                return;
            }
            function0.invoke();
            return;
        }
        function0.invoke();
    }

    public static void LJIIL(Context context, C897703f5 c897703f5, MaterialCollectionInfo materialCollectionInfo, Function0 function0) {
        String str;
        String str2 = materialCollectionInfo.actionUrl;
        if (str2 != null) {
            if (Intrinsics.LJFF(materialCollectionInfo.action, "PIN_FREE")) {
                if (c897703f5.LJJ) {
                    LJIILLIIL(context, str2, c897703f5.LJIIIIZZ, new AwS545S0100000_1(function0, (Function0<Unit>) 1235));
                    return;
                } else {
                    function0.invoke();
                    return;
                }
            }
            String str3 = null;
            if (Intrinsics.LJFF(materialCollectionInfo.action, "BIOMETRIC")) {
                String str4 = c897703f5.LJIIIIZZ;
                Object obj = c897703f5.LJII.get("previous_page");
                if (obj instanceof String) {
                    str3 = (String) obj;
                }
                LJIILJJIL(str2, str4, str3, new AwS545S0100000_1(function0, (Function0<Unit>) 1236));
                return;
            }
            if (Intrinsics.LJFF(materialCollectionInfo.action, "BNPL")) {
                LJIIZILJ(context, str2, "bnpl after payment", new AwS545S0100000_1(function0, (Function0<Unit>) 1237));
                return;
            }
            if (Intrinsics.LJFF(materialCollectionInfo.action, "LARGE_AMOUNT_PAYMENT_VERIFICATION")) {
                LJIIZILJ(context, str2, "large amount payment verification", new AwS545S0100000_1(function0, (Function0<Unit>) 1238));
                return;
            }
            String str5 = "VISA_PAYMENT_SIGNAL";
            if (!Intrinsics.LJFF(materialCollectionInfo.action, "BACKUP_PAYMENT") && !Intrinsics.LJFF(materialCollectionInfo.action, "VISA_PAYMENT_SIGNAL")) {
                if (Intrinsics.LJFF(materialCollectionInfo.action, "AFTER_PAYMENT_BIND_RETAIN")) {
                    LJIIJ(context, materialCollectionInfo.materialContent, c897703f5, new AwS545S0100000_1(function0, (Function0<Unit>) 1240));
                    return;
                }
                if (Intrinsics.LJFF(materialCollectionInfo.action, "COLLECT_INFO")) {
                    boolean z = c897703f5.LJII.get("previous_page") instanceof String;
                    if (LIZ(context) && (str = materialCollectionInfo.materialContent) != null && C123100dR.LIZ(str)) {
                        String str6 = c897703f5.LJIIIIZZ;
                        Object obj2 = c897703f5.LJII.get("previous_page");
                        if (obj2 instanceof String) {
                            str3 = (String) obj2;
                        }
                        LJIIJJI(str2, str6, str3, materialCollectionInfo.materialContent, new AwS545S0100000_1(function0, (Function0<Unit>) 1241));
                        return;
                    }
                }
                function0.invoke();
                return;
            }
            if (!Intrinsics.LJFF(materialCollectionInfo.action, "VISA_PAYMENT_SIGNAL")) {
                str5 = "BACKUP_PAYMENT";
            }
            String str7 = materialCollectionInfo.actionUrl;
            C898003f8 c898003f8 = c897703f5.LJIJ;
            String str8 = c898003f8.LIZ;
            String str9 = c898003f8.LJIILLIIL;
            String str10 = c897703f5.LJIIJ;
            String str11 = materialCollectionInfo.materialContent;
            String str12 = c897703f5.LJIIIIZZ;
            boolean z2 = c897703f5.LJII.get("previous_page") instanceof String;
            C898003f8 c898003f82 = c897703f5.LJIJ;
            LJIILIIL(str7, str8, str9, str10, str12, str11, c898003f82.LJIIJJI, c898003f82.LJI, c897703f5, str5, new AwS545S0100000_1(function0, (Function0<Unit>) 1239));
            return;
        }
        function0.invoke();
    }

    public static void LJIILJJIL(String str, String str2, String str3, Function0 function0) {
        IECommerceHostService iECommerceHostService;
        C928103jz top;
        Context context;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        boolean z;
        boolean z2;
        String name;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle guide url: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        LJJJJZI(function0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("flow_type", "DYNAMIC_GUIDE");
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("page_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("previous_page_id", str3);
        String string = C919503ib.LIZJ(str, linkedHashMap).toString();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("handle guide url with biz: ");
        sbLIZ2.append(string);
        C2341109Fh.LIZ(C2188811AlT.LIZIZ(sbLIZ2));
        String name2 = null;
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name3 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null && (context = top.LIZ) != null) {
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, string);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name4 = IComplianceDependencyService.class.getName();
                if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                    name2 = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
            }
            smartRouteBuildRoute.withParam(((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402681857"));
            smartRouteBuildRoute.open();
        }
    }

    public static void LJIILLIIL(Context context, String str, String str2, Function0 function0) {
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        String name;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle pin free url: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        LJIIJ = function0;
        ((IEventCenter) ServiceManager.get().getService(IEventCenter.class)).LIZLLL("ec_pipo_pin_free_exit", LJIIL);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("pipo_hybrid_biz", "pipo_pin_free");
        linkedHashMap.put("target_handler", "pipo_hybrid");
        linkedHashMap.put("disable_auto_append_crossplatform_plugin", "1");
        linkedHashMap.put("use_spark", "1");
        linkedHashMap.put("disable_back_press", "1");
        String string = C919503ib.LIZJ(str, linkedHashMap).toString();
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        try {
            Uri uri = UriProtector.parse(string);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "roma_url_query");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                str3 = strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str3);
            sbLIZ2.append("&page_id=");
            sbLIZ2.append(str2);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
            Uri.Builder builderClearQuery = uri.buildUpon().clearQuery();
            for (String str4 : UriProtector.getQueryParameterNames(uri)) {
                if (!Intrinsics.LJFF(str4, "roma_url_query")) {
                    builderClearQuery.appendQueryParameter(str4, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4));
                }
            }
            builderClearQuery.appendQueryParameter("roma_url_query", strLIZIZ2);
            string = builderClearQuery.toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append("handle pin free url with biz: ");
        sbLIZ3.append(string);
        String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ3);
        c2341109Fh2.getClass();
        C2341109Fh.LIZ(strLIZIZ3);
        SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, string);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z = false;
            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                z = true;
            }
            String name2 = IComplianceDependencyService.class.getName();
            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
        }
        smartRouteBuildRoute.withParam(((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402681857"));
        smartRouteBuildRoute.open();
    }

    public static void LJIIZILJ(Context context, String str, String str2, Function0 function0) {
        IECommerceHostService iECommerceHostService;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        C928103jz top;
        Context context2;
        boolean z2;
        Context context3 = context;
        if (str != null && str.length() != 0) {
            String name2 = null;
            IEventCenter iEventCenter = (IEventCenter) PluggableExtentionKt.pluggableSpi$default(IEventCenter.class, false, false, false, 14, null);
            if (iEventCenter == null) {
                function0.invoke();
                return;
            }
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("handle ");
            sbLIZ.append(str2);
            sbLIZ.append(" action url: ");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            LJJJJZI(function0);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
                if (iECommerceHostService != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IApplicationDependencyService.class.getName();
                if (iECommerceHostService != null) {
                    name2 = iECommerceHostService.getClass().getName();
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name2, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
            if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null && (context2 = top.LIZ) != null) {
                context3 = context2;
            }
            try {
                SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context3, str);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name4 = IComplianceDependencyService.class.getName();
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name, z);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
                }
                smartRouteBuildRoute.withParam(((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402681857"));
                smartRouteBuildRoute.open();
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                LJIIJJI = null;
                iEventCenter.LIZJ("ec_checkout_guide_exit", LJIILIIL);
                function0.invoke();
                return;
            }
        }
        function0.invoke();
    }

    public static void LJJJIL(Context context, String str, String str2, String str3) {
        String str4;
        boolean z = C03VW.LIZ().enableRomaShortLink;
        String str5 = C03VW.LIZ().groupKey;
        if (Intrinsics.LJFF(str2, "one_step_checkout") && !Intrinsics.LJFF(str3, "live")) {
            str4 = C03VW.LIZ().pageKeyForNineSplit;
        } else {
            str4 = C03VW.LIZ().pageKey;
        }
        if (!z || ((str5 != null && str5.length() == 0) || (str4 != null && str4.length() == 0))) {
            LJJJJ(context, str);
            return;
        }
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect");
        c495520Jby.LIZJ("roma_group_key", str5);
        c495520Jby.LIZJ("roma_page_key", str4);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Uri uri = UriProtector.parse(str);
        for (String str6 : UriProtector.getQueryParameterNames(uri)) {
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str6);
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                linkedHashMap.put(str6, URLEncoder.encode(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, "UTF-8"));
            }
        }
        linkedHashMap.put("is_express_checkout", "1");
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) entry.getKey());
            sbLIZ.append('=');
            sbLIZ.append((String) entry.getValue());
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        c495520Jby.LIZJ("roma_url_query", C13LP.LJJLIIIJ(arrayList, "&", null, null, 0, null, null, 62));
        if (Intrinsics.LJFF(str2, "one_step_checkout") && C03VW.LIZ().enableHeightCalculation) {
            C928203k0.LIZ.getClass();
            if (C928203k0.LJIIL(null, str2, str3) != null) {
                c495520Jby.LIZJ("height", String.valueOf(C418440Gaw.LJFF(r0.intValue(), context)));
            }
        }
        C786410Ut5.LJLIIL(C03VW.LIZ().delayTime, new BPEAHandler(Looper.getMainLooper()), new ARunnableS70S0200000_1(context, c495520Jby, 6));
    }

    public static void LJIIJJI(String str, String str2, String str3, String str4, Function0 function0) {
        IECommerceHostService iECommerceHostService;
        C928103jz top;
        Context context;
        IPipoAccountService iPipoAccountService;
        boolean z;
        String name;
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("handle guide url: ");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        LJJJJZI(function0);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str2 == null) {
            str2 = "";
        }
        linkedHashMap.put("page_id", str2);
        if (str3 == null) {
            str3 = "";
        }
        linkedHashMap.put("previous_page_id", str3);
        if (str == null) {
            str = "";
        }
        linkedHashMap.put("action_url", str);
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name = iECommerceHostService.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null && (context = top.LIZ) != null && (iPipoAccountService = (IPipoAccountService) PluggableExtentionKt.pluggableSpi$default(IPipoAccountService.class, false, false, false, 14, null)) != null) {
            iPipoAccountService.LIZ(context, str4, linkedHashMap);
        }
    }

    public static final String LJJIII(C897703f5 c897703f5, boolean z, boolean z2, boolean z3, String str) {
        if (LJJI(str)) {
            return c897703f5.LJIIL;
        }
        if (!z && !z2) {
            C03VQ.LIZ.getClass();
            if (!C03VQ.LJIIJ()) {
                if (z3) {
                    return "aweme://ec/payment_result_handler";
                }
                return c897703f5.LJIIL;
            }
            return "aweme://ec/pay_result";
        }
        return "aweme://ec/pay_result";
    }

    public static void LJJJJJ(Context context, String str, String str2, String str3, Function0 function0) {
        String string = str;
        try {
            String string2 = PipoPaymentFailedPopupMessage.LIZ().title;
            if (string2 == null) {
                string2 = context.getString(2131850904);
            }
            if (string.length() == 0) {
                string = context.getString(2131832569);
            }
            C23250099c.LIZLLL(LJ(), null, null, new C912403hS(context, string, string2, str2, str3, function0, null), 3);
            C03O0.LIZ.getClass();
            C03O0.LJJZZI(str2, str3);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
    }

    public static final void LJJIJIIJIL(String str, C897703f5 c897703f5, String str2, String str3, List<String> list, Context context) {
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        boolean z2;
        String name2;
        AnonymousClass0317 anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2;
        boolean z3;
        String name3;
        boolean z4;
        String name4;
        PaymentMethod paymentMethod;
        if (Intrinsics.LJFF(str, "ordersubmit")) {
            String strLJJIIZ = null;
            if (C925303jX.LIZ()) {
                IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
                String value = EnumC899203fK.PENDING.getValue();
                PaymentInfo paymentInfo = c897703f5.LJI;
                if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
                    strLJJIIZ = paymentMethod.LJJIIZ();
                }
                iEventCenter.LIZ("ec_common_pay_result", C1741890vQh.LJIIIIZZ(new EcomPaymentInterceptor.CommonPayResultEvent(value, null, strLJJIIZ, "h5", str2, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE)));
                return;
            }
            PaymentResult paymentResult = new PaymentResult("pending", null);
            SettingsManager.LIZLLL().getClass();
            if (SettingsManager.LIZ("ecom_order_detail_roma_short_link", false)) {
                AnonymousClass0181 anonymousClass0181 = new AnonymousClass0181(str3);
                anonymousClass0181.LJFF(3, C2097608Jq.LJIIJ(new Pair("pay_route", "h5"), new Pair("pay_result", C1741890vQh.LJIIIIZZ(paymentResult))));
                String strLIZ = anonymousClass0181.LIZ();
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2 = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2 != null) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    String name5 = IBusinessDependencyService.class.getName();
                    if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2 != null) {
                        name4 = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2.getClass().getName();
                    } else {
                        name4 = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name5, name4, z4);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
                }
                IBusinessDependencyService iBusinessDependencyService = (IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin2;
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String name6 = IComplianceDependencyService.class.getName();
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 != null) {
                        name3 = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2.getClass().getName();
                    } else {
                        name3 = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name6, name3, z3);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
                }
                iBusinessDependencyService.bulletStart(context, strLIZ, null, ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2).appendDataFlowId(new Bundle(), "402681857"));
                return;
            }
            HashMap map = new HashMap();
            map.put("pay_route", "h5");
            map.put("pay_result", paymentResult);
            String string = C919503ib.LIZLLL(str3, map).toString();
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime3 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = BusinessDependencyService.createIBusinessDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name7 = IBusinessDependencyService.class.getName();
                if (anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin != null) {
                    name2 = anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name2 = null;
                }
                C1AQS.LIZJ(jElapsedRealtime3, 1, name7, name2, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IBusinessDependencyService.class);
            }
            IBusinessDependencyService iBusinessDependencyService2 = (IBusinessDependencyService) anonymousClass0317CreateIBusinessDependencyServicebyMonsterPlugin;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime4 = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name8 = IComplianceDependencyService.class.getName();
                if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime4, 1, name8, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
            }
            iBusinessDependencyService2.bulletStart(context, string, null, ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), "402681857"));
            return;
        }
        IEventCenter iEventCenter2 = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("{orderId: ");
        sbLIZ.append(list);
        sbLIZ.append('}');
        iEventCenter2.LIZ("ec_refresh_order", C2188811AlT.LIZIZ(sbLIZ));
    }

    /* JADX WARN: Removed duplicated region for block: B:117:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04d3  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0569  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x057f  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0590  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0599  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x05b0  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0250  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJJJLIIL(X.C897703f5 r21, java.lang.Object r22, java.lang.Object r23, java.lang.Object r24, java.lang.String r25, X.C099G r26) {
        /*
            Method dump skipped, instruction units count: 1570
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907803gi.LJJJLIIL(X.03f5, java.lang.Object, java.lang.Object, java.lang.Object, java.lang.String, X.099G):boolean");
    }

    public static void LJJJLL(long j, boolean z, String str, String str2, C03WO c03wo, C03PY c03py) {
        String str3;
        long jCurrentTimeMillis = 0;
        if (j > 0) {
            try {
                jCurrentTimeMillis = System.currentTimeMillis() - j;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                return;
            }
        }
        if (z) {
            str3 = "1";
        } else {
            str3 = CardStruct.IStatusCode.DEFAULT;
        }
        C1018703yb.LIZLLL("rd_pipo_tts_pay_result", new C03WN(jCurrentTimeMillis, str3, str, str2, c03wo, c03py));
    }

    public static String LJI(String str, String str2, String str3, PaymentInfo paymentInfo, Integer num, String str4, Boolean bool, String str5, String str6) {
        String strLIZIZ;
        String str7;
        String strLJJIIZ;
        int iIntValue;
        AnonymousClass0317 anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin;
        String str8;
        String str9;
        boolean z;
        PaymentMethod paymentMethod;
        PaymentMethodInfo paymentMethodInfo;
        String str10 = str2;
        if (str5 == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(C1020403ys.LIZ());
            sbLIZ.append("view/fe_tiktok_ecommerce_pay_middle/index.html");
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else {
            strLIZIZ = str5;
        }
        Pair[] pairArr = new Pair[6];
        pairArr[0] = new Pair("main_order_id", str10);
        pairArr[1] = new Pair("combo_id", str);
        if (paymentInfo != null && (paymentMethodInfo = paymentInfo.paymentMethodInfo) != null && Intrinsics.LJFF(paymentMethodInfo.isChooseSave(), Boolean.TRUE)) {
            str7 = "pay_and_bindcard";
        } else {
            str7 = "pay";
        }
        pairArr[2] = new Pair("channel_type", str7);
        pairArr[3] = new Pair("pay_source", str3);
        String name = null;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            strLJJIIZ = paymentMethod.LJJIIZ();
        } else {
            strLJJIIZ = null;
        }
        pairArr[4] = new Pair("pay_type", strLJJIIZ);
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        pairArr[5] = new Pair("miss_cashback", Integer.valueOf(iIntValue));
        HashMap mapLJI = C2097608Jq.LJI(pairArr);
        String str11 = "1";
        if (LJII) {
            mapLJI.put("use_spark", "1");
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_pay_middle_append_request_id", false)) {
            mapLJI.put("pay_request_id", str4);
        }
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("ec_payment_result_close_btn", false)) {
            mapLJI.put("show_close_all", 0);
        }
        Boolean bool2 = Boolean.TRUE;
        if (Intrinsics.LJFF(bool, bool2)) {
            mapLJI.put("us_localization", 1);
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
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECommerceMallDependencyService.class);
        }
        IECommerceMallDependencyService iECommerceMallDependencyService = (IECommerceMallDependencyService) anonymousClass0317CreateIECommerceMallDependencyServicebyMonsterPlugin;
        if (Intrinsics.LJFF(iECommerceMallDependencyService.shouldShowMall2TabOrTopTab(), bool2)) {
            if (!iECommerceMallDependencyService.hitTopTabExpExperiment()) {
                str9 = "1";
            } else {
                str9 = "2";
            }
            mapLJI.put("pay_to_mall_tab", str9);
        }
        if (C03VX.LIZ() && str6 != null) {
            mapLJI.put("source_btm_token", str6);
        }
        if (C0N7Y.LIZ) {
            mapLJI.put("target_handler", "ecom,crossPlatform");
            mapLJI.put("business_from", "ecom");
            mapLJI.put("use_spark", "1");
            mapLJI.put("disable_auto_append_crossplatform_plugin", "1");
        }
        String string = C919503ib.LIZLLL(strLIZIZ, mapLJI).toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str12 = "";
        if (str == null) {
            str8 = "";
        } else {
            str8 = str;
        }
        linkedHashMap.put("combo_id", str8);
        if (str10 == null) {
            str10 = "";
        }
        linkedHashMap.put("order_id", str10);
        if (str5 != null) {
            str12 = str5;
        }
        linkedHashMap.put("redirect_url", str12);
        if (str == null || !u.LJIIZILJ(str, "/", false)) {
            str11 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("combo_id_ends_with_slash", str11);
        linkedHashMap.put("final_url", string);
        C1018703yb.LIZIZ("rd_pipo_middle_page_debug", linkedHashMap);
        return string;
    }

    public static String LJIIIZ(C907803gi c907803gi, String str, String str2, PaymentInfo paymentInfo, boolean z, boolean z2, String str3, Map map, String str4, int i) {
        String strLJJIIZ;
        String str5;
        PaymentMethod paymentMethod;
        PaymentMethod paymentMethod2;
        String strLJJIIZ2;
        String str6;
        PaymentMethod paymentMethod3;
        PaymentMethod paymentMethod4;
        String string;
        String string2;
        Object obj;
        Object obj2;
        String str7 = str4;
        String str8 = str2;
        Map mapLJ = map;
        String str9 = str3;
        if ((i & 8) != 0) {
            z = false;
        }
        if ((i & 16) != 0) {
            z2 = false;
        }
        if ((i & 32) != 0) {
            str9 = null;
        }
        if ((i & 64) != 0) {
            mapLJ = null;
        }
        if ((i & 128) != 0) {
            str7 = null;
        }
        c907803gi.getClass();
        SettingsManager.LIZLLL().getClass();
        if (SettingsManager.LIZ("pipo_enable_order_detail_pia", false)) {
            Map<String, Object> map2 = C912103hP.LIZ;
            if (str8 == null) {
                str8 = "";
            }
            if (mapLJ == null || (obj2 = mapLJ.get("enter_from")) == null || (string = obj2.toString()) == null) {
                string = "";
            }
            if (mapLJ == null || (obj = mapLJ.get("previous_page")) == null || (string2 = obj.toString()) == null) {
                string2 = "";
                if (mapLJ == null) {
                    mapLJ = C2097608Jq.LJ();
                }
            }
            if (str7 == null) {
                str7 = "";
            }
            C912003hO c912003hO = new C912003hO(str8, string, string2, str7, mapLJ);
            Pair[] pairArr = new Pair[5];
            pairArr[0] = new Pair("main_order_id", str8);
            pairArr[1] = new Pair("enter_from", string);
            pairArr[2] = new Pair("previous_page", string2);
            Set setLJLIIL = C13LQ.LJLIIL(new String[]{"enter_from", "enter_from_info", "entrance_info", "entrance_form", "order_id", "original_price", "sale_price"});
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry entry : mapLJ.entrySet()) {
                if (setLJLIIL.contains(entry.getKey())) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
            pairArr[3] = new Pair("trackParams", C1741890vQh.LJIIIIZZ(linkedHashMap));
            pairArr[4] = new Pair("pay_source", c912003hO.LIZIZ);
            return C010L.LIZ("aweme://webview", C2097608Jq.LJIIL(C912103hP.LIZ, C2097908Jt.LIZJ(new Pair("url", C010L.LIZ("https://lf16-gecko-source.tiktokcdn.com/obj/byte-gurd-source-sg/tiktok/fe/live/fe_tiktok_ecommerce_order_detail_pia/pia_home.html", C2097608Jq.LJIIL(C912103hP.LIZIZ, C2097608Jq.LJIIIIZZ(pairArr)))))));
        }
        if (!z2) {
            SettingsManager.LIZLLL().getClass();
            if (!SettingsManager.LIZ("ecom_order_detail_roma_short_link", false)) {
                Pair[] pairArr2 = new Pair[10];
                pairArr2[0] = new Pair("main_order_id", str8);
                pairArr2[1] = new Pair("combo_id", str);
                if (paymentInfo != null && (paymentMethod4 = paymentInfo.paymentMethod) != null) {
                    strLJJIIZ2 = paymentMethod4.LJJIIZ();
                } else {
                    strLJJIIZ2 = null;
                }
                pairArr2[2] = new Pair("pay_type", strLJJIIZ2);
                pairArr2[3] = new Pair("__status_bar", Boolean.TRUE);
                pairArr2[4] = new Pair("container_color_auto_dark", 1);
                pairArr2[5] = new Pair("disableBounces", 1);
                pairArr2[6] = new Pair("hide_nav_bar", 1);
                pairArr2[7] = new Pair("hide_source", 1);
                if (paymentInfo != null && (paymentMethod3 = paymentInfo.paymentMethod) != null) {
                    str6 = paymentMethod3.secondType;
                } else {
                    str6 = null;
                }
                pairArr2[8] = new Pair("payment_method", str6);
                pairArr2[9] = new Pair("should_full_screen", 1);
                HashMap mapLJI = C2097608Jq.LJI(pairArr2);
                if (z) {
                    mapLJI.put("payment_status", "paying");
                }
                if (LJII) {
                    mapLJI.put("use_spark", "1");
                }
                if (C03VX.LIZ() && str9 != null) {
                    mapLJI.put("source_btm_token", str9);
                }
                return C919503ib.LIZLLL("https://oec-api.tiktokv.com/view/fe_tiktok_ecommerce_order_detail/index.html", mapLJI).toString();
            }
        }
        C495520Jby c495520Jby = new C495520Jby("aweme://roma_redirect");
        c495520Jby.LIZJ("roma_group_key", "roma_schema_group_aftersale");
        c495520Jby.LIZJ("roma_page_key", "roma_schema_page_order_detail_pia");
        Pair[] pairArr3 = new Pair[4];
        pairArr3[0] = new Pair("main_order_id", String.valueOf(str8));
        pairArr3[1] = new Pair("combo_id", String.valueOf(str));
        if (paymentInfo != null && (paymentMethod2 = paymentInfo.paymentMethod) != null) {
            strLJJIIZ = paymentMethod2.LJJIIZ();
        } else {
            strLJJIIZ = null;
        }
        pairArr3[2] = new Pair("pay_type", String.valueOf(strLJJIIZ));
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            str5 = paymentMethod.secondType;
        } else {
            str5 = null;
        }
        pairArr3[3] = new Pair("payment_method", String.valueOf(str5));
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr3);
        ArrayList arrayList = new ArrayList(mapLJIIJ.size());
        for (Map.Entry entry2 : ((LinkedHashMap) mapLJIIJ).entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) entry2.getKey());
            sbLIZ.append('=');
            sbLIZ.append((String) entry2.getValue());
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        c495520Jby.LIZJ("roma_url_query", C13LP.LJJLIIIJ(arrayList, "&", null, null, 0, null, null, 62));
        if (C03VX.LIZ() && str9 != null) {
            c495520Jby.LIZJ("source_btm_token", str9);
        }
        AnonymousClass0181 anonymousClass0181 = new AnonymousClass0181(c495520Jby.LIZLLL());
        if (z) {
            anonymousClass0181.LJ(3, "payment_status", "paying");
        }
        if (LJII) {
            anonymousClass0181.LJ(3, "use_spark", "1");
        }
        return anonymousClass0181.LIZ();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [X.03gk] */
    public static final void LJJIIJ(final long j, final C897703f5 c897703f5, final NewPayInfo newPayInfo, final String str, final String str2, final String str3, final List list, final Function0 function0, final Function0 function02, final boolean z) {
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        String name;
        LIZLLL.set(z);
        LIZIZ = new C18ZQ() { // from class: X.03gk
            @Override // X.C18ZQ
            public final void onAppBackground() {
                C1018703yb.LIZLLL("rd_tiktokec_ecommerce_envoke_app", new AwS18S1100100_1(c897703f5, str, j, 1));
                Function0<Unit> function03 = function0;
                if (function03 != null) {
                    function03.invoke();
                }
            }

            @Override // X.C18ZQ
            public final void onAppForeground() {
                PaymentMethod paymentMethod;
                boolean z2;
                AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2;
                PaymentMethodInfo paymentMethodInfo;
                PayResult payResult;
                List<PaymentMethod> list2;
                PaymentMethod paymentMethod2;
                PaymentInfo paymentInfo;
                C2341109Fh c2341109Fh = C2341109Fh.LIZ;
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onAppForeground, source: ");
                sbLIZ.append(str);
                String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                c2341109Fh.getClass();
                C2341109Fh.LIZJ(strLIZIZ);
                String strLJJIIZ = null;
                if (Intrinsics.LJFF(str, "ordersubmit") || c897703f5.LJJIIZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("invokeTime: appSwitch1 ");
                    sbLIZ2.append(System.currentTimeMillis());
                    C2341109Fh.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                    if (z) {
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LIZ("ec_deeplink_order_detail_fix", false)) {
                            C897703f5 c897703f52 = c897703f5;
                            if (c897703f52.LJJIIZ) {
                                C907803gi.LIZ.getClass();
                                InterfaceC911103hF interfaceC911103hF = c897703f52.LJIILJJIL;
                                if (interfaceC911103hF != null) {
                                    interfaceC911103hF.LJI(C03N1.COMPLETE, null, "app_foreground_2");
                                }
                            } else {
                                C786410Ut5.LJLIIL(500L, new BPEAHandler(Looper.getMainLooper()), new ARunnableS1S2200000_1(c897703f5, str2, str3, list, 1));
                            }
                        }
                    }
                    C897703f5 c897703f53 = c897703f5;
                    if (c897703f53.LJJIIZ) {
                        C907803gi.LIZ.getClass();
                        InterfaceC911103hF interfaceC911103hF2 = c897703f53.LJIILJJIL;
                        if (interfaceC911103hF2 != null) {
                            interfaceC911103hF2.LJI(C03N1.COMPLETE, null, "app_foreground_1");
                            return;
                        }
                        return;
                    }
                    C03VQ c03vq = C03VQ.LIZ;
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    c03vq.getClass();
                    C03VQ.LJIJI = jCurrentTimeMillis;
                    if (!C925303jX.LIZ()) {
                        C907803gi.LJJJ(str3, list, c897703f5);
                        return;
                    }
                    IEventCenter iEventCenter = (IEventCenter) ServiceManager.get().getService(IEventCenter.class);
                    String value = EnumC899203fK.PAYING.getValue();
                    PaymentInfo paymentInfo2 = c897703f5.LJI;
                    if (paymentInfo2 != null && (paymentMethod = paymentInfo2.paymentMethod) != null) {
                        strLJJIIZ = paymentMethod.LJJIIZ();
                    }
                    iEventCenter.LIZ("ec_common_pay_result", C1741890vQh.LJIIIIZZ(new EcomPaymentInterceptor.CommonPayResultEvent(value, null, strLJJIIZ, null, str2, Boolean.FALSE, Boolean.FALSE, null, null, Boolean.FALSE, Boolean.FALSE, null, Boolean.FALSE, Boolean.FALSE, Boolean.FALSE)));
                    return;
                }
                Function0<Unit> function03 = function02;
                if (function03 != null) {
                    function03.invoke();
                }
                C897703f5 c897703f54 = c897703f5;
                PaymentMethod paymentMethod3 = (c897703f54 == null || (paymentInfo = c897703f54.LJI) == null) ? null : paymentInfo.paymentMethod;
                String str4 = c897703f54.LJJIJ ? "payment_method" : "order_submit";
                PaymentMethodsData paymentMethodsData = c897703f54.LJJIIJZLJL;
                if (paymentMethodsData != null && (list2 = paymentMethodsData.storedMethods) != null) {
                    Iterator<PaymentMethod> it2 = list2.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        PaymentMethod next = it2.next();
                        String strLJIIJ = next.LJIIJ();
                        PaymentInfo paymentInfo3 = c897703f54.LJI;
                        if (Intrinsics.LJFF(strLJIIJ, (paymentInfo3 == null || (paymentMethod2 = paymentInfo3.paymentMethod) == null) ? null : paymentMethod2.LJIIJ())) {
                            z2 = next != null;
                        }
                    }
                }
                NewPayInfo newPayInfo2 = newPayInfo;
                String strLIZ = (newPayInfo2 == null || (payResult = newPayInfo2.payResult) == null) ? null : C906603gW.LIZ(payResult);
                PaymentInfo paymentInfo4 = c897703f5.LJI;
                C834803Ny.LIZ("pay", paymentMethod3, (paymentInfo4 == null || (paymentMethodInfo = paymentInfo4.paymentMethodInfo) == null) ? null : paymentMethodInfo.isChooseSave(), Boolean.valueOf(z2), strLIZ, Long.valueOf(SystemClock.elapsedRealtime() - j), null, null, null, null, null, null, null, null, null, null, str4, null, null, null, null, null, null, null, "app_switch_foreground", null, null, null, null, null, null, null, null, null, null, null, null, null, null, -33685568, 255);
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                    C1AQS.LIZJ(jElapsedRealtime, 1, IActivityStackDependencyService.class.getName(), anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 != null ? anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2.getClass().getName() : null, anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 != null);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
                }
                ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin2).removeAppBackGroundListener(this);
                C907803gi.LIZIZ = null;
            }
        };
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            boolean z2 = false;
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                z2 = true;
            }
            String name2 = IActivityStackDependencyService.class.getName();
            if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
        }
        ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).addAppBackGroundListener(LIZIZ);
    }

    public static void LJIILIIL(String str, String str2, String str3, String str4, String str5, String str6, String str7, C900203fU c900203fU, C897703f5 c897703f5, String str8, Function0 function0) {
        boolean z;
        String strT2;
        Object objLJJJLL;
        String str9;
        IECommerceHostService iECommerceHostService;
        C928103jz top;
        Context context;
        boolean z2;
        AnonymousClass0317 anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin;
        Number number;
        boolean z3;
        String name;
        PaymentMethod paymentMethod;
        String str10 = str5;
        String riskInfo = str7;
        LJJJJZI(function0);
        if (riskInfo != null && riskInfo.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        String name2 = null;
        if (z) {
            IPipoService iPipoService = (IPipoService) PluggableExtentionKt.pluggableSpi$default(IPipoService.class, false, false, false, 14, null);
            if (iPipoService != null) {
                riskInfo = iPipoService.getRiskInfo();
            } else {
                riskInfo = null;
            }
        }
        if (c900203fU == null || (strT2 = c900203fU.LIZIZ) == null) {
            strT2 = C786410Ut5.t2(Locale.getDefault());
        }
        AgreementConfiguration agreementConfiguration = new AgreementConfiguration(strT2);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Object obj = c897703f5.LJII.get("previous_page");
        if (!(obj instanceof String)) {
            obj = null;
        }
        linkedHashMap.put("previous_page", obj);
        Object obj2 = c897703f5.LJII.get("source_page_type");
        if (!(obj2 instanceof String)) {
            obj2 = null;
        }
        linkedHashMap.put("source_page_type", obj2);
        Object obj3 = c897703f5.LJII.get("source_content_id");
        if (!(obj3 instanceof String)) {
            obj3 = null;
        }
        linkedHashMap.put("source_content_id", obj3);
        Object obj4 = c897703f5.LJII.get("source_enter_from");
        if (!(obj4 instanceof String)) {
            obj4 = null;
        }
        linkedHashMap.put("source_enter_from", obj4);
        Object obj5 = c897703f5.LJII.get("enter_from_info");
        if (!(obj5 instanceof String)) {
            obj5 = null;
        }
        linkedHashMap.put("enter_from_info", obj5);
        Object obj6 = c897703f5.LJII.get("product_id");
        if (!(obj6 instanceof String)) {
            obj6 = null;
        }
        linkedHashMap.put("product_id", obj6);
        Object obj7 = c897703f5.LJII.get("is_delivery_info_complete");
        if (!(obj7 instanceof String)) {
            obj7 = null;
        }
        linkedHashMap.put("is_delivery_info_complete", obj7);
        Object obj8 = c897703f5.LJII.get("source_from");
        if (!(obj8 instanceof String)) {
            obj8 = null;
        }
        linkedHashMap.put("source_from", obj8);
        Object obj9 = c897703f5.LJII.get("source");
        if (!(obj9 instanceof String)) {
            obj9 = null;
        }
        linkedHashMap.put("source", obj9);
        Object obj10 = c897703f5.LJII.get("entrance_info");
        if (!(obj10 instanceof String)) {
            obj10 = null;
        }
        linkedHashMap.put("entrance_info", obj10);
        Object obj11 = c897703f5.LJII.get("cart_item_id");
        if (!(obj11 instanceof String)) {
            obj11 = null;
        }
        linkedHashMap.put("cart_item_id", obj11);
        List<String> list = c897703f5.LIZIZ;
        if (list != null) {
            objLJJJLL = C13LP.LJJJLL(list);
        } else {
            objLJJJLL = null;
        }
        linkedHashMap.put("order_id", objLJJJLL);
        PaymentInfo paymentInfo = c897703f5.LJI;
        if (paymentInfo != null && (paymentMethod = paymentInfo.paymentMethod) != null) {
            str9 = paymentMethod.id;
        } else {
            str9 = null;
        }
        linkedHashMap.put("payment_method_id", str9);
        if (Intrinsics.LJFF(str8, "VISA_PAYMENT_SIGNAL")) {
            Object obj12 = c897703f5.LJII.get("source_enter_from");
            if (!(obj12 instanceof String) || obj12 == null) {
                obj12 = c897703f5.LJII.get("enter_from_info");
                if (!(obj12 instanceof String)) {
                    obj12 = null;
                }
            }
            linkedHashMap.put("enter_from", obj12);
            linkedHashMap.put("busi_line", "tts");
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = LocationDependencyService.createILocationDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                String name3 = ILocationDependencyService.class.getName();
                if (anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z3);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILocationDependencyService.class);
            }
            linkedHashMap.put("country_code", ((ILocationDependencyService) anonymousClass0317CreateILocationDependencyServicebyMonsterPlugin).getCurrentRegionCode());
            Object obj13 = c897703f5.LJII.get("previous_page");
            if (!(obj13 instanceof String)) {
                obj13 = null;
            }
            linkedHashMap.put("previous_page_id", obj13);
            Object obj14 = c897703f5.LJII.get("cashier_original_track_id");
            if ((obj14 instanceof String) && obj14 != null) {
                linkedHashMap.put("cashier_original_track_id", obj14);
            }
            Object obj15 = c897703f5.LJII.get("rendering_num");
            if ((obj15 instanceof Number) && (number = (Number) obj15) != null) {
                linkedHashMap.put("rendering_num", Integer.valueOf(number.intValue()));
            }
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime2 = SystemClock.elapsedRealtime();
            iECommerceHostService = (IECommerceHostService) ServiceManager.get().getService(IApplicationDependencyService.class);
            if (iECommerceHostService != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            String name4 = IApplicationDependencyService.class.getName();
            if (iECommerceHostService != null) {
                name2 = iECommerceHostService.getClass().getName();
            }
            C1AQS.LIZJ(jElapsedRealtime2, 1, name4, name2, z2);
        } else {
            C1120604Zw.LIZ.LIZ();
            iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
        }
        InterfaceC911603hK rootPageMonitor = ((IApplicationDependencyService) iECommerceHostService).getRootPageMonitor();
        if (rootPageMonitor != null && (top = rootPageMonitor.getTop()) != null && (context = top.LIZ) != null) {
            C1722170uut c1722170uut = GeneralPostPaymentGuideFragment.LLJILJIL;
            if (str10 == null) {
                str10 = "";
            }
            c1722170uut.getClass();
            C1722170uut.LIZ(str10, context, str, str6, str2, str3, str4, agreementConfiguration, riskInfo, str8, false, linkedHashMap);
        }
    }

    /* JADX WARN: Not initialized variable reg: 11, insn: 0x00df: MOVE (r2 I:??[OBJECT, ARRAY]) = (r11 I:??[OBJECT, ARRAY]) (LINE:234881247), block:B:30:0x00d6 */
    /* JADX WARN: Not initialized variable reg: 12, insn: 0x00e0: MOVE (r3 I:??[OBJECT, ARRAY]) = (r12 I:??[OBJECT, ARRAY]) (LINE:234881248), block:B:30:0x00d6 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x00e2: MOVE (r5 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]) (LINE:234881250), block:B:30:0x00d6 */
    /* JADX WARN: Not initialized variable reg: 14, insn: 0x00e3: MOVE (r6 I:??[OBJECT, ARRAY]) = (r14 I:??[OBJECT, ARRAY]) (LINE:234881251), block:B:30:0x00d6 */
    /* JADX WARN: Not initialized variable reg: 15, insn: 0x00e4: MOVE (r7 I:??[OBJECT, ARRAY]) = (r15 I:??[OBJECT, ARRAY]) (LINE:234881252), block:B:30:0x00d6 */
    /* JADX WARN: Not initialized variable reg: 4, insn: 0x00dd: MOVE (r0 I:??[OBJECT, ARRAY]) = (r4 I:??[OBJECT, ARRAY]) (LINE:234881245), block:B:30:0x00d6 */
    /* JADX WARN: Not initialized variable reg: 5, insn: 0x00e1: MOVE (r4 I:??[OBJECT, ARRAY]) = (r5 I:??[OBJECT, ARRAY]) (LINE:234881249), block:B:30:0x00d6 */
    /* JADX WARN: Not initialized variable reg: 9, insn: 0x00de: MOVE (r1 I:??[OBJECT, ARRAY]) = (r9 I:??[OBJECT, ARRAY]) (LINE:234881246), block:B:30:0x00d6 */
    public static final void LJJIL(final Context context, final C897703f5 c897703f5, final InterfaceC911103hF interfaceC911103hF, final String str, final NewPayInfo newPayInfo, final String str2, final String str3, final String str4, final String str5, final boolean z, final boolean z2, final String str6, final Map<String, String> map, final String str7) {
        C897703f5 c897703f52;
        Context context2;
        InterfaceC911103hF interfaceC911103hF2;
        String str8;
        NewPayInfo newPayInfo2;
        String str9;
        String str10;
        String str11;
        AnonymousClass0317 anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin;
        boolean z3;
        String name;
        try {
            if (str6.length() == 0) {
                LJJIIZI(c897703f5, context, interfaceC911103hF, str, newPayInfo, str2, str3, str4, null, null, null, null, null, null, null);
                return;
            }
            Activity activityLIZIZ = C1388190mED.LIZIZ(context);
            String str12 = null;
            if (activityLIZIZ == null) {
                if (C034S.LIZ()) {
                    C1120604Zw.LIZ.LIZ();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = ActivityStackDependencyService.createIActivityStackDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    String name2 = IActivityStackDependencyService.class.getName();
                    if (anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin.getClass().getName();
                    } else {
                        name = null;
                    }
                    C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z3);
                } else {
                    C1120604Zw.LIZ.LIZ();
                    anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IActivityStackDependencyService.class);
                }
                activityLIZIZ = ((IActivityStackDependencyService) anonymousClass0317CreateIActivityStackDependencyServicebyMonsterPlugin).getValidTopActivity();
                if (activityLIZIZ == null) {
                    LJJIIZI(c897703f5, context, interfaceC911103hF, str, newPayInfo, str2, str3, str4, null, null, null, null, null, null, null);
                    return;
                }
            }
            final long jCurrentTimeMillis = System.currentTimeMillis();
            C1725790v0j.LIZ.getClass();
            final boolean zLJFF = C1725790v0j.LJFF(context);
            if (zLJFF) {
                str12 = str6;
            }
            String str13 = PaymentTransitionActivity._pnsPageId;
            C935403lA.LIZ(activityLIZIZ, str12, new InterfaceC935503lB() { // from class: X.03gl
                @Override // X.InterfaceC935503lB
                public final void LIZ() {
                    boolean z4;
                    PaymentMethodInfo paymentMethodInfo;
                    PayResult payResult;
                    List<PaymentMethod> list;
                    PaymentMethod paymentMethod;
                    PaymentInfo paymentInfo;
                    C897703f5 c897703f53 = c897703f5;
                    Boolean boolIsChooseSave = null;
                    PaymentMethod paymentMethod2 = (c897703f53 == null || (paymentInfo = c897703f53.LJI) == null) ? null : paymentInfo.paymentMethod;
                    String str14 = c897703f53.LJJIJ ? "payment_method" : "order_submit";
                    PaymentMethodsData paymentMethodsData = c897703f53.LJJIIJZLJL;
                    if (paymentMethodsData != null && (list = paymentMethodsData.storedMethods) != null) {
                        Iterator<PaymentMethod> it2 = list.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                break;
                            }
                            PaymentMethod next = it2.next();
                            String strLJIIJ = next.LJIIJ();
                            PaymentInfo paymentInfo2 = c897703f53.LJI;
                            if (Intrinsics.LJFF(strLJIIJ, (paymentInfo2 == null || (paymentMethod = paymentInfo2.paymentMethod) == null) ? null : paymentMethod.LJIIJ())) {
                                z4 = next != null;
                            }
                        }
                    }
                    NewPayInfo newPayInfo3 = newPayInfo;
                    String strLIZ = (newPayInfo3 == null || (payResult = newPayInfo3.payResult) == null) ? null : C906603gW.LIZ(payResult);
                    PaymentInfo paymentInfo3 = c897703f5.LJI;
                    if (paymentInfo3 != null && (paymentMethodInfo = paymentInfo3.paymentMethodInfo) != null) {
                        boolIsChooseSave = paymentMethodInfo.isChooseSave();
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("redirect_cct_open_");
                    sbLIZ.append(zLJFF ? 1 : 0);
                    C834803Ny.LIZ("pay", paymentMethod2, boolIsChooseSave, Boolean.valueOf(z4), strLIZ, null, null, null, null, null, null, null, null, null, null, null, str14, null, null, null, null, null, null, null, C2188811AlT.LIZIZ(sbLIZ), str6, null, null, null, null, null, null, null, null, null, null, null, null, null, -100794400, 255);
                    if (zLJFF) {
                        return;
                    }
                    C907803gi.LJJIJIL(c897703f5, context, newPayInfo, str5, interfaceC911103hF, str, str2, str3, str4, z, str6, map, false, true, null, null);
                }

                /* JADX WARN: Removed duplicated region for block: B:74:0x014c  */
                /* JADX WARN: Removed duplicated region for block: B:88:0x0186  */
                /* JADX WARN: Removed duplicated region for block: B:93:0x01d5  */
                @Override // X.InterfaceC935503lB
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void onFinish(boolean r48) {
                    /*
                        Method dump skipped, instruction units count: 477
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C908103gl.onFinish(boolean):void");
                }
            });
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
            LJJIIZI(c897703f52, context2, interfaceC911103hF2, str8, newPayInfo2, str9, str10, str11, null, null, null, null, null, null, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x023b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03ca  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x03d0  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x03e1  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0197  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIIZI(X.C897703f5 r42, android.content.Context r43, X.InterfaceC911103hF r44, java.lang.String r45, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo r46, java.lang.String r47, java.lang.String r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, java.lang.String r53, java.lang.String r54, kotlin.jvm.functions.Function0<kotlin.Unit> r55, kotlin.jvm.functions.Function1<? super java.lang.Boolean, kotlin.Unit> r56) {
        /*
            Method dump skipped, instruction units count: 997
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907803gi.LJJIIZI(X.03f5, android.content.Context, X.03hF, java.lang.String, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function1):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0104  */
    /* JADX WARN: Type inference failed for: r4v7, types: [X.03gq] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIJLIJ(final android.content.Context r39, final X.C897703f5 r40, final com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo r41, final java.lang.String r42, final X.InterfaceC911103hF r43, final java.lang.String r44, final java.lang.String r45, final java.lang.String r46, final java.lang.String r47, final boolean r48, java.lang.String r49, final java.util.Map<java.lang.String, java.lang.String> r50, final boolean r51, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RedirectDetails r52, java.lang.String r53) {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907803gi.LJJIJLIJ(android.content.Context, X.03f5, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo, java.lang.String, X.03hF, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.Map, boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RedirectDetails, java.lang.String):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0053 A[Catch: all -> 0x0121, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0121, blocks: (B:4:0x001c, B:10:0x0035, B:12:0x003b, B:16:0x0053), top: B:68:0x001c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0123 A[Catch: all -> 0x0186, TRY_ENTER, TryCatch #1 {all -> 0x0186, blocks: (B:35:0x00cc, B:37:0x00d6, B:40:0x00e6, B:42:0x00ee, B:43:0x00f6, B:45:0x010d, B:44:0x00fe, B:51:0x0123, B:53:0x013d, B:56:0x014d, B:58:0x0155, B:59:0x015d, B:61:0x0174, B:60:0x0165), top: B:69:0x0051 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LJJIJIL(X.C897703f5 r24, android.content.Context r25, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo r26, java.lang.String r27, X.InterfaceC911103hF r28, java.lang.String r29, java.lang.String r30, java.lang.String r31, java.lang.String r32, boolean r33, java.lang.String r34, java.util.Map<java.lang.String, java.lang.String> r35, boolean r36, boolean r37, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RedirectDetails r38, java.lang.String r39) {
        /*
            Method dump skipped, instruction units count: 421
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C907803gi.LJJIJIL(X.03f5, android.content.Context, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.NewPayInfo, java.lang.String, X.03hF, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.lang.String, java.util.Map, boolean, boolean, com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.RedirectDetails, java.lang.String):void");
    }
}
