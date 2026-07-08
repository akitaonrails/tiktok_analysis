package X;

import Y.ARunnableS98S0000000_23;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.geckox.model.Common;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/* JADX INFO: renamed from: X.0qTQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1551380qTQ {
    public static String LIZ;
    public static final List<Runnable> LIZIZ = new ArrayList();

    public static void LIZ() {
        C1551940qUK c1551940qUK = C797990VSb.LIZ;
        c1551940qUK.LIZIZ();
        if (c1551940qUK.LIZLLL == null) {
            return;
        }
        c1551940qUK.LIZIZ();
        Context context = c1551940qUK.LIZLLL.getContext();
        if (LIZ == null) {
            C1551420qTU c1551420qTU = C1551440qTW.LIZ;
            c1551420qTU.LIZIZ(context);
            LIZ = c1551420qTU.LIZ.getString("gecko_daily_task", "2021-09-15");
        }
        String str = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        if (TextUtils.equals(str, LIZ)) {
            return;
        }
        LIZ = str;
        C1551440qTW.LIZ.LIZJ(context, "gecko_daily_task", str);
        C1553130qWF.LIZ("gecko-debug-tag", "do daily task, date: ", str);
        C1551510qTd.LIZ.LIZ().execute(new ARunnableS98S0000000_23(18));
    }

    public static String LIZIZ() {
        Common commonLIZLLL = C797990VSb.LIZ.LIZLLL();
        return commonLIZLLL != null ? commonLIZLLL.appVersion : "";
    }
}
