package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.n;
import com.google.gson.reflect.TypeToken;
import com.google.gson.s;
import com.ss.android.ugc.aweme.ecommerce.saas.core.IECommerceHostService;
import com.ss.android.ugc.aweme.ecommerce.saas.core.dependency.eclive.IECLiveDependencyService;
import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.ecommercelive.audience.common.saas.ECLiveDependencyService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0hOG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202220hOG {
    public static final C1202220hOG LIZ = new C1202220hOG();

    public static List LIZ(EnumC1161720gKw enumC1161720gKw) {
        if (!C290570BaB.LIZ() || enumC1161720gKw == null) {
            return null;
        }
        int i = C1161730gKx.LIZ[enumC1161720gKw.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return Collections.singletonList("Store.Product_Page_Feeds.Double");
        }
        return Collections.singletonList("Store.Product_Page_Feeds.Single");
    }

    public static n LIZIZ(Object obj, Object obj2) {
        String str;
        String str2;
        AnonymousClass0317 anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin;
        boolean z;
        String name;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        if (obj2 instanceof String) {
            str2 = (String) obj2;
        } else {
            str2 = null;
        }
        if (str != null && !a0.LJJJIL(str) && str2 != null && !a0.LJJJIL(str2)) {
            if (C034S.LIZ()) {
                C1120604Zw.LIZ.LIZ();
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin = ECLiveDependencyService.createIECLiveDependencyServicebyMonsterPlugin(false);
                if (anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin != null) {
                    z = true;
                } else {
                    z = false;
                }
                String name2 = IECLiveDependencyService.class.getName();
                if (anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin != null) {
                    name = anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin.getClass().getName();
                } else {
                    name = null;
                }
                C1AQS.LIZJ(jElapsedRealtime, 1, name2, name, z);
            } else {
                C1120604Zw.LIZ.LIZ();
                anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin = (IECommerceHostService) C1120604Zw.LIZJ.LIZLLL(IECLiveDependencyService.class);
            }
            String str3 = (String) obj;
            String str4 = (String) obj2;
            n liveRelatedProductInfo = ((IECLiveDependencyService) anonymousClass0317CreateIECLiveDependencyServicebyMonsterPlugin).getLiveRelatedProductInfo(str3, str4);
            if (liveRelatedProductInfo != null) {
                return liveRelatedProductInfo;
            }
            n nVarLJIIIZ = ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJIIIZ(str3, str4);
            if (nVarLJIIIZ != null) {
                return nVarLJIIIZ;
            }
        }
        return null;
    }

    public static List LIZJ(String str, String str2) {
        String str3;
        boolean z;
        Type type;
        try {
            JSONArray jSONArrayOptJSONArray = new JSONObject(str).optJSONArray(str2);
            boolean z2 = true;
            ArrayList arrayList = null;
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList2 = new ArrayList();
                int length = jSONArrayOptJSONArray.length();
                for (int i = 0; i < length; i++) {
                    String strValueOf = String.valueOf(jSONArrayOptJSONArray.get(i));
                    try {
                        Gson gsonLJFF = C1741890vQh.LJFF();
                        C1120604Zw.LIZ.getClass();
                        C1121904a9 c1121904a9LIZIZ = C1120604Zw.LIZIZ();
                        if (c1121904a9LIZIZ == null || !c1121904a9LIZIZ.LJII) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (!z) {
                            type = new TypeToken<String>() { // from class: X.0hOH
                            }.getType();
                        } else {
                            type = C2371409Qy.LIZJ(C13LE.LJII(String.class));
                        }
                        Object objLJIIIIZZ = gsonLJFF.LJIIIIZZ(strValueOf, type);
                        if (!(objLJIIIIZZ instanceof String)) {
                            objLJIIIIZZ = null;
                        }
                        str3 = (String) objLJIIIIZZ;
                    } catch (s e) {
                        TryCatchGuardChecker.doCheck(e);
                        str3 = null;
                    }
                    if (str3 != null) {
                        arrayList2.add(str3);
                    }
                }
                arrayList = arrayList2;
            }
            if (arrayList == null || !(!arrayList.isEmpty())) {
                z2 = false;
            }
            if (!z2) {
                return C13BV.INSTANCE;
            }
            return arrayList;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            C2341109Fh c2341109Fh = C2341109Fh.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Parse trackParams error in showcase tab, originJson:");
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            c2341109Fh.getClass();
            C2341109Fh.LIZJ(strLIZIZ);
            return C13BV.INSTANCE;
        }
    }
}
