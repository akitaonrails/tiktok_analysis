package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.GamePartnership;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0dt6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1067580dt6 {
    public static boolean LIZ(Aweme aweme, AnchorCommonStruct anchorCommonStruct, int i) {
        String strValueOf;
        boolean zBooleanValue;
        boolean zBooleanValue2;
        Boolean bool;
        Boolean bool2;
        boolean z;
        StandardBusinessModel standardBusinessModel;
        GamePartnership gamePartnership;
        boolean zLJII = true;
        try {
            HashMap<String, Object> mapLJIIJ = C1741890vQh.LJIIJ(anchorCommonStruct.getExtra());
            String str = "";
            if (mapLJIIJ == null) {
                strValueOf = "";
                zBooleanValue = false;
                zBooleanValue2 = false;
            } else {
                strValueOf = String.valueOf(mapLJIIJ.get("ctr_feature_map"));
                Object obj = mapLJIIJ.get("is_ctr_feature_valid");
                if ((obj instanceof Boolean) && (bool2 = (Boolean) obj) != null) {
                    zBooleanValue = bool2.booleanValue();
                } else {
                    zBooleanValue = false;
                }
                Object obj2 = mapLJIIJ.get("is_ctr_filter_enable");
                if ((obj2 instanceof Boolean) && (bool = (Boolean) obj2) != null) {
                    zBooleanValue2 = bool.booleanValue();
                } else {
                    zBooleanValue2 = false;
                }
            }
            ContentModel contentModel = aweme.getContentModel();
            if (contentModel != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (gamePartnership = standardBusinessModel.getGamePartnership()) != null && gamePartnership.publisherTaskId > 0) {
                z = true;
            } else {
                z = false;
            }
            C0PSA c0psa = C1067610dt9.LIZ;
            if (c0psa == null) {
                return true;
            }
            String aid = aweme.getAid();
            if (aid != null) {
                str = aid;
            }
            zLJII = c0psa.LJII(i, str, strValueOf, z, zBooleanValue, zBooleanValue2);
            return zLJII;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
            return zLJII;
        }
    }
}
