package X;

import com.ss.android.ugc.aweme.base.ImageUrlModel;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.0HIf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C438710HIf {
    public static ImageUrlModel LIZ(UrlModel urlModel) {
        return LIZIZ(urlModel, Boolean.FALSE);
    }

    public static ImageUrlModel LIZJ(String str) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        return new ImageUrlModel("", arrayList);
    }

    public static ImageUrlModel LIZIZ(UrlModel urlModel, Boolean bool) {
        if (urlModel == null) {
            return new ImageUrlModel("", Collections.emptyList());
        }
        List<String> urlList = urlModel.getUrlList();
        String uri = urlModel.getUri();
        if (bool.booleanValue() && urlList != null && !urlList.isEmpty()) {
            urlList = urlList.subList(0, 1);
        }
        return new ImageUrlModel(uri, urlList);
    }
}
