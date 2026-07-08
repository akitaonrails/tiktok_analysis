package X;

import Y.ACListenerS140S0100000_5;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import avg.f;
import com.zhiliaoapp.musically.R;
import mf.a;

/* JADX INFO: renamed from: X.0FIu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C387900FIu extends FrameLayout {
    public View LL;
    public ImageView LLILLJJLI;
    public View LLILLL;
    public C0FJ6 LLILZ;

    public final C0FJ6 getPinFirstClickListener() {
        return this.LLILZ;
    }

    public C387900FIu(Context context) {
        super(context, null);
        View viewSd = C786410Ut5.Sd(R.layout.c54, C786410Ut5.ne(context), this);
        this.LL = viewSd.findViewById(R.id.mpt);
        this.LLILLJJLI = (ImageView) viewSd.findViewById(R.id.view_image_text_template);
        this.LLILLL = viewSd.findViewById(R.id.xr2);
    }

    public final void LIZ(Bitmap bitmap) {
        ViewGroup.LayoutParams layoutParams;
        int i;
        if (bitmap != null) {
            int height = bitmap.getHeight();
            int width = bitmap.getWidth();
            if (height != 0 && width != 0) {
                ImageView imageView = this.LLILLJJLI;
                if (imageView != null) {
                    imageView.setImageBitmap(bitmap);
                }
                ImageView imageView2 = this.LLILLJJLI;
                if (imageView2 != null) {
                    layoutParams = imageView2.getLayoutParams();
                } else {
                    layoutParams = null;
                }
                if (layoutParams != null) {
                    i = layoutParams.height;
                } else {
                    i = 0;
                }
                int i2 = (i * width) / height;
                if (layoutParams != null) {
                    layoutParams.width = i2;
                }
                ImageView imageView3 = this.LLILLJJLI;
                if (imageView3 != null) {
                    C786410Ut5.c6(imageView3, layoutParams);
                }
                View view = this.LLILLL;
                if (view != null) {
                    C786410Ut5.LJLLLLLL(0, view);
                }
                View.OnClickListener aCListenerS140S0100000_5 = new ACListenerS140S0100000_5(this, 2);
                if (C1848410yCV.LIZ) {
                    aCListenerS140S0100000_5 = new f(aCListenerS140S0100000_5);
                }
                a aVar = new a(aCListenerS140S0100000_5);
                if (C2213981Bky.LIZIZ.isOffline()) {
                    C2211941Bhg.LIZ.injectViewListener(this);
                }
                setOnClickListener(aVar);
            }
        }
    }

    public final void setPinFirstClickListener(C0FJ6 c0fj6) {
        this.LLILZ = c0fj6;
    }
}
