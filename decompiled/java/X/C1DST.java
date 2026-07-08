package X;

import android.os.Build;
import java.util.Locale;

/* JADX INFO: renamed from: X.1DST, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public abstract class C1DST {
    public static final Locale LIZ = Locale.getDefault();

    public String LIZ() {
        String str = Build.DISPLAY;
        return str == null ? "unknown" : str;
    }
}
