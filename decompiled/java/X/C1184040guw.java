package X;

import androidx.fragment.app.Fragment;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.poi.detail.container.IPoiDetailTypeAbility;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiBottomBarModule;
import com.ss.android.ugc.aweme.poi.detail.container.bottom.PoiDetailPermanentBottomBarAssem;
import com.ss.android.ugc.aweme.poi.detail.container.ui.PoiDetailBottomBarAssem;
import com.ss.android.ugc.aweme.slash.component.BaseComponentData;

/* JADX INFO: renamed from: X.0guw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1184040guw implements InterfaceC1180800gpi {
    @Override // X.InterfaceC1180970gpz
    public final boolean LIZ() {
        return false;
    }

    @Override // X.InterfaceC1180970gpz
    public final boolean LIZLLL(BaseComponentData baseComponentData, boolean z) {
        return baseComponentData != null;
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
    public final InterfaceC1180980gq0<PoiBottomBarModule> LIZIZ() {
        return new C1208890hZ1(21);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1180800gpi
    public final C19719912Dl LJFF(BaseComponentData baseComponentData, InterfaceC1181010gq3 interfaceC1181010gq3) {
        PoiListApi.PoiDetailResponse poiDetailResponse;
        Object c098200Yq;
        Fragment fragment;
        IPoiDetailTypeAbility iPoiDetailTypeAbility;
        C1185600gxS c1185600gxS;
        C1173300gdc c1173300gdcQr0 = interfaceC1181010gq3.qr0();
        Object obj = null;
        if (c1173300gdcQr0 != null && (c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ) != null) {
            poiDetailResponse = c1185600gxS.LJIIIZ;
        } else {
            poiDetailResponse = null;
        }
        try {
            if ((interfaceC1181010gq3 instanceof Fragment) && (fragment = (Fragment) interfaceC1181010gq3) != null && (iPoiDetailTypeAbility = (IPoiDetailTypeAbility) C1558520qew.LIZ(C1558360qeg.LJFF(fragment, null), IPoiDetailTypeAbility.class, null)) != null) {
                c098200Yq = iPoiDetailTypeAbility.Ds0(poiDetailResponse);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        EnumC1184730gw3 enumC1184730gw3 = (EnumC1184730gw3) obj;
        if (C1183070gtN.LIZIZ() && C1183070gtN.LIZ(enumC1184730gw3)) {
            return C13LE.LIZ(PoiDetailPermanentBottomBarAssem.class);
        }
        return C13LE.LIZ(PoiDetailBottomBarAssem.class);
    }
}
