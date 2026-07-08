package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.13ql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20137313ql {
    public static final Pattern LIZ = PatternProtector.compile("^[0-9a-zA-Z\\-\\.\\_\\~]{43,128}$");

    public static void LIZ(String str) {
        boolean z;
        boolean z2 = true;
        if (43 <= str.length()) {
            z = true;
        } else {
            z = false;
        }
        C20137213qk.LIZ("codeVerifier length is shorter than allowed by the PKCE specification", z);
        if (str.length() > 128) {
            z2 = false;
        }
        C20137213qk.LIZ("codeVerifier length is longer than allowed by the PKCE specification", z2);
        C20137213qk.LIZ("codeVerifier string contains illegal characters", LIZ.matcher(str).matches());
    }
}
