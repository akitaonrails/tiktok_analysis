package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.TextureView;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0qNs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1547940qNs extends FrameLayout {
    public final TextureView LL;
    public final ImageView LLILLJJLI;
    public Bitmap LLILLL;

    public final Bitmap getVideoFrame() {
        return C1507750pL3.LIZ == EnumC1508940pMy.PLAYER_IDLE ? this.LLILLL : this.LL.getBitmap();
    }

    public final void setCoverImage(Bitmap bitmap) {
        this.LLILLL = bitmap;
        if (bitmap != null) {
            this.LLILLJJLI.setImageBitmap(bitmap);
        }
    }

    public C1547940qNs(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        C786410Ut5.Td(C786410Ut5.ne(getContext()), R.layout.i9o, this, true);
        this.LL = (TextureView) findViewById(R.id.video_surface);
        this.LLILLJJLI = (ImageView) findViewById(R.id.cover);
    }
}
