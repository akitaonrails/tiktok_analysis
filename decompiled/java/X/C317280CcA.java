package X;

import com.bytedance.scene.Scene;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CcA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C317280CcA extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ int LLILZIL;
    public final /* synthetic */ boolean LLILZLL;
    public final /* synthetic */ float LLIZ;
    public final /* synthetic */ float LLIZLLLIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317280CcA(String str, String str2, String str3, String str4, int i, boolean z, float f, float f2) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = str2;
        this.LLILLL = str3;
        this.LLILZ = str4;
        this.LLILZIL = i;
        this.LLILZLL = z;
        this.LLIZ = f;
        this.LLIZLLLIL = f2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("enter_from", this.LL);
        jSONObject2.put("enter_method", this.LLILLJJLI);
        jSONObject2.put(Scene.SCENE_SERVICE, this.LLILLL);
        jSONObject2.put("search_keyword", this.LLILZ);
        jSONObject2.put("candidates_count", this.LLILZIL);
        jSONObject2.put("finished", this.LLILZLL);
        jSONObject2.put("matching_duration", Float.valueOf(this.LLIZ));
        jSONObject2.put("ranking_duration", Float.valueOf(this.LLIZLLLIL));
        return Unit.LIZ;
    }
}
