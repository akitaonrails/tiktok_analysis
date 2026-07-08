package X;

import android.view.View;
import com.ss.android.ugc.aweme.poi.detail.container.PoiListApi;
import com.ss.android.ugc.aweme.poi.map.model.DynamicMapParams;
import com.ss.android.ugc.aweme.slash.data.Node;
import com.ss.android.ugc.aweme.slash.data.SlashApiResponse;
import com.ss.android.ugc.aweme.slash.data.SlashPage;
import com.ss.android.ugc.aweme.slash.data.SlashRequestParam;
import java.util.Collection;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gxA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1185420gxA extends AbstractC1181640gr4 implements InterfaceC1181380gqe, InterfaceC1181500gqq {
    public boolean LLILLJJLI = true;
    public C1180620gpQ LLILLL;
    public C1185600gxS LLILZ;
    public boolean LLILZIL;
    public boolean LLILZLL;

    @Override // X.InterfaceC1181380gqe
    public final void Ag(SlashRequestParam slashRequestParam, String str) {
    }

    @Override // X.InterfaceC1181380gqe
    public final void JC(Throwable th, EnumC1181510gqr enumC1181510gqr, String str) {
    }

    @Override // X.InterfaceC1181500gqq
    public final void LIZ() {
    }

    @Override // X.InterfaceC1181500gqq
    public final void LIZIZ() {
    }

    @Override // X.InterfaceC1181380gqe
    public final void iM(C1180620gpQ c1180620gpQ, String str) {
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

    @Override // X.InterfaceC1181380gqe
    public final void up(SlashApiResponse slashApiResponse, String str) {
    }

    @Override // X.AbstractC1181640gr4, X.InterfaceC1181660gr6
    public final void LJIIJ() {
        if (this.LLILLJJLI) {
            AbstractC19486711Lt.LJIIJJI(new C1208880hZ0(this, 13)).LJIJJLI(C11S5.LIZ()).LJIIZILJ();
            this.LLILLJJLI = false;
        }
        this.LL = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final C1185600gxS LJJIIJ() {
        C1173300gdc c1173300gdcQr0;
        C1185600gxS c1185600gxS = this.LLILZ;
        if (c1185600gxS != null) {
            return c1185600gxS;
        }
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 == null || (c1173300gdcQr0 = interfaceC1181010gq3.qr0()) == null) {
            return null;
        }
        return (C1185600gxS) c1173300gdcQr0.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.InterfaceC1181500gqq
    public final void onViewCreated(View view) {
        C1185600gxS c1185600gxS;
        C1173300gdc c1173300gdcQr0;
        InterfaceC1181010gq3 interfaceC1181010gq3 = this.LL;
        if (interfaceC1181010gq3 != null && (c1173300gdcQr0 = interfaceC1181010gq3.qr0()) != null) {
            c1185600gxS = (C1185600gxS) c1173300gdcQr0.LIZ;
        } else {
            c1185600gxS = null;
        }
        this.LLILZ = c1185600gxS;
    }

    @Override // X.InterfaceC1181380gqe
    public final void a9(SlashApiResponse slashApiResponse, String str) {
        SlashPage slashPage;
        Map<String, Node> nodes;
        Collection<Node> collectionValues;
        if (slashApiResponse != null && (slashPage = slashApiResponse.page) != null && (nodes = slashPage.getNodes()) != null && (collectionValues = nodes.values()) != null) {
            for (Object obj : collectionValues) {
                Node node = (Node) obj;
                if (Intrinsics.LJFF(node.subType, "poi_head_info") && node.data != null) {
                    if (obj != null) {
                        this.LLILZLL = true;
                        return;
                    }
                    return;
                }
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:327:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:376:0x0540  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJJIFFI(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi.PoiDetailResponse r43, java.lang.Integer r44, boolean r45) {
        /*
            Method dump skipped, instruction units count: 1541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1185420gxA.LJJIFFI(com.ss.android.ugc.aweme.poi.detail.container.PoiListApi$PoiDetailResponse, java.lang.Integer, boolean):void");
    }

    @Override // X.InterfaceC1181380gqe
    public final void mC(final C1180620gpQ c1180620gpQ, EnumC1181510gqr enumC1181510gqr, final boolean z, String str) {
        DynamicMapParams dynamicMapParams;
        this.LLILLL = c1180620gpQ;
        if (!this.LLILZIL && c1180620gpQ != null && c1180620gpQ.LLILZ && !this.LLILZLL) {
            this.LLILZIL = true;
            AbstractC19486711Lt.LJIIJJI(new InterfaceC781210Ukh() { // from class: X.0gxP
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    C1185420gxA c1185420gxA = this.LIZ;
                    boolean z2 = z;
                    c1185420gxA.getClass();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("mobHeaderLost isNetSuccess = ");
                    sbLIZ.append(z2);
                    C2188811AlT.LIZIZ(sbLIZ);
                    InterfaceC1181010gq3 interfaceC1181010gq3 = c1185420gxA.LL;
                    if (interfaceC1181010gq3 != null) {
                        interfaceC1181010gq3.Xr2("ttls_poi_header_lost", C2097908Jt.LIZJ(new Pair("is_net_success", String.valueOf(z2))), null);
                    }
                }
            }).LJIJJLI(C11S5.LIZ()).LJIIZILJ();
        }
        if (this.LLILLJJLI && c1180620gpQ != null && c1180620gpQ.LLILZ && C1183670guL.LIZIZ(c1180620gpQ) != null) {
            AbstractC19486711Lt.LJIIJJI(new InterfaceC781210Ukh() { // from class: X.0gxa
                @Override // X.InterfaceC781210Ukh
                public final void run() {
                    C1185420gxA c1185420gxA = this.LIZ;
                    PoiListApi.PoiDetailResponse poiDetailResponseLIZIZ = C1183670guL.LIZIZ(c1180620gpQ);
                    boolean z2 = z;
                    C1180620gpQ c1180620gpQ2 = this.LIZ.LLILLL;
                    c1185420gxA.LJJIFFI(poiDetailResponseLIZIZ, c1180620gpQ2 != null ? Integer.valueOf(c1180620gpQ2.status_code) : null, z2);
                }
            }).LJIJJLI(C11S5.LIZ()).LJIIZILJ();
            this.LLILLJJLI = false;
            PoiListApi.PoiDetailResponse poiDetailResponseLIZIZ = C1183670guL.LIZIZ(c1180620gpQ);
            if (poiDetailResponseLIZIZ != null && (dynamicMapParams = poiDetailResponseLIZIZ.getDynamicMapParams()) != null && Intrinsics.LJFF(dynamicMapParams.enableDynamicMap, Boolean.FALSE)) {
                C1205490hTX.LIZ.LJ(C1EMR.POI_DYNAMIC_MAP_DISABLE, null);
            }
        }
    }
}
