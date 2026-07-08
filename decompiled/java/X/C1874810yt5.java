package X;

import com.ss.android.ugc.aweme.creative.model.AutoPickModel;
import java.util.Locale;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0yt5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1874810yt5 {
    public static final boolean LIZ(AutoPickModel autoPickModel) {
        String str = autoPickModel.themeName;
        if ((str == null || a0.LJJJIL(str)) && !(!autoPickModel.mediaList.isEmpty())) {
            return false;
        }
        return true;
    }

    public static final void LIZIZ(AutoPickModel autoPickModel, String str, String str2) {
        String string;
        String upperCase;
        String strLJJI;
        String str3;
        autoPickModel.themeName = str;
        if (str2 != null && (string = a0.LJLIIIL(str2).toString()) != null && (upperCase = string.toUpperCase(Locale.US)) != null && (strLJJI = u.LJJI(upperCase, '-', '_', false)) != null) {
            if (!a0.LJJIIZI(strLJJI, "ON_THIS_DAY", false) && !a0.LJJIIZI(strLJJI, "ONTHISDAY", false)) {
                if (a0.LJJIIZI(strLJJI, "WEEK", false)) {
                    str3 = "week";
                } else if (a0.LJJIIZI(strLJJI, "REVERSE", false)) {
                    str3 = "reverse";
                } else if (a0.LJJIIZI(strLJJI, "RECAP", false)) {
                    str3 = "recap";
                } else if (!a0.LJJIIZI(strLJJI, "DAILY", false)) {
                    return;
                } else {
                    str3 = "daily";
                }
            } else {
                str3 = "on_this_day";
            }
            autoPickModel.pickType = str3;
        }
    }
}
