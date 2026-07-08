package X;

import android.os.SystemClock;
import android.view.View;
import com.bytedance.analytics.util.SwitchToBDBTMModel;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.performanceopt.api.IDowngradeApi;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0w4z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1766870w4z {
    public static final C1766870w4z LIZ = new C1766870w4z();
    public static volatile boolean LIZIZ = true;

    static {
        IDowngradeApi iDowngradeApi = (IDowngradeApi) PluggableExtentionKt.pluggableSpi$default(IDowngradeApi.class, false, false, false, 14, null);
        if (iDowngradeApi != null) {
            iDowngradeApi.LJI(new C1766880w50());
        }
        C23250099c.LIZLLL(C2296808zG.LIZ(C2126308Ur.LIZIZ), null, null, new C05IS(null), 3);
    }

    public static boolean LIZLLL() {
        return C1767060w5I.LJII.getValue().f10switch == 1;
    }

    public static boolean LIZ(String str) {
        SwitchToBDBTMModel switchToBDBTMModel = C1767060w5I.LJI;
        if (!switchToBDBTMModel.f11switch || switchToBDBTMModel.paramsAllowList.isEmpty()) {
            return true;
        }
        return C1767060w5I.LJI.paramsAllowList.contains(str);
    }

    public static String LIZJ(View view, String str, String str2) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        String str3;
        boolean z;
        String name;
        if (LIZIZ) {
            return null;
        }
        if (C034S.LIZ()) {
            C1120604Zw.LIZ.LIZ();
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = LogDependencyService.createILogDependencyServicebyMonsterPlugin(false);
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                z = true;
            } else {
                z = false;
            }
            String name2 = ILogDependencyService.class.getName();
            if (anonymousClass0317CreateILogDependencyServicebyMonsterPlugin != null) {
                name = anonymousClass0317CreateILogDependencyServicebyMonsterPlugin.getClass().getName();
            } else {
                name = null;
            }
            C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
        } else {
            C1120604Zw.LIZ.LIZ();
            anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
        }
        Pair<Boolean, Boolean> bDBTMReplaceSwitch = ((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getBDBTMReplaceSwitch();
        boolean zBooleanValue = bDBTMReplaceSwitch.getFirst().booleanValue();
        boolean zBooleanValue2 = bDBTMReplaceSwitch.getSecond().booleanValue();
        if (!zBooleanValue) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("prefix_ec_params_");
        sbLIZ.append(str);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> bcmParamsWithKey = BtmSDK.getBcmParamsWithKey(PageFinder.via(view), Collections.singletonList(strLIZIZ), EnumC21242418Ba.EMPTY, C18BZ.APP_TAB, 20, true);
        if (bcmParamsWithKey == null) {
            bcmParamsWithKey = C2097608Jq.LJ();
        }
        Object obj = bcmParamsWithKey.get(strLIZIZ);
        if (obj instanceof String) {
            str3 = (String) obj;
        } else {
            str3 = null;
        }
        if (C1767060w5I.LJI.sendDiffTrack) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("{\"");
            sbLIZ2.append(str);
            sbLIZ2.append("\": \"");
            sbLIZ2.append(str3);
            sbLIZ2.append("\"}");
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("{\"");
            sbLIZ3.append(str);
            sbLIZ3.append("\": \"");
            sbLIZ3.append(str2);
            sbLIZ3.append("\"}");
            C1018703yb.LIZIZ("btm_tt_switch_to_bd_diff", C2097608Jq.LJIIIIZZ(new Pair("key", strLIZIZ), new Pair("bd_params", C2188811AlT.LIZIZ(sbLIZ2)), new Pair("tt_params", C2188811AlT.LIZIZ(sbLIZ3)), new Pair("type", "get_ec_param")));
        }
        if (!zBooleanValue2) {
            return null;
        }
        Object obj2 = bcmParamsWithKey.get(strLIZIZ);
        if (!(obj2 instanceof String)) {
            return null;
        }
        return (String) obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x002c, code lost:
    
        if (X.C1767060w5I.LJII.getValue().write2LastCreatePage != 1) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r0 = com.bytedance.android.btm.api.BtmSDK.INSTANCE.getLastCreatePage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0034, code lost:
    
        r4 = com.bytedance.android.btm.api.model.PageFinder.via(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007b, code lost:
    
        r0 = com.bytedance.android.btm.api.BtmSDK.INSTANCE.getCurrentResumedPage();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(boolean r5, java.util.List r6, java.util.Map r7) {
        /*
            boolean r0 = LIZLLL()
            if (r0 != 0) goto L7
            return
        L7:
            java.util.Iterator r1 = r6.iterator()
        Lb:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L21
            java.lang.Object r4 = r1.next()
            com.bytedance.android.btm.api.model.PageFinder r4 = (com.bytedance.android.btm.api.model.PageFinder) r4
            com.bytedance.android.btm.api.BtmSDK r0 = com.bytedance.android.btm.api.BtmSDK.INSTANCE
            X.18Cs r0 = r0.getBtmPageInfoV2(r4)
            if (r0 == 0) goto Lb
            if (r4 != 0) goto L38
        L21:
            X.01GW<com.bytedance.analytics.util.BtmPageSourceConfigModel> r0 = X.C1767060w5I.LJII
            java.lang.Object r0 = r0.getValue()
            com.bytedance.analytics.util.BtmPageSourceConfigModel r0 = (com.bytedance.analytics.util.BtmPageSourceConfigModel) r0
            int r1 = r0.write2LastCreatePage
            r0 = 1
            if (r1 != r0) goto L7b
            com.bytedance.android.btm.api.BtmSDK r0 = com.bytedance.android.btm.api.BtmSDK.INSTANCE
            java.lang.Object r0 = r0.getLastCreatePage()
        L34:
            com.bytedance.android.btm.api.model.PageFinder r4 = com.bytedance.android.btm.api.model.PageFinder.via(r0)
        L38:
            X.188v r6 = com.bytedance.android.bcm.api.model.BcmParams.Companion
            if (r5 == 0) goto L83
            java.util.LinkedHashMap r5 = new java.util.LinkedHashMap
            int r0 = r7.size()
            int r0 = X.C2097908Jt.LIZIZ(r0)
            r5.<init>(r0)
            java.util.Set r0 = r7.entrySet()
            java.util.Iterator r3 = r0.iterator()
        L51:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L82
            java.lang.Object r2 = r3.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.StringBuilder r1 = X.C2188811AlT.LIZ()
            java.lang.String r0 = "prefix_ec_params_"
            r1.append(r0)
            java.lang.Object r0 = r2.getKey()
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r1 = X.C2188811AlT.LIZIZ(r1)
            java.lang.Object r0 = r2.getValue()
            r5.put(r1, r0)
            goto L51
        L7b:
            com.bytedance.android.btm.api.BtmSDK r0 = com.bytedance.android.btm.api.BtmSDK.INSTANCE
            java.lang.Object r0 = r0.getCurrentResumedPage()
            goto L34
        L82:
            r7 = r5
        L83:
            r6.getClass()
            com.bytedance.android.bcm.api.model.BcmParams r2 = X.C212367188v.LIZJ(r7)
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            X.18BS r0 = X.C18BV.LIZ
            r0.setBcmPageParams(r4, r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1766870w4z.LJ(boolean, java.util.List, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01f8  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0202  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo LIZIZ(com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource r17, com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo r18, java.lang.String r19, java.lang.String r20) {
        /*
            Method dump skipped, instruction units count: 957
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1766870w4z.LIZIZ(com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSource, com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo, java.lang.String, java.lang.String):com.ss.android.ugc.aweme.ecommercebase.pagesource.PageSourceInfo");
    }

    public static void LJFF(String str, String str2, List list, boolean z) {
        C13DA c13da = new C13DA();
        c13da.put(str, str2);
        LJ(z, list, c13da.build());
    }
}
