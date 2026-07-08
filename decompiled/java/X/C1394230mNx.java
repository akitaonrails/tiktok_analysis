package X;

import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.template.anchor.ITemplateAnchorService;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0mNx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1394230mNx {
    public static final C1394230mNx LIZ = new C1394230mNx();

    public static C2344009Gk LIZ(C2344009Gk c2344009Gk, AnchorCommonStruct anchorCommonStruct) {
        EnumC1412640mre enumC1412640mreLIZ;
        String str;
        String str2;
        if (anchorCommonStruct == null || !C298980Bnk.LIZ() || (enumC1412640mreLIZ = C1394480mOM.LIZ(anchorCommonStruct)) == null) {
            return c2344009Gk;
        }
        ITemplateAnchorService iTemplateAnchorService = (ITemplateAnchorService) PluggableExtentionKt.pluggableSpi$default(ITemplateAnchorService.class, false, false, false, 14, null);
        if (iTemplateAnchorService != null) {
            C1394490mON c1394490mONLIZLLL = C1394440mOI.LIZLLL(anchorCommonStruct);
            if (c1394490mONLIZLLL != null) {
                str2 = c1394490mONLIZLLL.LIZ;
            } else {
                str2 = null;
            }
            String strLIZ = iTemplateAnchorService.LIZ(str2, null);
            if (strLIZ != null) {
                c2344009Gk.LJFF("template_dispatch_type", strLIZ);
            }
        }
        c2344009Gk.LJFF("tt_template_type", C1412660mrg.LIZIZ(enumC1412640mreLIZ));
        C1394490mON c1394490mONLIZLLL2 = C1394440mOI.LIZLLL(anchorCommonStruct);
        String str3 = "";
        if (c1394490mONLIZLLL2 == null || (str = c1394490mONLIZLLL2.LIZ) == null) {
            str = "";
        }
        c2344009Gk.LJFF("followed_template_dispatch_type", str);
        c2344009Gk.LJFF("shoot_way", "tt_template_anchor");
        C1394340mO8.LIZ.getClass();
        String strLJIIIIZZ = C1394340mO8.LJIIIIZZ(anchorCommonStruct);
        if (strLJIIIIZZ != null) {
            str3 = strLJIIIIZZ;
        }
        c2344009Gk.LJFF("ai_template_func_list", str3);
        return c2344009Gk;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.Map LIZIZ(java.util.Map r9, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct r10) {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1394230mNx.LIZIZ(java.util.Map, com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct):java.util.Map");
    }

    public static void LIZJ(Map map, AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStruct != null && C298980Bnk.LIZ()) {
            if (C289520BWk.LIZ()) {
                if (anchorCommonStruct.getType() == EnumC1430380nKG.PROP.getTYPE()) {
                    List<String> listLIZ = C0LEI.LIZ(anchorCommonStruct, "tt_template_type", "dispatch_type");
                    Object obj = ListProtector.get(listLIZ, 0);
                    Object obj2 = ListProtector.get(listLIZ, 1);
                    map.put("tt_template_type", obj);
                    map.put("template_dispatch_type", obj2);
                    return;
                }
                return;
            }
            if (anchorCommonStruct.getType() != EnumC1430380nKG.PROP.getTYPE() || !Intrinsics.LJFF(C1394440mOI.LIZLLL(anchorCommonStruct), C1394490mON.LJI)) {
                return;
            }
            map.put("tt_template_type", "effect");
            map.put("template_dispatch_type", "autocut_mix_editing");
        }
    }

    public static void LIZLLL(C2344009Gk c2344009Gk, AnchorCommonStruct anchorCommonStruct) {
        if (anchorCommonStruct != null && C298980Bnk.LIZ()) {
            C1394230mNx c1394230mNx = LIZ;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c1394230mNx.getClass();
            LIZIZ(linkedHashMap, anchorCommonStruct);
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                c2344009Gk.LJFF((String) entry.getKey(), (String) entry.getValue());
            }
        }
    }

    public static void LJ(int i, AnchorCommonStruct anchorCommonStruct, String str) {
        Integer numValueOf;
        C2344009Gk c2344009Gk = new C2344009Gk();
        if (anchorCommonStruct != null) {
            numValueOf = Integer.valueOf(anchorCommonStruct.getType());
        } else {
            numValueOf = null;
        }
        c2344009Gk.LJ(numValueOf, "anchor_type");
        C1394340mO8.LIZJ(c2344009Gk, anchorCommonStruct);
        c2344009Gk.LIZJ(i, "filter_code");
        c2344009Gk.LJIIIIZZ("filter_msg", str);
        Map<String, String> map = c2344009Gk.LIZ;
        HashMap map2 = (HashMap) map;
        ArrayList arrayList = new ArrayList(map2.size());
        for (Map.Entry entry : map2.entrySet()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append((String) entry.getKey());
            sbLIZ.append(" = ");
            sbLIZ.append((String) entry.getValue());
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        C20684815ws.LJIILLIIL("template_anchor_filter", map);
    }
}
