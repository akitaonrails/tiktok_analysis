package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0hMB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1200930hMB {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context, int i, String str) {
        int iN3 = C786410Ut5.n3(context.getResources(), str, "string", context.getPackageName());
        if (iN3 != 0) {
            return context.getString(iN3);
        }
        return context.getString(i);
    }
}
