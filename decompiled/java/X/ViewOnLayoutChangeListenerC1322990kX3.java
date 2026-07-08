package X;

import Y.ARunnableS31S0101000_20;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.bytedance.tt.reliability.monitor.viewchecker.BitmapCrashChecker;
import java.util.Map;
import kotlin.jvm.internal.AwS386S0200000_20;
import kotlin.jvm.internal.AwS421S0200000_20;
import kotlin.jvm.internal.AwS562S0100000_18;

/* JADX INFO: renamed from: X.0kX3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class ViewOnLayoutChangeListenerC1322990kX3 extends SmartImageView implements View.OnLayoutChangeListener {
    public static volatile boolean LLJJIJIIJIL;
    public static boolean LLJJIJIL;
    public String LLIZLLLIL;
    public Map<String, ? extends Object> LLJ;
    public EnumC1338240kve LLJI;
    public int LLJIJIL;
    public int LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public C1337880kv4 LLJJ;
    public C1337880kv4 LLJJI;
    public InterfaceC1321110kU1 LLJJIII;
    public C21328118dL LLJJIJI;

    @Override // android.view.View
    public final void invalidate() {
        if (this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        super.invalidate();
    }

    public final Drawable getImageDrawable() {
        C1331070kk5 hierarchy = getHierarchy();
        if (hierarchy != null) {
            return hierarchy.LJ;
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return getBackground() != null;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean isOpaque() {
        Drawable imageDrawable;
        Drawable imageDrawable2 = getImageDrawable();
        if (!super.isOpaque()) {
            if (imageDrawable2 == null || imageDrawable2.getOpacity() != -1 || (imageDrawable = getImageDrawable()) == null) {
                return false;
            }
            Rect bounds = imageDrawable.getBounds();
            if (bounds.left > 0 || bounds.top > 0 || bounds.right < getWidth() || bounds.bottom < getHeight()) {
                return false;
            }
        }
        return true;
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onAttachedToWindow() {
        Drawable imageDrawable;
        super.onAttachedToWindow();
        if (LLJJIJIL && (imageDrawable = getImageDrawable()) != null) {
            imageDrawable.setVisible(getVisibility() == 0, false);
        }
        LJIIJ(this.LLIZLLLIL, this.LLJ);
    }

    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDetachedFromWindow() {
        Drawable imageDrawable;
        super.onDetachedFromWindow();
        if (LLJJIJIL && (imageDrawable = getImageDrawable()) != null) {
            imageDrawable.setVisible(false, false);
        }
        C20597815iq.LIZ(this);
    }

    @Override // X.C1322090kVb, android.view.View
    public final void onFinishTemporaryDetach() {
        super.onFinishTemporaryDetach();
        LJIIJ(this.LLIZLLLIL, this.LLJ);
    }

    public final C1337880kv4 getCssHeight() {
        return this.LLJJI;
    }

    public final C1337880kv4 getCssWidth() {
        return this.LLJJ;
    }

    public final C21328118dL getPerfManager() {
        return this.LLJJIJI;
    }

    @Override // X.C1322090kVb, android.view.View
    public final void onStartTemporaryDetach() {
        super.onStartTemporaryDetach();
    }

    public final void LJIIIIZZ(Canvas canvas) {
        C1337860kv2 c1337860kv2;
        C1337870kv3 c1337870kv3;
        try {
            if (C1337860kv2.LLJJI) {
                Drawable background = getBackground();
                if ((background instanceof C1337860kv2) && (c1337860kv2 = (C1337860kv2) background) != null && (c1337870kv3 = c1337860kv2.LLIZ) != null && c1337870kv3.LJ) {
                    c1337870kv3.LIZLLL(this);
                    Path pathLIZIZ = c1337870kv3.LIZIZ();
                    int iSave = canvas.save();
                    canvas.clipPath(pathLIZIZ);
                    try {
                        LJIIIZ(canvas);
                        canvas.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        canvas.restoreToCount(iSave);
                        throw th;
                    }
                }
                LJIIIZ(canvas);
                return;
            }
            C1337990kvF.LIZIZ(this, canvas, new AwS421S0200000_20(this, canvas, 9));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1325860kbg.LIZIZ(th2, new AwS562S0100000_18(th2, 2610), C2097608Jq.LJ());
        }
    }

    public final void LJIIIZ(Canvas canvas) {
        this.LLJILLL = false;
        Drawable imageDrawable = getImageDrawable();
        if (imageDrawable == null) {
            return;
        }
        if (getPaddingTop() == 0 && getPaddingLeft() == 0) {
            imageDrawable.draw(canvas);
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        imageDrawable.draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == getImageDrawable()) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // com.bytedance.lighten.loader.SmartImageView, X.C1322110kVd, X.C1322100kVc, X.C1322090kVb, android.widget.ImageView, android.view.View
    public final void onDraw(Canvas canvas) {
        try {
            LJIIIIZZ(canvas);
        } catch (RuntimeException e) {
            TryCatchGuardChecker.doCheck(e);
            BitmapCrashChecker.doCheck(e, this);
            throw e;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        Drawable imageDrawable = getImageDrawable();
        if (imageDrawable != null) {
            imageDrawable.setLayoutDirection(i);
        }
    }

    public final void setCssHeight(C1337880kv4 c1337880kv4) {
        this.LLJJI = c1337880kv4;
    }

    public final void setCssWidth(C1337880kv4 c1337880kv4) {
        this.LLJJ = c1337880kv4;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:5:0x0009  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void setImageMode(java.lang.String r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L9
            int r0 = r2.hashCode()
            switch(r0) {
                case -1364013995: goto L32;
                case -1362001767: goto L27;
                case -797304696: goto L1c;
                case 727618043: goto L11;
                default: goto L9;
            }
        L9:
            X.0kve r0 = X.EnumC1338240kve.FIT_XY
        Lb:
            r1.LLJI = r0
            r0 = 1
            r1.LLJILJILJ = r0
            return
        L11:
            java.lang.String r0 = "aspectFill"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.0kve r0 = X.EnumC1338240kve.CENTER_CROP
            goto Lb
        L1c:
            java.lang.String r0 = "scaleToFill"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.0kve r0 = X.EnumC1338240kve.FIT_XY
            goto Lb
        L27:
            java.lang.String r0 = "aspectFit"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.0kve r0 = X.EnumC1338240kve.FIT_CENTER
            goto Lb
        L32:
            java.lang.String r0 = "center"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L9
            X.0kve r0 = X.EnumC1338240kve.CENTER
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLayoutChangeListenerC1322990kX3.setImageMode(java.lang.String):void");
    }

    public final void setPerfManager(C21328118dL c21328118dL) {
        this.LLJJIJI = c21328118dL;
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (LLJJIJIL) {
            C822690WPb.LIZ().execute(new ARunnableS31S0101000_20(i, this, 24));
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable == getImageDrawable()) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }

    public final void LJIIJ(String str, Map<String, ? extends Object> map) {
        String strLJFF;
        if (str == null || str.length() == 0 || !this.LLJILJILJ) {
            return;
        }
        int i = this.LLJIJIL;
        int i2 = this.LLJILJIL;
        if (i > 0 && i2 > 0) {
            long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            InterfaceC1321110kU1 interfaceC1321110kU1 = this.LLJJIII;
            if (interfaceC1321110kU1 != null) {
                strLJFF = interfaceC1321110kU1.LJFF(str, map);
            } else {
                strLJFF = null;
            }
            long jElapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos();
            C1326790kdB.LIZ.getClass();
            C1331670kl3 c1331670kl3LIZLLL = C1326790kdB.LIZLLL(strLJFF);
            long jElapsedRealtimeNanos3 = SystemClock.elapsedRealtimeNanos();
            C1168400gVi.LIZJ(new C1156800gD0(i, i2));
            c1331670kl3LIZLLL.LJIIIIZZ = i;
            c1331670kl3LIZLLL.LJIIIZ = i2;
            EnumC1338240kve enumC1338240kve = this.LLJI;
            if (enumC1338240kve != null) {
                c1331670kl3LIZLLL.LJJ = enumC1338240kve;
            }
            c1331670kl3LIZLLL.LIZLLL = true;
            c1331670kl3LIZLLL.LJJLIIIJJI = true;
            c1331670kl3LIZLLL.LJJ(this);
            c1331670kl3LIZLLL.LJIIJ(new InterfaceC427850Gq7() { // from class: X.0kX4
                @Override // X.InterfaceC427850Gq7
                public final void A3(Uri uri, C428600GrK c428600GrK) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void Bh(Uri uri, View view) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void e1(Uri uri) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void lg(Uri uri, Throwable th) {
                }

                @Override // X.InterfaceC427850Gq7
                public final void cm(Uri uri, View view, Throwable th) {
                    C1168400gVi.LIZ(new AwS386S0200000_20(uri, th, 6));
                }

                @Override // X.InterfaceC427850Gq7
                public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
                    this.LL.LLJILJILJ = false;
                }
            });
            C21328118dL c21328118dL = this.LLJJIJI;
            if (c21328118dL != null) {
                c21328118dL.LIZ(jElapsedRealtimeNanos2 - jElapsedRealtimeNanos, jElapsedRealtimeNanos3 - jElapsedRealtimeNanos2, SystemClock.elapsedRealtimeNanos() - jElapsedRealtimeNanos3, false);
            }
            this.LLJILJILJ = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x007e A[PHI: r7
      0x007e: PHI (r7v2 int) = (r7v0 int), (r7v3 int) binds: [B:23:0x006c, B:27:0x0077] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // X.C1322090kVb, android.widget.ImageView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r16, int r17) {
        /*
            r15 = this;
            int r10 = android.view.View.MeasureSpec.getMode(r16)
            int r4 = android.view.View.MeasureSpec.getSize(r16)
            int r8 = android.view.View.MeasureSpec.getMode(r17)
            int r3 = android.view.View.MeasureSpec.getSize(r17)
            r0 = 1073741824(0x40000000, float:2.0)
            if (r10 == r0) goto L22
            r14 = 1
        L15:
            if (r8 == r0) goto L20
            r13 = 1
        L18:
            if (r14 != 0) goto L24
            if (r13 != 0) goto L24
            r15.setMeasuredDimension(r4, r3)
            return
        L20:
            r13 = 0
            goto L18
        L22:
            r14 = 0
            goto L15
        L24:
            int r2 = r15.LLJIJIL
            if (r2 > 0) goto L29
            r2 = 1
        L29:
            int r1 = r15.LLJILJIL
            if (r1 > 0) goto L2e
            r1 = 1
        L2e:
            int r12 = r15.getPaddingLeft()
            int r0 = r15.getPaddingRight()
            int r12 = r12 + r0
            int r11 = r15.getPaddingTop()
            int r0 = r15.getPaddingBottom()
            int r11 = r11 + r0
            int r0 = r15.LLJIJIL
            float r9 = (float) r0
            int r0 = r15.LLJILJIL
            float r0 = (float) r0
            float r9 = r9 / r0
            int r2 = r2 + r12
            int r7 = LJIIJJI(r2, r10, r4)
            int r1 = r1 + r11
            int r6 = LJIIJJI(r1, r10, r3)
            r0 = 0
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L7a
            int r0 = r7 - r12
            float r1 = (float) r0
            int r0 = r6 - r11
            float r5 = (float) r0
            float r1 = r1 / r5
            float r1 = r1 - r9
            float r0 = java.lang.Math.abs(r1)
            double r3 = (double) r0
            r1 = 4502148214488346440(0x3e7ad7f29abcaf48, double:1.0E-7)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L7a
            if (r14 == 0) goto L7e
            float r5 = r5 * r9
            int r0 = (int) r5
            int r0 = r0 + r12
            if (r13 != 0) goto L77
            int r7 = LJIIJJI(r0, r10, r7)
        L77:
            if (r0 > r7) goto L7e
            r7 = r0
        L7a:
            r15.setMeasuredDimension(r7, r6)
            return
        L7e:
            if (r13 == 0) goto L7a
            int r0 = r7 - r12
            float r0 = (float) r0
            float r0 = r0 / r9
            int r0 = (int) r0
            int r0 = r0 + r11
            if (r14 != 0) goto L8c
            int r6 = LJIIJJI(r0, r8, r6)
        L8c:
            if (r0 > r6) goto L7a
            r6 = r0
            goto L7a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ViewOnLayoutChangeListenerC1322990kX3.onMeasure(int, int):void");
    }

    public ViewOnLayoutChangeListenerC1322990kX3(Context context, AttributeSet attributeSet, int i) {
        boolean z;
        super(context, attributeSet, i);
        if (!LLJJIJIIJIL) {
            if (context.getApplicationInfo().targetSdkVersion < 24) {
                z = true;
            } else {
                z = false;
            }
            LLJJIJIL = z;
            LLJJIJIIJIL = true;
        }
        addOnLayoutChangeListener(this);
    }

    public static int LJIIJJI(int i, int i2, int i3) {
        if (i2 != Integer.MIN_VALUE) {
            if (i2 == 1073741824) {
                return i3;
            }
            return i;
        }
        return Math.min(i, i3);
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        Drawable imageDrawable = getImageDrawable();
        if (imageDrawable != null) {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (width > 0 && height > 0) {
                imageDrawable.setBounds(0, 0, width, height);
            } else {
                imageDrawable.setBounds(0, 0, 0, 0);
            }
        }
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9 = i4 - i2;
        int i10 = i3 - i;
        if (i9 != this.LLJILJIL || i10 != this.LLJIJIL) {
            this.LLJILJIL = i9;
            this.LLJIJIL = i10;
            this.LLJILJILJ = true;
            LJIIJ(this.LLIZLLLIL, this.LLJ);
        }
    }
}
