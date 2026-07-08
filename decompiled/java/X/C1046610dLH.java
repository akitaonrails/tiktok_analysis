package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0dLH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1046610dLH implements Serializable, Cloneable {
    public static final Pattern LL = PatternProtector.compile("(\\d{2}):(\\d{2}):(\\d{2})(\\.(\\d{3}))?");
    public boolean byWrapper;
    public List<C1045330dJD> clickList;
    public String duration;
    public List<C1045320dJC> iconList;
    public String id;
    public List<C1046650dLL> mediaFileList;
    public List<C1046670dLN> trackingEventList;

    public long getDurationInMs() {
        String str = this.duration;
        if (str == null || str.length() == 0) {
            return 0L;
        }
        Matcher matcher = LL.matcher(this.duration);
        if (!matcher.matches()) {
            return 0L;
        }
        long millis = TimeUnit.HOURS.toMillis(CastLongProtector.parseLong(matcher.group(1))) + 0 + TimeUnit.MINUTES.toMillis(CastLongProtector.parseLong(matcher.group(2))) + TimeUnit.SECONDS.toMillis(CastLongProtector.parseLong(matcher.group(3)));
        String strGroup = matcher.group(5);
        return (strGroup == null || strGroup.length() == 0) ? millis : millis + CastLongProtector.parseLong(strGroup);
    }
}
