package X;

import android.content.Context;
import android.graphics.Rect;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.11vp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19659111vp {
    public float LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public Integer LJ;
    public Integer LJFF;
    public Rect LJI;

    public final C19751612Pq LIZ(Context context) {
        int iIntValue;
        Integer numLIZJ;
        Integer num = this.LJFF;
        if (num != null) {
            iIntValue = num.intValue();
        } else {
            Integer num2 = this.LJ;
            if (num2 != null && (numLIZJ = C1308910kAL.LIZJ(num2.intValue(), context)) != null) {
                iIntValue = numLIZJ.intValue();
            } else {
                iIntValue = 0;
            }
        }
        return new C19751612Pq(new C19751512Pp(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, iIntValue, this.LJI));
    }

    public final void LIZIZ(Integer num) {
        C19659211vq c19659211vq;
        if (num != null) {
            if (num.intValue() == 0) {
                c19659211vq = new C19659211vq(R.attr.ov, C418440Gaw.LIZIZ(24), C418440Gaw.LIZIZ(120));
            } else {
                if (num == null) {
                    return;
                }
                if (num.intValue() == 1) {
                    c19659211vq = new C19659211vq(R.attr.oy, C418440Gaw.LIZIZ(12), C418440Gaw.LIZIZ(50));
                } else {
                    if (num == null) {
                        return;
                    }
                    if (num.intValue() == 2) {
                        c19659211vq = new C19659211vq(R.attr.ox, C418440Gaw.LIZIZ(6), C418440Gaw.LIZIZ(24));
                    } else {
                        if (num == null) {
                            return;
                        }
                        if (num.intValue() == 3) {
                            c19659211vq = new C19659211vq(R.attr.ou, C418440Gaw.LIZIZ(2), C418440Gaw.LIZIZ(10));
                        } else if (num.intValue() == 4) {
                            c19659211vq = new C19659211vq(R.attr.f511p1, C418440Gaw.LIZIZ(2), C418440Gaw.LIZIZ(10));
                        } else if (num.intValue() != 5) {
                            return;
                        } else {
                            c19659211vq = new C19659211vq(R.attr.ow, C418440Gaw.LIZIZ(1), C418440Gaw.LIZIZ(5));
                        }
                    }
                }
            }
            this.LJ = Integer.valueOf(c19659211vq.LIZ);
            this.LIZJ = c19659211vq.LIZIZ;
            this.LIZIZ = 0.0f;
            this.LIZLLL = c19659211vq.LIZJ;
        }
    }
}
