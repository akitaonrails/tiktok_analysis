package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.model.AnoleModel;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS6S3200000_35;

/* JADX INFO: renamed from: X.0cVj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1014650cVj {
    public static final void LIZ(AbstractC1014240cV4 abstractC1014240cV4, String str, Map<String, ? extends Object> map) {
        Long lValueOf;
        String str2;
        String tag = abstractC1014240cV4.LL.getTag();
        if (tag == null) {
            tag = "anole_ad";
        }
        C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(tag, "othershow_fail", abstractC1014240cV4.LLILLJJLI.LIZLLL);
        c1022820ciuLIZLLL.LIZJ(abstractC1014240cV4.LL.getRefer(), "refer");
        c1022820ciuLIZLLL.LIZIZ(str, "fail_reason");
        c1022820ciuLIZLLL.LIZIZ(Long.valueOf(abstractC1014240cV4.LL.getID()), "component_id");
        AnoleModel anoleModel = abstractC1014240cV4.LLILLJJLI.LIZLLL.getAnoleModel();
        String str3 = null;
        if (anoleModel != null) {
            lValueOf = Long.valueOf(anoleModel.templateID);
        } else {
            lValueOf = null;
        }
        c1022820ciuLIZLLL.LIZIZ(lValueOf, "template_id");
        c1022820ciuLIZLLL.LIZIZ(abstractC1014240cV4.LL.type, "component_type");
        c1022820ciuLIZLLL.LIZIZ(abstractC1014240cV4.LLJILLL, "show_type");
        c1022820ciuLIZLLL.LIZIZ(abstractC1014240cV4.LLILLJJLI.LIZLLL.getPackageName(), "package_name");
        c1022820ciuLIZLLL.LIZ(map);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1015450cX1.LIZ.getClass();
        linkedHashMap.put("device_type", Integer.valueOf(C1015450cX1.LIZIZ()));
        c1022820ciuLIZLLL.LIZ(linkedHashMap);
        c1022820ciuLIZLLL.LJII();
        C1015310cWn c1015310cWnLJIIIZ = abstractC1014240cV4.LJIIIZ();
        AnoleComponentModel anoleComponentModel = abstractC1014240cV4.LL;
        c1015310cWnLJIIIZ.getClass();
        try {
            if (((Boolean) C0B02.LIZ.getValue()).booleanValue()) {
                C1014250cV5.LIZ.getClass();
                C1014490cVT c1014490cVTLIZ = C1014250cV5.LIZ(anoleComponentModel);
                if (c1014490cVTLIZ != null) {
                    str2 = c1014490cVTLIZ.LIZ;
                    str3 = c1014490cVTLIZ.LIZIZ;
                } else {
                    str2 = null;
                }
                C2275901E6i.LIZ.getClass();
                c1015310cWnLJIIIZ.logAd(C2275901E6i.LJI, new AwS6S3200000_35(anoleComponentModel, c1015310cWnLJIIIZ, str2, str3, str, 2));
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
