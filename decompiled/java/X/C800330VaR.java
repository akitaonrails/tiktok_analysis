package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: renamed from: X.0VaR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public class C800330VaR {
    public static File LIZ(Context context) {
        return context.getCodeCacheDir();
    }

    public static File LIZJ(Context context) {
        return context.getNoBackupFilesDir();
    }

    public static Drawable LIZIZ(Context context, int i) {
        return context.getDrawable(i);
    }
}
