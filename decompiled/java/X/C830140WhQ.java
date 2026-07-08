package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0WhQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C830140WhQ {
    public static final Pattern LJ = PatternProtector.compile("[ |\t]*([^/^ ^;^,]+/[^ ^;^,]+)", 2);
    public static final Pattern LJFF = PatternProtector.compile("[ |\t]*(charset)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public static final Pattern LJI = PatternProtector.compile("[ |\t]*(boundary)[ |\t]*=[ |\t]*['|\"]?([^\"^'^;^,]*)['|\"]?", 2);
    public final String LIZ;
    public final String LIZIZ;
    public final String LIZJ;
    public final String LIZLLL;

    public final String LIZ() {
        String str = this.LIZJ;
        return str == null ? "US-ASCII" : str;
    }

    public C830140WhQ(String str) {
        String strGroup;
        this.LIZ = str;
        if (str != null) {
            Matcher matcher = LJ.matcher(str);
            this.LIZIZ = matcher.find() ? matcher.group(1) : "";
            Matcher matcher2 = LJFF.matcher(str);
            if (matcher2.find()) {
                strGroup = matcher2.group(2);
            } else {
                strGroup = null;
            }
            this.LIZJ = strGroup;
        } else {
            this.LIZIZ = "";
            this.LIZJ = "UTF-8";
        }
        if ("multipart/form-data".equalsIgnoreCase(this.LIZIZ)) {
            Matcher matcher3 = LJI.matcher(str);
            this.LIZLLL = matcher3.find() ? matcher3.group(2) : null;
        } else {
            this.LIZLLL = null;
        }
    }
}
