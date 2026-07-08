package X;

import android.net.Uri;
import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import java.util.ArrayList;

/* JADX INFO: renamed from: X.0Cro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C326980Cro {
    public final Keva LIZ = Keva.getRepo("repo_local_cover");

    public final UrlModel LIZ(String str) {
        boolean z;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String string = this.LIZ.getString(str, "");
        if (!new C0VSJ(string).exists()) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(Uri.fromFile(new C0VSJ(string)).toString());
        UrlModel urlModel = new UrlModel();
        urlModel.setUrlList(arrayList);
        return urlModel;
    }
}
