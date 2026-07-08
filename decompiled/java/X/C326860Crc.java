package X;

import com.ss.android.ugc.aweme.poi.reviews.PoiReviewsApi;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Crc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326860Crc {
    public static final int LIZ(C20600815jK<InterfaceC1891350zJl> c20600815jK, String str, String str2) {
        PoiReviewsApi.PoiReviewModel poiReviewModel;
        if (c20600815jK == null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('[');
            sbLIZ.append(str2);
            sbLIZ.append("] indexOfReviewById: state=null");
            C2188811AlT.LIZIZ(sbLIZ);
            return -1;
        }
        int i = 0;
        if (str != null && str.length() != 0) {
            ArrayList arrayList = (ArrayList) c20600815jK.LJII();
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    InterfaceC1891350zJl interfaceC1891350zJl = (InterfaceC1891350zJl) it2.next();
                    String reviewId = null;
                    if ((interfaceC1891350zJl instanceof PoiReviewsApi.PoiReviewModel) && (poiReviewModel = (PoiReviewsApi.PoiReviewModel) interfaceC1891350zJl) != null) {
                        reviewId = poiReviewModel.getReviewId();
                    }
                    if (Intrinsics.LJFF(reviewId, str)) {
                        if (i == -1) {
                            break;
                        }
                    } else {
                        i++;
                    }
                } else {
                    i = -1;
                    break;
                }
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append('[');
            sbLIZ2.append(str2);
            sbLIZ2.append("] indexOfReviewById: reviewId=");
            sbLIZ2.append(str);
            sbLIZ2.append(" not found, size=");
            sbLIZ2.append(arrayList.size());
            C2188811AlT.LIZIZ(sbLIZ2);
            return i;
        }
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append('[');
        sbLIZ3.append(str2);
        sbLIZ3.append("] indexOfReviewById: reviewId blank");
        C2188811AlT.LIZIZ(sbLIZ3);
        return -1;
    }
}
