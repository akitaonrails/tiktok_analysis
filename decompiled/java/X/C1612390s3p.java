package X;

import com.ss.android.ugc.aweme.model.CollectionDetailModel;
import com.ss.android.ugc.aweme.model.UrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0s3p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1612390s3p {
    public static final C1614390s73 LIZ(CollectionDetailModel collectionDetailModel) {
        String str;
        List<String> urlList;
        UrlModel urlModel = collectionDetailModel.collectionCover;
        if (urlModel != null && (urlList = urlModel.getUrlList()) != null) {
            str = (String) C13LP.LJJJLZIJ(0, urlList);
        } else {
            str = null;
        }
        return new C1614390s73(str, collectionDetailModel.collectionName, collectionDetailModel.numWatched);
    }
}
