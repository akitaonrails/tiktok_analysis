package X;

import android.app.Activity;
import android.content.Context;
import android.os.SystemClock;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PaymentPipoErrorCodeActionSettings;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoTtsCashierEnableSeCodeSettings;
import com.ss.android.ugc.aweme.ecommerce.base.payment.dto.Cashier;
import com.ss.android.ugc.aweme.ecommerce.dependency.appsetting.AppSettingDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.application.IApplicationDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.appsetting.IAppSettingDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.errorsdk.IErrorCodeSdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS185S0000000_1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.03ir, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C921103ir {
    public static InterfaceC921603iw LIZIZ;
    public static boolean LIZJ;
    public static boolean LIZLLL;
    public static final C921103ir LIZ = new C921103ir();
    public static final AFwS185S0000000_1 LJ = AFwS185S0000000_1.get$arr$(520);

    public static void LIZIZ() {
        if (LIZIZ == null) {
            LIZJ();
            boolean z = PipoTtsCashierEnableSeCodeSettings.LIZ() && !LIZJ;
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("getErrorMapping useClientSE : ");
            sbLIZ.append(LJII());
            sbLIZ.append(" , pullData ");
            sbLIZ.append(LIZJ);
            sbLIZ.append(", needTo pull ");
            sbLIZ.append(z);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ);
            if (z) {
                C23250099c.LIZLLL(C817503Hh.LL, C0PEM.LIZJ, null, new C921203is(null), 2);
            }
        }
    }

    public static void LIZJ() {
        String str;
        String currentLocaleStr;
        AnonymousClass0317 anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
        IECommerceHostService iECommerceHostService;
        String str2;
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("errorCodeSDK init SDK");
        C914303hl.LIZ.getClass();
        Cashier cashier = C914303hl.LIZIZ;
        String str3 = "";
        if ((cashier == null || (str = cashier.merchantId) == null) && (str = ((PaymentPipoErrorCodeActionSettings.PaymentErrorCode) PaymentPipoErrorCodeActionSettings.LIZIZ.getValue()).merchantId) == null) {
            str = "";
        }
        Cashier cashier2 = C914303hl.LIZIZ;
        if (cashier2 != null && (str2 = cashier2.merchantUserId) != null) {
            str3 = str2;
        }
        try {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = AppSettingDependencyService.createIAppSettingDependencyServicebyMonsterPlugin(false);
                C1AQS.LIZJ(jElapsedRealtime, 1, IAppSettingDependencyService.class.getName(), anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null ? anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin.getClass().getName() : null, anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin != null);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IAppSettingDependencyService.class);
            }
            IAppSettingDependencyService iAppSettingDependencyService = (IAppSettingDependencyService) anonymousClass0317CreateIAppSettingDependencyServicebyMonsterPlugin;
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                Object service = ServiceManager.get().getService(IApplicationDependencyService.class);
                IECommerceHostService iECommerceHostService2 = (IECommerceHostService) service;
                C1AQS.LIZJ(jElapsedRealtime2, 1, IApplicationDependencyService.class.getName(), iECommerceHostService2 != null ? iECommerceHostService2.getClass().getName() : null, iECommerceHostService2 != null);
                iECommerceHostService = (IECommerceHostService) service;
            } else {
                C1120604Zw.LIZ.LIZ();
                iECommerceHostService = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IApplicationDependencyService.class);
            }
            currentLocaleStr = iAppSettingDependencyService.getCurrentLocaleStr(((IApplicationDependencyService) iECommerceHostService).getApplicationContext());
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
            currentLocaleStr = "en";
        }
        C2341109Fh.LIZ.getClass();
        C2341109Fh.LIZ("errorCodeSDK mid " + str + " muid " + str3);
        IErrorCodeSdk iErrorCodeSdk = (IErrorCodeSdk) PluggableExtentionKt.pluggableSpi$default(IErrorCodeSdk.class, false, false, false, 14, null);
        LIZIZ = iErrorCodeSdk != null ? iErrorCodeSdk.LIZ("tts_payin_cashier", currentLocaleStr, str, str3) : null;
    }

    public static boolean LJII() {
        return PipoTtsCashierEnableSeCodeSettings.LIZ() && !LIZLLL;
    }

    public static boolean LJIIIIZZ() {
        if (!LJII()) {
            return false;
        }
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        PipoTtsCashierEnableSeCodeSettings.ErrorCodeClientSE errorCodeClientSE = PipoTtsCashierEnableSeCodeSettings.LIZ;
        PipoTtsCashierEnableSeCodeSettings.ErrorCodeClientSE errorCodeClientSE2 = (PipoTtsCashierEnableSeCodeSettings.ErrorCodeClientSE) settingsManagerLIZLLL.LJIIIIZZ("pipo_tts_cashier_enable_se_code_config", PipoTtsCashierEnableSeCodeSettings.ErrorCodeClientSE.class, errorCodeClientSE);
        if (errorCodeClientSE2 != null) {
            errorCodeClientSE = errorCodeClientSE2;
        }
        return Intrinsics.LJFF(errorCodeClientSE.enableSns, Boolean.TRUE) && !LIZLLL;
    }

    public static void LJI(String str) {
        String str2;
        if (str != null) {
            int iHashCode = str.hashCode();
            if (iHashCode != -1747807002) {
                if (iHashCode != -390864660) {
                    if (iHashCode == 2103471391) {
                        str2 = "orderdetail";
                    } else {
                        return;
                    }
                } else {
                    str2 = "orderlist";
                }
            } else {
                str2 = "ordersubmit";
            }
            str.equals(str2);
        }
    }

    public static String LIZ(String str, String str2) {
        LIZIZ();
        InterfaceC921603iw interfaceC921603iw = LIZIZ;
        if (interfaceC921603iw != null) {
            if (str == null) {
                str = "order_submit";
            }
            if (str2 == null) {
                str2 = "";
            }
            String strLIZJ = interfaceC921603iw.LIZJ(str, str2);
            if (strLIZJ != null) {
                return strLIZJ;
            }
        }
        return "";
    }

    public static void LJFF(Context context, String str, final Function2 function2) {
        C1710940ucm c1710940ucm;
        InterfaceC921603iw interfaceC921603iw;
        Activity activityLIZ = C1388190mED.LIZ(context);
        if (activityLIZ != null) {
            c1710940ucm = new C1710940ucm(activityLIZ, activityLIZ);
        } else {
            c1710940ucm = null;
            if (context != null) {
                c1710940ucm = new C1710940ucm(context, null);
            }
        }
        C2341109Fh c2341109Fh = C2341109Fh.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ErrorCode launchErrorCodeForResponse ");
        sbLIZ.append(activityLIZ);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        c2341109Fh.getClass();
        C2341109Fh.LIZ(strLIZIZ);
        LIZIZ();
        if (c1710940ucm != null && (interfaceC921603iw = LIZIZ) != null) {
            interfaceC921603iw.LIZLLL(c1710940ucm, str, new InterfaceC1725110uzd() { // from class: X.03iv
                @Override // X.InterfaceC1725110uzd
                public final void LIZIZ() {
                }

                @Override // X.InterfaceC1725110uzd
                public final void LIZ(C03XW c03xw, JSONObject jSONObject) {
                    Function2<C03XW, JSONObject, Unit> function22 = function2;
                    if (function22 != null) {
                        function22.invoke(c03xw, jSONObject);
                    }
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [X.03iu] */
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
    public static void LIZLLL(Context context, String str, String str2, String str3, final Function2 function2) {
        LIZIZ();
        if (context != null) {
            C1710940ucm c1710940ucm = new C1710940ucm(context, null);
            InterfaceC921603iw interfaceC921603iw = LIZIZ;
            if (interfaceC921603iw != 0) {
                interfaceC921603iw.LIZ(c1710940ucm, str, str2, str3, new InterfaceC1725110uzd() { // from class: X.03iu
                    @Override // X.InterfaceC1725110uzd
                    public final void LIZIZ() {
                    }

                    @Override // X.InterfaceC1725110uzd
                    public final void LIZ(C03XW c03xw, JSONObject jSONObject) {
                        C921103ir.LJ.invoke();
                        Function2<C03XW, JSONObject, Unit> function22 = function2;
                        if (function22 != null) {
                            function22.invoke(c03xw, jSONObject);
                        }
                    }
                });
            }
        }
    }
}
