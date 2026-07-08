package X;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.FrameLayout;
import com.ss.android.ugc.aweme.model.SlidesImageLoadParams;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: X.0SKa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public interface InterfaceC719460SKa {
    View.OnTouchListener Hg();

    RectF I8();

    RectF LIZJ();

    void LIZLLL(int i, int i2);

    FrameLayout LJ();

    View LJI();

    SlidesImageLoadParams LJII();

    void LJIIIIZZ(Drawable drawable);

    boolean LJIIIZ();

    CopyOnWriteArrayList<SlidesImageLoadParams> LJIIJ();

    String LJIIJJI();

    Bitmap LJIIL();

    Bitmap LJIILIIL();

    void LJIILJJIL();

    String getImageUrl();

    View getImageView();
}
