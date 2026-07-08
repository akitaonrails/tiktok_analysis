package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Point;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.shortvideo.ScreenUtils;
import kotlin.Pair;
import kotlin.jvm.internal.AwS569S0100000_25;
import lgo.a;

/* JADX INFO: renamed from: X.0tDE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1656660tDE extends AbstractC1291220jho {
    public Context LIZ;
    public LifecycleOwner LIZIZ;
    public int LIZJ = C814420VxA.LIZIZ(C418440Gaw.LIZIZ(32));

    public C1656660tDE(Context context, LifecycleOwner lifecycleOwner) {
        this.LIZ = context;
        this.LIZIZ = lifecycleOwner;
        if (((Boolean) C268170Af9.LIZ.getValue()).booleanValue()) {
            a.LIZIZ.LIZ().LIZJ(this.LIZIZ, "StickerCropPostProcessor#init", new AwS569S0100000_25(this, 944));
        }
    }

    @Override // X.AbstractC1291220jho, X.InterfaceC1291910jiv
    public final C1323050kX9<Bitmap> process(Bitmap bitmap, AbstractC1301670jyf abstractC1301670jyf) {
        int width = (bitmap.getWidth() + 1) / 2;
        int height = (bitmap.getHeight() + 1) / 2;
        int width2 = bitmap.getWidth() - 1;
        int height2 = bitmap.getHeight() - 1;
        int i = 0;
        for (int i2 = 0; i2 < width && bitmap.getPixel(i2, height) == 0; i2++) {
            i = i2;
        }
        int width3 = bitmap.getWidth() - 1;
        if (width <= width3) {
            while (true) {
                int i3 = width2;
                width2 = width3;
                if (bitmap.getPixel(width3, height) != 0) {
                    width2 = i3;
                    break;
                }
                if (width3 == width) {
                    break;
                }
                width3--;
            }
        }
        int i4 = 0;
        for (int i5 = 0; i5 < height && bitmap.getPixel(width, i5) == 0; i5++) {
            i4 = i5;
        }
        int height3 = bitmap.getHeight() - 1;
        if (height <= height3) {
            while (true) {
                int i6 = height2;
                height2 = height3;
                if (bitmap.getPixel(width, height3) != 0) {
                    height2 = i6;
                    break;
                }
                if (height3 == height) {
                    break;
                }
                height3--;
            }
        }
        Pair pair = new Pair(new Point(i, i4), new Point(width2, height2));
        Point point = (Point) pair.getFirst();
        Point point2 = (Point) pair.getSecond();
        int i7 = (point2.x - point.x) + 1;
        int i8 = (point2.y - point.y) + 1;
        float screenWidth = (this.LIZJ / i8) * (ScreenUtils.getScreenWidth(this.LIZ) / C418440Gaw.LIZIZ(390));
        Matrix matrix = new Matrix();
        matrix.postScale(screenWidth, screenWidth);
        return C1323050kX9.LJFF(abstractC1301670jyf.LIZLLL(bitmap, point.x, point.y, i7, i8, matrix));
    }
}
