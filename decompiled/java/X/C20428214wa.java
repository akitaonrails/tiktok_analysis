package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.noticeboard.common.multicanvas.tools.MultiCanvasUtils;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import java.io.File;

/* JADX INFO: renamed from: X.14wa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20428214wa {
    public static C20427714wV LIZIZ() {
        String[] strArr = C20428814wg.LIZIZ;
        String str = strArr[0];
        int iLJIIZILJ = C497740JfY.LJIIZILJ();
        int iLJIILLIIL = C497740JfY.LJIILLIIL();
        int color = ColorProtector.parseColor(str);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str.substring(str.indexOf(35) + 1));
        sbLIZ.append(".webp");
        return new C20427714wV(LIZ(iLJIIZILJ, iLJIILLIIL, color, C2188811AlT.LIZIZ(sbLIZ)).getAbsolutePath(), true, ColorProtector.parseColor(strArr[0]));
    }

    public static C0VSJ LIZ(int i, int i2, int i3, String str) {
        if (i > 0 && i2 > 0) {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            Paint paint = new Paint();
            paint.setColor(i3);
            canvas.drawRect(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight(), paint);
            MultiCanvasUtils multiCanvasUtils = MultiCanvasUtils.LIZ;
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pure_color");
            sbLIZ.append(File.separator);
            sbLIZ.append(str);
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            Bitmap.CompressFormat compressFormat = Bitmap.CompressFormat.WEBP;
            multiCanvasUtils.getClass();
            return new C0VSJ(MultiCanvasUtils.LJIJJLI(bitmapCreateBitmap, strLIZIZ, compressFormat));
        }
        return new C0VSJ("");
    }
}
