package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.pumbaa.app2app.data.App2AppUri;
import com.bytedance.pumbaa.app2app.data.KV;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* JADX INFO: renamed from: X.0WaE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C825680WaE {
    public static final App2AppUri LIZ(Uri uri) {
        ArrayList arrayList;
        List<String> list;
        if (!uri.isOpaque()) {
            arrayList = new ArrayList();
            Set<String> queryParameterNames = UriProtector.getQueryParameterNames(uri);
            if (queryParameterNames != null) {
                for (String str : queryParameterNames) {
                    arrayList.add(new KV(str, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str)));
                }
            }
        } else {
            arrayList = null;
        }
        String scheme = uri.getScheme();
        if (scheme != null && (list = C825710WaH.LJ) != null && list.contains(scheme)) {
            return new App2AppUri(uri.getScheme(), null, null, arrayList);
        }
        return new App2AppUri(uri.getScheme(), uri.getHost(), uri.getPath(), arrayList);
    }
}
