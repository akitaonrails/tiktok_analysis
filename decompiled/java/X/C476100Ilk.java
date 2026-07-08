package X;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.List;

/* JADX INFO: renamed from: X.0Ilk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C476100Ilk {
    public final FrameLayout LIZ;
    public final C476110Ill LIZIZ;
    public final C1324720kZq LIZJ;
    public final C1324720kZq LIZLLL;
    public final C1324720kZq LJ;
    public final View LJFF;

    public final void LIZJ(List<? extends ImageModel> list) {
        if (list.isEmpty()) {
            return;
        }
        if (list.size() == 1) {
            ImageModel imageModel = (ImageModel) ListProtector.get(list, 0);
            C786410Ut5.LLJJIII(this.LIZJ, 0);
            C786410Ut5.LLJJIII(this.LIZLLL, 8);
            C786410Ut5.LLJJIII(this.LJ, 8);
            C500260Jjc.LJLJLJ(this.LJFF, this.LIZIZ.LIZLLL);
            LIZIZ(imageModel, this.LIZJ);
            int iLIZIZ = (int) C497740JfY.LIZIZ(this.LIZIZ.LIZ);
            int i = iLIZIZ * 2;
            C786410Ut5.u6(this.LIZJ, new FrameLayout.LayoutParams(i, i));
            if (this.LIZIZ.LIZLLL) {
                int iCeil = (int) Math.ceil(((double) iLIZIZ) * 0.25d);
                int i2 = iCeil * 2;
                C500260Jjc.LJLL(i2, i2, this.LJFF);
                C1324720kZq c1324720kZq = this.LIZJ;
                float f = i - i2;
                c1324720kZq.setCutoutTopOffset(f);
                c1324720kZq.setCutoutStartOffset(f);
                c1324720kZq.setCutoutRadius(iCeil);
            }
        }
        if (list.size() == 2) {
            ImageModel imageModel2 = (ImageModel) ListProtector.get(list, 0);
            ImageModel imageModel3 = (ImageModel) ListProtector.get(list, 1);
            C786410Ut5.LLJJIII(this.LIZJ, 0);
            C786410Ut5.LLJJIII(this.LIZLLL, 0);
            C786410Ut5.LLJJIII(this.LJ, 8);
            C500260Jjc.LJLJLJ(this.LJFF, false);
            int iLIZIZ2 = (int) C497740JfY.LIZIZ(this.LIZIZ.LIZ);
            int iLIZIZ3 = (int) C497740JfY.LIZIZ(this.LIZIZ.LIZIZ);
            int iLIZIZ4 = (int) C497740JfY.LIZIZ(this.LIZIZ.LIZJ);
            LIZIZ(imageModel2, this.LIZJ);
            LIZIZ(imageModel3, this.LIZLLL);
            LIZ(iLIZIZ2, iLIZIZ4, iLIZIZ3, this.LIZLLL);
            int i3 = iLIZIZ2 * 2;
            int i4 = (i3 - iLIZIZ4) + iLIZIZ3;
            C786410Ut5.u6(this.LIZJ, new FrameLayout.LayoutParams(i3, i3));
            C1324720kZq c1324720kZq2 = this.LIZLLL;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i3, i3);
            layoutParams.setMarginStart(i4);
            C786410Ut5.u6(c1324720kZq2, layoutParams);
        }
        if (list.size() > 2) {
            ImageModel imageModel4 = (ImageModel) ListProtector.get(list, 0);
            ImageModel imageModel5 = (ImageModel) ListProtector.get(list, 1);
            ImageModel imageModel6 = (ImageModel) ListProtector.get(list, 2);
            C786410Ut5.LLJJIII(this.LIZJ, 0);
            C786410Ut5.LLJJIII(this.LIZLLL, 0);
            C786410Ut5.LLJJIII(this.LJ, 0);
            C500260Jjc.LJLJLJ(this.LJFF, false);
            int iLIZIZ5 = (int) C497740JfY.LIZIZ(this.LIZIZ.LIZ);
            int iLIZIZ6 = (int) C497740JfY.LIZIZ(this.LIZIZ.LIZIZ);
            int iLIZIZ7 = (int) C497740JfY.LIZIZ(this.LIZIZ.LIZJ);
            LIZIZ(imageModel4, this.LIZJ);
            LIZIZ(imageModel5, this.LIZLLL);
            LIZIZ(imageModel6, this.LJ);
            LIZ(iLIZIZ5, iLIZIZ7, iLIZIZ6, this.LIZLLL);
            LIZ(iLIZIZ5, iLIZIZ7, iLIZIZ6, this.LJ);
            int i5 = iLIZIZ5 * 2;
            int i6 = (i5 - iLIZIZ7) + iLIZIZ6;
            C786410Ut5.u6(this.LIZJ, new FrameLayout.LayoutParams(i5, i5));
            C1324720kZq c1324720kZq3 = this.LIZLLL;
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(i5, i5);
            layoutParams2.setMarginStart(i6);
            C786410Ut5.u6(c1324720kZq3, layoutParams2);
            C1324720kZq c1324720kZq4 = this.LJ;
            FrameLayout.LayoutParams layoutParams3 = new FrameLayout.LayoutParams(i5, i5);
            layoutParams3.setMarginStart(i6 * 2);
            C786410Ut5.u6(c1324720kZq4, layoutParams3);
        }
    }

    public C476100Ilk(FrameLayout frameLayout, C476110Ill c476110Ill) {
        this.LIZ = frameLayout;
        this.LIZIZ = c476110Ill;
        this.LIZJ = (C1324720kZq) frameLayout.findViewById(R.id.bij);
        this.LIZLLL = (C1324720kZq) frameLayout.findViewById(R.id.bk5);
        this.LJ = (C1324720kZq) frameLayout.findViewById(R.id.bku);
        this.LJFF = frameLayout.findViewById(R.id.view_online_dot);
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
