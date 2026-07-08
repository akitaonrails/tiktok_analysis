package X;

import android.net.Uri;
import android.os.SystemClock;
import android.util.Log;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.dependency.log.LogDependencyService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.event.ILogDependencyService;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0XQj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C848510XQj {
    public static final C848510XQj LIZ = new C848510XQj();

    public static void LIZ(String str) {
        AnonymousClass0317 anonymousClass0317CreateILogDependencyServicebyMonsterPlugin;
        boolean z;
        String string;
        try {
            if (!C848520XQk.LIZ().sdkSwitch) {
                return;
            }
            Uri uri = UriProtector.parse(str);
            if (uri.isHierarchical()) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "ec_fake_pre_btm");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    JSONObject jSONObject = new JSONObject(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                    String strOptString = jSONObject.optString("page_code");
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("data");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    String name = null;
                    if (jSONObjectOptJSONObject != null) {
                        Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            Object objOpt = jSONObjectOptJSONObject.opt(next);
                            if (objOpt != null) {
                                string = objOpt.toString();
                            } else {
                                string = null;
                            }
                            linkedHashMap.put(next, string);
                        }
                    }
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("### insert virtual page: ");
                    sbLIZ.append(strOptString);
                    sbLIZ.append(", btm: ");
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
                        }
                        C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
                    } else {
                        C1120604Zw.LIZ.LIZ();
                        anonymousClass0317CreateILogDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(ILogDependencyService.class);
                    }
                    sbLIZ.append(((ILogDependencyService) anonymousClass0317CreateILogDependencyServicebyMonsterPlugin).getPageRecordChainStringData(true));
                    C2188811AlT.LIZIZ(sbLIZ);
                    C2211631BhB.LJIILL(strOptString, linkedHashMap);
                    return;
                }
                return;
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("invalid url: ");
            sbLIZ2.append(str);
            C2188811AlT.LIZIZ(sbLIZ2);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            String stackTraceString = Log.getStackTraceString(th);
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("url: ");
            sbLIZ3.append(str);
            sbLIZ3.append(", err: ");
            sbLIZ3.append(stackTraceString);
            C2188811AlT.LIZIZ(sbLIZ3);
        }
    }
}
