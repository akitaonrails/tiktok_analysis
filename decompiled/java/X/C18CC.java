package X;

import com.bytedance.android.btm.api.model.PageFinder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18CC, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18CC extends C09AY implements Function1<JSONObject, Unit> {
    public final /* synthetic */ PageFinder LL;
    public final /* synthetic */ String LLILLJJLI;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18CC(String str, PageFinder pageFinder) {
        super(1);
        this.LL = pageFinder;
        this.LLILLJJLI = str;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        jSONObject2.put("finder", C18BA.LIZIZ(this.LL));
        jSONObject2.put("type", "pageId null");
        jSONObject2.put("page", this.LLILLJJLI);
        return Unit.LIZ;
    }
}
