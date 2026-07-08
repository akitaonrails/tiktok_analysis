package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: X.03IT, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03IT {
    public List<String> LIZ = new ArrayList();

    public final boolean LIZ() {
        List<String> list = this.LIZ;
        return list == null || list.isEmpty();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BaseImageUrlModel{mUrls=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C03IT(List<String> list) {
        if (list != null && !list.isEmpty()) {
            for (String str : list) {
                if (!TextUtils.isEmpty(str)) {
                    this.LIZ.add(str);
                }
            }
        }
    }
}
