package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.12wj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C19919512wj {
    public final C19919412wi<String, Pattern> LIZ = new C19919412wi<>();

    public final Pattern LIZ(String str) {
        Object obj;
        C19919412wi<String, Pattern> c19919412wi = this.LIZ;
        synchronized (c19919412wi) {
            obj = c19919412wi.LIZ.get(str);
        }
        Pattern pattern = (Pattern) obj;
        if (pattern == null) {
            Pattern patternCompile = PatternProtector.compile(str);
            this.LIZ.LIZ(str, patternCompile);
            return patternCompile;
        }
        return pattern;
    }
}
