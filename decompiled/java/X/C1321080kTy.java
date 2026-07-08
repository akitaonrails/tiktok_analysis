package X;

import Y.ARunnableS120S0100000_20;
import Y.ARunnableS31S0101000_20;
import Y.ARunnableS53S0300000_20;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.internal.AwS421S0200000_20;
import kotlin.jvm.internal.AwS564S0100000_20;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0kTy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1321080kTy extends View implements InterfaceC1321160kU6 {
    public static final /* synthetic */ int LLJJIJIL = 0;
    public boolean LL;
    public final C1320980kTo<C1331070kk5> LLILLJJLI;
    public final C1320120kSQ LLILLL;
    public final C1325540kbA LLILZ;
    public C1323050kX9<AbstractC1327750kej> LLILZIL;
    public C1321180kU8 LLILZLL;
    public Uri LLIZ;
    public Object LLIZLLLIL;
    public int LLJ;
    public int LLJI;
    public boolean LLJIJIL;
    public boolean LLJILJIL;
    public boolean LLJILJILJ;
    public boolean LLJILLL;
    public boolean LLJJ;
    public boolean LLJJI;
    public float LLJJIII;
    public InterfaceC1321110kU1 LLJJIJI;
    public final C01GW LLJJIJIIJIL;

    @Override // android.view.View
    public final void onAttachedToWindow() {
        Drawable drawable;
        setAttachFlag(true);
        super.onAttachedToWindow();
        if (C1321060kTw.LIZIZ && (drawable = getDrawable()) != null) {
            drawable.setVisible(getVisibility() == 0, false);
        }
        LIZLLL(this.LLIZ);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        Drawable drawable;
        setAttachFlag(false);
        super.onDetachedFromWindow();
        if (C1321060kTw.LIZIZ && (drawable = getDrawable()) != null) {
            drawable.setVisible(false, false);
        }
        LJFF();
    }

    @Override // X.InterfaceC1321160kU6
    public final void onDraw() {
    }

    @Override // android.view.View
    public final void onFinishTemporaryDetach() {
        setAttachFlag(true);
        super.onFinishTemporaryDetach();
        LIZLLL(this.LLIZ);
    }

    @Override // android.view.View
    public final void onStartTemporaryDetach() {
        setAttachFlag(false);
        super.onStartTemporaryDetach();
        LJFF();
    }

    public final void LJFF() {
        C1320980kTo<C1331070kk5> c1320980kTo = this.LLILLJJLI;
        if (c1320980kTo != null) {
            c1320980kTo.LIZIZ = false;
            if (c1320980kTo.LIZ) {
                c1320980kTo.LIZ = false;
                C1321060kTw.LJ(new ARunnableS120S0100000_20(c1320980kTo, 403));
            }
        }
        LIZIZ(true);
        this.LLJ = -1;
        this.LLJI = -1;
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return ImageView.class.getName();
    }

    public final C1320970kTn getController() {
        C1320980kTo<C1331070kk5> c1320980kTo = this.LLILLJJLI;
        if (c1320980kTo != null) {
            return c1320980kTo.LIZLLL;
        }
        return null;
    }

    public final C1321010kTr getControllerBuilder() {
        return (C1321010kTr) this.LLJJIJIIJIL.getValue();
    }

    public final Drawable getDrawable() {
        C1331070kk5 c1331070kk5;
        C1320980kTo<C1331070kk5> c1320980kTo = this.LLILLJJLI;
        if (c1320980kTo == null || (c1331070kk5 = (C1331070kk5) c1320980kTo.LIZ()) == null) {
            return null;
        }
        return c1331070kk5.LJ;
    }

    public final C1331070kk5 getHierarchy$myna_render_release() {
        C1320980kTo<C1331070kk5> c1320980kTo = this.LLILLJJLI;
        if (c1320980kTo != null) {
            return (C1331070kk5) c1320980kTo.LIZ();
        }
        return null;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.LLJILLL) {
            return;
        }
        this.LLJILLL = true;
        super.invalidate();
    }

    private final C1321180kU8 getFetchCancelTag() {
        C1325860kbg.LIZ();
        return this.LLILZLL;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return getBackground() != null;
    }

    @Override // android.view.View
    public final boolean isOpaque() {
        Drawable drawable;
        Drawable drawable2 = getDrawable();
        if (!super.isOpaque()) {
            if (drawable2 == null || drawable2.getOpacity() != -1 || (drawable = getDrawable()) == null) {
                return false;
            }
            Rect bounds = drawable.getBounds();
            if (bounds.left > 0 || bounds.top > 0 || bounds.right < getWidth() || bounds.bottom < getHeight()) {
                return false;
            }
        }
        return true;
    }

    @Override // android.view.View
    public final String toString() {
        C1320100kSO c1320100kSOLIZIZ = C1320090kSN.LIZIZ(this);
        c1320100kSOLIZIZ.LIZIZ(String.valueOf(this.LLILLJJLI), "holder");
        return c1320100kSOLIZIZ.toString();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1321080kTy(Context context) {
        boolean z;
        super(context, null, 0);
        boolean z2 = false;
        this.LLJ = -1;
        this.LLJI = -1;
        this.LLJJ = true;
        this.LLJJI = true;
        this.LLJJIII = Float.NaN;
        if (!C1321060kTw.LIZ) {
            if (context.getApplicationInfo().targetSdkVersion < 24) {
                z = true;
            } else {
                z = false;
            }
            C1321060kTw.LIZIZ = z;
            C1321060kTw.LIZ = true;
        }
        Class<?> cls = C1322200kVm.LIZ;
        C1328130kfL c1328130kfLLJIILIIL = C1328130kfL.LJIILIIL();
        this.LLILZ = c1328130kfLLJIILIIL.LJIIL();
        this.LLILLL = new C1320120kSQ(context.getResources(), c1328130kfLLJIILIIL.LIZIZ(context));
        C1331070kk5 c1331070kk5LIZ = C1335990ks1.LIZLLL(context, null).LIZ();
        this.LLILLJJLI = new C1320980kTo<>(c1331070kk5LIZ);
        C1321120kU2 c1321120kU2 = c1331070kk5LIZ.LJ;
        c1321120kU2.setCallback(this);
        if (!C1321060kTw.LIZIZ ? !(!isAttachedToWindow() || getWindowVisibility() != 0 || !isShown()) : getVisibility() == 0) {
            z2 = true;
        }
        c1321120kU2.setVisible(z2, true);
        this.LLJILJILJ = z2;
        c1321120kU2.LLILZLL = this;
        this.LLILZLL = new C1321180kU8();
        this.LLJJIJIIJIL = C452501pT.LIZIZ(new AwS564S0100000_20(context, this, 52));
    }

    private final void setAttachFlag(boolean z) {
        if (this.LLJILJIL == z) {
            return;
        }
        this.LLJILJIL = z;
        if (z) {
            C1320980kTo<C1331070kk5> c1320980kTo = this.LLILLJJLI;
            if (c1320980kTo != null) {
                c1320980kTo.LIZIZ = true;
                c1320980kTo.LIZ = true;
            }
            LJI(true, false, null);
            return;
        }
        this.LLJILLL = false;
        LJI(false, true, null);
    }

    @Override // X.InterfaceC1321160kU6
    public final void LIZ(boolean z) {
        if (this.LLJILJILJ == z) {
            return;
        }
        this.LLJILJILJ = z;
        if (z) {
            LJI(true, false, null);
            LIZLLL(this.LLIZ);
        } else {
            LJFF();
            LJI(false, false, null);
        }
    }

    public final void LIZIZ(boolean z) {
        C1331070kk5 hierarchy$myna_render_release;
        if (z && (hierarchy$myna_render_release = getHierarchy$myna_render_release()) != null) {
            hierarchy$myna_render_release.reset();
        }
        C1325860kbg.LIZ();
        C1323050kX9<AbstractC1327750kej> c1323050kX9 = this.LLILZIL;
        if (c1323050kX9 != null) {
            C1323050kX9.LJII(c1323050kX9);
            this.LLILZIL = null;
        }
    }

    public final void LIZJ(Canvas canvas) {
        this.LLJILLL = false;
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        if (getPaddingTop() == 0 && getPaddingLeft() == 0) {
            drawable.draw(canvas);
            return;
        }
        int saveCount = canvas.getSaveCount();
        canvas.save();
        canvas.translate(getPaddingLeft(), getPaddingTop());
        drawable.draw(canvas);
        canvas.restoreToCount(saveCount);
    }

    public final void LIZLLL(Uri uri) {
        boolean z;
        C1325710kbR c1325710kbRLIZ;
        C1331070kk5 hierarchy$myna_render_release;
        C1324660kZk c1324660kZkLIZJ;
        C1323050kX9<AbstractC1327750kej> c1323050kX9LIZJ;
        Drawable drawable;
        if (!this.LLJIJIL || !this.LLJILJIL || !this.LLJILJILJ) {
            return;
        }
        if (uri != null) {
            InterfaceC1321110kU1 interfaceC1321110kU1 = this.LLJJIJI;
            if (interfaceC1321110kU1 != null) {
                if (this.LL) {
                    C1331070kk5 hierarchy$myna_render_release2 = getHierarchy$myna_render_release();
                    if (hierarchy$myna_render_release2 != null) {
                        hierarchy$myna_render_release2.reset();
                    }
                    z = true;
                } else {
                    z = false;
                }
                interfaceC1321110kU1.LIZLLL();
            } else {
                z = false;
            }
            if (interfaceC1321110kU1 == null || (c1325710kbRLIZ = interfaceC1321110kU1.LIZIZ(uri, null)) == null) {
                C1325700kbQ c1325700kbQLIZLLL = C1325700kbQ.LIZLLL(uri);
                c1325700kbQLIZLLL.LJ = C1324670kZl.LJ;
                c1325710kbRLIZ = c1325700kbQLIZLLL.LIZ();
            }
            InterfaceC1325590kbF interfaceC1325590kbF = this.LLILZ.LJIIJJI;
            Object obj = this.LLIZLLLIL;
            if (interfaceC1325590kbF != null && c1325710kbRLIZ != null) {
                if (c1325710kbRLIZ.LJIJJ != null) {
                    c1324660kZkLIZJ = interfaceC1325590kbF.LIZIZ(c1325710kbRLIZ, obj);
                } else {
                    c1324660kZkLIZJ = interfaceC1325590kbF.LIZJ(c1325710kbRLIZ, obj);
                }
                if (c1324660kZkLIZJ != null && (c1323050kX9LIZJ = C1321060kTw.LIZJ(this.LLILZ.LIZLLL, c1324660kZkLIZJ)) != null) {
                    C1320120kSQ c1320120kSQ = this.LLILLL;
                    C1320970kTn controller = getController();
                    if (controller != null) {
                        drawable = controller.LJIIJ;
                    } else {
                        drawable = null;
                    }
                    Drawable drawableLIZ = C1321060kTw.LIZ(c1323050kX9LIZJ, c1320120kSQ, drawable);
                    if (drawableLIZ != null && getHierarchy$myna_render_release() != null) {
                        if (c1325710kbRLIZ != null) {
                            C1320270kSf c1320270kSf = (C1320270kSf) this.LLILZ.LJIIIZ(c1325710kbRLIZ, null);
                            c1320270kSf.LIZJ(c1325710kbRLIZ, this.LLIZLLLIL, "-1", false);
                            c1320270kSf.LJII(c1325710kbRLIZ, "-1", false);
                        }
                        LJ(drawableLIZ, c1323050kX9LIZJ);
                        LJI(false, true, null);
                        return;
                    }
                }
            }
            if (!z && this.LL && (hierarchy$myna_render_release = getHierarchy$myna_render_release()) != null) {
                hierarchy$myna_render_release.reset();
            }
            C1321060kTw.LJ(new ARunnableS53S0300000_20(this, c1325710kbRLIZ, getFetchCancelTag(), 59));
            LJI(false, false, null);
            return;
        }
        LJI(false, true, null);
        LIZIZ(true);
    }

    @Override // android.view.View, android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        if (drawable == getDrawable()) {
            invalidate();
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
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
                        LIZJ(canvas);
                        canvas.restoreToCount(iSave);
                        return;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        canvas.restoreToCount(iSave);
                        throw th;
                    }
                }
                LIZJ(canvas);
                return;
            }
            C1337990kvF.LIZIZ(this, canvas, new AwS421S0200000_20(this, canvas, 13));
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            C1325860kbg.LIZIZ(th2, new AwS564S0100000_20(th2, 51), C2097608Jq.LJ());
        }
    }

    @Override // android.view.View
    public final void onPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onPopulateAccessibilityEvent(accessibilityEvent);
        if (accessibilityEvent == null) {
            return;
        }
        CharSequence contentDescription = getContentDescription();
        if (!TextUtils.isEmpty(contentDescription)) {
            accessibilityEvent.getText().add(contentDescription);
        }
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i) {
        super.onRtlPropertiesChanged(i);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            drawable.setLayoutDirection(i);
        }
    }

    @Override // android.view.View
    public final void onVisibilityAggregated(boolean z) {
        super.onVisibilityAggregated(z);
        C822690WPb.LIZ().execute(new ARunnableS120S0100000_20(this, 337));
    }

    public final void setDraweeController(C1320970kTn c1320970kTn) {
        InterfaceC1321110kU1 interfaceC1321110kU1;
        if (c1320970kTn != null && (interfaceC1321110kU1 = this.LLJJIJI) != null) {
            interfaceC1321110kU1.LIZJ();
        }
        C1320980kTo<C1331070kk5> c1320980kTo = this.LLILLJJLI;
        if (c1320980kTo != null) {
            c1320980kTo.LIZJ(c1320970kTn);
        }
    }

    public final void setScaleType(String str) {
        InterfaceC1320380kSq interfaceC1320380kSq;
        C1331070kk5 hierarchy$myna_render_release = getHierarchy$myna_render_release();
        if (hierarchy$myna_render_release != null) {
            if (Intrinsics.LJFF(str, "center_crop")) {
                interfaceC1320380kSq = InterfaceC1320380kSq.LJI;
            } else if (Intrinsics.LJFF(str, "fit_xy")) {
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZ;
            } else {
                interfaceC1320380kSq = InterfaceC1320380kSq.LIZJ;
            }
            hierarchy$myna_render_release.LJIIZILJ(interfaceC1320380kSq);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        super.setVisibility(i);
        if (C1321060kTw.LIZIZ) {
            C822690WPb.LIZ().execute(new ARunnableS31S0101000_20(i, this, 29));
        }
    }

    @Override // android.view.View
    public final boolean verifyDrawable(Drawable drawable) {
        if (drawable == getDrawable()) {
            return true;
        }
        return super.verifyDrawable(drawable);
    }

    public final void LJ(Drawable drawable, C1323050kX9 c1323050kX9) {
        C1331070kk5 hierarchy$myna_render_release;
        if (drawable != null && (hierarchy$myna_render_release = getHierarchy$myna_render_release()) != null) {
            hierarchy$myna_render_release.LJFF(drawable, 1.0f, true);
        }
        C1325860kbg.LIZ();
        C1323050kX9<AbstractC1327750kej> c1323050kX92 = this.LLILZIL;
        if (c1323050kX92 != null) {
            C1323050kX9.LJII(c1323050kX92);
            this.LLILZIL = null;
        }
        this.LLILZIL = c1323050kX9;
        AbstractC1327750kej abstractC1327750kejLIZLLL = C1321060kTw.LIZLLL(c1323050kX9);
        if (abstractC1327750kejLIZLLL != null) {
            int width = abstractC1327750kejLIZLLL.getWidth();
            int height = abstractC1327750kejLIZLLL.getHeight();
            int i = this.LLJ;
            int i2 = this.LLJI;
            if (i != width || i2 != height) {
                this.LLJ = width;
                this.LLJI = height;
                if (!this.LLJJ || !this.LLJJI) {
                    float f = this.LLJJIII;
                    if (!Float.isNaN(f) && f > 0.0f) {
                        return;
                    }
                    if (!this.LLJJ && !this.LLJJI) {
                        return;
                    }
                    if (i > 0 && i2 > 0 && height > 0 && width > 0 && i / i2 == width / height) {
                        return;
                    }
                }
                requestLayout();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f5  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1321080kTy.onMeasure(int, int):void");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        C822690WPb.LIZ().execute(new ARunnableS120S0100000_20(this, 338));
    }

    public final void LJI(boolean z, boolean z2, C1321180kU8 c1321180kU8) {
        if (this.LLJIJIL == z) {
            return;
        }
        this.LLJIJIL = z;
        if (!z && z2) {
            C1321180kU8 fetchCancelTag = getFetchCancelTag();
            fetchCancelTag.getClass();
            C1325860kbg.LIZ();
            fetchCancelTag.LIZ = true;
            if (c1321180kU8 == null) {
                c1321180kU8 = new C1321180kU8();
            }
            this.LLILZLL = c1321180kU8;
        }
    }

    @Override // android.view.View
    public final void layout(int i, int i2, int i3, int i4) {
        super.layout(i, i2, i3, i4);
        Drawable drawable = getDrawable();
        if (drawable != null) {
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            if (width > 0 && height > 0) {
                drawable.setBounds(0, 0, width, height);
            } else {
                drawable.setBounds(0, 0, 0, 0);
            }
        }
    }
}
