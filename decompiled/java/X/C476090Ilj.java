package X;

import android.content.Context;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0Ilj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476090Ilj {
    public final FrameLayout LIZ;
    public final Context LIZIZ;
    public final int LIZJ = (int) C497740JfY.LIZIZ(110.0f);
    public final C1324720kZq LIZLLL;
    public final C1324720kZq LJ;
    public final C1324720kZq LJFF;

    public C476090Ilj(FrameLayout frameLayout) {
        this.LIZ = frameLayout;
        this.LIZIZ = frameLayout.getContext();
        this.LIZLLL = (C1324720kZq) frameLayout.findViewById(R.id.bij);
        this.LJ = (C1324720kZq) frameLayout.findViewById(R.id.bk5);
        this.LJFF = (C1324720kZq) frameLayout.findViewById(R.id.bku);
    }

    public static void LIZIZ(ImageModel imageModel, C1324720kZq c1324720kZq) {
        C1324610kZf c1324610kZfLJIIIZ = C1819620xS4.LIZ().LJIIIZ(imageModel);
        c1324610kZfLJIIIZ.LJIILIIL = Boolean.TRUE;
        c1324610kZfLJIIIZ.LJIJJ = ImageView.ScaleType.CENTER_CROP;
        c1324610kZfLJIIIZ.LJIIIZ = R.drawable.el9;
        c1324610kZfLJIIIZ.LJJI(c1324720kZq);
    }

    public static void LIZ(int i, int i2, int i3, C1324720kZq c1324720kZq) {
        float f = i3 + i;
        c1324720kZq.setCutoutTopOffset(i - f);
        c1324720kZq.setCutoutStartOffset((-(i - i2)) - f);
        c1324720kZq.setCutoutRadius(f);
    }
}
