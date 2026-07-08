package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import java.io.InputStream;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.0L46, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L46 implements C0L47<Bitmap> {
    @Override // X.C0L47
    public final C0L45<Bitmap> LIZIZ(InputStream inputStream) {
        Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(inputStream);
        bitmapDecodeStream.getWidth();
        bitmapDecodeStream.getHeight();
        return new C0L45<>(bitmapDecodeStream);
    }

    @Override // X.C0L47
    public final void LIZ(OutputStream outputStream, C0L45<Bitmap> c0l45) {
        c0l45.LIZ.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
    }
}
