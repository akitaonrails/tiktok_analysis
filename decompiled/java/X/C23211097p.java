package X;

import android.graphics.Bitmap;
import android.media.ThumbnailUtils;
import android.os.CancellationSignal;
import android.util.Size;
import com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.model.TikTokMediaModel;
import java.io.IOException;

/* JADX INFO: renamed from: X.097p, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23211097p<T> implements InterfaceC1478005qU {
    public final /* synthetic */ TikTokMediaModel LIZ;
    public final /* synthetic */ Size LIZIZ;
    public final /* synthetic */ CancellationSignal LIZJ;

    public C23211097p(TikTokMediaModel tikTokMediaModel, Size size, CancellationSignal cancellationSignal) {
        this.LIZ = tikTokMediaModel;
        this.LIZIZ = size;
        this.LIZJ = cancellationSignal;
    }

    @Override // X.InterfaceC1478005qU
    public final void subscribe(C09AJ<Bitmap> c09aj) throws IOException {
        Bitmap bitmapCreateImageThumbnail;
        C1C7U.LIZ("LocalImageThumbnailUtils@4a0b.loadImageInPhotoPicker$1");
        if (this.LIZ.LJIILJJIL()) {
            bitmapCreateImageThumbnail = ThumbnailUtils.createVideoThumbnail(new C0VSJ(this.LIZ.mediaPickerAbsolutePath), this.LIZIZ, this.LIZJ);
        } else {
            bitmapCreateImageThumbnail = ThumbnailUtils.createImageThumbnail(new C0VSJ(this.LIZ.mediaPickerAbsolutePath), this.LIZIZ, this.LIZJ);
        }
        if (!c09aj.isDisposed()) {
            c09aj.onNext(bitmapCreateImageThumbnail);
            c09aj.onComplete();
        } else {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Unable to load thumbnail for ");
            sbLIZ.append(this.LIZ);
            c09aj.onError(new RuntimeException(C2188811AlT.LIZIZ(sbLIZ)));
        }
        C1C7U.LIZIZ("LocalImageThumbnailUtils@4a0b.loadImageInPhotoPicker$1");
    }
}
