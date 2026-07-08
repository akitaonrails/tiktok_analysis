package X;

import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.structure.api.ICommerceService;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0cZq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1017200cZq {
    public C1017230cZt LIZ;

    public final C1017230cZt LIZ(AwemeRawAd awemeRawAd) {
        boolean z;
        C1017230cZt c1017230cZt;
        Object obj;
        Map<String, Object> map;
        Map<String, Object> map2;
        String str = null;
        if (awemeRawAd == null) {
            return null;
        }
        if (awemeRawAd.getEnableJumpToProduct() == 1) {
            z = true;
        } else {
            z = false;
        }
        if (!z || ((c1017230cZt = this.LIZ) != null && (map2 = c1017230cZt.LIZJ) != null && Intrinsics.LJFF(map2.get("isLastIndex"), Boolean.TRUE))) {
            return null;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("getCurrentJumpData, isLastIndex: ");
        C1017230cZt c1017230cZt2 = this.LIZ;
        if (c1017230cZt2 != null && (map = c1017230cZt2.LIZJ) != null) {
            obj = map.get("isLastIndex");
        } else {
            obj = null;
        }
        sbLIZ.append(obj);
        sbLIZ.append(", webUrl: ");
        C1017230cZt c1017230cZt3 = this.LIZ;
        if (c1017230cZt3 != null) {
            str = c1017230cZt3.LIZ;
        }
        sbLIZ.append(str);
        C2188811AlT.LIZIZ(sbLIZ);
        return this.LIZ;
    }

    public final boolean LIZIZ(AwemeRawAd awemeRawAd) {
        Map<String, Object> map;
        if (awemeRawAd == null || !C1017180cZo.LJIIL(awemeRawAd) || awemeRawAd.getEnableJumpToProduct() != 1) {
            return false;
        }
        C1017230cZt c1017230cZt = this.LIZ;
        if (c1017230cZt != null && ((map = c1017230cZt.LIZJ) == null || !Intrinsics.LJFF(map.get("isLastIndex"), Boolean.TRUE))) {
            return false;
        }
        return true;
    }

    public final void LIZJ(C1017230cZt c1017230cZt, AwemeRawAd awemeRawAd) {
        Object obj;
        String str;
        String str2;
        boolean z;
        Map<String, Object> map;
        if (awemeRawAd != null && awemeRawAd.getEnableJumpToProduct() == 1) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateCurrentJumpData, isLastIndex: ");
            String str3 = null;
            if (c1017230cZt != null && (map = c1017230cZt.LIZJ) != null) {
                obj = map.get("isLastIndex");
            } else {
                obj = null;
            }
            sbLIZ.append(obj);
            sbLIZ.append(", webUrl: ");
            if (c1017230cZt != null) {
                str = c1017230cZt.LIZ;
            } else {
                str = null;
            }
            sbLIZ.append(str);
            C2188811AlT.LIZIZ(sbLIZ);
            this.LIZ = c1017230cZt;
            if (c1017230cZt != null && (str2 = c1017230cZt.LIZ) != null && awemeRawAd.getLeftSlideMiddlePageModel() != null) {
                boolean z2 = awemeRawAd.getLeftSlideMiddlePageModel().bocUseRealMiddlePage;
                InterfaceC1017210cZr interfaceC1017210cZr = (InterfaceC1017210cZr) ((ICommerceService) ServiceManager.get().getService(ICommerceService.class)).LIZ().VW0(InterfaceC1017210cZr.class);
                if (interfaceC1017210cZr != null) {
                    String creativeIdStr = awemeRawAd.getCreativeIdStr();
                    if (z2) {
                        str3 = str2;
                    }
                    if (awemeRawAd.getLeftSlideMiddlePageModel().middlePageJumpType == 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    interfaceC1017210cZr.aR1(creativeIdStr, new C1017520caM(0, 2, str3, str2, z, z2));
                }
            }
        }
    }
}
