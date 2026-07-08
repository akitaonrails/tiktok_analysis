package X;

import com.bytedance.android.livesdk.userservice.UserService;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00xh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C248700xh {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list, Long l, long j, String str) throws JSONException {
        String string;
        JSONObject jSONObject = new JSONObject();
        long id = UserService.getInstance().user().getCurrentUser().getId();
        if (list == null || (string = Integer.valueOf(list.size()).toString()) == null) {
            string = CardStruct.IStatusCode.DEFAULT;
        }
        jSONObject.put("delete_count", string);
        jSONObject.put("delete_array", String.valueOf(list));
        jSONObject.put("user_id", String.valueOf(id));
        jSONObject.put("all_assets_size", String.valueOf(l));
        jSONObject.put("assets_md5_list", "null");
        jSONObject.put("assets_type_list", "null");
        jSONObject.put("target_resource_format", "");
        jSONObject.put("error_code", String.valueOf(0));
        jSONObject.put("error_msg", "");
        jSONObject.put("delete_duration", j);
        jSONObject.put("delete_type", str);
        C1CC2.LJIIIIZZ(C0KQH.LIZ("gift_asset_delete"), 0, jSONObject);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("gift_asset_delete");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJIIJZLJL(jSONObject);
        c474500IjALIZ.LIZ();
    }
}
