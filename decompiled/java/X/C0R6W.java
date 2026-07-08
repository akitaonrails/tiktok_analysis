package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.experiment.BlurHashMetaDataSettings;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.model.ImagePreviewModel;

/* JADX INFO: renamed from: X.0R6W, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0R6W {
    public final C0R6B LIZ;
    public final C0R5B LIZIZ = new C0R5B();

    public final C708750Rr7 LIZ() {
        C0RF0 c0rf0;
        final C690870R8b c690870R8bJm = this.LIZ.LIZIZ().jm();
        final Fragment fragment = (c690870R8bJm == null || (c0rf0 = c690870R8bJm.LIZLLL) == null) ? null : c0rf0.LIZJ;
        return new C708750Rr7(new InterfaceC691060R8u(this, c690870R8bJm, fragment) { // from class: X.0R6X
            @Override // X.InterfaceC691060R8u
            public final void LIZ() {
            }
        }, this.LIZ.getAweme(), this.LIZIZ);
    }

    static {
        if (C1E8Y.LIZ()) {
            C1318140kPE.LJII = BlurHashMetaDataSettings.getMetadata();
        }
    }

    public C0R6W(C0R6G c0r6g) {
        this.LIZ = c0r6g;
    }

    public static String LIZIZ(Video video) {
        UrlModel originCover;
        ImagePreviewModel previewModel;
        if (C1E8Y.LIZ() && (originCover = video.getOriginCover()) != null && (previewModel = originCover.getPreviewModel()) != null && previewModel.getPreviewType() == 2) {
            return previewModel.getData();
        }
        return null;
    }
}
