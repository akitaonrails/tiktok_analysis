package X;

import android.content.Context;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.bytedance.mt.protector.impl.color.ColorProtector;
import com.google.gson.k;
import com.google.gson.n;
import com.ss.android.ugc.aweme.ecommerce.base.common.model.CommonColor;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.vo.SeaPdpBottomBarBffData;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.biz.footer.bottombar.vo.SeaPdpBottomBarBffVO;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.goda.SeaGodaManagerV2;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.view.btninterest.model.SeaPdpBottomBtnInterestItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;

/* JADX INFO: renamed from: X.04Av, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C1055504Av {
    public static final C1055504Av LIZ = new C1055504Av();

    public static SeaPdpBottomBarBffVO LIZIZ(C04FN c04fn) {
        SeaPdpBottomBarBffVO seaPdpBottomBarBffVO;
        Object obj = c04fn.LJIILJJIL;
        if (!(obj instanceof SeaPdpBottomBarBffVO) || (seaPdpBottomBarBffVO = (SeaPdpBottomBarBffVO) obj) == null) {
            n nVar = c04fn.LJIILIIL;
            if (nVar == null || (seaPdpBottomBarBffVO = (SeaPdpBottomBarBffVO) GsonProtectorUtils.fromJson(C1280004ze.LIZJ(), (k) nVar, SeaPdpBottomBarBffVO.class)) == null) {
                return null;
            }
            c04fn.LJIILJJIL = seaPdpBottomBarBffVO;
        }
        return seaPdpBottomBarBffVO;
    }

    public static C04FN LIZJ(SeaGodaManagerV2 seaGodaManagerV2) {
        C04FO c04fo;
        C04FM c04fm;
        List<C04FN> list;
        String str;
        C04FG c04fg = seaGodaManagerV2.LLILZIL;
        C04FN c04fn = null;
        if (c04fg == null || (c04fo = c04fg.LIZIZ) == null || (c04fm = c04fo.LJIJI) == null || (list = c04fm.LJIILL) == null) {
            return null;
        }
        Iterator<C04FN> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            C04FN next = it2.next();
            C04FN c04fn2 = next;
            if (Intrinsics.LJFF(c04fn2.LJIIIZ, "bottom_bar")) {
                C04FY c04fy = c04fn2.LJIILL;
                if (c04fy != null) {
                    str = c04fy.LIZ;
                } else {
                    str = null;
                }
                if (Intrinsics.LJFF(str, "pdp_sea_bottom_style_1")) {
                    c04fn = next;
                    break;
                }
            }
        }
        return c04fn;
    }

    public static void LJI(Map map) {
        map.put("ec_sea_pdp_bottom_nav_bar_style", Integer.valueOf(((Number) C04CU.LIZ.getValue()).intValue()));
        map.put("ec_sea_pdp_bottom_button_style", Integer.valueOf(((Number) C04ET.LIZ.getValue()).intValue()));
        map.put("ec_sea_pdp_product_disable_opt", Boolean.valueOf(C300330Bpv.LIZ()));
        map.put("ec_pdp_sea_bottom_button_layout_optimize", Boolean.valueOf(C04EI.LIZ()));
    }

    public static boolean LIZ(C04C0 c04c0, Function1 function1) {
        List<C1063004Ds> list = c04c0.LIZ;
        if (list == null) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        for (C1063004Ds c1063004Ds : list) {
            C1063004Ds c1063004Ds2 = c1063004Ds;
            Integer num = c1063004Ds2.LJIIZILJ;
            if (num != null && num.intValue() > 0 && ((Boolean) function1.invoke(c1063004Ds2)).booleanValue()) {
                arrayList.add(c1063004Ds);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((C1063004Ds) it2.next()).LJIIZILJ = null;
        }
        return !arrayList.isEmpty();
    }

    public static Integer LIZLLL(Context context, CommonColor commonColor) {
        String color;
        if (C1744700vVE.LJ(context, null)) {
            color = commonColor.getDarkColor();
        } else {
            color = commonColor.getColor();
        }
        if (color == null) {
            return null;
        }
        if (!u.LJJIIJZLJL(color, "#", false)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append('#');
            sbLIZ.append(color);
            color = C2188811AlT.LIZIZ(sbLIZ);
        }
        return Integer.valueOf(ColorProtector.parseColor(color));
    }

    public static String LJ(SeaPdpBottomBtnInterestItem seaPdpBottomBtnInterestItem, Map map) {
        String str;
        String strLJJIFFI = seaPdpBottomBtnInterestItem.text;
        List<String> list = seaPdpBottomBtnInterestItem.placeholderKeys;
        if (list != null) {
            for (String str2 : list) {
                if (map != null) {
                    str = (String) map.get(str2);
                } else {
                    str = null;
                }
                if (str2 != null && str != null) {
                    if (strLJJIFFI != null) {
                        strLJJIFFI = u.LJJIFFI(strLJJIFFI, str2, str, false);
                    } else {
                        strLJJIFFI = null;
                    }
                }
            }
        }
        return strLJJIFFI;
    }

    public static SeaPdpBottomBarBffData LJFF(SeaPdpBottomBarBffVO seaPdpBottomBarBffVO, String str) {
        Map<String, SeaPdpBottomBarBffData> map = seaPdpBottomBarBffVO.data;
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}
