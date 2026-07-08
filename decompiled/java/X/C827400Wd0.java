package X;

import com.ss.android.ugc.aweme.feed.model.CardStruct;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0Wd0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C827400Wd0 implements InterfaceC794020VCu {
    public static final C827400Wd0 LIZ = new C827400Wd0();

    @Override // X.InterfaceC794020VCu
    public final void LIZ(JSONObject jSONObject, boolean z) {
        String str;
        Pair[] pairArr = new Pair[2];
        if (z) {
            str = CardStruct.IStatusCode.DEFAULT;
        } else {
            str = "1";
        }
        pairArr[0] = new Pair(str, "success");
        pairArr[1] = new Pair(jSONObject.optString("code"), "status_code");
        C20684815ws.LJIJI("feedback_alog_upload", pairArr);
        C827390Wcz.LIZ.getClass();
        C827390Wcz.LIZ(jSONObject, z);
    }
}
