package X;

import java.text.SimpleDateFormat;
import java.util.Date;

/* JADX INFO: renamed from: X.01oH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C445101oH {
    public static final SimpleDateFormat LIZ = new SimpleDateFormat("yyyy-MM-dd");

    public static long LIZ() {
        return System.nanoTime() / 1000000;
    }

    public static boolean LIZIZ(long j) {
        SimpleDateFormat simpleDateFormat = LIZ;
        return simpleDateFormat.format(new Date(j)).equals(simpleDateFormat.format(new Date()));
    }
}
