package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.libra.PdpLynxPreloadModel;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.libra.PreloadSchema;
import com.ss.android.ugc.aweme.ecommerce.base.pdp.libra.PreloadTrigger;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gBO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155800gBO {
    public static final PdpLynxPreloadModel LIZ = new PdpLynxPreloadModel(false, null, null, null, null, 31, null);
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(662));
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(661));
    public static final C01GW LIZLLL = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(660));
    public static final C01GW LJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(663));

    public static PdpLynxPreloadModel LIZIZ() {
        if (!LIZJ()) {
            return LIZ;
        }
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PdpLynxPreloadModel pdpLynxPreloadModel = LIZ;
        PdpLynxPreloadModel pdpLynxPreloadModel2 = (PdpLynxPreloadModel) c0c64LJIILLIIL.LJJII(PdpLynxPreloadModel.class, pdpLynxPreloadModel, "ec_pdp_lynx_preload_config", true);
        return pdpLynxPreloadModel2 != null ? pdpLynxPreloadModel2 : pdpLynxPreloadModel;
    }

    public static boolean LIZJ() {
        C0C64 c0c64LJIILLIIL = C0C64.LJIILLIIL();
        PdpLynxPreloadModel pdpLynxPreloadModel = LIZ;
        PdpLynxPreloadModel pdpLynxPreloadModel2 = (PdpLynxPreloadModel) c0c64LJIILLIIL.LJJII(PdpLynxPreloadModel.class, pdpLynxPreloadModel, "ec_pdp_lynx_preload_config", true);
        if (pdpLynxPreloadModel2 != null) {
            pdpLynxPreloadModel = pdpLynxPreloadModel2;
        }
        return pdpLynxPreloadModel.enabled;
    }

    public static Map LIZ(Function1 function1) {
        List list;
        Integer num;
        if (!LIZJ()) {
            return C2097608Jq.LJ();
        }
        PdpLynxPreloadModel pdpLynxPreloadModelLIZIZ = LIZIZ();
        Map<String, PreloadTrigger> map = pdpLynxPreloadModelLIZIZ.triggers;
        C13DA c13da = new C13DA();
        for (PreloadSchema preloadSchema : pdpLynxPreloadModelLIZIZ.schemas) {
            String str = preloadSchema.id;
            if (str != null && (list = (List) function1.invoke(preloadSchema)) != null) {
                for (Object obj : list) {
                    PreloadTrigger preloadTrigger = map.get(obj);
                    if (preloadTrigger != null && (num = preloadTrigger.scene) != null) {
                        int iIntValue = num.intValue();
                        Integer num2 = preloadTrigger.event;
                        if (num2 != null) {
                            C1155790gBN c1155790gBN = new C1155790gBN(iIntValue, num2.intValue());
                            Collection collection = (Collection) c13da.get(c1155790gBN);
                            if (collection == null) {
                                collection = C13BV.INSTANCE;
                            }
                            c13da.put(c1155790gBN, C13LP.LJLILLLLZI(new Pair(str, obj), collection));
                        }
                    }
                }
            }
        }
        return c13da.build();
    }
}
