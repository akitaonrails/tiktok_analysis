package X;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0cnu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1025920cnu {
    public final Context LIZ;
    public final C1025960cny LIZIZ;
    public int LIZJ = 2;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;

    public final void LIZ(int i) {
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJII = false;
        this.LIZJ = i;
        if (i != 2) {
            if (i == 3) {
                this.LIZLLL = (int) (((double) C14KQ.LJ(this.LIZ)) * 0.7316341829085458d);
                this.LJ = C14KQ.LJ(this.LIZ) - C497820Jfg.LIZJ(this.LIZ);
                return;
            }
            return;
        }
        this.LIZLLL = C14KQ.LJ(this.LIZ) - C497820Jfg.LIZJ(this.LIZ);
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        int i = this.LIZJ;
        if (i != 2) {
            if (i == 3 && !this.LJII) {
                int action = motionEvent.getAction();
                if (action != 0) {
                    if (action == 1 && Math.abs(motionEvent.getX() - this.LJFF) < 100.0f && Math.abs(motionEvent.getY() - this.LJI) < 100.0f) {
                        this.LIZIZ.LLJJL.setState(3);
                        this.LJII = true;
                        return;
                    }
                    return;
                }
                this.LJFF = (int) motionEvent.getX();
                this.LJI = (int) motionEvent.getY();
                return;
            }
            return;
        }
        this.LIZLLL = C14KQ.LJ(this.LIZ) - C497820Jfg.LIZJ(this.LIZ);
    }

    public C1025920cnu(Context context, C1025960cny c1025960cny) {
        this.LIZ = context;
        this.LIZIZ = c1025960cny;
        LIZ(2);
    }
}
