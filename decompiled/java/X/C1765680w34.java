package X;

import com.bytedance.bddatefmt.BDDateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: renamed from: X.0w34, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1765680w34 {
    public static final BDDateFormat LIZ = new BDDateFormat("lt");
    public static final BDDateFormat LIZIZ = new BDDateFormat("lll-Y");
    public static final SimpleDateFormat LIZJ;

    static {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm:ss", Locale.ENGLISH);
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("GMT"));
        LIZJ = simpleDateFormat;
    }
}
