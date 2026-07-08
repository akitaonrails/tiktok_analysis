package X;

import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: renamed from: X.13p8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20127213p8 {
    public static final long LIZIZ = TimeUnit.HOURS.toSeconds(1);
    public static final Pattern LIZJ = PatternProtector.compile("\\AA[\\w-]{38}\\z");
    public static C20127213p8 LIZLLL;
    public final InterfaceC20128913pP LIZ;

    public C20127213p8(C20128713pN c20128713pN) {
        this.LIZ = c20128713pN;
    }

    public final boolean LIZ(C20126713p3 c20126713p3) {
        if (TextUtils.isEmpty(c20126713p3.LIZLLL)) {
            return true;
        }
        long j = c20126713p3.LJI + c20126713p3.LJFF;
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        this.LIZ.getClass();
        if (j < timeUnit.toSeconds(System.currentTimeMillis()) + LIZIZ) {
            return true;
        }
        return false;
    }
}
