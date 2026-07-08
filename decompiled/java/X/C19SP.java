package X;

import Y.ARunnableS133S0100000_33;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19SP, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public class C19SP extends Drawable implements Drawable.Callback {
    public static final /* synthetic */ int LLJILJILJ = 0;
    public C19SQ LL;
    public Rect LLILLJJLI;
    public Drawable LLILLL;
    public Drawable LLILZ;
    public boolean LLILZLL;
    public boolean LLIZLLLIL;
    public ARunnableS133S0100000_33 LLJ;
    public long LLJI;
    public long LLJIJIL;
    public C19SS LLJILJIL;
    public int LLILZIL = 255;
    public int LLIZ = -1;

    public C19SQ LIZIZ() {
        throw null;
    }

    public void LJ(C19SQ c19sq) {
        throw null;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.LL.canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        C19SQ c19sq = this.LL;
        if (!c19sq.LJIJJ) {
            c19sq.LIZJ();
            c19sq.LJIJJ = true;
            int i = c19sq.LJII;
            Drawable[] drawableArr = c19sq.LJI;
            for (int i2 = 0; i2 < i; i2++) {
                if (drawableArr[i2].getConstantState() == null) {
                    c19sq.LJIJJLI = false;
                    return null;
                }
            }
            c19sq.LJIJJLI = true;
        } else if (!c19sq.LJIJJLI) {
            return null;
        }
        this.LL.LIZLLL = getChangingConfigurations();
        return this.LL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C19SQ c19sq = this.LL;
        if (c19sq.LJIIJJI) {
            if (!c19sq.LJIIL) {
                c19sq.LIZIZ();
            }
            return c19sq.LJIILJJIL;
        }
        Drawable drawable = this.LLILLL;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C19SQ c19sq = this.LL;
        if (c19sq.LJIIJJI) {
            if (!c19sq.LJIIL) {
                c19sq.LIZIZ();
            }
            return c19sq.LJIILIIL;
        }
        Drawable drawable = this.LLILLL;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C19SQ c19sq = this.LL;
        if (c19sq.LJIIJJI) {
            if (!c19sq.LJIIL) {
                c19sq.LIZIZ();
            }
            return c19sq.LJIILLIIL;
        }
        Drawable drawable = this.LLILLL;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C19SQ c19sq = this.LL;
        if (c19sq.LJIIJJI) {
            if (!c19sq.LJIIL) {
                c19sq.LIZIZ();
            }
            return c19sq.LJIILL;
        }
        Drawable drawable = this.LLILLL;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.LLILLL;
        if (drawable == null || !drawable.isVisible()) {
            return -2;
        }
        C19SQ c19sq = this.LL;
        if (c19sq.LJIIZILJ) {
            return c19sq.LJIJ;
        }
        c19sq.LIZJ();
        int i = c19sq.LJII;
        Drawable[] drawableArr = c19sq.LJI;
        int opacity = i > 0 ? drawableArr[0].getOpacity() : -2;
        for (int i2 = 1; i2 < i; i2++) {
            opacity = Drawable.resolveOpacity(opacity, drawableArr[i2].getOpacity());
        }
        c19sq.LJIJ = opacity;
        c19sq.LJIIZILJ = true;
        return opacity;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.LL.LJJII;
    }

    @Override // android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        boolean z;
        Drawable drawable = this.LLILZ;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.LLILZ = null;
            z = true;
        } else {
            z = false;
        }
        Drawable drawable2 = this.LLILLL;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.LLILZLL) {
                this.LLILLL.setAlpha(this.LLILZIL);
            }
        }
        if (this.LLJIJIL != 0) {
            this.LLJIJIL = 0L;
            z = true;
        }
        if (this.LLJI != 0) {
            this.LLJI = 0L;
        } else if (!z) {
            return;
        }
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.LLIZLLLIL && super.mutate() == this) {
            C19SQ c19sqLIZIZ = LIZIZ();
            c19sqLIZIZ.LJ();
            LJ(c19sqLIZIZ);
            this.LLIZLLLIL = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        int changingConfigurations = super.getChangingConfigurations();
        C19SQ c19sq = this.LL;
        return changingConfigurations | c19sq.LJ | c19sq.LIZLLL;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.LLILZIL;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.LLILLL;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x003b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(boolean r14) {
        /*
            r13 = this;
            r8 = 1
            r13.LLILZLL = r8
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r9 = r13.LLILLL
            r11 = 255(0xff, double:1.26E-321)
            r3 = 0
            r7 = 0
            if (r9 == 0) goto L6e
            long r5 = r13.LLJI
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L21
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L5a
            int r0 = r13.LLILZIL
            r9.setAlpha(r0)
            r13.LLJI = r3
        L21:
            r10 = 0
        L22:
            android.graphics.drawable.Drawable r9 = r13.LLILZ
            if (r9 == 0) goto L57
            long r5 = r13.LLJIJIL
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L38
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 > 0) goto L46
            r9.setVisible(r7, r7)
            r0 = 0
            r13.LLILZ = r0
            r13.LLJIJIL = r3
        L38:
            r8 = r10
        L39:
            if (r14 == 0) goto L45
            if (r8 == 0) goto L45
            Y.ARunnableS133S0100000_33 r0 = r13.LLJ
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r0, r1)
        L45:
            return
        L46:
            long r5 = r5 - r1
            long r5 = r5 * r11
            int r3 = (int) r5
            X.19SQ r0 = r13.LL
            int r0 = r0.LJJIFFI
            int r3 = r3 / r0
            int r0 = r13.LLILZIL
            int r3 = r3 * r0
            int r0 = r3 / 255
            r9.setAlpha(r0)
            goto L39
        L57:
            r13.LLJIJIL = r3
            goto L38
        L5a:
            long r5 = r5 - r1
            long r5 = r5 * r11
            int r10 = (int) r5
            X.19SQ r0 = r13.LL
            int r0 = r0.LJJI
            int r10 = r10 / r0
            int r5 = 255 - r10
            int r0 = r13.LLILZIL
            int r5 = r5 * r0
            int r0 = r5 / 255
            r9.setAlpha(r0)
            r10 = 1
            goto L22
        L6e:
            r13.LLJI = r3
            goto L21
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19SP.LIZ(boolean):void");
    }

    public final void LIZJ(Drawable drawable) {
        if (this.LLJILJIL == null) {
            this.LLJILJIL = new C19SS();
        }
        C19SS c19ss = this.LLJILJIL;
        c19ss.LL = drawable.getCallback();
        drawable.setCallback(c19ss);
        try {
            if (this.LL.LJJI <= 0 && this.LLILZLL) {
                drawable.setAlpha(this.LLILZIL);
            }
            C19SQ c19sq = this.LL;
            if (c19sq.LJJIIJ) {
                drawable.setColorFilter(c19sq.LJJIII);
            } else {
                if (c19sq.LJJIIZI) {
                    C16GF.LJII(drawable, c19sq.LJJIIJZLJL);
                }
                C19SQ c19sq2 = this.LL;
                if (c19sq2.LJJIJ) {
                    C16GF.LJIIIIZZ(drawable, c19sq2.LJJIIZ);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.LL.LJIL);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            C16G6.LIZIZ(drawable, C16G6.LIZ(this));
            drawable.setAutoMirrored(this.LL.LJJII);
            Rect rect = this.LLILLJJLI;
            if (rect != null) {
                C16GF.LJFF(drawable, rect.left, rect.top, rect.right, rect.bottom);
            }
            C19SS c19ss2 = this.LLJILJIL;
            Drawable.Callback callback = c19ss2.LL;
            c19ss2.LL = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C19SS c19ss3 = this.LLJILJIL;
            Drawable.Callback callback2 = c19ss3.LL;
            c19ss3.LL = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LIZLLL(int r9) {
        /*
            r8 = this;
            int r0 = r8.LLIZ
            r3 = 0
            if (r9 != r0) goto L6
            return r3
        L6:
            long r5 = android.os.SystemClock.uptimeMillis()
            X.19SQ r0 = r8.LL
            int r0 = r0.LJJIFFI
            r7 = 0
            r1 = 0
            if (r0 <= 0) goto L7a
            android.graphics.drawable.Drawable r0 = r8.LLILZ
            if (r0 == 0) goto L1a
            r0.setVisible(r3, r3)
        L1a:
            android.graphics.drawable.Drawable r0 = r8.LLILLL
            if (r0 == 0) goto L75
            r8.LLILZ = r0
            X.19SQ r0 = r8.LL
            int r0 = r0.LJJIFFI
            long r3 = (long) r0
            long r3 = r3 + r5
            r8.LLJIJIL = r3
        L28:
            if (r9 < 0) goto L6f
            X.19SQ r3 = r8.LL
            int r0 = r3.LJII
            if (r9 >= r0) goto L6f
            android.graphics.drawable.Drawable r7 = r3.LIZLLL(r9)
            r8.LLILLL = r7
            r8.LLIZ = r9
            if (r7 == 0) goto L47
            X.19SQ r0 = r8.LL
            int r0 = r0.LJJI
            if (r0 <= 0) goto L44
            long r3 = (long) r0
            long r5 = r5 + r3
            r8.LLJI = r5
        L44:
            r8.LIZJ(r7)
        L47:
            long r3 = r8.LLJI
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            r5 = 1
            if (r0 != 0) goto L54
            long r3 = r8.LLJIJIL
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L67
        L54:
            Y.ARunnableS133S0100000_33 r0 = r8.LLJ
            if (r0 != 0) goto L6b
            Y.ARunnableS133S0100000_33 r2 = new Y.ARunnableS133S0100000_33
            r1 = r8
            X.19SO r1 = (X.C19SO) r1
            r0 = 121(0x79, float:1.7E-43)
            r2.<init>(r1, r0)
            r8.LLJ = r2
        L64:
            r8.LIZ(r5)
        L67:
            r8.invalidateSelf()
            return r5
        L6b:
            r8.unscheduleSelf(r0)
            goto L64
        L6f:
            r8.LLILLL = r7
            r0 = -1
            r8.LLIZ = r0
            goto L47
        L75:
            r8.LLILZ = r7
            r8.LLJIJIL = r1
            goto L28
        L7a:
            android.graphics.drawable.Drawable r0 = r8.LLILLL
            if (r0 == 0) goto L28
            r0.setVisible(r3, r3)
            goto L28
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19SP.LIZLLL(int):boolean");
    }

    @Override // android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        C19SQ c19sq = this.LL;
        if (theme != null) {
            c19sq.LIZJ();
            int i = c19sq.LJII;
            Drawable[] drawableArr = c19sq.LJI;
            for (int i2 = 0; i2 < i; i2++) {
                Drawable drawable = drawableArr[i2];
                if (drawable != null && C16GF.LIZIZ(drawable)) {
                    C16GF.LIZ(drawableArr[i2], theme);
                    c19sq.LJ |= drawableArr[i2].getChangingConfigurations();
                }
            }
            Resources resources = theme.getResources();
            if (resources != null) {
                c19sq.LIZIZ = resources;
                int i3 = resources.getDisplayMetrics().densityDpi;
                if (i3 == 0) {
                    i3 = 160;
                }
                int i4 = c19sq.LIZJ;
                c19sq.LIZJ = i3;
                if (i4 != i3) {
                    c19sq.LJIIL = false;
                    c19sq.LJIIIZ = false;
                    return;
                }
                return;
            }
            return;
        }
        c19sq.getClass();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.LLILLL;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.LLILZ;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.LLILLJJLI;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.LLILLL;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean getPadding(android.graphics.Rect r11) {
        /*
            r10 = this;
            X.19SQ r9 = r10.LL
            boolean r0 = r9.LJIIIIZZ
            r8 = 0
            r5 = 1
            r6 = 0
            if (r0 != 0) goto L54
            android.graphics.Rect r0 = r9.LJIIJ
            if (r0 != 0) goto L52
            boolean r0 = r9.LJIIIZ
            if (r0 != 0) goto L54
            r9.LIZJ()
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>()
            int r4 = r9.LJII
            android.graphics.drawable.Drawable[] r3 = r9.LJI
            r2 = 0
        L1e:
            if (r2 >= r4) goto L62
            r0 = r3[r2]
            boolean r0 = r0.getPadding(r7)
            if (r0 == 0) goto L4f
            if (r6 != 0) goto L2f
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>(r8, r8, r8, r8)
        L2f:
            int r1 = r7.left
            int r0 = r6.left
            if (r1 <= r0) goto L37
            r6.left = r1
        L37:
            int r1 = r7.top
            int r0 = r6.top
            if (r1 <= r0) goto L3f
            r6.top = r1
        L3f:
            int r1 = r7.right
            int r0 = r6.right
            if (r1 <= r0) goto L47
            r6.right = r1
        L47:
            int r1 = r7.bottom
            int r0 = r6.bottom
            if (r1 <= r0) goto L4f
            r6.bottom = r1
        L4f:
            int r2 = r2 + 1
            goto L1e
        L52:
            r6 = r0
            goto L66
        L54:
            android.graphics.drawable.Drawable r0 = r10.LLILLL
            if (r0 == 0) goto L5d
            boolean r2 = r0.getPadding(r11)
            goto L79
        L5d:
            boolean r2 = super.getPadding(r11)
            goto L79
        L62:
            r9.LJIIIZ = r5
            r9.LJIIJ = r6
        L66:
            if (r6 == 0) goto L54
            r11.set(r6)
            int r1 = r6.left
            int r0 = r6.top
            r1 = r1 | r0
            int r0 = r6.bottom
            r1 = r1 | r0
            int r0 = r6.right
            r1 = r1 | r0
            if (r1 == 0) goto L8e
            r2 = 1
        L79:
            X.19SQ r0 = r10.LL
            boolean r0 = r0.LJJII
            if (r0 == 0) goto L8d
            int r0 = X.C16G6.LIZ(r10)
            if (r0 != r5) goto L8d
            int r1 = r11.left
            int r0 = r11.right
            r11.left = r0
            r11.right = r1
        L8d:
            return r2
        L8e:
            r2 = 0
            goto L79
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19SP.getPadding(android.graphics.Rect):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C19SQ c19sq = this.LL;
        if (c19sq != null) {
            c19sq.LJIIZILJ = false;
            c19sq.LJIJI = false;
        }
        if (drawable == this.LLILLL && getCallback() != null) {
            getCallback().invalidateDrawable(this);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.LLILZ;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.LLILLL;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i) {
        C19SQ c19sq = this.LL;
        int i2 = this.LLIZ;
        int i3 = c19sq.LJII;
        Drawable[] drawableArr = c19sq.LJI;
        boolean z = false;
        for (int i4 = 0; i4 < i3; i4++) {
            Drawable drawable = drawableArr[i4];
            if (drawable != null) {
                boolean zLIZIZ = C16G6.LIZIZ(drawable, i);
                if (i4 == i2) {
                    z = zLIZIZ;
                }
            }
        }
        c19sq.LJJ = i;
        return z;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i) {
        Drawable drawable = this.LLILZ;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        Drawable drawable2 = this.LLILLL;
        if (drawable2 != null) {
            return drawable2.setLevel(i);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        Drawable drawable = this.LLILZ;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        Drawable drawable2 = this.LLILLL;
        if (drawable2 != null) {
            return drawable2.setState(iArr);
        }
        return false;
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        if (!this.LLILZLL || this.LLILZIL != i) {
            this.LLILZLL = true;
            this.LLILZIL = i;
            Drawable drawable = this.LLILLL;
            if (drawable != null) {
                if (this.LLJI == 0) {
                    drawable.setAlpha(i);
                } else {
                    LIZ(false);
                }
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z) {
        C19SQ c19sq = this.LL;
        if (c19sq.LJJII != z) {
            c19sq.LJJII = z;
            Drawable drawable = this.LLILLL;
            if (drawable != null) {
                drawable.setAutoMirrored(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C19SQ c19sq = this.LL;
        c19sq.LJJIIJ = true;
        if (c19sq.LJJIII != colorFilter) {
            c19sq.LJJIII = colorFilter;
            Drawable drawable = this.LLILLL;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z) {
        C19SQ c19sq = this.LL;
        if (c19sq.LJIL != z) {
            c19sq.LJIL = z;
            Drawable drawable = this.LLILLL;
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C19SQ c19sq = this.LL;
        c19sq.LJJIIZI = true;
        if (c19sq.LJJIIJZLJL != colorStateList) {
            c19sq.LJJIIJZLJL = colorStateList;
            C16GF.LJII(this.LLILLL, colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C19SQ c19sq = this.LL;
        c19sq.LJJIJ = true;
        if (c19sq.LJJIIZ != mode) {
            c19sq.LJJIIZ = mode;
            C16GF.LJIIIIZZ(this.LLILLL, mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f, float f2) {
        Drawable drawable = this.LLILLL;
        if (drawable != null) {
            C16GF.LJ(drawable, f, f2);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        Drawable drawable = this.LLILZ;
        if (drawable != null) {
            drawable.setVisible(z, z2);
        }
        Drawable drawable2 = this.LLILLL;
        if (drawable2 != null) {
            drawable2.setVisible(z, z2);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable == this.LLILLL && getCallback() != null) {
            getCallback().unscheduleDrawable(this, runnable);
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        if (drawable == this.LLILLL && getCallback() != null) {
            getCallback().scheduleDrawable(this, runnable, j);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        Rect rect = this.LLILLJJLI;
        if (rect == null) {
            this.LLILLJJLI = new Rect(i, i2, i3, i4);
        } else {
            rect.set(i, i2, i3, i4);
        }
        Drawable drawable = this.LLILLL;
        if (drawable != null) {
            C16GF.LJFF(drawable, i, i2, i3, i4);
        }
    }
}
