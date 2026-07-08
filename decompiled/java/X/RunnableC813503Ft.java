package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.feed.platform.cell.component.adaption.BlurProcessor;

/* JADX INFO: renamed from: X.03Ft, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class RunnableC813503Ft implements Runnable {
    public final /* synthetic */ boolean LL;
    public final /* synthetic */ BlurProcessor LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ Bitmap LLILZ;
    public final /* synthetic */ ViewGroup LLILZIL;

    public RunnableC813503Ft(boolean z, BlurProcessor blurProcessor, int i, Bitmap bitmap, ViewGroup viewGroup) {
        this.LL = z;
        this.LLILLJJLI = blurProcessor;
        this.LLILLL = i;
        this.LLILZ = bitmap;
        this.LLILZIL = viewGroup;
    }

    public final void LIZ() {
        ImageView imageView;
        if (this.LL) {
            BlurProcessor blurProcessor = this.LLILLJJLI;
            int i = this.LLILLL;
            blurProcessor.getClass();
            imageView = new ImageView(blurProcessor.LIZ);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, i);
            layoutParams.gravity = 49;
            C786410Ut5.c6(imageView, layoutParams);
            imageView.setTag("blur_top_view");
        } else {
            BlurProcessor blurProcessor2 = this.LLILLJJLI;
            int i2 = this.LLILLL;
            blurProcessor2.getClass();
            imageView = new ImageView(blurProcessor2.LIZ);
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(-1, i2);
            layoutParams2.gravity = 81;
            C786410Ut5.c6(imageView, layoutParams2);
            imageView.setTag("blur_bottom_view");
        }
        Context context = this.LLILLJJLI.LIZ;
        imageView.setImageDrawable(new BitmapDrawable(context != null ? context.getResources() : null, this.LLILZ));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.LLILZIL.addView(imageView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("BlurProcessor@b2c2.updateBlurViewOnMainThread$1");
        try {
            LIZ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("BlurProcessor@b2c2.updateBlurViewOnMainThread$1");
    }
}
