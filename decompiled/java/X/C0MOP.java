package X;

import android.graphics.Bitmap;
import android.graphics.Rect;
import com.bytedance.fly_main_color.FlyMainColor;
import com.ss.android.ugc.aweme.canvas.CanvasBackground;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0MOP, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MOP extends C1D7S<C0MM1, CanvasBackground> {
    public static final /* synthetic */ int LIZIZ = 0;

    static {
        new C567410MNf();
    }

    @Override // X.C1D7S
    public final Object LIZIZ(Object obj, C1D7T c1d7t) {
        int iIntValue;
        Pair<Integer, Integer> pair;
        C0MM1 c0mm1 = (C0MM1) obj;
        Bitmap bitmap = c0mm1.LIZ;
        int iIntValue2 = -16777216;
        int iIntValue3 = 0;
        if (bitmap == null) {
            if (c0mm1.LIZIZ == 3) {
                pair = new C0HG2().LIZIZ(c0mm1.LIZ);
            } else {
                pair = new Pair<>(C2286608xc.LJ(-16777216), C2286608xc.LJ(-16777216));
            }
        } else {
            int i = c0mm1.LIZIZ;
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        pair = new C0H1X().LIZIZ(c0mm1.LIZ);
                    } else {
                        new C0HG2();
                        C443120HZe<Integer, Integer, Integer> c443120HZeLIZJ = C0HG2.LIZJ(c0mm1.LIZ);
                        iIntValue3 = c443120HZeLIZJ.getThird().intValue();
                        pair = new Pair<>(c443120HZeLIZJ.getFirst(), c443120HZeLIZJ.getSecond());
                    }
                } else {
                    C204674156y c204674156yLIZ = FlyMainColor.LIZ.LIZ(new C2439109h7(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight())));
                    c204674156yLIZ.LJI(0.0f);
                    c204674156yLIZ.LJFF(29.0f);
                    c204674156yLIZ.LJ(0.0f, 0.4f, 0.0f, 0.86f, 0.0f);
                    Integer numLIZIZ = c204674156yLIZ.LIZIZ();
                    if (numLIZIZ != null) {
                        iIntValue2 = numLIZIZ.intValue();
                    }
                    pair = new Pair<>(C2286608xc.LJ(iIntValue2), C2286608xc.LJ(iIntValue2));
                }
            } else {
                FlyMainColor flyMainColor = FlyMainColor.LIZ;
                C204674156y c204674156yLIZ2 = flyMainColor.LIZ(new C2439109h7(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight())));
                c204674156yLIZ2.LJI(0.0f);
                c204674156yLIZ2.LJFF(0.0f);
                c204674156yLIZ2.LJ(0.0f, 0.2f, 0.2f, 0.5f, 0.0f);
                Integer numLIZIZ2 = c204674156yLIZ2.LIZIZ();
                if (numLIZIZ2 != null) {
                    iIntValue = numLIZIZ2.intValue();
                } else {
                    iIntValue = -16777216;
                }
                Integer numLIZJ = c204674156yLIZ2.LIZJ();
                if (numLIZJ != null) {
                    iIntValue2 = numLIZJ.intValue();
                }
                if (flyMainColor.LIZIZ(iIntValue)[0] <= flyMainColor.LIZIZ(iIntValue2)[0]) {
                    pair = new Pair<>(C2286608xc.LJ(iIntValue), C2286608xc.LJ(iIntValue2));
                } else {
                    pair = new Pair<>(C2286608xc.LJ(iIntValue2), C2286608xc.LJ(iIntValue));
                }
            }
        }
        return C567410MNf.LIZ(iIntValue3, pair);
    }
}
