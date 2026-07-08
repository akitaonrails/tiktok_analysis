package X;

import com.ss.android.ugc.aweme.ecommerce.search.vision.entrance.PhotoSearchEntranceConfig;
import com.ss.android.ugc.aweme.ecommerce.search.vision.repo.PhotoSearchForceInterveneCard;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchBusinessEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams;
import com.ss.android.ugc.aweme.vision.model.PhotoSearchToolsEnterParams;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.0Qdv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C675090Qdv {
    public static final /* synthetic */ int LIZ = 0;

    public static C674850QdX LIZIZ(PhotoSearchEnterParams photoSearchEnterParams, C676050QfT c676050QfT) {
        String str;
        String str2;
        PhotoSearchEntranceConfig photoSearchEntranceConfigLIZ;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams2;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams;
        PhotoSearchToolsEnterParams photoSearchToolsEnterParams2;
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams3;
        String str3 = null;
        if (photoSearchEnterParams == null || (((photoSearchToolsEnterParams2 = photoSearchEnterParams.toolsParams) == null || (str = photoSearchToolsEnterParams2.searchSource) == null) && ((photoSearchBusinessEnterParams3 = photoSearchEnterParams.businessParams) == null || (str = photoSearchBusinessEnterParams3.enterMethod) == null))) {
            str = "";
        }
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams2 = photoSearchEnterParams.businessParams) != null && photoSearchBusinessEnterParams2.rootEnterFromType == C0QXR.PDP_FIND_SIMILAR.getValue() && (photoSearchToolsEnterParams = photoSearchEnterParams.toolsParams) != null) {
            str2 = photoSearchToolsEnterParams.localFilePath;
        } else {
            str2 = null;
        }
        C674850QdX c674850QdX = new C674850QdX(null, str, null, null, null, null, null, null, null, null, null, null, null, null, null, c676050QfT, str2, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
        if (photoSearchEnterParams != null && (photoSearchBusinessEnterParams = photoSearchEnterParams.businessParams) != null) {
            photoSearchEntranceConfigLIZ = C07KY.LIZ(Integer.valueOf(photoSearchBusinessEnterParams.rootEnterFromType));
        } else {
            photoSearchEntranceConfigLIZ = null;
            if (photoSearchEnterParams != null) {
            }
            LIZ(c674850QdX, photoSearchEnterParams, photoSearchEntranceConfigLIZ, str3);
            return c674850QdX;
        }
        PhotoSearchBusinessEnterParams photoSearchBusinessEnterParams4 = photoSearchEnterParams.businessParams;
        if (photoSearchBusinessEnterParams4 != null) {
            str3 = photoSearchBusinessEnterParams4.tosImageUrl;
        }
        LIZ(c674850QdX, photoSearchEnterParams, photoSearchEntranceConfigLIZ, str3);
        return c674850QdX;
    }

    public static List LIZJ(PhotoSearchEnterParams photoSearchEnterParams, PhotoSearchEntranceConfig photoSearchEntranceConfig) {
        boolean z;
        HashMap<String, Object> map;
        String string;
        String string2;
        String string3;
        int i;
        String string4;
        if (photoSearchEntranceConfig != null && photoSearchEntranceConfig.enableForceIntervene) {
            z = true;
        } else {
            z = false;
        }
        if (!z || photoSearchEnterParams == null || (map = photoSearchEnterParams.photoSearchExtra) == null) {
            return null;
        }
        Object obj = map.get("product_id");
        String str = "";
        if (obj == null || (string = obj.toString()) == null) {
            string = "";
        }
        Object obj2 = map.get("user_id");
        if (obj2 == null || (string2 = obj2.toString()) == null) {
            string2 = "";
        }
        Object obj3 = map.get("live_id");
        if (obj3 == null || (string3 = obj3.toString()) == null) {
            string3 = "";
        }
        Object obj4 = map.get("video_id");
        if (obj4 != null && (string4 = obj4.toString()) != null) {
            str = string4;
        }
        if (string3.length() > 0) {
            i = 3;
        } else if (str.length() > 0) {
            i = 2;
        } else {
            i = 1;
        }
        return C1697810uHb.LJIILJJIL(new PhotoSearchForceInterveneCard(string, i, 1, string3, str, string2));
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x01d4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(X.C674850QdX r11, com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams r12, com.ss.android.ugc.aweme.ecommerce.search.vision.entrance.PhotoSearchEntranceConfig r13, java.lang.String r14) {
        /*
            Method dump skipped, instruction units count: 511
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C675090Qdv.LIZ(X.0QdX, com.ss.android.ugc.aweme.vision.model.PhotoSearchEnterParams, com.ss.android.ugc.aweme.ecommerce.search.vision.entrance.PhotoSearchEntranceConfig, java.lang.String):void");
    }
}
