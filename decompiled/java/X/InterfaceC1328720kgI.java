package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Rect;
import java.io.InputStream;
import java.util.Map;

/* JADX INFO: renamed from: X.0kgI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1328720kgI {
    Bitmap decodeByNativePtr(long j, int i, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil);

    Bitmap decodeByNativePtrCombineSr(long j, int i, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil, C1328950kgf c1328950kgf, Map<String, String> map);

    Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options);

    Bitmap decodeStream(InputStream inputStream, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil);

    Bitmap decodeThumb(InputStream inputStream, Rect rect, BitmapFactory.Options options);

    Bitmap decodeThumbByNativePtr(long j, int i, int i2, int i3, Rect rect, BitmapFactory.Options options, C1330250kil c1330250kil);
}
