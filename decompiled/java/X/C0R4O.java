package X;

import android.graphics.drawable.Animatable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.lighten.loader.SmartImageView;

/* JADX INFO: renamed from: X.0R4O, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public class C0R4O implements InterfaceC427850Gq7 {
    public final int $t;
    public Object l0;

    public static final void A3$0(C0R4O c0r4o, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void A3$1(C0R4O c0r4o, Uri uri, C428600GrK c428600GrK) {
    }

    public static final void Ad$0(C0R4O c0r4o, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Ad$1(C0R4O c0r4o, Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
    }

    public static final void Bh$0(C0R4O c0r4o, Uri uri, View view) {
    }

    public static final void Bh$1(C0R4O c0r4o, Uri uri, View view) {
    }

    public static final void e1$0(C0R4O c0r4o, Uri uri) {
    }

    public static final void e1$1(C0R4O c0r4o, Uri uri) {
    }

    public static final void lg$0(C0R4O c0r4o, Uri uri, Throwable th) {
    }

    public static final void lg$1(C0R4O c0r4o, Uri uri, Throwable th) {
    }

    @Override // X.InterfaceC427850Gq7
    public final void A3(Uri uri, C428600GrK c428600GrK) {
        switch (this.$t) {
            case 0:
                A3$0(this, uri, c428600GrK);
                break;
            case 1:
                A3$1(this, uri, c428600GrK);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Ad(Uri uri, View view, C428600GrK c428600GrK, Animatable animatable) {
        switch (this.$t) {
            case 0:
                Ad$0(this, uri, view, c428600GrK, animatable);
                break;
            case 1:
                Ad$1(this, uri, view, c428600GrK, animatable);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void Bh(Uri uri, View view) {
        switch (this.$t) {
            case 0:
                Bh$0(this, uri, view);
                break;
            case 1:
                Bh$1(this, uri, view);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void cm(Uri uri, View view, Throwable th) {
        switch (this.$t) {
            case 0:
                cm$0(this, uri, view, th);
                break;
            case 1:
                cm$1(this, uri, view, th);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void e1(Uri uri) {
        switch (this.$t) {
            case 0:
                e1$0(this, uri);
                break;
            case 1:
                e1$1(this, uri);
                break;
        }
    }

    @Override // X.InterfaceC427850Gq7
    public final void lg(Uri uri, Throwable th) {
        switch (this.$t) {
            case 0:
                lg$0(this, uri, th);
                break;
            case 1:
                lg$1(this, uri, th);
                break;
        }
    }

    public C0R4O(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void cm$0(C0R4O c0r4o, Uri uri, View view, Throwable th) {
        C786410Ut5.LLZZLLIL((C1322110kVd) ((C676240Qfm) c0r4o.l0).LJIIIZ.getValue(), 0);
        ((C676240Qfm) c0r4o.l0).LIZIZ().setScaleType(ImageView.ScaleType.FIT_XY);
    }

    public static final void cm$1(C0R4O c0r4o, Uri uri, View view, Throwable th) {
        SmartImageView screenshotImage = ((C677230QhN) c0r4o.l0).getScreenshotImage();
        if (screenshotImage != null) {
            int i = ((C677230QhN) c0r4o.l0).LLILZ;
            ViewGroup.LayoutParams layoutParams = screenshotImage.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i;
            C786410Ut5.W5(screenshotImage, layoutParams);
        }
    }
}
