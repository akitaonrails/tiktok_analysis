package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import com.ss.android.vesdk.model.BefTextLayout;
import com.ss.android.vesdk.model.BefTextLayoutResult;

/* JADX INFO: renamed from: X.19jT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public final class C21620919jT implements InterfaceC21621119jV {
    @Override // X.InterfaceC21621119jV
    public final BefTextLayoutResult LIZ(String str, BefTextLayout befTextLayout) {
        StaticLayout staticLayout;
        BefTextLayoutResult befTextLayoutResult = new BefTextLayoutResult();
        C21621019jU c21621019jU = new C21621019jU(befTextLayout);
        if (c21621019jU.LIZLLL != 2) {
            staticLayout = new StaticLayout(str, c21621019jU.LIZ, c21621019jU.LIZIZ, Layout.Alignment.ALIGN_NORMAL, c21621019jU.LJI, 0.0f, false);
        } else {
            staticLayout = new StaticLayout(str, 0, str.length(), c21621019jU.LIZ, c21621019jU.LIZIZ, Layout.Alignment.ALIGN_NORMAL, c21621019jU.LJI, 0.0f, false, TextUtils.TruncateAt.END, c21621019jU.LIZIZ * c21621019jU.LIZJ);
        }
        int i = c21621019jU.LIZJ;
        if (i == 0) {
            i = Integer.MAX_VALUE;
        }
        c21621019jU.LJII = Math.min(i, staticLayout.getLineCount());
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(staticLayout.getWidth(), staticLayout.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        int i2 = (int) c21621019jU.LJ;
        canvas.drawColor(((i2 << 24) & (-16777216)) | ((i2 >> 8) & 16777215));
        staticLayout.draw(canvas);
        Bitmap bitmapCreateBitmap2 = Bitmap.createBitmap(bitmapCreateBitmap, 0, 0, c21621019jU.LIZIZ, Math.min(Math.round((c21621019jU.LJII * c21621019jU.LJI * c21621019jU.LJFF) + c21621019jU.LIZ.getFontMetrics().descent), bitmapCreateBitmap.getHeight()));
        befTextLayoutResult.setBitmap(bitmapCreateBitmap2);
        befTextLayoutResult.setLineCount(c21621019jU.LJII);
        befTextLayoutResult.setHeight(bitmapCreateBitmap2.getHeight());
        befTextLayoutResult.setWidth(bitmapCreateBitmap2.getWidth());
        return befTextLayoutResult;
    }
}
