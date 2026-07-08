package X;

import android.app.Activity;
import android.graphics.Rect;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IhM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473380IhM {
    public static final /* synthetic */ int LIZ = 0;

    public static Pair LIZ(Activity activity) {
        if (activity == null) {
            return new Pair(0, 0);
        }
        C0IKF.LIZ.getClass();
        C465320IMo.LIZ();
        Rect rectLIZ = C19738212Km.LIZ(activity).LIZ();
        return new Pair(Integer.valueOf(rectLIZ.width()), Integer.valueOf(rectLIZ.height()));
    }
}
