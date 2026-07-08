package X;

import com.ss.android.ugc.aweme.comment.model.Comment;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AFwS209S0000000_21;

/* JADX INFO: renamed from: X.0lFp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1350750lFp {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS209S0000000_21.get$arr$(683));

    public static String LIZ(Comment comment) {
        if (comment == null) {
            return "";
        }
        if (comment.getAliasAweme() != null) {
            return "video";
        }
        if (C1351950lHl.LJII(comment)) {
            if (C1533950q1J.LJ(comment.getText())) {
                return "photo_text";
            }
            return "photo";
        }
        if (C1351950lHl.LJIIIZ(comment)) {
            if (C1533950q1J.LJ(comment.getText())) {
                return "sticker_text";
            }
            return "sticker";
        }
        if (C1351950lHl.LJI(comment)) {
            if (C1533950q1J.LJ(comment.getText())) {
                return "audio_text";
            }
            return "audio";
        }
        String strLIZIZ = LIZIZ(comment.getText());
        C844470XAv.LIZ.getClass();
        C844470XAv.LIZ();
        int iLIZIZ = C439870HMr.LIZIZ(strLIZIZ);
        if (iLIZIZ != 0) {
            if (iLIZIZ != 1) {
                return "text_emoji";
            }
            return "emoji";
        }
        return "text_comment";
    }

    public static String LIZIZ(CharSequence charSequence) {
        if (charSequence == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); i++) {
            char cCharAt = charSequence.charAt(i);
            if (!((Pattern) LIZ.getValue()).matcher(String.valueOf(cCharAt)).matches()) {
                sb.append(cCharAt);
            }
        }
        return sb.toString();
    }
}
