package X;

import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;

/* JADX INFO: renamed from: X.0Wv4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838600Wv4 {
    public static Locale LIZ() {
        if (Build.VERSION.SDK_INT >= 24) {
            C844470XAv.LIZ.getClass();
            return C844470XAv.LIZ().getResources().getConfiguration().getLocales().get(0);
        }
        C844470XAv.LIZ.getClass();
        return C844470XAv.LIZ().getResources().getConfiguration().locale;
    }

    public static boolean LIZIZ() {
        return TextUtils.equals(C786410Ut5.t2(Locale.getDefault()), C786410Ut5.t2(Locale.CHINESE)) || TextUtils.equals(C786410Ut5.t2(Locale.getDefault()), C786410Ut5.t2(Locale.ENGLISH));
    }
}
