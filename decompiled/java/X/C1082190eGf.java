package X;

import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0eGf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1082190eGf {
    public final int LIZ;
    public final int LIZIZ;

    public C1082190eGf(MotionEvent motionEvent) {
        this.LIZ = -1;
        this.LIZIZ = -1;
        this.LIZ = motionEvent.getPointerId(motionEvent.getActionIndex());
        this.LIZIZ = motionEvent.getActionIndex();
    }
}
