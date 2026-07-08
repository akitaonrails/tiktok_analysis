package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Oht, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C626590Oht {
    public static UrlModel LIZ(int i, int i2, String str) {
        if (str == null) {
            return null;
        }
        UrlModel urlModel = new UrlModel();
        urlModel.setHeight(i2);
        urlModel.setWidth(i);
        urlModel.setUri(str);
        ArrayList arrayList = new ArrayList();
        arrayList.add(str);
        urlModel.setUrlList(arrayList);
        return urlModel;
    }
}
