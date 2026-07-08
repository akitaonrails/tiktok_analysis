package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ghj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C422650Ghj extends FrameLayout {
    public final FrameLayout LL;
    public final ImageView LLILLJJLI;
    public final int LLILLL;
    public int LLILZ;
    public final int LLILZIL;

    public C422650Ghj(Context context) {
        super(context, null, 0);
        this.LLILLL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(40));
        this.LLILZ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(266));
        this.LLILZIL = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(49));
        C786410Ut5.Td(C786410Ut5.ne(context), R.layout.d19, this, true);
        this.LL = (FrameLayout) findViewById(R.id.ibk);
        this.LLILLJJLI = (ImageView) findViewById(R.id.lkw);
    }

    public final void setWatermarkImage(Bitmap bitmap) {
        ViewGroup.LayoutParams layoutParams;
        if (bitmap == null) {
            ImageView imageView = this.LLILLJJLI;
            if (imageView != null) {
                imageView.setImageResource(R.drawable.a3z);
                return;
            }
            return;
        }
        this.LLILZ = C814420VxA.LIZIZ(bitmap.getWidth() * (this.LLILZIL / bitmap.getHeight()));
        ImageView imageView2 = this.LLILLJJLI;
        if (imageView2 != null && (layoutParams = imageView2.getLayoutParams()) != null) {
            layoutParams.width = this.LLILZ;
        }
        ImageView imageView3 = this.LLILLJJLI;
        if (imageView3 != null) {
            imageView3.setImageBitmap(bitmap);
        }
    }
}
