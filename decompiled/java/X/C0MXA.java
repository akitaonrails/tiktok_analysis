package X;

import com.ss.android.ugc.aweme.portrait.model.PortraitUrlModel;
import java.util.List;

/* JADX INFO: renamed from: X.0MXA, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MXA {
    public static final String LIZ(PortraitUrlModel portraitUrlModel) {
        List<String> list;
        List<String> list2 = portraitUrlModel.urlList;
        if (list2 != null && !list2.isEmpty()) {
            return (String) C13LP.LJJJJZI(portraitUrlModel.urlList);
        }
        String str = portraitUrlModel.uri;
        if (str != null && str.length() != 0 && (list = portraitUrlModel.urlPrefix) != null && !list.isEmpty()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) C13LP.LJJJJZI(portraitUrlModel.urlPrefix));
            sbLIZ.append(portraitUrlModel.uri);
            return C2188811AlT.LIZIZ(sbLIZ);
        }
        return null;
    }
}
