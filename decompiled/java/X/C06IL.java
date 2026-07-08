package X;

import com.ss.android.ugc.aweme.experiment.IndependentAppBubbleItem;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.06IL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C06IL {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(IndependentAppBubbleItem independentAppBubbleItem, String str, String str2, String str3, String str4, String str5, String str6) {
        String string;
        String str7;
        C06IM.LIZ.getClass();
        if (independentAppBubbleItem != null && (str7 = independentAppBubbleItem.lockedBubbleOpenSchema) != null) {
            string = a0.LJLIIIL(str7).toString();
        } else {
            string = null;
        }
        if (string == null) {
            string = "";
        }
        if (a0.LJJJIL(string)) {
            return "";
        }
        String strLJJIFFI = u.LJJIFFI(string, "{media_source}", a0.LJLIIIL(str5).toString(), false);
        if (str == null) {
            str = "";
        }
        String strLJJIFFI2 = u.LJJIFFI(strLJJIFFI, "{uid}", a0.LJLIIIL(str).toString(), false);
        if (str3 == null) {
            str3 = "";
        }
        String strLJJIFFI3 = u.LJJIFFI(strLJJIFFI2, "{unlock_bubble_id}", a0.LJLIIIL(str3).toString(), false);
        if (str2 == null) {
            str2 = "";
        }
        return u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(strLJJIFFI3, "{cid}", a0.LJLIIIL(str2).toString(), false), "{conversation_type}", a0.LJLIIIL(str4).toString(), false), "{outer_enter_method}", a0.LJLIIIL(str6).toString(), false);
    }
}
