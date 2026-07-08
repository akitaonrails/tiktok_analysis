package X;

import android.view.MotionEvent;

/* JADX INFO: renamed from: X.13fy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20070413fy {
    public static final C20070413fy LIZ = new C20070413fy();

    public static final boolean LIZ(MotionEvent motionEvent, int i) {
        if ((Float.floatToRawIntBits(motionEvent.getRawX(i)) & Integer.MAX_VALUE) < 2139095040 && (Float.floatToRawIntBits(motionEvent.getRawY(i)) & Integer.MAX_VALUE) < 2139095040) {
            return true;
        }
        return false;
    }
}
