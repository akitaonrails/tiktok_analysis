package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0ozR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1494350ozR {
    public final Pattern LIZ;

    public C1494350ozR(String str) {
        this.LIZ = PatternProtector.compile(str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1494350ozR.class == obj.getClass()) {
            C1494350ozR c1494350ozR = (C1494350ozR) obj;
            Pattern pattern = this.LIZ;
            if (pattern == null) {
                if (c1494350ozR.LIZ == null) {
                    return true;
                }
            } else {
                if (c1494350ozR.LIZ != null && pattern.pattern().equals(c1494350ozR.LIZ.pattern()) && this.LIZ.flags() == c1494350ozR.LIZ.flags()) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }
}
