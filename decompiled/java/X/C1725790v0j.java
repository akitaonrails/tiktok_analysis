package X;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.bytedance.router.monitor.RouterPageMonitor;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.compliance.ComplianceDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.compliance.IComplianceDependencyService;
import java.net.URLEncoder;
import java.util.List;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0v0j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1725790v0j {
    public static final C1725790v0j LIZ = new C1725790v0j();
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("android.intent.action.CHOOSER", "android.intent.action.SEND", "android.intent.action.SEND_MULTIPLE", "android.media.action.IMAGE_CAPTURE", "android.media.action.IMAGE_CAPTURE_SECURE", "android.media.action.VIDEO_CAPTURE");

    public static boolean LJFF(Context context) {
        try {
            String strLIZIZ = C817470W4z.LIZIZ(context, C13BV.INSTANCE);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("CustomTabsClient PackageName: ");
            sbLIZ.append(strLIZIZ);
            String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZ(strLIZIZ2);
            return C770702zh.LIZIZ(strLIZIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C2341109Fh c2341109Fh2 = C2341109Fh.LIZ;
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("CustomTabsClient getPackageName exception: ");
            sbLIZ2.append(th.getMessage());
            String strLIZIZ3 = C2188811AlT.LIZIZ(sbLIZ2);
            c2341109Fh2.getClass();
            C2341109Fh.LIZJ(strLIZIZ3);
            C1AF0.LJFF(th, "ThirdAppUtils.supportCustomTabs");
            return false;
        }
    }

    public static void LIZ(Context context, Intent intent) {
        RouterPageMonitor.INSTANCE.getDispatcher().dispatchActivityOpReached(context, intent, "Context_startActivity_1");
        C1701330uNH.LIZ(intent, context);
        C2204961BRm.LJJJJJL(context, intent, new C0WZX("dzBzEhEpEcvSUUUuTBbKc9NnF3kueWo2KO+rbJLD2SDodnunYfVY5LYMiv8vk50q9jDGuDRlENHw6S0=", null));
    }

    public static boolean LIZIZ(String str, String str2) {
        boolean zLJ = false;
        if ((str == null || str.length() == 0) && (str2 == null || str2.length() == 0)) {
            return false;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        if ((TextUtils.isEmpty(str) || !(zLJ = C2162308dZ.LJFF(C7879035x.LIZ(), str))) && !TextUtils.isEmpty(str2)) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(UriProtector.parse(str2));
            zLJ = C2162308dZ.LJ(C7879035x.LIZ(), intent);
        }
        if (((Boolean) C0BA4.LIZ.getValue()).booleanValue()) {
            long jCurrentTimeMillis2 = System.currentTimeMillis() - jCurrentTimeMillis;
            int i = C1505950pI9.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('{');
            sbLIZ.append(str);
            sbLIZ.append("}_");
            sbLIZ.append(str2);
            C1505950pI9.LIZJ(jCurrentTimeMillis2, "checkAppInstall", C2188811AlT.LIZIZ(sbLIZ));
        }
        return zLJ;
    }

    public static boolean LIZJ(Context context, String str, String str2) {
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        boolean z;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2;
        boolean z2;
        String name;
        String name2 = null;
        try {
            Intent intent = new Intent("android.intent.action.VIEW", UriProtector.parse(str));
            intent.addFlags(268435456);
            intent.setPackage(str2);
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 != null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                String name3 = IComplianceDependencyService.class.getName();
                if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 != null) {
                    name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name3, name, z2);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
            }
            ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2).appendDataFlowId(intent, 1207969298);
            LIZ(context, intent);
            return true;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("open app link url:");
            sbLIZ.append(str);
            sbLIZ.append(", pkg: ");
            sbLIZ.append(str2);
            sbLIZ.append(" failed ");
            sbLIZ.append(e.getMessage());
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZJ(strLIZIZ);
            C2341109Fh.LIZ("try to open in webview");
            if (u.LJJIIJZLJL(str, "http", false)) {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("aweme://webview/?url=");
                sbLIZ2.append(URLEncoder.encode(str, "UTF-8"));
                str = C2188811AlT.LIZIZ(sbLIZ2);
            }
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(str);
            sbLIZ3.append("&use_spark=1");
            SmartRoute smartRouteBuildRoute = SmartRouter.buildRoute(context, C2188811AlT.LIZIZ(sbLIZ3));
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
            smartRouteBuildRoute.withParam(((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(new Bundle(), EnumC992703uP.PIPO_NON_ISOLATE_CONTAINER));
            smartRouteBuildRoute.open();
            return false;
        }
    }

    public static void LIZLLL(Context context, String str, boolean z) throws Throwable {
        if (str.length() == 0) {
            return;
        }
        C0WWF c0wwfLIZ = new C0WWG().LIZ();
        if (z) {
            c0wwfLIZ.LIZ.setFlags(268435456);
        }
        c0wwfLIZ.LIZ(context, UriProtector.parse(str));
    }

    public static boolean LJ(Context context, String str, String str2) throws Throwable {
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin;
        boolean z;
        AnonymousClass0317 anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2;
        boolean z2;
        C1120604Zw c1120604Zw = C1120604Zw.LIZ;
        if (C743880TFy.LIZ(C7879035x.LIZ(), str)) {
            try {
                String name = null;
                if (!TextUtils.isEmpty(str2)) {
                    if (u.LJJIIJZLJL(str2, "intent://", false)) {
                        Intent uri = Intent.parseUri(str2, 1);
                        uri.setFlags(268435456);
                        if (C034S.LIZ()) {
                            c1120604Zw.LIZ();
                            long jElapsedRealtime = SystemClock.elapsedRealtime();
                            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            String name2 = IComplianceDependencyService.class.getName();
                            if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 != null) {
                                name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2.getClass().getName();
                            }
                            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z2);
                        } else {
                            c1120604Zw.LIZ();
                            anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2 = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
                        }
                        ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin2).appendDataFlowId(uri, 1207969298);
                        SettingsManager.LIZLLL().getClass();
                        if (SettingsManager.LIZ("ec_payment_handle_intent_vulnerability", false)) {
                            C2341109Fh.LIZ.getClass();
                            C2341109Fh.LJ("Checking intent scheme intent's vulnerability");
                            ActivityInfo activityInfoResolveActivityInfo = uri.resolveActivityInfo(context.getPackageManager(), 65536);
                            if (activityInfoResolveActivityInfo != null && activityInfoResolveActivityInfo.exported) {
                                if (C13LP.LJJJJ(uri.getAction(), LIZIZ)) {
                                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                                    sbLIZ.append("The intent action is illegal: ");
                                    sbLIZ.append(uri.getAction());
                                    C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
                                    return false;
                                }
                                LIZ(context, uri);
                                return true;
                            }
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("Failed to resolve activity for url: ");
                            sbLIZ2.append(str2);
                            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ2));
                            return false;
                        }
                        C2341109Fh.LIZ.getClass();
                        C2341109Fh.LJ("Skip checking intent scheme intent's vulnerability");
                        LIZ(context, uri);
                        return true;
                    }
                    LIZLLL(context, str2, true);
                    return true;
                }
                Intent intentLIZIZ = C2162308dZ.LIZIZ(context, str);
                if (C034S.LIZ()) {
                    c1120604Zw.LIZ();
                    long jElapsedRealtime2 = SystemClock.elapsedRealtime();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = ComplianceDependencyService.createIComplianceDependencyServicebyMonsterPlugin(false);
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    String name3 = IComplianceDependencyService.class.getName();
                    if (anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin != null) {
                        name = anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin.getClass().getName();
                    }
                    C1AQS.LIZJ(jElapsedRealtime2, 1, name3, name, z);
                } else {
                    c1120604Zw.LIZ();
                    anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IComplianceDependencyService.class);
                }
                ((IComplianceDependencyService) anonymousClass0317CreateIComplianceDependencyServicebyMonsterPlugin).appendDataFlowId(intentLIZIZ, 1207969298);
                LIZ(context, intentLIZIZ);
                return true;
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return false;
    }
}
