package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.view.View;
import android.widget.FrameLayout;
import com.lynx.animax.UIAnimaX;
import com.lynx.tasm.behavior.ui.utils.BackgroundDrawable;

/* JADX INFO: renamed from: X.0jff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1289890jff extends FrameLayout {
    public InterfaceC1289170jeV LL;
    public TextureViewSurfaceTextureListenerC1288630jdd LLILLJJLI;
    public C1288640jde LLILLL;

    public C1288640jde getAnimaXImageView() {
        return this.LLILLL;
    }

    public TextureViewSurfaceTextureListenerC1288630jdd getAnimaXView() {
        return this.LLILLJJLI;
    }

    public C1289890jff(Context context) {
        super(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        InterfaceC1289170jeV interfaceC1289170jeV;
        Bitmap currentBitmap;
        UIAnimaX uIAnimaX;
        C1313270kHN c1313270kHN;
        BackgroundDrawable backgroundDrawable;
        InterfaceC1289170jeV interfaceC1289170jeV2 = this.LL;
        if (interfaceC1289170jeV2 != null && (c1313270kHN = (uIAnimaX = ((C1289160jeU) interfaceC1289170jeV2).LIZ).mLynxBackground) != null && (backgroundDrawable = (BackgroundDrawable) c1313270kHN.LIZIZ) != null) {
            Path pathLJIIJJI = backgroundDrawable.LJIIJJI();
            if (pathLJIIJJI != null) {
                canvas.clipPath(pathLJIIJJI);
            } else if (uIAnimaX.mSkewX != 0.0f || uIAnimaX.mSkewY != 0.0f) {
                canvas.clipRect(uIAnimaX.getClipBounds());
            }
        }
        super.dispatchDraw(canvas);
        if (!canvas.isHardwareAccelerated() && (interfaceC1289170jeV = this.LL) != null && ((C1289160jeU) interfaceC1289170jeV).LIZ.LLJILJILJ) {
            TextureViewSurfaceTextureListenerC1288630jdd textureViewSurfaceTextureListenerC1288630jdd = this.LLILLJJLI;
            if (textureViewSurfaceTextureListenerC1288630jdd != null) {
                currentBitmap = textureViewSurfaceTextureListenerC1288630jdd.getBitmap();
            } else {
                C1288640jde c1288640jde = this.LLILLL;
                if (c1288640jde == null) {
                    return;
                } else {
                    currentBitmap = c1288640jde.getCurrentBitmap();
                }
            }
            if (currentBitmap != null) {
                canvas.drawBitmap(currentBitmap, getPaddingLeft(), getPaddingTop(), (Paint) null);
            }
        }
    }

    public final void LIZ(View view, C1289160jeU c1289160jeU) {
        if (view instanceof TextureViewSurfaceTextureListenerC1288630jdd) {
            this.LLILLJJLI = (TextureViewSurfaceTextureListenerC1288630jdd) view;
        } else if (!(view instanceof C1288640jde)) {
            return;
        } else {
            this.LLILLL = (C1288640jde) view;
        }
        C786410Ut5.W5(view, new FrameLayout.LayoutParams(-1, -1));
        addView(view);
        this.LL = c1289160jeU;
    }
}
