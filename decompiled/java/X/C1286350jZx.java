package X;

import android.media.ImageReader;
import android.os.Build;
import android.os.Handler;
import com.ss.ttm.player.AJProducerManager;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.0jZx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1286350jZx {
    public ImageReader LIZ;
    public final int LIZIZ;
    public long LIZJ;
    public ImageReader.OnImageAvailableListener LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(e3.e);
        sbLIZ.append(super.toString());
        sbLIZ.append(",pid:");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(",reader:");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(e3.f);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1286350jZx(long j, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            this.LIZ = ImageReader.newInstance(1, 1, 35, 2, 304L);
        } else {
            this.LIZ = ImageReader.newInstance(1, 1, 35, 2);
        }
        this.LIZIZ = i;
        this.LIZJ = j;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("new:");
        sbLIZ.append(this);
        C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(ImageReader.OnImageAvailableListener onImageAvailableListener, Handler handler) {
        ImageReader imageReader = this.LIZ;
        if (imageReader != null) {
            imageReader.setOnImageAvailableListener(onImageAvailableListener, handler);
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("setOnImageAvailableListener:");
            sbLIZ.append(this);
            sbLIZ.append(",handler:");
            sbLIZ.append(handler);
            C2188811AlT.LIZIZ(sbLIZ);
            if (onImageAvailableListener != null) {
                AJProducerManager.LIZ(onImageAvailableListener, 2);
            } else {
                AJProducerManager.LIZ(this.LIZLLL, 1);
            }
            this.LIZLLL = onImageAvailableListener;
        }
    }
}
