package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.banner.StandardComponentInfo;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagContainerStruct;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagKey;
import com.ss.android.ugc.aweme.feed.model.banner.StandardTagStruct;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.02ro, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C721802ro {
    public static final String LIZ(Aweme aweme, String str) {
        StandardComponentInfo standardComponentInfo;
        StandardTagContainerStruct standardTagContainerStruct;
        List<StandardTagStruct> list;
        String str2;
        String str3;
        if (aweme == null || (standardComponentInfo = aweme.getStandardComponentInfo()) == null || (standardTagContainerStruct = standardComponentInfo.highTag) == null || (list = standardTagContainerStruct.tags) == null) {
            return null;
        }
        String strOptString = null;
        for (StandardTagStruct standardTagStruct : list) {
            StandardTagKey standardTagKey = standardTagStruct.key;
            if (standardTagKey != null) {
                str2 = standardTagKey.componentKey;
            } else {
                str2 = null;
            }
            if (Intrinsics.LJFF(str2, str) && (str3 = standardTagStruct.traceInfo) != null) {
                strOptString = new JSONObject(str3).optString("tag_component_type");
            }
        }
        return strOptString;
    }
}
