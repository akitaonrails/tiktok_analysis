package X;

import android.view.MotionEvent;
import com.bytedance.lynx.hybrid.webkit.WebKitView;

/* JADX INFO: renamed from: X.0kZW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1324520kZW {
    public final WebKitView LIZ;
    public int LIZIZ;
    public final int[] LIZJ = new int[2];
    public final int[] LIZLLL = new int[2];
    public final C1318260kPQ LJ;

    public C1324520kZW(WebKitView webKitView) {
        this.LIZ = webKitView;
        C1318260kPQ c1318260kPQ = new C1318260kPQ(webKitView);
        this.LJ = c1318260kPQ;
        c1318260kPQ.LJIIIZ(true);
    }

    public final Boolean LIZ(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int i = 0;
        if (actionMasked != 0) {
            if (actionMasked != 2) {
                this.LJ.LJIIJJI(0);
                return null;
            }
            int y = (int) motionEvent.getY();
            int i2 = this.LIZIZ - y;
            if (this.LJ.LIZJ(0, i2, this.LIZJ, this.LIZLLL)) {
                i2 -= this.LIZJ[1];
                motionEvent.offsetLocation(0.0f, this.LIZLLL[1]);
            }
            this.LIZIZ = y - this.LIZLLL[1];
            int scrollY = this.LIZ.getScrollY();
            int i3 = scrollY + i2;
            if (i3 > 0) {
                i = i3;
            }
            int i4 = i - scrollY;
            int i5 = i2 - i4;
            if (!this.LJ.LJ(0, i4, 0, i5, this.LIZLLL)) {
                return null;
            }
            int i6 = this.LIZLLL[1];
            this.LIZIZ -= i6;
            if (i6 == 0) {
                return null;
            }
            motionEvent.offsetLocation(0.0f, i6);
            if (Math.abs(i6) != Math.abs(i5)) {
                return null;
            }
            return Boolean.TRUE;
        }
        this.LIZIZ = (int) motionEvent.getY();
        this.LJ.LJIIJ(2, 0);
        return null;
    }
}
