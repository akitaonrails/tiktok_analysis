package X;

import android.content.Context;

/* JADX INFO: renamed from: X.0xsP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1835950xsP {
    public static final /* synthetic */ int LIZ = 0;

    public static boolean LIZIZ(Context context) {
        if (context.getResources().getConfiguration().getLayoutDirection() == 0) {
            return true;
        }
        return false;
    }

    public static Object LIZ(Context context, Object obj, Object obj2) {
        if (context.getResources().getConfiguration().getLayoutDirection() != 0) {
            return obj2;
        }
        return obj;
    }
}
