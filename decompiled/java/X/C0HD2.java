package X;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ss.android.ugc.aweme.base.model.UrlModel;

/* JADX INFO: renamed from: X.0HD2, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HD2 extends C416750GVt {
    public final int LLILZ;
    public final UrlModel LLILZIL;
    public final View LLILZLL;
    public Drawable LLIZ;

    @Override // android.text.style.ImageSpan, android.text.style.DynamicDrawableSpan
    public final Drawable getDrawable() {
        Drawable drawable = this.LLIZ;
        return drawable == null ? super.getDrawable() : drawable;
    }

    public C0HD2(Drawable drawable, int i, UrlModel urlModel, View view) {
        super(drawable);
        this.LLILZ = i;
        this.LLILZIL = urlModel;
        this.LLILZLL = view;
        C1324840ka2.LJIJ(urlModel, i, i, new InterfaceC447230HgH() { // from class: X.0HD3
            @Override // X.InterfaceC447230HgH
            public final void accept(Object obj) {
                Bitmap bitmap = (Bitmap) obj;
                if (bitmap != null && !bitmap.isRecycled()) {
                    this.LIZ.LLIZ = new BitmapDrawable(bitmap);
                    C0HD2 c0hd2 = this.LIZ;
                    Drawable drawable2 = c0hd2.LLIZ;
                    if (drawable2 != null) {
                        int i2 = c0hd2.LLILZ;
                        drawable2.setBounds(0, 0, i2, i2);
                    }
                    this.LIZ.LLILZLL.postInvalidate();
                }
            }
        });
    }
}
