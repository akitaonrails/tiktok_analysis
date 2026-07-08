package X;

import com.ss.android.ugc.aweme.poi.detail.container.background.CoverImg;
import com.ss.android.ugc.aweme.poi.detail.container.background.PoiHeaderImageAssemV2;
import com.ss.android.ugc.aweme.poi.detail.container.background.PoiHeaderImgModule;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.List;

/* JADX INFO: renamed from: X.0gnE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1179260gnE implements InterfaceC1180800gpi {
    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1180800gpi
    public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
        return C13LE.LIZ(PoiHeaderImageAssemV2.class);
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
    public final InterfaceC1180980gq0<PoiHeaderImgModule> LIZIZ() {
        return new C1208890hZ1(1);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        CoverImg coverImg;
        List<String> list;
        if (!(baseComponentData instanceof PoiHeaderImgModule) || (coverImg = ((PoiHeaderImgModule) baseComponentData).getCoverImg()) == null || (list = coverImg.urlList) == null || !(!list.isEmpty())) {
            return false;
        }
        return true;
    }
}
