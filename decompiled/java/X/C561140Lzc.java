package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.0Lzc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C561140Lzc {
    public final Map<String, AwemeDraft> LIZ = new HashMap();

    public final AwemeDraft LIZ(String str) {
        C0MAY c0may = C0MAY.LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("AwemeDraftCaches : query -> creationId = ");
        sbLIZ.append(str);
        C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ));
        AwemeDraft awemeDraftLIZJ = C0M4A.LIZJ(new C0M4B(new CreativeInfo(str, 0, null, 6, null), false, (List) null, 14));
        if (awemeDraftLIZJ != null) {
            ((HashMap) this.LIZ).put(str, awemeDraftLIZJ);
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("AwemeDraftCaches : query -> draft from db,creationId = ");
            sbLIZ2.append(awemeDraftLIZJ.LIZJ());
            C201955140j.LIZJ(c0may, C2188811AlT.LIZIZ(sbLIZ2));
        }
        return awemeDraftLIZJ;
    }
}
