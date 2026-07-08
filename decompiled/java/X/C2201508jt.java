package X;

import android.graphics.ImageDecoder;

/* JADX INFO: renamed from: X.08jt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2201508jt implements ImageDecoder.OnHeaderDecodedListener {
    public final /* synthetic */ int LIZ;
    public final /* synthetic */ int LIZIZ;

    public C2201508jt(int i, int i2) {
        this.LIZ = i;
        this.LIZIZ = i2;
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        float width = imageInfo.getSize().getWidth();
        float height = imageInfo.getSize().getHeight();
        float fMin = Math.min(this.LIZ / width, this.LIZIZ / height);
        if (fMin > 1.0f) {
            fMin = 1.0f;
        }
        int i = (int) (width * fMin);
        if (i < 1) {
            i = 1;
        }
        int i2 = (int) (height * fMin);
        if (i2 < 1) {
            i2 = 1;
        }
        imageDecoder.setTargetSize(i, i2);
        imageDecoder.setAllocator(1);
    }
}
