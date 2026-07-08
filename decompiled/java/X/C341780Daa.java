package X;

import android.content.res.Resources;

/* JADX INFO: renamed from: X.0Daa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C341780Daa {
    public static final /* synthetic */ int LIZ = 0;

    public static int LIZ(Resources resources, int i) {
        return ((int) (16 * resources.getDisplayMetrics().density)) + ((int) (52 * resources.getDisplayMetrics().density)) + Math.max(i, (int) (34 * resources.getDisplayMetrics().density));
    }
}
