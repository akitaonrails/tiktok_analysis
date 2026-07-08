package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.PostSearchInfo;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0lCY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348720lCY {
    public static final Map<String, String> LIZIZ(Aweme aweme) {
        if (aweme == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        List<PostSearchInfo> postSearchInfoList = aweme.getPostSearchInfoList();
        int i = 0;
        if (postSearchInfoList != null) {
            int i2 = 0;
            for (PostSearchInfo postSearchInfo : postSearchInfoList) {
                int i3 = i2 + 1;
                if (i2 >= 0) {
                    String str = postSearchInfo.queryId;
                    if (str == null) {
                        str = "";
                    }
                    sb.append(str);
                    if (i2 != postSearchInfoList.size() - 1) {
                        sb.append("|");
                    }
                    i2 = i3;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        List<PostSearchInfo> postSearchInfoList2 = aweme.getPostSearchInfoList();
        if (postSearchInfoList2 != null) {
            int i4 = 0;
            for (PostSearchInfo postSearchInfo2 : postSearchInfoList2) {
                int i5 = i4 + 1;
                if (i4 >= 0) {
                    String str2 = postSearchInfo2.recalledQuery;
                    if (str2 == null) {
                        str2 = "";
                    }
                    sb2.append(str2);
                    if (i4 != postSearchInfoList2.size() - 1) {
                        sb2.append("|");
                    }
                    i4 = i5;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        String string2 = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        List<PostSearchInfo> postSearchInfoList3 = aweme.getPostSearchInfoList();
        if (postSearchInfoList3 != null) {
            for (PostSearchInfo postSearchInfo3 : postSearchInfoList3) {
                int i6 = i + 1;
                if (i >= 0) {
                    String str3 = postSearchInfo3.recalledQuerySearchTS;
                    if (str3 == null) {
                        str3 = "";
                    }
                    sb3.append(str3);
                    if (i != postSearchInfoList3.size() - 1) {
                        sb3.append("|");
                    }
                    i = i6;
                } else {
                    C1697810uHb.LJIJI();
                    throw null;
                }
            }
        }
        String string3 = sb3.toString();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (C123100dR.LIZ(string)) {
            linkedHashMap.put("query_id", string);
        }
        if (C123100dR.LIZ(string2)) {
            linkedHashMap.put("recalled_query", string2);
        }
        if (C123100dR.LIZ(string3)) {
            linkedHashMap.put("recalled_query_search_ts", string3);
        }
        return linkedHashMap;
    }

    public static final void LIZ(Aweme aweme, AbstractC1386130mAt abstractC1386130mAt) {
        Map<String, String> mapLIZIZ = LIZIZ(aweme);
        if (mapLIZIZ != null) {
            abstractC1386130mAt.LIZIZ(mapLIZIZ);
        }
    }
}
