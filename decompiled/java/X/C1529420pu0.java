package X;

import com.bytedance.forest.Forest;
import com.bytedance.lynx.hybrid.service.IResourceServiceX;
import com.ss.android.ugc.aweme.minis.common.SchemaParserData;
import com.ss.android.ugc.aweme.minis.performance.video.MinisVideoPreloadFetcher;
import org.json.JSONArray;

/* JADX INFO: renamed from: X.0pu0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1529420pu0 {
    public static void LIZ(SchemaParserData schemaParserData) {
        Forest forest;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("initForest, schemaData:");
        sbLIZ.append(schemaParserData);
        C2188811AlT.LIZIZ(sbLIZ);
        MinisVideoPreloadFetcher.schemaData = schemaParserData;
        JSONArray jSONArray = C1533710q0v.LIZ;
        IResourceServiceX iResourceServiceXLIZIZ = C1533710q0v.LIZIZ(null, false);
        if (iResourceServiceXLIZIZ != null && (forest = iResourceServiceXLIZIZ.getForest()) != null) {
            forest.registerCustomFetcher("MinisVideoResourceFetcher", MinisVideoPreloadFetcher.class);
        }
    }
}
