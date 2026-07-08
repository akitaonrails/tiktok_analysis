package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0xxF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1838950xxF {
    public static final String LIZ(UrlModel urlModel) {
        List<String> urlList = urlModel.getUrlList();
        if (urlList != null) {
            return (String) C13LP.LJJJLL(urlList);
        }
        return null;
    }

    public static final String LIZIZ(UrlModel urlModel) {
        if (urlModel != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("UrlModel: ");
            sbLIZ.append(urlModel.getUrlList());
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return "";
    }
}
