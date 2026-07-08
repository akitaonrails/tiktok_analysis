package X;

import android.net.Uri;
import android.util.Log;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.09gh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2436509gh {
    public static final <T extends AbstractC2437009gm<E>, E extends C2436109gd> E LIZ(T t, Uri uri, Map<String, String> map) {
        LinkedHashMap linkedHashMap;
        if (map != null) {
            linkedHashMap = new LinkedHashMap(map);
        } else {
            linkedHashMap = new LinkedHashMap();
        }
        Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
        if (queryParameterNames != null) {
            for (String str : queryParameterNames) {
                String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null) {
                    linkedHashMap.put(str, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
                }
            }
        }
        Class cls = (Class) t.LIZ.getValue();
        if (cls == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("schemaModelClass is null,handler class is ");
            sbLIZ.append(t.getClass().getSimpleName());
            try {
                C1CC2.LJII(1, "livesdk_schema_handle", C2097608Jq.LJIIIIZZ(new Pair("base_uri", uri.buildUpon().clearQuery().build().toString()), new Pair("full_uri", uri.toString()), new Pair("stack_trace", Log.getStackTraceString(new Throwable())), new Pair("scheme", uri.getScheme()), new Pair("host", uri.getHost()), new Pair("error_message", C2188811AlT.LIZIZ(sbLIZ))));
                C189200o6.m2constructorimpl(Unit.LIZ);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
        E e = (E) GsonProtectorUtils.fromJson(C19748512Ol.LIZIZ, C786410Ut5.J3(new JSONObject(linkedHashMap)), cls);
        if (e != null) {
            e.LIZ = uri;
        }
        return e;
    }
}
