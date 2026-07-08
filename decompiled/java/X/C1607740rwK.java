package X;

import Y.ARunnableS124S0100000_24;
import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.bpea.transmit.hook.HandlerHook;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0rwK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1607740rwK extends FrameLayout {
    public final SmartImageView LL;
    public boolean LLILLJJLI;
    public boolean LLILLL;
    public final ARunnableS124S0100000_24 LLILZ;

    public final void setup(String str) {
        LIZ(this, str, 0.0f, 0.0f, null, false, false, 126);
    }

    public final void LIZIZ() {
        animate().alpha(0.0f).setDuration(150L).withEndAction(new ARunnableS124S0100000_24(this, 19)).start();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        if (C289540BWm.LIZ()) {
            HandlerHook.viewRemoveCallbacks(this, this.LLILZ);
            animate().cancel();
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
            int visibility = getVisibility();
            setVisibility(8);
            C1602160rnK.LIZIZ(visibility, 8, this);
        }
        super.onDetachedFromWindow();
    }

    public C1607740rwK(Context context) {
        this(context, null);
    }

    public C1607740rwK(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        SmartImageView smartImageView = new SmartImageView(context);
        smartImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        C786410Ut5.G6(smartImageView, layoutParams);
        this.LL = smartImageView;
        this.LLILZ = new ARunnableS124S0100000_24(this, 18);
        addView(smartImageView);
    }

    public static void LIZ(C1607740rwK c1607740rwK, String str, float f, float f2, Bitmap bitmap, boolean z, boolean z2, int i) {
        long j;
        boolean z3;
        ViewGroup.MarginLayoutParams marginLayoutParams;
        Pair pair;
        boolean z4 = z2;
        if ((i & 2) != 0) {
            f = 0.0f;
        }
        if ((i & 4) != 0) {
            f2 = 0.0f;
        }
        if ((i & 8) != 0) {
            j = 2000;
        } else {
            j = 0;
        }
        if ((i & 16) != 0) {
            bitmap = null;
        }
        boolean z5 = false;
        if ((i & 32) != 0) {
            z = false;
        }
        if ((i & 64) != 0) {
            z4 = false;
        }
        c1607740rwK.getClass();
        if (str != null && str.length() != 0) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (z3 || (z && !z4)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("FakeCover.setup bail: urlEmpty=");
            if (str == null || str.length() == 0) {
                z5 = true;
            }
            sbLIZ.append(z5);
            sbLIZ.append(", isPhoto=");
            sbLIZ.append(z);
            sbLIZ.append(", isPhotoMode=");
            sbLIZ.append(z4);
            C2188811AlT.LIZIZ(sbLIZ);
            C786410Ut5.LJLLLLLL(8, c1607740rwK);
            return;
        }
        if (f > 0.0f && f2 > 0.0f) {
            int i2 = C14LC.LJIILL;
            int i3 = C14LC.LJIILLIIL;
            ViewGroup.LayoutParams layoutParams = c1607740rwK.getLayoutParams();
            if ((layoutParams instanceof ViewGroup.MarginLayoutParams) && (marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams) != null) {
                marginLayoutParams.topMargin = i2;
                marginLayoutParams.bottomMargin = i3;
                ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1607740rwK);
                c1607740rwK.setLayoutParams(marginLayoutParams);
                int i4 = c1607740rwK.getResources().getDisplayMetrics().widthPixels;
                int i5 = (c1607740rwK.getResources().getDisplayMetrics().heightPixels - i2) - i3;
                if (i4 > 0 && i5 > 0) {
                    float f3 = f / f2;
                    float f4 = i4;
                    float f5 = i5;
                    if (f3 > f4 / f5) {
                        pair = new Pair(Integer.valueOf(i4), Integer.valueOf((int) (f4 / f3)));
                    } else {
                        pair = new Pair(Integer.valueOf((int) (f5 * f3)), Integer.valueOf(i5));
                    }
                    int iIntValue = ((Number) pair.getFirst()).intValue();
                    int iIntValue2 = ((Number) pair.getSecond()).intValue();
                    c1607740rwK.LL.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    SmartImageView smartImageView = c1607740rwK.LL;
                    FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iIntValue, iIntValue2);
                    layoutParams2.gravity = 17;
                    C786410Ut5.G6(smartImageView, layoutParams2);
                    c1607740rwK.LLILLJJLI = false;
                    c1607740rwK.LLILLL = false;
                    C786410Ut5.LJLLLLLL(0, c1607740rwK);
                    ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(c1607740rwK);
                    c1607740rwK.setAlpha(1.0f);
                    HandlerHook.viewPostDelay(c1607740rwK, c1607740rwK.LLILZ, j);
                    if (bitmap != null && !bitmap.isRecycled()) {
                        c1607740rwK.LL.setImageBitmap(bitmap);
                        c1607740rwK.LLILLJJLI = true;
                        return;
                    } else {
                        C1331670kl3 c1331670kl3LJI = C1331660kl2.LJI(UriProtector.parse(str));
                        C1332130kln.LIZJ(c1331670kl3LJI, C06TB.DEFAULT);
                        c1331670kl3LJI.LJJ(c1607740rwK.LL);
                        c1331670kl3LJI.LJIIJ(new C1620610sH5(c1607740rwK, 0));
                        return;
                    }
                }
            }
        }
        C786410Ut5.LJLLLLLL(8, c1607740rwK);
    }
}
