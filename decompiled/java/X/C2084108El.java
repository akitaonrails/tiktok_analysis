package X;

import android.content.Context;

/* JADX INFO: renamed from: X.08El, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2084108El {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Context context) {
        int iN3;
        if (context == null || (iN3 = C786410Ut5.n3(context.getResources(), "status_bar_height", "dimen", "android")) <= 0) {
            return 0;
        }
        return context.getResources().getDimensionPixelSize(iN3);
    }
}
