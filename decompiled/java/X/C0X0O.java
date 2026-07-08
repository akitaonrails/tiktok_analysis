package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0X0O, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X0O {
    public static final Pattern LIZLLL = PatternProtector.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    public static final Pattern LJ = PatternProtector.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        return this.LIZ;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof C0X0O) && ((C0X0O) obj).LIZ.equals(this.LIZ)) {
            return true;
        }
        return false;
    }

    public C0X0O(String str, String str2, String str3) {
        this.LIZ = str;
        this.LIZIZ = str2;
        this.LIZJ = str3;
    }
}
