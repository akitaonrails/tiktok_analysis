package X;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;

/* JADX INFO: renamed from: X.15q3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20642515q3 {
    public static Context LIZ() {
        return C1948707kD.LIZ().getApplicationContext();
    }

    public static Resources LJFF() {
        return LIZ().getResources();
    }

    public static int LIZIZ(int i) {
        TypedArray typedArrayObtainStyledAttributes = LIZ().getTheme().obtainStyledAttributes(new int[]{i});
        int color = typedArrayObtainStyledAttributes.getColor(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return color;
    }

    public static int LIZJ(int i) {
        return LJFF().getColor(i);
    }

    public static String LJI(int i) {
        return LJFF().getString(i);
    }

    public static String LIZLLL(int i, int i2) {
        return LJFF().getQuantityString(i, i2);
    }

    public static String LJ(int i, int i2, Object... objArr) {
        return LJFF().getQuantityString(i, i2, objArr);
    }
}
