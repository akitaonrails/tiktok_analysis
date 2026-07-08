package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.0jt2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1298180jt2 {
    public Rect LIZ;
    public Rect LIZIZ;
    public Rect LIZJ;
    public float LIZLLL;
    public String LJ;

    public final C1297860jsW LIZIZ() {
        C1297860jsW c1297860jsW = new C1297860jsW();
        c1297860jsW.putMap("relativeRect", LIZ(this.LIZ));
        c1297860jsW.putMap("boundingClientRect", LIZ(this.LIZIZ));
        c1297860jsW.putMap("intersectionRect", LIZ(this.LIZJ));
        c1297860jsW.putDouble("intersectionRatio", this.LIZLLL);
        c1297860jsW.putDouble("time", 0.0d);
        c1297860jsW.putString("observerId", this.LJ);
        return c1297860jsW;
    }

    public static C1297860jsW LIZ(Rect rect) {
        C1297860jsW c1297860jsW = new C1297860jsW();
        if (rect != null) {
            c1297860jsW.putDouble("left", Math.round(rect.left));
            c1297860jsW.putDouble("right", Math.round(rect.right));
            c1297860jsW.putDouble("top", Math.round(rect.top));
            c1297860jsW.putDouble("bottom", Math.round(rect.bottom));
            return c1297860jsW;
        }
        c1297860jsW.putDouble("left", 0.0d);
        c1297860jsW.putDouble("right", 0.0d);
        c1297860jsW.putDouble("top", 0.0d);
        c1297860jsW.putDouble("bottom", 0.0d);
        return c1297860jsW;
    }
}
