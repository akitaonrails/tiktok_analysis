package X;

import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0eGh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082210eGh {
    public final int LIZ;

    public C1082210eGh(MotionEvent motionEvent) {
        this.LIZ = -1;
        this.LIZ = motionEvent.getPointerId(motionEvent.getActionIndex());
        motionEvent.getActionIndex();
    }
}
