package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.BlurHashMetaDataSettings;
import com.ss.android.ugc.aweme.model.ImagePreviewModel;

/* JADX INFO: renamed from: X.0Rr6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C708740Rr6 {
    public static final C708740Rr6 LIZ = new C708740Rr6();
    public static volatile boolean LIZIZ;

    public static boolean LIZIZ(UrlModel urlModel) {
        ImagePreviewModel previewModel;
        String data;
        if (urlModel == null || (previewModel = urlModel.getPreviewModel()) == null || (data = previewModel.getData()) == null || data.length() == 0 || previewModel.getPreviewType() != 2) {
            return false;
        }
        return true;
    }

    public final C1331670kl3 LIZ(C1331670kl3 c1331670kl3, UrlModel urlModel, int i, int i2) {
        ImagePreviewModel previewModel;
        String data;
        if (urlModel == null || (previewModel = urlModel.getPreviewModel()) == null || (data = previewModel.getData()) == null || data.length() == 0 || previewModel.getPreviewType() != 2) {
            return c1331670kl3;
        }
        if (!LIZIZ) {
            synchronized (this) {
                try {
                    if (!LIZIZ) {
                        C1318140kPE.LJII = BlurHashMetaDataSettings.getMetadata();
                        LIZIZ = true;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        if (i > 0 && i2 > 0) {
            c1331670kl3.LJJJLZIJ = i;
            c1331670kl3.LJJJZ = i2;
        }
        c1331670kl3.LIZIZ(data);
        return c1331670kl3;
    }
}
