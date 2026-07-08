package X;

import android.net.Uri;
import com.bytedance.hybrid.spark.roma.config.ShortLinkConfig;
import com.bytedance.mt.protector.impl.UriProtector;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08ww, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2282408ww extends C09AY implements Function0<String> {
    public final /* synthetic */ C2282508wx LL;
    public final /* synthetic */ boolean LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2282408ww(C2282508wx c2282508wx, boolean z) {
        super(0);
        this.LL = c2282508wx;
        this.LLILLJJLI = z;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        String str;
        Iterable iterableLJJLIIIJ;
        ShortLinkConfig shortLinkConfig = this.LL.LJFF;
        if (shortLinkConfig == null || shortLinkConfig.strictMode != 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            C2282208wu c2282208wu = C2282208wu.LIZ;
            C2282508wx c2282508wx = this.LL;
            ShortLinkConfig shortLinkConfig2 = c2282508wx.LJFF;
            if (shortLinkConfig2 == null || (str = shortLinkConfig2.schemeTemplate) == null) {
                str = "";
            }
            Map<String, String> mapLJ = c2282508wx.LJ;
            if (mapLJ == null) {
                mapLJ = C2097608Jq.LJ();
            }
            boolean z = this.LLILLJJLI;
            c2282208wu.getClass();
            String strLIZIZ = C2282208wu.LIZIZ(str, mapLJ, linkedHashMap, z);
            C2282508wx c2282508wx2 = this.LL;
            c2282508wx2.LJIIJ = C2282208wu.LJII(c2282508wx2.LJ, linkedHashMap);
            C1550300qRg.LIZIZ.getClass();
            HashSet hashSet = (HashSet) C1550300qRg.LJIIIIZZ.getValue();
            if (hashSet.isEmpty()) {
                return strLIZIZ;
            }
            Set<String> setLJJL = C13LP.LJJL(linkedHashMap.keySet(), hashSet);
            if (setLJJL.isEmpty()) {
                return strLIZIZ;
            }
            c2282508wx2.LJIIIIZZ = setLJJL;
            StringBuilder sb = new StringBuilder(strLIZIZ);
            for (String str2 : setLJJL) {
                String str3 = (String) linkedHashMap.get(str2);
                if (str3 != null) {
                    sb.append("&");
                    sb.append(str2);
                    sb.append("=");
                    sb.append(Uri.encode(str3));
                }
            }
            return sb.toString();
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        C2282208wu c2282208wu2 = C2282208wu.LIZ;
        C2282508wx c2282508wx3 = this.LL;
        String str4 = c2282508wx3.LJFF.schemeTemplate;
        Map<String, String> map = c2282508wx3.LJ;
        c2282208wu2.getClass();
        String strLIZIZ2 = C2282208wu.LIZIZ(str4, map, linkedHashMap2, false);
        C2282508wx c2282508wx4 = this.LL;
        c2282508wx4.LJIIJ = C2282208wu.LJII(c2282508wx4.LJ, linkedHashMap2);
        Uri uri = UriProtector.parse(strLIZIZ2);
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
        String str5 = (String) linkedHashMap2.get("roma_url_query_keys");
        if (str5 == null || (iterableLJJLIIIJ = a0.LJJLIIIJ(str5, new char[]{'&'}, false, 0, 6)) == null) {
            iterableLJJLIIIJ = C13BV.INSTANCE;
        }
        Set setLLIIJI = C13LP.LLIIJI(iterableLJJLIIIJ);
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (setLLIIJI.contains(entry.getKey())) {
                linkedHashMap3.put(entry.getKey(), entry.getValue());
            }
        }
        Set setKeySet = linkedHashMap3.keySet();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap(linkedHashMap2);
        linkedHashMap4.keySet().removeAll(setKeySet instanceof Collection ? setKeySet : C13LP.LLIIII(setKeySet));
        Map mapLJIIIZ = C2097608Jq.LJIIIZ("spark_page", C2097608Jq.LJIIIZ("roma_url_query_keys", C2097608Jq.LJIIJJI(linkedHashMap4)));
        c2282508wx4.LJI = mapLJIIIZ.keySet();
        c2282508wx4.LJII = linkedHashMap3.keySet();
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null || a0.LJJJIL(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter) || linkedHashMap3.isEmpty()) {
            return C2282208wu.LIZ(uri, mapLJIIIZ).toString();
        }
        HashMap map2 = new HashMap(mapLJIIIZ);
        map2.put("url", C2282208wu.LIZ(UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter), linkedHashMap3).toString());
        return C2282208wu.LIZ(uri, map2).toString();
    }
}
