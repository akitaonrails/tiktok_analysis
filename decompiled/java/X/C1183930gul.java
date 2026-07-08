package X;

import com.ss.android.ugc.aweme.poi.detail.container.bottom.rectangle.PoiRectangleBottomBarComponent;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.rectangle.PoiRectangleBottomBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiBottomButtonGroup;
import com.ss.android.ugc.aweme.poi.detail.container.model.PoiButton;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;
import java.util.List;

/* JADX INFO: renamed from: X.0gul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1183930gul implements InterfaceC1180800gpi {
    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1180800gpi
    public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
        return C13LE.LIZ(PoiRectangleBottomBarComponent.class);
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
    public final InterfaceC1180980gq0<PoiRectangleBottomBarModule> LIZIZ() {
        return new C1208890hZ1(28);
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        PoiBottomButtonGroup poiBottomButtonGroup;
        List<PoiButton> list;
        if (baseComponentData == null || !(baseComponentData instanceof PoiRectangleBottomBarModule) || (poiBottomButtonGroup = ((PoiRectangleBottomBarModule) baseComponentData).getPoiBottomButtonGroup()) == null || (list = poiBottomButtonGroup.buttonList) == null || list.isEmpty()) {
            return false;
        }
        return true;
    }
}
