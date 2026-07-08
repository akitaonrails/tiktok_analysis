package X;

import com.bytedance.pumbaa.entry.service.PathMatchRule;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07Zy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1885207Zy {
    public static PathMatchRule LIZ(String str) {
        boolean z;
        String string = a0.LJLIIIL(str).toString();
        if (string.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new PathMatchRule("exact", "");
        }
        int i = 0;
        for (int i2 = 0; i2 < string.length(); i2++) {
            if (string.charAt(i2) == '*') {
                i++;
            }
        }
        if (i == 0) {
            return new PathMatchRule("exact", string);
        }
        if (i == 1) {
            if (u.LJJIIJZLJL(string, "*", false)) {
                return new PathMatchRule("suffix", string.substring(1));
            }
            if (u.LJIIZILJ(string, "*", false)) {
                return new PathMatchRule("prefix", string.substring(0, string.length() - 1));
            }
        }
        return new PathMatchRule("regex", string);
    }
}
