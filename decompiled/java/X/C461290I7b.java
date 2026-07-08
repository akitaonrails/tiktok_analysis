package X;

import android.graphics.Bitmap;
import java.util.Map;

/* JADX INFO: renamed from: X.0I7b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class C461290I7b implements InterfaceC1331800klG {
    @Override // X.InterfaceC1331800klG
    public final String getKey() {
        return "center_crop_transform";
    }

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZIZ(Bitmap bitmap, C0I7N c0i7n) {
        Bitmap bitmapCreateBitmap;
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        if (width >= height) {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, (width / 2) - (height / 2), 0, height, height);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap(bitmap, 0, (height / 2) - (width / 2), width, width);
        }
        return ((C1331760klC) c0i7n).LIZIZ(bitmapCreateBitmap);
    }

    @Override // X.InterfaceC1331800klG
    public final InterfaceC1332090klj LIZ(Bitmap bitmap, C0I7N c0i7n, Map map) {
        return LIZIZ(bitmap, c0i7n);
    }
}
