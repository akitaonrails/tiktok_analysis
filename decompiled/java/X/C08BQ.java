package X;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: renamed from: X.08BQ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08BQ {
    public static List<String> LIZ() {
        String strLJJ = C0C64.LJIILLIIL().LJJ(31744, "4530_bg_uninstall_df_names", "", true);
        if (TextUtils.isEmpty(strLJJ)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] strArrSplit = strLJJ.split(",");
        for (String str : strArrSplit) {
            arrayList.add(str.trim());
        }
        return arrayList;
    }
}
