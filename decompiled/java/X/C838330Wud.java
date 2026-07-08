package X;

import android.os.SystemClock;

/* JADX INFO: renamed from: X.0Wud, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C838330Wud {
    public final C838340Wue LIZ = new C838340Wue();
    public final C838340Wue LIZIZ = new C838340Wue();
    public final C838340Wue LIZJ = new C838340Wue();
    public boolean LIZLLL;
    public boolean LJ;

    public final void LIZ() {
        if (this.LJ) {
            return;
        }
        this.LJ = true;
        this.LIZ.LIZIZ = System.currentTimeMillis();
        this.LIZIZ.LIZIZ = System.nanoTime();
        this.LIZJ.LIZIZ = SystemClock.currentThreadTimeMillis();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("TimeAnchor(absoluteTime=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", threadTime=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nanoTime=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
