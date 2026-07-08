package X;

import android.content.Context;
import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pipo.IPipoContainerService;
import com.ss.android.ugc.aweme.pipo.IPipoService;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0ull, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1716510ull {
    public static final C1716510ull LIZ = new C1716510ull();

    public static Map LIZ(String str) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1716550ulp.LIZ.getClass();
        C1717080umg c1717080umgLJFF = C1716550ulp.LJFF(str);
        if (c1717080umgLJFF != null) {
            linkedHashMap.put("merchant_id", c1717080umgLJFF.LIZLLL.LIZ);
            linkedHashMap.put("merchant_user_id", c1717080umgLJFF.LIZLLL.LIZIZ);
            linkedHashMap.put(Scene.SCENE_SERVICE, str);
            linkedHashMap.put("phone_region", c1717080umgLJFF.LJI);
            linkedHashMap.put("priority_region", C1717770unn.LJIIIIZZ().getCurrentRegionCode());
        }
        return linkedHashMap;
    }

    public static void LIZIZ(C1716510ull c1716510ull, Context context, String str, boolean z, boolean z2, boolean z3, String str2, String str3, String str4, String str5, int i) {
        boolean z4 = z3;
        boolean z5 = z2;
        boolean z6 = z;
        if ((i & 4) != 0) {
            z6 = false;
        }
        if ((i & 8) != 0) {
            z5 = false;
        }
        if ((i & 16) != 0) {
            z4 = false;
        }
        String str6 = null;
        if ((i & 128) != 0) {
            str4 = null;
        }
        if ((i & 256) == 0) {
            str6 = str5;
        }
        c1716510ull.getClass();
        if (str.length() != 0) {
            Uri.Builder builderBuildUpon = UriProtector.parse(str).buildUpon();
            if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "use_forest") == null) {
                builderBuildUpon.appendQueryParameter("use_forest", "1");
            }
            if (UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), "access_key") == null) {
                builderBuildUpon.appendQueryParameter("access_key", ((IPipoService) ServiceManager.get().getService(IPipoService.class)).LIZLLL());
            }
            String string = builderBuildUpon.build().toString();
            C1718900upc.LIZ.getClass();
            String strLIZJ = C1718900upc.LIZJ(string, str3, "", str2, str6, null, z6, z4);
            if (C1948507kB.LIZ(str4)) {
                C1716520ulm c1716520ulmLJIILJJIL = ((IPipoContainerService) ServiceManager.get().getService(IPipoContainerService.class)).LJIILJJIL(strLIZJ, str2);
                if (c1716520ulmLJIILJJIL.LIZIZ) {
                    strLIZJ = UriProtector.parse(c1716520ulmLJIILJJIL.LIZ).buildUpon().appendQueryParameter("proxy_enabled_runtime_type", "1").appendQueryParameter("disable_ttnet_proxy", CardStruct.IStatusCode.DEFAULT).build().toString();
                }
            }
            C1718900upc.LJFF(context, strLIZJ, LIZ(str2), z5);
        }
    }
}
