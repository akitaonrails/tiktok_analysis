package X;

import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0PtG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659120PtG implements C0SMG {
    public static final C659120PtG LIZ = new C659120PtG();
    public static final ConcurrentHashMap<String, C659160PtK> LIZIZ = new ConcurrentHashMap<>();

    @Override // X.C0SMG
    public final void LIZ(Aweme aweme) throws JSONException {
        String aid;
        C659160PtK c659160PtK;
        if (!C07F2.LIZ() || aweme == null || (aid = aweme.getAid()) == null || (c659160PtK = LIZIZ.get(aid)) == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - c659160PtK.LIZ;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("aweme_id", aid);
        jSONObject.put("click_to_inner_flow_page_duration", jCurrentTimeMillis);
        jSONObject.put("enter_from", c659160PtK.LIZIZ);
        jSONObject.put("click_index", c659160PtK.LIZJ);
        jSONObject.put("content_type", "photo");
        AppLogNewUtils.onEventV3("search_photo_interactive_cost", jSONObject);
    }
}
