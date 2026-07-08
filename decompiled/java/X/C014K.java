package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.014K, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C014K extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL = "invite_collab_page";
    public final /* synthetic */ String LLILLJJLI = "video_post_page";
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C014K(String str, int i) {
        super(1);
        this.LLILLL = str;
        this.LLILZ = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("enter_from", this.LL);
        jSONObject2.put("previous_page", this.LLILLJJLI);
        jSONObject2.put("close_type", this.LLILLL);
        jSONObject2.put("invite_num", this.LLILZ);
        return Unit.LIZ;
    }
}
