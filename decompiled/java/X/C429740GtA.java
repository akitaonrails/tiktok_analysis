package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0GtA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C429740GtA extends ConstraintLayout {
    public float LL;
    public final View LLILLJJLI;
    public final View LLILLL;

    public final void e0() {
        Drawable background = getBackground();
        if (background != null) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(270, 270, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            background.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            background.draw(canvas);
            if (bitmapCreateBitmap == null || bitmapCreateBitmap.sameAs(Bitmap.createBitmap(bitmapCreateBitmap.getWidth(), bitmapCreateBitmap.getHeight(), Bitmap.Config.ARGB_8888))) {
                return;
            }
            Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, bitmapCreateBitmap.getWidth(), (int) (bitmapCreateBitmap.getHeight() * 0.22222222f));
            Bitmap bitmapCreateBitmap3 = Bitmap.createBitmap(bitmapCreateBitmap, 0, (int) (bitmapCreateBitmap.getHeight() - (bitmapCreateBitmap.getHeight() * 0.44444445f)), bitmapCreateBitmap.getWidth(), (int) (bitmapCreateBitmap.getHeight() * 0.44444445f));
            this.LLILLJJLI.setBackground(new BitmapDrawable(getContext().getResources(), bitmapCreateBitmap2));
            this.LLILLL.setBackground(new BitmapDrawable(getContext().getResources(), bitmapCreateBitmap3));
            setBackground(null);
            ViewOnAttachStateChangeListenerC1846530y9T.LIZJ(this);
            setAlpha(1.0f);
        }
    }

    public C429740GtA(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        ImageView imageView = new ImageView(context);
        imageView.setId(View.generateViewId());
        this.LLILLJJLI = imageView;
        ImageView imageView2 = new ImageView(context);
        imageView2.setId(View.generateViewId());
        this.LLILLL = imageView2;
        int iLJIIIZ = C497740JfY.LJIIIZ(R.dimen.b1o);
        float f = iLJIIIZ;
        addView(imageView, new C19ME(iLJIIIZ, (int) (0.22222222f * f)));
        addView(imageView2, new C19ME(iLJIIIZ, (int) (f * 0.44444445f)));
        C19MB c19mb = new C19MB();
        c19mb.LJII(this);
        c19mb.LJIIIIZZ(imageView.getId(), 3, 0, 3);
        c19mb.LJIIIIZZ(imageView.getId(), 6, 0, 6);
        c19mb.LJIIIIZZ(imageView.getId(), 7, 0, 7);
        c19mb.LJIIIIZZ(imageView2.getId(), 4, 0, 4);
        c19mb.LJIIIIZZ(imageView2.getId(), 6, 0, 6);
        c19mb.LJIIIIZZ(imageView2.getId(), 7, 0, 7);
        c19mb.LIZIZ(this);
    }
}
