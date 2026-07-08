package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00wT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C241100wT extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;
    public final /* synthetic */ String LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C241100wT(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = str5;
        this.LLILZLL = str6;
        this.LLIZ = str7;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("enter_from", this.LL);
        jSONObject2.put("group_id", this.LLILLJJLI);
        jSONObject2.put("author_id", this.LLILLL);
        jSONObject2.put("entrance_type", this.LLILZ);
        jSONObject2.put("action_type", this.LLILZIL);
        jSONObject2.put("popup_type", this.LLILZLL);
        if (Intrinsics.LJFF(this.LLILZIL, "click")) {
            jSONObject2.put("click_type", this.LLIZ);
        }
        return Unit.LIZ;
    }
}
