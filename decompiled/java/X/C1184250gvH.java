package X;

import com.ss.android.ugc.aweme.base.model.UrlModel;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryAssem;
import com.ss.android.ugc.aweme.poi.detail.basicinfo.header.p008new.PoiHeaderGalleryModule;
import com.ss.android.ugc.aweme.poi.detail.container.model.PictureAlbum;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.List;

/* JADX INFO: renamed from: X.0gvH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184250gvH implements InterfaceC1180800gpi {
    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1180800gpi
    public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
        return C13LE.LIZ(PoiHeaderGalleryAssem.class);
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181340gqa LJII() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1181670gr7 service() {
        return null;
    }

    @Override // X.InterfaceC1180970gpz
    public final InterfaceC1180980gq0<PoiHeaderGalleryModule> LIZIZ() {
        return new C1208890hZ1(20);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        PictureAlbum pictureAlbum;
        List<UrlModel> picturesByExperiment;
        if (!(baseComponentData instanceof PoiHeaderGalleryModule) || (pictureAlbum = ((PoiHeaderGalleryModule) baseComponentData).getPictureAlbum()) == null || (picturesByExperiment = pictureAlbum.getPicturesByExperiment()) == null || !(!picturesByExperiment.isEmpty())) {
            return false;
        }
        return true;
    }
}
