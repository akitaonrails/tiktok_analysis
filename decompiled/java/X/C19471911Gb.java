package X;

import androidx.lifecycle.ViewModelProviders;
import com.ss.android.ugc.aweme.ecommerce.search.vision.record.model.EcPhotoSearchAlbumVM;

/* JADX INFO: renamed from: X.11Gb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19471911Gb {
    public static EcPhotoSearchAlbumVM LIZ(C19EG c19eg) {
        if (c19eg == null) {
            return null;
        }
        return (EcPhotoSearchAlbumVM) ViewModelProviders.of(c19eg).get(EcPhotoSearchAlbumVM.class);
    }
}
