package X;

import com.bytedance.mt.protector.impl.PatternProtector;
import java.nio.charset.Charset;
import java.util.regex.Pattern;
import kotlin.jvm.internal.AFwS200S0000000_13;

/* JADX INFO: renamed from: X.0Vme, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public abstract class AbstractC807900Vme {
    public static final Charset LIZ = Charset.forName("utf-8");
    public static final Pattern LIZIZ = PatternProtector.compile("\\[\\d+,\\d+\\]");
    public static final Pattern LIZJ = PatternProtector.compile("\\<\\d+,\\d+,\\d+\\>");
    public static final Pattern LIZLLL = PatternProtector.compile("(\\[\\d+:\\d+.\\d+\\])+");
    public static final Pattern LJ = PatternProtector.compile("\\[\\d+:\\d+.\\d+\\]");
    public static final C01GW<String[]> LJFF = C452501pT.LIZ(EnumC452301pR.NONE, AFwS200S0000000_13.get$arr$(319));

    public abstract C766330U4h LIZ(C0VSP c0vsp);
}
