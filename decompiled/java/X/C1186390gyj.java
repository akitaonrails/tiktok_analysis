package X;

import android.view.View;
import com.bytedance.bpea.cert.token.TokenCert;
import com.bytedance.i18n.location.api.LocationData;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import com.ss.android.ugc.tiktok.location_api.service.ILocationBaseServiceForMT;
import com.ss.android.ugc.tiktok.location_api.service.ILocationService;

/* JADX INFO: renamed from: X.0gyj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1186390gyj extends AbstractC1181640gr4 implements InterfaceC1181380gqe, InterfaceC1181500gqq {
    public boolean LLILLJJLI;

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, boolean z, String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onAttach() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onCreate() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroy() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDestroyView() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onDetach() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onHiddenChanged(boolean z) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onPause() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onResume() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStart() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onStop() {
    }

    @Override // X.InterfaceC1181380gqe
    public final void onSuccess(String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void onViewCreated(View view) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1181500gqq
    public final void LIZ() {
        C1173300gdc c1173300gdcQr0;
        C1185600gxS c1185600gxS;
        C1186840gzS c1186840gzSLw1;
        if (((ILocationService) ServiceManager.get().getService(ILocationService.class)).LJIL("android.permission.ACCESS_COARSE_LOCATION")) {
            TokenCert tokenCertWith = TokenCert.Companion.with("bpea-poi_detail_page_no_regional_get_location");
            tokenCertWith.auth("svfi");
            if (this.LLILLJJLI) {
                return;
            }
            this.LLILLJJLI = true;
            InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
            if (interfaceC1181010gq3 != null) {
                interfaceC1181010gq3.qr0();
            }
            C1207450hWh.LIZ.LJIIL("poi", "anchor", tokenCertWith, null, new InterfaceC687820QyS() { // from class: X.0gyk
                /* JADX WARN: Multi-variable type inference failed */
                @Override // X.InterfaceC687820QyS
                public final void LIZ(LocationData locationData) {
                    boolean z;
                    C1173300gdc c1173300gdcQr02;
                    C1185600gxS c1185600gxS2;
                    C1186840gzS c1186840gzSLw12;
                    String str = locationData.encryptedLatitude;
                    String str2 = locationData.encryptedLongitude;
                    ILocationBaseServiceForMT iLocationBaseServiceForMT = (ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class);
                    C844470XAv.LIZ.getClass();
                    boolean zLJ = iLocationBaseServiceForMT.LJ(C844470XAv.LIZ());
                    boolean zLJJIJ = ((ILocationBaseServiceForMT) ServiceManager.get().getService(ILocationBaseServiceForMT.class)).LJJIJ();
                    if (zLJ && zLJJIJ) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1189480h3i c1189480h3i = new C1189480h3i(str, str2, Boolean.valueOf(z));
                    InterfaceC1181010gq3 interfaceC1181010gq32 = this.LIZ.LL;
                    if (interfaceC1181010gq32 != null && (c1186840gzSLw12 = interfaceC1181010gq32.lw1()) != null) {
                        c1186840gzSLw12.LIZ(new C1186450gyp(c1189480h3i));
                    }
                    InterfaceC1181010gq3 interfaceC1181010gq33 = this.LIZ.LL;
                    if (interfaceC1181010gq33 != null && (c1173300gdcQr02 = interfaceC1181010gq33.qr0()) != null && (c1185600gxS2 = (C1185600gxS) c1173300gdcQr02.LIZ) != null) {
                        c1185600gxS2.LJIIJJI = c1189480h3i;
                    }
                }

                @Override // X.InterfaceC687820QyS
                public final void onError(int i, String str) {
                }
            }, -1L);
            return;
        }
        C1189480h3i c1189480h3i = new C1189480h3i(null, null, Boolean.FALSE);
        InterfaceC1181010gq3 interfaceC1181010gq32 = this.LL;
        if (interfaceC1181010gq32 != null && (c1186840gzSLw1 = interfaceC1181010gq32.lw1()) != null) {
            c1186840gzSLw1.LIZ(new C1186450gyp(c1189480h3i));
        }
        InterfaceC1181010gq3 interfaceC1181010gq33 = this.LL;
        if (interfaceC1181010gq33 == null || (c1173300gdcQr0 = interfaceC1181010gq33.qr0()) == null || (c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ) == null) {
            return;
        }
        c1185600gxS.LJIIJJI = c1189480h3i;
    }
}
