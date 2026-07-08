package X;

import android.os.Build;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.05ZR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05ZR {
    public static final boolean LIZ(C20067313fT c20067313fT) {
        MotionEvent motionEventLIZ;
        if (Build.VERSION.SDK_INT < 29 || (motionEventLIZ = c20067313fT.LIZ()) == null || motionEventLIZ.getClassification() != 2) {
            return false;
        }
        return true;
    }
}
