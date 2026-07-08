package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0nbl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1441230nbl {
    public static UrlModel LIZ(com.ss.android.ugc.effectmanager.common.model.UrlModel urlModel) {
        UrlModel urlModel2 = new UrlModel();
        if (urlModel != null) {
            urlModel2.setUri(urlModel.getUri());
            urlModel2.setUrlList(new ArrayList(urlModel.getUrlList()));
        }
        return urlModel2;
    }
}
