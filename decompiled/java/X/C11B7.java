package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.11B7, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11B7 extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C11B7(String str, String str2, String str3, String str4, int i) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("enter_from", "video_edit_page");
        jSONObject2.put("shoot_way", this.LL);
        jSONObject2.put("creation_id", this.LLILLJJLI);
        jSONObject2.put("ngo_name", this.LLILLL);
        jSONObject2.put("powered_by", this.LLILZ);
        jSONObject2.put("language", C11B9.LIZ.getValue());
        jSONObject2.put("impr_position", this.LLILZIL);
        return Unit.LIZ;
    }
}
