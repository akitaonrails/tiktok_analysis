package X;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

/* JADX INFO: renamed from: X.0Hix, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public class C448890Hix extends Drawable {
    public final String LIZ;
    public final AbstractC448900Hiy LIZIZ;
    public final C448940Hj2 LIZJ = null;
    public final AbstractC448910Hiz LIZLLL;
    public Drawable LJ;
    public C448990Hj7 LJFF;
    public int LJI;
    public float LJII;
    public boolean LJIIIIZZ;
    public boolean LJIIIZ;
    public boolean LJIIJ;
    public boolean LJIIJJI;
    public Integer LJIIL;

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final boolean LIZ() {
        return this.LJ != null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZIZ() {
        /*
            r6 = this;
            int r0 = r6.LJI
            r5 = 0
            if (r0 != 0) goto L33
            r4 = 1
            r6.LJIIIIZZ = r4
            android.graphics.drawable.Drawable r3 = r6.LJ
            if (r3 == 0) goto L2d
            android.graphics.Rect r2 = r3.getBounds()
            boolean r0 = r2.isEmpty()
            if (r0 == 0) goto L29
            android.graphics.Rect r2 = new android.graphics.Rect
            int r1 = r3.getIntrinsicWidth()
            int r0 = r3.getIntrinsicHeight()
            r2.<init>(r5, r5, r1, r0)
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L2d
        L29:
            r6.setBounds(r2)
            return
        L2d:
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>(r5, r5, r4, r4)
            goto L29
        L33:
            r6.LJIIIIZZ = r5
            X.0Hiz r0 = r6.LIZLLL
            android.graphics.Rect r2 = r0.LIZ(r6)
            android.graphics.drawable.Drawable r0 = r6.LJ
            r0.setBounds(r2)
            android.graphics.drawable.Drawable r1 = r6.LJ
            X.0Hj7 r0 = r6.LJFF
            r1.setCallback(r0)
            r6.setBounds(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C448890Hix.LIZIZ():void");
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        if (LIZ()) {
            return this.LJ.getIntrinsicHeight();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        if (LIZ()) {
            return this.LJ.getIntrinsicWidth();
        }
        return 1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        if (LIZ()) {
            return this.LJ.getOpacity();
        }
        return -2;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AsyncDrawable{destination='");
        sbLIZ.append(this.LIZ);
        sbLIZ.append('\'');
        sbLIZ.append(", imageSize=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", result=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", canvasWidth=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", textSize=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", waitingForDimensions=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZJ(final Drawable.Callback callback) {
        C448990Hj7 c448990Hj7;
        boolean z;
        if (callback == null) {
            c448990Hj7 = 0;
        } else {
            c448990Hj7 = new Drawable.Callback(callback) { // from class: X.0Hj7
                public final Drawable.Callback LL;

                @Override // android.graphics.drawable.Drawable.Callback
                public final void invalidateDrawable(Drawable drawable) {
                    this.LL.invalidateDrawable(this.LLILLJJLI);
                }

                {
                    this.LL = callback;
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
                    this.LL.unscheduleDrawable(this.LLILLJJLI, runnable);
                }

                @Override // android.graphics.drawable.Drawable.Callback
                public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
                    this.LL.scheduleDrawable(this.LLILLJJLI, runnable, j);
                }
            };
        }
        this.LJFF = c448990Hj7;
        super.setCallback(callback);
        if (this.LJFF != null) {
            Drawable drawable = this.LJ;
            if (drawable != null && drawable.getCallback() == null) {
                this.LJ.setCallback(this.LJFF);
            }
            if (!this.LJIIJJI && (this.LJ == null || this.LJIIJ)) {
                z = true;
            } else {
                z = false;
            }
            if (this.LJ != null) {
                this.LJ.setCallback(this.LJFF);
                Object obj = this.LJ;
                if ((obj instanceof Animatable) && this.LJIIIZ) {
                    ((Animatable) obj).start();
                }
            }
            if (z) {
                this.LIZIZ.LIZIZ(this);
                return;
            }
            return;
        }
        if (this.LJ != null) {
            this.LJ.setCallback(null);
            Object obj2 = this.LJ;
            if (obj2 instanceof Animatable) {
                Animatable animatable = (Animatable) obj2;
                boolean zIsRunning = animatable.isRunning();
                this.LJIIIZ = zIsRunning;
                if (zIsRunning) {
                    animatable.stop();
                }
            }
        }
        this.LIZIZ.LIZ(this);
    }

    public final void LIZLLL(Drawable drawable) {
        if (this.LJIIJJI && !this.LJIIJ) {
            return;
        }
        this.LJIIIZ = false;
        if (this.LJ != null) {
            this.LJ.setCallback(null);
            Object obj = this.LJ;
            if (obj instanceof Animatable) {
                Animatable animatable = (Animatable) obj;
                if (animatable.isRunning()) {
                    animatable.stop();
                }
            }
        }
        this.LJ = drawable;
        LIZIZ();
        this.LJIIJ = false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        if (LIZ()) {
            this.LJ.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.LJ;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        return super.setVisible(z, z2);
    }

    public C448890Hix(String str, AbstractC448900Hiy abstractC448900Hiy, AbstractC448910Hiz abstractC448910Hiz) {
        this.LIZ = str;
        this.LIZIZ = abstractC448900Hiy;
        this.LIZLLL = abstractC448910Hiz;
    }
}
