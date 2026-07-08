package X;

import com.ss.android.ugc.aweme.creative.model.publish.DescAutoFillTrackModel;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.0McI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C572160McI {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZLLL() {
        return C0C64.LJIILLIIL().LJIJ(0, 0, "text_mode_fill_desc_from_image_text", true);
    }

    public static boolean LJ() {
        return LIZLLL() > 0;
    }

    public static boolean LJI() {
        return LIZLLL() == 4;
    }

    public static String LIZ(String str) {
        int iLIZLLL = LIZLLL();
        if (1 <= iLIZLLL && iLIZLLL < 5) {
            if (a0.LJJIIZI(str, "#AskTikTok #TikTokDoYourMagic", false)) {
                if (u.LJIIZILJ(str, "#AskTikTok #TikTokDoYourMagic", false)) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append(str);
                    sbLIZ.append(' ');
                    return C2188811AlT.LIZIZ(sbLIZ);
                }
                return str;
            }
            if (a0.LJJJIL(str)) {
                return "#AskTikTok #TikTokDoYourMagic ";
            }
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(str);
            sbLIZ2.append("\n#AskTikTok #TikTokDoYourMagic ");
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        return str;
    }

    public static String LJII(String str) {
        boolean z;
        if (str != null && !a0.LJJJIL(str)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return null;
        }
        String string = a0.LJLIIIL(u.LJJIFFI(u.LJJIFFI(u.LJJIFFI(str, "#AskTikTok #TikTokDoYourMagic", "", false), "#AskTikTok", "", false), "#TikTokDoYourMagic", "", false)).toString();
        if (a0.LJJJIL(string)) {
            return null;
        }
        return string;
    }

    public static final String LIZJ(String str, String str2) {
        if (str != null && str.length() != 0) {
            return "help_seeking_search";
        }
        if (str2 != null && str2.length() != 0) {
            return "comment_to_post";
        }
        return "help_seeking_post";
    }

    public static String LIZIZ(String str, boolean z, boolean z2) {
        if (str == null) {
            str = "";
        }
        String string = a0.LJLIIIL(str).toString();
        if (!LJ()) {
            return "";
        }
        boolean z3 = false;
        if (LIZLLL() == 1 && !z2) {
            z3 = true;
        }
        if (z) {
            if (z3) {
                return "#AskTikTok #TikTokDoYourMagic ";
            }
            return LIZ(string);
        }
        if (z3) {
            return "";
        }
        return string;
    }

    public static void LJFF(DescAutoFillTrackModel descAutoFillTrackModel, String str, boolean z, boolean z2) {
        String strLJII;
        String str2;
        if (!LJ()) {
            return;
        }
        if (z2 && (strLJII = LJII(str)) != null && ((str2 = descAutoFillTrackModel.proposedText) == null || str2.length() == 0)) {
            descAutoFillTrackModel.proposedText = strLJII;
            descAutoFillTrackModel.textViaCard = z;
        }
        if (str != null) {
            if (a0.LJJIIZI(str, "#AskTikTok", false) || a0.LJJIIZI(str, "#TikTokDoYourMagic", false)) {
                String str3 = descAutoFillTrackModel.proposedHashtags;
                if (str3 == null || str3.length() == 0) {
                    descAutoFillTrackModel.proposedHashtags = "#AskTikTok #TikTokDoYourMagic";
                    descAutoFillTrackModel.hashtagViaCard = z;
                }
            }
        }
    }
}
