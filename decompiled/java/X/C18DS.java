package X;

import com.bytedance.android.btm.impl.page.model.PageInfo;
import kotlin.jvm.functions.Function0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18DS, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C18DS extends C09AY implements Function0<Object> {
    public final /* synthetic */ PageInfo LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ int LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C18DS(PageInfo pageInfo, String str, int i, String str2) {
        super(0);
        this.LL = pageInfo;
        this.LLILLJJLI = str;
        this.LLILLL = i;
        this.LLILZ = str2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() throws JSONException {
        PageInfo pageInfoCopy = this.LL.copy();
        JSONObject jSONObject = new JSONObject();
        String str = this.LLILLJJLI;
        int i = this.LLILLL;
        String str2 = this.LLILZ;
        jSONObject.put("pageInfo", pageInfoCopy.toString());
        jSONObject.put("btmPre", str);
        jSONObject.put("step", i);
        jSONObject.put("sourcePageId", str2);
        return jSONObject;
    }
}
