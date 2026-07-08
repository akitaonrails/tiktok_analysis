package X;

import android.content.res.Resources;
import android.text.TextUtils;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: X.0Vuj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final /* synthetic */ class C812910Vuj implements InterfaceC809260Voq {
    public static final Map LIZ() {
        HashMap map = new HashMap();
        String strT2 = C786410Ut5.t2(Locale.getDefault());
        if (!TextUtils.isEmpty(strT2)) {
            map.put("language", strT2);
        }
        String strLIZIZ = C837920Wty.LIZIZ(Locale.getDefault());
        if (!TextUtils.isEmpty(strLIZIZ)) {
            map.put("region", strLIZIZ.toLowerCase(Locale.getDefault()));
        }
        String strLIZIZ2 = C837920Wty.LIZIZ(Resources.getSystem().getConfiguration().locale);
        map.put("country", TextUtils.isEmpty(strLIZIZ2) ? "" : strLIZIZ2.toUpperCase(Locale.getDefault()));
        return map;
    }
}
