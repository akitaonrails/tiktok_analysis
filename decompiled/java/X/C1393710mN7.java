package X;

import com.ss.android.ugc.aweme.ecommerce.service.IECommerceAnchorService;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.multi.maker.ShopWindowAnchorMaker;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AFwS259S0000000_21;

/* JADX INFO: renamed from: X.0mN7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1393710mN7 {
    public static final C1393710mN7 LIZ = new C1393710mN7();

    public static void LIZ(C712520RxC c712520RxC, boolean z) {
        List<AnchorCommonStruct> anchors = c712520RxC.LIZIZ.LIZ.getAnchors();
        if (anchors != null && !anchors.isEmpty()) {
            Iterator<AnchorCommonStruct> it2 = anchors.iterator();
            while (it2.hasNext()) {
                if (((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIL().contains(Integer.valueOf(it2.next().getType()))) {
                    String strCf = ((InterfaceC1393560mMs) C13LP.LJJJJZI(c712520RxC.LJIILL())).LJII().Cf();
                    int iLJJLI = ((InterfaceC1393560mMs) C13LP.LJJJJZI(c712520RxC.LJIILL())).LJJLI();
                    if (iLJJLI != 0) {
                        if (iLJJLI != 1) {
                            if (!(C13LP.LJJJJZI(c712520RxC.LJIILL()) instanceof ShopWindowAnchorMaker)) {
                                LIZJ(-9, strCf, false);
                                return;
                            }
                            return;
                        } else {
                            if (!((InterfaceC1393560mMs) C13LP.LJJJJZI(c712520RxC.LJIILL())).LJJJJL()) {
                                return;
                            }
                            LIZJ(-8, strCf, true);
                            return;
                        }
                    }
                    LIZJ(-6, strCf, z);
                    return;
                }
            }
        }
    }

    public static void LIZJ(int i, String str, boolean z) {
        String str2;
        int i2;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (z) {
            str2 = "yes";
        } else {
            str2 = "no";
        }
        c2344009Gk.LJIIIIZZ("is_single_anchor", str2);
        c2344009Gk.LJIIIIZZ("entrance_form", str);
        c2344009Gk.LIZJ(i, "error_code");
        Map<String, String> map = c2344009Gk.LIZ;
        C20684815ws.LJIILLIIL("rd_tiktokec_video_anchor_view_show_fail", map);
        if (i != -9) {
            if (i != -6) {
                i2 = 4001;
            } else {
                i2 = 4006;
            }
        } else {
            i2 = 4008;
        }
        ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJLJL(Integer.valueOf(i2), str, new LinkedHashMap(map), z);
    }

    public static void LIZIZ(int i, String str, String str2, List list) {
        String strLJJLIIIJ;
        String str3;
        C2344009Gk c2344009Gk = new C2344009Gk();
        String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
        if (curUserId == null) {
            curUserId = "";
        }
        c2344009Gk.LJIIIIZZ("author_id", curUserId);
        c2344009Gk.LJIIIIZZ("creation_id", str);
        if (list != null) {
            strLJJLIIIJ = C13LP.LJJLIIIJ(list, ",", null, null, 0, null, AFwS259S0000000_21.get$arr$(393), 30);
        } else {
            strLJJLIIIJ = null;
        }
        c2344009Gk.LJIIIIZZ("anchor_types", strLJJLIIIJ);
        c2344009Gk.LJ(Boolean.FALSE, "is_avaliable");
        c2344009Gk.LJIIIIZZ("schema", str2);
        switch (i) {
            case 3003:
                str3 = "To add a product link, add a sound from the Commercial Sound Page.";
                break;
            case 3004:
                str3 = "It's a photo mode video, and photo mode is closed in ecommerce.";
                break;
            case 3005:
                str3 = "Is not shopify music.";
                break;
            case 3006:
                str3 = "Don't support adding multi anchors.";
                break;
            default:
                str3 = "unknown";
                break;
        }
        c2344009Gk.LJFF("na_reason", str3);
        ((IECommerceAnchorService) ServiceManager.get().getService(IECommerceAnchorService.class)).LJJIIJZLJL(Integer.valueOf(i), str3, new LinkedHashMap(c2344009Gk.LIZ));
    }
}
