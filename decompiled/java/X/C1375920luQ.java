package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.share.shareprop.SharePropHelper;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.0luQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1375920luQ {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(Integer num, String str, String str2) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!C18041074t.LIZ()) {
            return linkedHashMap;
        }
        Map<String, String> sharePropInfo = SharePropHelper.getSharePropInfo(str, num, Long.valueOf(C18041074t.LIZIZ()));
        if (str2 == null) {
            str2 = "";
        }
        String str3 = CardStruct.IStatusCode.DEFAULT;
        if (sharePropInfo == null) {
            linkedHashMap.put("sp_level", CardStruct.IStatusCode.DEFAULT);
            linkedHashMap.put("sp_root_share_link_id", str2);
            linkedHashMap.put("sp_root_d", "-1");
            linkedHashMap.put("sp_root_u", "-1");
            linkedHashMap.put("sp_root_od", "-1");
            linkedHashMap.put("sp_source_w", "-1");
            linkedHashMap.put("sp_source_d", "-1");
            linkedHashMap.put("sp_source_od", "-1");
            linkedHashMap.put("sp_source_u", "-1");
        } else {
            String str4 = sharePropInfo.get("sp_level");
            if (str4 != null) {
                str3 = str4;
            }
            linkedHashMap.put("sp_level", str3);
            String str5 = sharePropInfo.get("sp_root_share_link_id");
            if (str5 != null) {
                str2 = str5;
            }
            linkedHashMap.put("sp_root_share_link_id", str2);
            String str6 = sharePropInfo.get("sp_root_d");
            if (str6 != null) {
                linkedHashMap.put("sp_root_d", str6);
            }
            String str7 = sharePropInfo.get("sp_root_u");
            if (str7 != null) {
                linkedHashMap.put("sp_root_u", str7);
            }
            String str8 = sharePropInfo.get("sp_root_od");
            if (str8 != null) {
                linkedHashMap.put("sp_root_od", str8);
            }
            String str9 = sharePropInfo.get("sp_source_w");
            if (str9 != null) {
                linkedHashMap.put("sp_source_w", str9);
            }
            String str10 = sharePropInfo.get("sp_source_d");
            if (str10 != null) {
                linkedHashMap.put("sp_source_d", str10);
            }
            String str11 = sharePropInfo.get("sp_source_od");
            if (str11 != null) {
                linkedHashMap.put("sp_source_od", str11);
            }
            String str12 = sharePropInfo.get("sp_source_u");
            if (str12 != null) {
                linkedHashMap.put("sp_source_u", str12);
                return linkedHashMap;
            }
        }
        return linkedHashMap;
    }
}
