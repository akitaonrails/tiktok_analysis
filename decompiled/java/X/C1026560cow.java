package X;

import com.bytedance.ies.ugc.aweme.rich.model.GMTBaseModel;
import com.ss.android.ugc.aweme.commercialize.router.api.openapi.adapter.ICRouterAdapterDelegate;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AFwS204S0000000_16;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0cow, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1026560cow implements InterfaceC1026740cpE {
    public final C01GW LIZ = C452501pT.LIZIZ(AFwS204S0000000_16.get$arr$(382));

    @Override // X.InterfaceC1026740cpE
    public final void LIZLLL(C1026830cpN c1026830cpN) {
        C1025880cnq c1025880cnqLIZIZ;
        C1025520cnG c1025520cnGLIZ;
        String str;
        AbstractC1026880cpS abstractC1026880cpS = c1026830cpN.LIZIZ;
        GMTBaseModel gMTBaseModel = null;
        if (abstractC1026880cpS != null) {
            c1025880cnqLIZIZ = abstractC1026880cpS.LIZIZ();
        } else {
            c1025880cnqLIZIZ = null;
        }
        AbstractC1026880cpS abstractC1026880cpS2 = c1026830cpN.LIZIZ;
        if (abstractC1026880cpS2 != null) {
            c1025520cnGLIZ = abstractC1026880cpS2.LIZ();
        } else {
            c1025520cnGLIZ = null;
        }
        String str2 = c1026830cpN.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackProcessorStart(),routerScene = ");
        if (c1025520cnGLIZ != null) {
            str = c1025520cnGLIZ.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", type = ");
        sbLIZ.append(str2);
        C2188811AlT.LIZIZ(sbLIZ);
        ICRouterAdapterDelegate iCRouterAdapterDelegate = (ICRouterAdapterDelegate) this.LIZ.getValue();
        if (c1025880cnqLIZIZ != null) {
            gMTBaseModel = c1025880cnqLIZIZ.LJ;
        }
        getClass();
        iCRouterAdapterDelegate.LJIILLIIL("c_router_ad", "c_router_processor_start", "", gMTBaseModel, LJ(c1025520cnGLIZ, str2, null, null, null));
    }

    @Override // X.InterfaceC1026740cpE
    public final void LIZ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
        C1025880cnq c1025880cnqLIZIZ;
        C1025520cnG c1025520cnGLIZ;
        String str;
        String str2;
        boolean z = c1026670cp7.LIZJ;
        String str3 = c1026670cp7.LIZIZ;
        AbstractC1026880cpS abstractC1026880cpS = c1026830cpN.LIZIZ;
        GMTBaseModel gMTBaseModel = null;
        if (abstractC1026880cpS != null) {
            c1025880cnqLIZIZ = abstractC1026880cpS.LIZIZ();
        } else {
            c1025880cnqLIZIZ = null;
        }
        AbstractC1026880cpS abstractC1026880cpS2 = c1026830cpN.LIZIZ;
        if (abstractC1026880cpS2 != null) {
            c1025520cnGLIZ = abstractC1026880cpS2.LIZ();
        } else {
            c1025520cnGLIZ = null;
        }
        String str4 = c1026830cpN.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackOverallResult(),success = ");
        sbLIZ.append(z);
        sbLIZ.append(",routerScene = ");
        if (c1025520cnGLIZ != null) {
            str = c1025520cnGLIZ.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", type = ");
        sbLIZ.append(str4);
        sbLIZ.append(", failReason = ");
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        ICRouterAdapterDelegate iCRouterAdapterDelegate = (ICRouterAdapterDelegate) this.LIZ.getValue();
        if (z) {
            str2 = "c_router_success";
        } else {
            str2 = "c_router_failed";
        }
        if (c1025880cnqLIZIZ != null) {
            gMTBaseModel = c1025880cnqLIZIZ.LJ;
        }
        iCRouterAdapterDelegate.LJIILLIIL("c_router_ad", str2, "", gMTBaseModel, LJ(c1025520cnGLIZ, str4, str3, Boolean.valueOf(z), c1026830cpN.LIZLLL));
    }

    @Override // X.InterfaceC1026740cpE
    public final void LIZIZ(C1025880cnq c1025880cnq, C1025520cnG c1025520cnG) {
        String str;
        GMTBaseModel gMTBaseModel;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackOverallStart(),routerScene = ");
        if (c1025520cnG != null) {
            str = c1025520cnG.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        ICRouterAdapterDelegate iCRouterAdapterDelegate = (ICRouterAdapterDelegate) this.LIZ.getValue();
        if (c1025880cnq != null) {
            gMTBaseModel = c1025880cnq.LJ;
        } else {
            gMTBaseModel = null;
        }
        getClass();
        iCRouterAdapterDelegate.LJIILLIIL("c_router_ad", "c_router_start", "", gMTBaseModel, LJ(c1025520cnG, null, null, null, null));
    }

    @Override // X.InterfaceC1026740cpE
    public final void LIZJ(C1026830cpN c1026830cpN, C1026670cp7 c1026670cp7) {
        C1025880cnq c1025880cnqLIZIZ;
        C1025520cnG c1025520cnGLIZ;
        String str;
        String str2;
        boolean z = c1026670cp7.LIZJ;
        String str3 = c1026670cp7.LIZIZ;
        AbstractC1026880cpS abstractC1026880cpS = c1026830cpN.LIZIZ;
        GMTBaseModel gMTBaseModel = null;
        if (abstractC1026880cpS != null) {
            c1025880cnqLIZIZ = abstractC1026880cpS.LIZIZ();
        } else {
            c1025880cnqLIZIZ = null;
        }
        AbstractC1026880cpS abstractC1026880cpS2 = c1026830cpN.LIZIZ;
        if (abstractC1026880cpS2 != null) {
            c1025520cnGLIZ = abstractC1026880cpS2.LIZ();
        } else {
            c1025520cnGLIZ = null;
        }
        String str4 = c1026830cpN.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("trackProcessorResult(),success = ");
        sbLIZ.append(z);
        sbLIZ.append(",routerScene = ");
        if (c1025520cnGLIZ != null) {
            str = c1025520cnGLIZ.LIZIZ;
        } else {
            str = null;
        }
        sbLIZ.append(str);
        sbLIZ.append(", type = ");
        sbLIZ.append(str4);
        sbLIZ.append(", failReason = ");
        sbLIZ.append(str3);
        C2188811AlT.LIZIZ(sbLIZ);
        ICRouterAdapterDelegate iCRouterAdapterDelegate = (ICRouterAdapterDelegate) this.LIZ.getValue();
        if (z) {
            str2 = "c_router_processor_success";
        } else {
            str2 = "c_router_processor_failed";
        }
        if (c1025880cnqLIZIZ != null) {
            gMTBaseModel = c1025880cnqLIZIZ.LJ;
        }
        iCRouterAdapterDelegate.LJIILLIIL("c_router_ad", str2, "", gMTBaseModel, LJ(c1025520cnGLIZ, str4, str3, Boolean.valueOf(z), c1026830cpN.LIZLLL));
    }

    public static Map LJ(C1025520cnG c1025520cnG, String str, String str2, Boolean bool, String str3) {
        String str4;
        Pair[] pairArr = new Pair[2];
        Integer numValueOf = null;
        if (c1025520cnG != null) {
            str4 = c1025520cnG.LIZIZ;
        } else {
            str4 = null;
        }
        pairArr[0] = new Pair("router_scene", str4);
        if (c1025520cnG != null) {
            numValueOf = Integer.valueOf(c1025520cnG.LJFF);
        }
        pairArr[1] = new Pair("click_from", numValueOf);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        if (str != null && (!a0.LJJJIL(str))) {
            mapLJIIJ.put("router_type", str);
        }
        if (str3 != null && Intrinsics.LJFF(bool, Boolean.TRUE)) {
            mapLJIIJ.put("appstore_type", str3);
        }
        if (!Intrinsics.LJFF(str2, "route_success")) {
            mapLJIIJ.put("fail_reason", str2);
        }
        return mapLJIIJ;
    }
}
