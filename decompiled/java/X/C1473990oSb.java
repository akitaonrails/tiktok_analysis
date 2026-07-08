package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.ImageView;

/* JADX INFO: renamed from: X.0oSb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1473990oSb extends SurfaceView implements InterfaceC1474060oSi, InterfaceC1482610ogV {
    public long LL;
    public boolean LLILLJJLI;
    public InterfaceC1483990oij LLILLL;
    public final C989420br2 LLILZ;
    public String LLILZIL;

    public final /* synthetic */ void LIZ(String str, ViewGroup.LayoutParams layoutParams) {
        C1474050oSh.LIZIZ(this, str, layoutParams);
    }

    @Override // X.InterfaceC1474060oSi
    public /* bridge */ /* synthetic */ String getStackTraceString() {
        return C1474050oSh.LIZ();
    }

    public final void LIZIZ() {
        Surface surface;
        if (C1472280oPq.LIZLLL()) {
            final C989420br2 c989420br2 = this.LLILZ;
            c989420br2.getClass();
            SurfaceHolder holder = getHolder();
            if (holder == null || (surface = holder.getSurface()) == null || !surface.isValid()) {
                return;
            }
            C1474010oSd.LIZ(this, new InterfaceC1474030oSf() { // from class: X.0oTQ
                @Override // X.InterfaceC1474030oSf
                public final void LIZ(Bitmap bitmap) {
                    ViewGroup viewGroup;
                    C989420br2 c989420br22 = c989420br2;
                    SurfaceView surfaceView = this;
                    c989420br22.getClass();
                    if (bitmap != null && !bitmap.isRecycled()) {
                        ImageView imageView = c989420br22.LIZ;
                        if (imageView != null && imageView.getParent() != null && (imageView.getParent() instanceof ViewGroup)) {
                            C786410Ut5.LJJJLZIJ(imageView, (ViewGroup) imageView.getParent());
                        }
                        if (c989420br22.LIZ == null) {
                            c989420br22.LIZ = new ImageView(surfaceView.getContext());
                        }
                        ViewGroup.LayoutParams layoutParams = surfaceView.getLayoutParams();
                        ImageView imageView2 = c989420br22.LIZ;
                        if (imageView2 != null) {
                            C786410Ut5.c6(imageView2, layoutParams);
                        }
                        ImageView imageView3 = c989420br22.LIZ;
                        if (imageView3 != null) {
                            C786410Ut5.gd(imageView3, surfaceView.getTranslationY());
                        }
                        ImageView imageView4 = c989420br22.LIZ;
                        if (imageView4 != null) {
                            imageView4.setImageBitmap(bitmap);
                        }
                        ViewParent parent = surfaceView.getParent();
                        if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                            viewGroup.addView(c989420br22.LIZ);
                        }
                        ImageView imageView5 = c989420br22.LIZ;
                        if (imageView5 != null) {
                            C786410Ut5.LJZI(0, imageView5);
                        }
                    }
                }
            });
        }
    }

    @Override // X.InterfaceC1474060oSi
    public final boolean LJ() {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (jCurrentTimeMillis - this.LL < 500) {
            return false;
        }
        this.LL = jCurrentTimeMillis;
        return true;
    }

    public String getPageName() {
        return this.LLILZIL;
    }

    @Override // X.InterfaceC1482610ogV
    public InterfaceC1483990oij getRelatedSurfaceHolder() {
        return this.LLILLL;
    }

    public C1473990oSb(Context context) {
        super(context);
        this.LLILZ = new C989420br2();
    }

    @Override // android.view.View
    public void setLayoutParams(ViewGroup.LayoutParams layoutParams) {
        LIZJ(layoutParams, "UNKNOWN");
    }

    public void setPageName(String str) {
        this.LLILZIL = str;
    }

    public void setRelatedSurfaceHolder(InterfaceC1483990oij interfaceC1483990oij) {
        this.LLILLL = interfaceC1483990oij;
    }

    @Override // android.view.View
    public void setScaleX(float f) {
        C1474050oSh.LIZJ(this, f);
        super.setScaleX(f);
    }

    @Override // android.view.View
    public void setScaleY(float f) {
        C1474050oSh.LIZLLL(this, f);
        super.setScaleY(f);
    }

    @Override // android.view.View
    public void setTranslationX(float f) {
        LJIIIIZZ(f, "UNKNOWN");
    }

    @Override // android.view.View
    public void setTranslationY(float f) {
        LJIIJJI(f, "UNKNOWN");
    }

    @Override // android.view.SurfaceView, android.view.View
    public void setVisibility(int i) {
        C1474050oSh.LJI(this, i);
        super.setVisibility(i);
    }

    @Override // android.view.View
    public final void startAnimation(Animation animation) {
        C1474050oSh.LJII(this);
        super.startAnimation(animation);
    }

    public final void LIZJ(ViewGroup.LayoutParams layoutParams, String str) {
        if (!C1480850odf.LIZJ.isSurfaceViewLogOpt()) {
            if (C1474810oTv.LLIILZL()) {
                str = "";
            } else if ("UNKNOWN".equals(str)) {
                str = getStackTraceString();
            }
            LIZ(str, layoutParams);
        }
        super.setLayoutParams(layoutParams);
        if (C1472280oPq.LIZLLL() && ((Boolean) C1474810oTv.f210t5.getValue()).booleanValue() && layoutParams.width > 0 && layoutParams.height > 0) {
            InterfaceC1472350oPx interfaceC1472350oPxLIZIZ = C1472280oPq.LIZIZ(getHolder().getSurface());
            if (C1481110oe5.LIZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("setLayoutParams. mSurfaceControlSession:");
                sbLIZ.append(interfaceC1472350oPxLIZIZ);
                C1481110oe5.LIZIZ("IDyVideoView", C2188811AlT.LIZIZ(sbLIZ));
            }
            if (interfaceC1472350oPxLIZIZ != null && interfaceC1472350oPxLIZIZ.LIZ(this)) {
                interfaceC1472350oPxLIZIZ.LIZIZ(getSurfaceControl(), Integer.valueOf(layoutParams.width), Integer.valueOf(layoutParams.height));
            }
        }
    }

    public final void LIZLLL(int i, boolean z) {
        this.LLILLJJLI = true;
        if (C1480850odf.LIZJ.isSurfaceViewLogOpt()) {
            super.setVisibility(i);
            return;
        }
        int visibility = getVisibility();
        setVisibility(i);
        C1602160rnK.LIZIZ(visibility, i, this);
    }

    @Override // X.InterfaceC1474060oSi
    public final void LJIIIIZZ(float f, String str) {
        if (!C1480850odf.LIZJ.isSurfaceViewLogOpt()) {
            C1474050oSh.LJ(this, str, f);
        }
        super.setTranslationX(f);
    }

    @Override // X.InterfaceC1474060oSi
    public final void LJIIJJI(float f, String str) {
        if (!C1480850odf.LIZJ.isSurfaceViewLogOpt()) {
            C1474050oSh.LJFF(this, str, f);
        }
        super.setTranslationY(f);
    }
}
