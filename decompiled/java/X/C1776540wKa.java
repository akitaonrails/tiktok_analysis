package X;

import android.window.BackEvent;

/* JADX INFO: renamed from: X.0wKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1776540wKa {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final int LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BackEventCompat{touchX=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", touchY=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", progress=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", swipeEdge=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1776540wKa(BackEvent backEvent) {
        float touchX = backEvent.getTouchX();
        float touchY = backEvent.getTouchY();
        float progress = backEvent.getProgress();
        int swipeEdge = backEvent.getSwipeEdge();
        this.LIZ = touchX;
        this.LIZIZ = touchY;
        this.LIZJ = progress;
        this.LIZLLL = swipeEdge;
    }
}
