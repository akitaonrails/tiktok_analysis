package X;

import android.content.Context;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.03p6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C959803p6 {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Context context) {
        int i = context.getResources().getConfiguration().uiMode & 48;
        if (i != 0 && i != 16 && i == 32) {
            return R.style.z4;
        }
        return R.style.zd;
    }

    public static C1361400lX0 LIZIZ(Context context) {
        return new C1361400lX0(context, LIZ(context));
    }
}
