package X;

import com.ss.android.ugc.aweme.ab.EcSearchPromotionInfoAbModel;
import com.ss.android.ugc.aweme.ab.PromotionLabelTextInfo;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.OppoPermissionPopupMaskDelayExp;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.AFwS196S0000000_10;

/* JADX INFO: renamed from: X.0QX3, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QX3 {
    public static final EcSearchPromotionInfoAbModel LIZ;
    public static final C01GW LIZIZ;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Integer numValueOf = Integer.valueOf(OppoPermissionPopupMaskDelayExp.DEFAULT);
        linkedHashMap.put("6_33", new PromotionLabelTextInfo("#FE2C55", "#FF3B5C", 15, numValueOf));
        linkedHashMap.put("6_35", new PromotionLabelTextInfo("#FE2C55", "#FF3B5C", 15, numValueOf));
        linkedHashMap.put("6_36", new PromotionLabelTextInfo("#FE2C55", "#FF3B5C", 15, numValueOf));
        linkedHashMap.put("8_33", new PromotionLabelTextInfo("#FE2C55", "#FF3B5C", 15, numValueOf));
        linkedHashMap.put("8_34", new PromotionLabelTextInfo("#004D4D", "#00B8B9", 15, 500));
        LIZ = new EcSearchPromotionInfoAbModel(linkedHashMap);
        LIZIZ = C452501pT.LIZIZ(AFwS196S0000000_10.get$arr$(54));
    }
}
