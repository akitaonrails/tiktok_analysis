package X;

import android.animation.ValueAnimator;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.ss.android.ugc.aweme.friendstab.experiment.FriendsV3NavHideOnScrollConfig;
import kotlin.jvm.internal.AwS577S0100000_33;
import kotlin.jvm.internal.AwS612S0100000_33;

/* JADX INFO: renamed from: X.19nu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21648419nu {
    public final View LIZ;
    public final FriendsV3NavHideOnScrollConfig LIZIZ;
    public float LIZJ = 1.0f;
    public boolean LIZLLL = true;
    public int LJ;
    public int LJFF;
    public int LJI;
    public int LJII;
    public float LJIIIIZZ;
    public boolean LJIIIZ;
    public long LJIIJ;
    public final float LJIIJJI;
    public ValueAnimator LJIIL;
    public AwS612S0100000_33 LJIILIIL;
    public AwS577S0100000_33 LJIILJJIL;
    public final float LJIILL;
    public int LJIILLIIL;

    public final void LIZ() {
        ValueAnimator valueAnimator = this.LJIIL;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.LJIIL = null;
    }

    public final float LIZIZ() {
        int height;
        int i = this.LJIILLIIL;
        if (i > 0) {
            return i;
        }
        if (this.LIZ.getHeight() <= 0) {
            ViewGroup.LayoutParams layoutParams = this.LIZ.getLayoutParams();
            if (layoutParams != null) {
                height = layoutParams.height;
            }
            return this.LJIILL;
        }
        height = this.LIZ.getHeight();
        if (height > 0) {
            this.LJIILLIIL = height;
            return height;
        }
        return this.LJIILL;
    }

    public final void LJFF() {
        float fLIZIZ = LIZIZ();
        if (fLIZIZ <= 0.0f) {
            return;
        }
        float f = this.LJI + this.LJFF;
        float f2 = this.LJIIIIZZ;
        if (f2 > 0.0f && !this.LJIIIZ && (f <= 0.0f || f - f2 >= fLIZIZ)) {
            this.LJIIIIZZ = 0.0f;
        }
        float fLIZLLL = C13LZ.LIZLLL(f - this.LJIIIIZZ, 0.0f, fLIZIZ);
        if (this.LJIIIZ) {
            float f3 = (1.0f - this.LIZJ) * fLIZIZ;
            if (fLIZLLL > f3) {
                float f4 = f - f3;
                if (f4 < 0.0f) {
                    f4 = 0.0f;
                }
                this.LJIIIIZZ = f4;
                fLIZLLL = f3;
            }
        }
        if (fLIZLLL <= 0.0f && this.LJIIIIZZ > f) {
            this.LJIIIIZZ = f >= 0.0f ? f : 0.0f;
        }
        LJ(1.0f - (fLIZLLL / fLIZIZ), false);
    }

    public final void LIZJ(int i) {
        this.LJI = C13LZ.LJ(-i, 0, C814420VxA.LIZIZ(LIZIZ()));
        this.LJII = i;
        LJFF();
    }

    public final void LIZLLL(boolean z) {
        if (this.LIZLLL == z) {
            return;
        }
        this.LIZLLL = z;
        LIZ();
        this.LJFF = 0;
        this.LJI = 0;
        this.LJII = 0;
        this.LJIIIIZZ = 0.0f;
        this.LJIIIZ = false;
        this.LJIIJ = 0L;
        this.LJ = 0;
        LJ(1.0f, true);
    }

    public C21648419nu(View view, FriendsV3NavHideOnScrollConfig friendsV3NavHideOnScrollConfig) {
        this.LIZ = view;
        this.LIZIZ = friendsV3NavHideOnScrollConfig;
        this.LJIIJJI = view.getResources().getDisplayMetrics().density;
        this.LJIILL = TypedValue.applyDimension(1, 44.0f, view.getResources().getDisplayMetrics());
    }

    public final void LJ(float f, boolean z) {
        float fLIZLLL = C13LZ.LIZLLL(f, 0.0f, 1.0f);
        if (!z && fLIZLLL == this.LIZJ) {
            return;
        }
        this.LIZJ = fLIZLLL;
        C786410Ut5.ed(this.LIZ, (-(1.0f - fLIZLLL)) * LIZIZ());
        C786410Ut5.T4(this.LIZ, this.LIZJ);
    }
}
