package X;

import android.text.TextUtils;
import kotlin.jvm.functions.Function2;

/* JADX INFO: renamed from: X.0mB5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1386250mB5 {
    public static String LIZ;
    public static boolean LIZIZ;

    public static final void LIZ(String str, Function2<? super String, ? super String, ? extends Object> function2) {
        String str2;
        if (TextUtils.equals(str, "sticker_profile_detail")) {
            function2.invoke("enter_method", "profile_tab_anchor");
            if (LIZIZ) {
                str2 = "personal_homepage";
            } else {
                str2 = "others_homepage";
            }
            function2.invoke("enter_from", str2);
        }
    }
}
