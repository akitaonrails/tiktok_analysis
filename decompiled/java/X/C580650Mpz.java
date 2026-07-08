package X;

import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ttve.nativePort.TEVideoUtils;
import com.ss.android.ugc.aweme.creative.model.AnchorTransData;
import com.ss.android.ugc.aweme.creative.model.CreativeFlowData;
import com.ss.android.ugc.aweme.creative.model.album.ImportVideoInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.vesdk.VEUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Mpz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580650Mpz {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel) {
        List listLLIIII;
        HashMap<String, String> map;
        Object c098200Yq;
        String str;
        JSONObject jSONObjectOptJSONObject;
        ArrayList arrayList = new ArrayList();
        ArrayList<ImportVideoInfo> importInfoList = videoPublishEditModel.getImportInfoList();
        if (importInfoList != null && (listLLIIII = C13LP.LLIIII(importInfoList)) != null) {
            Iterator it2 = listLLIIII.iterator();
            while (it2.hasNext()) {
                String realImportPath = ((ImportVideoInfo) it2.next()).getRealImportPath();
                if (realImportPath != null && realImportPath.length() > 0) {
                    if (C298040BmE.LIZ()) {
                        map = C0CHQ.LIZ().LJIILL().getMetaData(realImportPath);
                    } else if (VEUtils.getVideoFileInfo(realImportPath) == null || (map = TEVideoUtils.getMetaData(realImportPath)) == null) {
                        map = new HashMap<>();
                    }
                    AnchorTransData.Companion.getClass();
                    try {
                        str = map.get("LvMetaInfo");
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        c098200Yq = new C098200Yq(th);
                        C189200o6.m2constructorimpl(c098200Yq);
                    }
                    if (str != null && (jSONObjectOptJSONObject = new JSONObject(str).optJSONObject("data")) != null) {
                        JSONObject jSONObject = new JSONObject(jSONObjectOptJSONObject.optString("meta_anchor_info"));
                        c098200Yq = new AnchorTransData(JSONObjectProtectorUtils.getInt(jSONObject, "type"), JSONObjectProtectorUtils.getString(jSONObject, "content"), jSONObject.optString("keyword", ""), "", 0, "", null, jSONObject.optBoolean("can_delete", true), jSONObject.optString("url", ""), "", Long.MAX_VALUE, "", jSONObject.optString("subtype", ""), true, null, null, null, null, 0, -1, null, null);
                        C189200o6.m2constructorimpl(c098200Yq);
                        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
                            arrayList.add(c098200Yq);
                        }
                    }
                }
            }
            CreativeFlowData creativeFlowData = videoPublishEditModel.getCreativeFlowData();
            List<AnchorTransData> anchors = videoPublishEditModel.getCreativeFlowData().getAnchors();
            if (anchors != null) {
                ArrayList arrayList2 = new ArrayList(anchors);
                arrayList2.addAll(arrayList);
                arrayList = arrayList2;
            }
            creativeFlowData.setAnchors(arrayList);
        }
    }
}
