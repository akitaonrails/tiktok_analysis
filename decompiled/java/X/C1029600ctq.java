package X;

import android.content.Context;
import android.view.MotionEvent;

/* JADX INFO: renamed from: X.0ctq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1029600ctq {
    public final Context LIZ;
    public final C1030050cuZ LIZIZ;
    public int LIZJ = 2;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJI;
    public boolean LJII;
    public int LJIIIIZZ;

    public final void LIZ(int i) {
        this.LIZLLL = 0;
        this.LJ = 0;
        this.LJII = false;
        this.LIZJ = i;
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 5) {
                        if (i != 6) {
                            return;
                        }
                    } else {
                        this.LIZLLL = (int) C12ES.LIZJ(64.0f, this.LIZ);
                        this.LJ = C14KQ.LJ(this.LIZ) - C497820Jfg.LIZJ(this.LIZ);
                        return;
                    }
                }
                this.LIZLLL = (int) C12ES.LIZJ(64.0f, this.LIZ);
                this.LJ = C14KQ.LJ(this.LIZ) - C497820Jfg.LIZJ(this.LIZ);
                return;
            }
            this.LIZLLL = (int) (((double) C14KQ.LJ(this.LIZ)) * 0.7316341829085458d);
            this.LJ = C14KQ.LJ(this.LIZ) - C497820Jfg.LIZJ(this.LIZ);
            return;
        }
        this.LIZLLL = C14KQ.LJ(this.LIZ) - C497820Jfg.LIZJ(this.LIZ);
    }

    public final void LIZIZ(MotionEvent motionEvent) {
        int i = this.LIZJ;
        if (i != 1) {
            if (i != 2) {
                if (i != 3 && i != 5) {
                    return;
                }
            } else {
                this.LIZLLL = C14KQ.LJ(this.LIZ) - C497820Jfg.LIZJ(this.LIZ);
                return;
            }
        }
        if (this.LJII) {
            return;
        }
        int action = motionEvent.getAction();
        if (action != 0) {
            if (action != 1 || Math.abs(motionEvent.getX() - this.LJFF) >= 100.0f || Math.abs(motionEvent.getY() - this.LJI) >= 100.0f) {
                return;
            }
            this.LIZIZ.LJIJJLI();
            this.LJII = true;
            return;
        }
        this.LJFF = (int) motionEvent.getX();
        this.LJI = (int) motionEvent.getY();
    }

    public C1029600ctq(Context context, C1030050cuZ c1030050cuZ) {
        this.LIZ = context;
        this.LIZIZ = c1030050cuZ;
        LIZ(2);
    }
}
