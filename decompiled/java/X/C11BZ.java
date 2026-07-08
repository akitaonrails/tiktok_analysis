package X;

import android.app.Activity;
import android.text.TextUtils;
import com.ss.android.ugc.aweme.commerce.tools.mission.Mission;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import com.ss.android.ugc.aweme.services.uikit.CreativeToastBuilder;
import com.ss.android.ugc.aweme.utils.ActivityStack;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.11BZ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11BZ {
    public static final C11BZ LIZ = new C11BZ();

    public static String LIZIZ(String str) {
        int length = str.length();
        if (!TextUtils.isEmpty(str)) {
            int i = length - 1;
            int length2 = str.length();
            while (i >= 0) {
                char cCharAt = str.charAt(i);
                if (cCharAt == ' ' || Intrinsics.LJFF(String.valueOf(cCharAt), C786410Ut5.N3(C0CHQ.LIZ).getString(2131848665)) || cCharAt == '@' || cCharAt == '\n') {
                    return "";
                }
                if (cCharAt == '#') {
                    break;
                }
                i--;
            }
            while (length < length2) {
                char cCharAt2 = str.charAt(length);
                if (cCharAt2 == '#' || cCharAt2 == ' ' || Intrinsics.LJFF(String.valueOf(cCharAt2), C786410Ut5.N3(C0CHQ.LIZ).getString(2131848665)) || cCharAt2 == '@' || cCharAt2 == '\n') {
                    break;
                }
                length++;
            }
            if (i >= 0 && length <= length2 && i < length) {
                return str.substring(i, length);
            }
        }
        return "";
    }

    public static String LIZJ(String str, String str2) {
        int iMax;
        if (!TextUtils.isEmpty(str)) {
            if (str != null) {
                iMax = Math.max(str2.length() - str.length(), 0);
            } else {
                iMax = 0;
            }
            return str2.substring(0, iMax);
        }
        return str2;
    }

    public static void LIZ(Mission mission, int i, String str, EnumC19458811Ba enumC19458811Ba) {
        String str2;
        List<String> customizedStatement = mission.getCustomizedStatement();
        if (customizedStatement != null && (str2 = (String) C13LP.LJJJLL(customizedStatement)) != null && u.LJJIIJZLJL(str, str2, false) && i >= 0 && i < str2.length()) {
            Activity topActivity = ActivityStack.getTopActivity();
            if (topActivity != null) {
                CreativeToastBuilder creativeToastBuilder = new CreativeToastBuilder();
                creativeToastBuilder.icon(R.raw.icon_exclamation_mark_circle_fill);
                creativeToastBuilder.iconColorRes(R.attr.ee);
                creativeToastBuilder.duration(Mp4ScreenVideoLoadTimeout.CONTROL);
                creativeToastBuilder.messageRes(2131837306);
                C1390380mHk.LIZ(topActivity, 2038, creativeToastBuilder);
            }
            new C11BY().LJIJI(mission, 11);
            if (enumC19458811Ba != EnumC19458811Ba.LL) {
                new C11BY().LJIILLIIL(mission, 11);
            }
        }
    }
}
