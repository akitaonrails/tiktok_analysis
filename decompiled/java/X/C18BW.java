package X;

import com.bytedance.android.btm.api.model.PageFinder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18BW, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18BW extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ String LL;
    public final /* synthetic */ PageFinder LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;
    public final /* synthetic */ String LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18BW(PageFinder pageFinder, String str, String str2, String str3, String str4) {
        super(1);
        this.LL = str;
        this.LLILLJJLI = pageFinder;
        this.LLILLL = str2;
        this.LLILZ = str3;
        this.LLILZIL = str4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("type", this.LL);
        jSONObject2.put("finder", C18BA.LIZIZ(this.LLILLJJLI));
        String str = this.LLILLL;
        if (str == null) {
            str = "null";
        }
        jSONObject2.put("biz", str);
        jSONObject2.put("resumed_btm_page", this.LLILZ);
        jSONObject2.put("resumed_page", this.LLILZIL);
        return Unit.LIZ;
    }
}
