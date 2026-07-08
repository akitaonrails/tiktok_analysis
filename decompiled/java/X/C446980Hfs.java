package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0Hfs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C446980Hfs {
    public static int LIZ(Context context, int i) {
        return context.getColor(i);
    }

    public static <T> T LIZIZ(Context context, Class<T> cls) {
        return (T) context.getSystemService(cls);
    }

    public static String LIZJ(Context context, Class<?> cls) {
        return context.getSystemServiceName(cls);
    }
}
