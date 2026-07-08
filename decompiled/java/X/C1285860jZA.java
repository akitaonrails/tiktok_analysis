package X;

import android.os.Build;
import java.util.Arrays;

/* JADX INFO: renamed from: X.0jZA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1285860jZA {
    public static final boolean LIZ;

    static {
        Build.MANUFACTURER.toLowerCase();
        LIZ = Arrays.asList("m6 note", "m721c").contains(Build.MODEL.toLowerCase());
    }
}
