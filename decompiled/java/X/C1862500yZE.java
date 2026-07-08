package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.tako.model.TakoEnterParams;
import com.ss.android.ugc.aweme.tako.router.model.TakoAutoSendData;
import com.ss.android.ugc.aweme.tako.router.model.TakoBehaviorCollectData;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0yZE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1862500yZE {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(TakoEnterParams takoEnterParams, boolean z) {
        TakoAutoSendData takoAutoSendData;
        Map<String, String> map;
        Map<String, String> map2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        TakoBehaviorCollectData takoBehaviorCollectData = takoEnterParams.behaviorCollectData;
        if (takoBehaviorCollectData != null && (map2 = takoBehaviorCollectData.sendMessageMobParams) != null) {
            linkedHashMap.putAll(map2);
        }
        if (z && (takoAutoSendData = takoEnterParams.autoSendData) != null && (map = takoAutoSendData.mobParams) != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public static String LIZIZ(Uri uri, String str) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() > 0) {
            return strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        }
        return null;
    }
}
