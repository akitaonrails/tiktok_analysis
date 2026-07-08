package X;

import com.bytedance.android.livesdk.livesetting.other.LiveToolbarIconStyleSetting;
import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.18vN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21439918vN {
    public static boolean LIZ(int i, CharSequence charSequence) {
        if (i < charSequence.length()) {
            char cCharAt = charSequence.charAt(i);
            switch (cCharAt) {
                case LiveToolbarIconStyleSetting.GRAY_WITHOUT_TEXT /* 33 */:
                case LiveToolbarIconStyleSetting.COLORFUL_WITHOUT_TEXT /* 34 */:
                case '#':
                case LiveToolbarIconStyleSetting.HIGHLIGHT_WITHOUT_TEXT /* 36 */:
                case '%':
                case '&':
                case '\'':
                case '(':
                case ')':
                case '*':
                case '+':
                case ',':
                case '-':
                case '.':
                case '/':
                    return true;
                default:
                    switch (cCharAt) {
                        case ':':
                        case ';':
                        case '<':
                        case '=':
                        case BaseNotice.CREATOR /* 62 */:
                        case '?':
                        case '@':
                            return true;
                        default:
                            switch (cCharAt) {
                                case '[':
                                case '\\':
                                case ']':
                                case '^':
                                case '_':
                                case '`':
                                    return true;
                                default:
                                    switch (cCharAt) {
                                        case '{':
                                        case '|':
                                        case '}':
                                        case '~':
                                            return true;
                                        default:
                                            return false;
                                    }
                            }
                    }
            }
        }
        return false;
    }

    public static int LIZJ(int i, int i2, CharSequence charSequence) {
        while (i < i2) {
            char cCharAt = charSequence.charAt(i);
            if (cCharAt != '\t' && cCharAt != ' ') {
                return i;
            }
            i++;
        }
        return i2;
    }

    public static int LIZIZ(char c, CharSequence charSequence, int i, int i2) {
        while (i < i2) {
            if (charSequence.charAt(i) != c) {
                return i;
            }
            i++;
        }
        return i2;
    }
}
