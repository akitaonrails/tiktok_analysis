package X;

import Y.ARunnableS106S0100000_6;
import Y.ARunnableS129S0100000_29;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.1285, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class AnonymousClass1285 {
    public final AnonymousClass1286 LIZ;
    public int LJ;
    public final int LJFF;
    public final int LJI;
    public int LJIIIIZZ;
    public boolean LJIIJ;
    public final boolean LJIIJJI;
    public int LIZIZ = 40;
    public int LIZJ = 10;
    public int LIZLLL = -1;
    public boolean LJII = true;
    public boolean LJIIIZ = true;
    public final ARunnableS129S0100000_29 LJIIL = new ARunnableS129S0100000_29(this, 57);

    public final void LIZ() {
        if (this.LJII) {
            return;
        }
        if (this.LJIIIIZZ <= 0) {
            int i = this.LIZLLL;
            if (i > 0) {
                this.LIZLLL = i - 1;
                if (!this.LJIIIZ) {
                    this.LIZ.scrollBy(((-this.LJFF) - this.LJI) * (this.LJIIJJI ? -1 : 1), 0);
                    this.LJIIIIZZ = this.LJFF + this.LJI;
                    this.LIZ.postOnAnimation(new ARunnableS106S0100000_6((Function0) new AnonymousClass1287(this.LJIIL), 104));
                    return;
                }
                this.LJIIIZ = false;
                this.LJIIIIZZ = this.LJFF;
            } else if (i < 0) {
                if (!this.LJIIIZ) {
                    this.LIZ.scrollBy(((-this.LJFF) - this.LJI) * (this.LJIIJJI ? -1 : 1), 0);
                    this.LJIIIIZZ = this.LJFF + this.LJI;
                    this.LIZ.postOnAnimation(new ARunnableS106S0100000_6((Function0) new AnonymousClass1287(this.LJIIL), 104));
                    return;
                }
                this.LJIIIZ = false;
                this.LJIIIIZZ = this.LJFF;
            } else {
                if (!this.LJIIJ) {
                    if (!this.LJIIIZ) {
                        this.LIZ.scrollBy(((-this.LJFF) - this.LJI) * (this.LJIIJJI ? -1 : 1), 0);
                    }
                    this.LJIIJ = true;
                    if (this.LJIIIZ) {
                        this.LJIIIZ = true;
                        this.LJIIIIZZ = this.LJ;
                    } else {
                        this.LJIIIIZZ = this.LJI + this.LJ;
                    }
                    this.LIZ.postOnAnimation(new ARunnableS106S0100000_6((Function0) new AnonymousClass1287(this.LJIIL), 104));
                    return;
                }
                this.LJIIIIZZ = 0;
            }
        }
        int i2 = this.LJIIIIZZ;
        if (i2 <= 0) {
            this.LJII = true;
            return;
        }
        int i3 = this.LIZIZ;
        int i4 = (this.LIZJ * i3) / LSPassThroughRecordSizeConfig.DEFAULT;
        if (i4 > i2) {
            i4 = i2;
        } else if (i4 <= 0) {
            this.LJIIIIZZ = i2 - 1;
            int i5 = LSPassThroughRecordSizeConfig.DEFAULT / i3;
            this.LIZ.scrollBy(this.LJIIJJI ? -1 : 1, 0);
            this.LIZ.postOnAnimationDelayed(new ARunnableS106S0100000_6((Function0) new AnonymousClass1288(this.LJIIL), 104), i5);
            return;
        }
        this.LJIIIIZZ = i2 - i4;
        this.LIZ.scrollBy(i4 * (this.LJIIJJI ? -1 : 1), 0);
        this.LIZ.postOnAnimationDelayed(new ARunnableS106S0100000_6((Function0) new AnonymousClass1289(this.LJIIL), 104), this.LIZJ);
    }

    public AnonymousClass1285(AnonymousClass1286 anonymousClass1286) {
        this.LIZ = anonymousClass1286;
        this.LJFF = (int) anonymousClass1286.getPaint().measureText(anonymousClass1286.getText().toString());
        this.LJI = (anonymousClass1286.getMeasuredWidth() - anonymousClass1286.getPaddingLeft()) - anonymousClass1286.getPaddingRight();
        this.LJIIJJI = anonymousClass1286.getLayoutDirection() == 1;
    }
}
