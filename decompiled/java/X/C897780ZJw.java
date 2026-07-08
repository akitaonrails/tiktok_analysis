package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0ZJw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C897780ZJw {
    public static final boolean LIZ(UrlModel urlModel, UrlModel urlModel2) {
        if (urlModel2 == null) {
            return false;
        }
        String strLIZIZ = LIZIZ(urlModel, true);
        String strLIZIZ2 = LIZIZ(urlModel2, true);
        if (strLIZIZ.length() == 0 || strLIZIZ2.length() == 0) {
            return false;
        }
        C1212690hf9.LIZ.getClass();
        if (C1212690hf9.LJFF) {
            return Intrinsics.LJFF(strLIZIZ, strLIZIZ2);
        }
        if (!Intrinsics.LJFF(strLIZIZ, strLIZIZ2) && !a0.LJJIIZI(strLIZIZ, strLIZIZ2, false) && !a0.LJJIIZI(strLIZIZ2, strLIZIZ, false)) {
            return false;
        }
        return true;
    }

    public static final String LIZIZ(UrlModel urlModel, boolean z) {
        boolean z2;
        String str;
        String str2;
        String uri = urlModel.getUri();
        if (uri != null && uri.length() > 0) {
            return urlModel.getUri();
        }
        if (z) {
            C1AF0.LIZJ("uri is empty");
        }
        List<String> urlList = urlModel.getUrlList();
        if (urlList != null && !urlList.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z2) {
            C1AF0.LIZJ("uriList is empty");
            return "";
        }
        List<String> urlList2 = urlModel.getUrlList();
        if (urlList2 == null || (str = (String) C13LP.LJJJLZIJ(0, urlList2)) == null) {
            str = "";
        }
        String encodedPath = UriProtector.parse(str).getEncodedPath();
        if (encodedPath == null) {
            encodedPath = "";
        }
        if (encodedPath.length() == 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("res is empty: ");
            List<String> urlList3 = urlModel.getUrlList();
            if (urlList3 != null) {
                str2 = (String) C13LP.LJJJLZIJ(0, urlList3);
            } else {
                str2 = null;
            }
            sbLIZ.append(str2);
            C1AF0.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            return "";
        }
        return encodedPath;
    }
}
