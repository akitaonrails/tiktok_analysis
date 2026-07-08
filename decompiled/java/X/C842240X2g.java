package X;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.0X2g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C842240X2g {
    public static List<String> LIZ(ImageModel imageModel) {
        URI uri;
        if (!C842250X2h.LIZ().isEmpty() && !C0IKQ.LIZ(imageModel.mUrls) && imageModel.sortedUrlsByDomainCache.isEmpty()) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < imageModel.mUrls.size(); i++) {
                String str = (String) ListProtector.get(imageModel.mUrls, i);
                if (!TextUtils.isEmpty(str)) {
                    try {
                        uri = new URI(str);
                    } catch (URISyntaxException e) {
                        TryCatchGuardChecker.doCheck(e);
                        uri = null;
                    }
                    if (uri != null && uri.getHost() != null && uri.getHost().endsWith(C842250X2h.LIZ())) {
                        if (i == 0) {
                            List<String> list = imageModel.mUrls;
                            imageModel.sortedUrlsByDomainCache = list;
                            return list;
                        }
                        arrayList.add(str);
                    } else {
                        arrayList2.add(str);
                    }
                }
            }
            ArrayList arrayList3 = new ArrayList(arrayList);
            arrayList3.addAll(arrayList2);
            imageModel.sortedUrlsByDomainCache = arrayList3;
            imageModel.mUrls = arrayList3;
        }
        return imageModel.mUrls;
    }
}
