package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastLongProtector;
import java.io.Serializable;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.0dJ6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1045260dJ6 implements Serializable, Cloneable {
    public static final Pattern LL = PatternProtector.compile("(\\d{2}):(\\d{2}):(\\d{2})(\\.(\\d{3}))?");
    public boolean byWrapper;
    public List<C1045060dIm> clickList;
    public String duration;
    public List<C1045070dIn> iconList;
    public String id;
    public List<C1045280dJ8> mediaFileList;
    public List<C1045050dIl> trackingEventList;

    public long getDurationInMs() {
        if (C2105908Mv.LIZ(this.duration)) {
            return 0L;
        }
        Matcher matcher = LL.matcher(this.duration);
        if (!matcher.matches()) {
            return 0L;
        }
        long millis = TimeUnit.HOURS.toMillis(CastLongProtector.parseLong(matcher.group(1))) + 0 + TimeUnit.MINUTES.toMillis(CastLongProtector.parseLong(matcher.group(2))) + TimeUnit.SECONDS.toMillis(CastLongProtector.parseLong(matcher.group(3)));
        String strGroup = matcher.group(5);
        return !C2105908Mv.LIZ(strGroup) ? millis + CastLongProtector.parseLong(strGroup) : millis;
    }
}
