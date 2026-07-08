package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.Arrays;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0VrW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C810920VrW {
    public static final Pattern LIZLLL = PatternProtector.compile("[a-zA-Z0-9-_.~%]{1,900}");
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.LIZIZ, this.LIZ});
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C810920VrW)) {
            return false;
        }
        C810920VrW c810920VrW = (C810920VrW) obj;
        if (!this.LIZ.equals(c810920VrW.LIZ) || !this.LIZIZ.equals(c810920VrW.LIZIZ)) {
            return false;
        }
        return true;
    }

    public C810920VrW(String str, String str2) {
        String strSubstring;
        if (str2 != null && str2.startsWith("/topics/")) {
            strSubstring = str2.substring(8);
        } else {
            strSubstring = str2;
        }
        if (strSubstring != null && LIZLLL.matcher(strSubstring).matches()) {
            this.LIZ = strSubstring;
            this.LIZIZ = str;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(str);
            sbLIZ.append("!");
            sbLIZ.append(str2);
            this.LIZJ = C2188811AlT.LIZIZ(sbLIZ);
            return;
        }
        throw new IllegalArgumentException(C786410Ut5.j4("Invalid topic name: %s does not match the allowed format %s.", new Object[]{strSubstring, "[a-zA-Z0-9-_.~%]{1,900}"}));
    }
}
