package X;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import com.ss.android.ugc.aweme.editSticker.model.CoverPublishModel;

/* JADX INFO: renamed from: X.0MZX, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MZX {
    public static final Bitmap LIZIZ(Bitmap bitmap, CoverPublishModel coverPublishModel) {
        if (coverPublishModel == null) {
            return bitmap;
        }
        return coverPublishModel.getEffectTextModel().mergeCoverText(bitmap);
    }

    public static final Bitmap LIZ(Bitmap bitmap, Bitmap bitmap2, Bitmap.Config config) {
        Paint paint = new Paint(2);
        Paint paint2 = new Paint();
        paint2.setColor(-16777216);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap2.getWidth(), bitmap2.getHeight(), config);
        Canvas canvas = new Canvas(bitmapCreateBitmap);
        Rect rect = new Rect(0, 0, bitmap2.getWidth(), bitmap2.getHeight());
        canvas.drawRect(rect, paint2);
        if (bitmap.getHeight() < bitmap2.getHeight()) {
            int height = (bitmap2.getHeight() - ((int) ((bitmap.getHeight() / bitmap.getWidth()) * bitmap2.getWidth()))) / 2;
            canvas.drawBitmap(bitmap, new Rect(0, 0, bitmap.getWidth(), bitmap.getHeight()), new Rect(0, height, bitmap2.getWidth(), bitmap2.getHeight() - height), paint);
        }
        canvas.drawBitmap(bitmap2, rect, rect, paint);
        return bitmapCreateBitmap;
    }
}
